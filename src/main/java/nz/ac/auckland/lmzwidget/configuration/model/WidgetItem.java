package nz.ac.auckland.lmzwidget.configuration.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marnix Cook
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WidgetItem {

    /**
     * A list of all valid types
     */
    public static final String[] VALID_TYPES = new String[] {
            "number",
            "string",
            "textarea",
            "dropdown",
            "bool"
    };

    /**
     * A map with pattern matching regular expressions
     */
    public static final Map<String, String> PATTERNS = new HashMap<String, String>() {{
        put("email", "/^[A-za-z0-9]+[\\\\._]*[A-za-z0-9]*@[A-za-z.-]+[\\\\.]+[A-Za-z]{2,6}$/");
    }};

    @JsonIgnore
    private String group;

    @JsonIgnore
    private String name;

    private String type;
    private String label;
    private String description;
    private String defaultValue;
    private String pattern;
    private boolean required;
    private Map<String, String> options;

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!isValidType(type)) {
            throw new IllegalArgumentException(type + " is not a valid type");
        }
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        if (!PATTERNS.containsKey(pattern)) {
            throw new IllegalArgumentException(pattern + " is not a valid pattern name");
        }
        this.pattern = pattern;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    /**
     * @return true if `type` is a valid type name
     */
    protected boolean isValidType(String type) {
        for (String validType : VALID_TYPES) {
            if (validType.equals(type)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
