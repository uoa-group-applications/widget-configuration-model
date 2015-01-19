package nz.ac.auckland.lmzwidget.configuration.model;

import java.util.Map;

/**
 * @author Marnix Cook
 *
 * A widget tab contains the label of the tab and a map of items
 * that are to be displayed.
 */
public class WidgetTab {

    private String label;
    private Map<String, WidgetItem> items;

    public WidgetTab() {
        this(null, null);
    }

    public WidgetTab(String label, Map<String, WidgetItem> items) {
        this.label = label;
        this.items = items;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, WidgetItem> getItems() {
        return items;
    }

    public void setItems(Map<String, WidgetItem> items) {
        this.items = items;
    }
}
