package com.dbg.dbgoj.judge.strategy;

import com.dbg.dbgoj.model.dto.questionsubmit.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
