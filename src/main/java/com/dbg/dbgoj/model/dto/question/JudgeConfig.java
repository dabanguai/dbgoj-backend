package com.dbg.dbgoj.model.dto.question;

import lombok.Data;

/**
 * @author 15968
 * @version 1.0
 * @description: 题目配置
 * @date 2024/5/6 19:04
 */
@Data
public class JudgeConfig {
    // 时间限制(ms)
    private Long timeLimit;
    // 内存限制(KB)
    private Long memoryLimit;
    // 堆栈限制(KB)
    private Long stackLimit;
}
