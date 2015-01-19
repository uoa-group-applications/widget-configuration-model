package nz.ac.auckland.lmzwidget.configuration.model;

/**
 * @author Marnix Cook
 *
 * WIDGET := { name: string, description: string, version: string },
 */
public class WidgetMetadata {

    private String name;
    private String description;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
