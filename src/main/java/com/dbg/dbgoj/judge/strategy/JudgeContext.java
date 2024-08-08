package com.dbg.dbgoj.judge.strategy;

import com.dbg.dbgoj.model.dto.question.JudgeCase;
import com.dbg.dbgoj.model.dto.questionsubmit.JudgeInfo;
import com.dbg.dbgoj.model.entity.Question;
import com.dbg.dbgoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @author 15968
 * @version 1.0
 * @description: 用于定义在策略中传递的参数
 * @date 2024/5/30 10:21
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCaseList;

    private QuestionSubmit questionSubmit;
}
