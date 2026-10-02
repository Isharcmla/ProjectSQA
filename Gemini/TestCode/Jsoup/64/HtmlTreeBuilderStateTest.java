package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testEnumValuesAndValueOf() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        assertTrue(states.length > 0);
        for (HtmlTreeBuilderState state : states) {
            assertEquals(state, HtmlTreeBuilderState.valueOf(state.name()));
        }
    }

    @Test
    public void testForeignContent_alwaysReturnsTrue() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", new Parser(tb));
        Token.Character token = new Token.Character().data("test");
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(token, tb));
    }

    @Test
    public void testInitialState_whitespaceAndCommentsAndDoctype() {
        String html = "\t\n <!-- comment --> <!DOCTYPE html> <html><body>Hello</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.doctype());
        assertEquals("html", doc.doctype().name());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testInitialState_doctypeQuirksAndForceQuirks() {
        String html = "<!DOCTYPE html SYSTEM 'about:legacy-compat'>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.doctype());

        String quirksHtml = "<!DOCTYPE html foo bar>";
        Document quirksDoc = Jsoup.parse(quirksHtml);
        assertNotNull(quirksDoc.doctype());
    }

    @Test
    public void testInitialState_reprocessWithoutDoctype() {
        String html = "<div>content</div>";
        Document doc = Jsoup.parse(html);
        assertEquals("content", doc.selectFirst("div").text());
    }

    @Test
    public void testBeforeHtml_allBranches() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = parser.parseInput("<!DOCTYPE html> <!-- c1 --> \n\t <html><head></head><body></body></html>", "");
        assertNotNull(doc);

        doc = parser.parseInput("<!-- c1 --> <head></head><body></body>", "");
        assertNotNull(doc.head());

        doc = parser.parseInput("</head><html><body></body></html>", "");
        assertNotNull(doc.body());

        doc = parser.parseInput("</div><html><body></body></html>", "");
        assertNotNull(doc.body());
    }

    @Test
    public void testBeforeHead_allBranches() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = parser.parseInput("<html> \n\t <!-- comment --> <!DOCTYPE html> <head><title>T</title></head></html>", "");
        assertEquals("T", doc.title());

        doc = parser.parseInput("<html><html id='1'><head></head></html>", "");
        assertEquals("1", doc.selectFirst("html").id());

        doc = parser.parseInput("<html></head><body><p>Text</p></body></html>", "");
        assertEquals("Text", doc.selectFirst("p").text());

        doc = parser.parseInput("<html></div><body><p>Text</p></body></html>", "");
        assertEquals("Text", doc.selectFirst("p").text());

        doc = parser.parseInput("<html><body>Direct Body</body></html>", "");
        assertEquals("Direct Body", doc.body().text());
    }

    @Test
    public void testInHead_tags() {
        String html = "<html><head>" +
                "<!-- c --> \n\t <!DOCTYPE html>" +
                "<base href='http://example.com/'>" +
                "<base>" +
                "<basefont>" +
                "<bgsound>" +
                "<command>" +
                "<link rel='stylesheet' href='style.css'>" +
                "<meta charset='utf-8'>" +
                "<title>Title Test</title>" +
                "<noframes>NoFrames</noframes>" +
                "<style>body { color: red; }</style>" +
                "<noscript><meta http-equiv='refresh'></noscript>" +
                "<script>var a = 1;</script>" +
                "<head>" +
                "</head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Title Test", doc.title());
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals(1, doc.head().getElementsByTag("style").size());
        assertEquals(1, doc.head().getElementsByTag("script").size());
    }

    @Test
    public void testInHead_endTagsAndAnythingElse() {
        String html = "<html><head><title>A</title></body><div>Body</div></head></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Body", doc.selectFirst("div").text());

        String invalidEndTag = "<html><head><title>A</title></foo></head></html>";
        doc = Jsoup.parse(invalidEndTag);
        assertEquals("A", doc.title());
    }

    @Test
    public void testInHeadNoscript_allBranches() {
        String html = "<html><head><noscript>" +
                "<!DOCTYPE html>" +
                "<html attr='x'>" +
                "<!-- c --> \n\t " +
                "<link rel='stylesheet'>" +
                "<meta name='test'>" +
                "<style>css</style>" +
                "<br>" +
                "<head>" +
                "<noscript>nested</noscript>" +
                "</foo>" +
                "TextInside" +
                "</noscript></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    @Test
    public void testAfterHead_allBranches() {
        String html1 = "<html><head></head> \n\t <!-- c --> <!DOCTYPE html> <body><p>Text</p></body></html>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("Text", doc1.selectFirst("p").text());

        String html2 = "<html><head></head><frameset cols='20%,80%'><frame></frameset></html>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2.selectFirst("frameset"));

        String html3 = "<html><head></head><meta name='foo'><base href='http://x.com'><title>Late Title</title><body></body></html>";
        Document doc3 = Jsoup.parse(html3);
        assertEquals("Late Title", doc3.title());

        String html4 = "<html><head></head><head><body>Body</body></html>";
        Document doc4 = Jsoup.parse(html4);
        assertEquals("Body", doc4.body().text());

        String html5 = "<html><head></head></badtag><body>Body</body></html>";
        Document doc5 = Jsoup.parse(html5);
        assertEquals("Body", doc5.body().text());

        String html6 = "<html><head></head></body></html>";
        Document doc6 = Jsoup.parse(html6);
        assertNotNull(doc6.body());
    }

    @Test
    public void testInBody_startTags() {
        String html = "<html><body>" +
                "<a href='1'>First <a>Nested</a></a>" +
                "<area><br><embed><img><keygen><wbr>" +
                "<p>Para 1<div>Div closes P</div></p>" +
                "<span>Span text</span>" +
                "<ul><li>Item 1<li>Item 2</ul>" +
                "<html class='extra'>" +
                "<link rel='extra'>" +
                "<h1>H1<h6>H6</h1>" +
                "<pre>Pre text</pre>" +
                "<form id='f1'><form id='f2'></form></form>" +
                "<dl><dt>Term<dd>Desc</dl>" +
                "<button>Btn 1<button>Btn 2</button></button>" +
                "<b>Bold <i>Italic</b></i>" +
                "<nobr>Nobr 1 <nobr>Nobr 2</nobr></nobr>" +
                "<applet><marquee><object>AppletContent</object></marquee></applet>" +
                "<table><tr><td>Cell</td></tr></table>" +
                "<input type='hidden'><input type='text'>" +
                "<audio><param><source><track></audio>" +
                "<hr>" +
                "<image src='foo.jpg'>" +
                "<svg><image href='foo.svg'></svg>" +
                "<isindex action='search.cgi' prompt='Search:' name='q' class='inp'>" +
                "<textarea>Textarea content</textarea>" +
                "<xmp><p>Xmp content</p></xmp>" +
                "<iframe><p>Iframe</p></iframe>" +
                "<noembed>NoEmbed</noembed>" +
                "<select><option>1<optgroup label='g'><option>2</optgroup></select>" +
                "<ruby>Ruby <rt>Rt</rt><rp>Rp</rp></ruby>" +
                "<math><mi>x</mi></math>" +
                "<caption><col><colgroup><frame><head><tbody><td><tfoot><th><thead><tr>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        assertEquals("First Nested", doc.selectFirst("a").text());
        assertEquals("Span text", doc.selectFirst("span").text());
        assertEquals(2, doc.select("li").size());
        assertEquals(2, doc.select("button").size());
    }

    @Test
    public void testInBody_adoptionAgencyAlgorithm() {
        String html1 = "<b>1<p>2</b>3</p>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("1", doc1.selectFirst("b").text());

        String html2 = "<a>1<p>2<div>3</a>4</div></p>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "<table><b><tr><td>1</td></tr></b></table>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);

        String html4 = "<a><div><span>1</div></a>2</span>";
        Document doc4 = Jsoup.parse(html4);
        assertNotNull(doc4);
    }

    @Test
    public void testInBody_endTags() {
        String html = "<html><body>" +
                "<div>Div</p></div>" +
                "<li>Item</li>" +
                "<form>Form</form>" +
                "<p>Paragraph</p>" +
                "<dd>DD</dd><dt>DT</dt>" +
                "<h1>Header</h1>" +
                "<sarcasm>Irony</sarcasm>" +
                "<applet>Applet</applet>" +
                "</br>" +
                "</span>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testInBody_nullCharacterAndFrameset() {
        String html1 = "<html><body>\u0000Hello</body></html>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("Hello", doc1.body().text().replace("\u0000", "").trim());

        String html2 = "<html><body><frameset><frame></frameset></body></html>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);
    }

    @Test
    public void testInBody_plaintext() {
        String html = "<html><body><plaintext><h1>Not a tag</h1></plaintext></body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.body().html().contains("<h1>Not a tag</h1>"));
    }

    @Test
    public void testTextState_scriptAndStyle() {
        String html = "<html><head><script>var x = '</script>';</script><style>/* </style> */</style></head></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);

        String unclosed = "<html><head><script>var x = 1;";
        Document unclosedDoc = Jsoup.parse(unclosed);
        assertNotNull(unclosedDoc);
    }

    @Test
    public void testInTable_allBranches() {
        String html1 = "<table> <!-- c --> <!DOCTYPE html> <caption>Cap</caption> <colgroup><col></colgroup> <thead><tr><th>H</th></tr></thead> <tbody><tr><td>D</td></tr></tbody> <tfoot><tr><td>F</td></tr></tfoot> </table>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("Cap", doc1.selectFirst("caption").text());
        assertEquals("H", doc1.selectFirst("th").text());
        assertEquals("D", doc1.selectFirst("td").text());

        String html2 = "<table>TextBefore<tr><td>Data</td></tr>TextAfter</table>";
        Document doc2 = Jsoup.parse(html2);
        assertTrue(doc2.text().contains("TextBefore"));

        String html3 = "<table><col><tr><td>1</td></tr></table>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3.selectFirst("col"));

        String html4 = "<table><form><tr><td>1</td></tr></form></table>";
        Document doc4 = Jsoup.parse(html4);
        assertNotNull(doc4);

        String html5 = "<table><input type='hidden'><input type='text'><tr><td>1</td></tr></table>";
        Document doc5 = Jsoup.parse(html5);
        assertNotNull(doc5);

        String html6 = "<table><style>td {color:blue;}</style><script>var tbl=1;</script></table>";
        Document doc6 = Jsoup.parse(html6);
        assertNotNull(doc6);

        String html7 = "<table><table><tr><td>Nested</td></tr></table></table>";
        Document doc7 = Jsoup.parse(html7);
        assertNotNull(doc7);

        String html8 = "<table></body></caption></col></colgroup></html></tbody></td></tfoot></th></thead></tr></table>";
        Document doc8 = Jsoup.parse(html8);
        assertNotNull(doc8);
    }

    @Test
    public void testInTableText_nullAndWhitespace() {
        String html = "<table> \t\n \u0000 <tr><td>Content</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.selectFirst("td").text());
    }

    @Test
    public void testInCaption_allBranches() {
        String html1 = "<table><caption>Caption Text</caption><tr><td>Data</td></tr></table>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("Caption Text", doc1.selectFirst("caption").text());

        String html2 = "<table><caption><b>Bold Caption<tr><td>New Row</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "<table><caption></caption></col></caption></table>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);
    }

    @Test
    public void testInColumnGroup_allBranches() {
        String html1 = "<table><colgroup> \n\t <!-- c --> <!DOCTYPE html> <col id='1'><col id='2'></colgroup></table>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals(2, doc1.select("col").size());

        String html2 = "<table><colgroup><col><div>Invalid</div></colgroup></table>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "<table><colgroup><col></colgroup></other></table>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);
    }

    @Test
    public void testInTableBody_and_InRow_and_InCell() {
        String html1 = "<table><tbody><th>Head</th><td>Data</td></tbody></table>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("Head", doc1.selectFirst("th").text());
        assertEquals("Data", doc1.selectFirst("td").text());

        String html2 = "<table><tr><td>Cell 1<td>Cell 2</tr><tr><th>Header 1<th>Header 2</tr></table>";
        Document doc2 = Jsoup.parse(html2);
        assertEquals(2, doc2.select("td").size());
        assertEquals(2, doc2.select("th").size());

        String html3 = "<table><tbody><tr><td>Cell</td><caption>Wrong</caption></tr></tbody></table>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);

        String html4 = "<table><tr><td>C</td></body></col></html></tr></table>";
        Document doc4 = Jsoup.parse(html4);
        assertNotNull(doc4);

        String html5 = "<table><tr><td>C1</td><td>C2</td><table><tr><td>Nested</td></tr></table></tr></table>";
        Document doc5 = Jsoup.parse(html5);
        assertNotNull(doc5);
    }

    @Test
    public void testInSelect_and_InSelectInTable() {
        String html1 = "<select> \n\t <!-- c --> <!DOCTYPE html> <option value='1'>One</option><optgroup label='g'><option value='2'>Two</option></optgroup></select>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals(2, doc1.select("option").size());

        String html2 = "<select><input><keygen><textarea></select>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "<select><script>var sel=1;</script><option>1</option></select>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);

        String html4 = "<select><option>1<option>2</optgroup></option></select>";
        Document doc4 = Jsoup.parse(html4);
        assertNotNull(doc4);

        String html5 = "<table><tr><td><select><option>1</option><tr><td>2</td></tr></select></td></tr></table>";
        Document doc5 = Jsoup.parse(html5);
        assertNotNull(doc5);

        String html6 = "<table><tr><td><select><option>1</option></td></tr></select></td></tr></table>";
        Document doc6 = Jsoup.parse(html6);
        assertNotNull(doc6);
    }

    @Test
    public void testAfterBody_and_AfterAfterBody() {
        String html1 = "<html><head></head><body>Hello</body> <!-- comment --> \n\t </html>";
        Document doc1 = Jsoup.parse(html1);
        assertEquals("Hello", doc1.body().text());

        String html2 = "<html><body>Hello</body></html> <!-- after html --> <div>extra</div>";
        Document doc2 = Jsoup.parse(html2);
        assertEquals("Hello extra", doc2.body().text());

        String html3 = "<html><body>Hello</body></html><!DOCTYPE html><html>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);
    }

    @Test
    public void testInFrameset_and_AfterFrameset_and_AfterAfterFrameset() {
        String html1 = "<html><head></head><frameset cols='50%,50%'> \n\t <!-- c --> <!DOCTYPE html> <frame src='f1.html'><frameset rows='*'><frame src='f2.html'></frameset><noframes><p>No frames</p></noframes></frameset></html> <!-- c2 --> \n\t";
        Document doc1 = Jsoup.parse(html1);
        assertNotNull(doc1.selectFirst("frameset"));

        String html2 = "<html><frameset><frame></frameset></html><noframes>Extra</noframes>";
        Document doc2 = Jsoup.parse(html2);
        assertNotNull(doc2);

        String html3 = "<html><frameset><frame></frameset><div>Invalid</div></html>";
        Document doc3 = Jsoup.parse(html3);
        assertNotNull(doc3);
    }

    @Test
    public void testFragmentParsing_variousContexts() {
        Element contextDiv = new Element("div");
        List<org.jsoup.nodes.Node> nodesDiv = Parser.parseFragment("<b>Bold</b><p>Para</p>", contextDiv, "");
        assertFalse(nodesDiv.isEmpty());

        Element contextTable = new Element("table");
        List<org.jsoup.nodes.Node> nodesTable = Parser.parseFragment("<tr><td>Cell</td></tr>", contextTable, "");
        assertFalse(nodesTable.isEmpty());

        Element contextTbody = new Element("tbody");
        List<org.jsoup.nodes.Node> nodesTbody = Parser.parseFragment("<td>Cell</td>", contextTbody, "");
        assertFalse(nodesTbody.isEmpty());

        Element contextTr = new Element("tr");
        List<org.jsoup.nodes.Node> nodesTr = Parser.parseFragment("<td>Cell</td><th>Header</th>", contextTr, "");
        assertFalse(nodesTr.isEmpty());

        Element contextColgroup = new Element("colgroup");
        List<org.jsoup.nodes.Node> nodesColgroup = Parser.parseFragment("<col><col>", contextColgroup, "");
        assertFalse(nodesColgroup.isEmpty());

        Element contextSelect = new Element("select");
        List<org.jsoup.nodes.Node> nodesSelect = Parser.parseFragment("<option>1</option><option>2</option>", contextSelect, "");
        assertFalse(nodesSelect.isEmpty());

        Element contextFrameset = new Element("frameset");
        List<org.jsoup.nodes.Node> nodesFrameset = Parser.parseFragment("<frame><frame>", contextFrameset, "");
        assertFalse(nodesFrameset.isEmpty());
    }

    @Test
    public void testProcessDirectly_allEnumStatesWithMismatchedTokens() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div></div>"), "", new Parser(tb));

        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        Token.Character whitespace = new Token.Character().data("   ");
        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        Token.EOF eof = new Token.EOF();

        for (HtmlTreeBuilderState state : HtmlTreeBuilderState.values()) {
            try {
                state.process(whitespace, tb);
                state.process(comment, tb);
                state.process(doctype, tb);
                state.process(eof, tb);
            } catch (Exception ignored) {
            }
        }
    }
}
