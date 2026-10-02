import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
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
        el = new Element("div");
    }

    @Test
    public void testConstructorWithTagName_valid_createsElement() {
        Element e = new Element("p");
        assertEquals("p", e.tagName());
    }

    @Test
    public void testConstructorWithTagBaseUriAttributes_valid_createsElement() {
        Element e = new Element(Tag.valueOf("div"), "http://example.com", new org.jsoup.nodes.Attributes());
        assertEquals("div", e.tagName());
        assertEquals("http://example.com", e.baseUri());
    }

    @Test
    public void testConstructorWithTagBaseUri_valid_createsElement() {
        Element e = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", e.tagName());
        assertEquals("http://example.com", e.baseUri());
    }

    @Test(expected = Exception.class)
    public void testConstructorTagNull_null_throwsException() {
        new Element((Tag) null, "", new org.jsoup.nodes.Attributes());
    }

    @Test
    public void testAttributes_noAttributes_returnsNonNull() {
        assertNotNull(el.attributes());
    }

    @Test
    public void testBaseUri_default_returnsEmptyString() {
        assertEquals("", el.baseUri());
    }

    @Test
    public void testChildNodeSize_noChildren_returnsZero() {
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testNodeName_returnsTagName() {
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName_get_returnsCorrectName() {
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagName_set_changesTag() {
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_setEmpty_throwsException() {
        el.tagName("");
    }

    @Test
    public void testTag_returnsTagObject() {
        assertNotNull(el.tag());
    }

    @Test
    public void testIsBlock_divIsBlock_returnsTrue() {
        assertTrue(el.isBlock());
    }

    @Test
    public void testIsBlock_spanIsInline_returnsFalse() {
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId_noId_returnsEmptyString() {
        assertEquals("", el.id());
    }

    @Test
    public void testId_withId_returnsId() {
        el.attr("id", "myid");
        assertEquals("myid", el.id());
    }

    @Test
    public void testAttrStringString_setAttribute_returnsElement() {
        Element result = el.attr("key", "value");
        assertSame(el, result);
        assertEquals("value", el.attr("key"));
    }

    @Test
    public void testAttrStringBoolean_setTrue_addsAttribute() {
        el.attr("checked", true);
        assertTrue(el.hasAttr("checked"));
    }

    @Test
    public void testAttrStringBoolean_setFalse_removesAttribute() {
        el.attr("checked", true);
        el.attr("checked", false);
        assertFalse(el.hasAttr("checked"));
    }

    @Test
    public void testDataset_withDataAttributes_returnsMap() {
        el.attr("data-foo", "bar");
        Map<String, String> dataset = el.dataset();
        assertEquals("bar", dataset.get("foo"));
    }

    @Test
    public void testParent_noParent_returnsNull() {
        assertNull(el.parent());
    }

    @Test
    public void testParent_withParent_returnsParent() {
        Element parent = new Element("div");
        parent.appendChild(el);
        assertSame(parent, el.parent());
    }

    @Test
    public void testParents_withAncestors_returnsStack() {
        Document doc = Jsoup.parse("<html><body><div><p id='target'>text</p></div></body></html>");
        Element p = doc.getElementById("target");
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    @Test
    public void testChild_validIndex_returnsElement() {
        Element child1 = new Element("p");
        el.appendChild(child1);
        assertSame(child1, el.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        el.child(0);
    }

    @Test
    public void testChildren_withChildren_returnsElements() {
        el.appendChild(new Element("p"));
        el.appendChild(new TextNode("text"));
        Elements children = el.children();
        assertEquals(1, children.size());
    }

    @Test
    public void testChildren_noChildren_returnsEmpty() {
        assertEquals(0, el.children().size());
    }

    @Test
    public void testTextNodes_withTextNodes_returnsList() {
        el.appendChild(new TextNode("hello"));
        List<TextNode> textNodes = el.textNodes();
        assertEquals(1, textNodes.size());
    }

    @Test
    public void testDataNodes_noDataNodes_returnsEmptyList() {
        assertEquals(0, el.dataNodes().size());
    }

    @Test
    public void testSelect_validQuery_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='a'>one</p><p>two</p></div>");
        Elements result = doc.select("p.a");
        assertEquals(1, result.size());
    }

    @Test
    public void testSelectFirst_validQuery_returnsFirstElement() {
        Document doc = Jsoup.parse("<div><p>one</p><p>two</p></div>");
        Element first = doc.selectFirst("p");
        assertEquals("one", first.text());
    }

    @Test
    public void testSelectFirst_noMatch_returnsNull() {
        Document doc = Jsoup.parse("<div><p>one</p></div>");
        Element result = doc.selectFirst("span");
        assertNull(result);
    }

    @Test
    public void testIsString_matchingQuery_returnsTrue() {
        el.attr("class", "foo");
        assertTrue(el.is(".foo"));
    }

    @Test
    public void testIsString_notMatchingQuery_returnsFalse() {
        assertFalse(el.is(".bar"));
    }

    @Test
    public void testAppendChild_validNode_addsChild() {
        Element child = new Element("p");
        el.appendChild(child);
        assertEquals(1, el.childNodeSize());
        assertSame(el, child.parent());
    }

    @Test(expected = Exception.class)
    public void testAppendChild_null_throwsException() {
        el.appendChild(null);
    }

    @Test
    public void testAppendTo_validParent_appendsToParent() {
        Element parent = new Element("div");
        Element result = el.appendTo(parent);
        assertSame(el, result);
        assertSame(parent, el.parent());
    }

    @Test(expected = Exception.class)
    public void testAppendTo_null_throwsException() {
        el.appendTo(null);
    }

    @Test
    public void testPrependChild_validNode_addsAtStart() {
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        el.appendChild(child1);
        el.prependChild(child2);
        assertSame(child2, el.child(0));
    }

    @Test
    public void testInsertChildrenCollection_validIndex_insertsChildren() {
        Element child1 = new Element("p");
        el.appendChild(child1);
        List<Node> toInsert = new java.util.ArrayList<>();
        toInsert.add(new Element("span"));
        el.insertChildren(0, toInsert);
        assertEquals(2, el.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenCollection_invalidIndex_throwsException() {
        List<Node> toInsert = new java.util.ArrayList<>();
        toInsert.add(new Element("span"));
        el.insertChildren(5, toInsert);
    }

    @Test
    public void testInsertChildrenCollection_negativeIndex_rollsAround() {
        Element child1 = new Element("p");
        el.appendChild(child1);
        List<Node> toInsert = new java.util.ArrayList<>();
        toInsert.add(new Element("span"));
        el.insertChildren(-1, toInsert);
        assertEquals(2, el.childNodeSize());
    }

    @Test(expected = Exception.class)
    public void testInsertChildrenCollection_null_throwsException() {
        el.insertChildren(0, (java.util.Collection<Node>) null);
    }

    @Test
    public void testInsertChildrenVarargs_validIndex_insertsChildren() {
        Element child1 = new Element("p");
        el.appendChild(child1);
        el.insertChildren(0, new Element("span"));
        assertEquals(2, el.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenVarargs_invalidIndex_throwsException() {
        el.insertChildren(5, new Element("span"));
    }

    @Test
    public void testAppendElement_validTagName_createsAndAppends() {
        Element child = el.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(1, el.childNodeSize());
    }

    @Test
    public void testPrependElement_validTagName_createsAndPrepends() {
        el.appendElement("span");
        Element child = el.prependElement("p");
        assertEquals("p", child.tagName());
        assertSame(child, el.child(0));
    }

    @Test
    public void testAppendText_validText_appendsTextNode() {
        el.appendText("hello");
        assertEquals("hello", el.text());
    }

    @Test(expected = Exception.class)
    public void testAppendText_null_throwsException() {
        el.appendText(null);
    }

    @Test
    public void testPrependText_validText_prependsTextNode() {
        el.appendText("world");
        el.prependText("hello ");
        assertEquals("hello world", el.text());
    }

    @Test(expected = Exception.class)
    public void testPrependText_null_throwsException() {
        el.prependText(null);
    }

    @Test
    public void testAppend_validHtml_addsNodes() {
        el.append("<p>hello</p>");
        assertEquals(1, el.childNodeSize());
    }

    @Test(expected = Exception.class)
    public void testAppend_null_throwsException() {
        el.append((String) null);
    }

    @Test
    public void testPrepend_validHtml_addsNodesAtStart() {
        el.append("<p>second</p>");
        el.prepend("<span>first</span>");
        assertEquals("span", el.child(0).tagName());
    }

    @Test(expected = Exception.class)
    public void testPrepend_null_throwsException() {
        el.prepend((String) null);
    }

    @Test
    public void testBeforeString_validHtml_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p id='target'>text</p></div>");
        Element target = doc.getElementById("target");
        target.before("<span>before</span>");
        assertEquals("span", target.previousElementSibling().tagName());
    }

    @Test
    public void testBeforeNode_validNode_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p id='target'>text</p></div>");
        Element target = doc.getElementById("target");
        Element newEl = new Element("span");
        target.before(newEl);
        assertEquals("span", target.previousElementSibling().tagName());
    }

    @Test
    public void testAfterString_validHtml_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p id='target'>text</p></div>");
        Element target = doc.getElementById("target");
        target.after("<span>after</span>");
        assertEquals("span", target.nextElementSibling().tagName());
    }

    @Test
    public void testAfterNode_validNode_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p id='target'>text</p></div>");
        Element target = doc.getElementById("target");
        Element newEl = new Element("span");
        target.after(newEl);
        assertEquals("span", target.nextElementSibling().tagName());
    }

    @Test
    public void testEmpty_withChildren_removesAllChildren() {
        el.appendChild(new Element("p"));
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testWrap_validHtml_wrapsElement() {
        Document doc = Jsoup.parse("<div><p id='target'>text</p></div>");
        Element target = doc.getElementById("target");
        target.wrap("<section></section>");
        assertEquals("section", target.parent().tagName());
    }

    @Test
    public void testCssSelector_withId_returnsIdSelector() {
        el.attr("id", "myid");
        assertEquals("#myid", el.cssSelector());
    }

    @Test
    public void testCssSelector_noIdNoParent_returnsTagSelector() {
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void testCssSelector_withClassesAndParent_returnsFullSelector() {
        Document doc = Jsoup.parse("<div><p class='a b'>text</p></div>");
        Element p = doc.select("p").first();
        String selector = p.cssSelector();
        assertNotNull(selector);
        assertTrue(selector.contains("p"));
    }

    @Test
    public void testCssSelector_multipleSiblingsSameSelector_addsNthChild() {
        Document doc = Jsoup.parse("<div><p>one</p><p>two</p></div>");
        Elements ps = doc.select("p");
        String selector = ps.get(1).cssSelector();
        assertTrue(selector.contains("nth-child"));
    }

    @Test
    public void testSiblingElements_noParent_returnsEmpty() {
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElements_withSiblings_returnsOthers() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p><p id='b'>b</p></div>");
        Element a = doc.getElementById("a");
        Elements siblings = a.siblingElements();
        assertEquals(1, siblings.size());
    }

    @Test
    public void testNextElementSibling_hasNext_returnsNextElement() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p><p id='b'>b</p></div>");
        Element a = doc.getElementById("a");
        Element next = a.nextElementSibling();
        assertEquals("b", next.id());
    }

    @Test
    public void testNextElementSibling_noParent_returnsNull() {
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_isLast_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.nextElementSibling());
    }

    @Test
    public void testNextElementSiblings_hasMultiple_returnsAllNext() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p><p>b</p><p>c</p></div>");
        Element a = doc.getElementById("a");
        Elements result = a.nextElementSiblings();
        assertEquals(2, result.size());
    }

    @Test
    public void testPreviousElementSibling_hasPrevious_returnsPreviousElement() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p><p id='b'>b</p></div>");
        Element b = doc.getElementById("b");
        Element prev = b.previousElementSibling();
        assertEquals("a", prev.id());
    }

    @Test
    public void testPreviousElementSibling_noParent_returnsNull() {
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_isFirst_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblings_hasMultiple_returnsAllPrevious() {
        Document doc = Jsoup.parse("<div><p>a</p><p>b</p><p id='c'>c</p></div>");
        Element c = doc.getElementById("c");
        Elements result = c.previousElementSiblings();
        assertEquals(2, result.size());
    }

    @Test
    public void testFirstElementSibling_hasMultipleSiblings_returnsFirst() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p><p id='b'>b</p></div>");
        Element b = doc.getElementById("b");
        Element first = b.firstElementSibling();
        assertEquals("a", first.id());
    }

    @Test
    public void testFirstElementSibling_onlyOneChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        assertEquals(0, el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_hasParent_returnsIndex() {
        Document doc = Jsoup.parse("<div><p>a</p><p id='b'>b</p></div>");
        Element b = doc.getElementById("b");
        assertEquals(1, b.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling_hasMultipleSiblings_returnsLast() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p><p id='b'>b</p></div>");
        Element a = doc.getElementById("a");
        Element last = a.lastElementSibling();
        assertEquals("b", last.id());
    }

    @Test
    public void testLastElementSibling_onlyOneChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>a</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag_matchingTag_returnsElements() {
        Document doc = Jsoup.parse("<div><p>a</p><p>b</p></div>");
        Elements result = doc.getElementsByTag("p");
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_emptyTag_throwsException() {
        el.getElementsByTag("");
    }

    @Test
    public void testGetElementById_matchingId_returnsElement() {
        Document doc = Jsoup.parse("<div><p id='target'>a</p></div>");
        Element result = doc.getElementById("target");
        assertNotNull(result);
    }

    @Test
    public void testGetElementById_noMatch_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='target'>a</p></div>");
        Element result = doc.getElementById("nonexistent");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_emptyId_throwsException() {
        el.getElementById("");
    }

    @Test
    public void testGetElementsByClass_matchingClass_returnsElements() {
        Document doc = Jsoup.parse("<div><p class='foo'>a</p></div>");
        Elements result = doc.getElementsByClass("foo");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_emptyClass_throwsException() {
        el.getElementsByClass("");
    }

    @Test
    public void testGetElementsByAttribute_matchingAttribute_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='x'>a</p></div>");
        Elements result = doc.getElementsByAttribute("data-foo");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_empty_throwsException() {
        el.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttributeStarting_matchingPrefix_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='x'>a</p></div>");
        Elements result = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_empty_throwsException() {
        el.getElementsByAttributeStarting("");
    }

    @Test
    public void testGetElementsByAttributeValue_matchingValue_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='bar'>a</p></div>");
        Elements result = doc.getElementsByAttributeValue("data-foo", "bar");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot_notMatching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='bar'>a</p><span>b</span></div>");
        Elements result = doc.getElementsByAttributeValueNot("data-foo", "bar");
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsByAttributeValueStarting_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='barbaz'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueStarting("data-foo", "bar");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='barbaz'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueEnding("data-foo", "baz");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='barbaz'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueContaining("data-foo", "arba");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='123'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueMatching("data-foo", Pattern.compile("\\d+"));
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegex_validRegex_returnsElements() {
        Document doc = Jsoup.parse("<div><p data-foo='123'>a</p></div>");
        Elements result = doc.getElementsByAttributeValueMatching("data-foo", "\\d+");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingRegex_invalidRegex_throwsException() {
        el.getElementsByAttributeValueMatching("foo", "[");
    }

    @Test
    public void testGetElementsByIndexLessThan_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>a</p><p>b</p><p>c</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexLessThan(1);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>a</p><p>b</p><p>c</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexGreaterThan(0);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsByIndexEquals_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>a</p><p>b</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexEquals(0);
        assertTrue(result.size() > 0);
    }

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

    @Test
    public void testGetElementsMatchingTextPattern_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingText(Pattern.compile("\\d+"));
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsMatchingTextRegex_validRegex_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingText("\\d+");
        assertTrue(result.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextRegex_invalidRegex_throwsException() {
        el.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern_matching_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText(Pattern.compile("\\d+"));
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetElementsMatchingOwnTextRegex_validRegex_returnsElements() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(result.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextRegex_invalidRegex_throwsException() {
        el.getElementsMatchingOwnText("[");
    }

    @Test
    public void testGetAllElements_hasChildren_returnsAll() {
        Document doc = Jsoup.parse("<div><p>a</p><span>b</span></div>");
        Elements result = doc.getAllElements();
        assertTrue(result.size() >= 3);
    }

    @Test
    public void testText_withTextContent_returnsNormalizedText() {
        Document doc = Jsoup.parse("<p>Hello  <b>there</b> now! </p>");
        Element p = doc.select("p").first();
        assertEquals("Hello there now!", p.text());
    }

    @Test
    public void testText_withBlockElements_addsSpace() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Element div = doc.select("div").first();
        assertEquals("One Two", div.text());
    }

    @Test
    public void testWholeText_withWhitespace_returnsUnnormalized() {
        Document doc = Jsoup.parse("<p>Hello\n  world</p>");
        Element p = doc.select("p").first();
        String wholeText = p.wholeText();
        assertTrue(wholeText.contains("\n"));
    }

    @Test
    public void testOwnText_withChildElements_returnsOwnOnly() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testTextSet_validText_clearsAndSetsText() {
        el.appendChild(new Element("p"));
        el.text("new text");
        assertEquals("new text", el.text());
        assertEquals(1, el.childNodeSize());
    }

    @Test(expected = Exception.class)
    public void testTextSet_null_throwsException() {
        el.text(null);
    }

    @Test
    public void testHasText_withNonBlankText_returnsTrue() {
        el.text("hello");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_noText_returnsFalse() {
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_blankTextOnly_returnsFalse() {
        el.appendChild(new TextNode("   "));
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_nestedElementHasText_returnsTrue() {
        Element child = new Element("p");
        child.text("hello");
        el.appendChild(child);
        assertTrue(el.hasText());
    }

    @Test
    public void testData_withScriptContent_returnsData() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var x"));
    }

    @Test
    public void testData_noData_returnsEmptyString() {
        assertEquals("", el.data());
    }

    @Test
    public void testClassName_withClassAttr_returnsClassString() {
        el.attr("class", "foo bar");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassName_noClassAttr_returnsEmpty() {
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames_withMultipleClasses_returnsSet() {
        el.attr("class", "foo bar");
        Set<String> names = el.classNames();
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test
    public void testClassNames_noClasses_returnsEmptySet() {
        Set<String> names = el.classNames();
        assertEquals(0, names.size());
    }

    @Test
    public void testClassNamesSet_withClasses_setsClassAttribute() {
        Set<String> names = new LinkedHashSet<>();
        names.add("foo");
        names.add("bar");
        el.classNames(names);
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNamesSet_emptySet_removesClassAttribute() {
        el.attr("class", "foo");
        Set<String> names = new LinkedHashSet<>();
        el.classNames(names);
        assertFalse(el.hasAttr("class"));
    }

    @Test(expected = Exception.class)
    public void testClassNamesSet_null_throwsException() {
        el.classNames(null);
    }

    @Test
    public void testHasClass_matchingClassExactLength_returnsTrue() {
        el.attr("class", "foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_matchingClassMultiple_returnsTrue() {
        el.attr("class", "foo bar baz");
        assertTrue(el.hasClass("bar"));
    }

    @Test
    public void testHasClass_noMatch_returnsFalse() {
        el.attr("class", "foo bar");
        assertFalse(el.hasClass("baz"));
    }

    @Test
    public void testHasClass_emptyClassAttr_returnsFalse() {
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_classShorterThanWanted_returnsFalse() {
        el.attr("class", "f");
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_caseInsensitive_returnsTrue() {
        el.attr("class", "FOO");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_lastClassMatches_returnsTrue() {
        el.attr("class", "foo bar");
        assertTrue(el.hasClass("bar"));
    }

    @Test
    public void testAddClass_newClass_addsClass() {
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test(expected = Exception.class)
    public void testAddClass_null_throwsException() {
        el.addClass(null);
    }

    @Test
    public void testRemoveClass_existingClass_removesClass() {
        el.attr("class", "foo bar");
        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test(expected = Exception.class)
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

    @Test(expected = Exception.class)
    public void testToggleClass_null_throwsException() {
        el.toggleClass(null);
    }

    @Test
    public void testVal_textarea_returnsText() {
        Element textarea = new Element("textarea");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testVal_input_returnsValueAttr() {
        Element input = new Element("input");
        input.attr("value", "test");
        assertEquals("test", input.val());
    }

    @Test
    public void testValSet_textarea_setsText() {
        Element textarea = new Element("textarea");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    @Test
    public void testValSet_input_setsValueAttr() {
        Element input = new Element("input");
        input.val("test");
        assertEquals("test", input.attr("value"));
    }

    @Test
    public void testHtml_withChildren_returnsInnerHtml() {
        el.appendChild(new Element("p"));
        String html = el.html();
        assertTrue(html.contains("<p>"));
    }

    @Test
    public void testHtmlAppendable_returnsAppendable() {
        el.appendChild(new Element("p"));
        StringBuilder sb = new StringBuilder();
        el.html(sb);
        assertTrue(sb.toString().contains("<p>"));
    }

    @Test
    public void testHtmlSet_validHtml_setsInnerHtml() {
        el.html("<p>new</p>");
        assertEquals(1, el.childNodeSize());
    }

    @Test
    public void testClone_withChildren_clonesElement() {
        el.appendChild(new Element("p"));
        Element clone = el.clone();
        assertEquals(el.tagName(), clone.tagName());
        assertEquals(el.childNodeSize(), clone.childNodeSize());
        assertNotSame(el, clone);
    }

    @Test
    public void testShallowClone_noChildren_returnsNewElement() {
        el.appendChild(new Element("p"));
        Element clone = el.shallowClone();
        assertEquals(el.tagName(), clone.tagName());
        assertEquals(0, clone.childNodeSize());
    }

    @Test
    public void testOuterHtml_normalDiv_returnsHtmlString() {
        Document doc = Jsoup.parse("<div id='a'><p>text</p></div>");
        Element div = doc.getElementById("a");
        String html = div.outerHtml();
        assertTrue(html.contains("<div"));
        assertTrue(html.contains("<p>text</p>"));
    }

    @Test
    public void testOuterHtml_selfClosingTag_returnsCorrectHtml() {
        Document doc = Jsoup.parse("<img src='test.jpg'>");
        Element img = doc.select("img").first();
        String html = img.outerHtml();
        assertTrue(html.contains("<img"));
    }
}
