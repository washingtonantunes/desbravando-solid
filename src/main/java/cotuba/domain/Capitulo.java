package cotuba.domain;

import cotuba.plugin.CapituloSoParaLeitura;

/**
 * @author Washington Antunes for wTI on 12/08/2023
 */
public class Capitulo implements CapituloSoParaLeitura {

    private String titulo;

    private String conteudoHTML;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudoHTML() {
        return conteudoHTML;
    }

    public void setConteudoHTML(String conteudoHTML) {
        this.conteudoHTML = conteudoHTML;
    }
}
