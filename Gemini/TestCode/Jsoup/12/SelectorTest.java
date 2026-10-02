package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector.SelectorParseException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectorTest {

    @Test
    public void testSelect_byTag_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><span>Three</span></div>");
        Elements elements = Selector.select("p", doc);
        Assert.assertEquals(2, elements.size());
        Assert.assertEquals("One", elements.get(0).text());
        Assert.assertEquals("Two", elements.get(1).text());
    }

    @Test
    public void testSelect_byId_foundAndNotFound() {
        Document doc = Jsoup.parse("<div id='d1'><p id='p1'>First</p></div>");
        Elements elementsFound = Selector.select("#p1", doc);
        Assert.assertEquals(1, elementsFound.size());
        Assert.assertEquals("First", elementsFound.get(0).text());

        Elements elementsNotFound = Selector.select("#not-found", doc);
        Assert.assertTrue(elementsNotFound.isEmpty());
    }

    @Test
    public void testSelect_byClass_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div class='item highlight'><p class='item'>Text</p><span class='highlight'>Span</span></div>");
        Elements items = Selector.select(".item", doc);
        Assert.assertEquals(2, items.size());

        Elements highlights = Selector.select(".highlight", doc);
        Assert.assertEquals(2, highlights.size());
    }

    @Test
    public void testSelect_byNamespaceTag_replacesPipeWithColon() {
        Document doc = Jsoup.parse("<xml><fb:name>Facebook</fb:name><other>None</other></xml>", "", org.jsoup.parser.Parser.xmlParser());
        Elements elements = Selector.select("fb|name", doc);
        Assert.assertEquals(1, elements.size());
        Assert.assertEquals("fb:name", elements.get(0).tagName());
        Assert.assertEquals("Facebook", elements.get(0).text());
    }

    @Test
    public void testSelect_allElementsStar_returnsAll() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        Elements all = Selector.select("*", doc);
        Assert.assertTrue(all.size() >= 3); // doc, html, head, body, div, p
    }

    @Test
    public void testSelect_byAttributePresence_returnsMatching() {
        Document doc = Jsoup.parse("<a href='http://example.com' title='test'>Link</a><p title='p-title'>Text</p><a>No href</a>");
        Elements withHref = Selector.select("[href]", doc);
        Assert.assertEquals(1, withHref.size());

        Elements withTitle = Selector.select("[title]", doc);
        Assert.assertEquals(2, withTitle.size());
    }

    @Test
    public void testSelect_byAttributePrefix_returnsMatching() {
        Document doc = Jsoup.parse("<div data-id='123' data-name='test' name='other'>Div</div>");
        Elements dataAttrs = Selector.select("[^data-]", doc);
        Assert.assertEquals(1, dataAttrs.size());
        Assert.assertEquals("div", dataAttrs.get(0).tagName());
    }

    @Test
    public void testSelect_byAttributeValueExact_returnsMatching() {
        Document doc = Jsoup.parse("<input type='text' name='user'><input type='password' name='pass'>");
        Elements exact = Selector.select("[type=password]", doc);
        Assert.assertEquals(1, exact.size());
        Assert.assertEquals("pass", exact.get(0).attr("name"));
    }

    @Test
    public void testSelect_byAttributeValueNot_returnsMatching() {
        Document doc = Jsoup.parse("<input type='text' name='user'><input type='password' name='pass'>");
        Elements notPass = Selector.select("input[type!=password]", doc);
        Assert.assertEquals(1, notPass.size());
        Assert.assertEquals("user", notPass.get(0).attr("name"));
    }

    @Test
    public void testSelect_byAttributeValueStarting_returnsMatching() {
        Document doc = Jsoup.parse("<a href='http://example.com'>1</a><a href='https://example.com'>2</a><a href='ftp://example.com'>3</a>");
        Elements httpLinks = Selector.select("[href^=http]", doc);
        Assert.assertEquals(2, httpLinks.size());
    }

    @Test
    public void testSelect_byAttributeValueEnding_returnsMatching() {
        Document doc = Jsoup.parse("<img src='pic.png'><img src='pic.jpg'><img src='pic.PNG'>");
        Elements pngImages = Selector.select("[src$=.png]", doc);
        Assert.assertEquals(1, pngImages.size());
        Assert.assertEquals("pic.png", pngImages.get(0).attr("src"));
    }

    @Test
    public void testSelect_byAttributeValueContaining_returnsMatching() {
        Document doc = Jsoup.parse("<a href='/page/about/'>About</a><a href='/contact/'>Contact</a>");
        Elements about = Selector.select("[href*=/about/]", doc);
        Assert.assertEquals(1, about.size());
        Assert.assertEquals("About", about.get(0).text());
    }

    @Test
    public void testSelect_byAttributeValueMatchingRegex_returnsMatching() {
        Document doc = Jsoup.parse("<img src='test.png'><img src='test.jpeg'><img src='test.gif'>");
        Elements regexMatch = Selector.select("[src~=(?i)\\.(png|jpe?g)]", doc);
        Assert.assertEquals(2, regexMatch.size());
    }

    @Test(expected = SelectorParseException.class)
    public void testSelect_byAttributeInvalidOperator_throwsSelectorParseException() {
        Document doc = Jsoup.parse("<div>test</div>");
        Selector.select("[attr?value]", doc);
    }

    @Test
    public void testSelect_pseudoLt_returnsIndexLessThan() {
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li><li>3</li></ul>");
        Elements elements = Selector.select("li:lt(2)", doc);
        Assert.assertEquals(2, elements.size());
        Assert.assertEquals("0", elements.get(0).text());
        Assert.assertEquals("1", elements.get(1).text());
    }

    @Test
    public void testSelect_pseudoGt_returnsIndexGreaterThan() {
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li><li>3</li></ul>");
        Elements elements = Selector.select("li:gt(1)", doc);
        Assert.assertEquals(2, elements.size());
        Assert.assertEquals("2", elements.get(0).text());
        Assert.assertEquals("3", elements.get(1).text());
    }

    @Test
    public void testSelect_pseudoEq_returnsIndexEqual() {
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li></ul>");
        Elements elements = Selector.select("li:eq(1)", doc);
        Assert.assertEquals(1, elements.size());
        Assert.assertEquals("1", elements.get(0).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_pseudoIndexNonNumeric_throwsException() {
        Document doc = Jsoup.parse("<ul><li>0</li></ul>");
        Selector.select("li:eq(abc)", doc);
    }

    @Test
    public void testSelect_pseudoContains_returnsElementsWithText() {
        Document doc = Jsoup.parse("<div><p>Hello World</p><p>Goodbye</p></div>");
        Elements contains = Selector.select(":contains(Hello)", doc);
        // Includes html, body, div, p
        Assert.assertTrue(contains.size() >= 1);
        Elements pContains = Selector.select("p:contains(Hello)", doc);
        Assert.assertEquals(1, pContains.size());
        Assert.assertEquals("Hello World", pContains.get(0).text());
    }

    @Test
    public void testSelect_pseudoContainsOwn_returnsDirectTextElements() {
        Document doc = Jsoup.parse("<div>Parent <p>Child jsoup text</p> Parent jsoup</div>");
        Elements containsOwn = Selector.select("div:containsOwn(jsoup)", doc);
        Assert.assertEquals(1, containsOwn.size());
        Assert.assertEquals("div", containsOwn.get(0).tagName());
    }

    @Test
    public void testSelect_pseudoMatches_returnsMatchingRegexElements() {
        Document doc = Jsoup.parse("<div><p>Order 12345</p><p>No digits</p></div>");
        Elements matches = Selector.select("p:matches(\\d+)", doc);
        Assert.assertEquals(1, matches.size());
        Assert.assertEquals("Order 12345", matches.get(0).text());
    }

    @Test
    public void testSelect_pseudoMatchesOwn_returnsMatchingRegexElementsDirect() {
        Document doc = Jsoup.parse("<div>Code 999 <span>Inner</span></div>");
        Elements matchesOwn = Selector.select("div:matchesOwn(\\d+)", doc);
        Assert.assertEquals(1, matchesOwn.size());
        Assert.assertEquals("div", matchesOwn.get(0).tagName());
    }

    @Test
    public void testSelect_pseudoNot_filtersOutMatching() {
        Document doc = Jsoup.parse("<div><p class='skip'>1</p><p class='keep'>2</p><p class='keep'>3</p></div>");
        Elements notSkip = Selector.select("p:not(.skip)", doc);
        Assert.assertEquals(2, notSkip.size());
        Assert.assertEquals("2", notSkip.get(0).text());
        Assert.assertEquals("3", notSkip.get(1).text());
    }

    @Test
    public void testSelect_pseudoHasAtStartAndInSelector() {
        Document doc = Jsoup.parse("<div><p>Paragraph</p></div><section><span>Span</span></section>");
        Elements startHas = Selector.select(":has(p)", doc);
        Assert.assertFalse(startHas.isEmpty());

        Elements divHas = Selector.select("div:has(p)", doc);
        Assert.assertEquals(1, divHas.size());
        Assert.assertEquals("div", divHas.get(0).tagName());

        Elements divHasSpan = Selector.select("div:has(span)", doc);
        Assert.assertTrue(divHasSpan.isEmpty());
    }

    @Test
    public void testSelect_combinatorChild_directChildOnly() {
        Document doc = Jsoup.parse("<div id='root'><p><span>Direct Child</span></p><div><span>Nested Child</span></div></div>");
        Elements childSpans = Selector.select("p > span", doc);
        Assert.assertEquals(1, childSpans.size());
        Assert.assertEquals("Direct Child", childSpans.get(0).text());
    }

    @Test
    public void testSelect_combinatorDescendant_spaceSeparated() {
        Document doc = Jsoup.parse("<div id='root'><p><span>Direct Child</span></p><div><span>Nested Child</span></div></div>");
        Elements descSpans = Selector.select("div span", doc);
        Assert.assertEquals(2, descSpans.size());
    }

    @Test
    public void testSelect_combinatorAdjacentSibling_plus() {
        Document doc = Jsoup.parse("<div><h1>Title</h1><p>First P</p><p>Second P</p></div>");
        Elements adjacent = Selector.select("h1 + p", doc);
        Assert.assertEquals(1, adjacent.size());
        Assert.assertEquals("First P", adjacent.get(0).text());
    }

    @Test
    public void testSelect_combinatorGeneralSibling_tilde() {
        Document doc = Jsoup.parse("<div><h1>Title</h1><p>First P</p><p>Second P</p><span>Span</span></div>");
        Elements general = Selector.select("h1 ~ p", doc);
        Assert.assertEquals(2, general.size());
        Assert.assertEquals("First P", general.get(0).text());
        Assert.assertEquals("Second P", general.get(1).text());
    }

    @Test
    public void testSelect_combinatorComma_groupsOr() {
        Document doc = Jsoup.parse("<div><h1>Title</h1><p>Paragraph</p><span>Span</span></div>");
        Elements grouped = Selector.select("h1, span", doc);
        Assert.assertEquals(2, grouped.size());
        Assert.assertEquals("h1", grouped.get(0).tagName());
        Assert.assertEquals("span", grouped.get(1).tagName());
    }

    @Test
    public void testSelect_startingWithCombinators() {
        Element div = Jsoup.parse("<div><p>Direct</p><div><p>Nested</p></div></div>").select("div").first();
        Elements directChildren = Selector.select("> p", div);
        Assert.assertEquals(1, directChildren.size());
        Assert.assertEquals("Direct", directChildren.get(0).text());

        Element firstP = div.select("p").first();
        Element body = firstP.parent();
        Elements adjacentP = Selector.select("+ div", firstP);
        Assert.assertEquals(1, adjacentP.size());

        Elements generalSib = Selector.select("~ div", firstP);
        Assert.assertEquals(1, generalSib.size());
    }

    @Test
    public void testSelect_combinedMultipleFiltersAndSelf() {
        Document doc = Jsoup.parse("<p id='p1' class='active extra' title='p-title'>Target</p><p class='active'>Other</p>");
        Elements combined = Selector.select("p.active#p1[title=p-title]", doc);
        Assert.assertEquals(1, combined.size());
        Assert.assertEquals("Target", combined.get(0).text());
    }

    @Test
    public void testSelect_onIterableRoots() {
        Document doc = Jsoup.parse("<div id='d1'><p>P1</p></div><div id='d2'><p>P2</p></div>");
        Elements divs = doc.select("div");
        Elements paragraphs = Selector.select("p", (Iterable<Element>) divs);
        Assert.assertEquals(2, paragraphs.size());
        Assert.assertEquals("P1", paragraphs.get(0).text());
        Assert.assertEquals("P2", paragraphs.get(1).text());

        Elements emptyRoots = Selector.select("p", (Iterable<Element>) Collections.<Element>emptyList());
        Assert.assertTrue(emptyRoots.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select(null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_whitespaceQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("   ", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRoot_throwsIllegalArgumentException() {
        Selector.select("div", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_nullRootsIterable_throwsIllegalArgumentException() {
        Selector.select("div", (Iterable<Element>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyQueryWithRootsIterable_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("", Collections.singletonList(doc));
    }

    @Test(expected = SelectorParseException.class)
    public void testSelect_invalidQueryUnexpectedToken_throwsSelectorParseException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:invalidToken()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyHasSubQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:has()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyNotSubQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:not()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyContainsQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:contains()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyMatchesQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:matches()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyContainsOwnQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:containsOwn()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelect_emptyMatchesOwnQuery_throwsIllegalArgumentException() {
        Document doc = Jsoup.parse("<div></div>");
        Selector.select("div:matchesOwn()", doc);
    }

    @Test
    public void testFilterOut_excludesMatchingElements() {
        Document doc = Jsoup.parse("<div><p id='1'>One</p><p id='2'>Two</p><p id='3'>Three</p></div>");
        Elements allP = doc.select("p");
        Elements toExclude = doc.select("#2");

        Elements filtered = Selector.filterOut(allP, toExclude);
        Assert.assertEquals(2, filtered.size());
        Assert.assertEquals("1", filtered.get(0).id());
        Assert.assertEquals("3", filtered.get(1).id());
    }

    @Test
    public void testFilterOut_emptyOuts_returnsAllElements() {
        Document doc = Jsoup.parse("<div><p id='1'>One</p></div>");
        Elements allP = doc.select("p");
        Elements filtered = Selector.filterOut(allP, new ArrayList<Element>());
        Assert.assertEquals(1, filtered.size());
    }

    @Test
    public void testSelectorParseException_formatting() {
        SelectorParseException ex = new SelectorParseException("Error at %s in %d", "token", 42);
        Assert.assertEquals("Error at token in 42", ex.getMessage());
    }
}
