import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    private Element el;

    @Before
    public void setUp() {
        el = new Element("div");
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructor_withTagString_createsElement() {
        Element e = new Element("span");
        assertEquals("span", e.tagName());
    }

    @Test
    public void testConstructor_withTagBaseUriAttributes_createsElement() {
        Element e = new Element(org.jsoup.parser.Tag.valueOf("p"), "http://example.com", new org.jsoup.nodes.Attributes());
        assertEquals("p", e.tagName());
        assertEquals("http://example.com", e.baseUri());
    }

    @Test
    public void testConstructor_withTagBaseUri_createsElement() {
        Element e = new Element(org.jsoup.parser.Tag.valueOf("p"), "http://example.com");
        assertEquals("p", e.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element((String) null);
    }

    // ---------- tagName / tag ----------

    @Test
    public void testTagName_setNewTag_changesTag() {
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_empty_throwsException() {
        el.tagName("");
    }

    @Test
    public void testTag_returnsTagObject() {
        assertNotNull(el.tag());
    }

    @Test
    public void testIsBlock_divIsBlock_true() {
        assertTrue(el.isBlock());
    }

    @Test
    public void testIsBlock_spanIsNotBlock_false() {
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    // ---------- id / attr ----------

    @Test
    public void testId_noId_returnsEmptyString() {
        assertEquals("", el.id());
    }

    @Test
    public void testId_withId_returnsValue() {
        el.attr("id", "myid");
        assertEquals("myid", el.id());
    }

    @Test
    public void testAttr_stringValue_setsAttribute() {
        el.attr("class", "test");
        assertEquals("test", el.attr("class"));
    }

    @Test
    public void testAttr_booleanTrue_setsAttribute() {
        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
    }

    @Test
    public void testAttr_booleanFalse_removesAttribute() {
        el.attr("disabled", true);
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_withDataAttributes_returnsMap() {
        el.attr("data-foo", "bar");
        assertEquals("bar", el.dataset().get("foo"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParent_noParent_returnsNull() {
        assertNull(el.parent());
    }

    @Test
    public void testParent_withParent_returnsParent() {
        Element parent = new Element("div");
        parent.appendChild(el);
        assertEquals(parent, el.parent());
    }

    @Test
    public void testParents_withNestedElements_returnsAncestors() {
        Document doc = Jsoup.parse("<html><body><div><p>text</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    // ---------- child / children ----------

    @Test
    public void testChild_validIndex_returnsElement() {
        Element child1 = new Element("span");
        el.appendChild(child1);
        assertEquals(child1, el.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        el.child(0);
    }

    @Test
    public void testChildren_noChildren_returnsEmpty() {
        Elements children = el.children();
        assertEquals(0, children.size());
    }

    @Test
    public void testChildren_withChildren_returnsChildren() {
        el.appendChild(new Element("span"));
        el.appendChild(new Element("p"));
        assertEquals(2, el.children().size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes_withTextNode_returnsList() {
        el.appendText("hello");
        List<TextNode> nodes = el.textNodes();
        assertEquals(1, nodes.size());
        assertEquals("hello", nodes.get(0).text());
    }

    @Test
    public void testDataNodes_withNoDataNode_returnsEmpty() {
        assertEquals(0, el.dataNodes().size());
    }

    // ---------- select / selectFirst ----------

    @Test
    public void testSelect_matchingQuery_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p class='b'>2</p></div>");
        Elements result = doc.select("p.a");
        assertEquals(1, result.size());
    }

    @Test
    public void testSelectFirst_matchingQuery_returnsFirstElement() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.selectFirst("p");
        assertEquals("1", first.text());
    }

    @Test
    public void testSelectFirst_noMatch_returnsNull() {
        Document doc = Jsoup.parse("<div></div>");
        assertNull(doc.selectFirst("span"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect_invalidQuery_throwsException() {
        el.select("###");
    }

    // ---------- is ----------

    @Test
    public void testIs_matchingSelector_true() {
        el.attr("class", "foo");
        assertTrue(el.is(".foo"));
    }

    @Test
    public void testIs_nonMatchingSelector_false() {
        assertFalse(el.is(".bar"));
    }

    // ---------- appendChild / appendTo / prependChild ----------

    @Test
    public void testAppendChild_addsChild() {
        Element child = new Element("span");
        el.appendChild(child);
        assertEquals(1, el.childNodeSize());
        assertEquals(el, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_null_throwsException() {
        el.appendChild(null);
    }

    @Test
    public void testAppendTo_appendsToParent() {
        Element parent = new Element("div");
        el.appendTo(parent);
        assertEquals(parent, el.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTo_null_throwsException() {
        el.appendTo(null);
    }

    @Test
    public void testPrependChild_insertsFirst() {
        Element first = new Element("span");
        Element second = new Element("p");
        el.appendChild(first);
        el.prependChild(second);
        assertEquals(second, el.child(0));
    }

    // ---------- insertChildren ----------

    @Test
    public void testInsertChildren_atIndex_insertsNodes() {
        Element a = new Element("a");
        Element b = new Element("b");
        el.appendChild(a);
        el.insertChildren(0, new Element("c"));
        assertEquals("c", el.child(0).tagName());
    }

    @Test
    public void testInsertChildren_negativeIndex_insertsAtEnd() {
        Element a = new Element("a");
        el.appendChild(a);
        el.insertChildren(-1, new Element("z"));
        assertEquals("z", el.child(el.children().size()-1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_outOfBounds_throwsException() {
        el.insertChildren(5, new Element("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_nullCollection_throwsException() {
        el.insertChildren(0, (java.util.Collection<Node>) null);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_addsElementChild() {
        Element child = el.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(el, child.parent());
    }

    @Test
    public void testPrependElement_addsElementAsFirstChild() {
        el.appendElement("p");
        Element span = el.prependElement("span");
        assertEquals(span, el.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_addsTextNode() {
        el.appendText("hello");
        assertEquals("hello", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_null_throwsException() {
        el.appendText(null);
    }

    @Test
    public void testPrependText_addsTextNodeFirst() {
        el.appendText("world");
        el.prependText("hello ");
        assertEquals("hello world", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependText_null_throwsException() {
        el.prependText(null);
    }

    // ---------- append / prepend (html) ----------

    @Test
    public void testAppend_html_addsAsChildren() {
        el.append("<span>hi</span>");
        assertEquals("span", el.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_null_throwsException() {
        el.append(null);
    }

    @Test
    public void testPrepend_html_addsAtBeginning() {
        el.appendElement("p");
        el.prepend("<span>hi</span>");
        assertEquals("span", el.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_null_throwsException() {
        el.prepend(null);
    }

    // ---------- before / after (String & Node) ----------

    @Test
    public void testBefore_html_insertsBeforeElement() {
        Element parent = new Element("div");
        parent.appendChild(el);
        el.before("<span>before</span>");
        assertEquals("span", parent.child(0).tagName());
    }

    @Test
    public void testBefore_node_insertsBeforeElement() {
        Element parent = new Element("div");
        parent.appendChild(el);
        Element newEl = new Element("span");
        el.before(newEl);
        assertEquals(newEl, parent.child(0));
    }

    @Test
    public void testAfter_html_insertsAfterElement() {
        Element parent = new Element("div");
        parent.appendChild(el);
        el.after("<span>after</span>");
        assertEquals("span", parent.child(1).tagName());
    }

    @Test
    public void testAfter_node_insertsAfterElement() {
        Element parent = new Element("div");
        parent.appendChild(el);
        Element newEl = new Element("span");
        el.after(newEl);
        assertEquals(newEl, parent.child(1));
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_removesAllChildren() {
        el.appendChild(new Element("span"));
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsElement() {
        Document doc = Jsoup.parse("<div><p>test</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<section></section>");
        assertEquals("section", p.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void testCssSelector_withId_returnsIdSelector() {
        el.attr("id", "myid");
        assertEquals("#myid", el.cssSelector());
    }

    @Test
    public void testCssSelector_withoutIdNoParent_returnsTagSelector() {
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void testCssSelector_withClass_includesClassInSelector() {
        el.attr("class", "foo bar");
        String selector = el.cssSelector();
        assertTrue(selector.contains("foo"));
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElements_noParent_returnsEmpty() {
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElements_withSiblings_returnsOthers() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element middle = doc.select("p").get(1);
        Elements siblings = middle.siblingElements();
        assertEquals(2, siblings.size());
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSibling_noParent_returnsNull() {
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_hasNext_returnsNext() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").first();
        Element next = first.nextElementSibling();
        assertEquals("2", next.text());
    }

    @Test
    public void testNextElementSibling_isLast_returnsNull() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element last = doc.select("p").last();
        assertNull(last.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_noParent_returnsNull() {
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_hasPrevious_returnsPrevious() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element prev = second.previousElementSibling();
        assertEquals("1", prev.text());
    }

    @Test
    public void testPreviousElementSibling_isFirst_returnsNull() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").first();
        assertNull(first.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSibling_multipleSiblings_returnsFirst() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element first = second.firstElementSibling();
        assertEquals("1", first.text());
    }

    @Test
    public void testFirstElementSibling_onlyOneChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        Element only = doc.select("p").first();
        assertNull(only.firstElementSibling());
    }

    @Test
    public void testLastElementSibling_multipleSiblings_returnsLast() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").first();
        Element last = first.lastElementSibling();
        assertEquals("2", last.text());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        assertEquals(0, el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_withSiblings_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element third = doc.select("p").get(2);
        assertEquals(2, third.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test
    public void testGetElementsByTag_matchingTag_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.getElementsByTag("p");
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_empty_throwsException() {
        el.getElementsByTag("");
    }

    // ---------- getElementById ----------

    @Test
    public void testGetElementById_matchingId_returnsElement() {
        Document doc = Jsoup.parse("<div><p id='x'>1</p></div>");
        Element result = doc.getElementById("x");
        assertNotNull(result);
    }

    @Test
    public void testGetElementById_noMatch_returnsNull() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        assertNull(doc.getElementById("notfound"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_empty_throwsException() {
        el.getElementById("");
    }

    // ---------- getElementsByClass ----------

    @Test
    public void testGetElementsByClass_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foo'>1</p></div>");
        Elements result = doc.getElementsByClass("foo");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttribute ----------

    @Test
    public void testGetElementsByAttribute_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-x='1'>a</p></div>");
        Elements result = doc.getElementsByAttribute("data-x");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test
    public void testGetElementsByAttributeStarting_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-x='1'>a</p></div>");
        Elements result = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValue ----------

    @Test
    public void testGetElementsByAttributeValue_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foo'>a</p></div>");
        Elements result = doc.getElementsByAttributeValue("class", "foo");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foo'>a</p><p class='bar'>b</p></div>");
        Elements result = doc.getElementsByAttributeValueNot("class", "foo");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueStarting_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foobar'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueStarting("class", "foo");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foobar'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueEnding("class", "bar");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foobar'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueContaining("class", "oob");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_pattern_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foo123'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueMatching("class", Pattern.compile("foo\\d+"));
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_regexString_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foo123'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueMatching("class", "foo\\d+");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        el.getElementsByAttributeValueMatching("class", "[");
    }

    // ---------- getElementsByIndex ----------

    @Test
    public void testGetElementsByIndexLessThan_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexLessThan(1);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexGreaterThan(0);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexEquals(0);
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello world</p></div>");
        Elements result = doc.getElementsContainingText("hello");
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsContainingOwnText_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello world</p></div>");
        Elements result = doc.getElementsContainingOwnText("hello");
        assertTrue(result.size() > 0);
    }

    // ---------- getElementsMatchingText / OwnText ----------

    @Test
    public void testGetElementsMatchingText_pattern_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingText(Pattern.compile("\\d+"));
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsMatchingText_regexString_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingText("\\d+");
        assertTrue(result.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        el.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnText_pattern_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText(Pattern.compile("\\d+"));
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsMatchingOwnText_regexString_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(result.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        el.getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements_returnsAllIncludingSelf() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Elements all = doc.select("div").first().getAllElements();
        assertTrue(all.size() >= 3);
    }

    // ---------- text / ownText / text(String) / hasText ----------

    @Test
    public void testText_withNestedElements_returnsCombinedText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello there now!", p.text());
    }

    @Test
    public void testOwnText_withNestedElements_returnsOwnTextOnly() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testTextSet_setsTextAndClearsChildren() {
        el.appendChild(new Element("span"));
        el.text("newtext");
        assertEquals("newtext", el.text());
        assertEquals(1, el.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextSet_null_throwsException() {
        el.text(null);
    }

    @Test
    public void testHasText_withNonBlankText_true() {
        el.appendText("hi");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_noText_false() {
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_withBlankTextOnly_false() {
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_withNestedElementText_true() {
        el.appendElement("span").appendText("nested");
        assertTrue(el.hasText());
    }

    // ---------- data ----------

    @Test
    public void testData_withScriptTag_returnsData() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var x = 1;"));
    }

    @Test
    public void testData_noDataNodes_returnsEmptyString() {
        assertEquals("", el.data());
    }

    // ---------- className / classNames / classNames(Set) / hasClass ----------

    @Test
    public void testClassName_withClassAttribute_returnsValue() {
        el.attr("class", "foo bar");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassName_noClassAttribute_returnsEmptyString() {
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames_multipleClasses_returnsSet() {
        el.attr("class", "foo bar");
        Set<String> names = el.classNames();
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test
    public void testClassNames_noClasses_returnsEmptySet() {
        Set<String> names = el.classNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testClassNamesSet_withValues_setsClassAttribute() {
        Set<String> names = new LinkedHashSet<>();
        names.add("foo");
        names.add("bar");
        el.classNames(names);
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNamesSet_empty_removesClassAttribute() {
        el.attr("class", "foo");
        el.classNames(new LinkedHashSet<String>());
        assertFalse(el.hasAttr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSet_null_throwsException() {
        el.classNames(null);
    }

    @Test
    public void testHasClass_matchingSingleClass_true() {
        el.attr("class", "foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_matchingMultipleClasses_true() {
        el.attr("class", "foo bar baz");
        assertTrue(el.hasClass("bar"));
    }

    @Test
    public void testHasClass_noMatch_false() {
        el.attr("class", "foo bar");
        assertFalse(el.hasClass("baz"));
    }

    @Test
    public void testHasClass_noClassAttribute_false() {
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_caseInsensitive_true() {
        el.attr("class", "FOO");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_shorterThanWant_false() {
        el.attr("class", "f");
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_equalLength_matches() {
        el.attr("class", "foo");
        assertTrue(el.hasClass("foo"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test
    public void testAddClass_addsNewClass() {
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_null_throwsException() {
        el.addClass(null);
    }

    @Test
    public void testRemoveClass_removesExistingClass() {
        el.attr("class", "foo bar");
        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_null_throwsException() {
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

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_null_throwsException() {
        el.toggleClass(null);
    }

    // ---------- val / val(String) ----------

    @Test
    public void testVal_textareaTag_returnsText() {
        Element textarea = new Element("textarea");
        textarea.appendText("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testVal_inputTag_returnsValueAttribute() {
        Element input = new Element("input");
        input.attr("value", "test");
        assertEquals("test", input.val());
    }

    @Test
    public void testValSet_textareaTag_setsText() {
        Element textarea = new Element("textarea");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    @Test
    public void testValSet_inputTag_setsValueAttribute() {
        Element input = new Element("input");
        input.val("test");
        assertEquals("test", input.attr("value"));
    }

    // ---------- html() / html(T) / html(String) ----------

    @Test
    public void testHtml_returnsInnerHtml() {
        el.appendElement("p").text("hi");
        assertTrue(el.html().contains("<p>hi</p>"));
    }

    @Test
    public void testHtmlAppendable_returnsAppendable() {
        el.appendElement("p").text("hi");
        StringBuilder sb = new StringBuilder();
        el.html(sb);
        assertTrue(sb.toString().contains("<p>hi</p>"));
    }

    @Test
    public void testHtmlSet_setsInnerHtml() {
        el.html("<span>hi</span>");
        assertEquals("span", el.child(0).tagName());
    }

    // ---------- toString / clone / shallowClone ----------

    @Test
    public void testToString_returnsOuterHtml() {
        el.attr("id", "x");
        String str = el.toString();
        assertTrue(str.contains("div"));
    }

    @Test
    public void testClone_createsDeepCopy() {
        el.appendChild(new Element("span"));
        Element cloned = el.clone();
        assertEquals(el.tagName(), cloned.tagName());
        assertEquals(el.childNodeSize(), cloned.childNodeSize());
        assertNotSame(el, cloned);
    }

    @Test
    public void testShallowClone_createsElementWithoutChildren() {
        el.appendChild(new Element("span"));
        Element cloned = el.shallowClone();
        assertEquals(el.tagName(), cloned.tagName());
        assertEquals(0, cloned.childNodeSize());
    }
}
