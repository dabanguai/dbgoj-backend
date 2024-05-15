package com.dbg.dbgoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * @author 15968
 * @version 1.0
 * @description: 判题信息
 * @date 2024/5/6 19:04
 */
@Data
public class JudgeInfo {
    // 程序执行信息
    private String message;
    // 消耗内存
    private Long memory;
    // 消耗时间
    private Long time;
}
