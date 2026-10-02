package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class SelectorTest {

    private Document doc;

    @Before
    public void setUp() {
        String html = "<html><head><title>Test</title></head><body>" +
            "<div id='1' class='foo bar'>" +
            "<p class='foo'>One</p>" +
            "<p id='2'>Two</p>" +
            "<span data-test='x' title='t'>Span</span>" +
            "</div>" +
            "<div id='3'>" +
            "<a href='http://example.com'>Link</a>" +
            "<a href='http://test.com'>Link2</a>" +
            "</div>" +
            "<ul>" +
            "<li>Item1</li>" +
            "<li>Item2</li>" +
            "<li>Item3</li>" +
            "</ul>" +
            "</body></html>";
        doc = Jsoup.parse(html);
    }

    @Test
    public void testSelect_byTag_returnsMatchingElements() {
        Elements els = Selector.select("div", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_byId_returnsMatchingElement() {
        Elements els = Selector.select("#1", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_byClass_returnsMatchingElements() {
        Elements els = Selector.select(".foo", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_universalSelector_returnsAllElements() {
        Elements els = Selector.select("*", doc);
        assertTrue(els.size() > 0);
    }

    @Test
    public void testSelect_attributeSelector_returnsMatchingElements() {
        Elements els = Selector.select("[data-test]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeStartingSelector_returnsMatchingElements() {
        Elements els = Selector.select("[^data-]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeValueEquals_returnsMatchingElements() {
        Elements els = Selector.select("[title=t]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeValueNotEquals_returnsMatchingElements() {
        Elements els = Selector.select("div[id!=1]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeValueStarting_returnsMatchingElements() {
        Elements els = Selector.select("a[href^=http://example]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeValueEnding_returnsMatchingElements() {
        Elements els = Selector.select("a[href$=.com]", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_attributeValueContaining_returnsMatchingElements() {
        Elements els = Selector.select("a[href*=example]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_attributeValueMatching_returnsMatchingElements() {
        Elements els = Selector.select("a[href~=^http.*]", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_indexLessThan_returnsMatchingElements() {
        Elements els = Selector.select("li:lt(2)", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_indexGreaterThan_returnsMatchingElements() {
        Elements els = Selector.select("li:gt(0)", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_indexEquals_returnsMatchingElements() {
        Elements els = Selector.select("li:eq(1)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_has_returnsMatchingElements() {
        Elements els = Selector.select("div:has(p)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_containsText_returnsMatchingElements() {
        Elements els = Selector.select("p:contains(One)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_containsOwnText_returnsMatchingElements() {
        Elements els = Selector.select("p:containsOwn(Two)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_matchesRegex_returnsMatchingElements() {
        Elements els = Selector.select("li:matches(Item\\d)", doc);
        assertEquals(3, els.size());
    }

    @Test
    public void testSelect_matchesOwnRegex_returnsMatchingElements() {
        Elements els = Selector.select("li:matchesOwn(Item\\d)", doc);
        assertEquals(3, els.size());
    }

    @Test
    public void testSelect_not_returnsMatchingElements() {
        Elements els = Selector.select("div:not(#1)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_childCombinator_returnsMatchingElements() {
        Elements els = Selector.select("div > p", doc);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_descendantCombinator_returnsMatchingElements() {
        Elements els = Selector.select("div p", doc);
        assertEquals(2, els.size());
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
        Elements els = Selector.select("div, ul", doc);
        assertEquals(3, els.size());
    }

    @Test
    public void testSelect_startsWithCombinator_usesRoot() {
        Elements els = Selector.select("> p", doc.body());
        assertNotNull(els);
    }

    @Test
    public void testSelect_startsWithHasCombinator_addsAllElements() {
        Elements els = Selector.select(":has(p)", doc);
        assertTrue(els.size() > 0);
    }

    @Test
    public void testSelect_namespaceSelector_returnsMatchingElements() {
        String html = "<fb:name>Test</fb:name>";
        Document d = Jsoup.parse(html);
        Elements els = Selector.select("fb|name", d);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_withIterableRoots_returnsMatchingElements() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc);
        Elements els = Selector.select("div", roots);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelect_multipleClassesCombined_returnsMatchingElements() {
        Elements els = Selector.select("div.foo", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testSelect_noMatches_returnsEmptyElements() {
        Elements els = Selector.select("nonexistent", doc);
        assertTrue(els.isEmpty());
    }

    @Test
    public void testSelect_attributeNoValueWithCaret_returnsElementsStartingWithPrefix() {
        Elements els = Selector.select("span[^data-]", doc);
        assertEquals(1, els.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullQuery_throwsException() {
        Selector.select(null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQuery_throwsException() {
        Selector.select("", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRoot_throwsException() {
        Selector.select("div", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQueryIterable_throwsException() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc);
        Selector.select("", roots);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRootsIterable_throwsException() {
        Selector.select("div", (Iterable<Element>) null);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect_invalidSyntax_throwsSelectorParseException() {
        Selector.select("!@#$", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_invalidIdEmpty_throwsException() {
        Selector.select("#", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_invalidAttributeEmptyKey_throwsException() {
        Selector.select("[]", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_notEmptySubselect_throwsException() {
        Selector.select("div:not()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_containsEmptyText_throwsException() {
        Selector.select("p:contains()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_hasEmptySubselect_throwsException() {
        Selector.select("div:has()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_indexNonNumeric_throwsException() {
        Selector.select("li:eq(abc)", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_matchesEmptyRegex_throwsException() {
        Selector.select("li:matches()", doc);
    }

    @Test
    public void testSelect_emptyBodyNoChildren_returnsEmptyElements() {
        Document emptyDoc = Jsoup.parse("<html><body></body></html>");
        Elements els = Selector.select("div", emptyDoc);
        assertTrue(els.isEmpty());
    }

    @Test
    public void testSelect_multipleRootsIterable_aggregatesResults() {
        Document doc2 = Jsoup.parse("<div id='4'>Extra</div>");
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc);
        roots.add(doc2);
        Elements els = Selector.select("div", roots);
        assertEquals(3, els.size());
    }
}
