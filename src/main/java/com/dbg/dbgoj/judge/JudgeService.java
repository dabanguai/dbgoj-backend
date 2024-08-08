package com.dbg.dbgoj.judge;

import com.dbg.dbgoj.model.entity.QuestionSubmit;
import com.dbg.dbgoj.model.vo.QuestionSubmitVO;

/**
 * @description: 判题服务
 * @author 15968
 * @date 2024/5/30 7:35
 * @version 1.0
 */
public interface JudgeService {

    QuestionSubmit doJudge(long questionSubmitId);
}
