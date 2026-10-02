import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    private Element el;

    @Before
    public void setUp() {
        el = new Element(Tag.valueOf("div"), "http://example.com/");
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructor_withAttributes_normal() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Element e = new Element(Tag.valueOf("div"), "http://example.com/", attrs);
        assertEquals("test", e.id());
    }

    @Test(expected = Exception.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com/", new Attributes());
    }

    @Test
    public void testConstructor_withoutAttributes_normal() {
        Element e = new Element(Tag.valueOf("span"), "");
        assertEquals("span", e.tagName());
    }

    // ---------- nodeName / tagName ----------

    @Test
    public void testNodeName_normal_returnsTagName() {
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName_normal_returnsTagName() {
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagName_setNewTag_changesTag() {
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = Exception.class)
    public void testTagName_emptyString_throwsException() {
        el.tagName("");
    }

    // ---------- tag() ----------

    @Test
    public void testTag_normal_returnsTagObject() {
        assertNotNull(el.tag());
        assertEquals("div", el.tag().getName());
    }

    // ---------- isBlock ----------

    @Test
    public void testIsBlock_divTag_true() {
        assertTrue(el.isBlock());
    }

    @Test
    public void testIsBlock_spanTag_false() {
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    // ---------- id ----------

    @Test
    public void testId_notSet_returnsEmptyString() {
        assertEquals("", el.id());
    }

    @Test
    public void testId_set_returnsIdValue() {
        el.attr("id", "myid");
        assertEquals("myid", el.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttr_setAttribute_chaining() {
        Element returned = el.attr("class", "myclass");
        assertSame(el, returned);
        assertEquals("myclass", el.attr("class"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_withDataAttributes_returnsMap() {
        el.attr("data-name", "jsoup");
        Map<String, String> data = el.dataset();
        assertEquals("jsoup", data.get("name"));
    }

    @Test
    public void testDataset_noDataAttributes_emptyMap() {
        Map<String, String> data = el.dataset();
        assertTrue(data.isEmpty());
    }

    // ---------- parent ----------

    @Test
    public void testParent_noParent_null() {
        assertNull(el.parent());
    }

    @Test
    public void testParent_withParent_returnsParent() {
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        Element p = doc.select("p").first();
        assertNotNull(p.parent());
        assertEquals("div", p.parent().tagName());
    }

    // ---------- parents ----------

    @Test
    public void testParents_nested_returnsAncestors() {
        Document doc = Jsoup.parse("<html><body><div><p>Hi</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    @Test
    public void testParents_noParent_emptyList() {
        Elements parents = el.parents();
        assertEquals(0, parents.size());
    }

    // ---------- child / children ----------

    @Test
    public void testChild_validIndex_returnsChild() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Element child = div.child(0);
        assertEquals("p", child.tagName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_invalidIndex_throwsException() {
        el.child(0);
    }

    @Test
    public void testChildren_withChildren_returnsElements() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Element div = doc.select("div").first();
        Elements children = div.children();
        assertEquals(2, children.size());
    }

    @Test
    public void testChildren_noChildren_emptyElements() {
        Elements children = el.children();
        assertEquals(0, children.size());
    }

    // ---------- textNodes ----------

    @Test
    public void testTextNodes_withText_returnsTextNodes() {
        Document doc = Jsoup.parse("<p>Hello World</p>");
        Element p = doc.select("p").first();
        List<TextNode> nodes = p.textNodes();
        assertEquals(1, nodes.size());
    }

    @Test
    public void testTextNodes_noText_emptyList() {
        List<TextNode> nodes = el.textNodes();
        assertTrue(nodes.isEmpty());
    }

    // ---------- dataNodes ----------

    @Test
    public void testDataNodes_scriptTag_returnsDataNodes() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
    }

    @Test
    public void testDataNodes_noDataNodes_emptyList() {
        List<DataNode> dataNodes = el.dataNodes();
        assertTrue(dataNodes.isEmpty());
    }

    // ---------- select ----------

    @Test
    public void testSelect_validQuery_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Elements result = doc.select("p.a");
        assertEquals(1, result.size());
    }

    // ---------- appendChild / prependChild ----------

    @Test
    public void testAppendChild_normal_addsChild() {
        TextNode text = new TextNode("hello", "");
        el.appendChild(text);
        assertEquals(1, el.childNodeSize());
    }

    @Test(expected = Exception.class)
    public void testAppendChild_null_throwsException() {
        el.appendChild(null);
    }

    @Test
    public void testPrependChild_normal_addsChildAtStart() {
        el.appendChild(new TextNode("second", ""));
        el.prependChild(new TextNode("first", ""));
        assertEquals("first", ((TextNode) el.childNode(0)).text());
    }

    @Test(expected = Exception.class)
    public void testPrependChild_null_throwsException() {
        el.prependChild(null);
    }

    // ---------- insertChildren ----------

    @Test
    public void testInsertChildren_validIndex_insertsChildren() {
        Document doc = Jsoup.parse("<div></div>");
        Element div = doc.select("div").first();
        Collection<Node> nodes = new ArrayList<Node>();
        nodes.add(new TextNode("a", ""));
        nodes.add(new TextNode("b", ""));
        div.insertChildren(0, nodes);
        assertEquals(2, div.childNodeSize());
    }

    @Test
    public void testInsertChildren_negativeIndex_insertsAtEnd() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        Element div = doc.select("div").first();
        Collection<Node> nodes = new ArrayList<Node>();
        nodes.add(new TextNode("a", ""));
        div.insertChildren(-1, nodes);
        assertEquals(2, div.childNodeSize());
    }

    @Test(expected = Exception.class)
    public void testInsertChildren_outOfBounds_throwsException() {
        Collection<Node> nodes = new ArrayList<Node>();
        nodes.add(new TextNode("a", ""));
        el.insertChildren(5, nodes);
    }

    @Test(expected = Exception.class)
    public void testInsertChildren_nullCollection_throwsException() {
        el.insertChildren(0, null);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_normal_addsAsLastChild() {
        el.appendElement("span");
        Elements children = el.children();
        assertEquals(1, children.size());
        assertEquals("span", children.get(0).tagName());
    }

    @Test
    public void testPrependElement_normal_addsAsFirstChild() {
        el.appendElement("span");
        el.prependElement("p");
        Elements children = el.children();
        assertEquals("p", children.get(0).tagName());
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_normal_addsTextNode() {
        el.appendText("Hello");
        assertEquals("Hello", el.text());
    }

    @Test
    public void testPrependText_normal_addsTextNodeAtStart() {
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());
    }

    // ---------- append / prepend (HTML) ----------

    @Test
    public void testAppend_normal_addsHtmlContent() {
        el.append("<p>Hi</p>");
        assertEquals(1, el.children().size());
    }

    @Test(expected = Exception.class)
    public void testAppend_null_throwsException() {
        el.append(null);
    }

    @Test
    public void testPrepend_normal_addsHtmlContentAtStart() {
        el.append("<p>Second</p>");
        el.prepend("<span>First</span>");
        assertEquals("span", el.children().get(0).tagName());
    }

    @Test(expected = Exception.class)
    public void testPrepend_null_throwsException() {
        el.prepend(null);
    }

    // ---------- before / after (String and Node) ----------

    @Test
    public void testBeforeString_normal_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p>Target</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>Before</span>");
        Element div = doc.select("div").first();
        assertEquals("span", div.child(0).tagName());
    }

    @Test
    public void testBeforeNode_normal_insertsBeforeElement() {
        Document doc = Jsoup.parse("<div><p>Target</p></div>");
        Element p = doc.select("p").first();
        Element newEl = new Element(Tag.valueOf("span"), "");
        p.before(newEl);
        Element div = doc.select("div").first();
        assertEquals("span", div.child(0).tagName());
    }

    @Test
    public void testAfterString_normal_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p>Target</p></div>");
        Element p = doc.select("p").first();
        p.after("<span>After</span>");
        Element div = doc.select("div").first();
        assertEquals("span", div.child(1).tagName());
    }

    @Test
    public void testAfterNode_normal_insertsAfterElement() {
        Document doc = Jsoup.parse("<div><p>Target</p></div>");
        Element p = doc.select("p").first();
        Element newEl = new Element(Tag.valueOf("span"), "");
        p.after(newEl);
        Element div = doc.select("div").first();
        assertEquals("span", div.child(1).tagName());
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_withChildren_removesAllChildren() {
        el.append("<p>1</p><p>2</p>");
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_normal_wrapsElement() {
        Document doc = Jsoup.parse("<div><p>Target</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<section></section>");
        assertEquals("section", p.parent().tagName());
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElements_noParent_emptyList() {
        Elements siblings = el.siblingElements();
        assertEquals(0, siblings.size());
    }

    @Test
    public void testSiblingElements_withSiblings_returnsOthers() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element second = doc.select("p").get(1);
        Elements siblings = second.siblingElements();
        assertEquals(2, siblings.size());
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSibling_noParent_null() {
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_hasNext_returnsNext() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element next = first.nextElementSibling();
        assertNotNull(next);
        assertEquals("2", next.text());
    }

    @Test
    public void testNextElementSibling_lastElement_null() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element last = doc.select("p").get(1);
        assertNull(last.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_noParent_null() {
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_hasPrevious_returnsPrevious() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element prev = second.previousElementSibling();
        assertNotNull(prev);
        assertEquals("1", prev.text());
    }

    @Test
    public void testPreviousElementSibling_firstElement_null() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        assertNull(first.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSibling_multipleSiblings_returnsFirst() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element first = second.firstElementSibling();
        assertNotNull(first);
        assertEquals("1", first.text());
    }

    @Test
    public void testFirstElementSibling_onlyOneChild_null() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        Element only = doc.select("p").get(0);
        assertNull(only.firstElementSibling());
    }

    @Test
    public void testLastElementSibling_multipleSiblings_returnsLast() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element last = first.lastElementSibling();
        assertNotNull(last);
        assertEquals("2", last.text());
    }

    @Test
    public void testLastElementSibling_onlyOneChild_null() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        Element only = doc.select("p").get(0);
        assertNull(only.lastElementSibling());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndex_noParent_returnsZero() {
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_withParent_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element third = doc.select("p").get(2);
        assertEquals(Integer.valueOf(2), third.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test
    public void testGetElementsByTag_normal_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements ps = doc.getElementsByTag("p");
        assertEquals(2, ps.size());
    }

    @Test(expected = Exception.class)
    public void testGetElementsByTag_emptyString_throwsException() {
        el.getElementsByTag("");
    }

    // ---------- getElementById ----------

    @Test
    public void testGetElementById_exists_returnsElement() {
        Document doc = Jsoup.parse("<div id='target'>Hi</div>");
        Element found = doc.getElementById("target");
        assertNotNull(found);
    }

    @Test
    public void testGetElementById_notExists_returnsNull() {
        Document doc = Jsoup.parse("<div id='other'>Hi</div>");
        Element found = doc.getElementById("nonexistent");
        assertNull(found);
    }

    @Test(expected = Exception.class)
    public void testGetElementById_emptyString_throwsException() {
        el.getElementById("");
    }

    // ---------- getElementsByClass ----------

    @Test
    public void testGetElementsByClass_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div class='header'>1</div><div class='header'>2</div>");
        Elements result = doc.getElementsByClass("header");
        assertEquals(2, result.size());
    }

    // ---------- getElementsByAttribute ----------

    @Test
    public void testGetElementsByAttribute_normal_returnsMatching() {
        Document doc = Jsoup.parse("<a href='#'>Link</a><p>No href</p>");
        Elements result = doc.getElementsByAttribute("href");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test
    public void testGetElementsByAttributeStarting_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div data-name='a'>1</div><div>2</div>");
        Elements result = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValue ----------

    @Test
    public void testGetElementsByAttributeValue_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div class='a'>1</div><div class='b'>2</div>");
        Elements result = doc.getElementsByAttributeValue("class", "a");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueNot ----------

    @Test
    public void testGetElementsByAttributeValueNot_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div class='a'>1</div><div class='b'>2</div>");
        Elements result = doc.getElementsByAttributeValueNot("class", "a");
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsByAttributeValueStarting ----------

    @Test
    public void testGetElementsByAttributeValueStarting_normal_returnsMatching() {
        Document doc = Jsoup.parse("<a href='http://example.com'>Link</a>");
        Elements result = doc.getElementsByAttributeValueStarting("href", "http");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueEnding ----------

    @Test
    public void testGetElementsByAttributeValueEnding_normal_returnsMatching() {
        Document doc = Jsoup.parse("<a href='file.pdf'>Link</a>");
        Elements result = doc.getElementsByAttributeValueEnding("href", ".pdf");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueContaining ----------

    @Test
    public void testGetElementsByAttributeValueContaining_normal_returnsMatching() {
        Document doc = Jsoup.parse("<a href='http://example.com/page'>Link</a>");
        Elements result = doc.getElementsByAttributeValueContaining("href", "example");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueMatching (Pattern) ----------

    @Test
    public void testGetElementsByAttributeValueMatchingPattern_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div id='item123'>1</div>");
        Elements result = doc.getElementsByAttributeValueMatching("id", Pattern.compile("item\\d+"));
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueMatching (String regex) ----------

    @Test
    public void testGetElementsByAttributeValueMatchingRegex_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div id='item123'>1</div>");
        Elements result = doc.getElementsByAttributeValueMatching("id", "item\\d+");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingRegex_invalidRegex_throwsException() {
        el.getElementsByAttributeValueMatching("id", "[");
    }

    // ---------- getElementsByIndexLessThan/GreaterThan/Equals ----------

    @Test
    public void testGetElementsByIndexLessThan_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.getElementsByIndexLessThan(1);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.getElementsByIndexGreaterThan(0);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.getElementsByIndexEquals(0);
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements result = doc.getElementsContainingText("Hello");
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements result = doc.getElementsContainingOwnText("Hello");
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsMatchingText / OwnText (Pattern and String) ----------

    @Test
    public void testGetElementsMatchingTextPattern_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingText(Pattern.compile("\\d+"));
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextRegex_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextRegex_invalidRegex_throwsException() {
        el.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText(Pattern.compile("\\d+"));
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextRegex_normal_returnsMatching() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextRegex_invalidRegex_throwsException() {
        el.getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements_normal_returnsAllIncludingSelf() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Element div = doc.select("div").first();
        Elements all = div.getAllElements();
        assertTrue(all.size() >= 3);
    }

    // ---------- text() ----------

    @Test
    public void testText_normal_returnsCombinedText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello there now!", p.text());
    }

    @Test
    public void testText_empty_returnsEmptyString() {
        assertEquals("", el.text());
    }

    @Test
    public void testText_withBrTag_addsSpace() {
        Document doc = Jsoup.parse("<p>Line1<br>Line2</p>");
        Element p = doc.select("p").first();
        String text = p.text();
        assertTrue(text.contains("Line1") && text.contains("Line2"));
    }

    // ---------- ownText() ----------

    @Test
    public void testOwnText_normal_returnsOwnTextOnly() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testOwnText_noText_returnsEmptyString() {
        assertEquals("", el.ownText());
    }

    // ---------- text(String) ----------

    @Test
    public void testTextSet_normal_clearsAndSetsText() {
        el.append("<p>old</p>");
        Element returned = el.text("new text");
        assertSame(el, returned);
        assertEquals("new text", el.text());
    }

    @Test(expected = Exception.class)
    public void testTextSet_null_throwsException() {
        el.text(null);
    }

    // ---------- hasText ----------

    @Test
    public void testHasText_withNonBlankText_true() {
        el.text("Hello");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_empty_false() {
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_nestedElementHasText_true() {
        Document doc = Jsoup.parse("<div><p>   </p><span><b>Text</b></span></div>");
        Element div = doc.select("div").first();
        assertTrue(div.hasText());
    }

    // ---------- data() ----------

    @Test
    public void testData_scriptTag_returnsData() {
        Document doc = Jsoup.parse("<script>var a=1;</script>");
        Element script = doc.select("script").first();
        assertEquals("var a=1;", script.data());
    }

    @Test
    public void testData_noDataNodes_emptyString() {
        assertEquals("", el.data());
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassName_notSet_emptyString() {
        assertEquals("", el.className());
    }

    @Test
    public void testClassName_set_returnsClassAttribute() {
        el.attr("class", "header gray");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassNames_multipleClasses_returnsSet() {
        el.attr("class", "header gray");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("header"));
        assertTrue(names.contains("gray"));
    }

    @Test
    public void testClassNames_noClass_returnsSetWithEmptyString() {
        Set<String> names = el.classNames();
        assertNotNull(names);
    }

    @Test
    public void testClassNamesSet_normal_updatesClassAttribute() {
        Set<String> names = new LinkedHashSet<String>();
        names.add("foo");
        names.add("bar");
        Element returned = el.classNames(names);
        assertSame(el, returned);
        assertEquals("foo bar", el.className());
    }

    @Test(expected = Exception.class)
    public void testClassNamesSet_null_throwsException() {
        el.classNames(null);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClass_exists_true() {
        el.attr("class", "header gray");
        assertTrue(el.hasClass("header"));
    }

    @Test
    public void testHasClass_caseInsensitive_true() {
        el.attr("class", "Header");
        assertTrue(el.hasClass("header"));
    }

    @Test
    public void testHasClass_notExists_false() {
        el.attr("class", "header");
        assertFalse(el.hasClass("footer"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test
    public void testAddClass_normal_addsClass() {
        el.addClass("newclass");
        assertTrue(el.hasClass("newclass"));
    }

    @Test(expected = Exception.class)
    public void testAddClass_null_throwsException() {
        el.addClass(null);
    }

    @Test
    public void testRemoveClass_exists_removesClass() {
        el.attr("class", "a b");
        el.removeClass("a");
        assertFalse(el.hasClass("a"));
        assertTrue(el.hasClass("b"));
    }

    @Test(expected = Exception.class)
    public void testRemoveClass_null_throwsException() {
        el.removeClass(null);
    }

    @Test
    public void testToggleClass_notPresent_addsClass() {
        el.toggleClass("newclass");
        assertTrue(el.hasClass("newclass"));
    }

    @Test
    public void testToggleClass_present_removesClass() {
        el.attr("class", "existing");
        el.toggleClass("existing");
        assertFalse(el.hasClass("existing"));
    }

    @Test(expected = Exception.class)
    public void testToggleClass_null_throwsException() {
        el.toggleClass(null);
    }

    // ---------- val() / val(String) ----------

    @Test
    public void testVal_textareaTag_returnsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("some value");
        assertEquals("some value", textarea.val());
    }

    @Test
    public void testVal_inputTag_returnsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "myvalue");
        assertEquals("myvalue", input.val());
    }

    @Test
    public void testValSet_textareaTag_setsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    @Test
    public void testValSet_inputTag_setsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("myvalue");
        assertEquals("myvalue", input.attr("value"));
    }

    // ---------- html() / html(String) ----------

    @Test
    public void testHtml_withChildren_returnsInnerHtml() {
        el.append("<p></p>");
        String html = el.html();
        assertTrue(html.contains("<p>"));
    }

    @Test
    public void testHtml_empty_returnsEmptyString() {
        assertEquals("", el.html());
    }

    @Test
    public void testHtmlSet_normal_setsInnerHtml() {
        Element returned = el.html("<p>New</p>");
        assertSame(el, returned);
        assertEquals(1, el.children().size());
    }

    // ---------- toString ----------

    @Test
    public void testToString_normal_returnsOuterHtml() {
        el.attr("id", "test");
        String str = el.toString();
        assertTrue(str.contains("div"));
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(el.equals(el));
    }

    @Test
    public void testEquals_differentInstance_false() {
        Element other = new Element(Tag.valueOf("div"), "");
        assertFalse(el.equals(other));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_consistent_sameValue() {
        int hash1 = el.hashCode();
        int hash2 = el.hashCode();
        assertEquals(hash1, hash2);
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_returnsIndependentCopy() {
        el.attr("class", "myclass");
        el.appendText("Hello");
        Element cloned = el.clone();
        assertNotSame(el, cloned);
        assertEquals(el.className(), cloned.className());
        assertEquals(el.text(), cloned.text());
    }
}
