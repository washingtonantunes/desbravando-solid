package cotuba.plugin;

import cotuba.domain.Ebook;

import java.util.ServiceLoader;

/**
 * @author Washington Antunes for wTI on 25/09/2023
 */
public interface AoFinalizarGeracao {

    void aposGeracao(EbookSoParaLeitura ebook);

    static void gerou(EbookSoParaLeitura ebook) {
        ServiceLoader.load(AoFinalizarGeracao.class)
                .forEach(plugin -> plugin.aposGeracao(ebook));
    }
}
