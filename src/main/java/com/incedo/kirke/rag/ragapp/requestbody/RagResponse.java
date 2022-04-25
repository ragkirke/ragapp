package com.incedo.kirke.rag.ragapp.requestbody;

import java.util.List;

import com.incedo.kirke.rag.ragapp.model.RagEntry;

public class RagResponse extends Response{

	public RagResponse(String status) {
		super(status);
		// TODO Auto-generated constructor stub
	}
	
	private List<RagEntry> ragEntryList;

	public List<RagEntry> getRagEntryList() {
		return ragEntryList;
	}

	public void setRagEntryList(List<RagEntry> ragEntryList) {
		this.ragEntryList = ragEntryList;
	}

	
	
	
}
