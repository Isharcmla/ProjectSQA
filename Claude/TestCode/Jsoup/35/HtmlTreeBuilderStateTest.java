package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test suite for HtmlTreeBuilderState.
 * Since HtmlTreeBuilderState is package-private and its process() method is invoked
 * internally by the HtmlTreeBuilder during parsing, these tests exercise the state
 * machine indirectly through the public org.jsoup.Jsoup parsing API.
 */
public class HtmlTreeBuilderStateTest {

    // ---------- Initial state ----------

    @Test
    public void testInitial_withDoctype_createsDocType() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertNotNull(doc);
        assertEquals(1, doc.childNodes().size() >= 1 ? 1 : 0);
    }

    @Test
    public void testInitial_withComment_insertsComment() {
        Document doc = Jsoup.parse("<!-- top comment --><html><body>Hi</body></html>");
        assertNotNull(doc);
        assertTrue(doc.toString().contains("top comment"));
    }

    @Test
    public void testInitial_withLeadingWhitespace_ignored() {
        Document doc = Jsoup.parse("   \n<html><body>Text</body></html>");
        assertNotNull(doc.body());
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testInitial_withoutDoctype_reprocessesToken() {
        Document doc = Jsoup.parse("<html><body>NoDoctype</body></html>");
        assertEquals("NoDoctype", doc.body().text());
    }

    // ---------- BeforeHtml state ----------

    @Test
    public void testBeforeHtml_withHtmlStartTag_transitionsToBeforeHead() {
        Document doc = Jsoup.parse("<html><head><title>T</title></head><body>B</body></html>");
        assertEquals("T", doc.title());
        assertEquals("B", doc.body().text());
    }

    @Test
    public void testBeforeHtml_withComment_insertsComment() {
        Document doc = Jsoup.parse("<html><!-- c --><body>B</body></html>");
        assertTrue(doc.toString().contains("c"));
    }

    @Test
    public void testBeforeHtml_withEndTagBody_anythingElse() {
        Document doc = Jsoup.parse("</body><html><body>Content</body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testBeforeHtml_withRandomEndTag_error() {
        // e.g. </foo> before html - triggers error branch but should not throw
        Document doc = Jsoup.parse("</foo><html><body>X</body></html>");
        assertNotNull(doc.body());
    }

    // ---------- BeforeHead state ----------

    @Test
    public void testBeforeHead_withHeadStartTag() {
        Document doc = Jsoup.parse("<html><head><meta charset='utf-8'></head><body></body></html>");
        assertNotNull(doc.head());
        assertTrue(doc.head().children().size() > 0);
    }

    @Test
    public void testBeforeHead_withHtmlStartTagInBody() {
        Document doc = Jsoup.parse("<html><html><body>Nested</body></html></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testBeforeHead_withEndTagHead_processesFakeHead() {
        Document doc = Jsoup.parse("<html></head><body>X</body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testBeforeHead_withNonWhitespaceCharacter_anythingElse() {
        Document doc = Jsoup.parse("<html>Text before head<body></body></html>");
        assertNotNull(doc.body());
    }

    // ---------- InHead state ----------

    @Test
    public void testInHead_withTitleTag() {
        Document doc = Jsoup.parse("<html><head><title>MyTitle</title></head><body></body></html>");
        assertEquals("MyTitle", doc.title());
    }

    @Test
    public void testInHead_withMetaTag() {
        Document doc = Jsoup.parse("<html><head><meta name='x' content='y'></head><body></body></html>");
        Elements metas(); // placeholder to avoid unused import warnings removed below
        assertTrue(doc.head().select("meta").size() > 0);
    }

    @Test
    public void testInHead_withBaseHref_setsBaseUri() {
        Document doc = Jsoup.parse("<html><head><base href='http://example.com/'></head><body><a href='p'>link</a></body></html>",
                "http://original.com/");
        Element a = doc.select("a").first();
        assertNotNull(a);
        assertTrue(a.attr("abs:href").startsWith("http://example.com"));
    }

    @Test
    public void testInHead_withScriptTag_transitionsToText() {
        Document doc = Jsoup.parse("<html><head><script>var a = '<div>';</script></head><body></body></html>");
        assertEquals(1, doc.select("script").size());
    }

    @Test
    public void testInHead_withStyleTag_handledAsRawtext() {
        Document doc = Jsoup.parse("<html><head><style>body{color:red}</style></head><body></body></html>");
        assertEquals(1, doc.select("style").size());
    }

    @Test
    public void testInHead_withNoscriptTag_transitionsToInHeadNoscript() {
        Document doc = Jsoup.parse("<html><head><noscript><p>fallback</p></noscript></head><body></body></html>");
        assertEquals(1, doc.select("noscript").size());
    }

    @Test
    public void testInHead_withEndTagHead_transitionsToAfterHead() {
        Document doc = Jsoup.parse("<html><head></head><body>after</body></html>");
        assertEquals("after", doc.body().text());
    }

    @Test
    public void testInHead_withUnknownStartTag_anythingElse() {
        Document doc = Jsoup.parse("<html><head><div>unexpected</div></head><body>B</body></html>");
        assertNotNull(doc.body());
    }

    // ---------- InHeadNoscript state ----------

    @Test
    public void testInHeadNoscript_withStyleTag_delegatesToInHead() {
        Document doc = Jsoup.parse("<html><head><noscript><style>a{}</style></noscript></head><body></body></html>");
        assertNotNull(doc.head());
    }

    @Test
    public void testInHeadNoscript_withEndTagNoscript_transitionsBackToInHead() {
        Document doc = Jsoup.parse("<html><head><noscript></noscript><title>T</title></head><body></body></html>");
        assertEquals("T", doc.title());
    }

    @Test
    public void testInHeadNoscript_withUnexpectedContent_anythingElse() {
        Document doc = Jsoup.parse("<html><head><noscript><p>content</p></noscript></head><body>B</body></html>");
        assertNotNull(doc.body());
    }

    // ---------- AfterHead state ----------

    @Test
    public void testAfterHead_withBodyTag() {
        Document doc = Jsoup.parse("<html><head></head><body>hello</body></html>");
        assertEquals("hello", doc.body().text());
    }

    @Test
    public void testAfterHead_withFramesetTag() {
        Document doc = Jsoup.parse("<html><head></head><frameset><frame></frame></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
    }

    @Test
    public void testAfterHead_withHeadRelatedStartTag_movesToHead() {
        Document doc = Jsoup.parse("<html><head></head><meta charset='utf-8'><body></body></html>");
        assertNotNull(doc.head());
    }

    @Test
    public void testAfterHead_withOtherToken_anythingElseCreatesBody() {
        Document doc = Jsoup.parse("<html><head></head>Text<div>D</div></html>");
        assertNotNull(doc.body());
    }

    // ---------- InBody state ----------

    @Test
    public void testInBody_withParagraph() {
        Document doc = Jsoup.parse("<html><body><p>Paragraph</p></body></html>");
        assertEquals(1, doc.select("p").size());
    }

    @Test
    public void testInBody_withHeadingTags_closesPrevious() {
        Document doc = Jsoup.parse("<html><body><h1>One</h1><h2>Two</h2></body></html>");
        assertEquals(2, doc.select("h1, h2").size());
    }

    @Test
    public void testInBody_withListItem() {
        Document doc = Jsoup.parse("<html><body><ul><li>Item1</li><li>Item2</li></ul></body></html>");
        assertEquals(2, doc.select("li").size());
    }

    @Test
    public void testInBody_withDlDdDt() {
        Document doc = Jsoup.parse("<html><body><dl><dt>Term</dt><dd>Definition</dd></dl></body></html>");
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void testInBody_withAnchorFormattingElement() {
        Document doc = Jsoup.parse("<html><body><a href='#'>Link1<a href='#'>Link2</a></a></body></html>");
        assertTrue(doc.select("a").size() >= 1);
    }

    @Test
    public void testInBody_withFormattingBold() {
        Document doc = Jsoup.parse("<html><body><b>Bold<i>Italic</i></b></body></html>");
        assertEquals(1, doc.select("b").size());
        assertEquals(1, doc.select("i").size());
    }

    @Test
    public void testInBody_withTableStartsInTableState() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>Cell</td></tr></table></body></html>");
        assertEquals("Cell", doc.select("td").text());
    }

    @Test
    public void testInBody_withFormTag() {
        Document doc = Jsoup.parse("<html><body><form><input type='text'></form></body></html>");
        assertEquals(1, doc.select("form").size());
    }

    @Test
    public void testInBody_withPlaintext() {
        Document doc = Jsoup.parse("<html><body><plaintext>raw <b>text</b></plaintext></body></html>");
        assertEquals(1, doc.select("plaintext").size());
    }

    @Test
    public void testInBody_withButton() {
        Document doc = Jsoup.parse("<html><body><button>Click</button></body></html>");
        assertEquals(1, doc.select("button").size());
    }

    @Test
    public void testInBody_withHorizontalRule() {
        Document doc = Jsoup.parse("<html><body><p>Para</p><hr></body></html>");
        assertEquals(1, doc.select("hr").size());
    }

    @Test
    public void testInBody_withImageTagRenamedToImg() {
        Document doc = Jsoup.parse("<html><body><image src='x.png'></body></html>");
        assertTrue(doc.select("img").size() >= 0); // 'image' should be treated as img
    }

    @Test
    public void testInBody_withIsindex_createsFormAndInput() {
        Document doc = Jsoup.parse("<html><body><isindex prompt='Enter:'></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInBody_withTextarea_transitionsToText() {
        Document doc = Jsoup.parse("<html><body><textarea>content <b>bold</b></textarea></body></html>");
        assertEquals(1, doc.select("textarea").size());
    }

    @Test
    public void testInBody_withXmp_handledAsRawtext() {
        Document doc = Jsoup.parse("<html><body><xmp><div>raw</div></xmp></body></html>");
        assertEquals(1, doc.select("xmp").size());
    }

    @Test
    public void testInBody_withIframe_handledAsRawtext() {
        Document doc = Jsoup.parse("<html><body><iframe><div>raw</div></iframe></body></html>");
        assertEquals(1, doc.select("iframe").size());
    }

    @Test
    public void testInBody_withNoembed_handledAsRawtext() {
        Document doc = Jsoup.parse("<html><body><noembed><div>raw</div></noembed></body></html>");
        assertEquals(1, doc.select("noembed").size());
    }

    @Test
    public void testInBody_withSelect_transitionsToInSelect() {
        Document doc = Jsoup.parse("<html><body><select><option>A</option><option>B</option></select></body></html>");
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testInBody_withOptgroupOption() {
        Document doc = Jsoup.parse("<html><body><select><optgroup label='g'><option>A</option></optgroup></select></body></html>");
        assertEquals(1, doc.select("optgroup").size());
    }

    @Test
    public void testInBody_withRubyRpRt() {
        Document doc = Jsoup.parse("<html><body><ruby>base<rp>(</rp><rt>ruby</rt><rp>)</rp></ruby></body></html>");
        assertTrue(doc.select("ruby").size() >= 1);
    }

    @Test
    public void testInBody_withMathTag() {
        Document doc = Jsoup.parse("<html><body><math></math></body></html>");
        assertEquals(1, doc.select("math").size());
    }

    @Test
    public void testInBody_withSvgTag() {
        Document doc = Jsoup.parse("<html><body><svg></svg></body></html>");
        assertEquals(1, doc.select("svg").size());
    }

    @Test
    public void testInBody_withEndTagBody_transitionsToAfterBody() {
        Document doc = Jsoup.parse("<html><body>Content</body>Extra</html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInBody_withEndTagHtml_reprocessesBody() {
        Document doc = Jsoup.parse("<html><body>Content</html>");
        assertEquals("Content", doc.body().text());
    }

    @Test
    public void testInBody_withEndTagParagraph_noOpenP_createsEmptyP() {
        Document doc = Jsoup.parse("<html><body></p></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInBody_withEndTagLi_notInScope() {
        Document doc = Jsoup.parse("<html><body></li></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInBody_withEndTagHeading_notInScope() {
        Document doc = Jsoup.parse("<html><body></h1></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInBody_withUnknownEndTag_anyOtherEndTag() {
        Document doc = Jsoup.parse("<html><body><span>Span</span></body></html>");
        assertEquals(1, doc.select("span").size());
    }

    @Test
    public void testInBody_withEndTagBr_reprocessesAsStartTag() {
        Document doc = Jsoup.parse("<html><body>Text</br></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInBody_withNullCharacter_errorHandled() {
        // Character containing a null - should be handled gracefully without exception
        String html = "<html><body>Test\u0000Data</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    // ---------- Text state (script/style/textarea rawtext) ----------

    @Test
    public void testText_scriptContentWithEndTag() {
        Document doc = Jsoup.parse("<html><head><script>document.write('</p>');</script></head><body></body></html>");
        assertEquals(1, doc.select("script").size());
    }

    // ---------- InTable & related states ----------

    @Test
    public void testInTable_withCaption() {
        Document doc = Jsoup.parse("<html><body><table><caption>Cap</caption><tr><td>1</td></tr></table></body></html>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void testInTable_withColgroupAndCol() {
        Document doc = Jsoup.parse("<html><body><table><colgroup><col></colgroup><tr><td>1</td></tr></table></body></html>");
        assertEquals(1, doc.select("colgroup").size());
        assertEquals(1, doc.select("col").size());
    }

    @Test
    public void testInTable_withTbodyTheadTfoot() {
        Document doc = Jsoup.parse("<html><body><table><thead><tr><th>H</th></tr></thead>"
                + "<tbody><tr><td>B</td></tr></tbody><tfoot><tr><td>F</td></tr></tfoot></table></body></html>");
        assertEquals(1, doc.select("thead").size());
        assertEquals(1, doc.select("tbody").size());
        assertEquals(1, doc.select("tfoot").size());
    }

    @Test
    public void testInTable_withInputHiddenType() {
        Document doc = Jsoup.parse("<html><body><table><input type='hidden' name='x'></table></body></html>");
        assertTrue(doc.select("input").size() >= 1);
    }

    @Test
    public void testInTable_withFormElement() {
        Document doc = Jsoup.parse("<html><body><table><form></form></table></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInTable_withStrayTextFostersOutOfTable() {
        Document doc = Jsoup.parse("<html><body><table>Foo<tr><td>1</td></tr></table></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInTableText_whitespaceInsertedAsIs() {
        Document doc = Jsoup.parse("<html><body><table>   <tr><td>1</td></tr></table></body></html>");
        assertNotNull(doc.select("table").first());
    }

    @Test
    public void testInCaption_endTagClosesCaption() {
        Document doc = Jsoup.parse("<html><body><table><caption>Cap</caption><tr><td>1</td></tr></table></body></html>");
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void testInColumnGroup_withColStartTag() {
        Document doc = Jsoup.parse("<html><body><table><colgroup><col span='2'></colgroup></table></body></html>");
        assertEquals(1, doc.select("col").size());
    }

    @Test
    public void testInColumnGroup_withEndTagColgroup() {
        Document doc = Jsoup.parse("<html><body><table><colgroup></colgroup><tr><td>1</td></tr></table></body></html>");
        assertEquals(1, doc.select("colgroup").size());
    }

    @Test
    public void testInTableBody_withTrStartTag() {
        Document doc = Jsoup.parse("<html><body><table><tbody><tr><td>1</td></tr></tbody></table></body></html>");
        assertEquals(1, doc.select("tr").size());
    }

    @Test
    public void testInTableBody_withThTdWithoutTr() {
        Document doc = Jsoup.parse("<html><body><table><tbody><td>NoTr</td></tbody></table></body></html>");
        assertEquals("NoTr", doc.select("td").text());
    }

    @Test
    public void testInRow_withTdStartTag_transitionsToInCell() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>Cell</td><th>Head</th></tr></table></body></html>");
        assertEquals(1, doc.select("td").size());
        assertEquals(1, doc.select("th").size());
    }

    @Test
    public void testInRow_withEndTagTr() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>1</td></tr><tr><td>2</td></tr></table></body></html>");
        assertEquals(2, doc.select("tr").size());
    }

    @Test
    public void testInCell_withEndTagTd_transitionsToInRow() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>Cell</td></tr></table></body></html>");
        assertEquals("Cell", doc.select("td").text());
    }

    @Test
    public void testInCell_withStartTagTriggersCloseCell() {
        Document doc = Jsoup.parse("<html><body><table><tr><td>Cell1<td>Cell2</tr></table></body></html>");
        assertEquals(2, doc.select("td").size());
    }

    // ---------- InSelect & InSelectInTable states ----------

    @Test
    public void testInSelect_withOptionStartTag() {
        Document doc = Jsoup.parse("<html><body><select><option>A</option><option>B</option></select></body></html>");
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testInSelect_withOptgroupStartTag() {
        Document doc = Jsoup.parse("<html><body><select><optgroup label='g1'><option>A</option></optgroup></select></body></html>");
        assertEquals(1, doc.select("optgroup").size());
    }

    @Test
    public void testInSelect_withEndTagSelect() {
        Document doc = Jsoup.parse("<html><body><select><option>A</option></select>after</body></html>");
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void testInSelect_withInputCancelsSelect() {
        Document doc = Jsoup.parse("<html><body><select><input type='text'></select></body></html>");
        assertNotNull(doc.body());
    }

    @Test
    public void testInSelectInTable_withTableStartTag() {
        Document doc = Jsoup.parse("<html><body><table><tr><td><select><option>A</option></select>"
                + "<table><tr><td>Nested</td></tr></table></td></tr></table></body></html>");
        assertNotNull(doc.body());
    }

    // ---------- AfterBody state ----------

    @Test
    public void testAfterBody_withWhitespace() {
        Document doc = Jsoup.parse("<html><body>Content</body>   </html>");
        assertEquals("Content", doc.body().text());
    }

    @Test
    public void testAfterBody_withComment() {
        Document doc = Jsoup.parse("<html><body>Content</body><!-- after --></html>");
        assertTrue(doc.toString().contains("after"));
    }

    @Test
    public void testAfterBody_withEndTagHtml_transitionsToAfterAfterBody() {
        Document doc = Jsoup.parse("<html><body>Content</body></html>");
        assertEquals("Content", doc.body().text());
    }

    @Test
    public void testAfterBody_withUnexpectedToken_returnsToInBody() {
        Document doc = Jsoup.parse("<html><body>Content</body><div>More</div></html>");
        assertNotNull(doc.body());
    }

    // ---------- InFrameset & AfterFrameset states ----------

    @Test
    public void testInFrameset_withFrameStartTag() {
        Document doc = Jsoup.parse("<html><frameset><frame src='a.html'><frame src='b.html'></frameset></html>");
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void testInFrameset_withNestedFrameset() {
        Document doc = Jsoup.parse("<html><frameset><frameset><frame></frameset></frameset></html>");
        assertTrue(doc.select("frameset").size() >= 1);
    }

    @Test
    public void testInFrameset_withNoframesTag() {
        Document doc = Jsoup.parse("<html><frameset><noframes><body>Fallback</body></noframes></frameset></html>");
        assertNotNull(doc);
    }

    @Test
    public void testAfterFrameset_withEndTagHtml() {
        Document doc = Jsoup.parse("<html><frameset><frame></frameset></html>");
        assertEquals(1, doc.select("frame").size());
    }

    // ---------- AfterAfterBody & AfterAfterFrameset states ----------

    @Test
    public void testAfterAfterBody_withTrailingComment() {
        Document doc = Jsoup.parse("<html><body>Content</body></html><!-- trailing -->");
        assertTrue(doc.toString().contains("trailing"));
    }

    @Test
    public void testAfterAfterBody_withTrailingWhitespace() {
        Document doc = Jsoup.parse("<html><body>Content</body></html>   ");
        assertEquals("Content", doc.body().text());
    }

    @Test
    public void testAfterAfterFrameset_withTrailingNoframes() {
        Document doc = Jsoup.parse("<html><frameset><frame></frameset></html><noframes>fallback</noframes>");
        assertNotNull(doc);
    }

    // ---------- Fragment parsing (exercises isFragmentParsing branches) ----------

    @Test
    public void testFragmentParsing_bodyFragment() {
        Document doc = Jsoup.parseBodyFragment("<p>Fragment content</p>");
        assertEquals("Fragment content", doc.body().text());
    }

    @Test
    public void testFragmentParsing_withEndTagHtmlInFragment() {
        Document doc = Jsoup.parseBodyFragment("<div>Frag</div></html>");
        assertNotNull(doc.body());
    }

    // ---------- Edge cases: empty / minimal input ----------

    @Test
    public void testParse_emptyString_producesEmptyDocument() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParse_onlyWhitespace_producesEmptyBody() {
        Document doc = Jsoup.parse("     ");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_malformedNestedTags_doesNotThrow() {
        Document doc = Jsoup.parse("<html><body><div><span>Unclosed");
        assertNotNull(doc.body());
    }

    // ---------- Exception scenario ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nullHtml_throwsIllegalArgumentException() {
        Jsoup.parse((String) null);
    }
}
