package com.sd.app.board.dto;

import java.time.LocalDateTime;

// 게시글 생성 요청 DTO
public class BoardCreateRequestDTO {
    private Long id;
    private String title;
    private String content;
    private Long writerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
}
