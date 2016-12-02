/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.etiquetas;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author rpk19
 */
public class mifor extends TagSupport {
    
    private String lista;
    private char separador;
  
    public void setLista(String lista) {
        this.lista = lista;
    }

    public void setSeparador(char separador) {
        this.separador = separador;
    }

    @Override
    public int doStartTag() throws JspException {
      Writer out = pageContext.getOut();
        StringTokenizer tokens = new StringTokenizer(lista);
    
        while(tokens.hasMoreTokens()){
          try {
              out.write(tokens.nextToken(Character.toString(separador))+"<br>");
          } catch (IOException ex) {
              Logger.getLogger(mifor.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        return Tag.EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        Writer out = pageContext.getOut();
        try {
            out.write("************");
        } catch (IOException ex) {
            Logger.getLogger(mifor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Tag.EVAL_PAGE;
    }
    
    
}
