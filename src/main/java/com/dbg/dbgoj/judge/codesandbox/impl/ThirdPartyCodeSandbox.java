package com.dbg.dbgoj.judge.codesandbox.impl;

import com.dbg.dbgoj.judge.codesandbox.CodeSandbox;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author 15968
 * @version 1.0
 * @description: 第三方代码沙箱（调用网上现成的沙箱）
 * @date 2024/5/29 15:18
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
