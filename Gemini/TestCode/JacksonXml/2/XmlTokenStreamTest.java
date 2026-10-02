package com.fasterxml.jackson.dataformat.xml.deser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonLocation;

public class XmlTokenStreamTest {

    private XmlTokenStream createStream(String xml) throws XMLStreamException {
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader(xml));
        while (sr.getEventType() != XMLStreamConstants.START_ELEMENT) {
            sr.next();
        }
        return new XmlTokenStream(sr, xml);
    }

    @Test
    public void testConstructor_validStartElement_initializesCorrectly() throws XMLStreamException {
        String xml = "<root attr=\"val\">text</root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertNotNull(stream.getXmlReader());
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals("root", stream.getLocalName());
        Assert.assertNull(stream.getNamespaceURI());
        Assert.assertTrue(stream.hasAttributes());
        Assert.assertNotNull(stream.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_notAtStartElement_throwsIllegalArgumentException() throws XMLStreamException {
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader("<root/>"));
        // At creation, stream reader is at START_DOCUMENT (not START_ELEMENT)
        Assert.assertEquals(XMLStreamConstants.START_DOCUMENT, sr.getEventType());
        new XmlTokenStream(sr, "test-ref");
    }

    @Test
    public void testSimpleElement_withTextAndEnd() throws Exception {
        XmlTokenStream stream = createStream("<root>Hello World</root>");

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertFalse(stream.hasAttributes());

        int token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_TEXT, token);
        Assert.assertEquals("Hello World", stream.getText());

        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, token);
        Assert.assertEquals("root", stream.getLocalName());

        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END, token);

        // Calling next() on XML_END should stay XML_END
        token = stream.next();
        Assert.assertEquals(XmlTokenStream.XML_END, token);
    }

    @Test
    public void testAttributes_traversal() throws Exception {
        String xml = "<root a1=\"v1\" a2=\"v2\">content</root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertTrue(stream.hasAttributes());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        Assert.assertEquals("a1", stream.getLocalName());
        Assert.assertEquals("v1", stream.getText());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, stream.next());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        Assert.assertEquals("a2", stream.getLocalName());
        Assert.assertEquals("v2", stream.getText());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, stream.next());

        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        Assert.assertEquals("content", stream.getText());

        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testNestedElements_withCDataAndComments() throws Exception {
        String xml = "<root><!-- comment --><child><![CDATA[cdata-text]]></child><?pi target?><empty/></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals("root", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next());
        Assert.assertEquals("child", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        Assert.assertEquals("cdata-text", stream.getText());

        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals("child", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next());
        Assert.assertEquals("empty", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals("empty", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals("root", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testMultipleCDataAndTextConcatenation() throws Exception {
        String xml = "<root>Part1<![CDATA[Part2]]>Part3</root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        Assert.assertEquals("Part1Part2Part3", stream.getText());
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testEmptyElement_withoutText() throws Exception {
        String xml = "<root></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testNamespaceSupport() throws Exception {
        String xml = "<ns:root xmlns:ns=\"http://example.com/ns\" ns:attr=\"123\"><ns:child/></ns:root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals("root", stream.getLocalName());
        Assert.assertEquals("http://example.com/ns", stream.getNamespaceURI());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        Assert.assertEquals("attr", stream.getLocalName());
        Assert.assertEquals("http://example.com/ns", stream.getNamespaceURI());
        Assert.assertEquals("123", stream.getText());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, stream.next());

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next());
        Assert.assertEquals("child", stream.getLocalName());
        Assert.assertEquals("http://example.com/ns", stream.getNamespaceURI());

        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_END, stream.next());
    }

    @Test
    public void testSkipEndElement_success() throws Exception {
        String xml = "<root><child/></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <child>
        stream.skipEndElement(); // skips </child>
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.getCurrentToken());
        Assert.assertEquals("child", stream.getLocalName());
    }

    @Test(expected = IOException.class)
    public void testSkipEndElement_failure_throwsIOException() throws Exception {
        String xml = "<root><child1/><child2/></root>";
        XmlTokenStream stream = createStream(xml);

        // Current is <root>, next will be <child1> (START_ELEMENT, not END_ELEMENT)
        stream.skipEndElement();
    }

    @Test
    public void testLocations() throws Exception {
        String xml = "<root>text</root>";
        XmlTokenStream stream = createStream(xml);

        JsonLocation currLoc = stream.getCurrentLocation();
        Assert.assertNotNull(currLoc);

        JsonLocation tokLoc = stream.getTokenLocation();
        Assert.assertNotNull(tokLoc);
    }

    @Test
    public void testCloseAndCloseCompletely() throws Exception {
        String xml = "<root/>";
        XmlTokenStream stream1 = createStream(xml);
        stream1.close();

        XmlTokenStream stream2 = createStream(xml);
        stream2.closeCompletely();
    }

    @Test
    public void testRepeatStartElement_singleWrapper() throws Exception {
        String xml = "<root><item>1</item><item>2</item></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <item>
        Assert.assertEquals("item", stream.getLocalName());

        // Call repeatStartElement on <item>
        stream.repeatStartElement();
        int token = stream.next(); // Should replay START_ELEMENT
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, token);
        Assert.assertEquals("item", stream.getLocalName());

        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next()); // "1"
        Assert.assertEquals("1", stream.getText());

        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next()); // implicit end or regular end
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next()); // duplicated end

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // second <item>
        Assert.assertEquals("item", stream.getLocalName());
    }

    @Test
    public void testRepeatStartElement_nestedWrapperHierarchy() throws Exception {
        String xml = "<root><list><item>A</item></list></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <list>
        stream.repeatStartElement();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // replayed <list>

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <item>
        stream.repeatStartElement();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // replayed <item>

        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next()); // "A"
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next()); // </item>
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next()); // replayed </item>
    }

    @Test(expected = IllegalStateException.class)
    public void testRepeatStartElement_invalidState_throwsException() throws Exception {
        XmlTokenStream stream = createStream("<root>text</root>");
        stream.next(); // XML_TEXT
        stream.repeatStartElement();
    }

    @Test
    public void testRepeatStartElement_delayedStartOnNonMatchingChild() throws Exception {
        String xml = "<root><item>1</item><other>2</other></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <item>
        stream.repeatStartElement();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // replay <item>
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next()); // "1"
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next()); // </item>
        Assert.assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next()); // virtual </item>

        // Now encounters <other> which does not match wrapper <item>
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <other>
        Assert.assertEquals("other", stream.getLocalName());
    }

    @Test
    public void testSkipAttributes_fromAttributeName() throws Exception {
        String xml = "<root a=\"1\" b=\"2\">text</root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        stream.skipAttributes();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());

        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        Assert.assertEquals("text", stream.getText());
    }

    @Test
    public void testSkipAttributes_fromStartElement() throws Exception {
        String xml = "<root>text</root>";
        XmlTokenStream stream = createStream(xml);
        // Current state is XML_START_ELEMENT
        stream.skipAttributes();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
    }

    @Test
    public void testSkipAttributes_fromText() throws Exception {
        String xml = "<root>text</root>";
        XmlTokenStream stream = createStream(xml);
        stream.next(); // XML_TEXT
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
        stream.skipAttributes(); // Should do nothing and not throw
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
    }

    @Test(expected = IllegalStateException.class)
    public void testSkipAttributes_invalidState_throwsException() throws Exception {
        String xml = "<root>text</root>";
        XmlTokenStream stream = createStream(xml);
        stream.next(); // XML_TEXT
        stream.next(); // XML_END_ELEMENT
        stream.skipAttributes(); // Invalid state
    }

    @Test
    public void testConvertToString_successWithText() throws Exception {
        String xml = "<root attr=\"1\">Hello</root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        String text = stream.convertToString();
        Assert.assertEquals("Hello", text);
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
        Assert.assertEquals("Hello", stream.getText());
    }

    @Test
    public void testConvertToString_successEmptyTag() throws Exception {
        String xml = "<root attr=\"1\"></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        String text = stream.convertToString();
        Assert.assertEquals("", text);
        Assert.assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
        Assert.assertEquals("", stream.getText());
    }

    @Test
    public void testConvertToString_withWrapperActive() throws Exception {
        String xml = "<parent><root attr=\"1\">Hello</root></parent>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // <root>
        stream.repeatStartElement();
        Assert.assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // replay <root>
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next()); // attr

        String text = stream.convertToString();
        Assert.assertEquals("Hello", text);
    }

    @Test
    public void testConvertToString_invalidStateOrIndex_returnsNull() throws Exception {
        String xml = "<root attr1=\"1\" attr2=\"2\">Hello</root>";
        XmlTokenStream stream = createStream(xml);

        // At START_ELEMENT state:
        Assert.assertNull(stream.convertToString());

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, stream.next());
        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next()); // nextAttributeIndex == 1
        Assert.assertNull(stream.convertToString());
    }

    @Test
    public void testConvertToString_childElementEncountered_returnsNull() throws Exception {
        String xml = "<root attr=\"1\"><child/></root>";
        XmlTokenStream stream = createStream(xml);

        Assert.assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        Assert.assertNull(stream.convertToString());
    }

    @Test
    public void testXmlStreamException_handlingInNext() throws Exception {
        // Feed an invalid/broken XML stream to trigger XMLStreamException
        XMLInputFactory f = XMLInputFactory.newFactory();
        Reader brokenReader = new Reader() {
            private final StringReader delegate = new StringReader("<root>");
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                int read = delegate.read(cbuf, off, len);
                if (read == -1) {
                    throw new IOException("Simulated network stream break");
                }
                return read;
            }
            @Override
            public void close() throws IOException {
                delegate.close();
            }
        };

        try {
            XMLStreamReader sr = f.createXMLStreamReader(brokenReader);
            while (sr.getEventType() != XMLStreamConstants.START_ELEMENT) {
                sr.next();
            }
            XmlTokenStream stream = new XmlTokenStream(sr, "source");
            while (stream.next() != XmlTokenStream.XML_END) {
                // Loop until exception
            }
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertNotNull(e.getMessage());
        } catch (XMLStreamException e) {
            // Alternatively caught during setup
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testToString_notNull() throws Exception {
        XmlTokenStream stream = createStream("<root attr=\"val\">text</root>");
        String str = stream.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("root"));
        Assert.assertTrue(str.contains("Token stream:"));
    }

    @Test
    public void testHandleRepeatElement_invalidType_throwsIllegalStateException() throws Exception {
        XmlTokenStream stream = createStream("<root/>");
        stream._repeatElement = 99; // Invalid repeat element state
        try {
            stream._handleRepeatElement();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Unrecognized type to repeat"));
        }
    }
}
