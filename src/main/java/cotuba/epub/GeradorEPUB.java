package cotuba.epub;

import cotuba.application.GeradorEbook;
import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.epub.EpubWriter;
import nl.siegmann.epublib.service.MediatypeService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Washington Antunes for wTI on 12/08/2023
 */
public class GeradorEPUB implements GeradorEbook {

    @Override
    public void gera(Ebook ebook) {

        Path arquivoDeSaida = ebook.arquivoDeSaida();

        var epub = new Book();

        for (Capitulo capitulo : ebook.capitulos()) {
            String html = capitulo.conteudoHTML();

            String tituloDoCapitulo = capitulo.titulo();

            epub.addSection(tituloDoCapitulo, new Resource(html.getBytes(), MediatypeService.XHTML));
        }

        var epubWriter = new EpubWriter();

        try {
            epubWriter.write(epub, Files.newOutputStream(arquivoDeSaida));
        } catch (IOException ex) {
            throw new IllegalStateException("Erro ao criar arquivo EPUB: " + arquivoDeSaida.toAbsolutePath(), ex);
        }
    }
}
