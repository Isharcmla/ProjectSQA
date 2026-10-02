package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder createBuilder(String html) {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new java.io.StringReader(html), "http://example.com", Parser.htmlParser());
        return tb;
    }

    @Test
    public void testEnumValuesAndValueOf() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        Assert.assertTrue(states.length > 0);
        Assert.assertEquals(HtmlTreeBuilderState.Initial, HtmlTreeBuilderState.valueOf("Initial"));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, HtmlTreeBuilderState.valueOf("InBody"));
        Assert.assertEquals(HtmlTreeBuilderState.ForeignContent, HtmlTreeBuilderState.valueOf("ForeignContent"));
    }

    @Test
    public void testForeignContent_process_alwaysReturnsTrue() {
        HtmlTreeBuilder tb = createBuilder("");
        Token.Character token = new Token.Character().data("test");
        boolean result = HtmlTreeBuilderState.ForeignContent.process(token, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testInitialState_whitespaceAndCommentAndDoctype() {
        HtmlTreeBuilder tb = createBuilder("");
        
        // Whitespace token
        Token.Character ws = new Token.Character().data("   \t\n");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(ws, tb));

        // Comment token
        Token.Comment comment = new Token.Comment();
        comment.getData().append("hello comment");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(comment, tb));

        // Doctype token with force quirks
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.forceQuirks = true;
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(doctype, tb));
        Assert.assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());

        // Reprocess token transition to BeforeHtml
        HtmlTreeBuilder tb2 = createBuilder("");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        Assert.assertTrue(HtmlTreeBuilderState.Initial.process(startTag, tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb2.state());
    }

    @Test
    public void testBeforeHtmlState_tokens() {
        HtmlTreeBuilder tb = createBuilder("");
        tb.transition(HtmlTreeBuilderState.BeforeHtml);

        // Doctype -> error and false
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctype, tb));

        // Comment
        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(comment, tb));

        // Whitespace
        Token.Character ws = new Token.Character().data("  ");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(ws, tb));

        // StartTag html
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(htmlTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());

        // EndTag in head/body/html/br
        HtmlTreeBuilder tb2 = createBuilder("");
        tb2.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endHead = new Token.EndTag();
        endHead.name("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHtml.process(endHead, tb2));

        // Other EndTag -> error and false
        HtmlTreeBuilder tb3 = createBuilder("");
        tb3.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endDiv = new Token.EndTag();
        endDiv.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHtml.process(endDiv, tb3));
    }

    @Test
    public void testBeforeHeadState_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html>");
        tb.processStartTag("html");
        tb.transition(HtmlTreeBuilderState.BeforeHead);

        // Whitespace
        Token.Character ws = new Token.Character().data(" \n");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(ws, tb));

        // Comment
        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(comment, tb));

        // Doctype -> false
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(doctype, tb));

        // StartTag html
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(htmlTag, tb));

        // StartTag head
        Token.StartTag headTag = new Token.StartTag();
        headTag.name("head");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(headTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());

        // EndTag in head/body/html/br
        HtmlTreeBuilder tb2 = createBuilder("<html>");
        tb2.processStartTag("html");
        tb2.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(endBody, tb2));

        // Other EndTag -> false
        HtmlTreeBuilder tb3 = createBuilder("<html>");
        tb3.processStartTag("html");
        tb3.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endSpan = new Token.EndTag();
        endSpan.name("span");
        Assert.assertFalse(HtmlTreeBuilderState.BeforeHead.process(endSpan, tb3));

        // Anything else -> start tag div
        HtmlTreeBuilder tb4 = createBuilder("<html>");
        tb4.processStartTag("html");
        tb4.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag divTag = new Token.StartTag();
        divTag.name("div");
        Assert.assertTrue(HtmlTreeBuilderState.BeforeHead.process(divTag, tb4));
    }

    @Test
    public void testInHeadState_tags() {
        HtmlTreeBuilder tb = createBuilder("<html><head>");
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.transition(HtmlTreeBuilderState.InHead);

        // Whitespace
        Token.Character ws = new Token.Character().data(" ");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(ws, tb));

        // Comment
        Token.Comment comment = new Token.Comment();
        comment.getData().append("head comment");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(comment, tb));

        // Doctype
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(doctype, tb));

        // Base with href
        Token.StartTag baseTag = new Token.StartTag();
        baseTag.name("base");
        baseTag.attributes.put("href", "http://example.com/base/");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(baseTag, tb));

        // Meta
        Token.StartTag metaTag = new Token.StartTag();
        metaTag.name("meta");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(metaTag, tb));

        // Title
        Token.StartTag titleTag = new Token.StartTag();
        titleTag.name("title");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(titleTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
        tb.transition(HtmlTreeBuilderState.InHead);

        // Style / noframes
        Token.StartTag styleTag = new Token.StartTag();
        styleTag.name("style");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(styleTag, tb));
        tb.transition(HtmlTreeBuilderState.InHead);

        // Noscript
        Token.StartTag noscriptTag = new Token.StartTag();
        noscriptTag.name("noscript");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(noscriptTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
        tb.transition(HtmlTreeBuilderState.InHead);

        // Script
        Token.StartTag scriptTag = new Token.StartTag();
        scriptTag.name("script");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(scriptTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.Text, tb.state());
        tb.transition(HtmlTreeBuilderState.InHead);

        // Head start tag -> error false
        Token.StartTag headTag = new Token.StartTag();
        headTag.name("head");
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(headTag, tb));

        // EndTag head
        Token.EndTag endHead = new Token.EndTag();
        endHead.name("head");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(endHead, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());

        // InHead with invalid end tag
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag endDiv = new Token.EndTag();
        endDiv.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.InHead.process(endDiv, tb));

        // InHead with endTag body/html/br
        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.InHead.process(endBody, tb));
    }

    @Test
    public void testInHeadNoscriptState_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><head><noscript>");
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processStartTag("noscript");
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);

        // Doctype
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(doctype, tb));

        // html start tag
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(htmlTag, tb));

        // meta / link
        Token.StartTag linkTag = new Token.StartTag();
        linkTag.name("link");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(linkTag, tb));

        // EndTag br
        Token.EndTag endBr = new Token.EndTag();
        endBr.name("br");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(endBr, tb));

        // StartTag head/noscript -> false
        Token.StartTag headTag = new Token.StartTag();
        headTag.name("head");
        Assert.assertFalse(HtmlTreeBuilderState.InHeadNoscript.process(headTag, tb));

        // EndTag noscript -> transition InHead
        Token.EndTag endNoscript = new Token.EndTag();
        endNoscript.name("noscript");
        Assert.assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(endNoscript, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterHeadState_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><head></head>");
        tb.processStartTag("html");
        tb.processStartTag("head");
        tb.processEndTag("head");
        tb.transition(HtmlTreeBuilderState.AfterHead);

        // Whitespace & comment & doctype
        Token.Character ws = new Token.Character().data(" ");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comm");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(doctype, tb));

        // Head start tag -> false
        Token.StartTag headTag = new Token.StartTag();
        headTag.name("head");
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(headTag, tb));

        // Base/meta/script in AfterHead (pushes head element, processes, removes)
        Token.StartTag metaTag = new Token.StartTag();
        metaTag.name("meta");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(metaTag, tb));

        // Body start tag
        Token.StartTag bodyTag = new Token.StartTag();
        bodyTag.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(bodyTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());

        // Frameset
        HtmlTreeBuilder tb2 = createBuilder("<html><head></head>");
        tb2.processStartTag("html");
        tb2.processStartTag("head");
        tb2.processEndTag("head");
        tb2.transition(HtmlTreeBuilderState.AfterHead);
        Token.StartTag frameset = new Token.StartTag();
        frameset.name("frameset");
        Assert.assertTrue(HtmlTreeBuilderState.AfterHead.process(frameset, tb2));
        Assert.assertEquals(HtmlTreeBuilderState.InFrameset, tb2.state());

        // End tag invalid
        HtmlTreeBuilder tb3 = createBuilder("<html><head></head>");
        tb3.processStartTag("html");
        tb3.processStartTag("head");
        tb3.processEndTag("head");
        tb3.transition(HtmlTreeBuilderState.AfterHead);
        Token.EndTag endDiv = new Token.EndTag();
        endDiv.name("div");
        Assert.assertFalse(HtmlTreeBuilderState.AfterHead.process(endDiv, tb3));
    }

    @Test
    public void testInBody_variousTags() {
        String html = "<html><head></head><body>" +
                "<a href='#'>Link1<a href='#'>Link2</a></a>" +
                "<span>Text</span>" +
                "<ul><li>Item 1<li>Item 2</ul>" +
                "<h1>Header 1<h2>Header 2</h2></h1>" +
                "<pre>Preformatted</pre>" +
                "<listing>Listing</listing>" +
                "<form action='post'><input type='text'><input type='hidden'></form>" +
                "<dl><dt>Term<dd>Definition</dl>" +
                "<button><button>Nested Button</button></button>" +
                "<b>Bold <i>Italic</b> Italic</i>" +
                "<nobr>Nobr1<nobr>Nobr2</nobr></nobr>" +
                "<applet><marquee><object></object></marquee></applet>" +
                "<video><source><track></video>" +
                "<img src='test.png'><br><hr><wbr><area><keygen><embed>" +
                "<textarea>Text</textarea>" +
                "<xmp>Xmp text</xmp>" +
                "<iframe>Frame text</iframe>" +
                "<noembed>Noembed text</noembed>" +
                "<select><option>1<optgroup><option>2</optgroup></select>" +
                "<ruby><rp>(</rp><rt>ruby text</rt><rp>)</rp></ruby>" +
                "<math><svg><image></image></svg></math>" +
                "<isindex action='search' prompt='Search now:'>" +
                "</body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
        Assert.assertTrue(doc.body().children().size() > 0);
    }

    @Test
    public void testInBody_adoptionAgencyAlgorithm() {
        String html = "<b>1<p>2</b>3</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);

        String nested = "<a>1<a>2<b>3</a>4</b></a>";
        Document doc2 = Jsoup.parse(nested);
        Assert.assertNotNull(doc2);
    }

    @Test
    public void testInBody_characterNullAndWhitespace() {
        HtmlTreeBuilder tb = createBuilder("<html><body>");
        tb.processStartTag("html");
        tb.processStartTag("body");

        // Null character -> false
        Token.Character nullChar = new Token.Character().data("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(nullChar, tb));

        // Normal whitespace
        Token.Character ws = new Token.Character().data("   ");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(ws, tb));

        // Doctype in body -> false
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(doctype, tb));
    }

    @Test
    public void testInBody_bodyAndHtmlAndFramesetTagInBody() {
        HtmlTreeBuilder tb = createBuilder("<html><body>");
        tb.processStartTag("html");
        tb.processStartTag("body");

        // Html start tag merges attributes
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");
        htmlTag.attributes.put("class", "my-html");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(htmlTag, tb));
        Assert.assertEquals("my-html", tb.getStack().get(0).attr("class"));

        // Body start tag merges attributes
        Token.StartTag bodyTag = new Token.StartTag();
        bodyTag.name("body");
        bodyTag.attributes.put("id", "my-body");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(bodyTag, tb));
        Assert.assertEquals("my-body", tb.getStack().get(1).attr("id"));

        // Frameset in body
        Token.StartTag framesetTag = new Token.StartTag();
        framesetTag.name("frameset");
        tb.framesetOk(false);
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(framesetTag, tb));
    }

    @Test
    public void testInBody_formTags() {
        HtmlTreeBuilder tb = createBuilder("<html><body>");
        tb.processStartTag("html");
        tb.processStartTag("body");

        Token.StartTag form1 = new Token.StartTag();
        form1.name("form");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(form1, tb));

        // Second nested form is ignored/error
        Token.StartTag form2 = new Token.StartTag();
        form2.name("form");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(form2, tb));

        // End tag form
        Token.EndTag endForm = new Token.EndTag();
        endForm.name("form");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(endForm, tb));
    }

    @Test
    public void testInBody_endTags() {
        HtmlTreeBuilder tb = createBuilder("<html><body><p>Hello");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("p");

        Token.EndTag endP = new Token.EndTag();
        endP.name("p");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(endP, tb));

        Token.EndTag endBr = new Token.EndTag();
        endBr.name("br");
        Assert.assertFalse(HtmlTreeBuilderState.InBody.process(endBr, tb));

        Token.EndTag endSarcasm = new Token.EndTag();
        endSarcasm.name("sarcasm");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(endSarcasm, tb));

        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertTrue(HtmlTreeBuilderState.InBody.process(endBody, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testTextState_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><script>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("script");
        tb.transition(HtmlTreeBuilderState.Text);

        Token.Character c = new Token.Character().data("var x = 1;");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(c, tb));

        Token.EndTag endScript = new Token.EndTag();
        endScript.name("script");
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(endScript, tb));

        // EOF in text mode
        tb.transition(HtmlTreeBuilderState.Text);
        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.Text.process(eof, tb));
    }

    @Test
    public void testInTable_statesAndTransitions() {
        String html = "<table>" +
                "<!-- comment in table -->" +
                "<caption>Caption</caption>" +
                "<colgroup><col width='10'></colgroup>" +
                "<thead><tr><th>Header</th></tr></thead>" +
                "<tbody><tr><td>Data</td></tr></tbody>" +
                "<tfoot><tr><td>Footer</td></tr></tfoot>" +
                "</table>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("table").first());

        // Foster parenting characters in table
        String fosterHtml = "<table>A<tr><td>B</td></tr>C</table>";
        Document fosterDoc = Jsoup.parse(fosterHtml);
        Assert.assertTrue(fosterDoc.body().text().contains("A"));
    }

    @Test
    public void testInTable_directTokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");

        // Doctype in table -> false
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(doctype, tb));

        // Input type hidden
        Token.StartTag hiddenInput = new Token.StartTag();
        hiddenInput.name("input");
        hiddenInput.attributes.put("type", "hidden");
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(hiddenInput, tb));

        // Input non-hidden -> foster parenting
        Token.StartTag textInput = new Token.StartTag();
        textInput.name("input");
        textInput.attributes.put("type", "text");
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(textInput, tb));

        // Form in table
        Token.StartTag form = new Token.StartTag();
        form.name("form");
        Assert.assertTrue(HtmlTreeBuilderState.InTable.process(form, tb));

        // EndTag in invalid table tags
        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertFalse(HtmlTreeBuilderState.InTable.process(endBody, tb));
    }

    @Test
    public void testInTableText_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.newPendingTableCharacters();

        // Null character -> false
        Token.Character nullChar = new Token.Character().data("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InTableText.process(nullChar, tb));

        // Character buffering
        Token.Character c = new Token.Character().data("text");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(c, tb));

        // Non-character token flushes buffer
        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        Assert.assertTrue(HtmlTreeBuilderState.InTableText.process(comment, tb));
    }

    @Test
    public void testInCaption_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table><caption>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("caption");

        // Start tag caption/col/tr in caption closes caption
        Token.StartTag trTag = new Token.StartTag();
        trTag.name("tr");
        Assert.assertTrue(HtmlTreeBuilderState.InCaption.process(trTag, tb));

        // Invalid end tag in caption
        HtmlTreeBuilder tb2 = createBuilder("<html><body><table><caption>");
        tb2.processStartTag("html");
        tb2.processStartTag("body");
        tb2.processStartTag("table");
        tb2.processStartTag("caption");
        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertFalse(HtmlTreeBuilderState.InCaption.process(endBody, tb2));
    }

    @Test
    public void testInColumnGroup_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table><colgroup>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("colgroup");

        // Whitespace, comment, doctype
        Token.Character ws = new Token.Character().data(" ");
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("col comm");
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(doctype, tb));

        // Col start tag
        Token.StartTag colTag = new Token.StartTag();
        colTag.name("col");
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(colTag, tb));

        // End tag colgroup
        Token.EndTag endColgroup = new Token.EndTag();
        endColgroup.name("colgroup");
        Assert.assertTrue(HtmlTreeBuilderState.InColumnGroup.process(endColgroup, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBody_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table><tbody>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");

        // Start tag th/td generates tr
        Token.StartTag tdTag = new Token.StartTag();
        tdTag.name("td");
        Assert.assertTrue(HtmlTreeBuilderState.InTableBody.process(tdTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        // Invalid end tag
        HtmlTreeBuilder tb2 = createBuilder("<html><body><table><tbody>");
        tb2.processStartTag("html");
        tb2.processStartTag("body");
        tb2.processStartTag("table");
        tb2.processStartTag("tbody");
        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertFalse(HtmlTreeBuilderState.InTableBody.process(endBody, tb2));
    }

    @Test
    public void testInRow_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table><tbody><tr>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");

        // Start tag th/td
        Token.StartTag thTag = new Token.StartTag();
        thTag.name("th");
        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(thTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        // End tag tr
        Token.EndTag endTr = new Token.EndTag();
        endTr.name("tr");
        Assert.assertTrue(HtmlTreeBuilderState.InRow.process(endTr, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());

        // Invalid end tag
        Token.EndTag endCol = new Token.EndTag();
        endCol.name("col");
        Assert.assertFalse(HtmlTreeBuilderState.InRow.process(endCol, tb));
    }

    @Test
    public void testInCell_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><table><tbody><tr><td>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tbody");
        tb.processStartTag("tr");
        tb.processStartTag("td");

        // Invalid end tag in cell
        Token.EndTag endBody = new Token.EndTag();
        endBody.name("body");
        Assert.assertFalse(HtmlTreeBuilderState.InCell.process(endBody, tb));

        // End tag td
        Token.EndTag endTd = new Token.EndTag();
        endTd.name("td");
        Assert.assertTrue(HtmlTreeBuilderState.InCell.process(endTd, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInSelect_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body><select>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("select");

        // Character null -> false
        Token.Character nullChar = new Token.Character().data("\u0000");
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(nullChar, tb));

        // Doctype -> false
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InSelect.process(doctype, tb));

        // StartTag option & optgroup
        Token.StartTag optgroup = new Token.StartTag();
        optgroup.name("optgroup");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(optgroup, tb));

        Token.StartTag option = new Token.StartTag();
        option.name("option");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(option, tb));

        // EndTag optgroup & option
        Token.EndTag endOpt = new Token.EndTag();
        endOpt.name("option");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(endOpt, tb));

        Token.EndTag endGroup = new Token.EndTag();
        endGroup.name("optgroup");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(endGroup, tb));

        // EndTag select
        Token.EndTag endSelect = new Token.EndTag();
        endSelect.name("select");
        Assert.assertTrue(HtmlTreeBuilderState.InSelect.process(endSelect, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInSelectInTable_tokens() {
        String html = "<table><tr><td><select><option>1</option></select></td></tr></table>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("select").first());

        HtmlTreeBuilder tb = createBuilder("<html><body><table><tr><td><select>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processStartTag("table");
        tb.processStartTag("tr");
        tb.processStartTag("td");
        tb.processStartTag("select");
        tb.transition(HtmlTreeBuilderState.InSelectInTable);

        // Start tag table in select closes select
        Token.StartTag tableStart = new Token.StartTag();
        tableStart.name("table");
        Assert.assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableStart, tb));
    }

    @Test
    public void testAfterBody_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body></body>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processEndTag("body");
        tb.transition(HtmlTreeBuilderState.AfterBody);

        // Whitespace, Comment, Doctype
        Token.Character ws = new Token.Character().data("  ");
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("after body comment");
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.AfterBody.process(doctype, tb));

        // Start tag html
        Token.StartTag htmlTag = new Token.StartTag();
        htmlTag.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlTag, tb));

        // End tag html -> transition AfterAfterBody
        Token.EndTag endHtml = new Token.EndTag();
        endHtml.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.AfterBody.process(endHtml, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testInFrameset_andAfterFrameset() {
        String html = "<html><frameset><frame src='frame.html'><noframes>No frames</noframes></frameset></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("frameset").first());

        HtmlTreeBuilder tb = createBuilder("<html><frameset>");
        tb.processStartTag("html");
        tb.processStartTag("frameset");
        tb.transition(HtmlTreeBuilderState.InFrameset);

        // Whitespace & comment & doctype
        Token.Character ws = new Token.Character().data(" ");
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(ws, tb));

        Token.Comment comment = new Token.Comment();
        comment.getData().append("frame comment");
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(comment, tb));

        Token.Doctype doctype = new Token.Doctype();
        Assert.assertFalse(HtmlTreeBuilderState.InFrameset.process(doctype, tb));

        // Frame tag
        Token.StartTag frameTag = new Token.StartTag();
        frameTag.name("frame");
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(frameTag, tb));

        // End frameset
        Token.EndTag endFrameset = new Token.EndTag();
        endFrameset.name("frameset");
        Assert.assertTrue(HtmlTreeBuilderState.InFrameset.process(endFrameset, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());

        // AfterFrameset
        Token.EndTag endHtml = new Token.EndTag();
        endHtml.name("html");
        Assert.assertTrue(HtmlTreeBuilderState.AfterFrameset.process(endHtml, tb));
        Assert.assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());

        // AfterAfterFrameset
        Token.Comment afterComment = new Token.Comment();
        afterComment.getData().append("final comment");
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(afterComment, tb));

        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(eof, tb));
    }

    @Test
    public void testAfterAfterBody_tokens() {
        HtmlTreeBuilder tb = createBuilder("<html><body></body></html>");
        tb.processStartTag("html");
        tb.processStartTag("body");
        tb.processEndTag("body");
        tb.processEndTag("html");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(comment, tb));

        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(eof, tb));

        Token.StartTag divTag = new Token.StartTag();
        divTag.name("div");
        Assert.assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(divTag, tb));
        Assert.assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }
}
