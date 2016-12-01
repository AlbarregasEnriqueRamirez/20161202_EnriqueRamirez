/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.etiquetas;

import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author rpk19
 */
public class misuma extends TagSupport{
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public int doStartTag() throws JspException {
        Writer out = pageContext.getOut();
        try {
            int resultado = num1+num2;
            out.write(Integer.toString(resultado));
        } catch (IOException ex) {
            Logger.getLogger(misuma.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Tag.EVAL_BODY_INCLUDE;
    }
    
    
    
    
}
