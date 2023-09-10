package cotuba.application;

import cotuba.domain.FormatoEbook;

import java.nio.file.Path;

/**
 * @author Washington Antunes for wTI on 27/08/2023
 */
public interface ParametrosCotuba {

    Path getDiretorioDosMD();

    FormatoEbook getFormato();

    Path getArquivoDeSaida();

}
