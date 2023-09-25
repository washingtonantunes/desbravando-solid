package cotuba.plugin;

import cotuba.domain.FormatoEbook;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Washington Antunes for wTI on 25/09/2023
 */
public interface EbookSoParaLeitura {

    FormatoEbook getFormato();

    Path getArquivoDeSaida();

    List<? extends CapituloSoParaLeitura> getCapitulos();
}
