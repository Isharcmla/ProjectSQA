package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    @Test
    public void testEnumValuesAndValueOf() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        Assert.assertNotNull(states);
        Assert.assertTrue(states.length > 0);

        for (HtmlTreeBuilderState state : states) {
            HtmlTreeBuilderState resolved = HtmlTreeBuilderState.valueOf(state.name());
            Assert.assertEquals(state, resolved);
        }
    }

    @Test
    public void testForeignContentProcess() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", new Parser(tb));
        Token.Character c = new Token.Character().data("test");
        boolean result = HtmlTreeBuilderState.ForeignContent.process(c, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testInitialStateVariants() {
        // Doctype with Quirks, Comments, Whitespace, and Standard Doctype
        String htmlQuirks = "<!DOCTYPE html PUBLIC \"-//W3O//DTD W3 HTML 3.0//EN//\"><html><body></body></html>";
        Document docQuirks = Jsoup.parse(htmlQuirks);
        Assert.assertEquals(Document.QuirksMode.quirks, docQuirks.quirksMode());

        String htmlComment = "<!-- comment in initial --> <!DOCTYPE html><html><body></body></html>";
        Document docComment = Jsoup.parse(htmlComment);
        Assert.assertNotNull(docComment.childNode(0));

        // No doctype, direct element to trigger re-process token
        String htmlNoDoctype = "<div>hello</div>";
        Document docNoDoctype = Jsoup.parse(htmlNoDoctype);
        Assert.assertEquals("hello", docNoDoctype.body().text());

        // Direct token testing for Initial state branches
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", new Parser(tb));

        Token.Character ws = new Token.Character().data("   \t\r\n");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(ws, tb));

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.forceQuirks = true;
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(doctype, tb));
    }

    @Test
    public void testBeforeHtmlStateVariants() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = parser.parseInput("<!DOCTYPE html> <!-- comment --> \n <html><body></body></html>", "");
        Assert.assertNotNull(doc);

        // BeforeHtml error on doctype & end tags
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.transition(HtmlTreeBuilderState.BeforeHtml);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(dt, tb));

        Token.EndTag endTagBad = new Token.EndTag();
        endTagBad.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(endTagBad, tb));

        Token.EndTag endTagAllowed = new Token.EndTag();
        endTagAllowed.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(endTagAllowed, tb));

        // Anything else branch
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        tb2.initialiseParse(new StringReader(""), "", parser);
        tb2.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag st = new Token.StartTag();
        st.name("div");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(st, tb2));
    }

    @Test
    public void testBeforeHeadStateVariants() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Whitespace and comments
        Token.Character ws = new Token.Character().data("  ");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment in before head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(comment, tb));

        // Doctype error
        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(dt, tb));

        // html start tag in BeforeHead
        Token.StartTag htmlStart = new Token.StartTag();
        htmlStart.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(htmlStart, tb));

        // end tag error vs allowed end tag
        Token.EndTag endBad = new Token.EndTag();
        endBad.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(endBad, tb));

        Token.EndTag endAllowed = new Token.EndTag();
        endAllowed.name("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(endAllowed, tb));

        // head start tag transition
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        tb2.initialiseParse(new StringReader(""), "", parser);
        tb2.processStartTag("html");
        tb2.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag headStart = new Token.StartTag();
        headStart.name("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(headStart, tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb2.state());
    }

    @Test
    public void testInHeadStateVariants() {
        String html = "<!DOCTYPE html><head>" +
                "<!-- c -->" +
                "<base href='http://example.com/'>" +
                "<basefont><bgsound><command><link rel='stylesheet'>" +
                "<meta charset='utf-8'>" +
                "<title>Test Title</title>" +
                "<noframes>noframes</noframes>" +
                "<style>body { color: red; }</style>" +
                "<noscript>noscript text</noscript>" +
                "<script>var x = 1;</script>" +
                "</head><body></body>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Test Title", doc.title());
        Assert.assertEquals("http://example.com/", doc.baseUri());

        // Direct token branches in InHead
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com/", parser);
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.transition(HtmlTreeBuilderState.InHead);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(dt, tb));

        Token.StartTag htmlStart = new Token.StartTag();
        htmlStart.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(htmlStart, tb));

        Token.StartTag headStart = new Token.StartTag();
        headStart.name("head");
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(headStart, tb));

        Token.EndTag badEnd = new Token.EndTag();
        badEnd.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(badEnd, tb));

        Token.EndTag bodyEnd = new Token.EndTag();
        bodyEnd.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(bodyEnd, tb));

        // base without href
        HtmlTreeBuilder tbBase = new HtmlTreeBuilder();
        tbBase.initialiseParse(new StringReader(""), "http://example.com/", parser);
        tbBase.processStartTag("html");
        tbBase.processStartTag("head");
        Token.StartTag baseNoHref = new Token.StartTag();
        baseNoHref.name("base");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(baseNoHref, tbBase));
    }

    @Test
    public void testInHeadNoscriptStateVariants() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("noscript");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(dt, tb));

        Token.StartTag htmlStart = new Token.StartTag();
        htmlStart.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(htmlStart, tb));

        Token.Character ws = new Token.Character().data("  ");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("test");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(comment, tb));

        Token.StartTag meta = new Token.StartTag();
        meta.name("meta");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(meta, tb));

        Token.EndTag br = new Token.EndTag();
        br.name("br");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(br, tb));

        Token.StartTag headStart = new Token.StartTag();
        headStart.name("head");
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(headStart, tb));

        Token.EndTag divEnd = new Token.EndTag();
        divEnd.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(divEnd, tb));

        Token.StartTag pStart = new Token.StartTag();
        pStart.name("p");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(pStart, tb));

        Token.EndTag noscriptEnd = new Token.EndTag();
        noscriptEnd.name("noscript");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(noscriptEnd, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterHeadStateVariants() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        tb.transition(HtmlTreeBuilderState.AfterHead);

        Token.Character ws = new Token.Character().data(" \n ");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(comment, tb));

        Token.Doctype dt = new Token.Doctype();
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(dt, tb));

        Token.StartTag htmlStart = new Token.StartTag();
        htmlStart.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(htmlStart, tb));

        Token.StartTag headStart = new Token.StartTag();
        headStart.name("head");
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(headStart, tb));

        Token.StartTag metaInAfterHead = new Token.StartTag();
        metaInAfterHead.name("meta");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(metaInAfterHead, tb));

        Token.EndTag badEnd = new Token.EndTag();
        badEnd.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(badEnd, tb));

        Token.EndTag bodyEnd = new Token.EndTag();
        bodyEnd.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(bodyEnd, tb));

        // frameset start in AfterHead
        HtmlTreeBuilder tbFrame = new HtmlTreeBuilder();
        tbFrame.initialiseParse(new StringReader(""), "", parser);
        tbFrame.processStartTag("html");
        tbFrame.processStartTag("head");
        tbFrame.processEndTag("head");
        tbFrame.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag framesetStart = new Token.StartTag();
        framesetStart.name("frameset");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(framesetStart, tbFrame));
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tbFrame.state());
    }

    @Test
    public void testInBodyAllStartTagsAndFormatting() {
        String html = "<!DOCTYPE html><html><head></head><body>" +
                "<a href='1'>First <a>Nested</a></a>" +
                "<span>Span</span>" +
                "<ul><li>Item 1<li>Item 2</ul>" +
                "<p>Para 1<h1>Heading 1</h1><h2>Heading 2</h2>" +
                "<pre>Preformatted</pre><listing>Listing</listing>" +
                "<form action='test'><input type='hidden' name='h'><input type='text' name='t'></form>" +
                "<dl><dt>Dt<dd>Dd</dl>" +
                "<plaintext>Plaintext text" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.select("a").size() >= 2);
        Assert.assertEquals(2, doc.select("li").size());
        Assert.assertEquals(1, doc.select("h1").size());
    }

    @Test
    public void testInBodySpecialTagsAndFormats() {
        String html = "<div>" +
                "<button>Button 1 <button>Button 2</button></button>" +
                "<b>Bold <i>Italic</b></i>" +
                "<nobr>Nobr 1 <nobr>Nobr 2</nobr></nobr>" +
                "<applet>Applet</applet><marquee>Marquee</marquee><object>Object</object>" +
                "<table><tr><td>Cell</td></tr></table>" +
                "<area><br><embed><img><keygen><wbr>" +
                "<param><source><track>" +
                "<hr>" +
                "<image src='foo.jpg'>" +
                "<isindex prompt='search' action='search.cgi'>" +
                "<textarea>Textarea</textarea>" +
                "<xmp><p>xmp</p></xmp>" +
                "<iframe></iframe>" +
                "<noembed>noembed</noembed>" +
                "<select><option>1<optgroup><option>2</option></optgroup></select>" +
                "<ruby>Ruby <rt>Rt</rt><rp>Rp</rp></ruby>" +
                "<math><mi>x</mi></math>" +
                "<svg><image href='svg.jpg'></image></svg>" +
                "</div>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.select("svg image").first());
        Assert.assertNotNull(doc.select("img").first());
    }

    @Test
    public void testInBodyAdoptionAgencyAlgorithm() {
        String html = "<b>1<p>2</b>3</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);

        String nestedFosters = "<table><b>1<tr><td>2</td></tr>3</b></table>";
        Document doc2 = Jsoup.parse(nestedFosters);
        Assert.assertNotNull(doc2);
    }

    @Test
    public void testInBodyAllEndTags() {
        String html = "<p>P</p><div>Div</div><li>Li</li><dd>Dd</dd><dt>Dt</dt>" +
                "<h1>H1</h1><h2>H2</h2><form>Form</form><sarcasm>Sarcasm</sarcasm>" +
                "<applet>App</applet><br/>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
    }

    @Test
    public void testInBodyNullCharacterAndFrameset() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.transition(HtmlTreeBuilderState.InBody);

        // Null character token
        Token.Character nullChar = new Token.Character().data("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(nullChar, tb));

        // Frameset when framesetOk is false vs true
        tb.framesetOk(false);
        Token.StartTag fsTag = new Token.StartTag();
        fsTag.name("frameset");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(fsTag, tb));

        // Form tag when form is already present
        tb.processStartTag("form");
        Token.StartTag formTag2 = new Token.StartTag();
        formTag2.name("form");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(formTag2, tb));

        // Drop tags in body
        Token.StartTag dropTag = new Token.StartTag();
        dropTag.name("caption");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(dropTag, tb));

        // End tags for elements not in scope
        Token.EndTag endP = new Token.EndTag();
        endP.name("p");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(endP, tb));

        Token.EndTag endForm = new Token.EndTag();
        endForm.name("form");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(endForm, tb));

        Token.EndTag endDd = new Token.EndTag();
        endDd.name("dd");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(endDd, tb));

        Token.EndTag endH = new Token.EndTag();
        endH.name("h1");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(endH, tb));

        Token.EndTag endLi = new Token.EndTag();
        endLi.name("li");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(endLi, tb));
    }

    @Test
    public void testTextStateVariants() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("script");
        tb.transition(HtmlTreeBuilderState.Text);

        Token.Character textChar = new Token.Character().data("console.log('hi');");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(textChar, tb));

        Token.EndTag scriptEnd = new Token.EndTag();
        scriptEnd.name("script");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(scriptEnd, tb));

        // EOF in text
        tb.processStartTag("style");
        tb.transition(HtmlTreeBuilderState.Text);
        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(eof, tb));
    }

    @Test
    public void testInTableStateVariants() {
        String html = "<table>" +
                "<!-- comment in table -->" +
                "<caption>Caption</caption>" +
                "<colgroup><col></colgroup>" +
                "<thead><tr><th>Header</th></tr></thead>" +
                "<tbody><tr><td>Data</td></tr></tbody>" +
                "<tfoot><tr><td>Foot</td></tr></tfoot>" +
                "<form><input type='hidden'></form>" +
                "<tr><td>Row</td></tr>" +
                "</table>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("table").first());
        Assert.assertEquals("Caption", doc.select("caption").text());

        // InTable direct tokens
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.transition(HtmlTreeBuilderState.InTable);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(dt, tb));

        Token.StartTag tableStart = new Token.StartTag();
        tableStart.name("table");
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(tableStart, tb));

        Token.EndTag badEnd = new Token.EndTag();
        badEnd.name("body");
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(badEnd, tb));

        Token.StartTag styleStart = new Token.StartTag();
        styleStart.name("style");
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(styleStart, tb));
    }

    @Test
    public void testInTableTextStateVariants() {
        String html = "<table>   hello   <tr><td>cell</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(doc.text().contains("hello"));

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.transition(HtmlTreeBuilderState.InTableText);

        Token.Character nullChar = new Token.Character().data("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InTableText.process(nullChar, tb));

        Token.Character validChar = new Token.Character().data("a");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(validChar, tb));

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("table");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(endTag, tb));
    }

    @Test
    public void testInCaptionAndColumnGroupStateVariants() {
        String html = "<table>" +
                "<caption>Caption Text <col></caption>" +
                "<colgroup> <!-- comment --> <col> text </colgroup>" +
                "<tr><td>Cell</td></tr>" +
                "</table>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);

        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("colgroup");
        tb.transition(HtmlTreeBuilderState.InColumnGroup);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(dt, tb));

        Token.StartTag htmlStart = new Token.StartTag();
        htmlStart.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(htmlStart, tb));

        Token.EndTag colgroupEnd = new Token.EndTag();
        colgroupEnd.name("colgroup");
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(colgroupEnd, tb));
    }

    @Test
    public void testInTableBodyRowCellStateVariants() {
        String html = "<table>" +
                "<tbody>" +
                "<tr>" +
                "<th>Header</th>" +
                "<td>Cell 1</td>" +
                "<td>Cell 2</td>" +
                "</tr>" +
                "</tbody>" +
                "</table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(1, doc.select("th").size());
        Assert.assertEquals(2, doc.select("td").size());

        // Error handling and missing tags in TableBody / Row / Cell
        String fragment = "<tr><td>1</td><td>2</tr>";
        List<org.jsoup.nodes.Node> nodes = Parser.parseFragment(fragment, doc.body(), "");
        Assert.assertFalse(nodes.isEmpty());
    }

    @Test
    public void testInSelectAndInSelectInTableStateVariants() {
        String html = "<select>" +
                "<!-- comment -->" +
                "<option>Option 1" +
                "<option>Option 2" +
                "<optgroup label='group'>" +
                "<option>Option 3</option>" +
                "</optgroup>" +
                "</select>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(3, doc.select("option").size());

        String tableSelect = "<table><tr><td><select><option>1</option></select></td></tr></table>";
        Document docTable = Jsoup.parse(tableSelect);
        Assert.assertNotNull(docTable.select("select").first());

        // Direct token tests for InSelect
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("select");
        tb.transition(HtmlTreeBuilderState.InSelect);

        Token.Character nullChar = new Token.Character().data("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(nullChar, tb));

        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(dt, tb));

        Token.StartTag selectStart = new Token.StartTag();
        selectStart.name("select");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(selectStart, tb));

        Token.StartTag inputStart = new Token.StartTag();
        inputStart.name("input");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(inputStart, tb));

        Token.EndTag badEnd = new Token.EndTag();
        badEnd.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(badEnd, tb));
    }

    @Test
    public void testAfterBodyAndFramesetStates() {
        String html = "<!DOCTYPE html><html><head></head><body>Hello</body><!-- comment --></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Hello", doc.body().text());

        String framesetHtml = "<!DOCTYPE html><html><head></head>" +
                "<frameset rows='50%,50%'>" +
                "<!-- comment -->" +
                "<frame src='frame1.html'>" +
                "<frame src='frame2.html'>" +
                "<noframes><p>No frames</p></noframes>" +
                "</frameset>" +
                "<!-- comment after frameset -->" +
                "</html>";
        Document docFrameset = Jsoup.parse(framesetHtml);
        Assert.assertEquals(2, docFrameset.select("frame").size());

        // Direct token testing for AfterBody, AfterAfterBody, AfterFrameset, AfterAfterFrameset
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", parser);
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processEndTag("body");
        tb.transition(HtmlTreeBuilderState.AfterBody);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.AfterBody.process(dt, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment after body");
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(comment, tb));

        Token.EndTag endHtml = new Token.EndTag();
        endHtml.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(endHtml, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());

        // AfterAfterBody
        Token.Character ws = new Token.Character().data("  ");
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(ws, tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(comment, tb));
        Token.StartTag divStart = new Token.StartTag();
        divStart.name("div");
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(divStart, tb));

        // AfterFrameset & AfterAfterFrameset
        HtmlTreeBuilder tbFrame = new HtmlTreeBuilder();
        tbFrame.initialiseParse(new StringReader(""), "", parser);
        tbFrame.processStartTag("html");
        tbFrame.transition(HtmlTreeBuilderState.AfterFrameset);

        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(dt, tbFrame));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(comment, tbFrame));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(endHtml, tbFrame));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tbFrame.state());

        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(comment, tbFrame));
        Token.StartTag noframes = new Token.StartTag();
        noframes.name("noframes");
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(noframes, tbFrame));
        Assert.assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(divStart, tbFrame));
    }
}
