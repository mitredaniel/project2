package com.revature.interfaces;

import java.util.List;

import com.revature.beans.FormReq;
import com.revature.beans.ReimbForm;

public interface I_FormReqDAO {
	
	void insertReq(ReimbForm x, int requestedBy);
	void updateFRStatus(FormReq x, int status);
	int countFReq(ReimbForm x);
	List<FormReq> viewFormReq(ReimbForm x);

}
