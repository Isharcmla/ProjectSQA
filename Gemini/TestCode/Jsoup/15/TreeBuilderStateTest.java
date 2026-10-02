package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TreeBuilderStateTest {

    private Document parseHtml(String html) {
        return Jsoup.parse(html);
    }

    private Document parseHtmlWithErrors(String html) {
        Parser parser = Parser.htmlParser().setTrackErrors(500);
        return parser.parseInput(html, "http://example.com/");
    }

    private List<Node> parseFragment(String html, Element context) {
        return Parser.parseFragment(html, context, "http://example.com/");
    }

    @Test
    public void testEnumValuesAndValueOf_normal_success() {
        TreeBuilderState[] states = TreeBuilderState.values();
        assertTrue(states.length > 0);
        for (TreeBuilderState state : states) {
            assertNotNull(state);
            assertEquals(state, TreeBuilderState.valueOf(state.name()));
        }
    }

    @Test
    public void testInitialState_variousTokens_success() {
        Document doc1 = parseHtml("   <!DOCTYPE html><html><head></head><body></body></html>");
        assertEquals("html", doc1.child(0).nodeName());

        Document doc2 = parseHtml("<!-- comment before doctype --><!DOCTYPE html><html><body></body></html>");
        assertEquals("#comment", doc2.childNode(0).nodeName());

        Document doc3 = parseHtml("<!DOCTYPE html SYSTEM \"about:legacy-compat\"><html><body></body></html>");
        assertNotNull(doc3.doctype());

        Document doc4 = parseHtml("<html><body>No doctype</body></html>");
        assertEquals("No doctype", doc4.body().text());

        Document doc5 = parseHtmlWithErrors("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\"><html></html>");
        assertNotNull(doc5);
    }

    @Test
    public void testBeforeHtmlState_variousTokens_success() {
        Document doc1 = parseHtmlWithErrors("<!DOCTYPE html><!DOCTYPE html><html><body></body></html>");
        assertNotNull(doc1);

        Document doc2 = parseHtml("<!DOCTYPE html> <!-- comment --> <html><body></body></html>");
        assertNotNull(doc2.select("html"));

        Document doc3 = parseHtmlWithErrors("<!DOCTYPE html></head><body>text</body>");
        assertEquals("text", doc3.body().text());

        Document doc4 = parseHtmlWithErrors("<!DOCTYPE html></div><body>text</body>");
        assertEquals("text", doc4.body().text());

        Document doc5 = parseHtml("<!DOCTYPE html><body>Direct body</body>");
        assertEquals("Direct body", doc5.body().text());
    }

    @Test
    public void testBeforeHeadState_variousTokens_success() {
        Document doc1 = parseHtml("<html> <!-- comment --> <head><title>Test</title></head><body></body></html>");
        assertEquals("Test", doc1.title());

        Document doc2 = parseHtmlWithErrors("<html><!DOCTYPE html><head></head><body></body></html>");
        assertNotNull(doc2);

        Document doc3 = parseHtmlWithErrors("<html><html lang='en'><head></head><body></body></html>");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<html></head><head><title>Test</title></head><body></body></html>");
        assertEquals("Test", doc4.title());

        Document doc5 = parseHtmlWithErrors("<html></div><head><title>Test</title></head><body></body></html>");
        assertEquals("Test", doc5.title());

        Document doc6 = parseHtml("<html><body>No head explicitly</body></html>");
        assertEquals("No head explicitly", doc6.body().text());
    }

    @Test
    public void testInHeadState_variousTokens_success() {
        String html = "<html><head>" +
                "<!-- head comment -->" +
                "<base href='http://example.com/base/' target='_blank'>" +
                "<basefont color='red'>" +
                "<bgsound src='sound.mp3'>" +
                "<command label='cmd'>" +
                "<link rel='stylesheet' href='style.css'>" +
                "<meta charset='utf-8'>" +
                "<title>Page Title</title>" +
                "<noframes><p>No frames</p></noframes>" +
                "<style>body { color: black; }</style>" +
                "<noscript><a href='http://example.com/'>noscript</a></noscript>" +
                "<script>var x = 1;</script>" +
                "</head><body></body></html>";

        Document doc = parseHtml(html);
        assertEquals("Page Title", doc.title());
        assertEquals("http://example.com/base/", doc.baseUri());
        assertEquals(1, doc.select("base").size());
        assertEquals(1, doc.select("meta").size());
        assertEquals(1, doc.select("style").size());
        assertEquals(1, doc.select("script").size());

        Document docErrors = parseHtmlWithErrors("<html><head><!DOCTYPE html><head></head><div>Body starts</div></head></html>");
        assertTrue(docErrors.body().text().contains("Body starts"));

        Document docEndTags = parseHtmlWithErrors("<html><head></head></body></html>");
        assertNotNull(docEndTags);

        Document docInvalidEndTag = parseHtmlWithErrors("<html><head></foo></head><body></body></html>");
        assertNotNull(docInvalidEndTag);
    }

    @Test
    public void testInHeadNoscriptState_variousTokens_success() {
        String html = "<html><head><noscript>" +
                "<!-- noscript comment -->" +
                "<link rel='stylesheet' href='ns.css'>" +
                "<meta http-equiv='refresh' content='30'>" +
                "<style>p { color: green; }</style>" +
                "</noscript></head><body></body></html>";
        Document doc = parseHtml(html);
        assertNotNull(doc);

        Document docErrors = parseHtmlWithErrors("<html><head><noscript><!DOCTYPE html><head></head><noscript></noscript></noscript></head></html>");
        assertNotNull(docErrors);

        Document docBr = parseHtmlWithErrors("<html><head><noscript><br></noscript></head></html>");
        assertNotNull(docBr);

        Document docOtherEnd = parseHtmlWithErrors("<html><head><noscript><div>Text</div></noscript></head></html>");
        assertNotNull(docOtherEnd);
    }

    @Test
    public void testAfterHeadState_variousTokens_success() {
        Document doc1 = parseHtml("<html><head></head> <!-- comment --> <body>Content</body></html>");
        assertEquals("Content", doc1.body().text());

        Document doc2 = parseHtmlWithErrors("<html><head></head><!DOCTYPE html><body>Content</body></html>");
        assertEquals("Content", doc2.body().text());

        Document doc3 = parseHtmlWithErrors("<html><head></head><html lang='en'><body>Content</body></html>");
        assertEquals("Content", doc3.body().text());

        Document doc4 = parseHtml("<html><head></head><frameset cols='50%,50%'><frame src='frame1.html'></frameset></html>");
        assertEquals(1, doc4.select("frameset").size());

        Document doc5 = parseHtmlWithErrors("<html><head></head><meta charset='utf-8'><title>AfterHead Title</title><body>Content</body></html>");
        assertEquals("Content", doc5.body().text());

        Document doc6 = parseHtmlWithErrors("<html><head></head><head><body>Content</body></html>");
        assertEquals("Content", doc6.body().text());

        Document doc7 = parseHtmlWithErrors("<html><head></head></body><body>Content</body></html>");
        assertEquals("Content", doc7.body().text());

        Document doc8 = parseHtmlWithErrors("<html><head></head></div<body>Content</body></html>");
        assertNotNull(doc8);
    }

    @Test
    public void testInBodyState_formattingAndAdoptionAgency_success() {
        Document doc1 = parseHtml("<p><b>Bold <i>BoldItalic</b> Italic</i> Normal</p>");
        assertEquals("Bold BoldItalic Italic Normal", doc1.text());

        Document doc2 = parseHtml("<a>1<b>2<table><tr><td>3</td></tr></table>4</b>5</a>");
        assertNotNull(doc2);

        Document doc3 = parseHtml("<a>1<a>2</a>3</a>");
        assertEquals(2, doc3.select("a").size());

        Document doc4 = parseHtml("<b>1<nobr>2<nobr>3</nobr>4</nobr>5</b>");
        assertNotNull(doc4);

        Document doc5 = parseHtml("<b><p>Nested block in format</p></b>");
        assertEquals("Nested block in format", doc5.select("p").first().text());

        Document doc6 = parseHtml("<table><b><tr><td>Foster format</td></tr></b></table>");
        assertTrue(doc6.body().text().contains("Foster format"));
    }

    @Test
    public void testInBodyState_specialTagsAndLists_success() {
        Document doc1 = parseHtml("<ul><li>Item 1<li>Item 2</ul><ol><li>Ordered 1<li>Ordered 2</ol>");
        assertEquals(4, doc1.select("li").size());

        Document doc2 = parseHtml("<dl><dt>Term 1<dd>Desc 1<dt>Term 2<dd>Desc 2</dl>");
        assertEquals(2, doc2.select("dt").size());
        assertEquals(2, doc2.select("dd").size());

        Document doc3 = parseHtml("<h1>Head 1<h2>Head 2<h3>Head 3<h4>Head 4<h5>Head 5<h6>Head 6</h6>");
        assertEquals(1, doc3.select("h1").size());
        assertEquals(1, doc3.select("h6").size());

        Document doc4 = parseHtml("<p>Paragraph 1<address>Address</address><p>Paragraph 2<div>Div</div>");
        assertEquals(2, doc4.select("p").size());
        assertEquals(1, doc4.select("address").size());
        assertEquals(1, doc4.select("div").size());

        Document doc5 = parseHtml("<form id='f1'><input name='i1'><form id='f2'><input name='i2'></form></form>");
        assertEquals(1, doc5.select("form").size());

        Document doc6 = parseHtml("<pre>Line 1\nLine 2</pre><listing>List 1\nList 2</listing>");
        assertEquals(1, doc6.select("pre").size());
        assertEquals(1, doc6.select("listing").size());
    }

    @Test
    public void testInBodyState_mediaFormsAndEmbeds_success() {
        String html = "<div>" +
                "<button>Button 1<button>Button 2</button></button>" +
                "<applet code='test'><param name='p' value='v'></applet>" +
                "<marquee>Scroll</marquee>" +
                "<object data='obj'><param name='p' value='1'></object>" +
                "<area shape='rect' coords='0,0,10,10'>" +
                "<br>" +
                "<embed src='embed.swf'>" +
                "<img src='img.png'>" +
                "<keygen name='kg'>" +
                "<wbr>" +
                "<input type='hidden' name='h' value='1'>" +
                "<input type='text' name='t' value='2'>" +
                "<hr>" +
                "<image src='image.png'>" +
                "<isindex prompt='search'>" +
                "<textarea>Textarea content</textarea>" +
                "<xmp><b>XMP Raw</b></xmp>" +
                "<iframe><p>IFrame</p></iframe>" +
                "<noembed>Noembed text</noembed>" +
                "<select><optgroup label='g'><option>Opt 1<option>Opt 2</optgroup></select>" +
                "<ruby>Base<rp>(</rp><rt>Ruby</rt><rp>)</rp></ruby>" +
                "<math><mrow><mi>x</mi></mrow></math>" +
                "<svg><circle cx='50' cy='50' r='40'/></svg>" +
                "</div>";

        Document doc = parseHtml(html);
        assertNotNull(doc);
        assertEquals(1, doc.select("textarea").size());
        assertEquals("Textarea content", doc.select("textarea").text());
        assertEquals(1, doc.select("select").size());
        assertEquals(2, doc.select("option").size());
        assertEquals(1, doc.select("ruby").size());
        assertEquals(1, doc.select("math").size());
        assertEquals(1, doc.select("svg").size());
    }

    @Test
    public void testInBodyState_endTags_success() {
        Document doc1 = parseHtmlWithErrors("<body></p><div></div></span></body>");
        assertNotNull(doc1);

        Document doc2 = parseHtmlWithErrors("<body></b><sarcasm>joke</sarcasm></body>");
        assertNotNull(doc2);

        Document doc3 = parseHtmlWithErrors("<body><br></br></body>");
        assertEquals(2, doc3.select("br").size());

        Document doc4 = parseHtmlWithErrors("<body></form></body>");
        assertNotNull(doc4);

        Document doc5 = parseHtmlWithErrors("<body></li></dt></dd></h1></body>");
        assertNotNull(doc5);

        Document doc6 = parseHtmlWithErrors("<body><applet></applet><marquee></marquee><object></object></body>");
        assertNotNull(doc6);
    }

    @Test
    public void testInBodyState_characterData_success() {
        Document doc1 = parseHtml("<body>Hello &nbsp; World!</body>");
        assertTrue(doc1.body().text().contains("Hello"));

        Document doc2 = parseHtmlWithErrors("<body>" + String.valueOf('\u0000') + "Null char</body>");
        assertNotNull(doc2);

        Document doc3 = parseHtml("<body><plaintext>Plain <b>text</b> only</body>");
        assertEquals(1, doc3.select("plaintext").size());
    }

    @Test
    public void testInTableState_normalAndEdgeCases_success() {
        String html = "<table>" +
                "<caption>Caption</caption>" +
                "<colgroup><col width='10'><col width='20'></colgroup>" +
                "<thead><tr><th>H1</th><th>H2</th></tr></thead>" +
                "<tbody><tr><td>D1</td><td>D2</td></tr></tbody>" +
                "<tfoot><tr><td>F1</td><td>F2</td></tr></tfoot>" +
                "</table>";

        Document doc = parseHtml(html);
        assertEquals("Caption", doc.select("caption").text());
        assertEquals(2, doc.select("col").size());
        assertEquals(1, doc.select("thead").size());
        assertEquals(1, doc.select("tbody").size());
        assertEquals(1, doc.select("tfoot").size());
        assertEquals(3, doc.select("tr").size());
        assertEquals(2, doc.select("th").size());
        assertEquals(4, doc.select("td").size());

        Document docCol = parseHtml("<table><col><tr><td>Cell</td></tr></table>");
        assertEquals(1, docCol.select("col").size());

        Document docDirectTd = parseHtml("<table><tr><td>1</td></tr><td>Direct TD</td></table>");
        assertTrue(docDirectTd.body().text().contains("Direct TD"));

        Document docNestedTable = parseHtml("<table><tr><td>Outer<table><tr><td>Inner</td></tr></table></td></tr></table>");
        assertEquals(2, docNestedTable.select("table").size());

        Document docTableScript = parseHtml("<table><script>var t = 1;</script><tr><td>Cell</td></tr></table>");
        assertEquals(1, docTableScript.select("script").size());

        Document docTableInput = parseHtml("<table><input type='hidden' name='h' value='1'><input type='text' name='t'><tr><td>Cell</td></tr></table>");
        assertEquals(2, docTableInput.select("input").size());

        Document docTableForm = parseHtml("<table><form id='f'><tr><td>Cell</td></tr></form></table>");
        assertNotNull(docTableForm);

        Document docErrors = parseHtmlWithErrors("<table><!DOCTYPE html><caption><!-- comment -->Cap</caption></table>");
        assertNotNull(docErrors);

        Document docEndTagErrors = parseHtmlWithErrors("<table></body></colgroup></td></tr></table>");
        assertNotNull(docEndTagErrors);
    }

    @Test
    public void testInTableTextState_fosterAndWhitespace_success() {
        Document doc1 = parseHtml("<table>   <tr><td>Cell</td></tr></table>");
        assertNotNull(doc1);

        Document doc2 = parseHtml("<table> Foster Text <tr><td>Cell</td></tr></table>");
        assertTrue(doc2.body().text().contains("Foster Text"));

        Document docNullChar = parseHtmlWithErrors("<table>" + String.valueOf('\u0000') + "<tr><td>Cell</td></tr></table>");
        assertNotNull(docNullChar);
    }

    @Test
    public void testInCaptionState_variousTokens_success() {
        Document doc1 = parseHtml("<table><caption>Table Caption <p>Paragraph</p></caption><tr><td>Cell</td></tr></table>");
        assertEquals("Table Caption Paragraph", doc1.select("caption").text());

        Document doc2 = parseHtmlWithErrors("<table><caption>Cap <tr><td>Next cell</td></tr></caption></table>");
        assertTrue(doc2.body().text().contains("Cap"));

        Document doc3 = parseHtmlWithErrors("<table><caption>Cap <table><tr><td>Nested</td></tr></table></caption></table>");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<table><caption>Cap </body></col></td></caption></table>");
        assertNotNull(doc4);
    }

    @Test
    public void testInColumnGroupState_variousTokens_success() {
        Document doc1 = parseHtml("<table><colgroup> <!-- comment --> <col class='c1'><col class='c2'></colgroup><tr><td>Cell</td></tr></table>");
        assertEquals(2, doc1.select("col").size());

        Document doc2 = parseHtmlWithErrors("<table><colgroup><!DOCTYPE html><html lang='en'><col></colgroup></table>");
        assertNotNull(doc2);

        Document doc3 = parseHtmlWithErrors("<table><colgroup><col><div>Content</div></colgroup></table>");
        assertTrue(doc3.body().text().contains("Content"));

        Document doc4 = parseHtmlWithErrors("<table><colgroup><col></invalid></colgroup></table>");
        assertNotNull(doc4);
    }

    @Test
    public void testInTableBodyState_variousTokens_success() {
        Document doc1 = parseHtml("<table><tbody><tr><td>Row 1</td></tr><tr><td>Row 2</td></tr></tbody></table>");
        assertEquals(2, doc1.select("tr").size());

        Document doc2 = parseHtmlWithErrors("<table><tbody><th>Header</th><td>Cell</td></tbody></table>");
        assertEquals(1, doc2.select("th").size());
        assertEquals(1, doc2.select("td").size());

        Document doc3 = parseHtml("<table><tbody><tr><td>Body 1</td></tr></tbody><tbody><tr><td>Body 2</td></tr></tbody></table>");
        assertEquals(2, doc3.select("tbody").size());

        Document doc4 = parseHtmlWithErrors("<table><tbody><tr><td>1</td></tr></col></body></tbody></table>");
        assertNotNull(doc4);
    }

    @Test
    public void testInRowState_variousTokens_success() {
        Document doc1 = parseHtml("<table><tr><th>Header</th><td>Data</td></tr></table>");
        assertEquals(1, doc1.select("th").size());
        assertEquals(1, doc1.select("td").size());

        Document doc2 = parseHtml("<table><tr><td>Row 1<tr><td>Row 2</table>");
        assertEquals(2, doc2.select("tr").size());

        Document doc3 = parseHtmlWithErrors("<table><tr><td>Data</td></tr></table>");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<table><tr><td>1</td></col></body></tr></table>");
        assertNotNull(doc4);
    }

    @Test
    public void testInCellState_variousTokens_success() {
        Document doc1 = parseHtml("<table><tr><td>Cell 1<td>Cell 2</td><th>Head 1<th>Head 2</th></tr></table>");
        assertEquals(2, doc1.select("td").size());
        assertEquals(2, doc1.select("th").size());

        Document doc2 = parseHtml("<table><tr><td>Cell with <p>Paragraph</p></td></tr></table>");
        assertEquals("Cell with Paragraph", doc2.select("td").text());

        Document doc3 = parseHtmlWithErrors("<table><tr><td>Cell</td></td></tr></table>");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<table><tr><td>Cell</col></body></td></tr></table>");
        assertNotNull(doc4);

        Document doc5 = parseHtml("<table><tr><td>Cell 1<tr><td>Cell 2</td></tr></table>");
        assertEquals(2, doc5.select("tr").size());
    }

    @Test
    public void testInSelectState_variousTokens_success() {
        String html = "<select>" +
                "<!-- select comment -->" +
                "<option value='1'>One</option>" +
                "<optgroup label='group'>" +
                "<option value='2'>Two</option>" +
                "</optgroup>" +
                "</select>";
        Document doc = parseHtml(html);
        assertEquals(2, doc.select("option").size());
        assertEquals(1, doc.select("optgroup").size());

        Document docScript = parseHtml("<select><script>var s = 1;</script><option>1</option></select>");
        assertEquals(1, docScript.select("script").size());

        Document docInput = parseHtmlWithErrors("<select><option>1<input type='text'><option>2</select>");
        assertNotNull(docInput);

        Document docNestedSelect = parseHtmlWithErrors("<select><option>1<select><option>2</select></select>");
        assertNotNull(docNestedSelect);

        Document docNullChar = parseHtmlWithErrors("<select>" + String.valueOf('\u0000') + "<option>1</option></select>");
        assertNotNull(docNullChar);

        Document docDoctype = parseHtmlWithErrors("<select><!DOCTYPE html><option>1</option></select>");
        assertNotNull(docDoctype);

        Document docOptgroupEnd = parseHtmlWithErrors("<select><optgroup><option>1</option></optgroup></optgroup></select>");
        assertNotNull(docOptgroupEnd);

        Document docOptionEnd = parseHtmlWithErrors("<select></option><option>1</option></select>");
        assertNotNull(docOptionEnd);

        Document docInvalidEnd = parseHtmlWithErrors("<select><option>1</invalid></select>");
        assertNotNull(docInvalidEnd);
    }

    @Test
    public void testInSelectInTableState_variousTokens_success() {
        Document doc1 = parseHtml("<table><tr><td><select><option>1</option><td>Next cell</td></tr></table>");
        assertNotNull(doc1);

        Document doc2 = parseHtml("<table><tr><td><select><option>1</option><tr><td>Next row</td></tr></table>");
        assertNotNull(doc2);

        Document doc3 = parseHtmlWithErrors("<table><tr><td><select><option>1</option></td></tr></table>");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<table><tr><td><select><option>1</option></tr></table>");
        assertNotNull(doc4);

        Document doc5 = parseHtmlWithErrors("<table><tr><td><select><option>1</option></table>");
        assertNotNull(doc5);
    }

    @Test
    public void testAfterBodyState_variousTokens_success() {
        Document doc1 = parseHtml("<html><head></head><body>Content</body><!-- comment after body --></html>");
        assertTrue(doc1.body().text().contains("Content"));

        Document doc2 = parseHtml("<html><head></head><body>Content</body>   </html>");
        assertTrue(doc2.body().text().contains("Content"));

        Document doc3 = parseHtmlWithErrors("<html><head></head><body>Content</body><!DOCTYPE html></html>");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<html><head></head><body>Content</body><html lang='en'></html>");
        assertNotNull(doc4);

        Document doc5 = parseHtmlWithErrors("<html><head></head><body>Content</body><div>Trailing div</div></html>");
        assertTrue(doc5.body().text().contains("Trailing div"));
    }

    @Test
    public void testInFramesetAndAfterFrameset_success() {
        String html = "<html><head><title>Frameset Test</title></head>" +
                "<!-- comment in frameset -->" +
                "<frameset rows='50%,50%'>" +
                "<frame src='frame1.html'>" +
                "<frame src='frame2.html'>" +
                "<noframes><p>No frames supported</p></noframes>" +
                "</frameset>" +
                "<!-- comment after frameset -->" +
                "</html>";

        Document doc = parseHtml(html);
        assertEquals("Frameset Test", doc.title());
        assertEquals(1, doc.select("frameset").size());
        assertEquals(2, doc.select("frame").size());

        Document docErrors = parseHtmlWithErrors("<html><frameset><!DOCTYPE html><html lang='en'><frame src='f.html'><div>Invalid</div></frameset></html>");
        assertNotNull(docErrors);

        Document docAfterFramesetErrors = parseHtmlWithErrors("<html><frameset><frame></frameset><!DOCTYPE html><noframes></noframes><div>Extra</div></html>");
        assertNotNull(docAfterFramesetErrors);
    }

    @Test
    public void testAfterAfterBodyAndAfterAfterFrameset_success() {
        Document doc1 = parseHtml("<html><head></head><body>Content</body></html><!-- trailing comment -->");
        assertNotNull(doc1);

        Document doc2 = parseHtmlWithErrors("<html><head></head><body>Content</body></html><!DOCTYPE html><div>More</div>");
        assertTrue(doc2.body().text().contains("More"));

        Document doc3 = parseHtml("<html><frameset><frame src='f.html'></frameset></html><!-- trailing comment -->");
        assertNotNull(doc3);

        Document doc4 = parseHtmlWithErrors("<html><frameset><frame src='f.html'></frameset></html><!DOCTYPE html><div>More frameset</div>");
        assertNotNull(doc4);
    }

    @Test
    public void testForeignContent_process() {
        TreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("<div></div>", "http://example.com/", new ParseErrorList(0, 0));
        Token.Character t = new Token.Character("test");
        boolean result = TreeBuilderState.ForeignContent.process(t, tb);
        assertTrue(result);
    }

    @Test
    public void testFragmentParsing_variousContexts_success() {
        Element divContext = new Element(Tag.valueOf("div"), "");
        List<Node> divNodes = parseFragment("<p>Fragment P</p><span>Fragment Span</span>", divContext);
        assertEquals(2, divNodes.size());

        Element tableContext = new Element(Tag.valueOf("table"), "");
        List<Node> tableNodes = parseFragment("<tr><td>Row</td></tr>", tableContext);
        assertEquals(1, tableNodes.size());

        Element tbodyContext = new Element(Tag.valueOf("tbody"), "");
        List<Node> tbodyNodes = parseFragment("<tr><td>Body Row</td></tr>", tbodyContext);
        assertEquals(1, tbodyNodes.size());

        Element trContext = new Element(Tag.valueOf("tr"), "");
        List<Node> trNodes = parseFragment("<td>Cell 1</td><td>Cell 2</td>", trContext);
        assertEquals(2, trNodes.size());

        Element selectContext = new Element(Tag.valueOf("select"), "");
        List<Node> selectNodes = parseFragment("<option>Opt 1</option><option>Opt 2</option>", selectContext);
        assertEquals(2, selectNodes.size());

        Element framesetContext = new Element(Tag.valueOf("frameset"), "");
        List<Node> framesetNodes = parseFragment("<frame src='test.html'>", framesetContext);
        assertEquals(1, framesetNodes.size());
    }

    @Test
    public void testHtmlTreeBuilder_helperEdgeCases_success() {
        Document doc1 = parseHtml("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html><body>Quirks test</body></html>");
        assertNotNull(doc1);

        Document doc2 = parseHtml("<ruby>Ruby text <rp>(</rp><rt>annotation</rt><rp>)</rp> extra</ruby>");
        assertEquals(1, doc2.select("ruby").size());

        Document doc3 = parseHtml("<table><tr><td><select><optgroup><option>1</option></optgroup></select></td></tr></table>");
        assertEquals(1, doc3.select("optgroup").size());

        Document doc4 = parseHtmlWithErrors("<body><p><b>Bold<p>Paragraph</b></p>");
        assertNotNull(doc4);

        Document doc5 = parseHtmlWithErrors("<body><a href='http://1'>One<a href='http://2'>Two</a>Three</a></body>");
        assertEquals(2, doc5.select("a").size());
    }
}
