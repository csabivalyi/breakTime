package com.acme.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class FieldTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().println("<h3>Field tag...</h3>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new JspException(e);
        }
        return super.doStartTag();
    }

    
}
