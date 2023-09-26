package cotuba.domain.builder;

import cotuba.domain.Capitulo;

/**
 * @author Washington Antunes for wTI on 26/09/2023
 */
public class CapituloBuilder {

    private String titulo;
    private String conteudoHTML;

    public CapituloBuilder comTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public CapituloBuilder comConteudoHTML(String conteudoHTML) {
        this.conteudoHTML = conteudoHTML;
        return this;
    }

    public Capitulo constroi() {
        return new Capitulo(titulo, conteudoHTML);
    }
}
