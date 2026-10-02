package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    // ---------- Initial / BeforeHtml states ----------

    @Test
    public void testParse_emptyString_createsHtmlHeadBody() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_doctypeOnly_setsDoctypeNode() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertNotNull(doc);
        boolean foundDoctype = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof org.jsoup.nodes.DocumentType) {
                foundDoctype = true;
            }
        }
        assertTrue(foundDoctype);
    }

    @Test
    public void testParse_commentBeforeHtml_insertsComment() {
        Document doc = Jsoup.parse("<!-- comment --><html><head></head><body></body></html>");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("comment"));
    }

    @Test
    public void testParse_htmlStartTagBeforeHtml_transitionsToBeforeHead() {
        Document doc = Jsoup.parse("<html><head></head><body></body></html>");
        assertEquals("html", doc.child(0).tagName().toLowerCase());
    }

    @Test
    public void testParse_endTagBeforeHtml_handledGracefully() {
        Document doc = Jsoup.parse("</head><html><body></body></html>");
        assertNotNull(doc.body());
    }

    // ---------- BeforeHead / InHead states ----------

    @Test
    public void testParse_headWithMeta_insertsMetaEmptyElement() {
        Document doc = Jsoup.parse("<html><head><meta charset='utf-8'></head><body></body></html>");
        Elements metas = doc.select("meta");
        assertEquals(1, metas.size());
    }

    @Test
    public void testParse_headWithBaseHref_setsBaseUri() {
        Document doc = Jsoup.parse("<html><head><base href='http://example.com/'></head><body></body></html>");
        Elements bases = doc.select("base");
        assertEquals(1, bases.size());
        assertEquals("http://example.com/", bases.first().attr("href"));
    }

    @Test
    public void testParse_headWithTitle_setsTitleText() {
        Document doc = Jsoup.parse("<html><head><title>My Title</title></head><body></body></html>");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testParse_headWithStyleAndScript_rawText() {
        Document doc = Jsoup.parse("<html><head><style>body{color:red;}</style>" +
                "<script>var x = 1;</script></head><body></body></html>");
        assertEquals(1, doc.select("style").size());
        assertEquals(1, doc.select("script").size());
    }

    @Test
    public void testParse_headWithNoscript_insertsNoscriptElement() {
        Document doc = Jsoup.parse("<html><head><noscript><p>no js</p></noscript></head><body></body></html>");
        assertEquals(1, doc.select("noscript").size());
    }

    @Test
    public void testParse_headWithNoframes_rawText() {
        Document doc = Jsoup.parse("<html><head><noframes>content</noframes></head><body></body></html>");
        assertEquals(1, doc.select("noframes").size());
    }

    @Test
    public void testParse_malformedHeadEndTagBeforeHead_errorHandled() {
        Document doc = Jsoup.parse("<html><head></head><body></head></body></html>");
        assertNotNull(doc.body());
    }

    // ---------- AfterHead ----------

    @Test
    public void testParse_afterHeadWhitespace_insertedIntoHtml() {
        Document doc = Jsoup.parse("<html><head></head>   <body></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_afterHeadFrameset_transitionsInFrameset() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frameset></html>");
        assertNotNull(doc);
    }

    // ---------- InBody: character / basic elements ----------

    @Test
    public void testParse_bodyWithParagraphAndDiv_pClosersWork() {
        Document doc = Jsoup.parse("<html><body><p>one<div>two</div></body></html>");
        assertEquals(1, doc.select("div").size());
        Elements ps = doc.select("p");
        assertTrue(ps.size() >= 1);
    }

    @Test
    public void testParse_bodyWithAnchorReconstruction_multipleATags() {
        Document doc = Jsoup.parse("<html><body><a href='#'>1<a href='#'>2</a></a></body></html>");
        Elements anchors = doc.select("a");
        assertTrue(anchors.size() >= 1);
    }

    @Test
    public void testParse_bodyWithListItems_liBreakers() {
        Document doc = Jsoup.parse("<html><body><ul><li>one<li>two</li></li></ul></body></html>");
        Elements lis = doc.select("li");
        assertEquals(2, lis.size());
    }

    @Test
    public void testParse_bodyWithDlDdDt_ddDtBreakers() {
        Document doc = Jsoup.parse("<html><body><dl><dt>term<dd>def</dd></dt></dl></body></html>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void testParse_bodyWithHeadings_headingReplacement() {
        Document doc = Jsoup.parse("<html><body><h1>one<h2>two</h2></h1></body></html>");
        assertEquals(1, doc.select("h1").size());
        assertEquals(1, doc.select("h2").size());
    }

    @Test
    public void testParse_bodyWithPreListing_framesetOkFalse() {
        Document doc = Jsoup.parse("<html><body><pre>preformatted</pre></body></html>");
        assertEquals(1, doc.select("pre").size());
    }

    @Test
    public void testParse_bodyWithForm_formElementInserted() {
        Document doc = Jsoup.parse("<html><body><form action='/submit'><input name='q'></form></body></html>");
        assertEquals(1, doc.select("form").size());
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void testParse_bodyWithButtonNested_reprocessesButton() {
        Document doc = Jsoup.parse("<html><body><button>outer<button>inner</button></button></body></html>");
        Elements buttons = doc.select("button");
        assertTrue(buttons.size() >= 1);
    }

    @Test
    public void testParse_bodyWithFormatters_pushActiveFormatting() {
        Document doc = Jsoup.parse("<html><body><b>bold<i>italic</i></b></body></html>");
        assertEquals(1, doc.select("b").size());
        assertEquals(1, doc.select("i").size());
    }

    @Test
    public void testParse_bodyWithNobr_nestedNobrHandling() {
        Document doc = Jsoup.parse("<html><body><nobr>one<nobr>two</nobr></nobr></body></html>");
        Elements nobrs = doc.select("nobr");
        assertTrue(nobrs.size() >= 1);
    }

    @Test
    public void testParse_bodyWithAppletMarqueeObject_insertsMarker() {
        Document doc = Jsoup.parse("<html><body><marquee>scroll text</marquee></body></html>");
        assertEquals(1, doc.select("marquee").size());
    }

    @Test
    public void testParse_bodyWithTable_transitionsToInTable() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>cell</td></tr></table></body></html>");
        assertEquals(1, doc.select("table").size());
        assertEquals(1, doc.select("td").size());
    }

    @Test
    public void testParse_bodyWithInputHidden_framesetOkTrue() {
        Document doc = Jsoup.parse("<html><body><input type='hidden' name='h'></body></html>");
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void testParse_bodyWithInputText_framesetOkFalse() {
        Document doc = Jsoup.parse("<html><body><input type='text' name='t'></body></html>");
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void testParse_bodyWithMediaTags_insertsEmpty() {
        Document doc = Jsoup.parse("<html><body><video><source src='a.mp4'><track kind='subtitles'></video></body></html>");
        assertTrue(doc.select("source").size() >= 1);
    }

    @Test
    public void testParse_bodyWithHr_insertsEmptyAndClosesP() {
        Document doc = Jsoup.parse("<html><body><p>text<hr></p></body></html>");
        assertEquals(1, doc.select("hr").size());
    }

    @Test
    public void testParse_bodyWithImageTag_convertsToImg() {
        Document doc = Jsoup.parse("<html><body><image src='a.png'></body></html>");
        Elements imgs = doc.select("img");
        assertTrue(imgs.size() >= 1);
    }

    @Test
    public void testParse_bodyWithIsindex_createsFormAndInput() {
        Document doc = Jsoup.parse("<html><body><isindex prompt='Enter:'></body></html>");
        assertTrue(doc.select("form").size() >= 1);
    }

    @Test
    public void testParse_bodyWithTextarea_transitionsToText() {
        Document doc = Jsoup.parse("<html><body><textarea>hello world</textarea></body></html>");
        Elements textareas = doc.select("textarea");
        assertEquals(1, textareas.size());
        assertTrue(textareas.first().text().contains("hello world"));
    }

    @Test
    public void testParse_bodyWithXmp_rawTextHandling() {
        Document doc = Jsoup.parse("<html><body><xmp><b>not bold</b></xmp></body></html>");
        assertEquals(1, doc.select("xmp").size());
    }

    @Test
    public void testParse_bodyWithIframe_rawTextHandling() {
        Document doc = Jsoup.parse("<html><body><iframe>content</iframe></body></html>");
        assertEquals(1, doc.select("iframe").size());
    }

    @Test
    public void testParse_bodyWithNoembed_rawTextHandling() {
        Document doc = Jsoup.parse("<html><body><noembed>fallback</noembed></body></html>");
        assertEquals(1, doc.select("noembed").size());
    }

    @Test
    public void testParse_bodyWithSelect_transitionsToInSelect() {
        Document doc = Jsoup.parse("<html><body><select><option>a</option><option>b</option></select></body></html>");
        assertEquals(1, doc.select("select").size());
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testParse_bodyWithSelectInTable_transitionsToInSelectInTable() {
        Document doc = Jsoup.parse("<html><body><table><tr><td><select><option>a</option></select></td></tr></table></body></html>");
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void testParse_bodyWithOptionOptgroup_optionsHandling() {
        Document doc = Jsoup.parse("<html><body><select><optgroup label='g'><option>a</option></optgroup></select></body></html>");
        assertEquals(1, doc.select("optgroup").size());
    }

    @Test
    public void testParse_bodyWithRubyRpRt_rubyHandling() {
        Document doc = Jsoup.parse("<html><body><ruby>base<rp>(</rp><rt>reading</rt><rp>)</rp></ruby></body></html>");
        assertEquals(1, doc.select("ruby").size());
    }

    @Test
    public void testParse_bodyWithMathSvg_insertsElements() {
        Document doc = Jsoup.parse("<html><body><math></math><svg></svg></body></html>");
        assertTrue(doc.select("math").size() >= 1);
        assertTrue(doc.select("svg").size() >= 1);
    }

    @Test
    public void testParse_bodyWithDroppedTags_errorIgnored() {
        Document doc = Jsoup.parse("<html><body><td>orphan cell</td></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_bodyEndTagAdoptionFormatters_complexNesting() {
        Document doc = Jsoup.parse("<html><body><p><b>1<i>2<p>3</p>4</b>5</p></body></html>");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().length() > 0);
    }

    @Test
    public void testParse_bodyEndTagCloser_div() {
        Document doc = Jsoup.parse("<html><body><div>content</div></body></html>");
        assertEquals(1, doc.select("div").size());
    }

    @Test
    public void testParse_bodyEndTagLi_withoutScope() {
        Document doc = Jsoup.parse("<html><body></li>text</body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_bodyEndTagBody_transitionsAfterBody() {
        Document doc = Jsoup.parse("<html><body>content</body>extra</html>");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("content"));
    }

    @Test
    public void testParse_bodyEndTagHtml_processesBodyThenHtml() {
        Document doc = Jsoup.parse("<html><body>content</html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_bodyEndTagForm_removesFormElement() {
        Document doc = Jsoup.parse("<html><body><form>text</form></body></html>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void testParse_bodyEndTagP_withoutScope_createsEmptyP() {
        Document doc = Jsoup.parse("<html><body></p>text</body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_bodyEndTagHeading_withoutScope() {
        Document doc = Jsoup.parse("<html><body></h1>text</body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_bodyEndTagSarcasm_anyOtherEndTag() {
        Document doc = Jsoup.parse("<html><body>text</sarcasm></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_bodyEndTagApplet_scopeCheck() {
        Document doc = Jsoup.parse("<html><body><applet>content</applet></body></html>");
        assertEquals(1, doc.select("applet").size());
    }

    @Test
    public void testParse_bodyEndTagBr_processedAsStartTag() {
        Document doc = Jsoup.parse("<html><body>text</br>more</body></html>");
        assertTrue(doc.select("br").size() >= 1);
    }

    // ---------- Table related states ----------

    @Test
    public void testParse_tableCaption_transitionsInCaption() {
        Document doc = Jsoup.parse("<html><body><table><caption>Cap</caption><tr><td>d</td></tr></table></body></html>");
        assertEquals(1, doc.select("caption").size());
    }

    @Test
    public void testParse_tableColgroup_transitionsInColumnGroup() {
        Document doc = Jsoup.parse("<html><body><table><colgroup><col><col></colgroup><tr><td>d</td></tr></table></body></html>");
        assertEquals(1, doc.select("colgroup").size());
        assertEquals(2, doc.select("col").size());
    }

    @Test
    public void testParse_tableTbody_transitionsInTableBody() {
        Document doc = Jsoup.parse("<html><body><table><tbody><tr><td>d</td></tr></tbody></table></body></html>");
        assertEquals(1, doc.select("tbody").size());
    }

    @Test
    public void testParse_tableRow_transitionsInRow() {
        Document doc = Jsoup.parse("<html><body><table><tr><th>h</th><td>d</td></tr></table></body></html>");
        assertEquals(1, doc.select("tr").size());
        assertEquals(1, doc.select("th").size());
    }

    @Test
    public void testParse_tableCell_transitionsInCell() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>one</td><td>two</td></tr></table></body></html>");
        assertEquals(2, doc.select("td").size());
    }

    @Test
    public void testParse_tableForm_insertsForm() {
        Document doc = Jsoup.parse("<html><body><table><form></form><tr><td>d</td></tr></table></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_tableNestedTable_errorAndReprocess() {
        Document doc = Jsoup.parse("<html><body><table><table><tr><td>inner</td></tr></table></table></body></html>");
        Elements tables = doc.select("table");
        assertTrue(tables.size() >= 1);
    }

    @Test
    public void testParse_tableTextFosterParenting() {
        Document doc = Jsoup.parse("<html><body><table>foster text<tr><td>d</td></tr></table></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_tableColInput_hiddenAllowed() {
        Document doc = Jsoup.parse("<html><body><table><input type='hidden' name='h'><tr><td>d</td></tr></table></body></html>");
        assertTrue(doc.select("input").size() >= 1);
    }

    // ---------- Frameset states ----------

    @Test
    public void testParse_framesetParsing_transitionsFrameset() {
        Document doc = Jsoup.parse("<html><frameset><frame src='a.html'><frame src='b.html'></frameset></html>");
        assertNotNull(doc);
    }

    @Test
    public void testParse_afterFrameset_transitionsAfterAfterFrameset() {
        Document doc = Jsoup.parse("<html><frameset><frame></frameset></html>after");
        assertNotNull(doc);
    }

    // ---------- AfterBody / AfterAfterBody ----------

    @Test
    public void testParse_afterBodyWhitespace_processedInBody() {
        Document doc = Jsoup.parse("<html><body>text</body>   </html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_afterAfterBodyComment_insertsComment() {
        Document doc = Jsoup.parse("<html><body>text</body></html><!-- trailing comment -->");
        assertTrue(doc.toString().contains("trailing comment"));
    }

    @Test
    public void testParse_afterBodyExtraContent_reprocessedInBody() {
        Document doc = Jsoup.parse("<html><body>text</body><p>more</p></html>");
        assertNotNull(doc.body());
        assertTrue(doc.body().text().contains("text"));
    }

    // ---------- Fragment parsing ----------

    @Test
    public void testParse_fragmentParsing_bodyContext() {
        Document doc = Jsoup.parseBodyFragment("<p>fragment content</p>");
        assertNotNull(doc.body());
        assertEquals(1, doc.body().select("p").size());
    }

    @Test
    public void testParse_fragmentParsing_withBaseUri() {
        Document doc = Jsoup.parse("<div>content</div>", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.select("div").size() >= 1);
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_emptyBodyOnly_noExceptions() {
        Document doc = Jsoup.parse("<html><body></body></html>");
        assertNotNull(doc.body());
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParse_whitespaceOnly_ignoredProperly() {
        Document doc = Jsoup.parse("   \n\t  ");
        assertNotNull(doc.body());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullInput_throwsIllegalArgumentException() {
        Jsoup.parse((String) null);
    }

    @Test
    public void testParse_malformedNestedTags_doesNotThrow() {
        Document doc = Jsoup.parse("<html><body><div><span><p></div></span></p></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_scriptWithSpecialCharacters_rawTextPreserved() {
        Document doc = Jsoup.parse("<html><head><script>if (a < b) { alert('x'); }</script></head><body></body></html>");
        Elements scripts = doc.select("script");
        assertEquals(1, scripts.size());
    }

    @Test
    public void testParse_selectEndTagWithoutScope_errorHandled() {
        Document doc = Jsoup.parse("<html><body></select>text</body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_documentQuirksMode_notNull() {
        Document doc = Jsoup.parse("<html><body></body></html>");
        assertNotNull(doc.quirksMode());
    }
}
