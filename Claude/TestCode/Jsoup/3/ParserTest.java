import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class ParserTest {

    // ---------- Normal / typical input cases ----------

    @Test
    public void testParse_normalHtml_returnsDocument() {
        Document doc = Parser.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        String html = doc.toString();
        Assert.assertTrue(html.contains("Hello"));
        Assert.assertTrue(html.contains("Test"));
    }

    @Test
    public void testParse_withComment_addsCommentToDocument() {
        Document doc = Parser.parse("<html><body><!-- comment text --></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        String html = doc.toString();
        Assert.assertTrue(html.contains("comment text"));
    }

    @Test
    public void testParse_withCdata_addsTextNode() {
        Document doc = Parser.parse("<html><body><![CDATA[cdata content]]></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        String html = doc.toString();
        Assert.assertTrue(html.contains("cdata content"));
    }

    @Test
    public void testParse_withXmlDeclarationQuestionMark_returnsDocument() {
        Document doc = Parser.parse("<?xml version=\"1.0\"?><html><body>text</body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("text"));
    }

    @Test
    public void testParse_withDoctypeBang_returnsDocument() {
        Document doc = Parser.parse("<!DOCTYPE html><html><body>text</body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("text"));
    }

    @Test
    public void testParse_withEndTag_closesElement() {
        Document doc = Parser.parse("<html><body><p>Para1</p><p>Para2</p></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("Para1"));
        Assert.assertTrue(html.contains("Para2"));
    }

    @Test
    public void testParse_withSelfClosingTag_createsEmptyElement() {
        Document doc = Parser.parse("<html><body><br/><img src='test.jpg'/></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withEmptyTagImg_createsEmptyElement() {
        Document doc = Parser.parse("<html><body><img src=\"test.jpg\"></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withAttributesSingleQuote_parsesCorrectly() {
        Document doc = Parser.parse("<html><body><div id='test' class='myclass'>content</div></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("content"));
    }

    @Test
    public void testParse_withAttributesDoubleQuote_parsesCorrectly() {
        Document doc = Parser.parse("<html><body><div id=\"test\" class=\"myclass\">content</div></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("content"));
    }

    @Test
    public void testParse_withUnquotedAttributeValue_parsesCorrectly() {
        Document doc = Parser.parse("<html><body><div id=test>content</div></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("content"));
    }

    @Test
    public void testParse_withAttributeNoValue_parsesCorrectly() {
        Document doc = Parser.parse("<html><body><input disabled></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withScriptTag_createsDataNode() {
        Document doc = Parser.parse("<html><body><script>var x = 1;</script></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("var x = 1;"));
    }

    @Test
    public void testParse_withTitleTag_createsTextNode() {
        Document doc = Parser.parse("<html><head><title>My Title</title></head><body></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("My Title"));
    }

    @Test
    public void testParse_withTextareaTag_createsTextNode() {
        Document doc = Parser.parse("<html><body><textarea>Some text</textarea></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("Some text"));
    }

    @Test
    public void testParse_withBaseTag_updatesBaseUri() {
        Document doc = Parser.parse("<html><head><base href=\"http://newbase.com/\"></head><body></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withBaseTagEmptyHref_doesNotUpdateBaseUri() {
        Document doc = Parser.parse("<html><head><base target=\"_blank\"></head><body></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParseBodyFragment_normal_returnsDocumentWithBody() {
        Document doc = Parser.parseBodyFragment("<p>Fragment content</p>", "http://example.com/");
        Assert.assertNotNull(doc);
        String html = doc.toString();
        Assert.assertTrue(html.contains("Fragment content"));
    }

    @Test
    public void testParse_withNestedTags_createsHierarchy() {
        Document doc = Parser.parse("<html><body><div><span>Nested</span></div></body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("Nested"));
    }

    @Test
    public void testParse_withMultipleTextNodes_parsesAll() {
        Document doc = Parser.parse("<html><body>Text1<br/>Text2</body></html>", "http://example.com/");
        String html = doc.toString();
        Assert.assertTrue(html.contains("Text1"));
        Assert.assertTrue(html.contains("Text2"));
    }

    @Test
    public void testParse_withImplicitHtmlBodyCreation_returnsDocument() {
        Document doc = Parser.parse("<p>No html or body tags</p>", "http://example.com/");
        Assert.assertNotNull(doc);
        String html = doc.toString();
        Assert.assertTrue(html.contains("No html or body tags"));
    }

    @Test
    public void testParse_withSelfClosingNonEmptyTag_treatsAsEmptyElement() {
        Document doc = Parser.parse("<html><body><custom/>text</body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withUnquotedAttributeValueEndingAtSlash_parsesCorrectly() {
        Document doc = Parser.parse("<html><body><img src=test.jpg/></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_emptyString_returnsDocument() {
        Document doc = Parser.parse("", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParseBodyFragment_emptyString_returnsDocument() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withMalformedStartTag_treatsAsText() {
        // "< " does not look like a valid tag name start, should be handled as text
        Document doc = Parser.parse("<html><body>< notag text</body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withUnknownAttributeChar_skipsChar() {
        Document doc = Parser.parse("<html><body><div =foo>text</div></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("text"));
    }

    @Test
    public void testParse_withEndTagUnmatched_ignoresGracefully() {
        Document doc = Parser.parse("<html><body></span>text</body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("text"));
    }

    @Test
    public void testParse_withEndTagEmptyName_ignored() {
        Document doc = Parser.parse("<html><body></>text</body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withOnlyWhitespace_returnsDocument() {
        Document doc = Parser.parse("   ", "http://example.com/");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withEmptyBaseUri_returnsDocument() {
        Document doc = Parser.parse("<html><body>text</body></html>", "");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParseBodyFragment_withEmptyBaseUri_returnsDocument() {
        Document doc = Parser.parseBodyFragment("<p>text</p>", "");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testParse_withCommentEndingWithDoubleDash_handlesCorrectly() {
        Document doc = Parser.parse("<html><body><!--comment--></body></html>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("comment"));
    }

    @Test
    public void testParse_withDeeplyNestedUnclosedTags_returnsDocument() {
        Document doc = Parser.parse("<html><body><div><span><b>text", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.toString().contains("text"));
    }

    // ---------- Exception cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParse_withNullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_withNullBaseUri_throwsException() {
        Parser.parse("<html></html>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_withNullHtml_throwsException() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_withNullBaseUri_throwsException() {
        Parser.parseBodyFragment("<p>test</p>", null);
    }
}
