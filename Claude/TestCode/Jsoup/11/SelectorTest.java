import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class SelectorTest {

    private Document doc;

    @Before
    public void setUp() {
        String html = "<html><head></head><body>"
                + "<div id='wrap' class='header main'>"
                + "<p class='intro'>Hello <b>world</b></p>"
                + "<p id='second'>Second paragraph with jsoup text</p>"
                + "<ul>"
                + "<li>One</li>"
                + "<li>Two</li>
                + "<li>Three</li>"
                + "</ul>"
                + "<a href='http://example.com/page' title='Example'>Link</a>"
                + "<div data-foo='bar' class='footer'>Footer</div>"
                + "</div>"
                + "<h1>Heading</h1>"
                + "<p>After heading</p>"
                + "</body></html>";
        doc = Jsoup.parse(html);
    }

    // ---- Normal / typical cases ----

    @Test
    public void testSelect_byTag_returnsMatchingElements() {
        Elements els = Selector.select("p", doc);
        assertEquals(4, els.size());
    }

    @Test
    public void testSelect_byId_returnsSingleElement() {
        Elements els = Selector.select("#wrap", doc);
        assertEquals(1, els.size());
        assertEquals("wrap", els.first().id());
    }

    @Test
    public void testSelect_byClass_returnsMatchingElements() {
        Elements els = Selector.select(".header", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_universalSelector_returnsAllElements() {
        Elements els = Selector.select("*", doc);
        assertTrue(els.size() > 5);
    }

    @Test
    public void testSelect_attributeExists_returnsMatchingElements() {
        Elements els = Selector.select("[href]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributePrefix_returnsMatchingElements() {
        Elements els = Selector.select("[^data-]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeEquals_returnsMatchingElements() {
        Elements els = Selector.select("a[href=http://example.com/page]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeNotEquals_returnsMatchingElements() {
        Elements els = Selector.select("div[class!=header main]", doc);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testSelect_attributeStartsWith_returnsMatchingElements() {
        Elements els = Selector.select("a[href^=http:]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeEndsWith_returnsMatchingElements() {
        Elements els = Selector.select("a[href$=page]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeContains_returnsMatchingElements() {
        Elements els = Selector.select("a[href*=example]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeMatchesRegex_returnsMatchingElements() {
        Elements els = Selector.select("a[href~=^http.*]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_descendantCombinator_returnsMatchingElements() {
        Elements els = Selector.select("div p", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_childCombinator_returnsMatchingElements() {
        Elements els = Selector.select("ul > li", doc);
        assertEquals(3, els.size());
    }

    @Test
    public void testSelect_adjacentSiblingCombinator_returnsMatchingElements() {
        Elements els = Selector.select("li + li", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_generalSiblingCombinator_returnsMatchingElements() {
        Elements els = Selector.select("li ~ li", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_groupOrCombinator_returnsMatchingElements() {
        Elements els = Selector.select("h1, #second", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_startsWithCombinatorSpace_usesRootAsElement() {
        Elements els = Selector.select(" p", doc.body());
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testSelect_pseudoLessThan_returnsMatchingElements() {
        Elements els = Selector.select("li:lt(2)", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_pseudoGreaterThan_returnsMatchingElements() {
        Elements els = Selector.select("li:gt(0)", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_pseudoEquals_returnsMatchingElements() {
        Elements els = Selector.select("li:eq(0)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_pseudoHas_returnsMatchingElements() {
        Elements els = Selector.select("p:has(b)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_pseudoContains_returnsMatchingElements() {
        Elements els = Selector.select("p:contains(jsoup)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_pseudoContainsOwn_returnsMatchingElements() {
        Elements els = Selector.select("p:containsOwn(jsoup)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_pseudoMatches_returnsMatchingElements() {
        Elements els = Selector.select("p:matches(\\d*jsoup\\w*)", doc);
        assertEquals(0, els.size());
    }

    @Test
    public void testSelect_pseudoMatchesText_returnsMatchingElements() {
        Elements els = Selector.select("p:matches((?i)jsoup)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_pseudoMatchesOwn_returnsMatchingElements() {
        Elements els = Selector.select("p:matchesOwn((?i)jsoup)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_combinedSelectors_returnsMatchingElements() {
        Elements els = Selector.select("div.header p.intro", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_withIterableRoots_returnsUnionOfMatches() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc.body());
        Elements els = Selector.select("p", roots);
        assertEquals(4, els.size());
    }

    @Test
    public void testSelect_namespaceTagSelector_returnsMatchingElements() {
        Document nsDoc = Jsoup.parse("<fb:name>Foo</fb:name>");
        Elements els = Selector.select("fb|name", nsDoc);
        assertEquals(1, els.size());
    }

    // ---- Edge cases ----

    @Test
    public void testSelect_noMatch_returnsEmptyElements() {
        Elements els = Selector.select(".nonexistent", doc);
        assertTrue(els.isEmpty());
    }

    @Test
    public void testSelect_idNotFound_returnsEmptyElements() {
        Elements els = Selector.select("#doesnotexist", doc);
        assertTrue(els.isEmpty());
    }

    @Test
    public void testSelect_indexEqualsZero_returnsFirstElement() {
        Elements els = Selector.select("li:eq(0)", doc);
        assertEquals("One", els.first().text());
    }

    @Test
    public void testSelect_queryWithWhitespace_trimsAndParsesCorrectly() {
        Elements els = Selector.select("   p   ", doc);
        assertEquals(4, els.size());
    }

    @Test
    public void testSelect_withEmptyRootsIterable_returnsEmptyElements() {
        List<Element> roots = new ArrayList<Element>();
        Elements els = Selector.select("p", roots);
        assertTrue(els.isEmpty());
    }

    // ---- Exception cases ----

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullQuery_throwsException() {
        Selector.select(null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQuery_throwsException() {
        Selector.select("", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_blankQuery_throwsException() {
        Selector.select("   ", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRoot_throwsException() {
        Selector.select("p", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRootsIterable_throwsException() {
        Selector.select("p", (Iterable<Element>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQueryWithIterableRoots_throwsException() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc);
        Selector.select("", roots);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect_invalidTokenQuery_throwsSelectorParseException() {
        Selector.select("@invalid", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_indexNotNumeric_throwsException() {
        Selector.select("li:eq(abc)", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_hasWithEmptySubQuery_throwsException() {
        Selector.select("div:has()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_containsWithEmptyText_throwsException() {
        Selector.select("p:contains()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_matchesWithEmptyRegex_throwsException() {
        Selector.select("p:matches()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_idSelectorEmpty_throwsException() {
        Selector.select("#", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_classSelectorEmpty_throwsException() {
        Selector.select(".", doc);
    }
}
