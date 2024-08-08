package com.dbg.dbgoj.judge.codesandbox;

import com.dbg.dbgoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.dbg.dbgoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.dbg.dbgoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * @author 15968
 * @version 1.0
 * @description: 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 * @date 2024/5/29 17:33
 */
public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "ThirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
