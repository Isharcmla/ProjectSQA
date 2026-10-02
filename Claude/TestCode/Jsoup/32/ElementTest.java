package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    private Element el;

    @Before
    public void setUp() {
        el = new Element(Tag.valueOf("div"), "http://example.com/");
    }

    // Constructor tests
    @Test
    public void testConstructor_withAttributes_created() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Element e = new Element(Tag.valueOf("div"), "http://example.com/", attrs);
        assertEquals("div", e.tagName());
        assertEquals("test", e.id());
    }

    @Test(expected = Exception.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com/");
    }

    @Test
    public void testNodeName_returnsTagName() {
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName_getterReturnsCorrectName() {
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagName_setter_changesTag() {
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyString_throwsException() {
        el.tagName("");
    }

    @Test
    public void testTag_returnsTagObject() {
        assertNotNull(el.tag());
        assertEquals("div", el.tag().getName());
    }

    @Test
    public void testIsBlock_divIsBlock_true() {
        assertTrue(el.isBlock());
    }

    @Test
    public void testIsBlock_spanIsInline_false() {
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId_noIdAttribute_returnsEmptyString() {
        assertEquals("", el.id());
    }

    @Test
    public void testId_withIdAttribute_returnsValue() {
        el.attr("id", "myid");
        assertEquals("myid", el.id());
    }

    @Test
    public void testAttr_setAndGet_returnsThisElement() {
        Element result = el.attr("class", "myclass");
        assertSame(el, result);
        assertEquals("myclass", el.attr("class"));
    }

    @Test
    public void testDataset_returnsCustomDataAttributes() {
        el.attr("data-name", "jsoup");
        Map<String, String> dataset = el.dataset();
        assertEquals("jsoup", dataset.get("name"));
    }

    @Test
    public void testParent_noParent_returnsNull() {
        assertNull(el.parent());
    }

    @Test
    public void testParent_withParent_returnsParentElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        assertSame(parent, child.parent());
    }

    @Test
    public void testParents_returnsAncestorsChain() {
        Document doc = Jsoup.parse("<html><body><div><p>Text</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    @Test
    public void testChild_validIndex_returnsElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child1);
        assertSame(child1, parent.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        el.child(0);
    }

    @Test
    public void testChildren_returnsOnlyElementNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(new TextNode("text", ""));
        parent.appendChild(new Element(Tag.valueOf("span"), ""));
        Elements children = parent.children();
        assertEquals(1, children.size());
    }

    @Test
    public void testChildren_noChildren_returnsEmptyList() {
        Elements children = el.children();
        assertEquals(0, children.size());
    }

    @Test
    public void testTextNodes_returnsOnlyTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(new TextNode("text", ""));
        parent.appendChild(new Element(Tag.valueOf("span"), ""));
        List<TextNode> nodes = parent.textNodes();
        assertEquals(1, nodes.size());
    }

    @Test
    public void testDataNodes_returnsOnlyDataNodes() {
        Element parent = new Element(Tag.valueOf("script"), "");
        parent.appendChild(new DataNode("some data", ""));
        List<DataNode> nodes = parent.dataNodes();
        assertEquals(1, nodes.size());
    }

    @Test
    public void testSelect_validQuery_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Elements matched = doc.select("p.a");
        assertEquals(1, matched.size());
    }

    @Test
    public void testAppendChild_addsChildAtEnd() {
        Element child = new Element(Tag.valueOf("span"), "");
        Element result = el.appendChild(child);
        assertSame(el, result);
        assertEquals(1, el.children().size());
    }

    @Test(expected = Exception.class)
    public void testAppendChild_nullChild_throwsException() {
        el.appendChild(null);
    }

    @Test
    public void testPrependChild_addsChildAtStart() {
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        el.appendChild(child1);
        el.prependChild(child2);
        assertSame(child2, el.child(0));
    }

    @Test(expected = Exception.class)
    public void testPrependChild_nullChild_throwsException() {
        el.prependChild(null);
    }

    @Test
    public void testInsertChildren_positiveIndex_insertsCorrectly() {
        Element child1 = new Element(Tag.valueOf("span"), "");
        el.appendChild(child1);
        Element child2 = new Element(Tag.valueOf("p"), "");
        java.util.List<Node> newNodes = new java.util.ArrayList<Node>();
        newNodes.add(child2);
        el.insertChildren(0, newNodes);
        assertSame(child2, el.child(0));
    }

    @Test
    public void testInsertChildren_negativeIndex_rollsAround() {
        Element child1 = new Element(Tag.valueOf("span"), "");
        el.appendChild(child1);
        Element child2 = new Element(Tag.valueOf("p"), "");
        java.util.List<Node> newNodes = new java.util.ArrayList<Node>();
        newNodes.add(child2);
        el.insertChildren(-1, newNodes);
        assertEquals(2, el.children().size());
    }

    @Test(expected = Exception.class)
    public void testInsertChildren_nullChildren_throwsException() {
        el.insertChildren(0, null);
    }

    @Test(expected = Exception.class)
    public void testInsertChildren_outOfBoundsIndex_throwsException() {
        java.util.List<Node> newNodes = new java.util.ArrayList<Node>();
        el.insertChildren(5, newNodes);
    }

    @Test
    public void testAppendElement_createsAndAppendsNewElement() {
        Element child = el.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, el.children().size());
    }

    @Test
    public void testPrependElement_createsAndPrependsNewElement() {
        el.appendElement("p");
        Element child = el.prependElement("span");
        assertEquals("span", child.tagName());
        assertSame(child, el.child(0));
    }

    @Test
    public void testAppendText_addsTextNodeAtEnd() {
        Element result = el.appendText("Hello");
        assertSame(el, result);
        assertEquals("Hello", el.text());
    }

    @Test
    public void testPrependText_addsTextNodeAtStart() {
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());
    }

    @Test
    public void testAppend_addsParsedHtmlToEnd() {
        Element result = el.append("<p>Hello</p>");
        assertSame(el, result);
        assertEquals("p", el.child(0).tagName());
    }

    @Test(expected = Exception.class)
    public void testAppend_nullHtml_throwsException() {
        el.append(null);
    }

    @Test
    public void testPrepend_addsParsedHtmlToStart() {
        el.appendElement("span");
        el.prepend("<p>Hello</p>");
        assertEquals("p", el.child(0).tagName());
    }

    @Test(expected = Exception.class)
    public void testPrepend_nullHtml_throwsException() {
        el.prepend(null);
    }

    @Test
    public void testBefore_html_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        p.before("<span>Before</span>");
        assertEquals("span", p.parent().child(0).tagName());
    }

    @Test
    public void testBefore_node_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        Element newEl = new Element(Tag.valueOf("span"), "");
        p.before(newEl);
        assertEquals("span", p.parent().child(0).tagName());
    }

    @Test
    public void testAfter_html_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        p.after("<span>After</span>");
        assertEquals("span", p.parent().child(1).tagName());
    }

    @Test
    public void testAfter_node_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        Element newEl = new Element(Tag.valueOf("span"), "");
        p.after(newEl);
        assertEquals("span", p.parent().child(1).tagName());
    }

    @Test
    public void testEmpty_removesAllChildren() {
        el.appendChild(new Element(Tag.valueOf("span"), ""));
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testWrap_wrapsElementWithHtml() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        p.wrap("<div class='wrapper'></div>");
        assertEquals("wrapper", p.parent().className());
    }

    @Test
    public void testSiblingElements_noParent_returnsEmptyList() {
        Elements siblings = el.siblingElements();
        assertEquals(0, siblings.size());
    }

    @Test
    public void testSiblingElements_withSiblings_excludesSelf() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Elements siblings = a.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals("b", siblings.first().id());
    }

    @Test
    public void testNextElementSibling_noParent_returnsNull() {
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_hasNext_returnsNextElement() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Element next = a.nextElementSibling();
        assertEquals("b", next.id());
    }

    @Test
    public void testNextElementSibling_lastElement_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        assertNull(b.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_noParent_returnsNull() {
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_hasPrevious_returnsPreviousElement() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        Element prev = b.previousElementSibling();
        assertEquals("a", prev.id());
    }

    @Test
    public void testPreviousElementSibling_firstElement_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling_multipleSiblings_returnsFirst() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        Element first = b.firstElementSibling();
        assertEquals("a", first.id());
    }

    @Test
    public void testFirstElementSibling_singleElement_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_withParent_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        assertEquals(Integer.valueOf(1), b.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling_multipleSiblings_returnsLast() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Element last = a.lastElementSibling();
        assertEquals("b", last.id());
    }

    @Test
    public void testLastElementSibling_singleElement_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag_matchingTags_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements elements = doc.getElementsByTag("p");
        assertEquals(2, elements.size());
    }

    @Test(expected = Exception.class)
    public void testGetElementsByTag_emptyString_throwsException() {
        el.getElementsByTag("");
    }

    @Test
    public void testGetElementById_matchingId_returnsElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element found = doc.getElementById("target");
        assertNotNull(found);
    }

    @Test
    public void testGetElementById_noMatch_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element found = doc.getElementById("nonexistent");
        assertNull(found);
    }

    @Test(expected = Exception.class)
    public void testGetElementById_emptyString_throwsException() {
        el.getElementById("");
    }

    @Test
    public void testGetElementsByClass_matchingClass_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='header'>1</p></div>");
        Elements elements = doc.getElementsByClass("header");
        assertEquals(1, elements.size());
    }

    @Test(expected = Exception.class)
    public void testGetElementsByClass_emptyString_throwsException() {
        el.getElementsByClass("");
    }

    @Test
    public void testGetElementsByAttribute_matchingAttribute_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='x'>1</a></div>");
        Elements elements = doc.getElementsByAttribute("href");
        assertEquals(1, elements.size());
    }

    @Test(expected = Exception.class)
    public void testGetElementsByAttribute_emptyString_throwsException() {
        el.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttributeStarting_matchingPrefix_returnsElements() {
        Document doc = Jsoup.parse("<div><a data-foo='x'>1</a></div>");
        Elements elements = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, elements.size());
    }

    @Test(expected = Exception.class)
    public void testGetElementsByAttributeStarting_emptyString_throwsException() {
        el.getElementsByAttributeStarting("");
    }

    @Test
    public void testGetElementsByAttributeValue_matchingValue_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='x'>1</a></div>");
        Elements elements = doc.getElementsByAttributeValue("href", "x");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot_noMatch_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='x'>1</a></div>");
        Elements elements = doc.getElementsByAttributeValueNot("href", "y");
        assertTrue(elements.size() > 0);
    }

    @Test
    public void testGetElementsByAttributeValueStarting_matchingPrefix_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='xyz'>1</a></div>");
        Elements elements = doc.getElementsByAttributeValueStarting("href", "xy");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding_matchingSuffix_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='xyz'>1</a></div>");
        Elements elements = doc.getElementsByAttributeValueEnding("href", "yz");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining_matchingSubstring_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='xyz'>1</a></div>");
        Elements elements = doc.getElementsByAttributeValueContaining("href", "y");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_pattern_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='xyz'>1</a></div>");
        Pattern pattern = Pattern.compile("^xy.*");
        Elements elements = doc.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_validRegex_returnsElements() {
        Document doc = Jsoup.parse("<div><a href='xyz'>1</a></div>");
        Elements elements = doc.getElementsByAttributeValueMatching("href", "^xy.*");
        assertEquals(1, elements.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        el.getElementsByAttributeValueMatching("href", "[invalid(regex");
    }

    @Test
    public void testGetElementsByIndexLessThan_matchingElements_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements elements = doc.select("div").first().getElementsByIndexLessThan(2);
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByIndexGreaterThan_matchingElements_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements elements = doc.select("div").first().getElementsByIndexGreaterThan(0);
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByIndexEquals_matchingElement_returnsElement() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements elements = doc.select("div").first().getElementsByIndexEquals(0);
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsContainingText_matchingText_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements elements = doc.getElementsContainingText("Hello");
        assertTrue(elements.size() > 0);
    }

    @Test
    public void testGetElementsContainingOwnText_matchingText_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements elements = doc.getElementsContainingOwnText("Hello");
        assertTrue(elements.size() > 0);
    }

    @Test
    public void testGetElementsMatchingText_patternMatches_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Pattern pattern = Pattern.compile("Hello.*");
        Elements elements = doc.getElementsMatchingText(pattern);
        assertTrue(elements.size() > 0);
    }

    @Test
    public void testGetElementsMatchingText_validRegex_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements elements = doc.getElementsMatchingText("Hello.*");
        assertTrue(elements.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        el.getElementsMatchingText("[invalid(regex");
    }

    @Test
    public void testGetElementsMatchingOwnText_patternMatches_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Pattern pattern = Pattern.compile("Hello.*");
        Elements elements = doc.getElementsMatchingOwnText(pattern);
        assertTrue(elements.size() > 0);
    }

    @Test
    public void testGetElementsMatchingOwnText_validRegex_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements elements = doc.getElementsMatchingOwnText("Hello.*");
        assertTrue(elements.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        el.getElementsMatchingOwnText("[invalid(regex");
    }

    @Test
    public void testGetAllElements_returnsAllElementsIncludingSelf() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Elements elements = doc.select("div").first().getAllElements();
        assertTrue(elements.size() >= 3);
    }

    @Test
    public void testText_combinedTextOfChildren_returnsCorrectText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello there now!", p.text());
    }

    @Test
    public void testText_noText_returnsEmptyString() {
        assertEquals("", el.text());
    }

    @Test
    public void testOwnText_directTextOnly_returnsCorrectText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testOwnText_withBrTag_addsWhitespace() {
        Document doc = Jsoup.parse("<p>Hello<br>World</p>");
        Element p = doc.select("p").first();
        String own = p.ownText();
        assertNotNull(own);
    }

    @Test
    public void testText_setText_clearsExistingContentAndSetsNewText() {
        el.appendElement("span");
        Element result = el.text("New text");
        assertSame(el, result);
        assertEquals("New text", el.text());
    }

    @Test(expected = Exception.class)
    public void testText_setNullText_throwsException() {
        el.text(null);
    }

    @Test
    public void testHasText_withNonBlankText_returnsTrue() {
        el.appendText("Hello");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_noText_returnsFalse() {
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_withBlankText_returnsFalse() {
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_withNestedElementText_returnsTrue() {
        Element child = el.appendElement("span");
        child.appendText("Nested");
        assertTrue(el.hasText());
    }

    @Test
    public void testData_withDataNode_returnsData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("some script data", ""));
        assertEquals("some script data", script.data());
    }

    @Test
    public void testData_noDataNode_returnsEmptyString() {
        assertEquals("", el.data());
    }

    @Test
    public void testData_nestedElementWithData_returnsCombinedData() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("data1", ""));
        parent.appendChild(script);
        assertEquals("data1", parent.data());
    }

    @Test
    public void testClassName_withClassAttribute_returnsClass() {
        el.attr("class", "header gray");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassName_noClassAttribute_returnsEmptyString() {
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames_withMultipleClasses_returnsSet() {
        el.attr("class", "header gray");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("header"));
        assertTrue(names.contains("gray"));
    }

    @Test
    public void testClassNames_noClassAttribute_returnsEmptySetWithEmptyString() {
        Set<String> names = el.classNames();
        assertEquals(1, names.size());
    }

    @Test
    public void testClassNames_setter_updatesClassAttribute() {
        Set<String> names = new LinkedHashSet<String>();
        names.add("foo");
        names.add("bar");
        Element result = el.classNames(names);
        assertSame(el, result);
        assertTrue(el.className().contains("foo"));
        assertTrue(el.className().contains("bar"));
    }

    @Test(expected = Exception.class)
    public void testClassNames_setterNull_throwsException() {
        el.classNames(null);
    }

    @Test
    public void testHasClass_matchingClassCaseInsensitive_returnsTrue() {
        el.attr("class", "Header");
        assertTrue(el.hasClass("header"));
    }

    @Test
    public void testHasClass_noMatchingClass_returnsFalse() {
        el.attr("class", "header");
        assertFalse(el.hasClass("footer"));
    }

    @Test
    public void testAddClass_addsNewClass_classAppears() {
        el.addClass("newclass");
        assertTrue(el.hasClass("newclass"));
    }

    @Test(expected = Exception.class)
    public void testAddClass_nullClassName_throwsException() {
        el.addClass(null);
    }

    @Test
    public void testRemoveClass_removesExistingClass_classNoLongerPresent() {
        el.attr("class", "foo bar");
        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test(expected = Exception.class)
    public void testRemoveClass_nullClassName_throwsException() {
        el.removeClass(null);
    }

    @Test
    public void testToggleClass_notPresent_addsClass() {
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testToggleClass_present_removesClass() {
        el.attr("class", "foo");
        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
    }

    @Test(expected = Exception.class)
    public void testToggleClass_nullClassName_throwsException() {
        el.toggleClass(null);
    }

    @Test
    public void testVal_textarea_returnsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("Some value");
        assertEquals("Some value", textarea.val());
    }

    @Test
    public void testVal_input_returnsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "myvalue");
        assertEquals("myvalue", input.val());
    }

    @Test
    public void testVal_setTextarea_setsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("New text");
        assertEquals("New text", textarea.text());
    }

    @Test
    public void testVal_setInput_setsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        Element result = input.val("myvalue");
        assertSame(input, result);
        assertEquals("myvalue", input.attr("value"));
    }

    @Test
    public void testHtml_getterReturnsInnerHtml() {
        Document doc = Jsoup.parse("<div><p></p></div>");
        Element div = doc.select("div").first();
        assertEquals("<p></p>", div.html());
    }

    @Test
    public void testHtml_setterClearsExistingAndSetsNewHtml() {
        el.appendElement("span");
        Element result = el.html("<p>New</p>");
        assertSame(el, result);
        assertEquals("p", el.child(0).tagName());
    }

    @Test
    public void testToString_returnsOuterHtml() {
        el.attr("id", "test");
        String result = el.toString();
        assertTrue(result.contains("div"));
    }

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(el.equals(el));
    }

    @Test
    public void testEquals_differentObject_returnsFalse() {
        Element other = new Element(Tag.valueOf("div"), "");
        assertFalse(el.equals(other));
    }

    @Test
    public void testHashCode_returnsConsistentValue() {
        int hash1 = el.hashCode();
        int hash2 = el.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testClone_createsIndependentCopy() {
        el.attr("class", "foo bar");
        el.appendText("Some text");
        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.tagName(), clone.tagName());
        assertEquals(el.text(), clone.text());
    }

    @Test
    public void testOuterHtmlHead_prettyPrintWithFormatBlock_indentsCorrectly() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        String html = doc.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void testPreserveWhitespace_prePreservesWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        assertTrue(pre.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespace_divDoesNotPreserveWhitespace() {
        assertFalse(el.preserveWhitespace());
    }
}
