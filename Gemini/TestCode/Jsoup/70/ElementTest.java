package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ElementTest {

    @Test
    public void testConstructorsAndBasicProperties() {
        Element el1 = new Element("div");
        assertEquals("div", el1.tagName());
        assertEquals("div", el1.nodeName());
        assertEquals("", el1.baseUri());
        assertTrue(el1.hasAttributes());
        assertTrue(el1.isBlock());

        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("span", el2.tagName());
        assertEquals("http://example.com", el2.baseUri());
        assertFalse(el2.isBlock());
        assertFalse(el2.hasAttributes());

        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com/sub", attrs);
        assertEquals("p", el3.tagName());
        assertEquals("http://example.com/sub", el3.baseUri());
        assertTrue(el3.hasAttributes());
        assertEquals("main", el3.id());
        assertSame(Tag.valueOf("p"), el3.tag());

        el3.setBaseUri("http://example.com/new");
        assertEquals("http://example.com/new", el3.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element((Tag) null, "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUri_throwsException() {
        new Element(Tag.valueOf("div"), null);
    }

    @Test
    public void testTagNameChange() {
        Element el = new Element("div");
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_empty_throwsException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testAttributesAndDataset() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertFalse(el.hasAttributes());
        assertNotNull(el.attributes()); // generates new Attributes
        assertTrue(el.hasAttributes());

        el.attr("title", "heading");
        assertEquals("heading", el.attr("title"));

        el.attr("data-item-id", "123");
        el.attr("data-category", "books");
        Map<String, String> dataset = el.dataset();
        assertEquals(2, dataset.size());
        assertEquals("123", dataset.get("item-id"));

        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));

        assertEquals("", el.id());
        el.attr("id", "header");
        assertEquals("header", el.id());
    }

    @Test
    public void testParentAndParents() {
        Document doc = Jsoup.parse("<div id='p1'><div id='p2'><span id='target'>Text</span></div></div>");
        Element target = doc.getElementById("target");
        Element p2 = doc.getElementById("p2");
        Element p1 = doc.getElementById("p1");

        assertSame(p2, target.parent());
        Elements parents = target.parents();
        assertEquals(4, parents.size()); // p2, p1, body, html (not #root/doc)
        assertSame(p2, parents.get(0));
        assertSame(p1, parents.get(1));

        Element standalone = new Element("div");
        assertNull(standalone.parent());
        assertTrue(standalone.parents().isEmpty());
    }

    @Test
    public void testChildrenAndChildElements() {
        Element el = new Element("div");
        assertTrue(el.children().isEmpty());
        assertEquals(0, el.childNodeSize());

        Element child1 = el.appendElement("p");
        el.appendText("Some text");
        Element child2 = el.appendElement("span");

        assertEquals(3, el.childNodeSize());
        assertEquals(2, el.children().size());
        assertSame(child1, el.child(0));
        assertSame(child2, el.child(1));

        List<TextNode> textNodes = el.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Some text", textNodes.get(0).text());
    }

    @Test
    public void testDataNodes() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.selectFirst("script");
        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var a = 1;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testSelectAndIs() {
        Document doc = Jsoup.parse("<div><p class='intro'>First</p><p class='body'>Second</p></div>");
        Element div = doc.selectFirst("div");

        Elements ps = div.select("p");
        assertEquals(2, ps.size());

        Element firstP = div.selectFirst(".intro");
        assertNotNull(firstP);
        assertEquals("First", firstP.text());

        assertNull(div.selectFirst(".non-existent"));

        assertTrue(firstP.is(".intro"));
        assertTrue(firstP.is(new Evaluator.Class("intro")));
        assertFalse(firstP.is(".body"));
    }

    @Test
    public void testAppendPrependAndInsertChildren() {
        Element div = new Element("div");
        Element child1 = new Element("span").text("1");
        Element child2 = new Element("span").text("2");

        div.appendChild(child1);
        assertEquals(1, div.childNodeSize());
        assertSame(child1, div.child(0));

        div.prependChild(child2);
        assertEquals(2, div.childNodeSize());
        assertSame(child2, div.child(0));

        Element child3 = new Element("span").text("3");
        child3.appendTo(div);
        assertSame(child3, div.child(2));

        Element child0 = new Element("span").text("0");
        div.insertChildren(0, Collections.singletonList(child0));
        assertSame(child0, div.child(0));

        Element child4 = new Element("span").text("4");
        div.insertChildren(-1, child4);
        assertSame(child4, div.child(div.children().size() - 1));

        Element prepEl = div.prependElement("header");
        assertEquals("header", prepEl.tagName());
        assertSame(prepEl, div.child(0));

        div.prependText("Start ");
        div.appendText(" End");
        assertTrue(div.text().startsWith("Start"));
        assertTrue(div.text().endsWith("End"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        Element div = new Element("div");
        div.insertChildren(5, new Element("span"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollection() {
        Element div = new Element("div");
        div.insertChildren(0, (List<Node>) null);
    }

    @Test
    public void testHtmlManipulationMethods() {
        Document doc = Jsoup.parse("<div id='container'><span id='mid'>Middle</span></div>");
        Element mid = doc.getElementById("mid");

        mid.before("<p>Before</p>");
        mid.after("<p>After</p>");

        Element nodeBefore = new Element("b").text("NodeBefore");
        Element nodeAfter = new Element("b").text("NodeAfter");
        mid.before(nodeBefore);
        mid.after(nodeAfter);

        Element container = doc.getElementById("container");
        assertEquals("<div id=\"container\">\n <p>Before</p>\n <b>NodeBefore</b>\n <span id=\"mid\">Middle</span>\n <b>NodeAfter</b>\n <p>After</p>\n</div>", container.outerHtml());

        mid.wrap("<div class='wrapper'></div>");
        assertEquals("wrapper", mid.parent().className());

        container.empty();
        assertEquals(0, container.childNodeSize());

        container.append("<span>Appended</span>");
        container.prepend("<span>Prepended</span>");
        assertEquals("Prepended Appended", container.text());
    }

    @Test
    public void testCssSelector() {
        Document doc = Jsoup.parse("<div id='one'><p class='c1 c2'>Text</p><p class='c1 c2'>Text 2</p></div>");
        Element p1 = doc.selectFirst("p");
        assertEquals("#one > p.c1.c2:nth-child(1)", p1.cssSelector());

        Element one = doc.getElementById("one");
        assertEquals("#one", one.cssSelector());

        Element standalone = new Element("span");
        assertEquals("span", standalone.cssSelector());

        Element nsElem = new Element(Tag.valueOf("ns:custom"), "");
        assertEquals("ns|custom", nsElem.cssSelector());
    }

    @Test
    public void testSiblingNavigation() {
        Document doc = Jsoup.parse("<div><p id='1'>1</p><p id='2'>2</p><p id='3'>3</p></div>");
        Element p1 = doc.getElementById("1");
        Element p2 = doc.getElementById("2");
        Element p3 = doc.getElementById("3");

        assertEquals(2, p2.siblingElements().size());
        assertSame(p1, p2.siblingElements().get(0));
        assertSame(p3, p2.siblingElements().get(1));

        assertSame(p3, p2.nextElementSibling());
        assertNull(p3.nextElementSibling());

        assertSame(p1, p2.previousElementSibling());
        assertNull(p1.previousElementSibling());

        assertSame(p1, p2.firstElementSibling());
        assertSame(p3, p2.lastElementSibling());

        assertEquals(0, p1.elementSiblingIndex());
        assertEquals(1, p2.elementSiblingIndex());
        assertEquals(2, p3.elementSiblingIndex());

        Element single = new Element("div");
        assertTrue(single.siblingElements().isEmpty());
        assertNull(single.nextElementSibling());
        assertNull(single.previousElementSibling());
        assertEquals(0, single.elementSiblingIndex());
    }

    @Test
    public void testGetElementsByMethods() {
        Document doc = Jsoup.parse("<div id='root' class='test-class' data-type='user' attr='hello-world'>"
                + "<p id='child1' class='text item' data-type='admin' attr='greeting'>First Paragraph</p>"
                + "<p id='child2' class='text' attr='goodbye'>Second <span>Paragraph</span></p>"
                + "<input type='text' value='sample' />"
                + "</div>");
        Element root = doc.getElementById("root");

        assertEquals(2, root.getElementsByTag("p").size());
        assertEquals("child1", root.getElementById("child1").id());
        assertNull(root.getElementById("non-existent"));
        assertEquals(2, root.getElementsByClass("text").size());

        assertEquals(3, root.getElementsByAttribute("attr").size());
        assertEquals(2, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("attr", "greeting").size());
        assertEquals(2, root.getElementsByAttributeValueNot("attr", "greeting").size());
        assertEquals(2, root.getElementsByAttributeValueStarting("attr", "g").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("attr", "world").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("attr", "llo").size());

        assertEquals(2, root.getElementsByAttributeValueMatching("attr", Pattern.compile("^g.*")).size());
        assertEquals(2, root.getElementsByAttributeValueMatching("attr", "^g.*").size());

        assertEquals(2, root.getElementsByIndexLessThan(2).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());

        assertEquals(2, root.getElementsContainingText("Paragraph").size());
        assertEquals(1, root.getElementsContainingOwnText("First").size());
        assertEquals(2, root.getElementsMatchingText(Pattern.compile("Paragraph$")).size());
        assertEquals(2, root.getElementsMatchingText("Paragraph$").size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("^First.*")).size());
        assertEquals(1, root.getElementsMatchingOwnText("^First.*").size());

        assertEquals(5, root.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        Element el = new Element("div");
        el.getElementsByAttributeValueMatching("attr", "[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        Element el = new Element("div");
        el.getElementsMatchingText("[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        Element el = new Element("div");
        el.getElementsMatchingOwnText("[invalid");
    }

    @Test
    public void testTextAndOwnTextAndPreserveWhitespace() {
        Document doc = Jsoup.parse("<div>Hello <b>there</b> <br> now! </div><pre> Line 1 \n Line 2 </pre>");
        Element div = doc.selectFirst("div");
        assertEquals("Hello there now!", div.text());
        assertEquals("Hello now!", div.ownText());

        Element pre = doc.selectFirst("pre");
        assertEquals(" Line 1 \n Line 2 ", pre.text());

        assertTrue(div.hasText());
        Element empty = new Element("div");
        assertFalse(empty.hasText());
        empty.append("   ");
        assertFalse(empty.hasText());

        div.text("New Content");
        assertEquals("New Content", div.text());
    }

    @Test
    public void testDataMethod() {
        Document doc = Jsoup.parse("<script>/*<!-- comment -->*/ var x = 10;</script><style>body { color: red; }</style>");
        Element script = doc.selectFirst("script");
        assertEquals("/*<!-- comment -->*/ var x = 10;", script.data());

        Element div = new Element("div");
        div.appendChild(new Comment("comment text"));
        div.appendChild(new DataNode("data text"));
        assertEquals("comment textdata text", div.data());
    }

    @Test
    public void testClassNamesAndManipulation() {
        Element el = new Element("div");
        el.attr("class", "  header   active primary  ");

        assertEquals("header   active primary", el.className());
        Set<String> classNames = el.classNames();
        assertEquals(3, classNames.size());
        assertTrue(classNames.contains("header"));
        assertTrue(classNames.contains("active"));
        assertTrue(classNames.contains("primary"));

        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("active"));
        assertTrue(el.hasClass("primary"));
        assertTrue(el.hasClass("HEADER"));
        assertFalse(el.hasClass("head"));
        assertFalse(el.hasClass("secondary"));

        el.addClass("extra");
        assertTrue(el.hasClass("extra"));

        el.removeClass("active");
        assertFalse(el.hasClass("active"));

        el.toggleClass("primary");
        assertFalse(el.hasClass("primary"));
        el.toggleClass("primary");
        assertTrue(el.hasClass("primary"));

        el.classNames(new LinkedHashSet<>(Arrays.asList("one", "two")));
        assertEquals("one two", el.className());

        el.classNames(Collections.emptySet());
        assertFalse(el.hasAttr("class"));
        assertFalse(el.hasClass("one"));
    }

    @Test
    public void testHasClassEdgeCases() {
        Element el = new Element("div");
        assertFalse(el.hasClass("test"));

        el.attr("class", "test");
        assertTrue(el.hasClass("test"));
        assertTrue(el.hasClass("TEST"));
        assertFalse(el.hasClass("testing"));
        assertFalse(el.hasClass("te"));

        el.attr("class", "first second third");
        assertTrue(el.hasClass("first"));
        assertTrue(el.hasClass("second"));
        assertTrue(el.hasClass("third"));
        assertFalse(el.hasClass("sec"));
        assertFalse(el.hasClass("firs"));
        assertFalse(el.hasClass("hir"));
    }

    @Test
    public void testValMethod() {
        Element input = new Element("input");
        input.val("input value");
        assertEquals("input value", input.val());

        Element textarea = new Element("textarea");
        textarea.val("textarea value");
        assertEquals("textarea value", textarea.val());
        assertEquals("textarea value", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtmlRendering() throws IOException {
        Element div = new Element("div");
        div.attr("id", "outer");
        div.html("<p>Paragraph</p>");
        assertEquals("<p>Paragraph</p>", div.html());

        StringWriter writer = new StringWriter();
        div.html(writer);
        assertEquals("<p>Paragraph</p>", writer.toString());

        Element img = new Element(Tag.valueOf("img"), "");
        assertEquals("<img>", img.outerHtml());

        Document xmlDoc = Jsoup.parse("<xml><img /></xml>", "", Parser.xmlParser());
        Element xmlImg = xmlDoc.selectFirst("img");
        assertEquals("<img />", xmlImg.outerHtml());

        assertEquals(div.outerHtml(), div.toString());
    }

    @Test
    public void testCloneAndShallowClone() {
        Element original = new Element(Tag.valueOf("div"), "http://example.com");
        original.attr("id", "main");
        original.appendElement("span").text("Child");

        Element clone = original.clone();
        assertNotEquals(System.identityHashCode(original), System.identityHashCode(clone));
        assertEquals(original.outerHtml(), clone.outerHtml());
        assertEquals("Child", clone.child(0).text());

        Element shallow = original.shallowClone();
        assertEquals("main", shallow.attr("id"));
        assertEquals(0, shallow.childNodeSize());
        assertEquals("http://example.com", shallow.baseUri());
    }

    @Test
    public void testWhitespacePreserveHierarchy() {
        Document doc = Jsoup.parse("<div><pre><span>  nested pre whitespace  </span></pre></div>");
        Element span = doc.selectFirst("span");
        assertEquals("  nested pre whitespace  ", span.text());
    }
}
