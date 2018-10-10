package com.revature.interfaces;

import com.revature.beans.ReimbForm;

public interface I_ReimbFormDAO  {
	 void newReimForm(ReimbForm x);
	 void updateStatus(ReimbForm x, int status);
	 ReimbForm viewForm(int rfid);
	
}
