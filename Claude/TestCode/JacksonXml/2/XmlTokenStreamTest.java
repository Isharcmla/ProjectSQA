import com.fasterxml.jackson.core.JsonLocation;
import org.codehaus.stax2.XMLStreamReader2;
import org.junit.Test;
import org.junit.Assert;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XmlTokenStreamTest {

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private XMLStreamReader createRawReader(String xml) throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        return f.createXMLStreamReader(new StringReader(xml));
    }

    private XMLStreamReader createReaderAtStart(String xml) throws Exception {
        XMLStreamReader r = createRawReader(xml);
        while (r.hasNext()) {
            int type = r.next();
            if (type == XMLStreamConstants.START_ELEMENT) {
                break;
            }
        }
        return r;
    }

    private XmlTokenStream createStream(String xml) throws Exception {
        XMLStreamReader r = createReaderAtStart(xml);
        return new XmlTokenStream(r, "test-source");
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_validStartElement_createsInstance() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"><child>text</child></root>");
        Assert.assertNotNull(stream);
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals("root", stream.getLocalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_notAtStartElement_throwsIllegalArgumentException() throws Exception {
        XMLStreamReader r = createRawReader("<root></root>");
        // deliberately NOT advancing to START_ELEMENT
        new XmlTokenStream(r, "test-source");
    }

    @Test
    public void testGetXmlReader_returnsNonNullReader() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        XMLStreamReader2 reader = stream.getXmlReader();
        Assert.assertNotNull(reader);
    }

    // ---------------------------------------------------------------
    // next() and basic flow tests
    // ---------------------------------------------------------------

    @Test
    public void testNext_simpleFlowWithAttributeAndChild_returnsExpectedSequence() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"><child>text</child></root>");

        // initial state from constructor
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());

        // attribute name
        int t1 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, t1);
        Assert.assertEquals("attr", stream.getLocalName());
        Assert.assertEquals("val", stream.getText());

        // attribute value
        int t2 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, t2);

        // moves to child start element
        int t3 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, t3);
        Assert.assertEquals("child", stream.getLocalName());

        // text inside child
        int t4 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, t4);
        Assert.assertEquals("text", stream.getText());

        // end of child
        int t5 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, t5);

        // end of root
        int t6 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, t6);

        // end of document
        int t7 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END, t7);

        // stays at XML_END
        int t8 = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END, t8);
    }

    @Test
    public void testNext_emptyElementNoAttributesNoText_returnsEndElementDirectly() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        int type = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, type);
    }

    @Test
    public void testNext_elementWithCDATAText_returnsTextToken() throws Exception {
        XmlTokenStream stream = createStream("<root><![CDATA[hello]]></root>");
        int type = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, type);
        Assert.assertEquals("hello", stream.getText());
    }

    // ---------------------------------------------------------------
    // skipEndElement() tests
    // ---------------------------------------------------------------

    @Test
    public void testSkipEndElement_normalCase_doesNotThrow() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        // no exception expected
        stream.skipEndElement();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.getCurrentToken());
    }

    @Test
    public void testSkipEndElement_wrongTokenType_throwsIOException() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        try {
            stream.skipEndElement();
            Assert.fail("Expected IOException");
        } catch (java.io.IOException e) {
            Assert.assertTrue(e.getMessage().contains("Expected END_ELEMENT"));
        }
    }

    // ---------------------------------------------------------------
    // getCurrentToken / getText / getLocalName / getNamespaceURI
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentToken_afterConstruction_returnsStartElement() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
    }

    @Test
    public void testGetText_initiallyNull() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        Assert.assertNull(stream.getText());
    }

    @Test
    public void testGetLocalName_returnsRootElementName() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        Assert.assertEquals("root", stream.getLocalName());
    }

    @Test
    public void testGetNamespaceURI_noNamespace_returnsNullOrEmpty() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        String ns = stream.getNamespaceURI();
        // depending on implementation could be null or empty string
        Assert.assertTrue(ns == null || ns.isEmpty());
    }

    // ---------------------------------------------------------------
    // hasAttributes()
    // ---------------------------------------------------------------

    @Test
    public void testHasAttributes_withAttribute_returnsTrue() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        Assert.assertTrue(stream.hasAttributes());
    }

    @Test
    public void testHasAttributes_withoutAttribute_returnsFalse() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        Assert.assertFalse(stream.hasAttributes());
    }

    @Test
    public void testHasAttributes_notStartElementState_returnsFalse() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        stream.next(); // move to XML_ATTRIBUTE_NAME
        Assert.assertFalse(stream.hasAttributes());
    }

    // ---------------------------------------------------------------
    // closeCompletely() / close()
    // ---------------------------------------------------------------

    @Test
    public void testCloseCompletely_doesNotThrow() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        stream.closeCompletely();
    }

    @Test
    public void testClose_doesNotThrow() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        stream.close();
    }

    // ---------------------------------------------------------------
    // getCurrentLocation() / getTokenLocation()
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentLocation_returnsNonNullJsonLocation() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        JsonLocation loc = stream.getCurrentLocation();
        Assert.assertNotNull(loc);
    }

    @Test
    public void testGetTokenLocation_returnsNonNullJsonLocation() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        JsonLocation loc = stream.getTokenLocation();
        Assert.assertNotNull(loc);
    }

    // ---------------------------------------------------------------
    // repeatStartElement()
    // ---------------------------------------------------------------

    @Test
    public void testRepeatStartElement_whenAtStartElement_setsRepeatState() throws Exception {
        XmlTokenStream stream = createStream("<root><item>A</item></root>");
        // move to "item" start element
        int t = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, t);
        Assert.assertEquals("item", stream.getLocalName());

        stream.repeatStartElement();

        // next() should trigger repeat handling and return XML_START_ELEMENT
        int repeated = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, repeated);
    }

    @Test(expected = IllegalStateException.class)
    public void testRepeatStartElement_whenNotAtStartElement_throwsIllegalStateException() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        stream.next(); // moves to XML_ATTRIBUTE_NAME
        stream.repeatStartElement();
    }

    @Test
    public void testRepeatStartElement_fullCycle_generatesValidTokens() throws Exception {
        XmlTokenStream stream = createStream("<root><item>A</item><item>B</item></root>");

        int t = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, t);
        Assert.assertEquals("item", stream.getLocalName());

        stream.repeatStartElement();

        int repeated = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, repeated);

        int textToken = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, textToken);
        Assert.assertEquals("A", stream.getText());

        // this will hit _handleEndElement(); regardless of internal wrapper
        // matching state, this always yields XML_END_ELEMENT
        int endToken = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, endToken);

        // subsequent tokens are valid known constants
        int following = stream.next();
        Assert.assertTrue(following >= XmlTokenStream.XML_START_ELEMENT
                && following <= XmlTokenStream.XML_END);
    }

    // ---------------------------------------------------------------
    // skipAttributes()
    // ---------------------------------------------------------------

    @Test
    public void testSkipAttributes_whenAttributeNameState_resetsToStartElement() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"><child/></root>");
        int t = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, t);

        stream.skipAttributes();

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertFalse(stream.hasAttributes());
    }

    @Test
    public void testSkipAttributes_whenStartElementState_doesNothing() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        stream.skipAttributes();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
    }

    @Test
    public void testSkipAttributes_whenTextState_doesNothing() throws Exception {
        XmlTokenStream stream = createStream("<root>text</root>");
        int t = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, t);
        stream.skipAttributes();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
    }

    @Test(expected = IllegalStateException.class)
    public void testSkipAttributes_whenInvalidState_throwsIllegalStateException() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        stream.next(); // moves to XML_END_ELEMENT
        stream.skipAttributes();
    }

    // ---------------------------------------------------------------
    // convertToString()
    // ---------------------------------------------------------------

    @Test
    public void testConvertToString_validAttributeNameStateWithEmptyEnd_returnsEmptyString() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        int t = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, t);

        String result = stream.convertToString();
        Assert.assertEquals("", result);
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
    }

    @Test
    public void testConvertToString_notAttributeNameState_returnsNull() throws Exception {
        XmlTokenStream stream = createStream("<root></root>");
        // currentState is XML_START_ELEMENT, not XML_ATTRIBUTE_NAME
        String result = stream.convertToString();
        Assert.assertNull(result);
    }

    @Test
    public void testConvertToString_nextAttributeIndexNotZero_returnsNull() throws Exception {
        XmlTokenStream stream = createStream("<root attr1=\"a\" attr2=\"b\"></root>");
        stream.next(); // XML_ATTRIBUTE_NAME (attr1)
        stream.next(); // XML_ATTRIBUTE_VALUE
        stream.next(); // XML_ATTRIBUTE_NAME (attr2) - nextAttributeIndex now 1
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.getCurrentToken());

        String result = stream.convertToString();
        Assert.assertNull(result);
    }

    @Test
    public void testConvertToString_followedByStartElement_returnsNull() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"><child/></root>");
        stream.next(); // XML_ATTRIBUTE_NAME
        String result = stream.convertToString();
        Assert.assertNull(result);
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_returnsNonNullDescriptiveString() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        String s = stream.toString();
        Assert.assertNotNull(s);
        Assert.assertTrue(s.contains("Token stream"));
        Assert.assertTrue(s.contains("state="));
    }

    @Test
    public void testToString_afterNextCalls_stillReturnsValidString() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\"></root>");
        stream.next();
        String s = stream.toString();
        Assert.assertNotNull(s);
        Assert.assertTrue(s.length() > 0);
    }
}
