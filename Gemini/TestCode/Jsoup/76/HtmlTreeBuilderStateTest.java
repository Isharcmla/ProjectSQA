package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testConstantsArrays_areAllSortedAlphabetically_shouldPass() throws Exception {
        for (Field field : HtmlTreeBuilderState.Constants.class.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && field.getType().isArray()) {
                field.setAccessible(true);
                String[] array = (String[]) field.get(null);
                String[] copy = Arrays.copyOf(array, array.length);
                Arrays.sort(copy);
                Assert.assertArrayEquals("Array " + field.getName() + " is not sorted", copy, array);
            }
        }
    }

    @Test
    public void testEnumValuesAndValueOf_standardEnumMethods_shouldReturnCorrectValues() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        Assert.assertNotNull(states);
        Assert.assertTrue(states.length > 0);

        for (HtmlTreeBuilderState state : states) {
            HtmlTreeBuilderState resolved = HtmlTreeBuilderState.valueOf(state.name());
            Assert.assertEquals(state, resolved);
        }
    }

    @Test
    public void testForeignContent_process_returnsTrue() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", new Parser(tb));
        Token.Character token = new Token.Character().data("test");
        boolean result = HtmlTreeBuilderState.ForeignContent.process(token, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testInitialState_doctypeAndQuirks_parsedCorrectly() {
        Document doc1 = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        Assert.assertEquals(Document.QuirksMode.noQuirks, doc1.quirksMode());

        Document doc2 = Jsoup.parse("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">");
        Assert.assertNotNull(doc2.documentType());

        Document doc3 = Jsoup.parse("   <!-- comment before doctype -->\n<!DOCTYPE html SYSTEM \"about:legacy-compat\">");
        Assert.assertNotNull(doc3.documentType());

        Document doc4 = Jsoup.parse("Hello without doctype");
        Assert.assertEquals("Hello without doctype", doc4.body().text());
    }

    @Test
    public void testBeforeHtmlState_variousTokens_handledCorrectly() {
        Document doc1 = Jsoup.parse("<html><head></head><body></body></html>");
        Assert.assertEquals("html", doc1.child(0).nodeName());

        Document doc2 = Jsoup.parse("<!-- comment --> <html lang=\"en\"><body>text</body></html>");
        Assert.assertEquals("en", doc2.selectFirst("html").attr("lang"));

        Document doc3 = Jsoup.parse("</head></br><body>text</body>");
        Assert.assertEquals("text", doc3.body().text());

        Document doc4 = Jsoup.parse("</div><body>content</body>");
        Assert.assertEquals("content", doc4.body().text());
    }

    @Test
    public void testBeforeHeadState_variousTokens_handledCorrectly() {
        Document doc1 = Jsoup.parse("<html><!-- comment -->   <head><title>Test</title></head><body></body></html>");
        Assert.assertEquals("Test", doc1.title());

        Document doc2 = Jsoup.parse("<html><html><head></head><body></body></html>");
        Assert.assertNotNull(doc2.head());

        Document doc3 = Jsoup.parse("<html></head><body><p>Hello</p></body></html>");
        Assert.assertEquals("Hello", doc3.selectFirst("p").text());

        Document doc4 = Jsoup.parse("<html></div><body><p>Hello</p></body></html>");
        Assert.assertEquals("Hello", doc4.selectFirst("p").text());
    }

    @Test
    public void testInHeadState_elementsAndTransitions_handledCorrectly() {
        String html = "<html><head>" +
                "<!-- c -->" +
                "<base href=\"http://example.com/\">" +
                "<basefont>" +
                "<bgsound>" +
                "<link rel=\"stylesheet\" href=\"style.css\">" +
                "<meta charset=\"UTF-8\">" +
                "<title>Page Title</title>" +
                "<noframes>noframes content</noframes>" +
                "<style>body { color: red; }</style>" +
                "<noscript><meta http-equiv=\"refresh\"></noscript>" +
                "<script>var x = 1;</script>" +
                "<head>" +
                "</head><body></body></html>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Page Title", doc.title());
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertNotNull(doc.head().selectFirst("style"));
        Assert.assertNotNull(doc.head().selectFirst("script"));

        Document docEndTags = Jsoup.parse("<head></title></link></head>");
        Assert.assertNotNull(docEndTags.head());

        Document docHeadEndTags = Jsoup.parse("<head></body></br></html>");
        Assert.assertNotNull(docHeadEndTags.body());
    }

    @Test
    public void testInHeadNoscriptState_variousTokens_handledCorrectly() {
        String html = "<head><noscript><!-- comment --> <link rel=\"stylesheet\">" +
                "<meta charset=\"UTF-8\"><style>p{color:black;}</style><div>inside noscript</div></noscript></head>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.head());

        String html2 = "<head><noscript><head><noscript>nested</noscript></head></noscript></head>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.head());

        String html3 = "<head><noscript></br>text</noscript></head>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3);
    }

    @Test
    public void testAfterHeadState_variousTokens_handledCorrectly() {
        String html = "<html><head><title>Test</title></head>   <!-- c -->" +
                "<meta name=\"test\">" +
                "<frameset cols=\"20%,80%\"><frame src=\"left.html\"><frame src=\"right.html\"></frameset></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.selectFirst("frameset"));

        Document docBody = Jsoup.parse("<html><head></head><body class=\"main\"><p>Text</p></body></html>");
        Assert.assertEquals("main", docBody.body().className());

        Document docErrHead = Jsoup.parse("<html><head></head><head><body></body></html>");
        Assert.assertNotNull(docErrHead.body());

        Document docEnd = Jsoup.parse("<html><head></head></div><body>Hi</body></html>");
        Assert.assertEquals("Hi", docEnd.body().text());

        Document docEndHtml = Jsoup.parse("<html><head></head></html><body>Hi</body>");
        Assert.assertEquals("Hi", docEndHtml.body().text());
    }

    @Test
    public void testInBodyState_formattingElementsAndAdoptionAgency_handledCorrectly() {
        String adoptionHtml = "<b><p>Nested paragraph</b></p>";
        Document docAdoption = Jsoup.parse(adoptionHtml);
        Assert.assertEquals("<p><b>Nested paragraph</b></p>", docAdoption.body().html());

        String deepAdoption = "<a>1<b>2<table>3<a>4</a>5</table>6</b>7</a>";
        Document docDeep = Jsoup.parse(deepAdoption);
        Assert.assertNotNull(docDeep.body());

        String unclosedFormatting = "<b>bold <i>italic <b>bold again</b> still italic</i> only bold</b>";
        Document docUnclosed = Jsoup.parse(unclosedFormatting);
        Assert.assertNotNull(docUnclosed.body());

        String activeFormatting = "<a>a<a>b</a></a>";
        Document docActive = Jsoup.parse(activeFormatting);
        Assert.assertEquals("<a>a</a><a>b</a>", docActive.body().html());
    }

    @Test
    public void testInBodyState_tagsHandling_pClosersHeadingsListsForms() {
        String html = "<div><p>Paragraph" +
                "<h1>Heading 1</h1><h2>Heading 2</h2>" +
                "<pre>Preformatted</pre>" +
                "<listing>Listing text</listing>" +
                "<ul><li>Item 1<li>Item 2</ul>" +
                "<dl><dt>Term<dd>Definition</dl>" +
                "<form action=\"/submit\"><input type=\"text\" name=\"user\"><input type=\"hidden\" name=\"token\"></form>" +
                "<span>Span text</span>" +
                "<button>Button 1<button>Button 2</button></button>" +
                "<nobr>nobr <nobr>nested nobr</nobr></nobr>" +
                "<applet>applet content</applet>" +
                "<hr>" +
                "<image src=\"test.png\">" +
                "<textarea>\nTextarea content</textarea>" +
                "<xmp><p>xmp text</p></xmp>" +
                "<iframe>iframe text</iframe>" +
                "<noembed>noembed text</noembed>" +
                "<ruby>base<rt>rt</rt><rp>(</rp></ruby>" +
                "<math><mi>x</mi></math>" +
                "<svg><image href=\"test.svg\" /></svg>" +
                "</div>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals(1, doc.select("h1").size());
        Assert.assertEquals(2, doc.select("li").size());
        Assert.assertEquals(1, doc.select("dl").size());
        Assert.assertEquals(1, doc.select("form").size());
        Assert.assertEquals("test.png", doc.select("img").attr("src"));
        Assert.assertEquals("Textarea content", doc.selectFirst("textarea").text());
        Assert.assertNotNull(doc.selectFirst("svg image"));
    }

    @Test
    public void testInBodyState_isindexHandling_generatesFormAndPrompt() {
        String html = "<isindex action=\"/search\" prompt=\"Search here: \">";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.selectFirst("form"));
        Assert.assertNotNull(doc.selectFirst("input[name=isindex]"));
        Assert.assertTrue(doc.body().text().contains("Search here:"));
    }

    @Test
    public void testInBodyState_duplicateBodyAndHtmlAttributes_mergedCorrectly() {
        String html = "<html lang=\"en\"><body class=\"first\">" +
                "<html lang=\"fr\" id=\"mainHtml\"><body class=\"second\" id=\"mainBody\">" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("en", doc.selectFirst("html").attr("lang"));
        Assert.assertEquals("mainHtml", doc.selectFirst("html").attr("id"));
        Assert.assertEquals("first", doc.body().className());
        Assert.assertEquals("mainBody", doc.body().id());
    }

    @Test
    public void testInBodyState_framesetHandling_transitionsOrIgnored() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame src=\"a.html\"></frameset></html>");
        Assert.assertNotNull(doc.selectFirst("frameset"));

        Document docIgnored = Jsoup.parse("<p>Hello</p><frameset><frame src=\"a.html\"></frameset>");
        Assert.assertNull(docIgnored.selectFirst("frameset"));
    }

    @Test
    public void testInBodyState_endTagsHandling_variousBranches() {
        String html = "<div><p>para</p>" +
                "<h1>header</h1>" +
                "<form>form content</form>" +
                "<applet>applet</applet>" +
                "<s>strike</s>" +
                "<br>" +
                "</sarcasm>" +
                "</span>" +
                "</div>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.body());

        Document docMismatched = Jsoup.parse("<p>Hello</b></p></div></form>");
        Assert.assertNotNull(docMismatched.body());
    }

    @Test
    public void testInTableState_captionColgroupTbodyTrTd_parsedCorrectly() {
        String html = "<table>" +
                "<!-- table comment -->" +
                "<caption>Table Caption</caption>" +
                "<colgroup><col class=\"c1\"><col class=\"c2\"></colgroup>" +
                "<thead><tr><th>Header 1</th><th>Header 2</th></tr></thead>" +
                "<tbody><tr><td>Cell 1</td><td>Cell 2</td></tr></tbody>" +
                "<tfoot><tr><td>Foot 1</td><td>Foot 2</td></tr></tfoot>" +
                "</table>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Table Caption", doc.selectFirst("caption").text());
        Assert.assertEquals(2, doc.select("col").size());
        Assert.assertEquals(1, doc.select("thead").size());
        Assert.assertEquals(1, doc.select("tbody").size());
        Assert.assertEquals(1, doc.select("tfoot").size());
        Assert.assertEquals(3, doc.select("tr").size());
        Assert.assertEquals(2, doc.select("th").size());
        Assert.assertEquals(4, doc.select("td").size());
    }

    @Test
    public void testInTableState_fosterParentingAndMisplacedTags_handledCorrectly() {
        String html = "<table>" +
                "text outside cell" +
                "<input type=\"text\" name=\"user\">" +
                "<input type=\"hidden\" name=\"token\" value=\"123\">" +
                "<style>td { padding: 0; }</style>" +
                "<script>var t = 1;</script>" +
                "<form>misplaced form</form>" +
                "<tr><td>Valid Cell</td></tr>" +
                "</table>";

        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.selectFirst("table"));
        Assert.assertTrue(doc.body().text().contains("text outside cell"));
        Assert.assertNotNull(doc.selectFirst("input[type=hidden]"));
    }

    @Test
    public void testInTableState_tableEndTagsAndTransitions() {
        String html = "<table><tr><td>1</td></tr></table><p>After table</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.selectFirst("table"));
        Assert.assertEquals("After table", doc.selectFirst("p").text());

        Document docBadEnd = Jsoup.parse("<table><tbody></body></td></tr></tfoot></table>");
        Assert.assertNotNull(docBadEnd.selectFirst("table"));
    }

    @Test
    public void testInCaptionState_tagsAndTransitions_handledCorrectly() {
        String html = "<table><caption>Caption text <b>bold</b></caption><tr><td>Data</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Caption text bold", doc.selectFirst("caption").text());

        String html2 = "<table><caption>Misplaced start col<col></caption><tr><td>Data</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.selectFirst("caption"));
        Assert.assertNotNull(doc2.selectFirst("col"));
    }

    @Test
    public void testInColumnGroupState_tagsAndTransitions_handledCorrectly() {
        String html = "<table><colgroup> <!-- comment --> <col width=\"10\"><col width=\"20\"></colgroup><tr><td>Cell</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(2, doc.select("col").size());

        String html2 = "<table><colgroup><tr><td>Cell</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.selectFirst("colgroup"));
        Assert.assertNotNull(doc2.selectFirst("td"));
    }

    @Test
    public void testInTableBodyAndInRowAndInCell_stateTransitions_handledCorrectly() {
        String html = "<table>" +
                "<tr>" +
                "<td>Cell 1</td>" +
                "<th>Header 1</th>" +
                "</tr>" +
                "<tr>" +
                "<td><select><option>Opt 1</option><option>Opt 2</option></select></td>" +
                "</tr>" +
                "</table>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals(1, doc.select("th").size());
        Assert.assertEquals(2, doc.select("td").size());
        Assert.assertEquals(2, doc.select("option").size());

        String missingTr = "<table><tbody><td>Auto TR cell</td></tbody></table>";
        Document docMissingTr = Jsoup.parse(missingTr);
        Assert.assertNotNull(docMissingTr.selectFirst("tr td"));

        String misplacedTags = "<table><tbody><caption>Wrong caption</caption></tbody></table>";
        Document docMisplaced = Jsoup.parse(misplacedTags);
        Assert.assertNotNull(docMisplaced.selectFirst("caption"));
    }

    @Test
    public void testInSelectAndInSelectInTable_stateTransitions_handledCorrectly() {
        String html = "<select>" +
                "<!-- c -->" +
                "<optgroup label=\"group1\">" +
                "<option value=\"1\">Option 1</option>" +
                "<option value=\"2\">Option 2</option>" +
                "</optgroup>" +
                "<option value=\"3\">Option 3</option>" +
                "</select>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals(1, doc.select("optgroup").size());
        Assert.assertEquals(3, doc.select("option").size());

        String selectInTable = "<table><tr><td>" +
                "<select><option>1</option><tr><td>Next Cell</td></tr></select>" +
                "</td></tr></table>";
        Document docTable = Jsoup.parse(selectInTable);
        Assert.assertEquals(2, docTable.select("td").size());

        String selectWithTags = "<select><input><textarea><keygen><script>var a = 1;</script></select>";
        Document docTags = Jsoup.parse(selectWithTags);
        Assert.assertNotNull(docTags.selectFirst("select"));
    }

    @Test
    public void testAfterBodyAndAfterAfterBodyStates_handledCorrectly() {
        String html = "<html><head></head><body>Hello</body><!-- comment after body -->\n\n</html><!-- comment after html -->";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Hello", doc.body().text());

        String trailingContent = "<html><body>Hi</body></html><p>After html</p>";
        Document docTrailing = Jsoup.parse(trailingContent);
        Assert.assertEquals("Hi After html", docTrailing.body().text());
    }

    @Test
    public void testFramesetStates_InFramesetAndAfterFrameset_handledCorrectly() {
        String html = "<html><head><title>Frameset</title></head>" +
                "<frameset rows=\"50%,50%\">" +
                "<!-- comment -->" +
                "<frame src=\"frame1.html\">" +
                "<frame src=\"frame2.html\">" +
                "<noframes><p>No frames</p></noframes>" +
                "</frameset>" +
                "<!-- comment after frameset -->" +
                "</html>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals(2, doc.select("frame").size());
        Assert.assertNotNull(doc.selectFirst("noframes"));

        String trailingFrameset = "<html><frameset><frame></frameset></html><noframes><p>After</p></noframes>";
        Document docTrailing = Jsoup.parse(trailingFrameset);
        Assert.assertNotNull(docTrailing.selectFirst("frameset"));
    }

    @Test
    public void testFragmentParsing_variousContexts_handledCorrectly() {
        List<Element> trFrag = Jsoup.parseBodyFragment("<td>Cell 1</td><td>Cell 2</td>").select("td");
        Assert.assertEquals(2, trFrag.size());

        List<Element> options = Parser.parseXmlFragment("<option>1</option><option>2</option>", "http://example.com/");
        Assert.assertEquals(2, options.size());

        Element table = new Element(Tag.valueOf("table"), "");
        List<Element> tableFrag = Parser.parseFragment("<tr><td>Data</td></tr>", table, "http://example.com/");
        Assert.assertFalse(tableFrag.isEmpty());

        Element select = new Element(Tag.valueOf("select"), "");
        List<Element> selectFrag = Parser.parseFragment("<option>Item 1</option>", select, "http://example.com/");
        Assert.assertEquals(1, selectFrag.size());
    }

    @Test
    public void testDirectStateProcessing_nullCharactersAndEdgeCases_returnsExpectedResults() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", new Parser(tb));

        Token.Character nullChar = new Token.Character().data("\u0000");
        boolean inBodyNullResult = HtmlTreeBuilderState.InBody.process(nullChar, tb);
        Assert.assertFalse(inBodyNullResult);

        boolean inSelectNullResult = HtmlTreeBuilderState.InSelect.process(nullChar, tb);
        Assert.assertFalse(inSelectNullResult);

        boolean inTableTextNullResult = HtmlTreeBuilderState.InTableText.process(nullChar, tb);
        Assert.assertFalse(inTableTextNullResult);

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        boolean inTableDoctype = HtmlTreeBuilderState.InTable.process(doctype, tb);
        Assert.assertFalse(inTableDoctype);

        boolean inHeadDoctype = HtmlTreeBuilderState.InHead.process(doctype, tb);
        Assert.assertFalse(inHeadDoctype);
    }
}
