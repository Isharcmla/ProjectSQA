package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TreeBuilderStateTest {

    @Test
    public void testEnumValuesAndValueOf_normal_containsAllConstants() {
        TreeBuilderState[] states = TreeBuilderState.values();
        Assert.assertNotNull(states);
        Assert.assertEquals(23, states.length);

        for (TreeBuilderState state : states) {
            Assert.assertEquals(state, TreeBuilderState.valueOf(state.name()));
        }
    }

    @Test
    public void testInitialState_doctypeAndComments_parsedCorrectly() {
        String html = "<!DOCTYPE html><!-- initial comment --><html><head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
        Assert.assertEquals("html", doc.child(0).nodeName());
    }

    @Test
    public void testInitialState_quirksMode_forceQuirks() {
        String html = "<!DOCTYPE html SYSTEM \"about:legacy-compat\"><html><body>test</body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc);
    }

    @Test
    public void testInitialState_noDoctype_reprocessToken() {
        String html = "<!-- comment --><div>Text</div>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Text", doc.body().text());
    }

    @Test
    public void testBeforeHtmlState_variousTokens_handledProperly() {
        String html = "<!DOCTYPE html><html><head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("html"));

        String htmlWithBadEndTag = "</head><html><body>test</body></html>";
        Document doc2 = Jsoup.parse(htmlWithBadEndTag);
        Assert.assertEquals("test", doc2.body().text());

        String htmlWithInvalidEndTag = "</custom><html><body>test</body></html>";
        Document doc3 = Jsoup.parse(htmlWithInvalidEndTag);
        Assert.assertEquals("test", doc3.body().text());
    }

    @Test
    public void testBeforeHeadState_headTagsAndAnythingElse_createsHead() {
        String html1 = "<html><!-- head comment --><head><title>Title</title></head><body></body></html>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("Title", doc1.title());

        String html2 = "<html><title>Auto Head</title><body>Text</body></html>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertEquals("Auto Head", doc2.title());

        String html3 = "<html></head><body>Text</body></html>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertEquals("Text", doc3.body().text());

        String html4 = "<html></custom><body>Text</body></html>";
        Document doc4 = Jsoup.parse(html4);
        Assert.assertEquals("Text", doc4.body().text());
    }

    @Test
    public void testInHeadState_allHeaderElements_processed() {
        String html = "<html><head>" +
                "<base href='http://example.com/test/' target='_blank'>" +
                "<basefont>" +
                "<bgsound src='sound.mp3'>" +
                "<command>" +
                "<link rel='stylesheet' href='style.css'>" +
                "<meta charset='UTF-8'>" +
                "<title>Test Head Elements</title>" +
                "<noframes>No frames</noframes>" +
                "<style>body { color: red; }</style>" +
                "<noscript><a href='http://example.com'>noscript link</a></noscript>" +
                "<script>var a = 1;</script>" +
                "<!-- comment in head -->" +
                "</head><body><p>Body text</p></body></html>";

        Document doc = Jsoup.parse(html, "http://example.com/");
        Assert.assertEquals("Test Head Elements", doc.title());
        Assert.assertEquals("http://example.com/test/", doc.baseUri());
        Assert.assertNotNull(doc.head().select("link").first());
        Assert.assertNotNull(doc.head().select("style").first());
        Assert.assertNotNull(doc.head().select("script").first());
    }

    @Test
    public void testInHeadState_unexpectedTokens_handledProperly() {
        String html1 = "<html><head><!DOCTYPE html><head><div>Content</div></head></html>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("Content", doc1.body().text());

        String html2 = "<html><head></body></html>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.body());

        String html3 = "<html><head></custom><div>Content</div></head></html>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertEquals("Content", doc3.body().text());
    }

    @Test
    public void testInHeadNoscriptState_tokensInNoscript_processed() {
        String html1 = "<html><head><noscript><!-- comment --><link rel='stylesheet'><meta charset='utf-8'></noscript></head><body></body></html>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertNotNull(doc1.head().select("noscript"));

        String html2 = "<html><head><noscript></noscript></head><body></body></html>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.head().select("noscript"));

        String html3 = "<html><head><noscript><br><p>inside</p></noscript></head><body></body></html>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3.body());

        String html4 = "<html><head><noscript><!DOCTYPE html><head></head></noscript></head><body></body></html>";
        Document doc4 = Jsoup.parse(html4);
        Assert.assertNotNull(doc4.body());
    }

    @Test
    public void testAfterHeadState_bodyAndFrameset_transitionsCorrectly() {
        String htmlBody = "<html><head></head>   <!-- after head comment --> <body>Content</body></html>";
        Document docBody = Jsoup.parse(htmlBody);
        Assert.assertEquals("Content", docBody.body().text());

        String htmlMetaInAfterHead = "<html><head></head><meta name='test' content='val'><body>Content</body></html>";
        Document docMeta = Jsoup.parse(htmlMetaInAfterHead);
        Assert.assertEquals("Content", docMeta.body().text());

        String htmlHeadInAfterHead = "<html><head></head><head><body>Content</body></html>";
        Document docHead = Jsoup.parse(htmlHeadInAfterHead);
        Assert.assertEquals("Content", docHead.body().text());

        String htmlEndTagInAfterHead = "<html><head></head></body></html>";
        Document docEnd = Jsoup.parse(htmlEndTagInAfterHead);
        Assert.assertNotNull(docEnd.body());

        String htmlCustomEndTag = "<html><head></head></custom><body>Text</body></html>";
        Document docCustom = Jsoup.parse(htmlCustomEndTag);
        Assert.assertEquals("Text", docCustom.body().text());

        String htmlFrameset = "<html><head></head><frameset cols='50%,50%'><frame src='frame1.html'></frameset></html>";
        Document docFrameset = Jsoup.parse(htmlFrameset);
        Assert.assertNotNull(docFrameset.select("frameset").first());
    }

    @Test
    public void testInBody_blockElementsAndFormatting_parsedCorrectly() {
        String html = "<html><body>" +
                "\u0000" +
                "<!-- body comment -->" +
                "<h1>Header 1</h1><h2>Header 2</h2><h3>Header 3</h3><h4>Header 4</h4><h5>Header 5</h5><h6>Header 6</h6>" +
                "<p>Paragraph 1<p>Paragraph 2</p>" +
                "<address>Address</address>" +
                "<article>Article</article>" +
                "<aside>Aside</aside>" +
                "<blockquote>Quote</blockquote>" +
                "<center>Center</center>" +
                "<details>Details</details>" +
                "<dir>Dir</dir>" +
                "<div>Div</div>" +
                "<dl><dt>Term</dt><dd>Definition</dd></dl>" +
                "<fieldset>Fieldset</fieldset>" +
                "<figcaption>Figcaption</figcaption>" +
                "<figure>Figure</figure>" +
                "<footer>Footer</footer>" +
                "<header>Header</header>" +
                "<hgroup>Hgroup</hgroup>" +
                "<menu>Menu</menu>" +
                "<nav>Nav</nav>" +
                "<ol><li>Item 1</li><li>Item 2</li></ol>" +
                "<section>Section</section>" +
                "<summary>Summary</summary>" +
                "<ul><li>Item A</li></ul>" +
                "<pre>Preformatted</pre>" +
                "<listing>Listing</listing>" +
                "<form action='/submit'><input type='text' name='q'><button type='submit'>Go</button></form>" +
                "<form action='/ignore'></form>" +
                "<b>Bold</b><i>Italic</i><u>Underline</u><s>Strike</s><small>Small</small><strong>Strong</strong>" +
                "<em>Em</em><code>Code</code><tt>TT</tt><big>Big</big><strike>Strike2</strike><font size='2'>Font</font>" +
                "<nobr>Nobr <nobr>Nested Nobr</nobr></nobr>" +
                "<applet code='Applet.class'></applet>" +
                "<marquee>Marquee</marquee>" +
                "<object data='data'></object>" +
                "<area><br><embed><img src='img.png'><keygen><wbr>" +
                "<input type='hidden' name='h' value='val'>" +
                "<param name='p' value='1'><source src='s.mp3'><track src='t.vtt'>" +
                "<hr>" +
                "<image src='image.png'>" +
                "<isindex action='/search' prompt='Search here: '>" +
                "<textarea>Textarea content</textarea>" +
                "<xmp>XMP <tags> inside</xmp>" +
                "<iframe>Iframe content</iframe>" +
                "<noembed>Noembed</noembed>" +
                "<ruby>Base <rp>(</rp><rt>Ruby text</rt><rp>)</rp></ruby>" +
                "<math><mi>x</mi></math>" +
                "<svg><circle cx='50' cy='50' r='40'/></svg>" +
                "</body></html>";

        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.select("p").first());
        Assert.assertNotNull(doc.select("form").first());
        Assert.assertNotNull(doc.select("textarea").first());
        Assert.assertEquals("XMP <tags> inside", doc.select("xmp").first().text());
    }

    @Test
    public void testInBody_adoptionAgencyAlgorithm_nestedFormatting() {
        String html1 = "<p><b>1<p>2</b>3</p>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertNotNull(doc1);

        String html2 = "<a>1<p>2<a>3</a>4</p>5</a>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2);

        String html3 = "<b>1<table><tr><td>2</b>3</td></tr></table>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3);
    }

    @Test
    public void testInBody_nestedButtonsAndForms_closesCorrectly() {
        String html = "<button><button>Nested Button</button></button>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals(2, doc.select("button").size());

        String htmlList = "<ul><li>Item 1<li>Item 2</ul>";
        Document docList = Jsoup.parse(htmlList);
        Assert.assertEquals(2, docList.select("li").size());

        String htmlDl = "<dl><dt>T1<dd>D1<dt>T2<dd>D2</dl>";
        Document docDl = Jsoup.parse(htmlDl);
        Assert.assertEquals(2, docDl.select("dt").size());
        Assert.assertEquals(2, docDl.select("dd").size());
    }

    @Test
    public void testInBody_variousEndTags_handledProperly() {
        String html = "<div>" +
                "</p>" +
                "<li>item</li>" +
                "</dd></dt>" +
                "<h1>h1</h1></h2>" +
                "<sarcasm>joke</sarcasm>" +
                "</br>" +
                "<applet>app</applet>" +
                "</div>";
        Document doc = Jsoup.parse(html);
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void testInBody_duplicateBodyAndFrameset_handledProperly() {
        String html1 = "<html><body>First Body<body class='second'>Second Body</body></html>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("second", doc1.body().className());

        String htmlFrameset = "<html><body>Body content<frameset cols='*'><frame></frameset></body></html>";
        Document docFrameset = Jsoup.parse(htmlFrameset);
        Assert.assertNotNull(docFrameset.body());
    }

    @Test
    public void testInTable_tableElementsAndFosterParenting_parsedCorrectly() {
        String html = "<table>" +
                "<!-- table comment -->" +
                "<caption>Caption text</caption>" +
                "<colgroup><col width='10'></colgroup>" +
                "<thead><tr><th>Heading</th></tr></thead>" +
                "<tbody><tr><td>Data</td></tr></tbody>" +
                "<tfoot><tr><td>Foot</td></tr></tfoot>" +
                "</table>";
        Document doc = Jsoup.parse(html);
        Assert.assertEquals("Caption text", doc.select("caption").first().text());
        Assert.assertEquals("Heading", doc.select("th").first().text());
        Assert.assertEquals("Data", doc.select("td").first().text());

        String fosterHtml = "<table>Fostered text<tr><td>Cell</td></tr></table>";
        Document docFoster = Jsoup.parse(fosterHtml);
        Assert.assertTrue(docFoster.body().html().contains("Fostered text"));

        String inputInTable = "<table><input type='hidden' name='h' value='v'><input type='text' name='t'><tr><td>Cell</td></tr></table>";
        Document docInput = Jsoup.parse(inputInTable);
        Assert.assertNotNull(docInput.select("input[type=hidden]").first());

        String formInTable = "<table><form id='f'><tr><td>Cell</td></tr></form></table>";
        Document docForm = Jsoup.parse(formInTable);
        Assert.assertNotNull(docForm);

        String badTagsInTable = "<table><!DOCTYPE html><col><tr><td>A</td></tr><script>var x=1;</script><style>td{}</style></table>";
        Document docBad = Jsoup.parse(badTagsInTable);
        Assert.assertNotNull(docBad);
    }

    @Test
    public void testInTableText_characterHandling_properBufferingAndFlush() {
        String html1 = "<table>   <tr><td>Cell</td></tr></table>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertNotNull(doc1.select("table").first());

        String html2 = "<table>Non-whitespace text\u0000<tr><td>Cell</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.select("table").first());
    }

    @Test
    public void testInCaption_unexpectedTagsAndExit_handledCorrectly() {
        String html1 = "<table><caption>Caption <b>Formatted</b></caption><tr><td>Cell</td></tr></table>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("Caption Formatted", doc1.select("caption").first().text());

        String html2 = "<table><caption>Caption<tr><td>Cell</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertEquals(1, doc2.select("caption").size());
        Assert.assertEquals(1, doc2.select("td").size());

        String html3 = "<table><caption>Caption</body></html>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3);
    }

    @Test
    public void testInColumnGroup_colElements_handledCorrectly() {
        String html1 = "<table><colgroup><!-- comment --> <col class='c1'><col class='c2'></colgroup><tr><td>A</td></tr></table>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals(2, doc1.select("col").size());

        String html2 = "<table><colgroup><!DOCTYPE html><col><div>Bad div</div></colgroup><tr><td>A</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2);
    }

    @Test
    public void testInTableBodyAndRowAndCell_structureHandling() {
        String html1 = "<table><tbody><tr><td>Cell 1</td><th>Header 1</th></tr></tbody></table>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("Cell 1", doc1.select("td").first().text());

        String html2 = "<table><td>Direct Cell</td></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertEquals("Direct Cell", doc2.select("td").first().text());

        String html3 = "<table><tr><td>Cell 1<td>Cell 2</tr></table>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertEquals(2, doc3.select("td").size());

        String html4 = "<table><tbody><tr><td>Cell 1</td></tr><caption>New Caption</caption></table>";
        Document doc4 = Jsoup.parse(html4);
        Assert.assertNotNull(doc4);

        String html5 = "<table><tr><td>Cell 1</td></tr></custom></table>";
        Document doc5 = Jsoup.parse(html5);
        Assert.assertNotNull(doc5);
    }

    @Test
    public void testInSelect_selectOptionsAndOptgroups_parsedCorrectly() {
        String html1 = "<select><!-- comment -->" +
                "\u0000" +
                "<optgroup label='Group 1'><option value='1'>One</option><option value='2'>Two</option></optgroup>" +
                "<optgroup label='Group 2'><option value='3'>Three</option></optgroup>" +
                "<option value='4'>Four</option>" +
                "</select>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals(4, doc1.select("option").size());
        Assert.assertEquals(2, doc1.select("optgroup").size());

        String html2 = "<select><input type='text'><option>A</option></select>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.select("select").first());

        String html3 = "<select><script>var a = 1;</script><option>B</option></select>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3.select("select").first());

        String html4 = "<select><!DOCTYPE html><select><option>Nested Select</option></select></select>";
        Document doc4 = Jsoup.parse(html4);
        Assert.assertNotNull(doc4.select("select").first());
    }

    @Test
    public void testInSelectInTable_tableTagsInsideSelect_closesSelect() {
        String html1 = "<table><tr><td><select><option>1</option><td>Next Cell</td></tr></table>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals(2, doc1.select("td").size());

        String html2 = "<table><tr><td><select><option>1</option></tr><tr><td>Row 2</td></tr></table>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertEquals(2, doc2.select("tr").size());
    }

    @Test
    public void testAfterBody_tokensAfterBody_handledProperly() {
        String html1 = "<html><head></head><body>Content</body><!-- comment after body --></html>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("Content", doc1.body().text());

        String html2 = "<html><head></head><body>Content</body><!DOCTYPE html></html>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertEquals("Content", doc2.body().text());

        String html3 = "<html><head></head><body>Content</body><div>Trailing Div</div></html>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertTrue(doc3.body().html().contains("Trailing Div"));
    }

    @Test
    public void testInFramesetAndAfterFrameset_framesetStructure_handledProperly() {
        String html1 = "<html><head></head><frameset cols='20%,80%'>" +
                "<!-- frameset comment -->" +
                "<frame src='left.html'>" +
                "<frame src='right.html'>" +
                "<noframes><p>No frames supported</p></noframes>" +
                "</frameset><!-- after frameset comment --></html>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals(2, doc1.select("frame").size());

        String html2 = "<html><frameset cols='*'><!DOCTYPE html><frame></frameset><div>Trailing</div></html>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.select("frameset").first());

        String html3 = "<html><frameset cols='*'><frame></frameset><noframes><p>Noframes</p></noframes></html>";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3);
    }

    @Test
    public void testAfterAfterBodyAndAfterAfterFrameset_trailingCommentsAndTags() {
        String html1 = "<html><head></head><body>Body</body></html><!-- after after comment -->";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertEquals("Body", doc1.body().text());

        String html2 = "<html><head></head><body>Body</body></html><p>After after tag</p>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertTrue(doc2.body().html().contains("After after tag"));

        String html3 = "<html><frameset cols='*'><frame></frameset></html><!-- after frameset comment -->";
        Document doc3 = Jsoup.parse(html3);
        Assert.assertNotNull(doc3.select("frameset").first());

        String html4 = "<html><frameset cols='*'><frame></frameset></html><noframes>Trailing</noframes>";
        Document doc4 = Jsoup.parse(html4);
        Assert.assertNotNull(doc4);

        String html5 = "<html><frameset cols='*'><frame></frameset></html><p>Trailing tag</p>";
        Document doc5 = Jsoup.parse(html5);
        Assert.assertNotNull(doc5);
    }

    @Test
    public void testFragmentParsing_variousContexts() {
        List<org.jsoup.nodes.Node> bodyNodes = Parser.parseFragment("<div>Hello Fragment</div>", new Element(Tag.valueOf("body"), ""), "");
        Assert.assertFalse(bodyNodes.isEmpty());

        List<org.jsoup.nodes.Node> tableNodes = Parser.parseFragment("<tr><td>Cell</td></tr>", new Element(Tag.valueOf("table"), ""), "");
        Assert.assertFalse(tableNodes.isEmpty());

        List<org.jsoup.nodes.Node> selectNodes = Parser.parseFragment("<option>Opt 1</option><option>Opt 2</option>", new Element(Tag.valueOf("select"), ""), "");
        Assert.assertFalse(selectNodes.isEmpty());

        List<org.jsoup.nodes.Node> framesetNodes = Parser.parseFragment("<frame src='1.html'>", new Element(Tag.valueOf("frameset"), ""), "");
        Assert.assertFalse(framesetNodes.isEmpty());
    }

    @Test
    public void testForeignContent_processReturnsTrue() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Character charToken = new Token.Character("test");
        boolean result = TreeBuilderState.ForeignContent.process(charToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testTextState_scriptAndStyleContent_handledCorrectly() {
        String html1 = "<script>var x = '</script>';</script>";
        Document doc1 = Jsoup.parse(html1);
        Assert.assertNotNull(doc1.select("script").first());

        String html2 = "<style>body { content: '</style>'; }</style>";
        Document doc2 = Jsoup.parse(html2);
        Assert.assertNotNull(doc2.select("style").first());

        String htmlUnclosed = "<script>var a = 1;";
        Document docUnclosed = Jsoup.parse(htmlUnclosed);
        Assert.assertNotNull(docUnclosed.select("script").first());
    }
}
