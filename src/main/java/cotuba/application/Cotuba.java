package cotuba.application;

import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.epub.GeradorEPUB;
import cotuba.md.RenderizadorMDParaHTML;
import cotuba.pdf.GeradorPDF;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Washington Antunes for wTI on 12/08/2023
 */
public class Cotuba {

    public void executa(String formato, Path diretorioDosMD, Path arquivoDeSaida) {

        var renderizador = new RenderizadorMDParaHTML();
        List<Capitulo> capitulos = renderizador.renderiza(diretorioDosMD);

        Ebook ebook = new Ebook();
        ebook.setFormato(formato);
        ebook.setArquivoDeSaida(arquivoDeSaida);
        ebook.setCapitulos(capitulos);

        if ("pdf".equals(formato)) {
            var geradorPDF = new GeradorPDF();
            geradorPDF.gera(ebook);

        } else if ("epub".equals(formato)) {
            var geradorEPUB = new GeradorEPUB();
            geradorEPUB.gerar(ebook);
        } else {
            throw new IllegalArgumentException("Formato do ebook inválido: " + formato);
        }
    }
}
