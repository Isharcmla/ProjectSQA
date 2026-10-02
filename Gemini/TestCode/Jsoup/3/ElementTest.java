package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructor_validTagAndBaseUri_success() {
        Tag tag = Tag.valueOf("div");
        Element el = new Element(tag, "http://example.com");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertSame(tag, el.tag());
        assertEquals("http://example.com", el.baseUri());
        assertEquals(0, el.attributes().size());
        assertTrue(el.isBlock());
    }

    @Test
    public void testConstructor_withAttributes_success() {
        Tag tag = Tag.valueOf("span");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Element el = new Element(tag, "", attrs);
        assertEquals("span", el.tagName());
        assertEquals("main", el.id());
        assertFalse(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void testId_andAttr() {
        Element el = new Element(Tag.valueOf("p"), "");
        assertEquals("", el.id());

        el.attr("id", "intro");
        assertEquals("intro", el.id());

        el.attr("class", "lead");
        assertEquals("lead", el.attr("class"));
    }

    @Test
    public void testParent_andParents_withRootElement() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element div = root.appendElement("div");
        Element p = div.appendElement("p");
        Element span = p.appendElement("span");

        assertNull(root.parent());
        assertEquals(p, span.parent());

        Elements parents = span.parents();
        assertEquals(2, parents.size());
        assertEquals(p, parents.get(0));
        assertEquals(div, parents.get(1));

        Elements standaloneParents = root.parents();
        assertTrue(standaloneParents.isEmpty());
    }

    @Test
    public void testChild_andChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("some text");
        Element p1 = div.appendElement("p");
        div.appendText("more text");
        Element p2 = div.appendElement("span");

        assertEquals(4, div.childNodes().size());
        Elements children = div.children();
        assertEquals(2, children.size());
        assertEquals(p1, div.child(0));
        assertEquals(p2, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_outOfBounds_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void testSelect() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").attr("class", "one").text("P1");
        div.appendElement("p").attr("class", "two").text("P2");

        Elements result = div.select("p.one");
        assertEquals(1, result.size());
        assertEquals("P1", result.get(0).text());
    }

    @Test
    public void testAppendAndPrependChild() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("span"), "");

        div.appendChild(child1);
        assertEquals(1, div.children().size());
        assertEquals(child1, div.child(0));

        div.prependChild(child2);
        assertEquals(2, div.children().size());
        assertEquals(child2, div.child(0));
        assertEquals(child1, div.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prependChild(null);
    }

    @Test
    public void testAppendElement_andPrependElement() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Element p = div.appendElement("p");
        Element span = div.prependElement("span");

        assertEquals("p", p.tagName());
        assertEquals("span", span.tagName());
        assertEquals("http://example.com", p.baseUri());
        assertEquals(span, div.child(0));
        assertEquals(p, div.child(1));
    }

    @Test
    public void testAppendText_andPrependText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("world");
        div.prependText("hello ");

        assertEquals("hello world", div.text());
        assertEquals(2, div.childNodes().size());
    }

    @Test
    public void testAppend_andPrependHtml() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>middle</p>");
        div.append("<span>last</span>");
        div.prepend("<h1>first</h1>");

        assertEquals(3, div.children().size());
        assertEquals("h1", div.child(0).tagName());
        assertEquals("p", div.child(1).tagName());
        assertEquals("span", div.child(2).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prepend(null);
    }

    @Test
    public void testEmpty() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "container");
        div.appendElement("p").text("Hello");
        assertEquals(1, div.children().size());

        Element returned = div.empty();
        assertSame(div, returned);
        assertEquals(0, div.children().size());
        assertEquals("container", div.attr("class"));
    }

    @Test
    public void testWrap_singleElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("span").text("Content");

        target.wrap("<div class='wrapper'></div>");

        assertEquals(1, parent.children().size());
        Element wrapper = parent.child(0);
        assertEquals("div", wrapper.tagName());
        assertEquals("wrapper", wrapper.attr("class"));
        assertEquals(1, wrapper.children().size());
        assertEquals(target, wrapper.child(0));
    }

    @Test
    public void testWrap_nestedElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("span").text("Content");

        target.wrap("<div class='out'><div class='in'></div></div>");

        Element out = parent.child(0);
        assertEquals("out", out.attr("class"));
        Element in = out.child(0);
        assertEquals("in", in.attr("class"));
        assertEquals(target, in.child(0));
    }

    @Test
    public void testWrap_remainderSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("span").text("Content");

        target.wrap("<div class='wrap'></div><p class='rem'></p>");

        assertEquals(1, parent.children().size());
        Element wrap = parent.child(0);
        assertEquals("wrap", wrap.attr("class"));
        assertEquals(2, wrap.children().size());
        assertEquals(target, wrap.child(0));
        assertEquals("rem", wrap.child(1).attr("class"));
    }

    @Test
    public void testWrap_emptyWrapStructure_returnsNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("span");
        Element result = target.wrap("<!-- only comment -->");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_nullOrEmpty_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.wrap("");
    }

    @Test
    public void testSiblingMethods() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c1 = parent.appendElement("h1");
        Element c2 = parent.appendElement("p");
        Element c3 = parent.appendElement("span");

        Elements siblings = c2.siblingElements();
        assertEquals(3, siblings.size());

        assertEquals(c3, c2.nextElementSibling());
        assertNull(c3.nextElementSibling());

        assertEquals(c1, c2.previousElementSibling());
        assertNull(c1.previousElementSibling());

        assertEquals(c1, c2.firstElementSibling());
        assertEquals(c3, c2.lastElementSibling());

        assertEquals(Integer.valueOf(0), c1.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), c2.elementSiblingIndex());
        assertEquals(Integer.valueOf(2), c3.elementSiblingIndex());

        Element singleParent = new Element(Tag.valueOf("div"), "");
        Element soleChild = singleParent.appendElement("p");
        assertNull(soleChild.firstElementSibling());
        assertNull(soleChild.lastElementSibling());

        Element orphan = new Element(Tag.valueOf("p"), "");
        assertEquals(Integer.valueOf(0), orphan.elementSiblingIndex());
    }

    @Test
    public void testDOMGetElementsByTag() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("P").text("1");
        div.appendElement("p").text("2");
        div.appendElement("span").text("3");

        Elements ps = div.getElementsByTag("P ");
        assertEquals(2, ps.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDOMGetElementsByTag_empty_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByTag("");
    }

    @Test
    public void testDOMGetElementById() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").attr("id", "target");
        div.appendElement("span").attr("id", "other");

        Element found = div.getElementById("target");
        assertNotNull(found);
        assertEquals("p", found.tagName());

        assertNull(div.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDOMGetElementById_empty_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementById("");
    }

    @Test
    public void testDOMGetElementsByClass() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").attr("class", "foo bar");
        div.appendElement("span").attr("class", "BAR");
        div.appendElement("a").attr("class", "baz");

        Elements found = div.getElementsByClass("bar");
        assertEquals(2, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDOMGetElementsByClass_empty_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByClass("");
    }

    @Test
    public void testDOMGetElementsByAttribute() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("a").attr("HREF", "http://jsoup.org");
        div.appendElement("p");

        Elements found = div.getElementsByAttribute("href ");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDOMGetElementsByAttribute_empty_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByAttribute("");
    }

    @Test
    public void testDOMGetElementsByAttributeValueVariants() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element a1 = div.appendElement("a").attr("href", "http://example.com/sub/page.html");
        Element a2 = div.appendElement("a").attr("href", "http://other.org/page.html");
        Element a3 = div.appendElement("a").attr("title", "hello world");

        assertEquals(1, div.getElementsByAttributeValue("href", "http://example.com/sub/page.html").size());
        assertEquals(a1, div.getElementsByAttributeValue("href", "http://example.com/sub/page.html").get(0));

        assertEquals(2, div.getElementsByAttributeValueStarting("href", "http://").size());
        assertEquals(1, div.getElementsByAttributeValueStarting("href", "http://other").size());

        assertEquals(2, div.getElementsByAttributeValueEnding("href", ".html").size());
        assertEquals(1, div.getElementsByAttributeValueEnding("href", "page.html").size());

        assertEquals(1, div.getElementsByAttributeValueContaining("href", "example").size());
        assertEquals(1, div.getElementsByAttributeValueContaining("title", "world").size());

        Elements notMatch = div.getElementsByAttributeValueNot("href", "http://other.org/page.html");
        assertTrue(notMatch.contains(a1));
        assertTrue(notMatch.contains(a3));
        assertFalse(notMatch.contains(a2));
    }

    @Test
    public void testDOMGetElementsByIndex() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element c1 = div.appendElement("p").text("0");
        Element c2 = div.appendElement("p").text("1");
        Element c3 = div.appendElement("p").text("2");

        Elements lessThan = div.getElementsByIndexLessThan(1);
        assertEquals(1, lessThan.size());
        assertEquals(c1, lessThan.get(0));

        Elements greaterThan = div.getElementsByIndexGreaterThan(1);
        assertEquals(1, greaterThan.size());
        assertEquals(c3, greaterThan.get(0));

        Elements equals = div.getElementsByIndexEquals(1);
        assertEquals(1, equals.size());
        assertEquals(c2, equals.get(0));

        Elements all = div.getAllElements();
        assertEquals(4, all.size());
        assertEquals(div, all.get(0));
    }

    @Test
    public void testText_normalAndBlockSpacing() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("First paragraph.");
        div.appendElement("p").text("Second paragraph.");

        assertEquals("First paragraph. Second paragraph.", div.text());
    }

    @Test
    public void testText_preserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendText("  line1  \n  line2  ");
        assertEquals("  line1  \n  line2  ", pre.text());

        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("  line1  \n  line2  ");
        assertEquals("line1 line2", div.text());

        Element parentPre = new Element(Tag.valueOf("pre"), "");
        Element spanInPre = parentPre.appendElement("span");
        spanInPre.appendText("  spaces preserved  ");
        assertEquals("  spaces preserved  ", spanInPre.text());
        assertTrue(spanInPre.preserveWhitespace());
    }

    @Test
    public void testText_setter() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("Old content");
        div.text("New content");

        assertEquals("New content", div.text());
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testText_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.text(null);
    }

    @Test
    public void testHasText() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertFalse(div.hasText());

        div.appendText("   ");
        assertFalse(div.hasText());

        div.appendText("content");
        assertTrue(div.hasText());

        Element container = new Element(Tag.valueOf("div"), "");
        Element child = container.appendElement("p");
        assertFalse(container.hasText());
        child.text("text in child");
        assertTrue(container.hasText());
    }

    @Test
    public void testData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var x = 1;", ""));
        assertEquals("var x = 1;", script.data());

        Element wrapper = new Element(Tag.valueOf("div"), "");
        wrapper.appendChild(script);
        assertEquals("var x = 1;", wrapper.data());

        Element empty = new Element(Tag.valueOf("p"), "");
        assertEquals("", empty.data());
    }

    @Test
    public void testClassOperations() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());
        assertFalse(el.hasClass("foo"));

        el.attr("class", "foo bar");
        assertEquals("foo bar", el.className());
        Set<String> classNames = el.classNames();
        assertEquals(2, classNames.size());
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
        assertFalse(el.hasClass("baz"));

        el.addClass("baz");
        assertTrue(el.hasClass("baz"));
        assertEquals("foo bar baz", el.className());

        el.removeClass("bar");
        assertFalse(el.hasClass("bar"));
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("baz"));

        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));

        Set<String> newClasses = new LinkedHashSet<String>(Arrays.asList("c1", "c2"));
        el.classNames(newClasses);
        assertEquals("c1 c2", el.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNames_null_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.classNames(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_null_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_null_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_null_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.toggleClass(null);
    }

    @Test
    public void testVal_inputAndOther() {
        Element input = new Element(Tag.valueOf("input"), "");
        assertEquals("", input.val());
        input.val("test-val");
        assertEquals("test-val", input.val());
        assertEquals("test-val", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        assertEquals("", textarea.val());
        textarea.val("some multiline\ntext");
        assertEquals("some multiline\ntext", textarea.val());
        assertEquals("some multiline\ntext", textarea.text());
    }

    @Test
    public void testHtml_getterAndSetter() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.html("<p>Hello <span>world</span></p>");
        assertEquals("<p>Hello <span>world</span></p>", div.html());

        div.html("<b>bold</b>");
        assertEquals("<b>bold</b>", div.html());
    }

    @Test
    public void testOuterHtml_andToString() {
        Element img = new Element(Tag.valueOf("img"), "");
        img.attr("src", "image.png");
        assertEquals("<img src=\"image.png\" />", img.outerHtml());
        assertEquals(img.outerHtml(), img.toString());

        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("id", "box");
        Element p = div.appendElement("p");
        p.text("Paragraph");

        String expected = "<div id=\"box\">\n <p>Paragraph</p>\n</div>";
        assertEquals(expected, div.outerHtml());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el4 = new Element(Tag.valueOf("div"), "http://other.com");

        assertEquals(el1, el1);
        assertEquals(el1, el2);
        assertEquals(el1.hashCode(), el2.hashCode());

        assertFalse(el1.equals(null));
        assertFalse(el1.equals("a string"));
        assertFalse(el1.equals(el3));
        assertFalse(el1.equals(el4));

        el2.attr("id", "diff");
        assertFalse(el1.equals(el2));
    }
}
