package com.dbg.dbgoj.judge.codesandbox.impl;

import com.dbg.dbgoj.judge.codesandbox.CodeSandbox;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.dbg.dbgoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.dbg.dbgoj.model.dto.questionsubmit.JudgeInfo;
import com.dbg.dbgoj.model.enums.JudgeInfoMessageEnum;
import com.dbg.dbgoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * @author 15968
 * @version 1.0
 * @description: 示例代码沙箱（仅为了跑通业务流程）
 * @date 2024/5/29 15:18
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
