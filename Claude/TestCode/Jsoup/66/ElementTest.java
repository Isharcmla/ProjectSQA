import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
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

    @Test(expected = Exception.class)
    public void testConstructor_withNullTag_throwsException() {
        new Element((Tag) null, "base", new Attributes());
    }

    @Test
    public void testConstructor_withTagAndBaseUri_createsElement() {
        Element e = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals("p", e.tagName());
        assertEquals("http://example.com", e.baseUri());
    }

    // ---------- Basic properties ----------

    @Test
    public void testAttributes_whenNoneSet_returnsEmptyAttributes() {
        assertNotNull(el.attributes());
    }

    @Test
    public void testBaseUri_returnsCorrectUri() {
        Element e = new Element(Tag.valueOf("a"), "http://foo.com");
        assertEquals("http://foo.com", e.baseUri());
    }

    @Test
    public void testChildNodeSize_whenNoChildren_returnsZero() {
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testChildNodeSize_afterAppendChild_returnsOne() {
        el.appendChild(new TextNode("hello"));
        assertEquals(1, el.childNodeSize());
    }

    @Test
    public void testNodeName_returnsTagName() {
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName_get_returnsTag() {
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
        assertEquals("div", el.tag().getName());
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
    public void testId_whenNotSet_returnsEmptyString() {
        assertEquals("", el.id());
    }

    @Test
    public void testId_whenSet_returnsValue() {
        el.attr("id", "myid");
        assertEquals("myid", el.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttrStringValue_setsAttribute() {
        el.attr("class", "foo");
        assertEquals("foo", el.attr("class"));
    }

    @Test
    public void testAttrBooleanTrue_setsBooleanAttribute() {
        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
    }

    @Test
    public void testAttrBooleanFalse_removesAttribute() {
        el.attr("disabled", true);
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_returnsFilteredMap() {
        el.attr("data-foo", "bar");
        assertEquals("bar", el.dataset().get("foo"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParent_whenNoParent_returnsNull() {
        assertNull(el.parent());
    }

    @Test
    public void testParent_afterAppend_returnsParent() {
        Element parent = new Element("div");
        parent.appendChild(el);
        assertEquals(parent, el.parent());
    }

    @Test
    public void testParents_returnsAncestorChain() {
        Document doc = Jsoup.parse("<html><body><div><p>text</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    // ---------- child / children ----------

    @Test
    public void testChild_validIndex_returnsElement() {
        Element child = new Element("span");
        el.appendChild(child);
        assertEquals(child, el.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        el.child(0);
    }

    @Test
    public void testChildren_returnsOnlyElementChildren() {
        el.appendChild(new TextNode("text"));
        el.appendChild(new Element("span"));
        Elements children = el.children();
        assertEquals(1, children.size());
    }

    @Test
    public void testChildren_whenNoChildren_returnsEmpty() {
        assertEquals(0, el.children().size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes_returnsOnlyTextNodes() {
        el.appendChild(new TextNode("hello"));
        el.appendChild(new Element("span"));
        List<TextNode> textNodes = el.textNodes();
        assertEquals(1, textNodes.size());
    }

    @Test
    public void testDataNodes_returnsOnlyDataNodes() {
        el.appendChild(new DataNode("somedata"));
        el.appendChild(new Element("span"));
        List<DataNode> dataNodes = el.dataNodes();
        assertEquals(1, dataNodes.size());
    }

    // ---------- select / selectFirst / is ----------

    @Test
    public void testSelect_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Elements result = doc.select("p.a");
        assertEquals(1, result.size());
    }

    @Test
    public void testSelectFirst_returnsFirstMatch() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.selectFirst("p");
        assertEquals("1", first.text());
    }

    @Test
    public void testSelectFirst_noMatch_returnsNull() {
        Document doc = Jsoup.parse("<div></div>");
        assertNull(doc.selectFirst("p"));
    }

    @Test
    public void testIsString_matchingQuery_returnsTrue() {
        el.attr("class", "foo");
        assertTrue(el.is(".foo"));
    }

    @Test
    public void testIsString_nonMatchingQuery_returnsFalse() {
        assertFalse(el.is(".bar"));
    }

    @Test
    public void testIsEvaluator_matchingTag_returnsTrue() {
        assertTrue(el.is(new Evaluator.Tag("div")));
    }

    // ---------- appendChild / appendTo / prependChild ----------

    @Test
    public void testAppendChild_addsChildAtEnd() {
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        el.appendChild(child1);
        el.appendChild(child2);
        assertEquals(child2, el.child(1));
    }

    @Test(expected = Exception.class)
    public void testAppendChild_null_throwsException() {
        el.appendChild(null);
    }

    @Test
    public void testAppendTo_appendsToParent() {
        Element parent = new Element("div");
        el.appendTo(parent);
        assertEquals(parent, el.parent());
    }

    @Test(expected = Exception.class)
    public void testAppendTo_null_throwsException() {
        el.appendTo(null);
    }

    @Test
    public void testPrependChild_addsChildAtStart() {
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        el.appendChild(child1);
        el.prependChild(child2);
        assertEquals(child2, el.child(0));
    }

    @Test(expected = Exception.class)
    public void testPrependChild_null_throwsException() {
        el.prependChild(null);
    }

    // ---------- insertChildren ----------

    @Test
    public void testInsertChildrenCollection_insertsAtIndex() {
        el.appendChild(new Element("a"));
        el.appendChild(new Element("b"));
        Collection<Node> toInsert = new ArrayList<>();
        toInsert.add(new Element("c"));
        el.insertChildren(1, toInsert);
        assertEquals(3, el.childNodeSize());
        assertEquals("c", el.child(1).tagName());
    }

    @Test
    public void testInsertChildrenCollection_negativeIndex_rollsAround() {
        el.appendChild(new Element("a"));
        Collection<Node> toInsert = new ArrayList<>();
        toInsert.add(new Element("c"));
        el.insertChildren(-1, toInsert);
        assertEquals(2, el.childNodeSize());
    }

    @Test(expected = Exception.class)
    public void testInsertChildrenCollection_invalidIndex_throwsException() {
        Collection<Node> toInsert = new ArrayList<>();
        toInsert.add(new Element("c"));
        el.insertChildren(5, toInsert);
    }

    @Test(expected = Exception.class)
    public void testInsertChildrenCollection_null_throwsException() {
        el.insertChildren(0, (Collection<? extends Node>) null);
    }

    @Test
    public void testInsertChildrenVarargs_insertsAtIndex() {
        el.appendChild(new Element("a"));
        el.insertChildren(0, new Element("b"));
        assertEquals("b", el.child(0).tagName());
    }

    @Test(expected = Exception.class)
    public void testInsertChildrenVarargs_null_throwsException() {
        el.insertChildren(0, (Node[]) null);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_addsNewElementAtEnd() {
        Element child = el.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(child, el.child(0));
    }

    @Test
    public void testPrependElement_addsNewElementAtStart() {
        el.appendElement("a");
        Element child = el.prependElement("p");
        assertEquals(child, el.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_addsTextNode() {
        el.appendText("hello");
        assertEquals("hello", el.text());
    }

    @Test(expected = Exception.class)
    public void testAppendText_null_throwsException() {
        el.appendText(null);
    }

    @Test
    public void testPrependText_addsTextNodeAtStart() {
        el.appendText("world");
        el.prependText("hello ");
        assertEquals("hello world", el.text());
    }

    @Test(expected = Exception.class)
    public void testPrependText_null_throwsException() {
        el.prependText(null);
    }

    // ---------- append / prepend (HTML) ----------

    @Test
    public void testAppend_addsHtmlAtEnd() {
        el.append("<p>hi</p>");
        assertEquals(1, el.children().size());
    }

    @Test(expected = Exception.class)
    public void testAppend_null_throwsException() {
        el.append(null);
    }

    @Test
    public void testPrepend_addsHtmlAtStart() {
        el.append("<p>end</p>");
        el.prepend("<span>start</span>");
        assertEquals("span", el.child(0).tagName());
    }

    @Test(expected = Exception.class)
    public void testPrepend_null_throwsException() {
        el.prepend(null);
    }

    // ---------- before / after ----------

    @Test
    public void testBeforeString_insertsSibling() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>before</span>");
        assertEquals("span", doc.select("div").first().child(0).tagName());
    }

    @Test
    public void testBeforeNode_insertsSibling() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.before(new Element("span"));
        assertEquals("span", doc.select("div").first().child(0).tagName());
    }

    @Test
    public void testAfterString_insertsSibling() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.after("<span>after</span>");
        assertEquals("span", doc.select("div").first().child(1).tagName());
    }

    @Test
    public void testAfterNode_insertsSibling() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.after(new Element("span"));
        assertEquals("span", doc.select("div").first().child(1).tagName());
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_removesAllChildren() {
        el.appendChild(new TextNode("hi"));
        el.appendChild(new Element("span"));
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsElement() {
        Document doc = Jsoup.parse("<div><p>content</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<section></section>");
        assertNotNull(p.parent());
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
    public void testCssSelector_withClass_includesClasses() {
        el.attr("class", "foo bar");
        assertTrue(el.cssSelector().contains("foo"));
    }

    @Test
    public void testCssSelector_withMultipleSiblings_usesNthChild() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements ps = doc.select("p");
        String selector = ps.get(1).cssSelector();
        assertNotNull(selector);
    }

    // ---------- sibling methods ----------

    @Test
    public void testSiblingElements_returnsSiblingsExcludingSelf() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p><p id='c'>3</p></div>");
        Element b = doc.getElementById("b");
        Elements siblings = b.siblingElements();
        assertEquals(2, siblings.size());
    }

    @Test
    public void testSiblingElements_noParent_returnsEmpty() {
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testNextElementSibling_returnsNext() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Element next = a.nextElementSibling();
        assertEquals("b", next.id());
    }

    @Test
    public void testNextElementSibling_noParent_returnsNull() {
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_lastElement_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_returnsPrevious() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        Element prev = b.previousElementSibling();
        assertEquals("a", prev.id());
    }

    @Test
    public void testPreviousElementSibling_noParent_returnsNull() {
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_firstElement_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling_returnsFirst() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        Element first = b.firstElementSibling();
        assertEquals("a", first.id());
    }

    @Test
    public void testFirstElementSibling_singleChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        assertEquals(1, b.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        assertEquals(0, el.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling_returnsLast() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Element last = a.lastElementSibling();
        assertEquals("b", last.id());
    }

    @Test
    public void testLastElementSibling_singleChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.lastElementSibling());
    }

    // ---------- getElementsBy* ----------

    @Test
    public void testGetElementsByTag_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.getElementsByTag("p");
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_empty_throwsException() {
        el.getElementsByTag("");
    }

    @Test
    public void testGetElementById_found_returnsElement() {
        Document doc = Jsoup.parse("<div><p id='x'>text</p></div>");
        Element found = doc.getElementById("x");
        assertNotNull(found);
    }

    @Test
    public void testGetElementById_notFound_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='x'>text</p></div>");
        assertNull(doc.getElementById("notfound"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_empty_throwsException() {
        el.getElementById("");
    }

    @Test
    public void testGetElementsByClass_returnsMatching() {
        Document doc = Jsoup.parse("<div><p class='foo'>1</p><p>2</p></div>");
        Elements result = doc.getElementsByClass("foo");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_empty_throwsException() {
        el.getElementsByClass("");
    }

    @Test
    public void testGetElementsByAttribute_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='x'>1</p><p>2</p></div>");
        Elements result = doc.getElementsByAttribute("title");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_empty_throwsException() {
        el.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttributeStarting_returnsMatching() {
        Document doc = Jsoup.parse("<div><p data-foo='x'>1</p><p>2</p></div>");
        Elements result = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_empty_throwsException() {
        el.getElementsByAttributeStarting("");
    }

    @Test
    public void testGetElementsByAttributeValue_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='x'>1</p><p title='y'>2</p></div>");
        Elements result = doc.getElementsByAttributeValue("title", "x");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='x'>1</p><p title='y'>2</p></div>");
        Elements result = doc.getElementsByAttributeValueNot("title", "x");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueStarting_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='xyz'>1</p><p title='abc'>2</p></div>");
        Elements result = doc.getElementsByAttributeValueStarting("title", "xy");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='xyz'>1</p><p title='abc'>2</p></div>");
        Elements result = doc.getElementsByAttributeValueEnding("title", "yz");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='xyz'>1</p><p title='abc'>2</p></div>");
        Elements result = doc.getElementsByAttributeValueContaining("title", "y");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='123'>1</p><p title='abc'>2</p></div>");
        Elements result = doc.getElementsByAttributeValueMatching("title", Pattern.compile("\\d+"));
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegex_returnsMatching() {
        Document doc = Jsoup.parse("<div><p title='123'>1</p><p title='abc'>2</p></div>");
        Elements result = doc.getElementsByAttributeValueMatching("title", "\\d+");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingRegex_badPattern_throwsException() {
        el.getElementsByAttributeValueMatching("title", "[");
    }

    @Test
    public void testGetElementsByIndexLessThan_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexLessThan(1);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexGreaterThan(0);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexEquals(0);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsContainingText_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>hello world</p><p>other</p></div>");
        Elements result = doc.getElementsContainingText("hello");
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>hello world</p><p>other</p></div>");
        Elements result = doc.getElementsContainingOwnText("hello");
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextPattern_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingText(Pattern.compile("\\d+"));
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextRegex_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextRegex_badPattern_throwsException() {
        el.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText(Pattern.compile("\\d+"));
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextRegex_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextRegex_badPattern_throwsException() {
        el.getElementsMatchingOwnText("[");
    }

    @Test
    public void testGetAllElements_returnsAllNested() {
        Document doc = Jsoup.parse("<div><p><span>text</span></p></div>");
        Elements result = doc.select("div").first().getAllElements();
        assertTrue(result.size() >= 3);
    }

    // ---------- text / ownText / hasText / data ----------

    @Test
    public void testText_combinesChildText() {
        Document doc = Jsoup.parse("<p>One <b>Two</b> Three</p>");
        Element p = doc.select("p").first();
        assertEquals("One Two Three", p.text());
    }

    @Test
    public void testText_empty_returnsEmptyString() {
        assertEquals("", el.text());
    }

    @Test
    public void testOwnText_excludesChildElementText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testHasText_withNonBlankText_returnsTrue() {
        el.appendText("hello");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_withBlankText_returnsFalse() {
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_noChildren_returnsFalse() {
        assertFalse(el.hasText());
    }

    @Test
    public void testData_returnsScriptData() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var a"));
    }

    @Test
    public void testData_noDataNodes_returnsEmptyString() {
        assertEquals("", el.data());
    }

    // ---------- text(String) ----------

    @Test
    public void testTextSet_replacesContent() {
        el.appendChild(new Element("span"));
        el.text("new text");
        assertEquals("new text", el.text());
        assertEquals(0, el.children().size());
    }

    @Test(expected = Exception.class)
    public void testTextSet_null_throwsException() {
        el.text(null);
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassName_whenNotSet_returnsEmptyString() {
        assertEquals("", el.className());
    }

    @Test
    public void testClassName_whenSet_returnsTrimmedValue() {
        el.attr("class", " foo bar ");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNames_returnsSetOfClasses() {
        el.attr("class", "foo bar");
        Set<String> classes = el.classNames();
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
    }

    @Test
    public void testClassNames_whenEmpty_returnsEmptySet() {
        Set<String> classes = el.classNames();
        assertTrue(classes.isEmpty());
    }

    @Test
    public void testClassNamesSet_setsClassAttribute() {
        Set<String> classes = new LinkedHashSet<>();
        classes.add("foo");
        classes.add("bar");
        el.classNames(classes);
        assertEquals("foo bar", el.className());
    }

    @Test(expected = Exception.class)
    public void testClassNamesSet_null_throwsException() {
        el.classNames(null);
    }

    // ---------- hasClass / addClass / removeClass / toggleClass ----------

    @Test
    public void testHasClass_whenPresent_returnsTrue() {
        el.attr("class", "foo bar");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_whenAbsent_returnsFalse() {
        el.attr("class", "foo bar");
        assertFalse(el.hasClass("baz"));
    }

    @Test
    public void testHasClass_emptyClassAttr_returnsFalse() {
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_exactLengthMatch_caseInsensitive() {
        el.attr("class", "FOO");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_wantLenGreaterThanAttrLen_returnsFalse() {
        el.attr("class", "a");
        assertFalse(el.hasClass("foobar"));
    }

    @Test
    public void testAddClass_addsNewClass() {
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test(expected = Exception.class)
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

    @Test(expected = Exception.class)
    public void testRemoveClass_null_throwsException() {
        el.removeClass(null);
    }

    @Test
    public void testToggleClass_addsWhenAbsent() {
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testToggleClass_removesWhenPresent() {
        el.attr("class", "foo");
        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
    }

    @Test(expected = Exception.class)
    public void testToggleClass_null_throwsException() {
        el.toggleClass(null);
    }

    // ---------- val ----------

    @Test
    public void testVal_textarea_returnsText() {
        Element textarea = new Element("textarea");
        textarea.text("sometext");
        assertEquals("sometext", textarea.val());
    }

    @Test
    public void testVal_input_returnsValueAttribute() {
        Element input = new Element("input");
        input.attr("value", "myvalue");
        assertEquals("myvalue", input.val());
    }

    @Test
    public void testValSet_textarea_setsText() {
        Element textarea = new Element("textarea");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    @Test
    public void testValSet_input_setsValueAttribute() {
        Element input = new Element("input");
        input.val("hello");
        assertEquals("hello", input.attr("value"));
    }

    // ---------- html ----------

    @Test
    public void testHtml_returnsInnerHtml() {
        el.appendChild(new Element("p"));
        assertTrue(el.html().contains("<p>"));
    }

    @Test
    public void testHtmlAppendable_appendsToProvided() {
        el.appendChild(new Element("p"));
        StringBuilder sb = new StringBuilder();
        el.html(sb);
        assertTrue(sb.toString().contains("<p>"));
    }

    @Test
    public void testHtmlSet_replacesInnerHtml() {
        el.appendChild(new Element("span"));
        el.html("<p>new</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
    }

    // ---------- toString / clone ----------

    @Test
    public void testToString_returnsOuterHtml() {
        el.appendText("hi");
        assertTrue(el.toString().contains("div"));
    }

    @Test
    public void testClone_createsIndependentCopy() {
        el.appendText("hello");
        Element clone = el.clone();
        assertEquals(el.tagName(), clone.tagName());
        assertNotSame(el, clone);
        clone.text("changed");
        assertEquals("hello", el.text());
    }
}
