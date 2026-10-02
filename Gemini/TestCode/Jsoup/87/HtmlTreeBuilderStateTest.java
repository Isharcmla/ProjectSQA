package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testEnumValues_andValueOf() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        Assert.assertNotNull(states);
        Assert.assertTrue(states.length > 0);

        HtmlTreeBuilderState initial = HtmlTreeBuilderState.valueOf("Initial");
        Assert.assertEquals(HtmlTreeBuilderState.Initial, initial);

        HtmlTreeBuilderState foreign = HtmlTreeBuilderState.valueOf("ForeignContent");
        Assert.assertEquals(HtmlTreeBuilderState.ForeignContent, foreign);
    }

    @Test
    public void testConstantsArrays_areSorted() {
        List<String[]> arrays = Arrays.asList(
            HtmlTreeBuilderState.Constants.InBodyStartToHead,
            HtmlTreeBuilderState.Constants.InBodyStartPClosers,
            HtmlTreeBuilderState.Constants.Headings,
            HtmlTreeBuilderState.Constants.InBodyStartPreListing,
            HtmlTreeBuilderState.Constants.InBodyStartLiBreakers,
            HtmlTreeBuilderState.Constants.DdDt,
            HtmlTreeBuilderState.Constants.Formatters,
            HtmlTreeBuilderState.Constants.InBodyStartApplets,
            HtmlTreeBuilderState.Constants.InBodyStartEmptyFormatters,
            HtmlTreeBuilderState.Constants.InBodyStartMedia,
            HtmlTreeBuilderState.Constants.InBodyStartInputAttribs,
            HtmlTreeBuilderState.Constants.InBodyStartOptions,
            HtmlTreeBuilderState.Constants.InBodyStartRuby,
            HtmlTreeBuilderState.Constants.InBodyStartDrop,
            HtmlTreeBuilderState.Constants.InBodyEndClosers,
            HtmlTreeBuilderState.Constants.InBodyEndAdoptionFormatters,
            HtmlTreeBuilderState.Constants.InBodyEndTableFosters,
            HtmlTreeBuilderState.Constants.InCellNames,
            HtmlTreeBuilderState.Constants.InCellBody,
            HtmlTreeBuilderState.Constants.InCellTable,
            HtmlTreeBuilderState.Constants.InCellCol
        );

        for (String[] array : arrays) {
            String[] copy = Arrays.copyOf(array, array.length);
            Arrays.sort(copy);
            Assert.assertArrayEquals("Array must be sorted for binary search", copy, array);
        }
    }

    @Test
    public void testInitialState_doctypeAndComments() {
        String html = "<!DOCTYPE html><!-- comment --><html><head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("html", doc.childNode(0).nodeName());
        Assert.assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());

        String quirksHtml = "<!DOCTYPE html foo \"bar\"><!-- comment --><html></html>";
        Document quirksDoc = Jsoup.parse(quirksHtml);
        Assert.assertNotNull(quirksDoc);
    }

    @Test
    public void testInitialState_whitespaceAndNoDoctype() {
        String html = "   \n\t  <div>No doctype</div>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("No doctype", doc.body().text());
    }

    @Test
    public void testBeforeHtmlState_variousTokens() {
        String html = "<!-- c1 -->\n\n<html id='1'><!-- c2 --></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("1", doc.select("html").attr("id"));

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<!DOCTYPE html><html></html>", "");
        Assert.assertEquals(0, parser.getErrors().size());

        parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<html><!DOCTYPE html></html>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        Document docEnd = Jsoup.parse("</head><body id='b'>Text</body>");
        Assert.assertEquals("b", docEnd.body().attr("id"));
        
        Document docEndElse = Jsoup.parse("</div><p>Para</p>");
        Assert.assertEquals("Para", docEndElse.select("p").text());
    }

    @Test
    public void testBeforeHeadAndInHeadStates() {
        String html = "<html><!-- c -->\n<head><title>Title</title><base href='http://example.com/'><basefont><bgsound><link rel='stylesheet'><meta charset='utf-8'><style>body{}</style><noscript>noscript</noscript><script>var x = 1;</script></head><body></body></html>";
        Document doc = Jsoup.parse(html, "http://fallback.com/");
        Assert.assertEquals("Title", doc.title());
        Assert.assertEquals("http://example.com/", doc.baseUri());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<html><head><!DOCTYPE html><head></head></head></html>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        Document docAutoHead = Jsoup.parse("<html><title>Auto Head</title><body></body></html>");
        Assert.assertEquals("Auto Head", docAutoHead.title());

        Document docEndHead = Jsoup.parse("<html></head><p>P</p></html>");
        Assert.assertEquals("P", docEndHead.select("p").text());

        Document docEndOther = Jsoup.parse("<html></title><p>P</p></html>");
        Assert.assertEquals("P", docEndOther.select("p").text());
    }

    @Test
    public void testInHeadNoscriptState() {
        String html = "<head><noscript><!-- c -->\n<link rel='stylesheet'><meta><style>div{}</style></noscript></head>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<head><noscript><!DOCTYPE html><head></head></noscript></head>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        Document docBr = Jsoup.parse("<head><noscript></br>text</noscript></head>");
        Assert.assertNotNull(docBr);

        Document docText = Jsoup.parse("<head><noscript>Plain text in noscript</noscript></head>");
        Assert.assertNotNull(docText);
    }

    @Test
    public void testAfterHeadState() {
        String html = "<html><head></head><!-- c -->\n<body class='main'><p>Hello</p></body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("main", doc.body().className());

        String framesetHtml = "<html><head></head><frameset cols='25%,*'><frame src='frame1.html'></frameset></html>";
        Document framesetDoc = Jsoup.parse(framesetHtml);
        Assert.assertNotNull(framesetDoc.select("frameset").first());

        Document docHeadTagInAfterHead = Jsoup.parse("<html><head></head><meta name='test'><body></body></html>");
        Assert.assertNotNull(docHeadTagInAfterHead.head().select("meta").first());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<html><head></head><!DOCTYPE html><head><body></body></html>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testInBody_formattingElementsAndAdoptionAgency() {
        String html = "<b>1<p>2<b>3</b>4</p>5</b>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("<p>2<b>3</b>4</p>", doc.body().select("p").outerHtml());

        String nestedA = "<a>1<a>2</a>3</a>";
        Document docA = Jsoup.parse(nestedA);
        Assert.assertEquals(2, docA.select("a").size());

        String spanHtml = "<span>span text</span>";
        Document docSpan = Jsoup.parse(spanHtml);
        Assert.assertEquals("span text", docSpan.select("span").text());

        String nobrHtml = "<nobr>1<nobr>2</nobr>3</nobr>";
        Document docNobr = Jsoup.parse(nobrHtml);
        Assert.assertNotNull(docNobr);

        String appletHtml = "<applet><param name='p' value='v'>fallback</applet>";
        Document docApplet = Jsoup.parse(appletHtml);
        Assert.assertNotNull(docApplet.select("applet").first());
    }

    @Test
    public void testInBody_listsAndParagraphsAndHeadings() {
        String html = "<p>para1<h1>heading 1<h2>heading 2</h2></h1><ul><li>item 1<li>item 2</ul><dl><dt>dt1<dd>dd1<dt>dt2<dd>dd2</dl>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(2, doc.select("li").size());
        Assert.assertEquals(2, doc.select("dt").size());
        Assert.assertEquals(2, doc.select("dd").size());
        Assert.assertEquals(1, doc.select("h1").size());
        Assert.assertEquals(1, doc.select("h2").size());

        String preHtml = "<pre>\nLine1\nLine2</pre><listing>\nListing1</listing>";
        Document docPre = Jsoup.parse(preHtml);
        Assert.assertEquals("Line1\nLine2", docPre.select("pre").text());
    }

    @Test
    public void testInBody_formsAndInputsAndButtons() {
        String html = "<form id='f1'><p><input type='text' name='q'><button>Submit</button><input type='hidden' name='h'></p></form><form id='f2'></form>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("#f1").first());

        String buttonHtml = "<button><button>nested</button></button>";
        Document docButton = Jsoup.parse(buttonHtml);
        Assert.assertEquals(2, docButton.select("button").size());

        String isindexHtml = "<isindex prompt='search' action='/search'>";
        Document docIsindex = Jsoup.parse(isindexHtml);
        Assert.assertNotNull(docIsindex.select("form").first());
        Assert.assertNotNull(docIsindex.select("input[name=isindex]").first());

        String isindexSimple = "<isindex>";
        Document docIsindexSimple = Jsoup.parse(isindexSimple);
        Assert.assertNotNull(docIsindexSimple.select("input[name=isindex]").first());
    }

    @Test
    public void testInBody_rawtextAndRcdataAndTags() {
        String html = "<textarea>\nContent</textarea><xmp><p>Raw</p></xmp><iframe><p>Frame</p></iframe><noembed><p>NoEmbed</p></noembed><plaintext>PlainText<b>NotBold</b>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("textarea").first());
        Assert.assertNotNull(doc.select("xmp").first());
        Assert.assertNotNull(doc.select("iframe").first());

        Document svgDoc = Jsoup.parse("<svg><image href='test.png'></svg><image src='test2.png'>");
        Assert.assertNotNull(svgDoc.select("img").first());
        Assert.assertNotNull(svgDoc.select("image").first());

        Document rubyDoc = Jsoup.parse("<ruby>漢 <rp>(</rp><rt>かん</rt><rp>)</rp></ruby>");
        Assert.assertNotNull(rubyDoc.select("ruby").first());

        Document mathDoc = Jsoup.parse("<math><mi>x</mi></math><hr><area><br><wbr><img src='a.jpg'>");
        Assert.assertNotNull(mathDoc.select("math").first());
        Assert.assertNotNull(mathDoc.select("hr").first());
    }

    @Test
    public void testInBody_nullCharacterAndBodyMerge() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<html><body class='a'><body class='b' data-x='1'>\0Hello</body></html>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        Document docHtml = Jsoup.parse("<html class='a'><html data-foo='bar'><body></body></html>");
        Assert.assertEquals("bar", docHtml.select("html").attr("data-foo"));

        Document docBodyEnd = Jsoup.parse("<body>Hello</body>Extra text after body");
        Assert.assertEquals("Hello Extra text after body", docBodyEnd.body().text());
    }

    @Test
    public void testInTable_allBranches() {
        String html = "<table>" +
                "<!-- c -->" +
                "<caption>Table caption</caption>" +
                "<colgroup><col width='10'><col width='20'></colgroup>" +
                "<thead><tr><th>H1</th><th>H2</th></tr></thead>" +
                "<tbody><tr><td>Cell 1</td><td>Cell 2</td></tr></tbody>" +
                "<tfoot><tr><td>F1</td><td>F2</td></tr></tfoot>" +
                "</table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Table caption", doc.select("caption").text());
        Assert.assertEquals(2, doc.select("col").size());
        Assert.assertEquals(1, doc.select("thead").size());
        Assert.assertEquals(1, doc.select("tbody").size());
        Assert.assertEquals(1, doc.select("tfoot").size());

        String fosterHtml = "<table>text<tr><td>cell</td></tr>more text<input type='text'></table>";
        Document fosterDoc = Jsoup.parse(fosterHtml);
        Assert.assertTrue(fosterDoc.body().text().contains("text"));

        String inputHidden = "<table><input type='hidden' name='token' value='123'><tr><td>1</td></tr></table>";
        Document inputDoc = Jsoup.parse(inputHidden);
        Assert.assertNotNull(inputDoc.select("input[type=hidden]").first());

        String tableInTable = "<table><tr><td><table><tr><td>Nested</td></tr></table></td></tr></table>";
        Document nestedDoc = Jsoup.parse(tableInTable);
        Assert.assertEquals(2, nestedDoc.select("table").size());

        String formInTable = "<table><form id='f'><tr><td>1</td></tr></form></table>";
        Document formDoc = Jsoup.parse(formInTable);
        Assert.assertNotNull(formDoc);

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<table><!DOCTYPE html><tr><td>1</td></tr></table>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<table></col></colgroup></body><tr><td>1</td></tr></table>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testInTableText_whitespaceAndNull() {
        String html = "<table>   <tr><td>1</td></tr> \0 </table>";
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = parser.parseInput(html, "");
        Assert.assertNotNull(doc);
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testInCaption_tagsAndErrors() {
        String html = "<table><caption>Caption text<tr><td>Next</td></tr></caption></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Caption text", doc.select("caption").text());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<table><caption>Caption</b></td></caption></table>", "");
        Assert.assertNotNull(parser);
    }

    @Test
    public void testInColumnGroup_tagsAndErrors() {
        String html = "<table><colgroup><!-- c -->\n<col id='1'></colgroup><colgroup><col id='2'></colgroup><tr><td>A</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(2, doc.select("col").size());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<table><colgroup><!DOCTYPE html><p>Colgroup err</p></colgroup></table>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        Document docFrag = Jsoup.parseBodyFragment("<colgroup><col></colgroup>");
        Assert.assertNotNull(docFrag);
    }

    @Test
    public void testInTableBody_andInRow_andInCell() {
        String html = "<table><tr><th>Head cell<td>Data cell</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(1, doc.select("th").size());
        Assert.assertEquals(1, doc.select("td").size());

        String missingTr = "<table><td>Cell without tr</td></table>";
        Document docMissing = Jsoup.parse(missingTr);
        Assert.assertEquals(1, docMissing.select("td").size());

        String implicitClosing = "<table><tr><td>Cell 1<td>Cell 2<tr><td>Row 2</td></tr></table>";
        Document docClosing = Jsoup.parse(implicitClosing);
        Assert.assertEquals(3, docClosing.select("td").size());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<table><tr></body></html></td></tr></table>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testInSelect_andInSelectInTable() {
        String html = "<select><option value='1'>Opt 1<option value='2'>Opt 2</optgroup><optgroup label='g'><option>Opt 3</optgroup></select>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(3, doc.select("option").size());
        Assert.assertEquals(1, doc.select("optgroup").size());

        String selectInTable = "<table><tr><td><select><option>1</option><tr><td>Next</td></tr></select></td></tr></table>";
        Document docTable = Jsoup.parse(selectInTable);
        Assert.assertNotNull(docTable.select("select").first());

        String selectKeygen = "<select><input><keygen><textarea></select>";
        Document docKeygen = Jsoup.parse(selectKeygen);
        Assert.assertNotNull(docKeygen);

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<select><!DOCTYPE html><select></select></select>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testFrameset_andAfterFrameset_andAfterAfterFrameset() {
        String html = "<html><frameset rows='50%,50%'><!-- c -->\n<frame src='f1.html'><noframes><p>Fallback</p></noframes><frameset cols='*'><frame src='f2.html'></frameset></frameset><!-- after --></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(2, doc.select("frame").size());
        Assert.assertEquals(2, doc.select("frameset").size());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<html><frameset><!DOCTYPE html><p>Invalid</p></frameset></html>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);

        Document docAfterAfter = Jsoup.parse("<html><frameset><frame src='f1.html'></frameset></html><!-- c -->\n<noframes></noframes>");
        Assert.assertNotNull(docAfterAfter);
    }

    @Test
    public void testAfterBody_andAfterAfterBody() {
        String html = "<html><head></head><body>Hello</body></html><!-- c -->\n<!-- c2 -->";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Hello", doc.body().text());

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<html><body>Hello</body></html><!DOCTYPE html><div>After text</div>", "");
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testForeignContentState_directProcessCall() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div></div>"), "", Parser.htmlParser());
        Token.Character charToken = new Token.Character().data("test");
        boolean result = HtmlTreeBuilderState.ForeignContent.process(charToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testTextState_directTokens() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("<div></div>"), "", Parser.htmlParser());
        tb.transition(HtmlTreeBuilderState.Text);

        Token.Character charToken = new Token.Character().data("data");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(charToken, tb));

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("script");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(endTag, tb));

        Token.EOF eofToken = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(eofToken, tb));
    }

    @Test
    public void testFragmentParsing_branches() {
        List<Element> nodes1 = Parser.parseFragment("<div><p>Paragraph</p></div>", new Element(Tag.valueOf("body"), ""), "");
        Assert.assertTrue(nodes1.size() > 0);

        List<Element> nodes2 = Parser.parseFragment("<tr><td>Cell</td></tr>", new Element(Tag.valueOf("table"), ""), "");
        Assert.assertTrue(nodes2.size() > 0);

        List<Element> nodes3 = Parser.parseFragment("<option>Option 1</option>", new Element(Tag.valueOf("select"), ""), "");
        Assert.assertTrue(nodes3.size() > 0);

        List<Element> nodes4 = Parser.parseFragment("<col width='10'>", new Element(Tag.valueOf("colgroup"), ""), "");
        Assert.assertTrue(nodes4.size() > 0);
    }
}
