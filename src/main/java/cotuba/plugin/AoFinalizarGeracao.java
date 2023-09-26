package cotuba.plugin;

import cotuba.domain.Ebook;

import java.util.ServiceLoader;

/**
 * @author Washington Antunes for wTI on 25/09/2023
 */
public interface AoFinalizarGeracao {

    void aposGeracao(Ebook ebook);

    static void gerou(Ebook ebook) {
        ServiceLoader.load(AoFinalizarGeracao.class)
                .forEach(plugin -> plugin.aposGeracao(ebook));
    }
}
