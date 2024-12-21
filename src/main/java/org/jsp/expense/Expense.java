package org.jsp.expense;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long expenseId;
	@ManyToOne
	@JoinColumn(name = "user_id",nullable = false)
	private User user;
	@ManyToOne
	@JoinColumn(name = "category_id",nullable = false)
	private Category category;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private Double amount;
	@Column(nullable = false)
	private LocalDateTime date;

}
