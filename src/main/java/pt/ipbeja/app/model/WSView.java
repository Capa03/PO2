package pt.ipbeja.app.model;

/**
 * View
 * @author David Capa
 * @version 2024/04/14
 */
public interface WSView {

    void update(MessageToUI messageToUI);
    void updateInfoLabel(String text);

}
