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
public class antiespacios extends TagSupport{
    private String cadena;

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public int doStartTag() throws JspException {
        Writer out = pageContext.getOut();
        try {
            out.write(cadena.trim());
        } catch (IOException ex) {
            Logger.getLogger(antiespacios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Tag.EVAL_BODY_INCLUDE;
    }
    
    
}
