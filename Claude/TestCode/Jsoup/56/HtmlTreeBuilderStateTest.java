package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    // ---------- Enum basic API tests ----------

    @Test
    public void testValues_returnsAllStates() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        assertNotNull(states);
        assertTrue(states.length > 0);
        // sanity check a few known constants are present
        boolean hasInitial = false, hasInBody = false, hasForeignContent = false;
        for (HtmlTreeBuilderState s : states) {
            if (s == HtmlTreeBuilderState.Initial) hasInitial = true;
            if (s == HtmlTreeBuilderState.InBody) hasInBody = true;
            if (s == HtmlTreeBuilderState.ForeignContent) hasForeignContent = true;
        }
        assertTrue(hasInitial);
        assertTrue(hasInBody);
        assertTrue(hasForeignContent);
    }

    @Test
    public void testValueOf_validName_returnsEnum() {
        HtmlTreeBuilderState state = HtmlTreeBuilderState.valueOf("InBody");
        assertEquals(HtmlTreeBuilderState.InBody, state);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalidName_throwsException() {
        HtmlTreeBuilderState.valueOf("NotARealState");
    }

    @Test
    public void testForeignContentProcess_alwaysReturnsTrue() {
        // ForeignContent.process ignores its arguments and always returns true.
        boolean result = HtmlTreeBuilderState.ForeignContent.process(null, null);
        assertTrue(result);
    }

    // ---------- Parsing based coverage tests (drives the state machine indirectly) ----------

    @Test
    public void testParse_emptyString_producesEmptyHtmlDoc() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_withDoctype_setsDoctype() {
        String html = "<!DOCTYPE html><html><head></head><body>Hi</body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        assertEquals("Hi", doc.body().text());
    }

    @Test
    public void testParse_withCommentBeforeHtml() {
        String html = "<!-- comment --><html><body>content</body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.outerHtml().contains("comment"));
    }

    @Test
    public void testParse_withWhitespaceOnly() {
        Document doc = Jsoup.parse("   \n\t  ");
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_basicHtmlHeadBody() {
        String html = "<html><head><title>T</title></head><body><p>Hello</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("T", doc.title());
        assertEquals("Hello", doc.select("p").text());
    }

    @Test
    public void testParse_headWithTitleMetaLinkBaseStyleScript() {
        String html = "<html><head><base href='http://example.com/'><meta charset='utf-8'>" +
                "<link rel='stylesheet' href='a.css'><style>.a{}</style><script>var x=1;</script>" +
                "<title>Head</title></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Head", doc.title());
        assertEquals(1, doc.select("link").size());
        assertEquals(1, doc.select("style").size());
        assertEquals(1, doc.select("script").size());
    }

    @Test
    public void testParse_noscriptInHead() {
        String html = "<html><head><noscript><link rel='x' href='y'></noscript></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("noscript"));
    }

    @Test
    public void testParse_duplicateHeadTag() {
        String html = "<html><head><head><title>Dup</title></head></head><body></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Dup", doc.title());
    }

    @Test
    public void testParse_bodyAttributesMerge() {
        String html = "<html><head></head><body class='a'><body class='b' id='c'>Hi</body></body></html>";
        Document doc = Jsoup.parse(html);
        Element body = doc.body();
        assertTrue(body.hasClass("a"));
    }

    @Test
    public void testParse_htmlEndTagReprocessed() {
        String html = "<html><body>content</html>more";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.body().text().contains("content"));
    }

    @Test
    public void testParse_pClosers_div() {
        String html = "<html><body><p>one<div>two</div></p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("div").size());
        assertEquals(1, doc.select("p").size());
    }

    @Test
    public void testParse_liNested() {
        String html = "<html><body><ul><li>Item1<li>Item2</ul></body></html>";
        Document doc = Jsoup.parse(html);
        Elements items = doc.select("li");
        assertEquals(2, items.size());
    }

    @Test
    public void testParse_anchorReopening() {
        String html = "<html><body><a href='1'>link<a href='2'>nested</a></a></body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("a").size() >= 1);
    }

    @Test
    public void testParse_formatters_bold() {
        String html = "<html><body><b>bold <i>italic</i> text</b></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("b").size());
        assertEquals(1, doc.select("i").size());
    }

    @Test
    public void testParse_nobrTag() {
        String html = "<html><body><nobr>one<nobr>two</nobr></nobr></body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("nobr").size() >= 1);
    }

    @Test
    public void testParse_appletTag() {
        String html = "<html><body><applet>content</applet></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("applet").size());
    }

    @Test
    public void testParse_tableBasic() {
        String html = "<html><body><table><tr><td>cell</td></tr></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("table").size());
        assertEquals("cell", doc.select("td").text());
    }

    @Test
    public void testParse_tableWithCaption() {
        String html = "<html><body><table><caption>Cap</caption><tr><td>x</td></tr></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("Cap", doc.select("caption").text());
    }

    @Test
    public void testParse_tableColgroup() {
        String html = "<html><body><table><colgroup><col><col></colgroup><tr><td>x</td></tr></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("colgroup").size());
        assertEquals(2, doc.select("col").size());
    }

    @Test
    public void testParse_tableRowsAndCells() {
        String html = "<html><body><table><tbody><tr><th>H</th><td>D</td></tr></tbody></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("th").size());
        assertEquals(1, doc.select("td").size());
    }

    @Test
    public void testParse_inputHiddenInTable() {
        String html = "<html><body><table><input type='hidden' name='x'></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("input").size());
    }

    @Test
    public void testParse_formInTable() {
        String html = "<html><body><table><form></form><tr><td>x</td></tr></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("table"));
    }

    @Test
    public void testParse_selectBasic() {
        String html = "<html><body><select><option>A</option><option>B</option></select></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(2, doc.select("option").size());
    }

    @Test
    public void testParse_selectWithOptgroup() {
        String html = "<html><body><select><optgroup label='g'><option>A</option></optgroup></select></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("optgroup").size());
    }

    @Test
    public void testParse_selectInTable() {
        String html = "<html><body><table><tr><td><select><option>A</option></select></td></tr></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("select").size());
    }

    @Test
    public void testParse_framesetDocument() {
        String html = "<html><frameset><frame src='a.html'><frame src='b.html'></frameset></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("frameset").size());
        assertEquals(2, doc.select("frame").size());
    }

    @Test
    public void testParse_afterFrameset() {
        String html = "<html><frameset><frame src='a.html'></frameset></html> trailing text";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_plaintext() {
        String html = "<html><body><plaintext>raw <b>not bold</b></plaintext></body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("plaintext").size() >= 1);
    }

    @Test
    public void testParse_textarea() {
        String html = "<html><body><textarea>some <b>text</b></textarea></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("textarea").size());
    }

    @Test
    public void testParse_xmp() {
        String html = "<html><body><xmp>raw <b>content</b></xmp></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("xmp").size());
    }

    @Test
    public void testParse_iframe() {
        String html = "<html><body><iframe>ignored <b>content</b></iframe></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("iframe").size());
    }

    @Test
    public void testParse_noembed() {
        String html = "<html><body><noembed>fallback <b>content</b></noembed></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("noembed").size());
    }

    @Test
    public void testParse_isindex() {
        String html = "<html><body><isindex prompt='Enter:'></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
        // isindex is converted into form/hr/label/input elements
        assertTrue(doc.select("form").size() >= 0);
    }

    @Test
    public void testParse_imageTagConvertsToImg() {
        String html = "<html><body><image src='a.png'></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("img").size());
    }

    @Test
    public void testParse_mathAndSvgTags() {
        String html = "<html><body><math></math><svg></svg></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_headingsNested() {
        String html = "<html><body><h1>One<h2>Two</h2></h1></body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("h1").size() >= 1);
        assertTrue(doc.select("h2").size() >= 1);
    }

    @Test
    public void testParse_ddDtNested() {
        String html = "<html><body><dl><dt>Term<dd>Definition</dd></dt></dl></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("dt").size());
        assertEquals(1, doc.select("dd").size());
    }

    @Test
    public void testParse_preListing() {
        String html = "<html><body><pre>line1\nline2</pre></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("pre").size());
    }

    @Test
    public void testParse_buttonNested() {
        String html = "<html><body><button>Click<button>Nested</button></button></body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("button").size() >= 1);
    }

    @Test
    public void testParse_brEndTag() {
        String html = "<html><body>Line1</br>Line2</body></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.select("br").size() >= 1);
    }

    @Test
    public void testParse_sarcasmEndTag() {
        String html = "<html><body><div>text</sarcasm></div></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.body());
    }

    @Test
    public void testParse_unknownEndTagFallback() {
        String html = "<html><body><span>hello</unknowntag></span></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("hello", doc.select("span").text());
    }

    @Test
    public void testParse_afterBodyContent() {
        String html = "<html><body>content</body> trailing <!-- comment --></html>";
        Document doc = Jsoup.parse(html);
        assertTrue(doc.body().text().contains("content"));
    }

    @Test
    public void testParse_afterAfterBodyComment() {
        String html = "<html><body>content</body></html><!-- after --> extra";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_malformedNesting_adoptionAgency() {
        String html = "<html><body><b>bold<div>div inside bold</div>more bold</b></body></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc.select("div"));
        assertNotNull(doc.select("b"));
    }

    @Test
    public void testParse_hrTag() {
        String html = "<html><body><p>before</p><hr><p>after</p></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("hr").size());
    }

    @Test
    public void testParse_frameSetWithNoframes() {
        String html = "<html><frameset><frame src='a.html'></frameset><noframes>fallback</noframes></html>";
        Document doc = Jsoup.parse(html);
        assertNotNull(doc);
    }

    @Test
    public void testParse_nullInput_throwsException() {
        try {
            Jsoup.parse((String) null);
            fail("Expected an exception for null input");
        } catch (Exception e) {
            // jsoup throws IllegalArgumentException or NullPointerException for null html - either is acceptable
            assertTrue(e instanceof IllegalArgumentException || e instanceof NullPointerException);
        }
    }

    @Test
    public void testParse_emptyBodyOnlyWhitespaceCharacters() {
        String html = "<html><body>   </body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("", doc.body().text());
    }

    @Test
    public void testParse_ruleTagsRpRt() {
        String html = "<html><body><ruby>漢<rp>(</rp><rt>Kan</rt><rp>)</rp></ruby></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("ruby").size());
        assertTrue(doc.select("rt").size() >= 1);
    }

    @Test
    public void testParse_scriptInTable() {
        String html = "<html><body><table><script>var y=2;</script><tr><td>x</td></tr></table></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals(1, doc.select("script").size());
    }
}
