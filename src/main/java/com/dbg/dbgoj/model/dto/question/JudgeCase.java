package com.dbg.dbgoj.model.dto.question;

import lombok.Data;

/**
 * @author 15968
 * @version 1.0
 * @description: 题目用例
 * @date 2024/5/6 19:04
 */
@Data
public class JudgeCase {
    // 输入用例
    private String input;
    // 输出用例
    private String output;
}
