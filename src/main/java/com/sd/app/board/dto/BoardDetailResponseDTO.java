package com.sd.app.board.dto;

import java.time.LocalDateTime;

// 게시글 상세 응답 DTO
public class BoardDetailResponseDTO {
    private Long id;
    private String title;
    private String content;
    private Long writerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
}
