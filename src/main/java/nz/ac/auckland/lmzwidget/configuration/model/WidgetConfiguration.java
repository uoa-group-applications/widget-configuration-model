package nz.ac.auckland.lmzwidget.configuration.model;


import java.util.Map;

/**
 * @author Marnix Cook
 *
 * Widget configuration base class
 */
public class WidgetConfiguration {

    /**
     * Widget information
     */
    private WidgetMetadata widget;

    /**
     * Mapping between tabs and their name
     */
    private Map<String, WidgetTab> configuration;


    public WidgetMetadata getWidget() {
        return widget;
    }

    public void setWidget(WidgetMetadata widget) {
        this.widget = widget;
    }

    public Map<String, WidgetTab> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Map<String, WidgetTab> configuration) {
        this.configuration = configuration;
    }
}
