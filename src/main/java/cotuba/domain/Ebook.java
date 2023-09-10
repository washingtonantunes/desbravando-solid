package cotuba.domain;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Washington Antunes for wTI on 12/08/2023
 */
public class Ebook {

    private FormatoEbook formato;

    private Path arquivoDeSaida;

    private List<Capitulo> capitulos;

    public FormatoEbook getFormato() {
        return formato;
    }

    public void setFormato(FormatoEbook formato) {
        this.formato = formato;
    }

    public Path getArquivoDeSaida() {
        return arquivoDeSaida;
    }

    public void setArquivoDeSaida(Path arquivoDeSaida) {
        this.arquivoDeSaida = arquivoDeSaida;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public boolean isUltimoCapitulo(Capitulo capitulo) {
        if(this.capitulos != null) {
            return this.capitulos.get(this.capitulos.size() -1).equals(capitulo);
        }
        return false;
    }
}
