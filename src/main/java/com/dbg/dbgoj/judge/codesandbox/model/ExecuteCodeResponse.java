package com.dbg.dbgoj.judge.codesandbox.model;

import com.dbg.dbgoj.model.dto.questionsubmit.JudgeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 15968
 * @version 1.0
 * @description: TODO
 * @date 2024/5/29 15:09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeResponse {

    private List<String> outputList;

    // 接口信息
    private String message;

    // 执行状态
    private Integer status;

    private JudgeInfo judgeInfo;
}
