package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SelectorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullQuery_throwsException() {
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        Selector.select(null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQuery_throwsException() {
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        Selector.select("   ", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRoot_throwsException() {
        Selector.select("div", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_iterableRoots_nullRoots_throwsException() {
        Selector.select("p", (Iterable<Element>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_iterableRoots_emptyQuery_throwsException() {
        Document doc = Jsoup.parse("<p>Hello</p>");
        Selector.select("", Collections.singletonList(doc.body()));
    }

    @Test
    public void testSelect_iterableRoots_validInput_returnsElements() {
        Document doc1 = Jsoup.parse("<div><p>One</p></div>");
        Document doc2 = Jsoup.parse("<div><p>Two</p></div>");
        List<Element> roots = Arrays.asList(doc1.body(), doc2.body());

        Elements elements = Selector.select("p", roots);
        assertEquals(2, elements.size());
        assertEquals("One", elements.get(0).text());
        assertEquals("Two", elements.get(1).text());
    }

    @Test
    public void testSelect_byTag() {
        Document doc = Jsoup.parse("<div><p>Para 1</p><p>Para 2</p><span>Span 1</span></div>");
        Elements ps = Selector.select("p", doc);
        assertEquals(2, ps.size());
        assertEquals("Para 1", ps.get(0).text());
    }

    @Test
    public void testSelect_byTagWithNamespace() {
        Document doc = Jsoup.parse("<xml><fb:name>Facebook</fb:name></xml>", "", org.jsoup.parser.Parser.xmlParser());
        Elements elements = Selector.select("fb|name", doc);
        assertEquals(1, elements.size());
        assertEquals("fb:name", elements.get(0).tagName());
    }

    @Test
    public void testSelect_byId() {
        Document doc = Jsoup.parse("<div id=\"content\"><p id=\"p1\">First</p><p id=\"p2\">Second</p></div>");
        Elements elements = Selector.select("#p1", doc);
        assertEquals(1, elements.size());
        assertEquals("First", elements.first().text());

        Elements notFound = Selector.select("#nonexistent", doc);
        assertEquals(0, notFound.size());
    }

    @Test
    public void testSelect_byClass() {
        Document doc = Jsoup.parse("<div class=\"main content\"><p class=\"text highlight\">P1</p><p class=\"text\">P2</p></div>");
        Elements elements = Selector.select(".text", doc);
        assertEquals(2, elements.size());

        Elements highlights = Selector.select(".highlight", doc);
        assertEquals(1, highlights.size());
        assertEquals("P1", highlights.first().text());
    }

    @Test
    public void testSelect_allElements() {
        Document doc = Jsoup.parse("<div><p>One</p><span>Two</span></div>");
        Elements all = Selector.select("*", doc.body());
        assertTrue(all.size() >= 3);
    }

    @Test
    public void testSelect_byAttributePresence() {
        Document doc = Jsoup.parse("<a href=\"http://example.com\" title=\"link\">Link</a><a name=\"anchor\">Anchor</a>");
        Elements withTitle = Selector.select("[title]", doc);
        assertEquals(1, withTitle.size());
        assertEquals("Link", withTitle.first().text());
    }

    @Test
    public void testSelect_byAttributePrefix() {
        Document doc = Jsoup.parse("<div data-role=\"admin\" data-id=\"123\" class=\"user\"></div>");
        Elements dataElements = Selector.select("[^data-]", doc);
        assertEquals(1, dataElements.size());
        assertEquals("admin", dataElements.first().attr("data-role"));
    }

    @Test
    public void testSelect_byAttributeValueExact() {
        Document doc = Jsoup.parse("<input type=\"text\" name=\"user\"><input type=\"password\" name=\"pass\">");
        Elements inputs = Selector.select("[type=password]", doc);
        assertEquals(1, inputs.size());
        assertEquals("pass", inputs.first().attr("name"));
    }

    @Test
    public void testSelect_byAttributeValueNot() {
        Document doc = Jsoup.parse("<input type=\"text\" name=\"user\"><input type=\"password\" name=\"pass\">");
        Elements notPass = Selector.select("input[type!=password]", doc);
        assertEquals(1, notPass.size());
        assertEquals("user", notPass.first().attr("name"));
    }

    @Test
    public void testSelect_byAttributeValueStartingWith() {
        Document doc = Jsoup.parse("<a href=\"https://secure.com\">Secure</a><a href=\"http://insecure.com\">Insecure</a>");
        Elements secure = Selector.select("[href^=https]", doc);
        assertEquals(1, secure.size());
        assertEquals("Secure", secure.first().text());
    }

    @Test
    public void testSelect_byAttributeValueEndingWith() {
        Document doc = Jsoup.parse("<img src=\"photo.jpg\"><img src=\"graphic.png\"><img src=\"icon.png\">");
        Elements pngs = Selector.select("[src$=.png]", doc);
        assertEquals(2, pngs.size());
    }

    @Test
    public void testSelect_byAttributeValueContaining() {
        Document doc = Jsoup.parse("<a href=\"/news/tech/index.html\">Tech</a><a href=\"/sports/index.html\">Sports</a>");
        Elements news = Selector.select("[href*=/news/]", doc);
        assertEquals(1, news.size());
        assertEquals("Tech", news.first().text());
    }

    @Test
    public void testSelect_byAttributeValueMatchingRegex() {
        Document doc = Jsoup.parse("<img src=\"photo.JPG\"><img src=\"image.jpeg\"><img src=\"icon.png\">");
        Elements jpegs = Selector.select("[src~=(?i)\\.(jpg|jpeg)]", doc);
        assertEquals(2, jpegs.size());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect_byAttributeInvalidOperator_throwsException() {
        Document doc = Jsoup.parse("<div attr=\"val\"></div>");
        Selector.select("[attr?value]", doc);
    }

    @Test
    public void testSelect_pseudoIndexLessThan() {
        Document doc = Jsoup.parse("<ol><li>0</li><li>1</li><li>2</li><li>3</li></ol>");
        Elements items = Selector.select("li:lt(2)", doc);
        assertEquals(2, items.size());
        assertEquals("0", items.get(0).text());
        assertEquals("1", items.get(1).text());
    }

    @Test
    public void testSelect_pseudoIndexGreaterThan() {
        Document doc = Jsoup.parse("<ol><li>0</li><li>1</li><li>2</li><li>3</li></ol>");
        Elements items = Selector.select("li:gt(1)", doc);
        assertEquals(2, items.size());
        assertEquals("2", items.get(0).text());
        assertEquals("3", items.get(1).text());
    }

    @Test
    public void testSelect_pseudoIndexEquals() {
        Document doc = Jsoup.parse("<ol><li>0</li><li>1</li><li>2</li><li>3</li></ol>");
        Elements items = Selector.select("li:eq(2)", doc);
        assertEquals(1, items.size());
        assertEquals("2", items.first().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_pseudoIndexNonNumeric_throwsException() {
        Document doc = Jsoup.parse("<ol><li>0</li></ol>");
        Selector.select("li:eq(abc)", doc);
    }

    @Test
    public void testSelect_pseudoHas() {
        Document doc = Jsoup.parse("<div><p>Has paragraph</p></div><div><span>No paragraph</span></div>");
        Elements divsWithP = Selector.select("div:has(p)", doc);
        assertEquals(1, divsWithP.size());
        assertEquals("Has paragraph", divsWithP.first().text());
    }

    @Test
    public void testSelect_pseudoContains() {
        Document doc = Jsoup.parse("<div><p>Contains <span>Jsoup</span> text</p><p>Other</p></div>");
        Elements matches = Selector.select("p:contains(jsoup)", doc);
        assertEquals(1, matches.size());
        assertEquals("Contains Jsoup text", matches.first().text());
    }

    @Test
    public void testSelect_pseudoContainsOwn() {
        Document doc = Jsoup.parse("<p>Parent <span>Child</span></p>");
        Elements parentOwn = Selector.select("p:containsOwn(Parent)", doc);
        assertEquals(1, parentOwn.size());

        Elements childInParent = Selector.select("p:containsOwn(Child)", doc);
        assertEquals(0, childInParent.size());

        Elements childOwn = Selector.select("span:containsOwn(Child)", doc);
        assertEquals(1, childOwn.size());
    }

    @Test
    public void testSelect_pseudoMatches() {
        Document doc = Jsoup.parse("<p>Order 12345</p><p>Order ABCDE</p>");
        Elements digitOrders = Selector.select("p:matches(\\d+)", doc);
        assertEquals(1, digitOrders.size());
        assertEquals("Order 12345", digitOrders.first().text());
    }

    @Test
    public void testSelect_pseudoMatchesOwn() {
        Document doc = Jsoup.parse("<div>Order <span>12345</span></div><p>Order 67890</p>");
        Elements matches = Selector.select("div:matchesOwn(Order)", doc);
        assertEquals(1, matches.size());

        Elements noDirectDigits = Selector.select("div:matchesOwn(\\d+)", doc);
        assertEquals(0, noDirectDigits.size());

        Elements directDigits = Selector.select("p:matchesOwn(\\d+)", doc);
        assertEquals(1, directDigits.size());
    }

    @Test
    public void testSelect_combinatorDescendant() {
        Document doc = Jsoup.parse("<div><p><span>Descendant</span></p></div><span>Outer</span>");
        Elements descendants = Selector.select("div span", doc);
        assertEquals(1, descendants.size());
        assertEquals("Descendant", descendants.first().text());
    }

    @Test
    public void testSelect_combinatorChild() {
        Document doc = Jsoup.parse("<div id=\"parent\"><p><span>Child of P</span></p><span>Child of DIV</span></div>");
        Elements directChildren = Selector.select("div > span", doc);
        assertEquals(1, directChildren.size());
        assertEquals("Child of DIV", directChildren.first().text());
    }

    @Test
    public void testSelect_combinatorAdjacentSibling() {
        Document doc = Jsoup.parse("<h1>Title</h1><p>First P</p><p>Second P</p>");
        Elements adjacent = Selector.select("h1 + p", doc);
        assertEquals(1, adjacent.size());
        assertEquals("First P", adjacent.first().text());
    }

    @Test
    public void testSelect_combinatorGeneralSibling() {
        Document doc = Jsoup.parse("<h1>Title</h1><p>First P</p><p>Second P</p><span>Span</span>");
        Elements siblings = Selector.select("h1 ~ p", doc);
        assertEquals(2, siblings.size());
        assertEquals("First P", siblings.get(0).text());
        assertEquals("Second P", siblings.get(1).text());
    }

    @Test
    public void testSelect_combinatorGroupingOr() {
        Document doc = Jsoup.parse("<div><p>P</p><h1>H1</h1><span>Span</span></div>");
        Elements grouped = Selector.select("p, h1", doc);
        assertEquals(2, grouped.size());
        assertEquals("p", grouped.get(0).tagName());
        assertEquals("h1", grouped.get(1).tagName());
    }

    @Test
    public void testSelect_startsWithCombinator() {
        Document doc = Jsoup.parse("<div><p>P1</p><p>P2</p></div>");
        Element div = doc.select("div").first();
        Elements children = Selector.select("> p", div);
        assertEquals(2, children.size());
    }

    @Test
    public void testSelect_startsWithSiblingCombinator() {
        Document doc = Jsoup.parse("<div><p id=\"p1\">One</p><p id=\"p2\">Two</p><p id=\"p3\">Three</p></div>");
        Element p1 = doc.getElementById("p1");
        Elements adjacent = Selector.select("+ p", p1);
        assertEquals(1, adjacent.size());
        assertEquals("p2", adjacent.first().id());

        Elements general = Selector.select("~ p", p1);
        assertEquals(2, general.size());
    }

    @Test
    public void testSelect_startsWithDescendantCombinator() {
        Document doc = Jsoup.parse("<div><section><p>Text</p></section></div>");
        Element div = doc.select("div").first();
        Elements descendant = Selector.select(" p", div);
        assertEquals(1, descendant.size());
        assertEquals("Text", descendant.first().text());
    }

    @Test
    public void testSelect_multipleChainedSelectorsAndConditions() {
        Document doc = Jsoup.parse("<div id=\"main\" class=\"box primary\"><p class=\"lead\" data-type=\"head\">Heading</p></div>");
        Elements elements = Selector.select("p.lead#main p.lead[data-type=head]", doc);
        assertEquals(1, elements.size());
        assertEquals("Heading", elements.first().text());

        Elements selfChained = Selector.select("div#main.box.primary", doc);
        assertEquals(1, selfChained.size());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect_unhandledQueryToken_throwsSelectorParseException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div@invalid", doc);
    }

    @Test
    public void testSelectorParseException_constructorMessage() {
        Selector.SelectorParseException ex = new Selector.SelectorParseException("Test error: %s (%d)", "problem", 404);
        assertEquals("Test error: problem (404)", ex.getMessage());
        assertNotNull(ex);
    }
}
