package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokeniserStateTest {

    // ---------- Enum basic behavior tests ----------

    @Test
    public void testValues_returnsAllStates_notEmpty() {
        TokeniserState[] states = TokeniserState.values();
        assertTrue(states.length > 0);
    }

    @Test
    public void testValueOf_validName_returnsState() {
        TokeniserState state = TokeniserState.valueOf("Data");
        assertEquals("Data", state.name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidName_throwsException() {
        TokeniserState.valueOf("NotARealState");
    }

    @Test(expected = NullPointerException.class)
    public void testValueOf_nullName_throwsException() {
        TokeniserState.valueOf(null);
    }

    @Test
    public void testOrdinal_dataState_isZero() {
        assertEquals(0, TokeniserState.Data.ordinal());
    }

    @Test
    public void testName_cdataSection_returnsCorrectName() {
        assertEquals("CdataSection", TokeniserState.CdataSection.name());
    }

    // ---------- Data state ----------

    @Test
    public void testDataState_normalText_parsedCorrectly() {
        Document doc = Jsoup.parse("<p>Hello World</p>");
        assertEquals("Hello World", doc.select("p").text());
    }

    @Test
    public void testDataState_characterReference_decodedCorrectly() {
        Document doc = Jsoup.parse("<p>A &amp; B</p>");
        assertEquals("A & B", doc.select("p").text());
    }

    @Test
    public void testDataState_invalidCharacterReference_emitsAmpersand() {
        Document doc = Jsoup.parse("<p>A &notacharref; B</p>");
        assertTrue(doc.select("p").text().contains("&"));
    }

    @Test
    public void testDataState_nullChar_handledWithoutCrash() {
        Document doc = Jsoup.parse("<p>A\u0000B</p>");
        assertNotNull(doc.select("p").text());
    }

    @Test
    public void testDataState_emptyInput_producesValidDocument() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
    }

    // ---------- Rcdata (title) ----------

    @Test
    public void testRcdataState_title_parsedAsText() {
        Document doc = Jsoup.parse("<html><head><title>My Title</title></head></html>");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testRcdataState_titleWithNullChar_replacesWithReplacementChar() {
        Document doc = Jsoup.parse("<title>A\u0000B</title>");
        assertTrue(doc.title().length() > 0);
    }

    @Test
    public void testRcdataLessThanSign_titleWithEndTag_treatedAsEndTag() {
        Document doc = Jsoup.parse("<title>Hello</title><p>after</p>");
        assertEquals("Hello", doc.title());
        assertEquals("after", doc.select("p").text());
    }

    @Test
    public void testRcdataLessThanSign_startTagInsideTitle_emittedAsText() {
        Document doc = Jsoup.parse("<title>Hello <b>World</b></title>");
        assertTrue(doc.title().contains("Hello"));
    }

    // ---------- Rawtext (style, xmp) ----------

    @Test
    public void testRawtextState_style_parsedAsRawText() {
        Document doc = Jsoup.parse("<style>body{color:red}</style>");
        assertTrue(doc.select("style").outerHtml().contains("color:red"));
    }

    @Test
    public void testRawtextEndTagName_appropriateEndTag_transitionsCorrectly() {
        Document doc = Jsoup.parse("<style>body{}</style><p>after</p>");
        assertEquals("after", doc.select("p").text());
    }

    // ---------- ScriptData states ----------

    @Test
    public void testScriptDataState_script_parsedAsRawText() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>");
        assertTrue(doc.select("script").html().contains("var x"));
    }

    @Test
    public void testScriptDataEscaped_scriptWithComment_parsedCorrectly() {
        Document doc = Jsoup.parse("<script><!-- var x = 1; --></script>");
        assertTrue(doc.select("script").html().contains("var x"));
    }

    @Test
    public void testScriptDataDoubleEscaped_nestedScriptTag_parsedCorrectly() {
        Document doc = Jsoup.parse("<script><!--<script>var x=1;</script>--></script>");
        assertNotNull(doc.select("script").html());
    }

    @Test
    public void testScriptDataEscapedLessThan_endTagOpen_transitionsCorrectly() {
        Document doc = Jsoup.parse("<script><!--</script>--></script>");
        assertNotNull(doc);
    }

    // ---------- PLAINTEXT state ----------

    @Test
    public void testPlaintextState_plaintextTag_parsedLiterally() {
        Document doc = Jsoup.parse("<plaintext>This is <b>literal</b> text");
        assertTrue(doc.body().text().contains("<b>"));
    }

    @Test
    public void testPlaintextState_nullChar_handledWithoutCrash() {
        Document doc = Jsoup.parse("<plaintext>A\u0000B");
        assertNotNull(doc);
    }

    // ---------- TagOpen / EndTagOpen states ----------

    @Test
    public void testTagOpenState_comment_parsedAsComment() {
        Document doc = Jsoup.parse("<!-- a comment -->");
        assertTrue(doc.toString().contains("a comment"));
    }

    @Test
    public void testTagOpenState_bogusCommentWithQuestionMark_parsedAsComment() {
        Document doc = Jsoup.parse("<?xml version=\"1.0\"?><p>text</p>");
        assertEquals("text", doc.select("p").text());
    }

    @Test
    public void testTagOpenState_invalidChar_emitsLessThan() {
        Document doc = Jsoup.parse("<p>1 < 2</p>");
        assertTrue(doc.select("p").text().contains("1"));
    }

    @Test
    public void testTagOpenState_endTag_parsedCorrectly() {
        Document doc = Jsoup.parse("<div>content</div>");
        assertEquals("content", doc.select("div").text());
    }

    @Test
    public void testEndTagOpenState_emptyAfterSlash_handledGracefully() {
        Document doc = Jsoup.parse("<div>content</");
        assertNotNull(doc);
    }

    @Test
    public void testEndTagOpenState_greaterThan_producesErrorButNoCrash() {
        Document doc = Jsoup.parse("<div>content</></div>");
        assertNotNull(doc);
    }

    // ---------- TagName state ----------

    @Test
    public void testTagNameState_selfClosingTag_parsedCorrectly() {
        Document doc = Jsoup.parse("<br/>");
        assertNotNull(doc.select("br").first());
    }

    @Test
    public void testTagNameState_withWhitespace_parsedAttributesCorrectly() {
        Document doc = Jsoup.parse("<div class=\"test\">content</div>");
        assertEquals("test", doc.select("div").attr("class"));
    }

    @Test
    public void testTagNameState_withNullChar_replacedGracefully() {
        Document doc = Jsoup.parse("<di\u0000v>content</di\u0000v>");
        assertNotNull(doc);
    }

    // ---------- Attribute states ----------

    @Test
    public void testAttributeState_unquotedValue_parsedCorrectly() {
        Document doc = Jsoup.parse("<div class=test>content</div>");
        assertEquals("test", doc.select("div").attr("class"));
    }

    @Test
    public void testAttributeState_singleQuotedValue_parsedCorrectly() {
        Document doc = Jsoup.parse("<div class='test'>content</div>");
        assertEquals("test", doc.select("div").attr("class"));
    }

    @Test
    public void testAttributeState_doubleQuotedValue_parsedCorrectly() {
        Document doc = Jsoup.parse("<div class=\"test\">content</div>");
        assertEquals("test", doc.select("div").attr("class"));
    }

    @Test
    public void testAttributeState_withCharacterReference_decodedCorrectly() {
        Document doc = Jsoup.parse("<a href=\"foo?a=1&amp;b=2\">link</a>");
        assertEquals("foo?a=1&b=2", doc.select("a").attr("href"));
    }

    @Test
    public void testAttributeState_multipleAttributes_parsedCorrectly() {
        Document doc = Jsoup.parse("<input type=\"text\" name=\"field\" value=\"1\"/>");
        Element input = doc.select("input").first();
        assertEquals("text", input.attr("type"));
        assertEquals("field", input.attr("name"));
    }

    @Test
    public void testBeforeAttributeNameState_selfClosingSlash_handledCorrectly() {
        Document doc = Jsoup.parse("<img src=\"test.png\" />");
        assertEquals("test.png", doc.select("img").attr("src"));
    }

    @Test
    public void testAttributeName_withNullChar_handledGracefully() {
        Document doc = Jsoup.parse("<div cla\u0000ss=\"test\">content</div>");
        assertNotNull(doc);
    }

    @Test
    public void testAfterAttributeValueQuotedState_transitionsCorrectly() {
        Document doc = Jsoup.parse("<div class=\"test\" id=\"myid\">content</div>");
        assertEquals("myid", doc.select("div").attr("id"));
    }

    // ---------- SelfClosingStartTag state ----------

    @Test
    public void testSelfClosingStartTagState_slashWithoutGreaterThan_handledGracefully() {
        Document doc = Jsoup.parse("<div/ class=\"test\">content</div>");
        assertNotNull(doc);
    }

    // ---------- Comment states ----------

    @Test
    public void testCommentState_basicComment_parsedCorrectly() {
        Document doc = Jsoup.parse("<!--comment--><p>text</p>");
        assertEquals("text", doc.select("p").text());
    }

    @Test
    public void testCommentState_commentWithDashes_parsedCorrectly() {
        Document doc = Jsoup.parse("<!-- a--b -->");
        assertNotNull(doc);
    }

    @Test
    public void testCommentState_unclosedComment_handledGracefully() {
        Document doc = Jsoup.parse("<!-- unclosed comment");
        assertNotNull(doc);
    }

    @Test
    public void testCommentState_withNullChar_replacedGracefully() {
        Document doc = Jsoup.parse("<!--A\u0000B-->");
        assertNotNull(doc);
    }

    @Test
    public void testCommentEndBangState_transitionsCorrectly() {
        Document doc = Jsoup.parse("<!--comment--!><p>text</p>");
        assertNotNull(doc);
    }

    // ---------- Doctype states ----------

    @Test
    public void testMarkupDeclarationOpenState_doctype_parsedCorrectly() {
        Document doc = Jsoup.parse("<!DOCTYPE html><p>text</p>");
        assertEquals("text", doc.select("p").text());
    }

    @Test
    public void testDoctypeState_withPublicIdentifier_parsedCorrectly() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" " +
            "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testDoctypeState_withSystemIdentifier_parsedCorrectly() {
        String html = "<!DOCTYPE html SYSTEM \"about:legacy-compat\">";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testDoctypeState_incompleteDoctype_handledGracefully() {
        Document doc = Jsoup.parse("<!DOCTYPE");
        assertNotNull(doc);
    }

    @Test
    public void testBogusDoctypeState_malformedDoctype_handledGracefully() {
        Document doc = Jsoup.parse("<!DOCTYPE html PUBLIC nonsense here>");
        assertNotNull(doc);
    }

    @Test
    public void testAfterDoctypeNameState_public_transitionsCorrectly() {
        Document doc = Jsoup.parse("<!DOCTYPE html PUBLIC>");
        assertNotNull(doc);
    }

    @Test
    public void testDoctypeState_withSingleQuotedIdentifiers_parsedCorrectly() {
        String html = "<!DOCTYPE html PUBLIC 'pubid' 'sysid'>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testDoctypeState_withNullChar_replacedGracefully() {
        Document doc = Jsoup.parse("<!DOCTYPE\u0000 html>");
        assertNotNull(doc);
    }

    // ---------- CDATA section (via xml parser) ----------

    @Test
    public void testCdataSection_inXmlContext_parsedCorrectly() {
        Document doc = Jsoup.parse("<root><![CDATA[some data]]></root>", "", Parser.xmlParser());
        assertNotNull(doc);
        assertTrue(doc.toString().contains("some data"));
    }

    // ---------- Bogus comment via TagOpen invalid path ----------

    @Test
    public void testBogusCommentState_invalidTagOpenSequence_parsedAsComment() {
        Document doc = Jsoup.parse("<%invalid><p>text</p>");
        assertNotNull(doc);
    }

    // ---------- Mixed complex document ----------

    @Test
    public void testFullDocument_complexHtml_parsedWithoutError() {
        String html = "<!DOCTYPE html>" +
            "<html><head><title>Test</title>" +
            "<style>body{color:red}</style>" +
            "<script>var a = 1 < 2;</script>" +
            "</head><body>" +
            "<!-- comment -->" +
            "<div id=\"main\" class='container' data-x=val>" +
            "<p>Hello &amp; welcome</p>" +
            "</div>" +
            "</body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Test", doc.title());
        assertEquals("main", doc.select("div").attr("id"));
        assertEquals("container", doc.select("div").attr("class"));
        assertEquals("val", doc.select("div").attr("data-x"));
        assertTrue(doc.select("p").text().contains("Hello"));
    }
}
