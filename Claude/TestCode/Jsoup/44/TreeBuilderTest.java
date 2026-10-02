package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

import java.util.ArrayList;
import java.util.List;

public class TreeBuilderTest {

    // Concrete implementation of the abstract TreeBuilder for testing purposes.
    private static class RecordingTreeBuilder extends TreeBuilder {
        List<Token.TokenType> types = new ArrayList<Token.TokenType>();
        int callCount = 0;

        @Override
        protected boolean process(Token token) {
            callCount++;
            types.add(token.type);
            return true;
        }
    }

    private RecordingTreeBuilder tb;

    @Before
    public void setUp() {
        tb = new RecordingTreeBuilder();
    }

    // ---------- parse(String, String) tests ----------

    @Test
    public void testParse_typicalInput_returnsNonNullDocument() {
        Document doc = tb.parse("<html><body>Hello</body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParse_emptyInput_returnsDocument() {
        Document doc = tb.parse("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullInput_throwsIllegalArgumentException() {
        tb.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullBaseUri_throwsIllegalArgumentException() {
        tb.parse("<p>Hi</p>", null);
    }

    // ---------- parse(String, String, ParseErrorList) tests ----------

    @Test
    public void testParseWithErrorList_typicalInput_returnsDocument() {
        Document doc = tb.parse("<div>Test</div>", "http://test.com/", ParseErrorList.noTracking());
        assertNotNull(doc);
        assertNotNull(tb.errors);
    }

    // ---------- initialiseParse tests ----------

    @Test
    public void testInitialiseParse_typicalInput_setsFieldsCorrectly() {
        tb.initialiseParse("<p>test</p>", "http://test.com/", ParseErrorList.noTracking());
        assertNotNull(tb.doc);
        assertNotNull(tb.reader);
        assertNotNull(tb.tokeniser);
        assertNotNull(tb.stack);
        assertEquals("http://test.com/", tb.baseUri);
        assertEquals(0, tb.stack.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_nullInput_throwsIllegalArgumentException() {
        tb.initialiseParse(null, "http://test.com/", ParseErrorList.noTracking());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_nullBaseUri_throwsIllegalArgumentException() {
        tb.initialiseParse("<p>test</p>", null, ParseErrorList.noTracking());
    }

    // ---------- runParser tests ----------

    @Test
    public void testRunParser_typicalInput_processesTokensUntilEOF() {
        tb.initialiseParse("<p>Hi</p>", "http://test.com/", ParseErrorList.noTracking());
        tb.runParser();
        assertTrue(tb.callCount > 0);
        assertEquals(Token.TokenType.EOF, tb.types.get(tb.types.size() - 1));
    }

    @Test
    public void testRunParser_emptyInput_processesEOFOnly() {
        tb.initialiseParse("", "http://test.com/", ParseErrorList.noTracking());
        tb.runParser();
        assertTrue(tb.callCount > 0);
        assertEquals(Token.TokenType.EOF, tb.types.get(tb.types.size() - 1));
    }

    // ---------- processStartTag(String) tests ----------

    @Test
    public void testProcessStartTag_validName_invokesProcessWithStartTagType() {
        boolean result = tb.processStartTag("div");
        assertTrue(result);
        assertEquals(1, tb.callCount);
        assertEquals(Token.TokenType.StartTag, tb.types.get(0));
    }

    @Test
    public void testProcessStartTag_emptyName_invokesProcess() {
        boolean result = tb.processStartTag("");
        assertTrue(result);
        assertEquals(1, tb.callCount);
        assertEquals(Token.TokenType.StartTag, tb.types.get(0));
    }

    // ---------- processStartTag(String, Attributes) tests ----------

    @Test
    public void testProcessStartTagWithAttrs_validNameAndAttrs_invokesProcessWithStartTagType() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        boolean result = tb.processStartTag("div", attrs);
        assertTrue(result);
        assertEquals(1, tb.callCount);
        assertEquals(Token.TokenType.StartTag, tb.types.get(0));
    }

    @Test
    public void testProcessStartTagWithAttrs_emptyAttrs_invokesProcess() {
        Attributes attrs = new Attributes();
        boolean result = tb.processStartTag("span", attrs);
        assertTrue(result);
        assertEquals(1, tb.callCount);
        assertEquals(Token.TokenType.StartTag, tb.types.get(0));
    }

    // ---------- processEndTag(String) tests ----------

    @Test
    public void testProcessEndTag_validName_invokesProcessWithEndTagType() {
        boolean result = tb.processEndTag("div");
        assertTrue(result);
        assertEquals(1, tb.callCount);
        assertEquals(Token.TokenType.EndTag, tb.types.get(0));
    }

    @Test
    public void testProcessEndTag_emptyName_invokesProcess() {
        boolean result = tb.processEndTag("");
        assertTrue(result);
        assertEquals(1, tb.callCount);
        assertEquals(Token.TokenType.EndTag, tb.types.get(0));
    }

    // ---------- currentElement tests ----------

    @Test
    public void testCurrentElement_emptyStack_returnsNull() {
        tb.initialiseParse("<p>Hi</p>", "http://test.com/", ParseErrorList.noTracking());
        assertNull(tb.currentElement());
    }

    @Test
    public void testCurrentElement_withElementInStack_returnsLastElement() {
        tb.initialiseParse("<p>Hi</p>", "http://test.com/", ParseErrorList.noTracking());
        Element el1 = new Element(Tag.valueOf("div"), "http://test.com/");
        Element el2 = new Element(Tag.valueOf("span"), "http://test.com/");
        tb.stack.add(el1);
        tb.stack.add(el2);
        assertSame(el2, tb.currentElement());
    }

    @Test
    public void testCurrentElement_withSingleElementInStack_returnsThatElement() {
        tb.initialiseParse("<p>Hi</p>", "http://test.com/", ParseErrorList.noTracking());
        Element el = new Element(Tag.valueOf("div"), "http://test.com/");
        tb.stack.add(el);
        assertSame(el, tb.currentElement());
    }
}
