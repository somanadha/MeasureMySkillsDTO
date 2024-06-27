package com.bst.mms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class QuestionDTO {
    private Integer questionId;

    private Integer topicId;

    private String questionText;

    private Boolean hasMultipleAnswers;

    private List<AnswerOptionDTO> answerOptionDTOs;

    public List<Integer> getAnswerOptionIds() {
        List<Integer> answerOptionIds = new ArrayList<>();

        if (answerOptionDTOs != null){
            answerOptionDTOs.forEach(answerOptionDTO -> answerOptionIds.add(answerOptionDTO.getAnswerId()));
        }

        return answerOptionIds;
    }
}
