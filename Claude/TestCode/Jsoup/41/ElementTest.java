import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.*;
import java.util.regex.Pattern;

public class ElementTest {

    private Element div;

    @Before
    public void setUp() {
        div = new Element(Tag.valueOf("div"), "http://example.com/");
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructor_withTagBaseUriAttributes_createsElement() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Element el = new Element(Tag.valueOf("span"), "http://example.com", attrs);
        assertEquals("span", el.tagName());
        assertEquals("test", el.id());
    }

    @Test
    public void testConstructor_withTagAndBaseUri_createsElement() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals("p", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com");
    }

    // ---------- nodeName / tagName / tag ----------

    @Test
    public void testNodeName_returnsTagName() {
        assertEquals("div", div.nodeName());
    }

    @Test
    public void testTagName_get_returnsCorrectName() {
        assertEquals("div", div.tagName());
    }

    @Test
    public void testTagName_set_changesTag() {
        div.tagName("span");
        assertEquals("span", div.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_setEmpty_throwsException() {
        div.tagName("");
    }

    @Test
    public void testTag_returnsTagObject() {
        assertNotNull(div.tag());
        assertEquals("div", div.tag().getName());
    }

    @Test
    public void testIsBlock_divIsBlock_returnsTrue() {
        assertTrue(div.isBlock());
    }

    @Test
    public void testIsBlock_spanIsNotBlock_returnsFalse() {
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");
        assertFalse(span.isBlock());
    }

    // ---------- id ----------

    @Test
    public void testId_notSet_returnsEmptyString() {
        assertEquals("", div.id());
    }

    @Test
    public void testId_set_returnsValue() {
        div.attr("id", "myId");
        assertEquals("myId", div.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttr_setAndGet_returnsCorrectValue() {
        Element result = div.attr("class", "container");
        assertSame(div, result);
        assertEquals("container", div.attr("class"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_returnsCustomDataAttributes() {
        div.attr("data-name", "value1");
        div.attr("class", "foo");
        Map<String, String> dataset = div.dataset();
        assertEquals("value1", dataset.get("name"));
        assertFalse(dataset.containsKey("class"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParent_noParent_returnsNull() {
        assertNull(div.parent());
    }

    @Test
    public void testParent_withParent_returnsParent() {
        Element parent = new Element(Tag.valueOf("body"), "http://example.com/");
        parent.appendChild(div);
        assertSame(parent, div.parent());
    }

    @Test
    public void testParents_returnsAncestorChain() {
        Document doc = Jsoup.parse("<html><body><div><p>Text</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    // ---------- child / children ----------

    @Test
    public void testChild_validIndex_returnsElement() {
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com/");
        div.appendChild(child1);
        assertSame(child1, div.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        div.child(0);
    }

    @Test
    public void testChildren_noChildren_returnsEmptyList() {
        Elements children = div.children();
        assertEquals(0, children.size());
    }

    @Test
    public void testChildren_withChildrenAndText_filtersOnlyElements() {
        div.appendText("some text");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");
        div.appendChild(span);
        Elements children = div.children();
        assertEquals(1, children.size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes_returnsTextNodesOnly() {
        div.appendText("Hello");
        List<TextNode> textNodes = div.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Hello", textNodes.get(0).text());
    }

    @Test
    public void testDataNodes_noDataNodes_returnsEmptyList() {
        assertEquals(0, div.dataNodes().size());
    }

    @Test
    public void testDataNodes_withScriptData_returnsDataNode() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertEquals(1, script.dataNodes().size());
    }

    // ---------- select ----------

    @Test
    public void testSelect_matchingQuery_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='x'>1</p><p>2</p></div>");
        Elements result = doc.select("p.x");
        assertEquals(1, result.size());
    }

    // ---------- appendChild / prependChild ----------

    @Test
    public void testAppendChild_addsChildAtEnd() {
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com/");
        Element child2 = new Element(Tag.valueOf("b"), "http://example.com/");
        div.appendChild(child1);
        div.appendChild(child2);
        assertEquals(2, div.children().size());
        assertSame(child2, div.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_null_throwsException() {
        div.appendChild(null);
    }

    @Test
    public void testPrependChild_addsChildAtStart() {
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com/");
        Element child2 = new Element(Tag.valueOf("b"), "http://example.com/");
        div.appendChild(child1);
        div.prependChild(child2);
        assertSame(child2, div.child(0));
    }

    // ---------- insertChildren ----------

    @Test
    public void testInsertChildren_atSpecificIndex_insertsCorrectly() {
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com/");
        div.appendChild(child1);

        Element newChild = new Element(Tag.valueOf("b"), "http://example.com/");
        List<Element> toInsert = new ArrayList<Element>();
        toInsert.add(newChild);
        div.insertChildren(0, toInsert);

        assertSame(newChild, div.child(0));
    }

    @Test
    public void testInsertChildren_negativeIndex_rollsAround() {
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com/");
        div.appendChild(child1);

        Element newChild = new Element(Tag.valueOf("b"), "http://example.com/");
        List<Element> toInsert = new ArrayList<Element>();
        toInsert.add(newChild);
        div.insertChildren(-1, toInsert);

        assertSame(newChild, div.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_outOfBoundsIndex_throwsException() {
        List<Element> toInsert = new ArrayList<Element>();
        toInsert.add(new Element(Tag.valueOf("b"), "http://example.com/"));
        div.insertChildren(5, toInsert);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_nullCollection_throwsException() {
        div.insertChildren(0, null);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_createsAndAppendsElement() {
        Element result = div.appendElement("span");
        assertEquals("span", result.tagName());
        assertSame(result, div.child(0));
    }

    @Test
    public void testPrependElement_createsAndPrependsElement() {
        div.appendElement("span");
        Element result = div.prependElement("b");
        assertEquals("b", result.tagName());
        assertSame(result, div.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_addsTextNodeAtEnd() {
        div.appendText("Hello");
        assertEquals("Hello", div.text());
    }

    @Test
    public void testPrependText_addsTextNodeAtStart() {
        div.appendText("World");
        div.prependText("Hello ");
        assertEquals("Hello World", div.text());
    }

    // ---------- append / prepend (html) ----------

    @Test
    public void testAppend_parsesAndAddsHtml() {
        div.append("<p>Hello</p>");
        assertEquals(1, div.children().size());
        assertEquals("p", div.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_null_throwsException() {
        div.append(null);
    }

    @Test
    public void testPrepend_parsesAndPrependsHtml() {
        div.append("<p>Second</p>");
        div.prepend("<span>First</span>");
        assertEquals("span", div.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_null_throwsException() {
        div.prepend(null);
    }

    // ---------- before / after (String) ----------

    @Test
    public void testBefore_html_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        p.before("<span>Before</span>");
        Elements children = doc.select("div").first().children();
        assertEquals("span", children.get(0).tagName());
    }

    @Test
    public void testAfter_html_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        p.after("<span>After</span>");
        Elements children = doc.select("div").first().children();
        assertEquals("span", children.get(1).tagName());
    }

    // ---------- before / after (Node) ----------

    @Test
    public void testBefore_node_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        TextNode textNode = new TextNode("prefix", doc.baseUri());
        p.before(textNode);
        assertEquals("prefix", doc.select("div").first().childNode(0).outerHtml().trim());
    }

    @Test
    public void testAfter_node_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p id='target'>Text</p></div>");
        Element p = doc.getElementById("target");
        TextNode textNode = new TextNode("suffix", doc.baseUri());
        p.after(textNode);
        Element divEl = doc.select("div").first();
        assertEquals(2, divEl.childNodeSize());
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_removesAllChildren() {
        div.appendText("hello");
        div.appendElement("span");
        div.empty();
        assertEquals(0, div.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsElementWithHtml() {
        Document doc = Jsoup.parse("<div id='target'>Text</div>");
        Element target = doc.getElementById("target");
        target.wrap("<section></section>");
        assertEquals("section", target.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void testCssSelector_withId_returnsIdSelector() {
        div.attr("id", "myDiv");
        assertEquals("#myDiv", div.cssSelector());
    }

    @Test
    public void testCssSelector_withoutId_returnsTagAndClassSelector() {
        Document doc = Jsoup.parse("<html><body><div class='a b'>text</div></body></html>");
        Element target = doc.select("div").first();
        String selector = target.cssSelector();
        assertTrue(selector.contains("div"));
    }

    @Test
    public void testCssSelector_noParent_returnsTagSelectorOnly() {
        Element standalone = new Element(Tag.valueOf("div"), "http://example.com/");
        String selector = standalone.cssSelector();
        assertEquals("div", selector);
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElements_noParent_returnsEmpty() {
        assertEquals(0, div.siblingElements().size());
    }

    @Test
    public void testSiblingElements_withSiblings_returnsOthers() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p><p id='c'>3</p></div>");
        Element b = doc.getElementById("b");
        Elements siblings = b.siblingElements();
        assertEquals(2, siblings.size());
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSibling_noParent_returnsNull() {
        assertNull(div.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_hasNext_returnsNextElement() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Element next = a.nextElementSibling();
        assertEquals("b", next.id());
    }

    @Test
    public void testNextElementSibling_isLast_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        assertNull(b.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_noParent_returnsNull() {
        assertNull(div.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_hasPrevious_returnsPreviousElement() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        Element prev = b.previousElementSibling();
        assertEquals("a", prev.id());
    }

    @Test
    public void testPreviousElementSibling_isFirst_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

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

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        assertEquals(Integer.valueOf(0), div.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_withSiblings_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        assertEquals(Integer.valueOf(1), b.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test
    public void testGetElementsByTag_matchingTag_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.getElementsByTag("p");
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_emptyString_throwsException() {
        div.getElementsByTag("");
    }

    // ---------- getElementById ----------

    @Test
    public void testGetElementById_found_returnsElement() {
        Document doc = Jsoup.parse("<div><p id='target'>1</p></div>");
        Element result = doc.getElementById("target");
        assertNotNull(result);
    }

    @Test
    public void testGetElementById_notFound_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='target'>1</p></div>");
        Element result = doc.getElementById("nonexistent");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_emptyString_throwsException() {
        div.getElementById("");
    }

    // ---------- getElementsByClass ----------

    @Test
    public void testGetElementsByClass_matching_returnsElements() {
        Document doc = Jsoup.parse("<div class='header'>1</div>");
        Elements result = doc.getElementsByClass("header");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttribute ----------

    @Test
    public void testGetElementsByAttribute_matching_returnsElements() {
        Document doc = Jsoup.parse("<a href='#'>link</a>");
        Elements result = doc.getElementsByAttribute("href");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test
    public void testGetElementsByAttributeStarting_matching_returnsElements() {
        Document doc = Jsoup.parse("<div data-name='x'>1</div>");
        Elements result = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValue variants ----------

    @Test
    public void testGetElementsByAttributeValue_matching_returnsElements() {
        Document doc = Jsoup.parse("<div class='header'>1</div>");
        Elements result = doc.getElementsByAttributeValue("class", "header");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot_matching_returnsElements() {
        Document doc = Jsoup.parse("<div class='header'>1</div><div class='footer'>2</div>");
        Elements result = doc.getElementsByAttributeValueNot("class", "header");
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByAttributeValueStarting_matching_returnsElements() {
        Document doc = Jsoup.parse("<a href='http://example.com'>link</a>");
        Elements result = doc.getElementsByAttributeValueStarting("href", "http");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding_matching_returnsElements() {
        Document doc = Jsoup.parse("<a href='page.html'>link</a>");
        Elements result = doc.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining_matching_returnsElements() {
        Document doc = Jsoup.parse("<a href='page.html'>link</a>");
        Elements result = doc.getElementsByAttributeValueContaining("href", "page");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueMatching ----------

    @Test
    public void testGetElementsByAttributeValueMatching_withPattern_returnsElements() {
        Document doc = Jsoup.parse("<a href='page123.html'>link</a>");
        Pattern pattern = Pattern.compile("\\d+");
        Elements result = doc.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_withValidRegexString_returnsElements() {
        Document doc = Jsoup.parse("<a href='page123.html'>link</a>");
        Elements result = doc.getElementsByAttributeValueMatching("href", "\\d+");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegexString_throwsException() {
        div.getElementsByAttributeValueMatching("href", "[");
    }

    // ---------- getElementsByIndex variants ----------

    @Test
    public void testGetElementsByIndexLessThan_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.getElementsByIndexLessThan(1);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.getElementsByIndexGreaterThan(0);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.getElementsByIndexEquals(0);
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements result = doc.getElementsContainingText("Hello");
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello <b>World</b></p></div>");
        Elements result = doc.getElementsContainingOwnText("Hello");
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsMatchingText ----------

    @Test
    public void testGetElementsMatchingText_withPattern_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Pattern pattern = Pattern.compile("\\d+");
        Elements result = doc.getElementsMatchingText(pattern);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingText_withValidRegexString_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegexString_throwsException() {
        div.getElementsMatchingText("[");
    }

    // ---------- getElementsMatchingOwnText ----------

    @Test
    public void testGetElementsMatchingOwnText_withPattern_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Pattern pattern = Pattern.compile("\\d+");
        Elements result = doc.getElementsMatchingOwnText(pattern);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnText_withValidRegexString_returnsElements() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegexString_throwsException() {
        div.getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements_returnsAllElementsIncludingSelf() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Elements all = doc.select("div").first().getAllElements();
        assertTrue(all.size() >= 3);
    }

    // ---------- text ----------

    @Test
    public void testText_combinedTextOfChildren_returnsNormalizedText() {
        Document doc = Jsoup.parse("<p>Hello  <b>there</b> now! </p>");
        Element p = doc.select("p").first();
        assertEquals("Hello there now!", p.text());
    }

    // ---------- ownText ----------

    @Test
    public void testOwnText_excludesChildElementText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    // ---------- text(String) setter ----------

    @Test
    public void testTextSetter_setsTextAndClearsChildren() {
        div.appendElement("span");
        div.text("New text");
        assertEquals("New text", div.text());
        assertEquals(1, div.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextSetter_null_throwsException() {
        div.text(null);
    }

    // ---------- hasText ----------

    @Test
    public void testHasText_withNonBlankText_returnsTrue() {
        div.appendText("Hello");
        assertTrue(div.hasText());
    }

    @Test
    public void testHasText_empty_returnsFalse() {
        assertFalse(div.hasText());
    }

    @Test
    public void testHasText_withBlankTextOnly_returnsFalse() {
        div.appendText("   ");
        assertFalse(div.hasText());
    }

    @Test
    public void testHasText_withChildElementHavingText_returnsTrue() {
        Element span = div.appendElement("span");
        span.appendText("Hi");
        assertTrue(div.hasText());
    }

    // ---------- data ----------

    @Test
    public void testData_withScriptContent_returnsData() {
        Document doc = Jsoup.parse("<script>var a=1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var a=1;"));
    }

    @Test
    public void testData_noDataNodes_returnsEmptyString() {
        assertEquals("", div.data());
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassName_notSet_returnsEmptyString() {
        assertEquals("", div.className());
    }

    @Test
    public void testClassName_set_returnsValue() {
        div.attr("class", "foo bar");
        assertEquals("foo bar", div.className());
    }

    @Test
    public void testClassNames_multipleClasses_returnsSet() {
        div.attr("class", "foo bar");
        Set<String> names = div.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test
    public void testClassNames_noClass_returnsEmptySet() {
        Set<String> names = div.classNames();
        assertEquals(0, names.size());
    }

    @Test
    public void testClassNamesSetter_setsClassAttribute() {
        Set<String> names = new LinkedHashSet<String>();
        names.add("foo");
        names.add("bar");
        div.classNames(names);
        assertEquals("foo bar", div.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetter_null_throwsException() {
        div.classNames(null);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClass_matchingClass_returnsTrue() {
        div.attr("class", "foo bar");
        assertTrue(div.hasClass("foo"));
    }

    @Test
    public void testHasClass_caseInsensitive_returnsTrue() {
        div.attr("class", "Foo");
        assertTrue(div.hasClass("foo"));
    }

    @Test
    public void testHasClass_notMatching_returnsFalse() {
        div.attr("class", "foo");
        assertFalse(div.hasClass("bar"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test
    public void testAddClass_addsNewClass() {
        div.attr("class", "foo");
        div.addClass("bar");
        assertTrue(div.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_null_throwsException() {
        div.addClass(null);
    }

    @Test
    public void testRemoveClass_removesExistingClass() {
        div.attr("class", "foo bar");
        div.removeClass("foo");
        assertFalse(div.hasClass("foo"));
        assertTrue(div.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_null_throwsException() {
        div.removeClass(null);
    }

    @Test
    public void testToggleClass_notPresent_addsClass() {
        div.attr("class", "foo");
        div.toggleClass("bar");
        assertTrue(div.hasClass("bar"));
    }

    @Test
    public void testToggleClass_present_removesClass() {
        div.attr("class", "foo bar");
        div.toggleClass("bar");
        assertFalse(div.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_null_throwsException() {
        div.toggleClass(null);
    }

    // ---------- val ----------

    @Test
    public void testVal_textarea_returnsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com/");
        textarea.appendText("Content");
        assertEquals("Content", textarea.val());
    }

    @Test
    public void testVal_input_returnsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("value", "hello");
        assertEquals("hello", input.val());
    }

    // ---------- val(String) setter ----------

    @Test
    public void testValSetter_textarea_setsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com/");
        textarea.val("Some text");
        assertEquals("Some text", textarea.text());
    }

    @Test
    public void testValSetter_input_setsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.val("myvalue");
        assertEquals("myvalue", input.attr("value"));
    }

    // ---------- html ----------

    @Test
    public void testHtml_get_returnsInnerHtml() {
        div.appendElement("p");
        String html = div.html();
        assertTrue(html.contains("<p>"));
    }

    @Test
    public void testHtmlSetter_setsInnerHtml() {
        div.html("<span>Hello</span>");
        assertEquals(1, div.children().size());
        assertEquals("span", div.child(0).tagName());
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsOuterHtml() {
        div.appendText("Hello");
        String str = div.toString();
        assertTrue(str.contains("Hello"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(div.equals(div));
    }

    @Test
    public void testEquals_differentInstance_returnsFalse() {
        Element other = new Element(Tag.valueOf("div"), "http://example.com/");
        assertFalse(div.equals(other));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(div.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(div.equals("not an element"));
    }

    @Test
    public void testHashCode_consistentForSameObject() {
        int hash1 = div.hashCode();
        int hash2 = div.hashCode();
        assertEquals(hash1, hash2);
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentCopy() {
        div.appendText("Hello");
        div.attr("id", "original");
        Element cloned = div.clone();
        assertEquals(div.tagName(), cloned.tagName());
        assertEquals(div.text(), cloned.text());
        assertNotSame(div, cloned);
    }
}
