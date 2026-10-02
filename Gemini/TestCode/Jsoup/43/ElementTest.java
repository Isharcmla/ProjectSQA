package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructorsAndTagGetters_validInputs_returnsExpected() {
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Element el = new Element(tag, "http://example.com", attrs);

        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertSame(tag, el.tag());
        assertTrue(el.isBlock());
        assertEquals("http://example.com", el.baseUri());
        assertEquals("main", el.id());

        Element simpleEl = new Element(Tag.valueOf("span"), "");
        assertEquals("span", simpleEl.tagName());
        assertFalse(simpleEl.isBlock());
        assertEquals("", simpleEl.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void testTagName_changeTagName_updatesTag() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("span");
        assertEquals("span", el.tagName());
        assertFalse(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyTagName_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void testAttrAndDataset_normalAndCustomAttributes_reflectsProperly() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.attr("data-test", "value1");
        assertSame(el, returned);
        el.attr("title", "tooltip");

        assertEquals("value1", el.attr("data-test"));
        assertEquals("tooltip", el.attr("title"));

        Map<String, String> dataset = el.dataset();
        assertEquals(1, dataset.size());
        assertEquals("value1", dataset.get("test"));

        dataset.put("test", "value2");
        assertEquals("value2", el.attr("data-test"));
    }

    @Test
    public void testParentAndParents_hierarchy_returnsExpectedParents() {
        Document doc = Jsoup.parse("<html><body><div><p><span>Hello</span></p></div></body></html>");
        Element span = doc.select("span").first();
        assertNotNull(span);

        Element p = span.parent();
        assertNotNull(p);
        assertEquals("p", p.tagName());

        Elements parents = span.parents();
        assertEquals(4, parents.size());
        assertEquals("p", parents.get(0).tagName());
        assertEquals("div", parents.get(1).tagName());
        assertEquals("body", parents.get(2).tagName());
        assertEquals("html", parents.get(3).tagName());

        Element orphan = new Element(Tag.valueOf("div"), "");
        assertNull(orphan.parent());
        assertEquals(0, orphan.parents().size());
    }

    @Test
    public void testChildrenAndChild_filterElements_returnsOnlyElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Text 1");
        Element p = div.appendElement("p");
        div.appendText("Text 2");
        Element span = div.appendElement("span");

        Elements children = div.children();
        assertEquals(2, children.size());
        assertSame(p, children.get(0));
        assertSame(span, children.get(1));
        assertSame(p, div.child(0));
        assertSame(span, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_indexOutOfBounds_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes_mixedChildren_filtersCorrectly() {
        Element el = new Element(Tag.valueOf("script"), "");
        el.appendText("Some text");
        DataNode dataNode = new DataNode("var x = 1;", "");
        el.appendChild(dataNode);

        List<TextNode> textNodes = el.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Some text", textNodes.get(0).getWholeText());

        List<DataNode> dataNodes = el.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTextNodes_unmodifiableList_throwsExceptionOnModification() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("Text");
        el.textNodes().clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDataNodes_unmodifiableList_throwsExceptionOnModification() {
        Element el = new Element(Tag.valueOf("script"), "");
        el.appendChild(new DataNode("data", ""));
        el.dataNodes().clear();
    }

    @Test
    public void testSelect_cssQuery_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class='first'>A</p><p class='second'>B</p></div>");
        Elements elements = doc.select("p.first");
        assertEquals(1, elements.size());
        assertEquals("A", elements.first().text());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect_invalidQuery_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.select("p:unknown-pseudo");
    }

    @Test
    public void testAppendAndPrependChild_normal_maintainsOrder() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("b"), "");

        el.appendChild(child1);
        el.prependChild(child2);

        assertEquals(2, el.children().size());
        assertSame(child2, el.child(0));
        assertSame(child1, el.child(1));
        assertEquals(0, child2.siblingIndex());
        assertEquals(1, child1.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_nullChild_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_nullChild_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.prependChild(null);
    }

    @Test
    public void testInsertChildren_validIndexesAndRollAround_insertsCorrectly() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element c1 = new Element(Tag.valueOf("p"), "");
        Element c2 = new Element(Tag.valueOf("span"), "");
        el.appendChild(c1);

        List<Node> toInsert = Collections.<Node>singletonList(c2);
        el.insertChildren(0, toInsert);
        assertSame(c2, el.child(0));
        assertSame(c1, el.child(1));

        Element c3 = new Element(Tag.valueOf("b"), "");
        el.insertChildren(-1, Collections.<Node>singletonList(c3));
        assertSame(c3, el.child(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_outOfBoundsIndex_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.insertChildren(5, Collections.<Node>emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_nullCollection_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.insertChildren(0, null);
    }

    @Test
    public void testAppendPrependElementsAndText_createsAndAddsProperly() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Element p = div.appendElement("p");
        assertEquals("p", p.tagName());
        assertEquals("http://example.com", p.baseUri());
        assertSame(p, div.child(0));

        Element h1 = div.prependElement("h1");
        assertEquals("h1", h1.tagName());
        assertSame(h1, div.child(0));

        div.appendText("End");
        div.prependText("Start ");

        assertEquals("Start", div.textNodes().get(0).getWholeText().trim());
        assertEquals("End", div.textNodes().get(1).getWholeText().trim());
    }

    @Test
    public void testAppendAndPrependHtml_parsesAndInserts() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.append("<p>One</p>");
        assertEquals(1, div.children().size());
        assertEquals("p", div.child(0).tagName());

        div.prepend("<span>Zero</span>");
        assertEquals(2, div.children().size());
        assertEquals("span", div.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullHtml_throwsException() {
        new Element(Tag.valueOf("div"), "").append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_nullHtml_throwsException() {
        new Element(Tag.valueOf("div"), "").prepend(null);
    }

    @Test
    public void testBeforeAfterAndWrap_nodesAndHtml_modifiesDOM() {
        Document doc = Jsoup.parse("<div><p id='mid'>Middle</p></div>");
        Element mid = doc.getElementById("mid");

        Element beforeNode = new Element(Tag.valueOf("span"), "");
        beforeNode.text("BeforeNode");
        Element afterNode = new Element(Tag.valueOf("span"), "");
        afterNode.text("AfterNode");

        Element returnedBeforeNode = mid.before(beforeNode);
        Element returnedBeforeHtml = mid.before("<b>BeforeHtml</b>");
        Element returnedAfterNode = mid.after(afterNode);
        Element returnedAfterHtml = mid.after("<i>AfterHtml</i>");

        assertSame(mid, returnedBeforeNode);
        assertSame(mid, returnedBeforeHtml);
        assertSame(mid, returnedAfterNode);
        assertSame(mid, returnedAfterHtml);

        Element returnedWrap = mid.wrap("<section class='wrapper'></section>");
        assertSame(mid, returnedWrap);
        assertEquals("section", mid.parent().tagName());
    }

    @Test
    public void testEmpty_clearsChildNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>Test</p><span>More</span>");
        el.attr("class", "retained");
        assertEquals(2, el.children().size());

        Element returned = el.empty();
        assertSame(el, returned);
        assertEquals(0, el.childNodes().size());
        assertEquals("retained", el.attr("class"));
    }

    @Test
    public void testCssSelector_variousStructures_returnsUniquePath() {
        Document doc = Jsoup.parse("<div id='unique'>Content</div><div class='item'><span>A</span><span>B</span></div>");
        Element unique = doc.getElementById("unique");
        assertEquals("#unique", unique.cssSelector());

        Elements spans = doc.select(".item span");
        Element span0 = spans.get(0);
        Element span1 = spans.get(1);

        assertEquals("html > body > div.item > span:nth-child(1)", span0.cssSelector());
        assertEquals("html > body > div.item > span:nth-child(2)", span1.cssSelector());

        Element orphan = new Element(Tag.valueOf("div"), "");
        orphan.addClass("orphan-class");
        assertEquals("div.orphan-class", orphan.cssSelector());
    }

    @Test
    public void testSiblingNavigationMethods_variousScenarios_returnsExpected() {
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertEquals(0, orphan.siblingElements().size());
        assertNull(orphan.nextElementSibling());
        assertNull(orphan.previousElementSibling());
        assertEquals(Integer.valueOf(0), orphan.elementSiblingIndex());

        Document doc = Jsoup.parse("<div><h1>1</h1><p>2</p><span>3</span></div>");
        Element div = doc.select("div").first();
        Element h1 = div.child(0);
        Element p = div.child(1);
        Element span = div.child(2);

        assertEquals(2, h1.siblingElements().size());
        assertNull(h1.previousElementSibling());
        assertSame(p, h1.nextElementSibling());
        assertSame(h1, p.previousElementSibling());
        assertSame(span, p.nextElementSibling());
        assertNull(span.nextElementSibling());

        assertSame(h1, p.firstElementSibling());
        assertSame(span, p.lastElementSibling());
        assertEquals(Integer.valueOf(1), p.elementSiblingIndex());

        Document singleChildDoc = Jsoup.parse("<div><p>Single</p></div>");
        Element singleP = singleChildDoc.select("p").first();
        assertNull(singleP.firstElementSibling());
        assertNull(singleP.lastElementSibling());
    }

    @Test
    public void testDOMSearchMethods_byTagIdAndClass_findsCorrectElements() {
        Document doc = Jsoup.parse("<div id='d1' class='main highlight'><span id='s1' class='sub'>Test</span></div>");
        Element d1 = doc.getElementById("d1");
        assertNotNull(d1);
        assertNull(doc.getElementById("non-existent"));

        Elements divs = doc.getElementsByTag("DIV");
        assertEquals(1, divs.size());

        Elements subs = doc.getElementsByClass("SUB");
        assertEquals(1, subs.size());
        assertEquals("s1", subs.first().id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_emptyTag_throwsException() {
        new Element(Tag.valueOf("div"), "").getElementsByTag("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_emptyId_throwsException() {
        new Element(Tag.valueOf("div"), "").getElementById("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_emptyClass_throwsException() {
        new Element(Tag.valueOf("div"), "").getElementsByClass("");
    }

    @Test
    public void testDOMSearchMethods_byAttributes_findsCorrectElements() {
        Document doc = Jsoup.parse("<div data-role='admin' data-key='123' title='hello world' name='sample'></div>");

        assertEquals(1, doc.getElementsByAttribute("DATA-ROLE").size());
        assertEquals(2, doc.getElementsByAttributeStarting("DATA-").size());
        assertEquals(1, doc.getElementsByAttributeValue("name", "sample").size());
        assertTrue(doc.getElementsByAttributeValueNot("name", "other").size() > 0);
        assertEquals(1, doc.getElementsByAttributeValueStarting("title", "hel").size());
        assertEquals(1, doc.getElementsByAttributeValueEnding("title", "rld").size());
        assertEquals(1, doc.getElementsByAttributeValueContaining("title", "lo wo").size());
        assertEquals(1, doc.getElementsByAttributeValueMatching("data-key", Pattern.compile("^\\d+$")).size());
        assertEquals(1, doc.getElementsByAttributeValueMatching("data-key", "^\\d+$").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        new Element(Tag.valueOf("div"), "").getElementsByAttributeValueMatching("key", "[a-");
    }

    @Test
    public void testDOMSearchMethods_byIndexTextAndAllElements_findsCorrectElements() {
        Document doc = Jsoup.parse("<ul><li>One</li><li>Two</li><li>Three</li></ul>");
        Element ul = doc.select("ul").first();

        assertEquals(1, ul.getElementsByIndexLessThan(1).size());
        assertEquals(1, ul.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, ul.getElementsByIndexEquals(1).size());

        assertEquals(1, ul.getElementsContainingText("two").size());
        assertEquals(1, ul.getElementsContainingOwnText("Three").size());

        assertEquals(1, ul.getElementsMatchingText(Pattern.compile("(?i)one")).size());
        assertEquals(1, ul.getElementsMatchingText("(?i)one").size());
        assertEquals(1, ul.getElementsMatchingOwnText(Pattern.compile("Two")).size());
        assertEquals(1, ul.getElementsMatchingOwnText("Two").size());

        Elements all = ul.getAllElements();
        assertEquals(4, all.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        new Element(Tag.valueOf("div"), "").getElementsMatchingText("[0-");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        new Element(Tag.valueOf("div"), "").getElementsMatchingOwnText("[0-");
    }

    @Test
    public void testTextAndOwnText_complexStructureAndWhitespace_handlesProperly() {
        Document doc = Jsoup.parse("<div>Hello <b>there</b><br>now! <p>Para</p></div>");
        Element div = doc.select("div").first();

        assertEquals("Hello there now! Para", div.text());
        assertEquals("Hello now!", div.ownText());

        Element emptyEl = new Element(Tag.valueOf("p"), "");
        assertEquals("", emptyEl.text());
        assertEquals("", emptyEl.ownText());
        assertFalse(emptyEl.hasText());

        Element blankEl = new Element(Tag.valueOf("p"), "");
        blankEl.appendText("   ");
        assertFalse(blankEl.hasText());

        emptyEl.text("Updated Text");
        assertEquals("Updated Text", emptyEl.text());
        assertTrue(emptyEl.hasText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testText_null_throwsException() {
        new Element(Tag.valueOf("div"), "").text(null);
    }

    @Test
    public void testPreserveWhitespace_preTagAndChild_preservesExactSpaces() {
        Document doc = Jsoup.parse("<pre>  line1 \n  line2  <span> inside </span></pre>");
        Element pre = doc.select("pre").first();
        assertEquals("  line1 \n  line2   inside ", pre.text());

        assertTrue(Element.preserveWhitespace(pre));
        assertTrue(Element.preserveWhitespace(pre.child(0)));
        assertFalse(Element.preserveWhitespace(null));
        assertFalse(Element.preserveWhitespace(new Element(Tag.valueOf("div"), "")));
    }

    @Test
    public void testData_scriptsAndNestedData_returnsCombinedData() {
        Document doc = Jsoup.parse("<script>var a = 1;</script><div><script>var b = 2;</script></div>");
        Element script = doc.select("script").first();
        assertEquals("var a = 1;", script.data());

        Element div = doc.select("div").first();
        assertEquals("var b = 2;", div.data());
    }

    @Test
    public void testClassAttributeManipulations_addClassRemoveClassToggleClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.className());
        assertEquals(0, el.classNames().size());
        assertFalse(el.hasClass("active"));

        el.addClass("active");
        assertEquals("active", el.className());
        assertTrue(el.hasClass("ACTIVE"));
        assertEquals(1, el.classNames().size());

        el.addClass("header").addClass("first");
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("first"));

        el.removeClass("header");
        assertFalse(el.hasClass("header"));
        assertTrue(el.hasClass("first"));

        el.toggleClass("first");
        assertFalse(el.hasClass("first"));
        el.toggleClass("first");
        assertTrue(el.hasClass("first"));

        Set<String> newClasses = new LinkedHashSet<String>(Arrays.asList("one", "two"));
        el.classNames(newClasses);
        assertEquals("one two", el.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNames_null_throwsException() {
        new Element(Tag.valueOf("div"), "").classNames(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_null_throwsException() {
        new Element(Tag.valueOf("div"), "").addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_null_throwsException() {
        new Element(Tag.valueOf("div"), "").removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_null_throwsException() {
        new Element(Tag.valueOf("div"), "").toggleClass(null);
    }

    @Test
    public void testVal_inputAndTextarea_readsAndSetsValue() {
        Document doc = Jsoup.parse("<input value='sample' /><textarea>multi\nline</textarea>");
        Element input = doc.select("input").first();
        Element textarea = doc.select("textarea").first();

        assertEquals("sample", input.val());
        assertEquals("multi\nline", textarea.val());

        input.val("new-input");
        assertEquals("new-input", input.attr("value"));

        textarea.val("new-textarea");
        assertEquals("new-textarea", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtml_variousSettings_rendersProperly() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.html("<p>Hello</p>");
        assertEquals("<p>Hello</p>", div.html());
        assertEquals("<div>\n <p>Hello</p>\n</div>", div.outerHtml());
        assertEquals(div.outerHtml(), div.toString());

        Element imgHtml = new Element(Tag.valueOf("img"), "");
        assertEquals("<img>", imgHtml.outerHtml());

        Document xmlDoc = Jsoup.parse("<img src='pic.jpg'>", "", org.jsoup.parser.Parser.xmlParser());
        Element imgXml = xmlDoc.select("img").first();
        assertTrue(imgXml.outerHtml().contains("/>"));

        Document doc = Jsoup.parse("<div><span>Inline</span></div>");
        doc.outputSettings().prettyPrint(false);
        assertEquals("<div><span>Inline</span></div>", doc.select("div").first().outerHtml());
    }

    @Test
    public void testOuterHtmlTail_branchCases_rendersCorrectly() {
        Document doc = Jsoup.parse("<div></div>");
        doc.outputSettings().outline(true);
        Element div = doc.select("div").first();
        div.appendElement("p").text("One");
        div.appendElement("p").text("Two");
        String html = div.outerHtml();
        assertTrue(html.contains("</div>"));
    }

    @Test
    public void testEqualsAndHashCode_differentAndIdenticalElements_verifiesEquality() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("span"), "http://example.com");

        assertEquals(el1, el1);
        assertEquals(el1, el2);
        assertNotEquals(el1, el3);
        assertNotEquals(el1, null);
        assertNotEquals(el1, "some-string");
        assertEquals(el1.hashCode(), el2.hashCode());
    }

    @Test
    public void testClone_clonedElement_isDeepCopy() {
        Element original = new Element(Tag.valueOf("div"), "http://example.com");
        original.attr("id", "orig");
        original.appendElement("span").text("Child");

        Element clone = original.clone();
        assertNotSame(original, clone);
        assertEquals(original.outerHtml(), clone.outerHtml());

        clone.attr("id", "cloned");
        clone.child(0).text("Modified");

        assertEquals("orig", original.attr("id"));
        assertEquals("Child", original.child(0).text());
        assertEquals("cloned", clone.attr("id"));
        assertEquals("Modified", clone.child(0).text());
    }
}
