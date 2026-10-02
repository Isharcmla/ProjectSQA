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
import com.fasterxml.jackson.dataformat.xml.PackageVersion;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class FromXmlParserTest {

    private static final XMLInputFactory XML_INPUT_FACTORY = XMLInputFactory.newFactory();

    private FromXmlParser createParser(String xml) throws Exception {
        return createParser(xml, false);
    }

    private FromXmlParser createParser(String xml, boolean resourceManaged) throws Exception {
        IOContext ctxt = new IOContext(new BufferRecycler(), "testSource", resourceManaged);
        XMLStreamReader sr = XML_INPUT_FACTORY.createXMLStreamReader(new StringReader(xml));
        return new FromXmlParser(ctxt, 0, 0, null, sr);
    }

    @Test
    public void testFeature_collectDefaults() {
        int defaults = FromXmlParser.Feature.collectDefaults();
        Assert.assertEquals(0, defaults);
        Assert.assertEquals(0, FromXmlParser.Feature.values().length);
    }

    @Test
    public void testVersionAndBasicProperties() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertEquals(PackageVersion.VERSION, parser.version());
        Assert.assertTrue(parser.requiresCustomCodec());
        Assert.assertNull(parser.getCodec());

        ObjectCodec codec = new XmlMapper();
        parser.setCodec(codec);
        Assert.assertSame(codec, parser.getCodec());

        Assert.assertNotNull(parser.getStaxReader());
        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testFormatFeaturesConfiguration() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        Assert.assertEquals(0, parser.getFormatFeatures());

        parser.overrideFormatFeatures(0x01, 0x01);
        Assert.assertEquals(0x01, parser.getFormatFeatures());

        parser.overrideFormatFeatures(0x00, 0x01);
        Assert.assertEquals(0, parser.getFormatFeatures());
    }

    @Test
    public void testNumericAccessorsDefaultReturns() throws Exception {
        FromXmlParser parser = createParser("<root>123</root>");
        Assert.assertEquals(0, parser.getIntValue());
        Assert.assertEquals(0L, parser.getLongValue());
        Assert.assertEquals(0.0, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(0.0f, parser.getFloatValue(), 0.0001f);
        Assert.assertNull(parser.getBigIntegerValue());
        Assert.assertNull(parser.getDecimalValue());
        Assert.assertNull(parser.getNumberType());
        Assert.assertNull(parser.getNumberValue());
        Assert.assertNull(parser.getEmbeddedObject());
        parser.close();
    }

    @Test
    public void testTextAndLocationHandling_simpleLeaf() throws Exception {
        FromXmlParser parser = createParser("<root>hello</root>");
        Assert.assertFalse(parser.hasTextCharacters());
        Assert.assertNull(parser.getText());
        Assert.assertNull(parser.getTextCharacters());
        Assert.assertEquals(0, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("default", parser.getValueAsString("default"));

        JsonToken t = parser.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, t);
        Assert.assertNotNull(parser.getParsingContext());
        Assert.assertNotNull(parser.getTokenLocation());
        Assert.assertNotNull(parser.getCurrentLocation());

        t = parser.nextToken();
        Assert.assertEquals(JsonToken.FIELD_NAME, t);
        Assert.assertEquals("root", parser.getCurrentName());
        Assert.assertEquals("root", parser.getText());
        Assert.assertArrayEquals("root".toCharArray(), parser.getTextCharacters());
        Assert.assertEquals(4, parser.getTextLength());

        t = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_STRING, t);
        Assert.assertEquals("hello", parser.getText());
        Assert.assertEquals("hello", parser.getValueAsString());
        Assert.assertEquals(5, parser.getTextLength());

        t = parser.nextToken();
        Assert.assertEquals(JsonToken.END_OBJECT, t);

        t = parser.nextToken();
        Assert.assertNull(t);
        parser.close();
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        FromXmlParser parser = createParser("<root><child>value</child></root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "root"
        parser.nextToken(); // START_OBJECT
        parser.overrideCurrentName("overriddenRoot");
        Assert.assertEquals("overriddenRoot", parser.getCurrentName());

        parser.nextToken(); // FIELD_NAME "child"
        parser.overrideCurrentName("overriddenChild");
        Assert.assertEquals("overriddenChild", parser.getCurrentName());
        parser.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCurrentName_missingName_throwsException() throws Exception {
        FromXmlParser parser = createParser("<root/>");
        parser.getCurrentName();
    }

    @Test
    public void testIsExpectedStartArrayToken_convertObjectToArray() throws Exception {
        FromXmlParser parser = createParser("<root><item>1</item><item>2</item></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.currentToken());

        Assert.assertTrue(parser.isExpectedStartArrayToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("1", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("2", parser.getText());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testIsExpectedStartArrayToken_whenNotStartObject() throws Exception {
        FromXmlParser parser = createParser("<root>text</root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        Assert.assertFalse(parser.isExpectedStartArrayToken());
        parser.close();
    }

    @Test
    public void testEmptyElement_returnsNullValue() throws Exception {
        FromXmlParser parser = createParser("<root><empty/></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("root", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("empty", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testEmptyElementInArray_returnsEmptyObject() throws Exception {
        FromXmlParser parser = createParser("<root><items><item/></items></root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken()); // convert <items> to Array

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testAttributesAndText_createsTextProperty() throws Exception {
        FromXmlParser parser = createParser("<root id=\"123\">sample text</root>");
        parser.setXMLTextElementName("customText");

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("root", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("id", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("123", parser.getText());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("customText", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("sample text", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testAddVirtualWrapping() throws Exception {
        FromXmlParser parser = createParser("<root><item>A</item><item>B</item></root>");
        Set<String> wrapping = new HashSet<String>(Collections.singletonList("item"));
        parser.addVirtualWrapping(wrapping);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTextValue_leafAndEmpty() throws Exception {
        FromXmlParser parser = createParser("<root><name>John</name><empty/></root>");
        Assert.assertNull(parser.nextTextValue()); // START_OBJECT
        Assert.assertNull(parser.nextTextValue()); // FIELD_NAME root
        Assert.assertNull(parser.nextTextValue()); // START_OBJECT
        Assert.assertNull(parser.nextTextValue()); // FIELD_NAME name

        String text = parser.nextTextValue();
        Assert.assertEquals("John", text);

        Assert.assertNull(parser.nextTextValue()); // FIELD_NAME empty
        String emptyText = parser.nextTextValue();
        Assert.assertEquals("", emptyText);

        Assert.assertNull(parser.nextTextValue()); // END_OBJECT
        Assert.assertNull(parser.nextTextValue()); // END_OBJECT
        Assert.assertNull(parser.nextTextValue()); // XML_END
        parser.close();
    }

    @Test
    public void testNextTextValue_withAttributes() throws Exception {
        FromXmlParser parser = createParser("<root attr=\"val\">hello</root>");
        Assert.assertNull(parser.nextTextValue()); // START_OBJECT
        Assert.assertNull(parser.nextTextValue()); // FIELD_NAME root
        Assert.assertNull(parser.nextTextValue()); // START_OBJECT
        Assert.assertNull(parser.nextTextValue()); // FIELD_NAME attr
        Assert.assertNull(parser.nextTextValue()); // VALUE_STRING "val"
        Assert.assertNull(parser.nextTextValue()); // FIELD_NAME ""
        String text = parser.nextTextValue(); // VALUE_STRING "hello"
        Assert.assertEquals("hello", text);
        parser.close();
    }

    @Test
    public void testBinaryValue_validBase64() throws Exception {
        FromXmlParser parser = createParser("<root>SGVsbG8gV29ybGQ=</root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        byte[] binary = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals("Hello World".getBytes("UTF-8"), binary);

        byte[] binaryCached = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertSame(binary, binaryCached);
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testBinaryValue_invalidToken_throwsException() throws Exception {
        FromXmlParser parser = createParser("<root>test</root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test(expected = IOException.class)
    public void testBinaryValue_corruptedBase64_throwsException() throws Exception {
        FromXmlParser parser = createParser("<root>???not-base64???</root>");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testCloseResourceManagedAndAutoClose() throws Exception {
        FromXmlParser parser1 = createParser("<root/>", true);
        parser1.close();
        Assert.assertTrue(parser1.isClosed());
        parser1.close(); // idempotent

        FromXmlParser parser2 = createParser("<root/>", false);
        parser2.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        parser2.close();
        Assert.assertTrue(parser2.isClosed());

        FromXmlParser parser3 = createParser("<root/>", false);
        parser3.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        parser3.close();
        Assert.assertTrue(parser3.isClosed());
    }

    @Test
    public void testHandleEOF_inRootAndNonRoot() throws Exception {
        FromXmlParser parser = createParser("<root>");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME root
        try {
            parser._handleEOF();
            Assert.fail("Expected JsonParseException on EOF in non-root");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("expected close marker"));
        }
        parser.close();
    }
}
