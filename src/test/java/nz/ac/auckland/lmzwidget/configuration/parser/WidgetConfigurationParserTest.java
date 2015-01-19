package nz.ac.auckland.lmzwidget.configuration.parser;

import nz.ac.auckland.lmzwidget.configuration.model.WidgetConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Some test scenario's around the widget configuration parser
 */
public class WidgetConfigurationParserTest {

    /**
     *
     */
    private WidgetConfigurationParser parser = new WidgetConfigurationParser();

    @Test
    public void testParse() throws Exception {

        String testJson =
                "{\n" +
                "\t\"widget\": {\n" +
                "\t\t\"name\": \"Test widget\",\n" +
                "\t\t\"description\" : \"This is my widget\",\n" +
                "\t\t\"version\" : \"1.2-SNAPSHOT\"\n" +
                "\t},\n" +
                "\t\n" +
                "\t\"configuration\" : {\n" +
                "\t\t\"tab1\" : {\n" +
                "\t\t\t\"label\" : \"Basic setup\",\n" +
                "\t\t\t\"items\" : {\n" +
                "\t\t\t\t\"numberOfItems\" : { \n" +
                "\t\t\t\t\t\"type\" : \"number\",\n" +
                "\t\t\t\t\t\"label\" : \"Number of items to show\",\n" +
                "\t\t\t\t\t\"description\" : \"More specific title text that helps explain things bett0r\",\n" +
                "\t\t\t\t\t\"defaultValue\" : \"10\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"title\" : {\n" +
                "\t\t\t\t\t\"required\" : true,\n" +
                "\t\t\t\t\t\"type\" : \"string\",\n" +
                "\t\t\t\t\t\"label\" : \"Heading title\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"teaser\" : {\n" +
                "\t\t\t\t\t\"type\" : \"textarea\",\n" +
                "\t\t\t\t\t\"label\" : \"The teaser text\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"allItemsLink\" : {\n" +
                "\t\t\t\t\t\"required\" : true,\t\t\t\t\t\n" +
                "\t\t\t\t\t\"type\" : \"string\",\n" +
                "\t\t\t\t\t\"pattern\" : \"url\",\n" +
                "\t\t\t\t\t\"label\" : \"Where to link to when 'more >' is pressed\"\n" +
                "\t\t\t\t}\t\t\t\t\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t\"tab2\" : {\n" +
                "\t\t\t\"label\" : \"Misc. settings\",\n" +
                "\t\t\t\"items\" : {\n" +
                "\t\t\t\t\"recipientEmail\" : {\n" +
                "\t\t\t\t\t\"type\" : \"string\",\n" +
                "\t\t\t\t\t\"pattern\" : \"email\",\n" +
                "\t\t\t\t\t\"label\" : \"Who do we send an email?\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"fancyMode\" : {\n" +
                "\t\t\t\t\t\"type\" : \"bool\",\n" +
                "\t\t\t\t\t\"label\" : \"Are we supposed to be fancy?\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"dropdown\" : {\n" +
                "\t\t\t\t\t\"type\" : \"dropdown\",\n" +
                "\t\t\t\t\t\"label\" : \"Select one of these options\",\n" +
                "\t\t\t\t\t\"options\" : {\n" +
                "\t\t\t\t\t\t\"key\" : \"value\",\n" +
                "\t\t\t\t\t\t\"key2\" : \"value2\"\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";

        WidgetConfiguration configuration = parser.parse(testJson);
        assertNotNull(configuration);
    }
}