
package com.iqmsoft.struts;

import junit.framework.TestCase;

import com.iqmsoft.struts.controller.Select;
import com.opensymphony.xwork2.Action;

/**
 * 
 */
public class SelectTest extends TestCase {
    
    public void testSelect() throws Exception {
        Select action = new Select();
        String result = action.execute();
        assertEquals(Action.SUCCESS, result);
    }
}

