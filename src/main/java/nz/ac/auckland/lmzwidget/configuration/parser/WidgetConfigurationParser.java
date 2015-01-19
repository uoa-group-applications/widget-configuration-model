package nz.ac.auckland.lmzwidget.configuration.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import nz.ac.auckland.lmzwidget.configuration.model.WidgetConfiguration;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author Marnix Cook
 *
 * This class parses a json string and outputs a proper model
 */
public class WidgetConfigurationParser {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(WidgetConfigurationParser.class);

    /**
     * Parse a json string into a widget configuration instance
     * @param json is the json string to parse
     *
     * @return is a widget configuration instance
     */
    public WidgetConfiguration parse(String json) {

        if (StringUtils.isEmpty(json)) {
            throw new IllegalArgumentException("Expected json, empty string found.");
        }

        try {
            ObjectMapper objMapper = new ObjectMapper();

            WidgetConfiguration config =
                    objMapper.readValue(
                            json,
                            WidgetConfiguration.class
                        );

            return config;

        } catch (IOException ioEx) {
            LOG.error("Unable to parse widget configuration", ioEx);
        }

        return null;
    }

}
