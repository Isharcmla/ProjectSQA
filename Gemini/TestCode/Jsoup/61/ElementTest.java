package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ElementTest {

    @Test
    public void testConstructorsAndNodeNameAndTagName() {
        Element el1 = new Element("div");
        assertEquals("div", el1.nodeName());
        assertEquals("div", el1.tagName());
        assertEquals("", el1.baseUri());
        assertNotNull(el1.attributes());

        Tag pTag = Tag.valueOf("p");
        Element el2 = new Element(pTag, "http://example.com");
        assertEquals("p", el2.nodeName());
        assertEquals("http://example.com", el2.baseUri());
        assertEquals(pTag, el2.tag());

        Attributes attrs = new Attributes();
        attrs.put("class", "main");
        Element el3 = new Element(pTag, "http://example.com", attrs);
        assertEquals("p", el3.tagName());
        assertEquals("main", el3.attr("class"));
    }

    @Test
    public void testTagNameChange() {
        Element el = new Element("div");
        Element returned = el.tagName("span");
        assertEquals("span", el.tagName());
        assertEquals(el, returned);

        el.tagName("SPAN");
        assertEquals("SPAN", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrowsException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameNullThrowsException() {
        Element el = new Element("div");
        el.tagName(null);
    }

    @Test
    public void testIsBlock() {
        Element div = new Element("div");
        assertTrue(div.isBlock());

        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        Element el = new Element("div");
        assertEquals("", el.id());

        el.attr("id", "header");
        assertEquals("header", el.id());

        el.attr("ID", "upperHeader");
        assertEquals("upperHeader", el.id());
    }

    @Test
    public void testAttrStringAndBoolean() {
        Element el = new Element("div");
        Element returned = el.attr("title", "hello");
        assertEquals("hello", el.attr("title"));
        assertEquals(el, returned);

        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        assertEquals("", el.attr("disabled"));

        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-test", "val1");
        el.attr("data-custom-name", "val2");
        el.attr("class", "main");

        Map<String, String> dataset = el.dataset();
        assertEquals(2, dataset.size());
        assertEquals("val1", dataset.get("test"));
        assertEquals("val2", dataset.get("custom-name"));

        dataset.put("new-key", "new-val");
        assertEquals("new-val", el.attr("data-new-key"));
    }

    @Test
    public void testParentAndParents() {
        Document doc = Jsoup.parse("<div><p><span>Hello</span></p></div>");
        Element span = doc.select("span").first();
        Element p = doc.select("p").first();
        Element div = doc.select("div").first();

        assertEquals(p, span.parent());
        Elements parents = span.parents();
        assertEquals(4, parents.size());
        assertEquals(p, parents.get(0));
        assertEquals(div, parents.get(1));
        assertEquals("body", parents.get(2).tagName());
        assertEquals("html", parents.get(3).tagName());

        Element orphan = new Element("span");
        assertNull(orphan.parent());
        assertEquals(0, orphan.parents().size());
    }

    @Test
    public void testChildrenAndChild() {
        Element div = new Element("div");
        div.appendText("text1");
        Element p = div.appendElement("p");
        div.appendText("text2");
        Element span = div.appendElement("span");

        Elements children = div.children();
        assertEquals(2, children.size());
        assertEquals(p, children.get(0));
        assertEquals(span, children.get(1));
        assertEquals(p, div.child(0));
        assertEquals(span, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBoundsThrowsException() {
        Element div = new Element("div");
        div.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes() {
        Element el = new Element("div");
        el.appendText("Text 1");
        el.appendElement("span").text("Span text");
        el.appendText("Text 2");
        DataNode data = new DataNode("var x = 1;", "");
        el.appendChild(data);

        List<TextNode> textNodes = el.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("Text 1", textNodes.get(0).getWholeText());
        assertEquals("Text 2", textNodes.get(1).getWholeText());

        List<DataNode> dataNodes = el.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testSelectAndIs() {
        Document doc = Jsoup.parse("<div id='d1' class='box'><p class='text'>Hello</p></div>");
        Element div = doc.getElementById("d1");
        Element p = doc.select("p").first();

        Elements selected = div.select("p.text");
        assertEquals(1, selected.size());
        assertEquals(p, selected.first());

        assertTrue(div.is("div.box"));
        assertTrue(div.is("#d1"));
        assertFalse(div.is("p"));

        assertTrue(p.is(new Evaluator.Class("text")));
        assertFalse(p.is(new Evaluator.Class("nonexistent")));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testSelectInvalidQueryThrowsException() {
        Element div = new Element("div");
        div.select("div[");
    }

    @Test
    public void testAppendChildAndPrependChild() {
        Element div = new Element("div");
        Element p1 = new Element("p").text("1");
        Element p2 = new Element("p").text("2");

        div.appendChild(p1);
        assertEquals(1, div.children().size());
        assertEquals(p1, div.child(0));

        div.prependChild(p2);
        assertEquals(2, div.children().size());
        assertEquals(p2, div.child(0));
        assertEquals(p1, div.child(1));
    }

    @Test
    public void testInsertChildren() {
        Element div = new Element("div");
        Element p1 = new Element("p").text("1");
        Element p2 = new Element("p").text("2");
        div.appendChild(p1);
        div.appendChild(p2);

        Element p3 = new Element("p").text("3");
        Element p4 = new Element("p").text("4");
        div.insertChildren(1, Arrays.asList(p3, p4));

        assertEquals(4, div.children().size());
        assertEquals(p1, div.child(0));
        assertEquals(p3, div.child(1));
        assertEquals(p4, div.child(2));
        assertEquals(p2, div.child(3));

        Element p5 = new Element("p").text("5");
        div.insertChildren(-1, Collections.singletonList(p5));
        assertEquals(5, div.children().size());
        assertEquals(p5, div.child(4));

        Element p0 = new Element("p").text("0");
        div.insertChildren(0, Collections.singletonList(p0));
        assertEquals(p0, div.child(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullThrowsException() {
        Element div = new Element("div");
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsThrowsException() {
        Element div = new Element("div");
        div.insertChildren(5, Collections.singletonList(new Element("p")));
    }

    @Test
    public void testAppendElementAndPrependElement() {
        Element div = new Element("div");
        Element span = div.appendElement("span");
        span.text("span text");
        Element p = div.prependElement("p");
        p.text("p text");

        assertEquals(2, div.children().size());
        assertEquals("p", div.child(0).tagName());
        assertEquals("span", div.child(1).tagName());
    }

    @Test
    public void testAppendTextAndPrependText() {
        Element div = new Element("div");
        div.appendText("World");
        div.prependText("Hello ");
        assertEquals("Hello World", div.text());
    }

    @Test
    public void testAppendAndPrependHtml() {
        Element div = new Element("div");
        div.append("<span>Middle</span>");
        div.append("<b>Last</b>");
        div.prepend("<i>First</i>");

        assertEquals("<i>First</i><span>Middle</span><b>Last</b>", div.html().replaceAll("\\r?\\n", ""));
    }

    @Test
    public void testBeforeAndAfterWithHtmlAndNode() {
        Document doc = Jsoup.parse("<div><p id='target'>Target</p></div>");
        Element target = doc.getElementById("target");

        target.before("<span>BeforeHtml</span>");
        target.after("<span>AfterHtml</span>");
        target.before(new Element("b").text("BeforeNode"));
        target.after(new Element("i").text("AfterNode"));

        Element div = doc.select("div").first();
        assertEquals("BeforeHtml", div.child(0).text());
        assertEquals("BeforeNode", div.child(1).text());
        assertEquals("Target", div.child(2).text());
        assertEquals("AfterNode", div.child(3).text());
        assertEquals("AfterHtml", div.child(4).text());
    }

    @Test
    public void testEmptyAndWrap() {
        Document doc = Jsoup.parse("<div><p><span>Hello</span></p></div>");
        Element p = doc.select("p").first();
        p.wrap("<div class='wrapper'></div>");

        Element wrapper = doc.select(".wrapper").first();
        assertNotNull(wrapper);
        assertEquals(p, wrapper.child(0));

        p.empty();
        assertEquals(0, p.childNodes().size());
        assertEquals("", p.html());
    }

    @Test
    public void testCssSelector() {
        Document doc = Jsoup.parse("<div id='main'><div class='box first'><p class='highlight'>Text</p><p class='highlight'>Text 2</p></div></div>");
        Element main = doc.getElementById("main");
        assertEquals("#main", main.cssSelector());

        Element firstBox = main.child(0);
        assertEquals("#main > div.box.first", firstBox.cssSelector());

        Element p1 = firstBox.child(0);
        Element p2 = firstBox.child(1);
        assertEquals("#main > div.box.first > p.highlight:nth-child(1)", p1.cssSelector());
        assertEquals("#main > div.box.first > p.highlight:nth-child(2)", p2.cssSelector());

        Element standalone = new Element("div");
        assertEquals("div", standalone.cssSelector());

        Element nsElement = new Element("epub:type");
        assertEquals("epub|type", nsElement.cssSelector());
    }

    @Test
    public void testSiblingMethods() {
        Document doc = Jsoup.parse("<div><p id='p1'>1</p><p id='p2'>2</p><p id='p3'>3</p></div>");
        Element p1 = doc.getElementById("p1");
        Element p2 = doc.getElementById("p2");
        Element p3 = doc.getElementById("p3");

        Elements p2Siblings = p2.siblingElements();
        assertEquals(2, p2Siblings.size());
        assertEquals(p1, p2Siblings.get(0));
        assertEquals(p3, p2Siblings.get(1));

        assertEquals(p2, p1.nextElementSibling());
        assertEquals(p3, p2.nextElementSibling());
        assertNull(p3.nextElementSibling());

        assertNull(p1.previousElementSibling());
        assertEquals(p1, p2.previousElementSibling());
        assertEquals(p2, p3.previousElementSibling());

        assertEquals(p1, p1.firstElementSibling());
        assertEquals(p1, p2.firstElementSibling());
        assertEquals(p3, p1.lastElementSibling());
        assertEquals(p3, p2.lastElementSibling());

        assertEquals(Integer.valueOf(0), p1.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), p2.elementSiblingIndex());
        assertEquals(Integer.valueOf(2), p3.elementSiblingIndex());

        Element standalone = new Element("div");
        assertEquals(0, standalone.siblingElements().size());
        assertNull(standalone.nextElementSibling());
        assertNull(standalone.previousElementSibling());
        assertEquals(Integer.valueOf(0), standalone.elementSiblingIndex());
    }

    @Test
    public void testFirstAndLastElementSiblingSingleChild() {
        Document doc = Jsoup.parse("<div><p id='single'>Only</p></div>");
        Element p = doc.getElementById("single");
        assertNull(p.firstElementSibling());
        assertNull(p.lastElementSibling());
    }

    @Test
    public void testGetElementsByTagAndIdAndClassAndAttribute() {
        Document doc = Jsoup.parse("<div id='root'><div id='d1' class='box active' data-type='a' title='Greeting' custom='val1 val2'>"
                + "<p class='item active' data-type='b' title='Hello World'>Item 1</p>"
                + "<p class='item' data-other='c' title='world'>Item 2</p>"
                + "</div></div>");
        Element root = doc.getElementById("root");

        assertEquals(2, root.getElementsByTag("p").size());
        assertEquals(1, root.getElementsByTag("div").size());

        assertEquals("d1", root.getElementById("d1").id());
        assertNull(root.getElementById("nonexistent"));

        assertEquals(2, root.getElementsByClass("active").size());
        assertEquals(2, root.getElementsByClass("item").size());
        assertEquals(0, root.getElementsByClass("none").size());

        assertEquals(2, root.getElementsByAttribute("data-type").size());
        assertEquals(3, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("data-type", "a").size());
        assertEquals(2, root.getElementsByAttributeValueNot("data-type", "a").size());
        assertEquals(2, root.getElementsByAttributeValueStarting("title", "Greet").size() + root.getElementsByAttributeValueStarting("title", "Hello").size());
        assertEquals(2, root.getElementsByAttributeValueEnding("title", "World").size() + root.getElementsByAttributeValueEnding("title", "world").size());
        assertEquals(2, root.getElementsByAttributeValueContaining("title", "world").size());

        assertEquals(2, root.getElementsByAttributeValueMatching("title", Pattern.compile("(?i)world")).size());
        assertEquals(2, root.getElementsByAttributeValueMatching("title", "(?i)world").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidPatternThrowsException() {
        Element el = new Element("div");
        el.getElementsByAttributeValueMatching("attr", "[invalid(");
    }

    @Test
    public void testGetElementsByIndex() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p><p>3</p></div>");
        Element div = doc.select("div").first();

        assertEquals(2, div.getElementsByIndexLessThan(2).size());
        assertEquals(2, div.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, div.getElementsByIndexEquals(2).size());
    }

    @Test
    public void testGetElementsContainingTextAndMatchingText() {
        Document doc = Jsoup.parse("<div><p>Hello <b>World</b></p><p>Foo Bar</p></div>");
        Element div = doc.select("div").first();

        assertEquals(2, div.getElementsContainingText("World").size());
        assertEquals(1, div.getElementsContainingOwnText("Hello").size());
        assertEquals(0, div.getElementsContainingOwnText("World").size());

        assertEquals(2, div.getElementsMatchingText(Pattern.compile("(?i)world")).size());
        assertEquals(2, div.getElementsMatchingText("(?i)world").size());

        assertEquals(1, div.getElementsMatchingOwnText(Pattern.compile("(?i)hello")).size());
        assertEquals(1, div.getElementsMatchingOwnText("(?i)hello").size());

        assertEquals(4, div.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextInvalidRegexThrowsException() {
        Element el = new Element("div");
        el.getElementsMatchingText("[bad regex");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextInvalidRegexThrowsException() {
        Element el = new Element("div");
        el.getElementsMatchingOwnText("[bad regex");
    }

    @Test
    public void testTextAndOwnTextAndPreserveWhitespace() {
        Document doc = Jsoup.parse("<div>Hello <b>world</b>! <br> Next line.<pre>  Preformatted   space  </pre></div>");
        Element div = doc.select("div").first();

        assertEquals("Hello world! Next line.   Preformatted   space", div.text());
        assertEquals("Hello ! Next line.", div.ownText());

        Element pre = doc.select("pre").first();
        assertEquals("  Preformatted   space  ", pre.text());

        Element p = new Element("p");
        p.text("New text content");
        assertEquals("New text content", p.text());
        assertEquals(1, p.textNodes().size());
    }

    @Test
    public void testHasText() {
        Element emptyDiv = new Element("div");
        assertFalse(emptyDiv.hasText());

        Element whitespaceDiv = new Element("div");
        whitespaceDiv.appendText("   ");
        assertFalse(whitespaceDiv.hasText());

        Element textDiv = new Element("div");
        textDiv.appendText("content");
        assertTrue(textDiv.hasText());

        Element nestedDiv = new Element("div");
        Element child = nestedDiv.appendElement("span");
        child.text("nested content");
        assertTrue(nestedDiv.hasText());
    }

    @Test
    public void testData() {
        Document doc = Jsoup.parse("<script type='text/javascript'>var a = 1; <!-- comment inside --></script>");
        Element script = doc.select("script").first();
        assertEquals("var a = 1;  comment inside ", script.data());

        Element div = new Element("div");
        Element subScript = div.appendElement("script");
        subScript.appendChild(new DataNode("alert('hi');", ""));
        assertEquals("alert('hi');", div.data());
    }

    @Test
    public void testClassNamesAndManipulation() {
        Element el = new Element("div");
        assertEquals("", el.className());
        assertEquals(0, el.classNames().size());

        el.attr("class", "  header   active   main  ");
        assertEquals("header   active   main", el.className());
        Set<String> classNames = el.classNames();
        assertEquals(3, classNames.size());
        assertTrue(classNames.contains("header"));
        assertTrue(classNames.contains("active"));
        assertTrue(classNames.contains("main"));

        Set<String> newClasses = new LinkedHashSet<String>(Arrays.asList("one", "two"));
        el.classNames(newClasses);
        assertEquals("one two", el.className());

        assertTrue(el.hasClass("one"));
        assertTrue(el.hasClass("ONE"));
        assertTrue(el.hasClass("two"));
        assertFalse(el.hasClass("three"));
        assertFalse(el.hasClass("o"));

        el.addClass("three");
        assertTrue(el.hasClass("three"));

        el.removeClass("one");
        assertFalse(el.hasClass("one"));

        el.toggleClass("four");
        assertTrue(el.hasClass("four"));
        el.toggleClass("four");
        assertFalse(el.hasClass("four"));
    }

    @Test
    public void testHasClassEdgeCases() {
        Element el = new Element("div");
        assertFalse(el.hasClass("test"));

        el.attr("class", "test");
        assertTrue(el.hasClass("test"));
        assertTrue(el.hasClass("TEST"));
        assertFalse(el.hasClass("tes"));
        assertFalse(el.hasClass("testing"));

        el.attr("class", "first middle last");
        assertTrue(el.hasClass("first"));
        assertTrue(el.hasClass("middle"));
        assertTrue(el.hasClass("last"));
        assertFalse(el.hasClass("mid"));
    }

    @Test
    public void testVal() {
        Element input = new Element("input");
        input.val("testValue");
        assertEquals("testValue", input.val());
        assertEquals("testValue", input.attr("value"));

        Element textarea = new Element("textarea");
        textarea.val("text value");
        assertEquals("text value", textarea.val());
        assertEquals("text value", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtml() throws IOException {
        Document doc = Jsoup.parse("<div id='content'><p>Hello <span>World</span></p></div>");
        Element content = doc.getElementById("content");

        assertEquals("<p>Hello <span>World</span></p>", content.html());

        StringWriter sw = new StringWriter();
        content.html(sw);
        assertEquals("<p>Hello <span>World</span></p>", sw.toString());

        content.html("<b>Updated</b>");
        assertEquals("<b>Updated</b>", content.html());
        assertEquals(1, content.children().size());
        assertEquals("b", content.child(0).tagName());
        assertEquals("Updated", content.child(0).text());
    }

    @Test
    public void testOuterHtmlFormattingAndSelfClosing() {
        Element imgHtml = new Element(Tag.valueOf("img"), "");
        assertEquals("<img>", imgHtml.outerHtml());

        Document docXml = Document.createShell("");
        docXml.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        Element imgXml = new Element(Tag.valueOf("img"), "");
        docXml.appendChild(imgXml);
        assertEquals("<img />", imgXml.outerHtml());

        Element customSelfClosing = new Element(Tag.valueOf("custom"), "");
        customSelfClosing.tag().setSelfClosing();
        assertEquals("<custom />", customSelfClosing.outerHtml());

        Element blockDiv = new Element("div");
        blockDiv.appendElement("p").text("Paragraph");
        String divHtml = blockDiv.outerHtml();
        assertTrue(divHtml.contains("<div>"));
        assertTrue(divHtml.contains("</p>"));
        assertTrue(divHtml.contains("</div>"));
    }

    @Test
    public void testToStringAndClone() {
        Element el = new Element("div");
        el.attr("id", "test");
        el.text("Content");

        assertEquals(el.outerHtml(), el.toString());

        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.outerHtml(), clone.outerHtml());
        assertEquals("Content", clone.text());
        assertEquals("test", clone.id());

        clone.attr("id", "newId");
        assertEquals("test", el.id());
        assertEquals("newId", clone.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesNullThrowsException() {
        Element el = new Element("div");
        el.classNames(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNullThrowsException() {
        Element el = new Element("div");
        el.addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClassNullThrowsException() {
        Element el = new Element("div");
        el.removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClassNullThrowsException() {
        Element el = new Element("div");
        el.toggleClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrowsException() {
        Element el = new Element("div");
        el.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChildNullThrowsException() {
        Element el = new Element("div");
        el.prependChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTextNullThrowsException() {
        Element el = new Element("div");
        el.appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependTextNullThrowsException() {
        Element el = new Element("div");
        el.prependText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendHtmlNullThrowsException() {
        Element el = new Element("div");
        el.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependHtmlNullThrowsException() {
        Element el = new Element("div");
        el.prepend(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextNullThrowsException() {
        Element el = new Element("div");
        el.text(null);
    }
}
