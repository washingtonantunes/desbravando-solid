package cotuba.plugin;

import cotuba.domain.Capitulo;

import java.util.ServiceLoader;

/**
 * @author Washington Antunes for wTI on 25/09/2023
 */
public interface AoRenderizarHTML {

    String aposRenderizacao(String html);

    static void renderizou(Capitulo capitulo) {
        ServiceLoader.load(AoRenderizarHTML.class)
                .forEach(plugin -> {
                    String html = capitulo.getConteudoHTML();
                    String htmlModificado = plugin.aposRenderizacao(html);
                    capitulo.setConteudoHTML(htmlModificado);
                });
    }
}
