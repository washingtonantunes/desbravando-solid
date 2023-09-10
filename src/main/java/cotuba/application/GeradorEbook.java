package cotuba.application;

import cotuba.domain.Ebook;
import cotuba.domain.FormatoEbook;

/**
 * @author Washington Antunes for wTI on 10/09/2023
 */
public interface GeradorEbook {

    void gera(Ebook ebook);

    static GeradorEbook cria(FormatoEbook formato) {
        return formato.getGerador();
    }
}
