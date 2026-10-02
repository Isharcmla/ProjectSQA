package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder createTreeBuilder(String html) {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(html), "http://example.com", ParseErrorList.tracking(100));
        return tb;
    }

    private HtmlTreeBuilder createTreeBuilder() {
        return createTreeBuilder("");
    }

    @Test
    public void testEnumValuesAndValueOf_normal_returnsAllConstants() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        Assert.assertNotNull(states);
        Assert.assertEquals(24, states.length);

        Assert.assertEquals(HtmlTreeBuilderState.Initial, HtmlTreeBuilderState.valueOf("Initial"));
        Assert.assertEquals(HtmlTreeBuilderState.ForeignContent, HtmlTreeBuilderState.valueOf("ForeignContent"));
    }

    @Test
    public void testInitialState_whitespaceAndCommentAndDoctype_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();

        Token.Character ws = new Token.Character("   \t\r\n\f");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("test comment");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        doctype.forceQuirks = true;
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(doctype, tb));
        Assert.assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialState_anythingElse_transitionsToBeforeHtmlAndReprocesses() {
        HtmlTreeBuilder tb = createTreeBuilder();
        Token.StartTag startTag = new Token.StartTag("div");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(startTag, tb));
        Assert.assertTrue(tb.onStack("div"));
    }

    @Test
    public void testBeforeHtmlState_variousTokens_transitionsAndErrors() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);

        Token.Doctype dt = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(dt, tb));

        Token.Comment comment = new Token.Comment();
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(comment, tb));

        Token.Character ws = new Token.Character("  \n");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(ws, tb));

        Token.StartTag htmlStart = new Token.StartTag("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlStart, tb));
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());

        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag invalidEnd = new Token.EndTag("div");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(invalidEnd, tb));

        Token.EndTag headEnd = new Token.EndTag("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(headEnd, tb));
    }

    @Test
    public void testBeforeHeadState_variousTokens_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(new Token.Doctype(), tb));

        Token.StartTag htmlStart = new Token.StartTag("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(htmlStart, tb));

        Token.EndTag invalidEnd = new Token.EndTag("span");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(invalidEnd, tb));

        Token.StartTag headStart = new Token.StartTag("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(headStart, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        Assert.assertNotNull(tb.getHeadElement());

        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag bodyEnd = new Token.EndTag("body");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(bodyEnd, tb));
    }

    @Test
    public void testInHeadState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Character(" \t"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(new Token.Doctype(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("html"), tb));

        Attributes baseAttr = new Attributes();
        baseAttr.put("href", "http://example.com/base");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("base", baseAttr), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("basefont"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("meta"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
        tb.transition(HtmlTreeBuilderState.InHead);

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("style"), tb));
        tb.transition(HtmlTreeBuilderState.InHead);

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
        tb.transition(HtmlTreeBuilderState.InHead);

        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("script"), tb));
        tb.transition(HtmlTreeBuilderState.InHead);

        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(new Token.StartTag("head"), tb));

        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(new Token.EndTag("div"), tb));

        Element headEl = new Element(Tag.valueOf("head"), "");
        tb.getStack().push(headEl);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());

        tb.transition(HtmlTreeBuilderState.InHead);
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(new Token.EndTag("body"), tb));
    }

    @Test
    public void testInHeadNoscriptState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("head"), ""));
        tb.getStack().push(new Element(Tag.valueOf("noscript"), ""));

        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("link"), tb));

        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.StartTag("head"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("span"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("noscript"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());

        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("br"), tb));
    }

    @Test
    public void testAfterHeadState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);

        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.Doctype(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("html"), tb));

        Element head = new Element(Tag.valueOf("head"), "");
        tb.setHeadElement(head);
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("meta"), tb));

        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("head"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("span"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("frameset"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());

        tb.transition(HtmlTreeBuilderState.AfterHead);
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("body"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());

        tb.transition(HtmlTreeBuilderState.AfterHead);
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.EndTag("body"), tb));
    }

    @Test
    public void testInBodyState_characterAndDoctype_handlesNullAndWhitespace() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("body"), ""));

        Token.Character nullChar = new Token.Character(String.valueOf('\u0000'));
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(nullChar, tb));

        Token.Character ws = new Token.Character("   ");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(ws, tb));

        Token.Character text = new Token.Character("hello");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(text, tb));

        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.Doctype(), tb));
    }

    @Test
    public void testInBodyState_startTags_coversAllBranches() {
        String html = "<!DOCTYPE html><html><body>" +
                "<h1>h1</h1><h2>h2</h2><h3>h3</h3><h4>h4</h4><h5>h5</h5><h6>h6</h6>" +
                "<pre>pre</pre><listing>listing</listing>" +
                "<form action='act'><input type='hidden'><input type='text'></form>" +
                "<form action='nested'></form>" + // nested form error
                "<ul><li>item1<li>item2</ul>" +
                "<dl><dt>dt1<dd>dd1</dl>" +
                "<button>btn</button><button>btn2</button>" +
                "<a href='1'>link1<a href='2'>link2</a></a>" +
                "<b>bold<i>italic</b></i>" +
                "<nobr>nobr1<nobr>nobr2</nobr></nobr>" +
                "<applet>app</applet><marquee>mar</marquee><object>obj</object>" +
                "<table><tr><td>cell</td></tr></table>" +
                "<area><br><embed><img><keygen><wbr>" +
                "<param><source><track><hr><image>" +
                "<isindex action='search' prompt='Search:' other='attr'>" +
                "<textarea>txt</textarea><xmp>raw</xmp><iframe>if</iframe><noembed>ne</noembed>" +
                "<select><option>1<optgroup label='g'><option>2</optgroup></select>" +
                "<ruby>ruby<rt>rt</rt><rp>rp</rp></ruby>" +
                "<math><mi>x</mi></math><svg><g></g></svg>" +
                "</body></html>";

        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
        Assert.assertNotNull(doc.select("body").first());
    }

    @Test
    public void testInBodyState_startTags_fragmentAndSpecialTags() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("body"), ""));

        Token.StartTag htmlTag = new Token.StartTag("html");
        htmlTag.getAttributes().put("class", "my-class");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(htmlTag, tb));
        Assert.assertEquals("my-class", tb.getStack().getFirst().attr("class"));

        Token.StartTag bodyTag = new Token.StartTag("body");
        bodyTag.getAttributes().put("id", "my-body");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(bodyTag, tb));
        Assert.assertEquals("my-body", tb.getStack().get(1).attr("id"));

        tb.framesetOk(false);
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.StartTag("frameset"), tb));

        tb.framesetOk(true);
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("frameset"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());

        tb.transition(HtmlTreeBuilderState.InBody);
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.StartTag("caption"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.StartTag("col"), tb));
    }

    @Test
    public void testInBodyState_endTags_coversAllBranches() {
        String html = "<p>para</p></li></dt></dd></form></span></sarcasm></br>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);

        HtmlTreeBuilder tb = createTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("body"), ""));

        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.EndTag("li"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.EndTag("dd"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.EndTag("h1"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.EndTag("applet"), tb));

        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(new Token.EndTag("br"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.EndTag("p"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(new Token.EndTag("body"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInBodyState_adoptionAgencyAlgorithm() {
        String complexAaa = "<b>1<p>2</b>3</p>";
        Document doc = Jsoup.parse(complexAaa);
        Assert.assertNotNull(doc);

        String tableAaa = "<b>1<table>2</b>3</table>";
        Document doc2 = Jsoup.parse(tableAaa);
        Assert.assertNotNull(doc2);
    }

    @Test
    public void testTextState_processesTokens() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("script"), ""));
        tb.transition(HtmlTreeBuilderState.Text);

        Assert.assertTrue(HtmlTreeBuilderState.Text.process(new Token.Character("var x = 1;"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(new Token.EndTag("script"), tb));

        tb.transition(HtmlTreeBuilderState.Text);
        tb.getStack().push(new Element(Tag.valueOf("style"), ""));
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(new Token.EOF(), tb));
    }

    @Test
    public void testInTableState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
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
        Attributes hiddenAttr = new Attributes();
        hiddenAttr.put("type", "hidden");
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("input", hiddenAttr), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("form"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(new Token.StartTag("form"), tb));

        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(new Token.EndTag("body"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(new Token.EndTag("tr"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.EndTag("table"), tb));

        tb.transition(HtmlTreeBuilderState.InTable);
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.EOF(), tb));
    }

    @Test
    public void testInTableTextState_handlesNullAndTextFosterParenting() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.transition(HtmlTreeBuilderState.InTable);

        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(new Token.Character("abc"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTableText, tb.state());

        Assert.assertFalse(HtmlTreeBuilderState.InTableText.process(new Token.Character(String.valueOf('\u0000')), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(new Token.StartTag("tr"), tb));
    }

    @Test
    public void testInCaptionState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.getStack().push(new Element(Tag.valueOf("caption"), ""));
        tb.transition(HtmlTreeBuilderState.InCaption);

        Assert.assertFalse(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("body"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InCaption.process(new Token.StartTag("tr"), tb));

        tb.getStack().push(new Element(Tag.valueOf("caption"), ""));
        tb.transition(HtmlTreeBuilderState.InCaption);
        Assert.assertTrue(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());

        Assert.assertFalse(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb));
    }

    @Test
    public void testInColumnGroupState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.getStack().push(new Element(Tag.valueOf("colgroup"), ""));
        tb.transition(HtmlTreeBuilderState.InColumnGroup);

        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("col"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("html"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.EndTag("colgroup"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());

        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.EOF(), tb));
    }

    @Test
    public void testInTableBodyState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.getStack().push(new Element(Tag.valueOf("tbody"), ""));
        tb.transition(HtmlTreeBuilderState.InTableBody);

        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("tr"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());

        tb.transition(HtmlTreeBuilderState.InTableBody);
        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("td"), tb));

        tb.transition(HtmlTreeBuilderState.InTableBody);
        Assert.assertFalse(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("td"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("tbody"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());

        tb.transition(HtmlTreeBuilderState.InTableBody);
        Assert.assertFalse(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("tbody"), tb));
    }

    @Test
    public void testInRowState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.getStack().push(new Element(Tag.valueOf("tbody"), ""));
        tb.getStack().push(new Element(Tag.valueOf("tr"), ""));
        tb.transition(HtmlTreeBuilderState.InRow);

        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.StartTag("td"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        tb.transition(HtmlTreeBuilderState.InRow);
        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.StartTag("caption"), tb));

        tb.getStack().push(new Element(Tag.valueOf("tr"), ""));
        tb.transition(HtmlTreeBuilderState.InRow);
        Assert.assertFalse(HtmlTreeBuilderState.InRow.process(new Token.EndTag("td"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(new Token.EndTag("tr"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInCellState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.getStack().push(new Element(Tag.valueOf("tbody"), ""));
        tb.getStack().push(new Element(Tag.valueOf("tr"), ""));
        tb.getStack().push(new Element(Tag.valueOf("td"), ""));
        tb.transition(HtmlTreeBuilderState.InCell);

        Assert.assertFalse(HtmlTreeBuilderState.InCell.process(new Token.EndTag("body"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(new Token.StartTag("tr"), tb));

        tb.getStack().push(new Element(Tag.valueOf("td"), ""));
        tb.transition(HtmlTreeBuilderState.InCell);
        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(new Token.EndTag("td"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());

        Assert.assertFalse(HtmlTreeBuilderState.InCell.process(new Token.EndTag("td"), tb));
    }

    @Test
    public void testInSelectState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("select"), ""));
        tb.transition(HtmlTreeBuilderState.InSelect);

        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(new Token.Character(String.valueOf('\u0000')), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.Character("opt"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(new Token.Doctype(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("optgroup"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("script"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("input"), tb));

        tb.getStack().push(new Element(Tag.valueOf("select"), ""));
        tb.transition(HtmlTreeBuilderState.InSelect);
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("optgroup"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("option"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("select"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("select"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EOF(), tb));
    }

    @Test
    public void testInSelectInTableState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("table"), ""));
        tb.getStack().push(new Element(Tag.valueOf("select"), ""));
        tb.transition(HtmlTreeBuilderState.InSelectInTable);

        Assert.assertTrue(HtmlTreeBuilderState.InSelectInTable.process(new Token.StartTag("tr"), tb));

        tb.getStack().push(new Element(Tag.valueOf("select"), ""));
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Assert.assertTrue(HtmlTreeBuilderState.InSelectInTable.process(new Token.EndTag("table"), tb));

        tb.getStack().push(new Element(Tag.valueOf("select"), ""));
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Assert.assertFalse(HtmlTreeBuilderState.InSelectInTable.process(new Token.EndTag("caption"), tb));
    }

    @Test
    public void testAfterBodyState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("body"), ""));
        tb.transition(HtmlTreeBuilderState.AfterBody);

        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterBody.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.StartTag("html"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.EOF(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.EndTag("html"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());

        tb.transition(HtmlTreeBuilderState.AfterBody);
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.StartTag("div"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInFramesetState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.getStack().push(new Element(Tag.valueOf("frameset"), ""));
        tb.transition(HtmlTreeBuilderState.InFrameset);

        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.Doctype(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("frameset"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("frame"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.StartTag("div"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.EndTag("frameset"), tb));
        tb.getStack().push(new Element(Tag.valueOf("frameset"), ""));
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.EOF(), tb));

        tb.getStack().clear();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(new Token.EndTag("frameset"), tb));
    }

    @Test
    public void testAfterFramesetState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.transition(HtmlTreeBuilderState.AfterFrameset);

        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.Comment(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.EOF(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterFrameset.process(new Token.StartTag("div"), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.EndTag("html"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterAfterBodyState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);

        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.EOF(), tb));

        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.StartTag("div"), tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterFramesetState_allBranches_processesCorrectly() {
        HtmlTreeBuilder tb = createTreeBuilder();
        tb.getStack().push(new Element(Tag.valueOf("html"), ""));
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);

        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Comment(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Doctype(), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Character(" "), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("html"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("noframes"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.EOF(), tb));
        Assert.assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.StartTag("div"), tb));
    }

    @Test
    public void testForeignContentState_process_returnsTrue() {
        HtmlTreeBuilder tb = createTreeBuilder();
        Assert.assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.Character("test"), tb));
        Assert.assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.EOF(), tb));
    }

    @Test
    public void testFullDocumentParsing_integratesStatesCorrectly() {
        String html = "<!DOCTYPE html>" +
                "<!-- doc comment -->" +
                "<html lang='en'>" +
                "<head>" +
                "<title>Test Title</title>" +
                "<base href='http://example.com/'>" +
                "<meta charset='utf-8'>" +
                "<link rel='stylesheet' href='style.css'>" +
                "<style>body { background: #fff; }</style>" +
                "<script>console.log('hi');</script>" +
                "<noscript><link rel='stylesheet' href='fallback.css'></noscript>" +
                "</head>" +
                "<body>" +
                "<!-- body comment -->" +
                "<p class='content'>Hello world! <a href='#'>Link</a></p>" +
                "<table>" +
                "<caption>Caption</caption>" +
                "<colgroup><col class='col1'></colgroup>" +
                "<thead><tr><th>Header</th></tr></thead>" +
                "<tbody><tr><td>Data</td></tr></tbody>" +
                "<tfoot><tr><td>Footer</td></tr></tfoot>" +
                "</table>" +
                "<select name='sel'><optgroup label='group'><option value='1'>One</option></optgroup></select>" +
                "<frameset><frame src='frame.html'></frameset>" +
                "</body>" +
                "</html>";

        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Test Title", doc.title());
        Assert.assertEquals("http://example.com/", doc.baseUri());
        Assert.assertEquals(1, doc.select("table").size());
        Assert.assertEquals(1, doc.select("p.content").size());
        Assert.assertEquals(1, doc.select("select").size());
    }
}
