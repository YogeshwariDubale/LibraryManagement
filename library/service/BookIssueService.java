package com.yogeshwari.library.service;

import java.util.List;

import com.yogeshwari.library.entity.BookIssue;

public interface BookIssueService {
	public String issueBook(BookIssue bookIssue);
	public List<BookIssue> returnBook(BookIssue bookIssue);
	BookIssue getBookIssuedById(Integer issueId);
	List<BookIssue> getIssuedBook();
	void inputConfirmIssueBook();
	List<BookIssue> displayUnIssuedBook();
	BookIssue findRecordByIssueId(Integer issueId);
	String confirmIssueBook(BookIssue bookIssue);
	List<BookIssue> displayreturnedBook();
	public List<BookIssue> displayUnreturnedBook();
	double calculateFine(long daysOverdue);

}
