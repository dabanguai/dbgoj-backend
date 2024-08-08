package com.dbg.dbgoj.judge.codesandbox.impl;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.dbg.dbgoj.common.ErrorCode;
import com.dbg.dbgoj.exception.BusinessException;
import com.dbg.dbgoj.judge.codesandbox.CodeSandbox;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * @author 15968
 * @version 1.0
 * @description: 远程代码沙箱（实际调用接口的沙箱）
 * @date 2024/5/29 15:18
 */
public class RemoteCodeSandbox implements CodeSandbox {

    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://localhost:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json) // 请求体
                .execute()
                .body(); // 响应体
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error, error message" + responseStr);
        }
        // 把接收的字符串转换为实际需要的响应类
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
