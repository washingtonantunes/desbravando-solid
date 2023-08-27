package cotuba.application;

import cotuba.domain.Capitulo;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Washington Antunes for wTI on 27/08/2023
 */
public interface RenderizadorMDParaHTML {

    List<Capitulo> renderiza(Path diretorioDosMD);
}
