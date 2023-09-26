package cotuba.plugin;

import java.util.ServiceLoader;

/**
 * @author Washington Antunes for wTI on 25/09/2023
 */
public interface AoRenderizarHTML {

    String aposRenderizacao(String html);

    static String renderizou(String html) {
        String htmlModificado = html;

        for (AoRenderizarHTML plugin : ServiceLoader.load(AoRenderizarHTML.class)) {
            htmlModificado = plugin.aposRenderizacao(htmlModificado);
        }
        return htmlModificado;
    }
}
