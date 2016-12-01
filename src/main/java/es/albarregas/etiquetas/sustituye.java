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
public class sustituye extends TagSupport{
    private String cadena;
    private char sustituir;
    private char sustituto;

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setSustituir(char sustituir) {
        this.sustituir = sustituir;
    }

    public void setSustituto(char sustituto) {
        this.sustituto = sustituto;
    }

    @Override
    public int doStartTag() throws JspException {
        Writer out = pageContext.getOut();
        
        try {
            out.write(cadena.replace(sustituir, sustituto));
        } catch (IOException ex) {
            Logger.getLogger(sustituye.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Tag.EVAL_BODY_INCLUDE;
    }
    
    
    
}
