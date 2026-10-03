package com.fasterxml.jackson.dataformat.xml.deser;

import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.PackageVersion;

public class FromXmlParserTest {

    private final XMLInputFactory _xmlInputFactory = XMLInputFactory.newFactory();

    private FromXmlParser _createParser(String xml) throws Exception {
        return _createParser(xml, false, 0, null);
    }

    private FromXmlParser _createParser(String xml, boolean managedResource, int genericParserFeatures, ObjectCodec codec) throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, xml, managedResource);
        XMLStreamReader sr = _xmlInputFactory.createXMLStreamReader(new StringReader(xml));
        return new FromXmlParser(ctxt, genericParserFeatures, 0, codec, sr);
    }

    @Test
    public void testFeatureEnum() {
        int defaults = FromXmlParser.Feature.collectDefaults();
        Assert.assertEquals(0, defaults);
        Assert.assertEquals(0, FromXmlParser.Feature.values().length);
    }

    @Test
    public void testVersionAndCodecAndCustomCodec() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        Version v = parser.version();
        Assert.assertEquals(PackageVersion.VERSION, v);
        Assert.assertTrue(parser.requiresCustomCodec());

        Assert.assertNull(parser.getCodec());
        ObjectCodec mapper = new ObjectMapper();
        parser.setCodec(mapper);
        Assert.assertSame(mapper, parser.getCodec());
        parser.close();
    }

    @Test
    public void testFormatFeatures() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        Assert.assertEquals(0, parser.getFormatFeatures());

        parser.overrideFormatFeatures(0b101, 0b111);
        Assert.assertEquals(0b101, parser.getFormatFeatures());

        parser.overrideFormatFeatures(0b010, 0b110);
        Assert.assertEquals(0b011, parser.getFormatFeatures());
        parser.close();
    }

    @Test
    public void testGetStaxReader() throws Exception {
        FromXmlParser parser = _createParser("<root><child/></root>");
        XMLStreamReader reader = parser.getStaxReader();
        Assert.assertNotNull(reader);
        parser.close();
    }

    @Test
    public void testCloseAndResourceManagement() throws Exception {
        FromXmlParser parserManaged = _createParser("<root/>", true, 0, null);
        Assert.assertFalse(parserManaged.isClosed());
        parserManaged.close();
        Assert.assertTrue(parserManaged.isClosed());
        parserManaged.close(); // idempotent

        FromXmlParser parserUnmanaged = _createParser("<root/>", false, 0, null);
        parserUnmanaged.close();
        Assert.assertTrue(parserUnmanaged.isClosed());

        FromXmlParser parserAutoClose = _createParser("<root/>", false, JsonParser.Feature.AUTO_CLOSE_SOURCE.getMask(), null);
        parserAutoClose.close();
        Assert.assertTrue(parserAutoClose.isClosed());
    }

    @Test
    public void testLocationsAndBuffers() throws Exception {
        FromXmlParser parser = _createParser("<root>abc</root>");
        Assert.assertNull(parser.getTokenLocation());
        Assert.assertNotNull(parser.getCurrentLocation());

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        JsonLocation startLoc = parser.getTokenLocation();
        Assert.assertNotNull(startLoc);
        Assert.assertFalse(parser.hasTextCharacters());
        Assert.assertEquals(0, parser.getTextOffset());
        parser.close();
    }

    @Test
    public void testNumericAccessorsDefaults() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        Assert.assertNull(parser.getBigIntegerValue());
        Assert.assertNull(parser.getDecimalValue());
        Assert.assertEquals(0.0, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(0.0f, parser.getFloatValue(), 0.0001f);
        Assert.assertEquals(0, parser.getIntValue());
        Assert.assertEquals(0L, parser.getLongValue());
        Assert.assertNull(parser.getNumberType());
        Assert.assertNull(parser.getNumberValue());
        Assert.assertNull(parser.getEmbeddedObject());
        parser.close();
    }

    @Test
    public void testGetTextAndCharactersWhenNull() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        Assert.assertNull(parser.getText());
        Assert.assertNull(parser.getTextCharacters());
        Assert.assertEquals(0, parser.getTextLength());
        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("defaultVal", parser.getValueAsString("defaultVal"));
        parser.close();
    }

    @Test
    public void testSimpleParsingAndNameHandling() throws Exception {
        FromXmlParser parser = _createParser("<root><name>Hello</name><age>25</age></root>");

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals("name", parser.getText());
        Assert.assertArrayEquals("name".toCharArray(), parser.getTextCharacters());
        Assert.assertEquals(4, parser.getTextLength());

        parser.overrideCurrentName("newName");
        Assert.assertEquals("newName", parser.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("Hello", parser.getText());
        Assert.assertEquals("Hello", parser.getValueAsString());
        Assert.assertEquals("Hello", parser.getValueAsString("def"));

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("age", parser.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("25", parser.getText());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testOverrideCurrentNameForStartObject() throws Exception {
        FromXmlParser parser = _createParser("<root><child><inner>val</inner></child></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // child
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals("child", parser.getCurrentName());
        parser.overrideCurrentName("childRenamed");
        Assert.assertEquals("childRenamed", parser.getCurrentName());
        parser.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCurrentNameThrowsWhenMissing() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        parser.nextToken(); // START_OBJECT
        parser.getCurrentName();
    }

    @Test
    public void testAttributesAndMixedText() throws Exception {
        FromXmlParser parser = _createParser("<root attr=\"val\">sampleText</root>");
        parser.setXMLTextElementName("customTextProp");

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("attr", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("val", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("customTextProp", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("sampleText", parser.getText());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testEmptyLeafElement() throws Exception {
        FromXmlParser parser = _createParser("<root><empty/></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("empty", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testVirtualWrapping() throws Exception {
        FromXmlParser parser = _createParser("<root><items><value>1</value></items><items><value>2</value></items></root>");
        Set<String> wrap = new HashSet<String>();
        wrap.add("items");
        parser.addVirtualWrapping(wrap);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("items", parser.getCurrentName());

        while (parser.nextToken() != null) {
            // consume remaining tokens
        }
        parser.close();
    }

    @Test
    public void testIsExpectedStartArrayToken() throws Exception {
        FromXmlParser parser = _createParser("<root><item>1</item><item>2</item></root>");
        Assert.assertFalse(parser.isExpectedStartArrayToken());

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("1", parser.getText());
        parser.close();
    }

    @Test
    public void testEmptyTextInsideArray() throws Exception {
        FromXmlParser parser = _createParser("<root><item>   </item></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testEmptyTextInsideObject() throws Exception {
        FromXmlParser parser = _createParser("<root>   </root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTextValue() throws Exception {
        FromXmlParser parser = _createParser("<root attr=\"attrVal\"><name>TestName</name><empty/><mixed id=\"1\">MixedText</mixed></root>");
        parser.setXMLTextElementName("text");

        Assert.assertNull(parser.nextTextValue()); // START_OBJECT
        Assert.assertNull(parser.nextTextValue()); // attr FIELD_NAME
        Assert.assertEquals("attrVal", parser.nextTextValue()); // attr VALUE_STRING
        Assert.assertNull(parser.nextTextValue()); // name FIELD_NAME
        Assert.assertEquals("TestName", parser.nextTextValue()); // name VALUE_STRING
        Assert.assertNull(parser.nextTextValue()); // empty FIELD_NAME
        Assert.assertEquals("", parser.nextTextValue()); // empty produces ""
        Assert.assertNull(parser.nextTextValue()); // mixed FIELD_NAME
        Assert.assertNull(parser.nextTextValue()); // START_OBJECT for mixed
        Assert.assertNull(parser.nextTextValue()); // id FIELD_NAME
        Assert.assertEquals("1", parser.nextTextValue()); // id VALUE_STRING
        Assert.assertNull(parser.nextTextValue()); // text FIELD_NAME
        Assert.assertEquals("MixedText", parser.nextTextValue()); // text VALUE_STRING

        while (parser.nextTextValue() != null || parser.getCurrentToken() != null) {
            if (parser.nextToken() == null) {
                break;
            }
        }
        parser.close();
    }

    @Test
    public void testNextTextValueInArray() throws Exception {
        FromXmlParser parser = _createParser("<root><item>A</item><item>B</item></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken());

        Assert.assertEquals("A", parser.nextTextValue());
        Assert.assertEquals("B", parser.nextTextValue());
        Assert.assertNull(parser.nextTextValue());
        parser.close();
    }

    @Test
    public void testNextTextValueWithVirtualWrapping() throws Exception {
        FromXmlParser parser = _createParser("<root><item>A</item></root>");
        parser.addVirtualWrapping(Collections.singleton("item"));
        Assert.assertNull(parser.nextTextValue()); // START_OBJECT
        Assert.assertNull(parser.nextTextValue()); // item FIELD_NAME
        Assert.assertEquals("A", parser.nextTextValue());
        parser.close();
    }

    @Test
    public void testBase64DecodingSuccessAndCaching() throws Exception {
        FromXmlParser parser = _createParser("<root>SGVsbG8gV29ybGQ=</root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        byte[] binary1 = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertNotNull(binary1);
        Assert.assertEquals("Hello World", new String(binary1));

        byte[] binary2 = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertSame(binary1, binary2); // cached
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testBase64DecodingInvalidToken() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test(expected = JsonParseException.class)
    public void testBase64DecodingMalformedString() throws Exception {
        FromXmlParser parser = _createParser("<root>not_valid_base64!!!</root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testGetParsingContext() throws Exception {
        FromXmlParser parser = _createParser("<root><child>value</child></root>");
        Assert.assertNotNull(parser.getParsingContext());
        Assert.assertTrue(parser.getParsingContext().inRoot());

        parser.nextToken(); // START_OBJECT
        Assert.assertTrue(parser.getParsingContext().inObject());

        parser.nextToken(); // FIELD_NAME
        Assert.assertEquals("child", parser.getParsingContext().getCurrentName());
        parser.close();
    }

    @Test
    public void testHandleEOFInRootAndNonRoot() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        // in root, _handleEOF should succeed silently
        parser._handleEOF();

        parser.nextToken(); // enters non-root START_OBJECT
        try {
            parser._handleEOF();
            Assert.fail("Expected JsonParseException for non-root EOF");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("expected close marker"));
        }
        parser.close();
    }

    @Test
    public void testIsEmptyHelper() throws Exception {
        FromXmlParser parser = _createParser("<root/>");
        Assert.assertTrue(parser._isEmpty(null));
        Assert.assertTrue(parser._isEmpty(""));
        Assert.assertTrue(parser._isEmpty("   \t\r\n"));
        Assert.assertFalse(parser._isEmpty("   a "));
        Assert.assertFalse(parser._isEmpty("abc"));
        parser.close();
    }
}
