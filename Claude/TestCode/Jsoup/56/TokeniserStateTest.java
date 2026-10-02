package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokeniserStateTest {

    // ---------- Basic Enum API tests ----------

    @Test
    public void testValues_returnsAllStates_notEmpty() {
        TokeniserState[] states = TokeniserState.values();
        assertNotNull(states);
        assertTrue(states.length > 0);
    }

    @Test
    public void testValueOf_validName_returnsCorrectState() {
        TokeniserState state = TokeniserState.valueOf("Data");
        assertEquals(TokeniserState.Data, state);
    }

    @Test
    public void testValueOf_anotherValidName_returnsCorrectState() {
        TokeniserState state = TokeniserState.valueOf("CdataSection");
        assertEquals(TokeniserState.CdataSection, state);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidName_throwsIllegalArgumentException() {
        TokeniserState.valueOf("NotARealState");
    }

    @Test(expected = NullPointerException.class)
    public void testValueOf_nullName_throwsNullPointerException() {
        TokeniserState.valueOf(null);
    }

    @Test
    public void testOrdinalAndName_consistentForAllStates() {
        for (TokeniserState state : TokeniserState.values()) {
            assertEquals(state, TokeniserState.valueOf(state.name()));
        }
    }

    @Test
    public void testName_returnsCorrectString() {
        assertEquals("Data", TokeniserState.Data.name());
    }

    @Test
    public void testOrdinal_dataIsFirst() {
        assertEquals(0, TokeniserState.Data.ordinal());
    }

    @Test
    public void testToString_returnsName() {
        assertEquals("Data", TokeniserState.Data.toString());
    }

    @Test
    public void testCompareTo_ordersByOrdinal() {
        assertTrue(TokeniserState.Data.compareTo(TokeniserState.CharacterReferenceInData) < 0);
    }

    // ---------- Data state ----------
    @Test
    public void testParse_plainText_dataState() {
        Document doc = Jsoup.parse("Hello World");
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testParse_emptyString_dataState() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
    }

    @Test
    public void testParse_nullCharInData_handledWithoutCrash() {
        String html = "a\u0000b";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    // ---------- Character reference ----------
    @Test
    public void testParse_characterReference_decodesEntity() {
        Document doc = Jsoup.parse("&amp;");
        assertEquals("&", doc.body().text());
    }

    @Test
    public void testParse_invalidCharacterReference_emitsAmpersand() {
        Document doc = Jsoup.parse("& notentity");
        assertTrue(doc.body().text().contains("&"));
    }

    @Test
    public void testParse_numericCharacterReference_decodesCorrectly() {
        Document doc = Jsoup.parse("&#65;");
        assertEquals("A", doc.body().text());
    }

    @Test
    public void testParse_hexCharacterReference_decodesCorrectly() {
        Document doc = Jsoup.parse("&#x41;");
        assertEquals("A", doc.body().text());
    }

    // ---------- Rcdata (title, textarea) ----------
    @Test
    public void testParse_titleTag_rcdataState() {
        Document doc = Jsoup.parse("<html><head><title>Hello &amp; World</title></head></html>");
        assertEquals("Hello & World", doc.title());
    }

    @Test
    public void testParse_textareaTag_rcdataState() {
        Document doc = Jsoup.parse("<textarea>Some text</textarea>");
        Element ta = doc.select("textarea").first();
        assertNotNull(ta);
        assertEquals("Some text", ta.val());
    }

    @Test
    public void testParse_titleWithLessThan_rcdataLessThanSignBranch() {
        Document doc = Jsoup.parse("<title>1 < 2</title>");
        Element title = doc.select("title").first();
        assertNotNull(title);
    }

    @Test
    public void testParse_titleWithStartTagInside_noAppropriateEndTag() {
        // <title> that contains what looks like a start tag but no matching end tag
        Document doc = Jsoup.parse("<title>hello <b> world</title>");
        Element title = doc.select("title").first();
        assertNotNull(title);
    }

    // ---------- Rawtext (style) ----------
    @Test
    public void testParse_styleTag_rawtextState() {
        Document doc = Jsoup.parse("<style>body{color:red}</style>");
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.data().contains("color:red"));
    }

    // ---------- Script data ----------
    @Test
    public void testParse_scriptTag_scriptDataState() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var a = 1;"));
    }

    @Test
    public void testParse_scriptWithEscapedComment_scriptDataEscaped() {
        Document doc = Jsoup.parse("<script><!-- var a = 1; //--></script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
    }

    @Test
    public void testParse_scriptDoubleEscape_handled() {
        String html = "<script><!--<script>--></script>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_scriptEndTagInsideEscaped_handled() {
        String html = "<script><!--</script>--></script>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_scriptWithNullChar_handled() {
        String html = "<script>var a = 1;\u0000</script>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    // ---------- PLAINTEXT ----------
    @Test
    public void testParse_plaintextTag_plaintextState() {
        Document doc = Jsoup.parse("<plaintext>Hello <b>bold</b></plaintext>");
        Element pt = doc.select("plaintext").first();
        assertNotNull(pt);
        assertTrue(pt.text().contains("Hello"));
    }

    // ---------- Tags ----------
    @Test
    public void testParse_simpleTag_tagOpenAndTagName() {
        Document doc = Jsoup.parse("<div>content</div>");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("content", div.text());
    }

    @Test
    public void testParse_endTag_endTagOpenState() {
        Document doc = Jsoup.parse("<div>content</div>");
        assertEquals(1, doc.select("div").size());
    }

    @Test
    public void testParse_malformedLessThan_errorHandled() {
        Document doc = Jsoup.parse("< notag content");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_selfClosingTag_selfClosingStartTagState() {
        Document doc = Jsoup.parse("<img src='test.jpg'/>");
        Element img = doc.select("img").first();
        assertNotNull(img);
        assertEquals("test.jpg", img.attr("src"));
    }

    @Test
    public void testParse_uppercaseTagName_normalizedToLowercase() {
        Document doc = Jsoup.parse("<DIV>x</DIV>");
        Element div = doc.select("div").first();
        assertNotNull(div);
    }

    @Test
    public void testParse_emptyEndTag_bogusCommentBranch() {
        Document doc = Jsoup.parse("<div></>content</div>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_questionMarkTag_bogusComment() {
        Document doc = Jsoup.parse("<?xml version=\"1.0\"?><div>x</div>");
        assertNotNull(doc);
    }

    // ---------- Attributes ----------
    @Test
    public void testParse_attributeDoubleQuoted() {
        Document doc = Jsoup.parse("<div class=\"test\">x</div>");
        assertEquals("test", doc.select("div").first().attr("class"));
    }

    @Test
    public void testParse_attributeSingleQuoted() {
        Document doc = Jsoup.parse("<div class='test'>x</div>");
        assertEquals("test", doc.select("div").first().attr("class"));
    }

    @Test
    public void testParse_attributeUnquoted() {
        Document doc = Jsoup.parse("<div class=test>x</div>");
        assertEquals("test", doc.select("div").first().attr("class"));
    }

    @Test
    public void testParse_attributeWithCharacterReference() {
        Document doc = Jsoup.parse("<div class=\"a&amp;b\">x</div>");
        assertEquals("a&b", doc.select("div").first().attr("class"));
    }

    @Test
    public void testParse_multipleAttributes() {
        Document doc = Jsoup.parse("<div id=\"main\" class=\"test\" data-x=\"1\">x</div>");
        Element div = doc.select("div").first();
        assertEquals("main", div.attr("id"));
        assertEquals("test", div.attr("class"));
        assertEquals("1", div.attr("data-x"));
    }

    @Test
    public void testParse_attributeNameWithoutValue() {
        Document doc = Jsoup.parse("<input disabled>");
        Element input = doc.select("input").first();
        assertTrue(input.hasAttr("disabled"));
    }

    @Test
    public void testParse_attributeWithEqualsAtStart_errorHandled() {
        Document doc = Jsoup.parse("<div =foo>x</div>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_attributeWithNullChar_replacementHandled() {
        String html = "<div cla\u0000ss=\"test\">x</div>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_attributeValueWithLessThan_errorHandled() {
        Document doc = Jsoup.parse("<div a=<b>x</div>");
        assertNotNull(doc.body());
    }

    // ---------- Comments ----------
    @Test
    public void testParse_comment_commentState() {
        Document doc = Jsoup.parse("<!-- this is a comment -->");
        assertTrue(doc.toString().contains("this is a comment"));
    }

    @Test
    public void testParse_bogusComment_bogusCommentState() {
        Document doc = Jsoup.parse("<!notreally comment>");
        assertNotNull(doc);
    }

    @Test
    public void testParse_commentWithDashes_commentEndBangBranch() {
        Document doc = Jsoup.parse("<!--comment with --! dashes-->");
        assertNotNull(doc);
    }

    @Test
    public void testParse_commentStartingWithDashOnly() {
        Document doc = Jsoup.parse("<!-->broken-->");
        assertNotNull(doc);
    }

    @Test
    public void testParse_unclosedComment_eofHandled() {
        Document doc = Jsoup.parse("<!-- unclosed comment");
        assertNotNull(doc);
    }

    // ---------- Doctype ----------
    @Test
    public void testParse_doctype_doctypeState() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body>x</body></html>");
        assertNotNull(doc.select("html").first());
    }

    @Test
    public void testParse_doctypeWithPublicAndSystem() {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_doctypeInvalidEmpty_forceQuirks() {
        Document doc = Jsoup.parse("<!DOCTYPE>");
        assertNotNull(doc);
    }

    @Test
    public void testParse_incompleteDoctype_eofHandled() {
        Document doc = Jsoup.parse("<!DOCTYPE");
        assertNotNull(doc);
    }

    @Test
    public void testParse_bogusDoctype_handled() {
        Document doc = Jsoup.parse("<!DOCTYPE html SOMETHINGWEIRD extra>");
        assertNotNull(doc);
    }

    // ---------- CDATA ----------
    @Test
    public void testParse_cdataSection_handled() {
        String html = "<svg><![CDATA[some data]]></svg>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    // ---------- EOF edge cases ----------
    @Test
    public void testParse_unclosedTag_eofHandled() {
        Document doc = Jsoup.parse("<div class=\"test\"");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_unclosedScript_eofHandled() {
        Document doc = Jsoup.parse("<script>var a = 1;");
        assertNotNull(doc);
    }

    @Test
    public void testParse_incompleteEndTag_eofHandled() {
        Document doc = Jsoup.parse("<div></");
        assertNotNull(doc);
    }

    @Test
    public void testParse_incompleteStartTagLetter_eofHandled() {
        Document doc = Jsoup.parse("<di");
        assertNotNull(doc);
    }

    @Test
    public void testParse_incompleteAttributeValueQuoted_eofHandled() {
        Document doc = Jsoup.parse("<div a=\"val");
        assertNotNull(doc);
    }
}
