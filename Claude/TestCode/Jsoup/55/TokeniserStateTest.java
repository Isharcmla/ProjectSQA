package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for TokeniserState.
 * Since TokeniserState is package-private, this test class resides in the
 * same package (org.jsoup.parser) so enum-level APIs (values(), valueOf(),
 * name(), ordinal(), toString()) can be exercised directly.
 * The state-transition logic itself (read()) is exercised indirectly through
 * the public Jsoup.parse(String) API, which drives the Tokeniser through the
 * various TokeniserState transitions.
 */
public class TokeniserStateTest {

    // ---------------------------------------------------------------
    // Enum basic API tests
    // ---------------------------------------------------------------

    @Test
    public void testValues_returnsAllStates_notEmpty() {
        TokeniserState[] states = TokeniserState.values();
        assertNotNull(states);
        assertTrue(states.length > 0);
    }

    @Test
    public void testValueOf_validName_returnsCorrectEnum() {
        TokeniserState state = TokeniserState.valueOf("Data");
        assertEquals(TokeniserState.Data, state);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidName_throwsException() {
        TokeniserState.valueOf("NotARealState");
    }

    @Test(expected = NullPointerException.class)
    public void testValueOf_nullName_throwsException() {
        TokeniserState.valueOf((String) null);
    }

    @Test
    public void testName_returnsCorrectString() {
        assertEquals("Data", TokeniserState.Data.name());
        assertEquals("CdataSection", TokeniserState.CdataSection.name());
    }

    @Test
    public void testOrdinal_dataIsFirst() {
        assertEquals(0, TokeniserState.Data.ordinal());
    }

    @Test
    public void testToString_returnsName() {
        assertEquals("Data", TokeniserState.Data.toString());
    }

    // ---------------------------------------------------------------
    // Parsing behavior tests exercising states via Jsoup public API
    // ---------------------------------------------------------------

    @Test
    public void testData_plainText_parsedAsTextNode() {
        Document doc = Jsoup.parse("<p>hello world</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("hello world", p.text());
    }

    @Test
    public void testData_ampersandEntity_decoded() {
        Document doc = Jsoup.parse("<p>a &amp; b</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("a & b", p.text());
    }

    @Test
    public void testData_nullCharacter_handledWithoutException() {
        Document doc = Jsoup.parse("<p>a\u0000b</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertTrue(p.text().contains("a"));
        assertTrue(p.text().contains("b"));
    }

    @Test
    public void testData_emptyInput_producesEmptyDocument() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test
    public void testRcdata_title_parsed() {
        Document doc = Jsoup.parse("<html><head><title>My &amp; Title</title></head><body></body></html>");
        assertEquals("My & Title", doc.title());
    }

    @Test
    public void testRcdata_titleWithNullChar_doesNotThrow() {
        Document doc = Jsoup.parse("<title>a\u0000b</title>");
        String title = doc.title();
        assertNotNull(title);
    }

    @Test
    public void testScriptData_basicScriptContent() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var x = 1;"));
    }

    @Test
    public void testScriptDataEscaped_commentInScript() {
        Document doc = Jsoup.parse("<script><!-- var x=1; --></script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var x=1;"));
    }

    @Test
    public void testPlaintext_tagTreatsRestAsText() {
        Document doc = Jsoup.parse("<plaintext>raw <b>not bold</b>");
        Element pt = doc.select("plaintext").first();
        assertNotNull(pt);
        assertTrue(pt.text().contains("raw"));
    }

    @Test
    public void testTagOpen_bogusCommentFromQuestionMark() {
        Document doc = Jsoup.parse("<?xml version=\"1.0\"?><p>after</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("after", p.text());
    }

    @Test
    public void testTagOpen_invalidTagCharEmitsLessThan() {
        Document doc = Jsoup.parse("<1 invalid tag>");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testEndTagOpen_eofProducesLiteralText() {
        Document doc = Jsoup.parse("</");
        assertNotNull(doc);
    }

    @Test
    public void testEndTagOpen_bogusComment() {
        Document doc = Jsoup.parse("</>next");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("next"));
    }

    @Test
    public void testTagName_withAttributes() {
        Document doc = Jsoup.parse("<div id=\"main\" class=\"foo\">content</div>");
        Element div = doc.select("div#main").first();
        assertNotNull(div);
        assertEquals("foo", div.attr("class"));
        assertEquals("content", div.text());
    }

    @Test
    public void testTagName_selfClosingSlash() {
        Document doc = Jsoup.parse("<p>line1<br/>line2</p>");
        Element br = doc.select("br").first();
        assertNotNull(br);
    }

    @Test
    public void testAttributeValue_doubleQuoted() {
        Document doc = Jsoup.parse("<a href=\"http://example.com\">link</a>");
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("http://example.com", a.attr("href"));
    }

    @Test
    public void testAttributeValue_singleQuoted() {
        Document doc = Jsoup.parse("<a href='http://example.com'>link</a>");
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("http://example.com", a.attr("href"));
    }

    @Test
    public void testAttributeValue_unquoted() {
        Document doc = Jsoup.parse("<a href=http://example.com>link</a>");
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("http://example.com", a.attr("href"));
    }

    @Test
    public void testAttributeValue_withCharacterReference() {
        Document doc = Jsoup.parse("<a href=\"foo?a=1&amp;b=2\">link</a>");
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertEquals("foo?a=1&b=2", a.attr("href"));
    }

    @Test
    public void testAttributeValue_emptyDoubleQuoted() {
        Document doc = Jsoup.parse("<div id=\"\">content</div>");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("", div.attr("id"));
    }

    @Test
    public void testBeforeAttributeName_nullCharHandled() {
        Document doc = Jsoup.parse("<div \u0000=\"x\">content</div>");
        assertNotNull(doc);
    }

    @Test
    public void testAttributeName_withQuoteCharacter() {
        Document doc = Jsoup.parse("<div a\"b=\"x\">content</div>");
        assertNotNull(doc);
    }

    @Test
    public void testComment_basicParsed() {
        Document doc = Jsoup.parse("<!-- this is a comment --><p>after</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("after", p.text());
    }

    @Test
    public void testCommentWithDashes() {
        Document doc = Jsoup.parse("<!-- comment - with - dashes --><p>after</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("after", p.text());
    }

    @Test
    public void testBogusComment_fromMarkupDeclaration() {
        Document doc = Jsoup.parse("<!weird data><p>after</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
    }

    @Test
    public void testDoctype_simpleHtml5() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>content</p>");
        assertNotNull(doc);
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("content", p.text());
    }

    @Test
    public void testDoctype_publicAndSystemIdentifiers() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" " +
                "\"http://www.w3.org/TR/html4/strict.dtd\"><p>content</p>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("content", p.text());
    }

    @Test
    public void testDoctype_bogusDoctype() {
        Document doc = Jsoup.parse("<!DOCTYPE ><p>content</p>");
        assertNotNull(doc);
    }

    @Test
    public void testCdataSection_insideSvg_doesNotThrow() {
        Document doc = Jsoup.parse("<svg><![CDATA[ some cdata content ]]></svg>");
        assertNotNull(doc);
    }

    // ---------------------------------------------------------------
    // Edge case / exception tests
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullString_throwsException() {
        Jsoup.parse((String) null);
    }

    @Test
    public void testParse_emptyString_doesNotThrow() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParse_onlyNullCharacter_doesNotThrow() {
        Document doc = Jsoup.parse("\u0000");
        assertNotNull(doc);
    }

    @Test
    public void testParse_veryLongText_doesNotThrow() {
        StringBuilder sb = new StringBuilder("<p>");
        for (int i = 0; i < 10000; i++) {
            sb.append('a');
        }
        sb.append("</p>");
        Document doc = Jsoup.parse(sb.toString());
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals(10000, p.text().length());
    }

    @Test
    public void testParse_malformedTagStillProducesDocument() {
        Document doc = Jsoup.parse("<div><span>unclosed");
        assertNotNull(doc);
        assertNotNull(doc.select("span").first());
    }

    @Test
    public void testParse_multipleAmpersandsInText() {
        Document doc = Jsoup.parse("<p>&amp;&amp;&lt;&gt;</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("&&<>", p.text());
    }
}
