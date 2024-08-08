package com.dbg.dbgoj.judge.codesandbox;

import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @description: 执行代码
 * @author 15968
 * @date 2024/5/29 15:17
 * @version 1.0
 */
public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
