package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructorAndGetters() {
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "testId");
        Element el = new Element(tag, "http://example.com", attrs);

        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertEquals(tag, el.tag());
        assertEquals("http://example.com", el.baseUri());
        assertEquals("testId", el.id());
        assertTrue(el.isBlock());

        Element el2 = new Element(Tag.valueOf("span"), "");
        assertEquals("span", el2.nodeName());
        assertEquals("", el2.id());
        assertFalse(el2.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTagThrowsException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void testTagNameChange() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName("div");
        assertEquals("div", el.tagName());
        assertTrue(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyThrowsException() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName("");
    }

    @Test
    public void testAttrAndDataset() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-name", "jsoup");
        el.attr("data-lang", "java");
        el.attr("class", "main");

        assertEquals("jsoup", el.attr("data-name"));
        Map<String, String> dataset = el.dataset();
        assertEquals(2, dataset.size());
        assertEquals("jsoup", dataset.get("name"));
        assertEquals("java", dataset.get("lang"));
    }

    @Test
    public void testParentsAndParent() {
        Document doc = Jsoup.parse("<html><body><div><p><span>Hello</span></p></div></body></html>");
        Element span = doc.select("span").first();
        assertNotNull(span);

        Element p = span.parent();
        assertEquals("p", p.tagName());

        Elements parents = span.parents();
        assertEquals(4, parents.size());
        assertEquals("p", parents.get(0).tagName());
        assertEquals("div", parents.get(1).tagName());
        assertEquals("body", parents.get(2).tagName());
        assertEquals("html", parents.get(3).tagName());

        Element standalone = new Element(Tag.valueOf("div"), "");
        assertNull(standalone.parent());
        assertEquals(0, standalone.parents().size());
    }

    @Test
    public void testChildrenAndChild() {
        Document doc = Jsoup.parse("<div>Text 1<p>Para</p>Text 2<span>Span</span><!-- comment --></div>");
        Element div = doc.select("div").first();

        Elements children = div.children();
        assertEquals(2, children.size());
        assertEquals("p", children.get(0).tagName());
        assertEquals("span", children.get(1).tagName());

        assertEquals("p", div.child(0).tagName());
        assertEquals("span", div.child(1).tagName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_outOfBoundsThrowsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes() {
        Document doc = Jsoup.parse("<div>Text 1<p>Para</p>Text 2<script>var x = 1;</script></div>");
        Element div = doc.select("div").first();

        List<TextNode> textNodes = div.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("Text 1", textNodes.get(0).text());
        assertEquals("Text 2", textNodes.get(1).text());

        Element script = doc.select("script").first();
        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());

        Element emptyEl = new Element(Tag.valueOf("div"), "");
        assertTrue(emptyEl.textNodes().isEmpty());
        assertTrue(emptyEl.dataNodes().isEmpty());
    }

    @Test
    public void testSelect() {
        Document doc = Jsoup.parse("<div id='d1'><p class='c1'>P1</p><p class='c2'>P2</p></div>");
        Elements p1 = doc.select("p.c1");
        assertEquals(1, p1.size());
        assertEquals("P1", p1.first().text());

        Elements pAll = doc.select("p");
        assertEquals(2, pAll.size());
    }

    @Test
    public void testAppendAndPrependChild() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = new Element(Tag.valueOf("p"), "");
        p1.text("p1");
        Element p2 = new Element(Tag.valueOf("p"), "");
        p2.text("p2");

        div.appendChild(p1);
        assertEquals(1, div.children().size());
        assertEquals(p1, div.child(0));

        div.prependChild(p2);
        assertEquals(2, div.children().size());
        assertEquals(p2, div.child(0));
        assertEquals(p1, div.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_nullThrowsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_nullThrowsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prependChild(null);
    }

    @Test
    public void testInsertChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = new Element(Tag.valueOf("p"), "").text("1");
        Element p4 = new Element(Tag.valueOf("p"), "").text("4");
        div.appendChild(p1);
        div.appendChild(p4);

        Element p2 = new Element(Tag.valueOf("p"), "").text("2");
        Element p3 = new Element(Tag.valueOf("p"), "").text("3");
        List<Node> toInsert = Arrays.asList(p2, p3);

        div.insertChildren(1, toInsert);
        assertEquals(4, div.children().size());
        assertEquals("1", div.child(0).text());
        assertEquals("2", div.child(1).text());
        assertEquals("3", div.child(2).text());
        assertEquals("4", div.child(3).text());

        Element p0 = new Element(Tag.valueOf("p"), "").text("0");
        div.insertChildren(0, Collections.singletonList(p0));
        assertEquals("0", div.child(0).text());

        Element p5 = new Element(Tag.valueOf("p"), "").text("5");
        div.insertChildren(-1, Collections.singletonList(p5));
        assertEquals("5", div.child(div.children().size() - 1).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_nullCollectionThrowsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_invalidIndexThrowsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(5, Collections.emptyList());
    }

    @Test
    public void testAppendAndPrependElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = div.appendElement("span");
        span.text("spanText");
        Element p = div.prependElement("p");
        p.text("pText");

        assertEquals(2, div.children().size());
        assertEquals("p", div.child(0).tagName());
        assertEquals("span", div.child(1).tagName());
    }

    @Test
    public void testAppendAndPrependText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("World");
        div.prependText("Hello ");
        assertEquals("Hello World", div.text());
    }

    @Test
    public void testAppendAndPrependHtml() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<span id='s2'>two</span>");
        div.prepend("<span id='s1'>one</span>");

        assertEquals(2, div.children().size());
        assertEquals("s1", div.child(0).id());
        assertEquals("s2", div.child(1).id());
    }

    @Test
    public void testBeforeAndAfterNodesAndHtml() {
        Document doc = Jsoup.parse("<div><p id='target'>Middle</p></div>");
        Element target = doc.select("#target").first();

        target.before("<span id='beforeHtml'>BeforeHtml</span>");
        target.before(new Element(Tag.valueOf("b"), "").text("BeforeNode"));
        target.after("<span id='afterHtml'>AfterHtml</span>");
        target.after(new Element(Tag.valueOf("i"), "").text("AfterNode"));

        Element div = doc.select("div").first();
        assertEquals(5, div.children().size());
        assertEquals("beforeHtml", div.child(0).id());
        assertEquals("b", div.child(1).tagName());
        assertEquals("target", div.child(2).id());
        assertEquals("i", div.child(3).tagName());
        assertEquals("afterHtml", div.child(4).id());
    }

    @Test
    public void testEmptyAndWrap() {
        Document doc = Jsoup.parse("<div id='outer'><p id='inner'>Text</p></div>");
        Element inner = doc.select("#inner").first();
        inner.wrap("<div class='wrapper'></div>");

        Element wrapper = doc.select(".wrapper").first();
        assertNotNull(wrapper);
        assertEquals(1, wrapper.children().size());
        assertEquals("inner", wrapper.child(0).id());

        inner.empty();
        assertEquals(0, inner.childNodes().size());
        assertEquals("", inner.text());
    }

    @Test
    public void testCssSelector() {
        Document doc = Jsoup.parse("<div id='main'><div class='sub content'><span>First</span><span>Second</span></div></div>");
        Element firstSpan = doc.select("span").first();
        Element secondSpan = doc.select("span").get(1);

        assertEquals("#main", doc.select("#main").first().cssSelector());
        assertEquals("#main > div.sub.content > span:nth-child(1)", firstSpan.cssSelector());
        assertEquals("#main > div.sub.content > span:nth-child(2)", secondSpan.cssSelector());

        Element standalone = new Element(Tag.valueOf("p"), "").attr("class", "a b");
        assertEquals("p.a.b", standalone.cssSelector());
    }

    @Test
    public void testSiblings() {
        Document doc = Jsoup.parse("<div><p id='1'>1</p><p id='2'>2</p><p id='3'>3</p></div>");
        Element p1 = doc.select("#1").first();
        Element p2 = doc.select("#2").first();
        Element p3 = doc.select("#3").first();

        assertEquals(2, p2.siblingElements().size());
        assertEquals(p1, p2.previousElementSibling());
        assertEquals(p3, p2.nextElementSibling());
        assertNull(p1.previousElementSibling());
        assertNull(p3.nextElementSibling());

        assertEquals(p1, p2.firstElementSibling());
        assertEquals(p3, p2.lastElementSibling());
        assertEquals(Integer.valueOf(1), p2.elementSiblingIndex());
        assertEquals(Integer.valueOf(0), p1.elementSiblingIndex());
        assertEquals(Integer.valueOf(2), p3.elementSiblingIndex());

        Element standalone = new Element(Tag.valueOf("div"), "");
        assertTrue(standalone.siblingElements().isEmpty());
        assertNull(standalone.previousElementSibling());
        assertNull(standalone.nextElementSibling());
        assertEquals(Integer.valueOf(0), standalone.elementSiblingIndex());

        Document singleDoc = Jsoup.parse("<div><p id='only'>Only</p></div>");
        Element only = singleDoc.select("#only").first();
        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testGetElementsMethods() {
        Document doc = Jsoup.parse("<div id='root' class='container primary'>" +
                "<p id='p1' class='text' data-type='info' title='heading'>Hello World</p>" +
                "<p id='p2' class='text' data-type='warn' title='sub'>Foo Bar</p>" +
                "<span id='s1' class='text highlight'>Direct Text <i>Italic</i></span>" +
                "<span id='s2' data-val='123_abc'>End Match</span>" +
                "</div>");
        Element root = doc.select("#root").first();

        assertEquals(2, root.getElementsByTag("p").size());
        assertEquals(root, root.getElementById("root"));
        assertEquals("p1", root.getElementById("p1").id());
        assertNull(root.getElementById("nonexistent"));

        assertEquals(3, root.getElementsByClass("text").size());
        assertEquals(1, root.getElementsByClass("highlight").size());

        assertEquals(2, root.getElementsByAttribute("title").size());
        assertEquals(3, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("data-type", "info").size());
        assertTrue(root.getElementsByAttributeValueNot("data-type", "info").size() > 0);
        assertEquals(1, root.getElementsByAttributeValueStarting("data-val", "123").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("data-val", "abc").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("data-val", "_").size());

        assertEquals(1, root.getElementsByAttributeValueMatching("data-val", Pattern.compile("^123.*")).size());
        assertEquals(1, root.getElementsByAttributeValueMatching("data-val", "^123.*").size());

        assertEquals(1, root.getElementsByIndexLessThan(1).size());
        assertEquals(2, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());

        assertEquals(1, root.getElementsContainingText("World").size());
        assertEquals(1, root.getElementsContainingOwnText("Direct").size());
        assertEquals(0, root.getElementsContainingOwnText("Italic").size());

        assertEquals(1, root.getElementsMatchingText(Pattern.compile("Hello.*")).size());
        assertEquals(1, root.getElementsMatchingText("Hello.*").size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Direct.*")).size());
        assertEquals(1, root.getElementsMatchingOwnText("Direct.*").size());

        assertEquals(5, root.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegexThrowsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByAttributeValueMatching("id", "[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegexThrowsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingText("[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegexThrowsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingOwnText("[invalid");
    }

    @Test
    public void testTextAndOwnTextAndPreserveWhitespace() {
        Document doc = Jsoup.parse("<div>Hello <b>there</b> now!<br>New Line</div>");
        Element div = doc.select("div").first();
        assertEquals("Hello there now! New Line", div.text());
        assertEquals("Hello now! New Line", div.ownText());

        assertTrue(div.hasText());
        Element empty = new Element(Tag.valueOf("div"), "");
        assertFalse(empty.hasText());
        empty.appendChild(new Element(Tag.valueOf("p"), ""));
        assertFalse(empty.hasText());

        div.text("Replaced Text");
        assertEquals("Replaced Text", div.text());

        Document preDoc = Jsoup.parse("<pre>  line 1  \n  line 2  </pre>");
        Element pre = preDoc.select("pre").first();
        assertEquals("  line 1  \n  line 2  ", pre.text());
    }

    @Test
    public void testData() {
        Document doc = Jsoup.parse("<script>function test() { return 1; }</script>");
        Element script = doc.select("script").first();
        assertEquals("function test() { return 1; }", script.data());

        Document mixedDoc = Jsoup.parse("<div><script>var a = 1;</script><script>var b = 2;</script></div>");
        Element div = mixedDoc.select("div").first();
        assertEquals("var a = 1;var b = 2;", div.data());
    }

    @Test
    public void testClassNamesAndManipulation() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "one two three");

        assertEquals("one two three", el.className());
        Set<String> classNames = el.classNames();
        assertEquals(3, classNames.size());
        assertTrue(classNames.contains("one"));
        assertTrue(classNames.contains("two"));
        assertTrue(classNames.contains("three"));

        assertTrue(el.hasClass("two"));
        assertTrue(el.hasClass("TWO"));
        assertFalse(el.hasClass("four"));

        el.addClass("four");
        assertTrue(el.hasClass("four"));

        el.removeClass("two");
        assertFalse(el.hasClass("two"));

        el.toggleClass("five");
        assertTrue(el.hasClass("five"));
        el.toggleClass("five");
        assertFalse(el.hasClass("five"));

        Set<String> customClasses = new LinkedHashSet<String>(Arrays.asList("alpha", "beta"));
        el.classNames(customClasses);
        assertEquals("alpha beta", el.className());
    }

    @Test
    public void testVal() {
        Element input = new Element(Tag.valueOf("input"), "").attr("value", "testVal");
        assertEquals("testVal", input.val());
        input.val("newVal");
        assertEquals("newVal", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("initial");
        assertEquals("initial", textarea.val());
        textarea.val("updated");
        assertEquals("updated", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtml() {
        Document doc = Jsoup.parse("<div id='d'><p>Hello</p></div>");
        Element div = doc.select("#d").first();
        assertEquals("<p>Hello</p>", div.html());

        div.html("<span>New Content</span>");
        assertEquals("<span>New Content</span>", div.html());
        assertEquals("<div id=\"d\">\n <span>New Content</span>\n</div>", div.outerHtml());

        Element imgHtml = new Element(Tag.valueOf("img"), "");
        assertEquals("<img>", imgHtml.outerHtml());

        Document docXml = Document.createShell("");
        docXml.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        Element imgXml = docXml.body().appendElement("img");
        assertEquals("<img />", imgXml.outerHtml());

        Element unknownTag = new Element(Tag.valueOf("custom"), "");
        assertEquals("<custom></custom>", unknownTag.outerHtml());
    }

    @Test
    public void testEqualsHashCodeCloneAndToString() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        el1.attr("id", "main");
        el1.text("content");

        assertEquals(el1, el1);
        assertNotEquals(el1, null);
        assertNotEquals(el1, new Object());

        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        el2.attr("id", "main");
        el2.text("content");
        assertNotEquals(el1, el2);

        Element clone = el1.clone();
        assertEquals(el1.outerHtml(), clone.outerHtml());
        assertEquals(el1.toString(), el1.outerHtml());
        assertTrue(el1.hashCode() != 0);
    }
}
