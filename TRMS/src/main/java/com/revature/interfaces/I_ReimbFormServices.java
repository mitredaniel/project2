package com.revature.interfaces;

import com.revature.beans.ReimbForm;
import com.revature.services.ReimbFormServices;

public interface I_ReimbFormServices {
	void newForm();
	void updateForm();
	void approveDenyForm();
	ReimbForm viewForm(int rfid);

}
