

package com.yoox.commerce.security.commands;

import com.ibm.commerce.exception.ECException;
import com.ibm.commerce.security.commands.DBAuthenticationCmd;
import com.ibm.commerce.security.commands.DBAuthenticationCmdImpl;

///Changed by Naveen 1234

public class YooxDBAuthenticationCmdImpl extends DBAuthenticationCmdImpl    
implements DBAuthenticationCmd
{

            public YooxDBAuthenticationCmdImpl()
            {  
            	super();            	
            	
            }
            
                   

            public void performExecute()
                throws ECException
            {
            	System.err.println("\n CUSTOM Project Memeber Logic Execution Startedssss");            	
            	super.performExecute();
            	
            	
            }

}


