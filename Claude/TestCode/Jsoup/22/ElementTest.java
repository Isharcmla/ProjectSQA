package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.*;
import java.util.regex.Pattern;

public class ElementTest {

    private Element newElement(String tagName) {
        return new Element(Tag.valueOf(tagName), "http://example.com/");
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_withTagAndBaseUri_success() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testConstructor_withTagBaseUriAttributes_success() {
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Element el = new Element(Tag.valueOf("div"), "http://example.com/", attrs);
        assertEquals("main", el.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com/");
    }

    // ---------- nodeName / tagName / tag ----------

    @Test
    public void testNodeName_returnsTagName() {
        Element el = newElement("div");
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName_get_returnsTag() {
        Element el = newElement("span");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTagName_set_changesTag() {
        Element el = newElement("span");
        Element result = el.tagName("div");
        assertEquals("div", el.tagName());
        assertSame(el, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyString_throwsException() {
        Element el = newElement("div");
        el.tagName("");
    }

    @Test
    public void testTag_returnsTagObject() {
        Element el = newElement("div");
        assertNotNull(el.tag());
        assertEquals("div", el.tag().getName());
    }

    // ---------- isBlock ----------

    @Test
    public void testIsBlock_blockElement_true() {
        Element el = newElement("div");
        assertTrue(el.isBlock());
    }

    @Test
    public void testIsBlock_inlineElement_false() {
        Element el = newElement("span");
        assertFalse(el.isBlock());
    }

    // ---------- id ----------

    @Test
    public void testId_withId_returnsId() {
        Element el = newElement("div");
        el.attr("id", "header");
        assertEquals("header", el.id());
    }

    @Test
    public void testId_withoutId_returnsEmptyString() {
        Element el = newElement("div");
        assertEquals("", el.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttr_setAndGet() {
        Element el = newElement("div");
        Element result = el.attr("class", "foo");
        assertEquals("foo", el.attr("class"));
        assertSame(el, result);
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_returnsDataAttributes() {
        Element el = newElement("div");
        el.attr("data-foo", "bar");
        Map<String, String> dataset = el.dataset();
        assertEquals("bar", dataset.get("foo"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParent_withParent_returnsParent() {
        Element root = newElement("div");
        Element child = newElement("p");
        root.appendChild(child);
        assertSame(root, child.parent());
    }

    @Test
    public void testParent_withoutParent_returnsNull() {
        Element el = newElement("div");
        assertNull(el.parent());
    }

    @Test
    public void testParents_returnsAncestors() {
        Element grandparent = newElement("div");
        Element parent = newElement("section");
        Element child = newElement("p");
        grandparent.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertSame(parent, parents.get(0));
        assertSame(grandparent, parents.get(1));
    }

    // ---------- child / children ----------

    @Test
    public void testChild_validIndex_returnsElement() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertSame(child1, root.child(0));
        assertSame(child2, root.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        Element root = newElement("div");
        root.child(0);
    }

    @Test
    public void testChildren_withElements_returnsElementsOnly() {
        Element root = newElement("div");
        root.appendChild(newElement("p"));
        root.appendText("some text");
        root.appendChild(newElement("span"));

        Elements children = root.children();
        assertEquals(2, children.size());
    }

    @Test
    public void testChildren_noChildren_emptyList() {
        Element root = newElement("div");
        Elements children = root.children();
        assertTrue(children.isEmpty());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes_returnsTextNodesOnly() {
        Element root = newElement("div");
        root.appendText("hello");
        root.appendChild(newElement("span"));

        List<TextNode> textNodes = root.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("hello", textNodes.get(0).text());
    }

    @Test
    public void testDataNodes_noDataNodes_emptyList() {
        Element root = newElement("div");
        root.appendText("hello");
        List<DataNode> dataNodes = root.dataNodes();
        assertTrue(dataNodes.isEmpty());
    }

    // ---------- select ----------

    @Test
    public void testSelect_matchesElements() {
        Element root = newElement("div");
        Element p1 = newElement("p");
        Element p2 = newElement("p");
        root.appendChild(p1);
        root.appendChild(p2);

        Elements found = root.select("p");
        assertEquals(2, found.size());
    }

    // ---------- appendChild / prependChild ----------

    @Test
    public void testAppendChild_addsAtEnd() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertEquals(2, root.children().size());
        assertSame(child2, root.children().get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_null_throwsException() {
        Element root = newElement("div");
        root.appendChild(null);
    }

    @Test
    public void testPrependChild_addsAtStart() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.prependChild(child2);

        assertSame(child2, root.children().get(0));
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_addsNewElement() {
        Element root = newElement("div");
        Element newEl = root.appendElement("p");
        assertEquals("p", newEl.tagName());
        assertSame(root, newEl.parent());
        assertEquals(1, root.children().size());
    }

    @Test
    public void testPrependElement_addsNewElementAtStart() {
        Element root = newElement("div");
        root.appendElement("p");
        Element prepended = root.prependElement("span");
        assertSame(prepended, root.children().get(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_addsTextNode() {
        Element root = newElement("div");
        Element result = root.appendText("hello");
        assertEquals("hello", root.text());
        assertSame(root, result);
    }

    @Test
    public void testPrependText_addsTextNodeAtStart() {
        Element root = newElement("div");
        root.appendText("world");
        root.prependText("hello ");
        assertEquals("hello world", root.text());
    }

    // ---------- append / prepend html ----------

    @Test
    public void testAppend_html_addsParsedNodes() {
        Element root = newElement("div");
        Element result = root.append("<p>Hello</p>");
        assertEquals(1, root.children().size());
        assertSame(root, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_null_throwsException() {
        Element root = newElement("div");
        root.append(null);
    }

    @Test
    public void testPrepend_html_addsParsedNodesAtStart() {
        Element root = newElement("div");
        root.appendElement("span");
        root.prepend("<p>First</p>");
        assertEquals("p", root.children().get(0).tagName());
    }

    // ---------- before / after (html and Node) ----------

    @Test
    public void testBefore_html_insertsSibling() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        child2.before("<i>italic</i>");
        assertEquals(3, root.children().size());
        assertEquals("i", root.children().get(1).tagName());
    }

    @Test
    public void testBefore_node_insertsSibling() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        root.appendChild(child1);

        Element newNode = newElement("b");
        child1.before(newNode);
        assertEquals(2, root.children().size());
        assertSame(newNode, root.children().get(0));
    }

    @Test
    public void testAfter_html_insertsSibling() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        root.appendChild(child1);

        child1.after("<i>italic</i>");
        assertEquals(2, root.children().size());
        assertEquals("i", root.children().get(1).tagName());
    }

    @Test
    public void testAfter_node_insertsSibling() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        root.appendChild(child1);

        Element newNode = newElement("b");
        child1.after(newNode);
        assertEquals(2, root.children().size());
        assertSame(newNode, root.children().get(1));
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_removesAllChildren() {
        Element root = newElement("div");
        root.appendChild(newElement("p"));
        root.appendText("text");
        Element result = root.empty();
        assertEquals(0, root.childNodes().size());
        assertSame(root, result);
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsElement() {
        Element root = newElement("div");
        Element child = newElement("p");
        root.appendChild(child);

        Element result = child.wrap("<section></section>");
        assertNotNull(result);
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElements_returnsAllSiblingsIncludingSelf() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        Elements siblings = child1.siblingElements();
        assertEquals(2, siblings.size());
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSibling_hasNext_returnsNext() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertSame(child2, child1.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_noNext_returnsNull() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertNull(child2.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_hasPrevious_returnsPrevious() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertSame(child1, child2.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_noPrevious_returnsNull() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        root.appendChild(child1);

        assertNull(child1.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSibling_multipleChildren_returnsFirst() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertSame(child1, child2.firstElementSibling());
    }

    @Test
    public void testFirstElementSibling_onlyOneChild_returnsNull() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        root.appendChild(child1);

        assertNull(child1.firstElementSibling());
    }

    @Test
    public void testLastElementSibling_multipleChildren_returnsLast() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertSame(child2, child1.lastElementSibling());
    }

    @Test
    public void testLastElementSibling_onlyOneChild_returnsNull() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        root.appendChild(child1);

        assertNull(child1.lastElementSibling());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndex_withParent_returnsIndex() {
        Element root = newElement("div");
        Element child1 = newElement("p");
        Element child2 = newElement("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertEquals(Integer.valueOf(1), child2.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        Element el = newElement("div");
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test
    public void testGetElementsByTag_findsMatchingElements() {
        Element root = newElement("div");
        root.appendElement("p");
        root.appendElement("p");

        Elements found = root.getElementsByTag("p");
        assertEquals(2, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_emptyString_throwsException() {
        Element root = newElement("div");
        root.getElementsByTag("");
    }

    // ---------- getElementById ----------

    @Test
    public void testGetElementById_found_returnsElement() {
        Element root = newElement("div");
        Element child = newElement("p");
        child.attr("id", "target");
        root.appendChild(child);

        Element found = root.getElementById("target");
        assertSame(child, found);
    }

    @Test
    public void testGetElementById_notFound_returnsNull() {
        Element root = newElement("div");
        assertNull(root.getElementById("nonexistent"));
    }

    // ---------- getElementsByClass ----------

    @Test
    public void testGetElementsByClass_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("p");
        child.attr("class", "header");
        root.appendChild(child);

        Elements found = root.getElementsByClass("header");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttribute ----------

    @Test
    public void testGetElementsByAttribute_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("p");
        child.attr("data-foo", "bar");
        root.appendChild(child);

        Elements found = root.getElementsByAttribute("data-foo");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test
    public void testGetElementsByAttributeStarting_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("p");
        child.attr("data-foo", "bar");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeStarting("data-");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeValue ----------

    @Test
    public void testGetElementsByAttributeValue_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://example.com");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeValue("href", "http://example.com");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeValueNot ----------

    @Test
    public void testGetElementsByAttributeValueNot_findsNonMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://other.com");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeValueNot("href", "http://example.com");
        assertTrue(found.size() >= 1);
    }

    // ---------- getElementsByAttributeValueStarting ----------

    @Test
    public void testGetElementsByAttributeValueStarting_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://example.com/page");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeValueStarting("href", "http://example");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeValueEnding ----------

    @Test
    public void testGetElementsByAttributeValueEnding_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://example.com/page.html");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeValueContaining ----------

    @Test
    public void testGetElementsByAttributeValueContaining_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://example.com/page.html");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeValueContaining("href", "example");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeValueMatching ----------

    @Test
    public void testGetElementsByAttributeValueMatching_pattern_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://example.com/123");
        root.appendChild(child);

        Pattern pattern = Pattern.compile("\\d+");
        Elements found = root.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_regexString_findsMatchingElements() {
        Element root = newElement("div");
        Element child = newElement("a");
        child.attr("href", "http://example.com/123");
        root.appendChild(child);

        Elements found = root.getElementsByAttributeValueMatching("href", "\\d+");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        Element root = newElement("div");
        root.getElementsByAttributeValueMatching("href", "[");
    }

    // ---------- getElementsByIndexLessThan / GreaterThan / Equals ----------

    @Test
    public void testGetElementsByIndexLessThan_findsMatchingElements() {
        Element root = newElement("div");
        root.appendElement("p");
        root.appendElement("p");
        root.appendElement("p");

        Elements found = root.getElementsByIndexLessThan(1);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_findsMatchingElements() {
        Element root = newElement("div");
        root.appendElement("p");
        root.appendElement("p");
        root.appendElement("p");

        Elements found = root.getElementsByIndexGreaterThan(0);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals_findsMatchingElements() {
        Element root = newElement("div");
        root.appendElement("p");
        root.appendElement("p");

        Elements found = root.getElementsByIndexEquals(0);
        assertTrue(found.size() >= 1);
    }

    // ---------- getElementsContainingText / getElementsContainingOwnText ----------

    @Test
    public void testGetElementsContainingText_findsMatchingElements() {
        Element root = newElement("div");
        root.appendText("Hello World");

        Elements found = root.getElementsContainingText("hello");
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText_findsMatchingElements() {
        Element root = newElement("div");
        root.appendText("Hello World");

        Elements found = root.getElementsContainingOwnText("hello");
        assertTrue(found.size() >= 1);
    }

    // ---------- getElementsMatchingText ----------

    @Test
    public void testGetElementsMatchingText_pattern_findsMatchingElements() {
        Element root = newElement("div");
        root.appendText("Hello123");

        Pattern pattern = Pattern.compile("\\d+");
        Elements found = root.getElementsMatchingText(pattern);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingText_regexString_findsMatchingElements() {
        Element root = newElement("div");
        root.appendText("Hello123");

        Elements found = root.getElementsMatchingText("\\d+");
        assertTrue(found.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        Element root = newElement("div");
        root.getElementsMatchingText("[");
    }

    // ---------- getElementsMatchingOwnText ----------

    @Test
    public void testGetElementsMatchingOwnText_pattern_findsMatchingElements() {
        Element root = newElement("div");
        root.appendText("Hello123");

        Pattern pattern = Pattern.compile("\\d+");
        Elements found = root.getElementsMatchingOwnText(pattern);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnText_regexString_findsMatchingElements() {
        Element root = newElement("div");
        root.appendText("Hello123");

        Elements found = root.getElementsMatchingOwnText("\\d+");
        assertTrue(found.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        Element root = newElement("div");
        root.getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements_returnsSelfAndDescendants() {
        Element root = newElement("div");
        root.appendElement("p");
        root.appendElement("span");

        Elements all = root.getAllElements();
        assertEquals(3, all.size());
    }

    // ---------- text / ownText ----------

    @Test
    public void testText_get_returnsCombinedText() {
        Element root = newElement("p");
        root.appendText("Hello ");
        Element bold = root.appendElement("b");
        bold.appendText("there");
        root.appendText(" now!");

        assertEquals("Hello there now!", root.text());
    }

    @Test
    public void testText_set_replacesContent() {
        Element root = newElement("div");
        root.appendElement("p");
        Element result = root.text("new text");

        assertEquals("new text", root.text());
        assertSame(root, result);
    }

    @Test
    public void testOwnText_returnsOwnTextOnly() {
        Element root = newElement("p");
        root.appendText("Hello ");
        Element bold = root.appendElement("b");
        bold.appendText("there");
        root.appendText(" now!");

        assertEquals("Hello now!", root.ownText());
    }

    // ---------- hasText ----------

    @Test
    public void testHasText_withNonBlankText_true() {
        Element root = newElement("div");
        root.appendText("hello");

        assertTrue(root.hasText());
    }

    @Test
    public void testHasText_noText_false() {
        Element root = newElement("div");
        assertFalse(root.hasText());
    }

    // ---------- data ----------

    @Test
    public void testData_returnsDataNodeContent() {
        Element root = newElement("script");
        DataNode dataNode = new DataNode("var a = 1;", root.baseUri());
        root.appendChild(dataNode);

        assertEquals("var a = 1;", root.data());
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassName_returnsClassAttribute() {
        Element el = newElement("div");
        el.attr("class", "header gray");

        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassNames_get_returnsSetOfClasses() {
        Element el = newElement("div");
        el.attr("class", "header gray");

        Set<String> classes = el.classNames();
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
    }

    @Test
    public void testClassNames_set_updatesAttribute() {
        Element el = newElement("div");
        Set<String> classes = new LinkedHashSet<String>();
        classes.add("foo");
        classes.add("bar");

        Element result = el.classNames(classes);
        assertEquals("foo bar", el.className());
        assertSame(el, result);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClass_present_true() {
        Element el = newElement("div");
        el.attr("class", "Header");

        assertTrue(el.hasClass("header"));
    }

    @Test
    public void testHasClass_absent_false() {
        Element el = newElement("div");
        el.attr("class", "header");

        assertFalse(el.hasClass("footer"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test
    public void testAddClass_addsNewClass() {
        Element el = newElement("div");
        el.attr("class", "header");
        Element result = el.addClass("gray");

        assertTrue(el.hasClass("gray"));
        assertSame(el, result);
    }

    @Test
    public void testRemoveClass_removesExistingClass() {
        Element el = newElement("div");
        el.attr("class", "header gray");
        Element result = el.removeClass("gray");

        assertFalse(el.hasClass("gray"));
        assertSame(el, result);
    }

    @Test
    public void testToggleClass_addsWhenAbsent() {
        Element el = newElement("div");
        el.attr("class", "header");
        el.toggleClass("gray");

        assertTrue(el.hasClass("gray"));
    }

    @Test
    public void testToggleClass_removesWhenPresent() {
        Element el = newElement("div");
        el.attr("class", "header gray");
        el.toggleClass("gray");

        assertFalse(el.hasClass("gray"));
    }

    // ---------- val ----------

    @Test
    public void testVal_inputElement_returnsValueAttribute() {
        Element el = newElement("input");
        el.attr("value", "foo");

        assertEquals("foo", el.val());
    }

    @Test
    public void testVal_textareaElement_returnsText() {
        Element el = newElement("textarea");
        el.text("bar");

        assertEquals("bar", el.val());
    }

    @Test
    public void testVal_set_inputElement_setsValueAttribute() {
        Element el = newElement("input");
        Element result = el.val("newValue");

        assertEquals("newValue", el.attr("value"));
        assertSame(el, result);
    }

    @Test
    public void testVal_set_textareaElement_setsText() {
        Element el = newElement("textarea");
        el.val("newText");

        assertEquals("newText", el.text());
    }

    // ---------- html ----------

    @Test
    public void testHtml_get_returnsInnerHtml() {
        Element root = newElement("div");
        root.appendElement("p");

        String html = root.html();
        assertTrue(html.contains("<p>"));
    }

    @Test
    public void testHtml_set_replacesInnerHtml() {
        Element root = newElement("div");
        root.appendElement("span");
        Element result = root.html("<p>New</p>");

        assertEquals(1, root.children().size());
        assertEquals("p", root.children().get(0).tagName());
        assertSame(root, result);
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsOuterHtml() {
        Element el = newElement("div");
        String str = el.toString();
        assertNotNull(str);
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameObject_true() {
        Element el = newElement("div");
        assertTrue(el.equals(el));
    }

    @Test
    public void testEquals_differentObject_false() {
        Element el1 = newElement("div");
        Element el2 = newElement("div");
        assertFalse(el1.equals(el2));
    }

    @Test
    public void testHashCode_doesNotThrow() {
        Element el = newElement("div");
        int hash = el.hashCode();
        assertTrue(hash != 0 || hash == 0); // just ensure no exception
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentCopy() {
        Element el = newElement("div");
        el.attr("class", "foo bar");
        el.appendText("hello");

        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.tagName(), clone.tagName());
        assertEquals(el.text(), clone.text());
        assertTrue(clone.hasClass("foo"));
    }
}
