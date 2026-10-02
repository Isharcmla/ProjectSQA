package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder createBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.tracking(100));
        return tb;
    }

    private HtmlTreeBuilder createFragmentBuilder(Element context) {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParseFragment(context, "http://example.com", ParseErrorList.tracking(100));
        return tb;
    }

    @Test
    public void testEnumValuesAndValueOf() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        Assert.assertNotNull(states);
        Assert.assertTrue(states.length > 0);
        Assert.assertEquals(HtmlTreeBuilderState.Initial, HtmlTreeBuilderState.valueOf("Initial"));
    }

    @Test
    public void testInitialState_whitespaceAndCommentAndDoctypeAndElse() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.Initial);

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("test comment");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        doctype.getName().append("html");
        doctype.forceQuirks = true;
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(doctype, tb));
        Assert.assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.transition(HtmlTreeBuilderState.Initial);
        Token.StartTag div = new Token.StartTag("div");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(div, tb2));
    }

    @Test
    public void testBeforeHtmlState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctype, tb));

        Token.Comment comment = new Token.Comment();
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(comment, tb));

        Token.Character ws = new Token.Character("\t \n");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(ws, tb));

        Token.EndTag badEndTag = new Token.EndTag("span");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(badEndTag, tb));

        Token.EndTag bodyEndTag = new Token.EndTag("body");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(bodyEndTag, tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag htmlStart = new Token.StartTag("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlStart, tb2));
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb2.state());

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag spanStart = new Token.StartTag("span");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(spanStart, tb3));
    }

    @Test
    public void testBeforeHeadState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        Token.Character ws = new Token.Character(" ");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(doctype, tb));

        Token.StartTag htmlStart = new Token.StartTag("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(htmlStart, tb));

        Token.EndTag badEnd = new Token.EndTag("div");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(badEnd, tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag headStart = new Token.StartTag("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(headStart, tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb2.state());

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag headEnd = new Token.EndTag("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(headEnd, tb3));

        HtmlTreeBuilder tb4 = createBuilder();
        tb4.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag bodyStart = new Token.StartTag("body");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(bodyStart, tb4));
    }

    @Test
    public void testInHeadState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("html"), tb));

        Attributes baseAttr = new Attributes();
        baseAttr.put("href", "http://example.com/base/");
        Token.StartTag baseTag = new Token.StartTag("base", baseAttr);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(baseTag, tb));

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("style"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("script"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(new Token.StartTag("head"), tb));

        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(new Token.EndTag("div"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.EndTag("br"), tb));

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInHeadNoscriptState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.StartTag("noscript"));
        Assert.assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("meta"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("br"), tb));

        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("head"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("div"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("noscript"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());

        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Character("some text"), tb));
    }

    @Test
    public void testAfterHeadState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.EndTag("head"));
        Assert.assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("html"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("meta"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("head"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("span"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.process(new Token.StartTag("html"));
        tb2.process(new Token.StartTag("head"));
        tb2.process(new Token.EndTag("head"));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("frameset"), tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb2.state());

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.process(new Token.StartTag("html"));
        tb3.process(new Token.StartTag("head"));
        tb3.process(new Token.EndTag("head"));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("body"), tb3));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb3.state());

        HtmlTreeBuilder tb4 = createBuilder();
        tb4.process(new Token.StartTag("html"));
        tb4.process(new Token.StartTag("head"));
        tb4.process(new Token.EndTag("head"));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("body"), tb4));
    }

    @Test
    public void testInBodyState_characterAndCommentsAndDoctype() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><head></head><body>", "http://example.com", ParseErrorList.tracking(100));

        Token.Character nullChar = new Token.Character("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(nullChar, tb));

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(ws, tb));

        Token.Character text = new Token.Character("Hello World");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(text, tb));

        Token.Comment comment = new Token.Comment();
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(doctype, tb));

        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(eof, tb));
    }

    @Test
    public void testInBodyState_startTagsComprehensive() {
        String html = "<!DOCTYPE html><html><head></head><body>" +
                "<meta charset='utf-8'/>" +
                "<body class='extra'>" +
                "<p>Paragraph</p>" +
                "<h1>Header 1</h1><h2>Header 2</h2>" +
                "<pre>Preformatted</pre>" +
                "<form action='test'><input type='text'/></form>" +
                "<form id='nestedForm'></form>" +
                "<ul><li>Item 1<li>Item 2</ul>" +
                "<dl><dt>Term<dd>Desc</dl>" +
                "<button>Click</button>" +
                "<a>Link 1<a>Link 2</a></a>" +
                "<b>Bold <i>Italic</b></i>" +
                "<nobr>Nobr 1<nobr>Nobr 2</nobr></nobr>" +
                "<applet>Applet</applet>" +
                "<table><tr><td>Cell</td></tr></table>" +
                "<hr/><img src='test.png'/><image src='test2.png'/>" +
                "<isindex prompt='search' action='search.php'/>" +
                "<textarea>Text</textarea>" +
                "<xmp>Raw</xmp><iframe>Frame</iframe><noembed>NoEmbed</noembed>" +
                "<select><option>1</option><optgroup label='g'><option>2</option></optgroup></select>" +
                "<ruby>Ruby<rp>(</rp><rt>rt</rt><rp>)</rp></ruby>" +
                "<math><mrow></mrow></math><svg><g></g></svg>" +
                "<caption>Ignored</caption>" +
                "<span>Span</span>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void testInBodyState_framesetStartTag() {
        Document doc = Jsoup.parse("<html><head></head><body><frameset><frame></frame></frameset></body></html>");
        Assert.assertNotNull(doc);
    }

    @Test
    public void testInBodyState_endTagsComprehensive() {
        String html = "<div>" +
                "<p>Text</p>" +
                "<form id='f'></form>" +
                "<ul><li>Item</li></ul>" +
                "<dl><dt>T</dt><dd>D</dd></dl>" +
                "<h1>Heading</h1>" +
                "<b>Formatted</b>" +
                "<sarcasm>Irony</sarcasm>" +
                "<applet>Content</applet>" +
                "<br/>" +
                "<span>Text</span>" +
                "</div>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);

        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><div>", "http://example.com", ParseErrorList.tracking(100));
        Token.EndTag bodyEnd = new Token.EndTag("body");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(bodyEnd, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><div>", "http://example.com", ParseErrorList.tracking(100));
        Token.EndTag htmlEnd = new Token.EndTag("html");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(htmlEnd, tb2));
    }

    @Test
    public void testInBodyState_adoptionAgencyAlgorithmComplex() {
        String html = "<b>1<p>2<b>3</b>4</p>5</b>" +
                "<a>1<p>2<div>3<p>4<a>5</a>6</p>7</div>8</p>9</a>" +
                "<table><b><p>1</p></b></table>" +
                "<b><hr></b>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
    }

    @Test
    public void testTextState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><head><script>", "http://example.com", ParseErrorList.tracking(100));
        tb.transition(HtmlTreeBuilderState.Text);

        Token.Character ch = new Token.Character("var a = 1;");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(ch, tb));

        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(eof, tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><head><script>", "http://example.com", ParseErrorList.tracking(100));
        tb2.transition(HtmlTreeBuilderState.Text);
        Token.EndTag endScript = new Token.EndTag("script");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(endScript, tb2));
    }

    @Test
    public void testInTableState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.Character("text"), tb));
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(new Token.Doctype(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("caption"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InCaption, tb.state());

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("colgroup"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("col"), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("tbody"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("tr"), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("style"), tb));

        Attributes hiddenInputAttr = new Attributes();
        hiddenInputAttr.put("type", "hidden");
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("input", hiddenInputAttr), tb));

        Attributes textInputAttr = new Attributes();
        textInputAttr.put("type", "text");
        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("input", textInputAttr), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("form"), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(new Token.EndTag("tr"), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.EndTag("table"), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.EOF(), tb));
    }

    @Test
    public void testInTableTextState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table>", "http://example.com", ParseErrorList.tracking(100));
        tb.transition(HtmlTreeBuilderState.InTableText);

        Token.Character nullChar = new Token.Character("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InTableText.process(nullChar, tb));

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(ws, tb));

        Token.Character text = new Token.Character("foster text");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(text, tb));

        Token.StartTag tr = new Token.StartTag("tr");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(tr, tb));
    }

    @Test
    public void testInCaptionState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table><caption>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InCaption, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InCaption.process(new Token.Character("Caption Text"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("body"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><table><caption>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InCaption.process(new Token.StartTag("tr"), tb2));

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><table><caption>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb3));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb3.state());
    }

    @Test
    public void testInColumnGroupState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table><colgroup>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("col"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><table><colgroup>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.EndTag("colgroup"), tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb2.state());

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><table><colgroup>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("tr"), tb3));
    }

    @Test
    public void testInTableBodyState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table><tbody>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("th"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><table><tbody>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("tr"), tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb2.state());

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><table><tbody>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("caption"), tb3));

        HtmlTreeBuilder tb4 = createBuilder();
        tb4.parse("<html><body><table><tbody>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertFalse(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("html"), tb4));

        HtmlTreeBuilder tb5 = createBuilder();
        tb5.parse("<html><body><table><tbody>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("tbody"), tb5));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb5.state());
    }

    @Test
    public void testInRowState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table><tbody><tr>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.StartTag("td"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><table><tbody><tr>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.StartTag("tr"), tb2));

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><table><tbody><tr>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertFalse(HtmlTreeBuilderState.InRow.process(new Token.EndTag("td"), tb3));

        HtmlTreeBuilder tb4 = createBuilder();
        tb4.parse("<html><body><table><tbody><tr>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.EndTag("tbody"), tb4));

        HtmlTreeBuilder tb5 = createBuilder();
        tb5.parse("<html><body><table><tbody><tr>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.EndTag("tr"), tb5));
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb5.state());
    }

    @Test
    public void testInCellState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table><tbody><tr><td>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(new Token.Character("data"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InCell.process(new Token.EndTag("body"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><table><tbody><tr><td>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(new Token.StartTag("tr"), tb2));

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><table><tbody><tr><td>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(new Token.EndTag("td"), tb3));
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb3.state());

        HtmlTreeBuilder tb4 = createBuilder();
        tb4.parse("<html><body><table><tbody><tr><td>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(new Token.EndTag("tr"), tb4));
    }

    @Test
    public void testInSelectState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><select>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InSelect, tb.state());

        Token.Character nullChar = new Token.Character("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(nullChar, tb));

        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.Character("Option Text"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("optgroup"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("script"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("input"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><select>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("select"), tb2));

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><select><optgroup><option>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("optgroup"), tb3));

        HtmlTreeBuilder tb4 = createBuilder();
        tb4.parse("<html><body><select><option>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("option"), tb4));

        HtmlTreeBuilder tb5 = createBuilder();
        tb5.parse("<html><body><select>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("select"), tb5));
        Assert.assertNotEquals(HtmlTreeBuilderState.InSelect, tb5.state());
    }

    @Test
    public void testInSelectInTableState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><body><table><tr><td><select>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InSelectInTable, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InSelectInTable.process(new Token.StartTag("option"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelectInTable.process(new Token.StartTag("tr"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><body><table><tr><td><select>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.InSelectInTable.process(new Token.EndTag("td"), tb2));

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><body><table><tr><td><select>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertFalse(HtmlTreeBuilderState.InSelectInTable.process(new Token.EndTag("caption"), tb3));
    }

    @Test
    public void testAfterBodyState_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><head></head><body></body>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterBody.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.EOF(), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><head></head><body></body>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.StartTag("div"), tb2));

        HtmlTreeBuilder tb3 = createBuilder();
        tb3.parse("<html><head></head><body></body>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.EndTag("html"), tb3));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb3.state());
    }

    @Test
    public void testInFramesetAndAfterFramesetStates_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><head></head><frameset>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("frame"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("frameset"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("div"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.EndTag("frameset"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.EndTag("frameset"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.EOF(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("p"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><head></head><frameset></frameset>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.EndTag("html"), tb2));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb2.state());
    }

    @Test
    public void testAfterAfterBodyAndAfterAfterFramesetStates_tokens() {
        HtmlTreeBuilder tb = createBuilder();
        tb.parse("<html><head></head><body></body></html>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());

        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.EOF(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.StartTag("div"), tb));

        HtmlTreeBuilder tb2 = createBuilder();
        tb2.parse("<html><head></head><frameset></frameset></html>", "http://example.com", ParseErrorList.tracking(100));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb2.state());

        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.EOF(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("div"), tb));
    }

    @Test
    public void testForeignContentState() {
        HtmlTreeBuilder tb = createBuilder();
        Assert.assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.Character("text"), tb));
    }

    @Test
    public void testFragmentParsingEdgeCases() {
        Element contextDiv = new Element(Tag.valueOf("div"), "http://example.com");
        List<org.jsoup.nodes.Node> nodes1 = Jsoup.parseBodyFragment("<tr><td>Cell</td></tr>", "http://example.com").body().childNodes();
        Assert.assertFalse(nodes1.isEmpty());

        Element contextSelect = new Element(Tag.valueOf("select"), "http://example.com");
        HtmlTreeBuilder tbSelect = createFragmentBuilder(contextSelect);
        Assert.assertTrue(tbSelect.isFragmentParsing());

        Element contextTable = new Element(Tag.valueOf("table"), "http://example.com");
        HtmlTreeBuilder tbTable = createFragmentBuilder(contextTable);
        Assert.assertTrue(tbTable.isFragmentParsing());
    }
}
