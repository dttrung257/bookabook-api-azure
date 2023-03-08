package com.uet.book_a_book.exception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss", timezone = "GMT+7")
	private Date timestamp;
	private int status;
	private String message;
	private Object details;
}
