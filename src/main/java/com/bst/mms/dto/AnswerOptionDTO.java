package com.bst.mms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnswerOptionDTO {
    private Integer answerId;
    private String answerOptionText;
    private Boolean isSelected;
}
