package com.yogeshwari.library.dao;
import java.util.List;

import com.yogeshwari.library.entity.BookIssue;

public interface BookIssueDao {
	String issueBook(BookIssue bookIssue);
	List<BookIssue>returnBook(BookIssue bookIssue);
	BookIssue getBookIssuedById(Integer issueId);
	List<BookIssue> getIssuedBook();
	List<BookIssue> displayUnIssueBook();
	BookIssue findRecordByIssueId(Integer issueId);
	String confirmIssueBook(BookIssue bookIssue);
	List<BookIssue> displayreturnedBook();
	List<BookIssue> displayUnreturnedBook();
	double calculateFine(long daysOverdue);

}
