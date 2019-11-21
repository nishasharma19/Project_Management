package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "project_report")

public class ProjectReport implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "report_id")
	private Long reportId;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY,optional=false,targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Long projectId;

	@NotNull
	@Column(name = "file_url")
	private String fileURL;
	
	
}
