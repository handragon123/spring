package com.hello.web.dto;

import lombok.Data;

@Data
public class BookDTO {
	int book_id; 
    String title;
    String category;
    int price; 
    String insert_date;
    
}
