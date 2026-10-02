import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
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
    public void testConstructor_withTagAndBaseUri_createsElement() {
        Element e = new Element(Tag.valueOf("p"), "http://example.com/");
        assertEquals("p", e.tagName());
        assertEquals("http://example.com/", e.baseUri());
    }

    @Test
    public void testConstructor_withTagBaseUriAttributes_createsElement() {
        Attributes attrs = new Attributes();
        attrs.put("id", "foo");
        Element e = new Element(Tag.valueOf("p"), "http://example.com/", attrs);
        assertEquals("foo", e.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withNullTag_throwsException() {
        new Element((Tag) null, "");
    }

    // ---------- nodeName / tagName / tag ----------

    @Test
    public void testNodeName_returnsTagName() {
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName_returnsTagName() {
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameSet_changesTag_returnsThis() {
        Element result = el.tagName("span");
        assertEquals("span", el.tagName());
        assertSame(el, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSet_withEmptyString_throwsException() {
        el.tagName("");
    }

    @Test
    public void testTag_returnsTagObject() {
        assertNotNull(el.tag());
        assertEquals("div", el.tag().getName());
    }

    // ---------- isBlock ----------

    @Test
    public void testIsBlock_forDiv_returnsTrue() {
        assertTrue(el.isBlock());
    }

    @Test
    public void testIsBlock_forSpan_returnsFalse() {
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    // ---------- id ----------

    @Test
    public void testId_withNoId_returnsEmptyString() {
        assertEquals("", el.id());
    }

    @Test
    public void testId_withId_returnsId() {
        el.attr("id", "myid");
        assertEquals("myid", el.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttrStringValue_setsAttribute_returnsThis() {
        Element result = el.attr("data-test", "value");
        assertEquals("value", el.attr("data-test"));
        assertSame(el, result);
    }

    @Test
    public void testAttrBooleanTrue_setsBooleanAttribute() {
        Element result = el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        assertSame(el, result);
    }

    @Test
    public void testAttrBooleanFalse_removesAttribute() {
        el.attr("disabled", true);
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_returnsDataAttributes() {
        el.attr("data-name", "jsoup");
        assertEquals("jsoup", el.dataset().get("name"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParent_withNoParent_returnsNull() {
        assertNull(el.parent());
    }

    @Test
    public void testParent_withParent_returnsParent() {
        Element parent = new Element("div");
        parent.appendChild(el);
        assertSame(parent, el.parent());
    }

    @Test
    public void testParents_returnsAncestors() {
        Document doc = Jsoup.parse("<html><body><div><p id=target>Hi</p></div></body></html>");
        Element p = doc.getElementById("target");
        Elements parents = p.parents();
        assertTrue(parents.size() > 0);
    }

    // ---------- child / children ----------

    @Test
    public void testChild_returnsChildByIndex() {
        Element c1 = el.appendElement("span");
        Element c2 = el.appendElement("b");
        assertSame(c1, el.child(0));
        assertSame(c2, el.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_withInvalidIndex_throwsException() {
        el.child(5);
    }

    @Test
    public void testChildren_withNoChildren_returnsEmpty() {
        assertEquals(0, el.children().size());
    }

    @Test
    public void testChildren_withMixedNodes_returnsOnlyElements() {
        el.appendText("text");
        el.appendElement("span");
        assertEquals(1, el.children().size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes_returnsTextNodes() {
        el.appendText("hello");
        assertEquals(1, el.textNodes().size());
    }

    @Test
    public void testDataNodes_withNoDataNodes_returnsEmpty() {
        assertEquals(0, el.dataNodes().size());
    }

    @Test
    public void testDataNodes_withScript_returnsDataNodes() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertEquals(1, script.dataNodes().size());
    }

    // ---------- select / is ----------

    @Test
    public void testSelect_withCssQuery_returnsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class=foo>1</p><p>2</p></div>");
        Elements result = doc.select("p.foo");
        assertEquals(1, result.size());
    }

    @Test
    public void testIsString_matchesQuery_returnsTrue() {
        Document doc = Jsoup.parse("<div class=foo></div>");
        Element div = doc.select("div").first();
        assertTrue(div.is(".foo"));
    }

    @Test
    public void testIsString_doesNotMatch_returnsFalse() {
        Document doc = Jsoup.parse("<div class=foo></div>");
        Element div = doc.select("div").first();
        assertFalse(div.is(".bar"));
    }

    @Test
    public void testIsEvaluator_matches_returnsTrue() {
        Document doc = Jsoup.parse("<div class=foo></div>");
        Element div = doc.select("div").first();
        Evaluator eval = new Evaluator.Class("foo");
        assertTrue(div.is(eval));
    }

    // ---------- appendChild / prependChild ----------

    @Test
    public void testAppendChild_addsChildAtEnd() {
        Element child = new Element("span");
        Element result = el.appendChild(child);
        assertSame(el, result);
        assertEquals(1, el.childNodeSize());
        assertSame(child, el.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_withNull_throwsException() {
        el.appendChild(null);
    }

    @Test
    public void testPrependChild_addsChildAtStart() {
        el.appendElement("span");
        Element newChild = new Element("b");
        el.prependChild(newChild);
        assertSame(newChild, el.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_withNull_throwsException() {
        el.prependChild(null);
    }

    // ---------- insertChildren ----------

    @Test
    public void testInsertChildren_atPositiveIndex_insertsCorrectly() {
        el.appendElement("a");
        el.appendElement("b");
        Element toInsert = new Element("c");
        java.util.List<Node> nodes = new java.util.ArrayList<Node>();
        nodes.add(toInsert);
        el.insertChildren(1, nodes);
        assertSame(toInsert, el.childNode(1));
    }

    @Test
    public void testInsertChildren_atNegativeIndex_insertsAtEnd() {
        el.appendElement("a");
        Element toInsert = new Element("c");
        java.util.List<Node> nodes = new java.util.ArrayList<Node>();
        nodes.add(toInsert);
        el.insertChildren(-1, nodes);
        assertSame(toInsert, el.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_withOutOfBoundsIndex_throwsException() {
        java.util.List<Node> nodes = new java.util.ArrayList<Node>();
        nodes.add(new Element("c"));
        el.insertChildren(5, nodes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_withNullChildren_throwsException() {
        el.insertChildren(0, null);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_createsAndAddsElement() {
        Element child = el.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(1, el.childNodeSize());
    }

    @Test
    public void testPrependElement_createsAndAddsElementAtStart() {
        el.appendElement("a");
        Element child = el.prependElement("b");
        assertSame(child, el.childNode(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_addsTextAtEnd() {
        el.appendText("hello");
        assertEquals("hello", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_withNull_throwsException() {
        el.appendText(null);
    }

    @Test
    public void testPrependText_addsTextAtStart() {
        el.appendText("world");
        el.prependText("hello ");
        assertEquals("hello world", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependText_withNull_throwsException() {
        el.prependText(null);
    }

    // ---------- append / prepend (html) ----------

    @Test
    public void testAppend_addsHtmlAtEnd() {
        el.append("<p>Hi</p>");
        assertEquals(1, el.children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_withNull_throwsException() {
        el.append(null);
    }

    @Test
    public void testPrepend_addsHtmlAtStart() {
        el.appendElement("a");
        el.prepend("<b>Hi</b>");
        assertEquals("b", el.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_withNull_throwsException() {
        el.prepend(null);
    }

    // ---------- before / after (String / Node) ----------

    @Test
    public void testBeforeString_insertsHtmlBeforeElement() {
        Document doc = Jsoup.parse("<div><p id=target>Hi</p></div>");
        Element p = doc.getElementById("target");
        p.before("<span>before</span>");
        assertEquals("span", p.parent().child(0).tagName());
    }

    @Test
    public void testBeforeNode_insertsNodeBeforeElement() {
        Document doc = Jsoup.parse("<div><p id=target>Hi</p></div>");
        Element p = doc.getElementById("target");
        Element newEl = new Element("span");
        p.before(newEl);
        assertSame(newEl, p.parent().child(0));
    }

    @Test
    public void testAfterString_insertsHtmlAfterElement() {
        Document doc = Jsoup.parse("<div><p id=target>Hi</p></div>");
        Element p = doc.getElementById("target");
        p.after("<span>after</span>");
        assertEquals("span", p.parent().child(1).tagName());
    }

    @Test
    public void testAfterNode_insertsNodeAfterElement() {
        Document doc = Jsoup.parse("<div><p id=target>Hi</p></div>");
        Element p = doc.getElementById("target");
        Element newEl = new Element("span");
        p.after(newEl);
        assertSame(newEl, p.parent().child(1));
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_removesAllChildren() {
        el.appendElement("p");
        el.appendText("text");
        Element result = el.empty();
        assertEquals(0, el.childNodeSize());
        assertSame(el, result);
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsElementWithHtml() {
        Document doc = Jsoup.parse("<div id=target>Hi</div>");
        Element div = doc.getElementById("target");
        div.wrap("<section></section>");
        assertEquals("section", div.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void testCssSelector_withId_returnsIdSelector() {
        el.attr("id", "myid");
        assertEquals("#myid", el.cssSelector());
    }

    @Test
    public void testCssSelector_withoutIdOrParent_returnsTagSelector() {
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void testCssSelector_withClasses_includesClasses() {
        el.addClass("foo");
        el.addClass("bar");
        String selector = el.cssSelector();
        assertTrue(selector.startsWith("div."));
    }

    @Test
    public void testCssSelector_withParent_buildsFullPath() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element p = doc.select("p").get(1);
        String sel = p.cssSelector();
        assertTrue(sel.contains(">"));
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElements_withNoParent_returnsEmpty() {
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElements_withSiblings_returnsSiblingsExcludingSelf() {
        Document doc = Jsoup.parse("<div><p id=a>1</p><p id=b>2</p><p id=c>3</p></div>");
        Element b = doc.getElementById("b");
        Elements siblings = b.siblingElements();
        assertEquals(2, siblings.size());
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSibling_withNoParent_returnsNull() {
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_withNextSibling_returnsIt() {
        Document doc = Jsoup.parse("<div><p id=a>1</p><p id=b>2</p></div>");
        Element a = doc.getElementById("a");
        Element b = doc.getElementById("b");
        assertSame(b, a.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_withNoNextSibling_returnsNull() {
        Document doc = Jsoup.parse("<div><p id=a>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_withNoParent_returnsNull() {
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_withPreviousSibling_returnsIt() {
        Document doc = Jsoup.parse("<div><p id=a>1</p><p id=b>2</p></div>");
        Element a = doc.getElementById("a");
        Element b = doc.getElementById("b");
        assertSame(a, b.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_withNoPrevious_returnsNull() {
        Document doc = Jsoup.parse("<div><p id=a>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSibling_withMultipleSiblings_returnsFirst() {
        Document doc = Jsoup.parse("<div><p id=a>1</p><p id=b>2</p></div>");
        Element b = doc.getElementById("b");
        Element first = b.firstElementSibling();
        assertEquals("a", first.id());
    }

    @Test
    public void testFirstElementSibling_withSingleChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p id=a>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.firstElementSibling());
    }

    @Test
    public void testLastElementSibling_withMultipleSiblings_returnsLast() {
        Document doc = Jsoup.parse("<div><p id=a>1</p><p id=b>2</p></div>");
        Element a = doc.getElementById("a");
        Element last = a.lastElementSibling();
        assertEquals("b", last.id());
    }

    @Test
    public void testLastElementSibling_withSingleChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p id=a>1</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.lastElementSibling());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndex_withNoParent_returnsZero() {
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_withSiblings_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><p id=a>1</p><p id=b>2</p></div>");
        Element b = doc.getElementById("b");
        assertEquals(Integer.valueOf(1), b.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test
    public void testGetElementsByTag_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements ps = doc.getElementsByTag("p");
        assertEquals(2, ps.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_withEmptyString_throwsException() {
        el.getElementsByTag("");
    }

    // ---------- getElementById ----------

    @Test
    public void testGetElementById_withMatchingId_returnsElement() {
        Document doc = Jsoup.parse("<div><p id=target>Hi</p></div>");
        Element p = doc.getElementById("target");
        assertNotNull(p);
    }

    @Test
    public void testGetElementById_withNoMatch_returnsNull() {
        Document doc = Jsoup.parse("<div><p id=target>Hi</p></div>");
        assertNull(doc.getElementById("nomatch"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_withEmptyString_throwsException() {
        el.getElementById("");
    }

    // ---------- getElementsByClass ----------

    @Test
    public void testGetElementsByClass_findsMatchingElements() {
        Document doc = Jsoup.parse("<div class=foo></div><div class=bar></div>");
        Elements result = doc.getElementsByClass("foo");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_withEmptyString_throwsException() {
        el.getElementsByClass("");
    }

    // ---------- getElementsByAttribute ----------

    @Test
    public void testGetElementsByAttribute_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=x>1</a><a>2</a>");
        Elements result = doc.getElementsByAttribute("href");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_withEmptyString_throwsException() {
        el.getElementsByAttribute("");
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test
    public void testGetElementsByAttributeStarting_findsMatchingElements() {
        Document doc = Jsoup.parse("<div data-foo=1></div><div class=bar></div>");
        Elements result = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_withEmptyString_throwsException() {
        el.getElementsByAttributeStarting("");
    }

    // ---------- getElementsByAttributeValue ----------

    @Test
    public void testGetElementsByAttributeValue_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=x>1</a><a href=y>2</a>");
        Elements result = doc.getElementsByAttributeValue("href", "x");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueNot ----------

    @Test
    public void testGetElementsByAttributeValueNot_findsNonMatchingElements() {
        Document doc = Jsoup.parse("<a href=x>1</a><a href=y>2</a>");
        Elements result = doc.getElementsByAttributeValueNot("href", "x");
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsByAttributeValueStarting ----------

    @Test
    public void testGetElementsByAttributeValueStarting_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=xyz>1</a><a href=abc>2</a>");
        Elements result = doc.getElementsByAttributeValueStarting("href", "xy");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueEnding ----------

    @Test
    public void testGetElementsByAttributeValueEnding_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=abcxyz>1</a><a href=abc>2</a>");
        Elements result = doc.getElementsByAttributeValueEnding("href", "xyz");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueContaining ----------

    @Test
    public void testGetElementsByAttributeValueContaining_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=abcxyz>1</a><a href=def>2</a>");
        Elements result = doc.getElementsByAttributeValueContaining("href", "cxy");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValueMatching (Pattern & String) ----------

    @Test
    public void testGetElementsByAttributeValueMatchingPattern_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=123>1</a><a href=abc>2</a>");
        Pattern pattern = Pattern.compile("\\d+");
        Elements result = doc.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegexString_findsMatchingElements() {
        Document doc = Jsoup.parse("<a href=123>1</a><a href=abc>2</a>");
        Elements result = doc.getElementsByAttributeValueMatching("href", "\\d+");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingRegexString_withInvalidRegex_throwsException() {
        el.getElementsByAttributeValueMatching("href", "[");
    }

    // ---------- getElementsByIndexLessThan / GreaterThan / Equals ----------

    @Test
    public void testGetElementsByIndexLessThan_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexLessThan(1);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexGreaterThan(0);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements result = doc.select("div").first().getElementsByIndexEquals(0);
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        Elements result = doc.getElementsContainingText("Hello");
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>Hello <b>World</b></p></div>");
        Elements result = doc.getElementsContainingOwnText("Hello");
        assertTrue(result.size() >= 1);
    }

    // ---------- getElementsMatchingText / OwnText ----------

    @Test
    public void testGetElementsMatchingTextPattern_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Pattern pattern = Pattern.compile("\\d+");
        Elements result = doc.getElementsMatchingText(pattern);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextRegexString_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>Hello123</p></div>");
        Elements result = doc.getElementsMatchingText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextRegexString_withInvalidRegex_throwsException() {
        el.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>Hello123<b>World</b></p></div>");
        Pattern pattern = Pattern.compile("\\d+");
        Elements result = doc.getElementsMatchingOwnText(pattern);
        assertTrue(result.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextRegexString_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p>Hello123<b>World</b></p></div>");
        Elements result = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(result.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextRegexString_withInvalidRegex_throwsException() {
        el.getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements_returnsAllElementsIncludingSelf() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Elements all = doc.select("div").first().getAllElements();
        assertTrue(all.size() >= 3);
    }

    // ---------- text / ownText / text(String) / hasText ----------

    @Test
    public void testText_returnsCombinedText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello there now!", p.text());
    }

    @Test
    public void testOwnText_returnsOnlyOwnText() {
        Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testTextSet_setsTextAndClearsChildren() {
        el.appendElement("span");
        Element result = el.text("new text");
        assertEquals("new text", el.text());
        assertSame(el, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextSet_withNull_throwsException() {
        el.text(null);
    }

    @Test
    public void testHasText_withNonBlankText_returnsTrue() {
        el.appendText("hello");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_withNoText_returnsFalse() {
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_withBlankText_returnsFalse() {
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasText_withNestedText_returnsTrue() {
        el.appendElement("span").appendText("hello");
        assertTrue(el.hasText());
    }

    // ---------- data ----------

    @Test
    public void testData_withScriptTag_returnsData() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var a"));
    }

    @Test
    public void testData_withNoDataNodes_returnsEmptyString() {
        assertEquals("", el.data());
    }

    // ---------- className / classNames / classNames(Set) ----------

    @Test
    public void testClassName_withNoClass_returnsEmptyString() {
        assertEquals("", el.className());
    }

    @Test
    public void testClassName_withClass_returnsClassAttribute() {
        el.attr("class", "foo bar");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNames_returnsSetOfClassNames() {
        el.attr("class", "foo bar");
        Set<String> classes = el.classNames();
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
    }

    @Test
    public void testClassNames_withNoClass_returnsEmptySet() {
        Set<String> classes = el.classNames();
        assertTrue(classes.isEmpty());
    }

    @Test
    public void testClassNamesSet_setsClassAttribute() {
        Set<String> classes = new LinkedHashSet<String>();
        classes.add("foo");
        classes.add("bar");
        Element result = el.classNames(classes);
        assertEquals("foo bar", el.className());
        assertSame(el, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSet_withNull_throwsException() {
        el.classNames(null);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClass_withMatchingClass_returnsTrue() {
        el.attr("class", "foo bar");
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test
    public void testHasClass_caseInsensitive_returnsTrue() {
        el.attr("class", "FOO");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_withNoMatchingClass_returnsFalse() {
        el.attr("class", "foo");
        assertFalse(el.hasClass("bar"));
    }

    @Test
    public void testHasClass_withEmptyClassAttribute_returnsFalse() {
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_withEqualLength_matchesExact() {
        el.attr("class", "foo");
        assertTrue(el.hasClass("foo"));
        assertFalse(el.hasClass("bar"));
    }

    @Test
    public void testHasClass_withShorterAttribute_returnsFalse() {
        el.attr("class", "fo");
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClass_withMultipleClassesAndTrailingMatch_returnsTrue() {
        el.attr("class", "aaa foo");
        assertTrue(el.hasClass("foo"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test
    public void testAddClass_addsNewClass() {
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_withNull_throwsException() {
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
    public void testRemoveClass_withNull_throwsException() {
        el.removeClass(null);
    }

    @Test
    public void testToggleClass_addsClassIfAbsent() {
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testToggleClass_removesClassIfPresent() {
        el.attr("class", "foo");
        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_withNull_throwsException() {
        el.toggleClass(null);
    }

    // ---------- val / val(String) ----------

    @Test
    public void testVal_withInputElement_returnsValueAttribute() {
        Element input = new Element("input");
        input.attr("value", "hello");
        assertEquals("hello", input.val());
    }

    @Test
    public void testVal_withTextareaElement_returnsText() {
        Element textarea = new Element("textarea");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testValSet_withInputElement_setsValueAttribute() {
        Element input = new Element("input");
        input.val("hello");
        assertEquals("hello", input.attr("value"));
    }

    @Test
    public void testValSet_withTextareaElement_setsText() {
        Element textarea = new Element("textarea");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    // ---------- html() / html(String) / html(Appendable) ----------

    @Test
    public void testHtml_returnsInnerHtml() {
        Document doc = Jsoup.parse("<div><p></p></div>");
        Element div = doc.select("div").first();
        assertTrue(div.html().contains("<p"));
    }

    @Test
    public void testHtmlSet_setsInnerHtml() {
        Element result = el.html("<p>Hi</p>");
        assertEquals(1, el.children().size());
        assertSame(el, result);
    }

    @Test
    public void testHtmlAppendable_appendsToProvidedAppendable() {
        el.appendElement("p");
        StringBuilder sb = new StringBuilder();
        StringBuilder result = el.html(sb);
        assertSame(sb, result);
        assertTrue(sb.toString().contains("<p"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsOuterHtml() {
        el.attr("id", "foo");
        String str = el.toString();
        assertTrue(str.contains("div"));
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentCopy() {
        el.attr("id", "foo");
        el.appendText("hello");
        Element cloned = el.clone();
        assertEquals(el.id(), cloned.id());
        assertNotSame(el, cloned);
        cloned.attr("id", "bar");
        assertEquals("foo", el.id());
    }
}
