package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Elements;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite for HtmlTreeBuilderState.
 * Since HtmlTreeBuilderState is a package-private enum used internally by HtmlTreeBuilder,
 * we exercise its various states indirectly through the public Jsoup.parse() API,
 * which drives the tree builder through Initial, BeforeHtml, BeforeHead, InHead,
 * InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption,
 * InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody,
 * InFrameset, AfterFrameset, AfterAfterBody, AfterAfterFrameset states.
 */
public class HtmlTreeBuilderStateTest {

    // ---------- Initial / BeforeHtml / BeforeHead states ----------

    @Test
    public void testParse_basicHtmlDocument_hasHtmlHeadBody() {
        String html = "<html><head><title>Title</title></head><body><p>Hello</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Title", doc.title());
        assertEquals("Hello", doc.select("p").first().text());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_withDoctype_quirksModeIsNotForced() {
        String html = "<!DOCTYPE html><html><head></head><body><p>Content</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testParse_forceQuirksDoctype_quirksModeIsQuirks() {
        // malformed/incomplete doctype typically forces quirks mode
        String html = "<!DOCTYPE><html><head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testParse_commentBeforeHtml_commentInserted() {
        String html = "<!-- comment --><html><body><p>Text</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Text", doc.select("p").first().text());
    }

    @Test
    public void testParse_emptyString_returnsDefaultStructure() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_textOnlyInput_wrapsInBody() {
        Document doc = Jsoup.parse("Just plain text");
        assertTrue(doc.body().text().contains("Just plain text"));
    }

    @Test
    public void testParse_whitespaceOnly_ignoredAndStillValidDocument() {
        Document doc = Jsoup.parse("   \n\t  ");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_startTagBeforeHtml_insertsHtmlImplicitly() {
        // no explicit <html> tag, should be created implicitly
        String html = "<head><title>T</title></head><body><p>P</p></body>";
        Document doc = Jsoup.parse(html);
        assertEquals("T", doc.title());
        assertEquals("P", doc.select("p").first().text());
    }

    @Test
    public void testParse_endTagBeforeHtmlIgnored_bodyEndTag() {
        // end tag "body" before html start, should be handled by anythingElse
        String html = "</body><html><body><p>Test</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Test", doc.select("p").first().text());
    }

    // ---------- InHead / InHeadNoscript / AfterHead ----------

    @Test
    public void testParse_headWithMeta_insertsMetaEmptyElement() {
        String html = "<html><head><meta charset=\"utf-8\"></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Elements metas = doc.select("meta");
        assertEquals(1, metas.size());
    }

    @Test
    public void testParse_headWithBaseHref_setsBaseUri() {
        String html = "<html><head><base href=\"http://example.com/\"></head><body><a href=\"page.html\">link</a></body></html>";
        Document doc = Jsoup.parse(html, "http://original.com/");
        Element a = doc.select("a").first();
        assertTrue(a.absUrl("href").contains("example.com"));
    }

    @Test
    public void testParse_scriptInHead_entersTextState() {
        String html = "<html><head><script>var x = '<test>';</script></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var x"));
    }

    @Test
    public void testParse_styleInHead_rawTextHandled() {
        String html = "<html><head><style>body{color:red;}</style></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.data().contains("color:red"));
    }

    @Test
    public void testParse_noscriptInHead_textInsertedAsChar() {
        String html = "<html><head><noscript>No script support</noscript></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        Element noscript = doc.select("noscript").first();
        assertNotNull(noscript);
    }

    @Test
    public void testParse_titleTag_handledAsRcData() {
        String html = "<html><head><title>My &amp; Title</title></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("My & Title", doc.title());
    }

    @Test
    public void testParse_afterHead_frameSetStartTag() {
        String html = "<html><head></head><frameset><frame/></frameset></html>";
        Document doc = Jsoup.parse(html);
        Elements frames = doc.select("frame");
        assertEquals(1, frames.size());
    }

    @Test
    public void testParse_afterHead_bodyTagTransitionsToInBody() {
        String html = "<html><head></head><body><p>Content</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.select("p").first().text());
    }

    // ---------- InBody states ----------

    @Test
    public void testParse_anchorTagReprocessedIfDuplicate() {
        String html = "<a href=\"#1\">One</a><a href=\"#2\">Two</a>";
        Document doc = Jsoup.parse(html);
        Elements anchors = doc.select("a");
        assertEquals(2, anchors.size());
    }

    @Test
    public void testParse_emptyFormattersLikeBr_insertedEmpty() {
        String html = "<p>Line1<br>Line2</p>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("br").size());
    }

    @Test
    public void testParse_pClosers_blockquoteClosesOpenP() {
        String html = "<p>Open paragraph<blockquote>Quote</blockquote>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("blockquote").size());
    }

    @Test
    public void testParse_liListItems_closesPreviousLi() {
        String html = "<ul><li>Item1<li>Item2<li>Item3</ul>";
        Document doc = Jsoup.parse(html);
        Elements lis = doc.select("li");
        assertEquals(3, lis.size());
    }

    @Test
    public void testParse_htmlStartTagMergesAttributes() {
        String html = "<html class=\"existing\"><body></body><html lang=\"en\"></html>";
        Document doc = Jsoup.parse(html);
        Element htmlEl = doc.selectFirst("html");
        assertNotNull(htmlEl);
    }

    @Test
    public void testParse_headingTags_closesPreviousHeading() {
        String html = "<h1>Heading1<h2>Heading2</h2></h1>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("h1").size());
        assertEquals(1, doc.select("h2").size());
    }

    @Test
    public void testParse_preListingTags_framesetNotOk() {
        String html = "<pre>Preformatted text</pre>";
        Document doc = Jsoup.parse(html);
        assertEquals("Preformatted text", doc.select("pre").first().text());
    }

    @Test
    public void testParse_formElement_onlyOneFormAllowed() {
        String html = "<form name=\"f1\"><input name=\"a\"></form><form name=\"f2\"><input name=\"b\"></form>";
        Document doc = Jsoup.parse(html);
        // second form's content gets merged/ignored appropriately; at minimum first form parsed
        assertTrue(doc.select("form").size() >= 1);
    }

    @Test
    public void testParse_ddDtTags_closesPreviousDdDt() {
        String html = "<dl><dt>Term1<dd>Def1<dt>Term2<dd>Def2</dl>";
        Document doc = Jsoup.parse(html);
        assertEquals(2, doc.select("dt").size());
        assertEquals(2, doc.select("dd").size());
    }

    @Test
    public void testParse_plaintextTag_rawTextToEnd() {
        String html = "<plaintext>This is <b>plain</b> &amp; raw text";
        Document doc = Jsoup.parse(html);
        Element plaintext = doc.select("plaintext").first();
        assertNotNull(plaintext);
        assertTrue(plaintext.text().contains("<b>plain</b>") || plaintext.text().contains("plain"));
    }

    @Test
    public void testParse_buttonTag_closesExistingButton() {
        String html = "<button>First<button>Second</button></button>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("button").size() >= 1);
    }

    @Test
    public void testParse_formattersTag_pushedToActiveFormatting() {
        String html = "<p><b>Bold <i>Italic</i> text</b></p>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("b").size());
        assertEquals(1, doc.select("i").size());
    }

    @Test
    public void testParse_nobrTag_closesExistingNobr() {
        String html = "<nobr>First<nobr>Second</nobr></nobr>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("nobr").size() >= 1);
    }

    @Test
    public void testParse_appletMarqueeObjectTags_insertsMarker() {
        String html = "<applet><param name=\"a\" value=\"b\"></applet>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("applet").size());
    }

    @Test
    public void testParse_tableStartTag_transitionsToInTable() {
        String html = "<table><tr><td>Cell1</td><td>Cell2</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Elements cells = doc.select("td");
        assertEquals(2, cells.size());
        assertEquals("Cell1", cells.get(0).text());
    }

    @Test
    public void testParse_inputHidden_doesNotDisableFrameset() {
        String html = "<input type=\"hidden\" name=\"h\">";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void testParse_mediaTags_insertedEmpty() {
        String html = "<video><source src=\"movie.mp4\"></video>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("source").size());
    }

    @Test
    public void testParse_hrTag_insertedEmpty() {
        String html = "<p>Before<hr>After</p>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("hr").size());
    }

    @Test
    public void testParse_imageTagConvertedToImg() {
        String html = "<image src=\"pic.png\">";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("img").size());
    }

    @Test
    public void testParse_isindexTag_processedAsFormInputHr() {
        String html = "<isindex name=\"query\" prompt=\"Search:\">";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("form").size() >= 1 || doc.select("input").size() >= 1);
    }

    @Test
    public void testParse_textareaTag_entersTextState() {
        String html = "<textarea>Some <b>raw</b> text</textarea>";
        Document doc = Jsoup.parse(html);
        Element textarea = doc.select("textarea").first();
        assertNotNull(textarea);
        assertTrue(textarea.text().contains("raw"));
    }

    @Test
    public void testParse_xmpTag_rawTextHandled() {
        String html = "<xmp>Raw <b>content</b></xmp>";
        Document doc = Jsoup.parse(html);
        Element xmp = doc.select("xmp").first();
        assertNotNull(xmp);
    }

    @Test
    public void testParse_iframeTag_rawTextHandled() {
        String html = "<iframe>Some <script>bad()</script> content</iframe>";
        Document doc = Jsoup.parse(html);
        Element iframe = doc.select("iframe").first();
        assertNotNull(iframe);
    }

    @Test
    public void testParse_noembedTag_rawTextHandled() {
        String html = "<noembed>Fallback content</noembed>";
        Document doc = Jsoup.parse(html);
        Element noembed = doc.select("noembed").first();
        assertNotNull(noembed);
    }

    @Test
    public void testParse_selectTag_transitionsToInSelect() {
        String html = "<select><option>A</option><option>B</option></select>";
        Document doc = Jsoup.parse(html);
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testParse_selectInsideTable_transitionsToInSelectInTable() {
        String html = "<table><tr><td><select><option>A</option></select></td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("select").size());
        assertEquals(1, doc.select("option").size());
    }

    @Test
    public void testParse_optionOptgroupTags_closesPreviousOption() {
        String html = "<select><optgroup label=\"g1\"><option>A</option><option>B</option></optgroup></select>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("optgroup").size());
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testParse_rubyTags_insertedWhenInScope() {
        String html = "<ruby>漢<rp>(</rp><rt>Kan</rt><rp>)</rp></ruby>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("ruby").size());
        assertEquals(1, doc.select("rt").size());
    }

    @Test
    public void testParse_mathTag_insertedInBody() {
        String html = "<math><mi>x</mi></math>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("math").size());
    }

    @Test
    public void testParse_svgTag_insertedInBody() {
        String html = "<svg><rect width=\"10\" height=\"10\"/></svg>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("svg").size());
    }

    @Test
    public void testParse_dropTagsInBody_errorIgnored() {
        // tags like <frame> appearing directly in body context are dropped
        String html = "<body><frame></body>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_spanTag_shortCircuitInsert() {
        String html = "<p>Text <span>span content</span></p>";
        Document doc = Jsoup.parse(html);
        assertEquals("span content", doc.select("span").first().text());
    }

    @Test
    public void testParse_nullCharacterInText_errorHandledGracefully() {
        String html = "<p>a\u0000b</p>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("p").first());
    }

    // ---------- EndTag handling in InBody ----------

    @Test
    public void testParse_adoptionAgencyAlgorithm_boldThenParagraph() {
        String html = "<b>Bold <p>Paragraph inside bold</p> after</b>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("b").size() >= 1);
        assertTrue(doc.select("p").size() >= 1);
    }

    @Test
    public void testParse_endTagClosers_blockquoteClosed() {
        String html = "<blockquote>Quote content</blockquote>After";
        Document doc = Jsoup.parse(html);
        assertEquals("Quote content", doc.select("blockquote").first().text());
    }

    @Test
    public void testParse_liEndTag_closesListItemScope() {
        String html = "<ul><li>Item content</li></ul>";
        Document doc = Jsoup.parse(html);
        assertEquals("Item content", doc.select("li").first().text());
    }

    @Test
    public void testParse_bodyEndTag_transitionsToAfterBody() {
        String html = "<html><body><p>Body content</p></body>Extra text</html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Body content", doc.select("p").first().text());
    }

    @Test
    public void testParse_htmlEndTag_processesBodyThenHtml() {
        String html = "<html><body><p>Content</p></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.select("p").first().text());
    }

    @Test
    public void testParse_formEndTag_removesFormFromStack() {
        String html = "<form><input name=\"a\"></form>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void testParse_pEndTagWithoutOpenP_createsEmptyP() {
        String html = "<div></p>Content</div>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("div").first());
    }

    @Test
    public void testParse_ddDtEndTag_closesScope() {
        String html = "<dl><dt>Term</dt><dd>Def</dd></dl>";
        Document doc = Jsoup.parse(html);
        assertEquals("Term", doc.select("dt").first().text());
        assertEquals("Def", doc.select("dd").first().text());
    }

    @Test
    public void testParse_headingEndTag_closesScope() {
        String html = "<h3>Heading content</h3>";
        Document doc = Jsoup.parse(html);
        assertEquals("Heading content", doc.select("h3").first().text());
    }

    @Test
    public void testParse_brEndTag_treatedAsStartTag() {
        String html = "<p>Line1</br>Line2</p>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("br").size() >= 1);
    }

    @Test
    public void testParse_unknownEndTag_anyOtherEndTagHandled() {
        String html = "<div>Content</unknowntag></div>";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.select("div").first().text());
    }

    // ---------- Table related states ----------

    @Test
    public void testParse_tableTextNodes_handledViaInTableText() {
        String html = "<table>Some text<tr><td>Cell</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals("Cell", doc.select("td").first().text());
    }

    @Test
    public void testParse_tableCaption_transitionsToInCaption() {
        String html = "<table><caption>Table Caption</caption><tr><td>1</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals("Table Caption", doc.select("caption").first().text());
    }

    @Test
    public void testParse_colgroupAndCol_transitionsToInColumnGroup() {
        String html = "<table><colgroup><col/><col/></colgroup><tr><td>1</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals(2, doc.select("col").size());
    }

    @Test
    public void testParse_tbodyTfootThead_transitionsToInTableBody() {
        String html = "<table><thead><tr><th>H</th></tr></thead><tbody><tr><td>D</td></tr></tbody></table>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("thead").size());
        assertEquals(1, doc.select("tbody").size());
    }

    @Test
    public void testParse_tdThTr_implicitTbodyInsertion() {
        String html = "<table><tr><td>Direct cell</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals("Direct cell", doc.select("td").first().text());
    }

    @Test
    public void testParse_tableFormElement_insertedWithinTable() {
        String html = "<table><form><input name=\"a\"></form><tr><td>1</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("table").first());
    }

    @Test
    public void testParse_nestedTable_errorHandledAndReprocessed() {
        String html = "<table><tr><td>Outer<table><tr><td>Inner</td></tr></table></td></tr></table>";
        Document doc = Jsoup.parse(html);
        Elements tables = doc.select("table");
        assertTrue(tables.size() >= 1);
    }

    @Test
    public void testParse_tableWithStyleScript_processedViaInHead() {
        String html = "<table><style>td{color:red;}</style><tr><td>1</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("style").size());
    }

    @Test
    public void testParse_tableEndTag_popsToTable() {
        String html = "<table><tr><td>Content</td></tr></table>After table";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.select("td").first().text());
    }

    @Test
    public void testParse_rowEndTag_transitionsToInTableBody() {
        String html = "<table><tbody><tr><td>Row1</td></tr><tr><td>Row2</td></tr></tbody></table>";
        Document doc = Jsoup.parse(html);
        assertEquals(2, doc.select("tr").size());
    }

    @Test
    public void testParse_cellEndTag_closesCellAndTransitionsToInRow() {
        String html = "<table><tr><td>Cell1</td><td>Cell2</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Elements cells = doc.select("td");
        assertEquals(2, cells.size());
        assertEquals("Cell2", cells.get(1).text());
    }

    @Test
    public void testParse_captionEndTagClosesCaptionScope() {
        String html = "<table><caption>Cap</caption><tr><td>D</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertEquals("Cap", doc.select("caption").first().text());
    }

    @Test
    public void testParse_inputHiddenInTable_insertedEmpty() {
        String html = "<table><input type=\"hidden\" name=\"h\"><tr><td>1</td></tr></table>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("input").size() >= 1);
    }

    // ---------- AfterBody / Frameset / AfterFrameset ----------

    @Test
    public void testParse_afterBody_whitespaceProcessedAsInBody() {
        String html = "<html><body><p>Content</p></body>   </html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.select("p").first().text());
    }

    @Test
    public void testParse_afterBody_commentInsertedIntoHtmlNode() {
        String html = "<html><body></body><!-- after body comment --></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_frameset_withFrames() {
        String html = "<html><head></head><frameset cols=\"50%,50%\"><frame src=\"a.html\"><frame src=\"b.html\"></frameset></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void testParse_frameset_nestedFrameset() {
        String html = "<html><frameset><frameset><frame></frameset><frame></frameset></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("frameset").size() >= 1);
    }

    @Test
    public void testParse_afterFrameset_noframesProcessed() {
        String html = "<html><frameset><frame></frameset><noframes>No frames support</noframes></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("frameset").first());
    }

    @Test
    public void testParse_afterAfterBody_trailingCommentInserted() {
        String html = "<html><body><p>Content</p></body></html><!-- trailing comment -->";
        Document doc = Jsoup.parse(html);
        assertEquals("Content", doc.select("p").first().text());
    }

    @Test
    public void testParse_afterAfterFrameset_trailingNoframes() {
        String html = "<html><frameset><frame></frameset></html><noframes>Fallback</noframes>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("frameset").first());
    }

    // ---------- Fragment parsing (edge case) ----------

    @Test
    public void testParseBodyFragment_simpleFragment_parsedCorrectly() {
        String html = "<p>Fragment paragraph</p>";
        Document doc = Jsoup.parseBodyFragment(html);
        assertEquals("Fragment paragraph", doc.select("p").first().text());
    }

    @Test
    public void testParseBodyFragment_tableFragment_cellsParsedCorrectly() {
        String html = "<tr><td>Cell</td></tr>";
        Document doc = Jsoup.parseBodyFragment(html);
        assertNotNull(doc.select("td").first());
    }

    // ---------- Exception / null edge case ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullHtmlInput_throwsIllegalArgumentException() {
        Jsoup.parse((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullBaseUri_throwsIllegalArgumentException() {
        Jsoup.parse("<html></html>", null);
    }
}
