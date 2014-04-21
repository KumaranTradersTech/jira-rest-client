package com.example.jira.project;
import lombok.Data;

import org.codehaus.jackson.annotate.JsonProperty;

@Data
public class AvatarUrl {
	@JsonProperty("16x16")
	private String avatar16; 
	
	@JsonProperty("24x24")
	private String avatar24;
	
	@JsonProperty("32x32")
	private String avatar32;
	
	@JsonProperty("48x48")
	private String avatar48;
}
