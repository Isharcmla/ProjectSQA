package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructors_validInputs_success() {
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        
        Element el1 = new Element(tag, "http://example.com", attrs);
        assertEquals("div", el1.tagName());
        assertEquals("http://example.com", el1.baseUri());
        assertEquals("main", el1.id());

        Element el2 = new Element(tag, "http://example.com");
        assertEquals("div", el2.tagName());
        assertEquals("http://example.com", el2.baseUri());
        assertEquals("", el2.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void testNodeNameAndTagName_normal_returnsTagName() {
        Element el = new Element(Tag.valueOf("span"), "");
        assertEquals("span", el.nodeName());
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTagName_changeTag_updatesTag() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.tag().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyTag_throwsException() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_nullTag_throwsException() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName(null);
    }

    @Test
    public void testIsBlock_blockAndInlineElements_correctBoolean() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertTrue(div.isBlock());

        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId_withAndWithoutId_correctValue() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id());

        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testAttr_chaining_returnsSelf() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.attr("title", "testTitle");
        assertSame(el, returned);
        assertEquals("testTitle", el.attr("title"));
    }

    @Test
    public void testDataset_operations_modifiesAttributes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-name", "jsoup");
        el.attr("data-type", "parser");
        el.attr("class", "ignore");

        Map<String, String> dataset = el.dataset();
        assertEquals(2, dataset.size());
        assertEquals("jsoup", dataset.get("name"));
        assertEquals("parser", dataset.get("type"));

        dataset.put("name", "jsoup-updated");
        assertEquals("jsoup-updated", el.attr("data-name"));
    }

    @Test
    public void testParentAndParents_structure_correctHierarchy() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element body = root.appendElement("body");
        Element div = body.appendElement("div");
        Element p = div.appendElement("p");

        assertNull(root.parent());
        assertSame(div, p.parent());

        Elements parents = p.parents();
        assertEquals(2, parents.size());
        assertSame(div, parents.get(0));
        assertSame(body, parents.get(1));
    }

    @Test
    public void testChildAndChildren_mixedNodes_filtersOnlyElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("text1");
        Element child1 = div.appendElement("p");
        div.appendText("text2");
        Element child2 = div.appendElement("span");

        Elements children = div.children();
        assertEquals(2, children.size());
        assertSame(child1, children.get(0));
        assertSame(child2, children.get(1));
        assertSame(child1, div.child(0));
        assertSame(child2, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_outOfBounds_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void testTextNodes_mixedNodes_returnsOnlyTextNodes() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("One");
        div.appendElement("span").text("Two");
        div.appendText("Three");

        List<TextNode> textNodes = div.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("One", textNodes.get(0).text());
        assertEquals("Three", textNodes.get(1).text());
    }

    @Test
    public void testDataNodes_mixedNodes_returnsOnlyDataNodes() {
        Element script = new Element(Tag.valueOf("script"), "");
        DataNode dataNode = new DataNode("var x = 1;", "");
        script.appendChild(dataNode);
        script.appendElement("span");

        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
        assertSame(dataNode, dataNodes.get(0));
        assertEquals("var x = 1;", script.data());
    }

    @Test
    public void testSelect_validQuery_findsElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element a = div.appendElement("a").attr("href", "http://example.com");
        Elements selected = div.select("a[href]");
        assertEquals(1, selected.size());
        assertSame(a, selected.get(0));
    }

    @Test
    public void testAppendAndPrependChild_singleNode_addsCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = new Element(Tag.valueOf("p"), "");
        Element p2 = new Element(Tag.valueOf("p"), "");

        div.appendChild(p1);
        div.prependChild(p2);

        assertEquals(2, div.children().size());
        assertSame(p2, div.child(0));
        assertSame(p1, div.child(1));
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
    public void testInsertChildren_validAndNegativeIndex_insertsProperly() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = new Element(Tag.valueOf("p"), "");
        Element p2 = new Element(Tag.valueOf("p"), "");
        div.appendChild(p1);
        div.appendChild(p2);

        Element insert1 = new Element(Tag.valueOf("span"), "");
        Element insert2 = new Element(Tag.valueOf("b"), "");

        div.insertChildren(1, Collections.singletonList(insert1));
        assertSame(insert1, div.child(1));

        div.insertChildren(-1, Collections.singletonList(insert2));
        assertSame(insert2, div.child(div.children().size() - 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_nullCollection_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_indexOutOfBounds_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(5, Collections.singletonList(new TextNode("a", "")));
    }

    @Test
    public void testAppendAndPrependElement_createsAndAddsElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child1 = div.appendElement("span");
        Element child2 = div.prependElement("b");

        assertEquals("b", div.child(0).tagName());
        assertEquals("span", div.child(1).tagName());
        assertSame(child2, div.child(0));
        assertSame(child1, div.child(1));
    }

    @Test
    public void testAppendAndPrependText_createsAndAddsText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("World");
        div.prependText("Hello ");

        assertEquals("Hello World", div.text());
    }

    @Test
    public void testAppendAndPrependHtml_parsesAndAddsNodes() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>Two</p>");
        div.prepend("<p>One</p>");

        assertEquals(2, div.children().size());
        assertEquals("One", div.child(0).text());
        assertEquals("Two", div.child(1).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendHtml_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependHtml_null_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prepend(null);
    }

    @Test
    public void testBeforeAndAfter_stringAndNode_insertsCorrectly() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("span");

        Element ret1 = target.before("<p>BeforeHTML</p>");
        assertSame(target, ret1);
        Element ret2 = target.before(new Element(Tag.valueOf("i"), ""));
        assertSame(target, ret2);

        Element ret3 = target.after("<p>AfterHTML</p>");
        assertSame(target, ret3);
        Element ret4 = target.after(new Element(Tag.valueOf("b"), ""));
        assertSame(target, ret4);

        assertEquals(5, parent.children().size());
        assertEquals("p", parent.child(0).tagName());
        assertEquals("i", parent.child(1).tagName());
        assertEquals("span", parent.child(2).tagName());
        assertEquals("b", parent.child(3).tagName());
        assertEquals("p", parent.child(4).tagName());
    }

    @Test
    public void testWrap_validHtml_wrapsElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("p");
        child.wrap("<div class='wrapper'></div>");

        assertEquals("div", parent.child(0).tagName());
        assertEquals("wrapper", parent.child(0).className());
        assertEquals("p", parent.child(0).child(0).tagName());
    }

    @Test
    public void testEmpty_clearsChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p");
        div.appendText("text");
        assertEquals(2, div.childNodes().size());

        Element ret = div.empty();
        assertSame(div, ret);
        assertEquals(0, div.childNodes().size());
    }

    @Test
    public void testSiblingMethods_variousPositions_returnsCorrectSiblings() {
        Element isolated = new Element(Tag.valueOf("div"), "");
        assertEquals(0, isolated.siblingElements().size());
        assertNull(isolated.nextElementSibling());
        assertNull(isolated.previousElementSibling());
        assertNull(isolated.firstElementSibling());
        assertNull(isolated.lastElementSibling());
        assertEquals(Integer.valueOf(0), isolated.elementSiblingIndex());

        Element parent = new Element(Tag.valueOf("div"), "");
        Element p1 = parent.appendElement("p");
        Element p2 = parent.appendElement("span");
        Element p3 = parent.appendElement("b");

        assertEquals(2, p1.siblingElements().size());
        assertFalse(p1.siblingElements().contains(p1));

        assertSame(p2, p1.nextElementSibling());
        assertNull(p3.nextElementSibling());

        assertSame(p2, p3.previousElementSibling());
        assertNull(p1.previousElementSibling());

        assertSame(p1, p2.firstElementSibling());
        assertSame(p3, p2.lastElementSibling());

        assertEquals(Integer.valueOf(0), p1.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), p2.elementSiblingIndex());
        assertEquals(Integer.valueOf(2), p3.elementSiblingIndex());
    }

    @Test
    public void testDomQueryMethods_validQueries_returnsElements() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element c1 = root.appendElement("p").attr("id", "p1").attr("class", "my-class test").attr("data-test", "val1").attr("href", "http://a.com").text("Hello World");
        Element c2 = root.appendElement("p").attr("id", "p2").attr("class", "other-class").attr("data-test", "val2").attr("href", "http://b.com").text("Foo Bar");
        Element c3 = root.appendElement("span").attr("class", "my-class").attr("title", "abc123xyz").text("Just Foo");

        assertEquals(2, root.getElementsByTag("P").size());
        assertSame(c1, root.getElementById("p1"));
        assertNull(root.getElementById("nonexistent"));
        assertEquals(2, root.getElementsByClass("my-class").size());
        assertEquals(2, root.getElementsByAttribute("href").size());
        assertEquals(2, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "http://a.com").size());
        assertEquals(3, root.getElementsByAttributeValueNot("href", "http://a.com").size());
        assertEquals(2, root.getElementsByAttributeValueStarting("href", "http://").size());
        assertEquals(2, root.getElementsByAttributeValueEnding("href", ".com").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "a.com").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("title", Pattern.compile("\\d+")).size());
        assertEquals(1, root.getElementsByAttributeValueMatching("title", "\\d+").size());

        assertEquals(1, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());

        assertEquals(2, root.getElementsContainingText("Foo").size());
        assertEquals(1, root.getElementsContainingOwnText("Hello").size());
        assertEquals(2, root.getElementsMatchingText(Pattern.compile("Foo")).size());
        assertEquals(2, root.getElementsMatchingText("Foo").size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Hello")).size());
        assertEquals(1, root.getElementsMatchingOwnText("Hello").size());
        assertEquals(4, root.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByAttributeValueMatching("key", "[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingText("[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingOwnText("[invalid");
    }

    @Test
    public void testTextAndOwnText_structureWithBrAndWhitespace_formatsProperly() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendText("Hello ");
        p.appendElement("b").text("world");
        p.appendElement("br");
        p.appendText(" Next line");

        assertEquals("Hello world Next line", p.text());
        assertEquals("Hello Next line", p.ownText());

        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("Paragraph 1");
        div.appendElement("p").text("Paragraph 2");
        assertEquals("Paragraph 1 Paragraph 2", div.text());
    }

    @Test
    public void testPreserveWhitespace_preTag_preservesWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendText("  hello  \n  world  ");
        assertEquals("  hello  \n  world  ", pre.text());

        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("  hello  \n  world  ");
        assertEquals("hello world", div.text());
    }

    @Test
    public void testText_setter_clearsAndSetsNewText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span").text("old");
        Element ret = div.text("new text");

        assertSame(div, ret);
        assertEquals("new text", div.text());
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testText_setterNull_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.text(null);
    }

    @Test
    public void testHasText_variousContents_correctBoolean() {
        Element empty = new Element(Tag.valueOf("div"), "");
        assertFalse(empty.hasText());

        Element whitespaceOnly = new Element(Tag.valueOf("div"), "");
        whitespaceOnly.appendText("   ");
        assertFalse(whitespaceOnly.hasText());

        Element withText = new Element(Tag.valueOf("div"), "");
        withText.appendText("content");
        assertTrue(withText.hasText());

        Element nestedText = new Element(Tag.valueOf("div"), "");
        nestedText.appendElement("span").text("nested");
        assertTrue(nestedText.hasText());
    }

    @Test
    public void testData_nestedDataNodes_combinesData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        Element nested = script.appendElement("script");
        nested.appendChild(new DataNode("var b = 2;", ""));

        assertEquals("var a = 1;var b = 2;", script.data());
    }

    @Test
    public void testClassManipulation_addClassRemoveClassToggleClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.className());
        assertFalse(el.hasClass("foo"));

        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("FOO"));
        assertEquals("foo", el.className());

        el.addClass("bar");
        assertEquals("foo bar", el.className());

        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));

        el.toggleClass("baz");
        assertTrue(el.hasClass("baz"));
        el.toggleClass("baz");
        assertFalse(el.hasClass("baz"));

        Set<String> customClasses = new LinkedHashSet<String>(Arrays.asList("c1", "c2"));
        el.classNames(customClasses);
        assertEquals("c1 c2", el.className());
        assertEquals(customClasses, el.classNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNames_null_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.classNames(null);
    }

    @Test
    public void testVal_inputAndTextarea_correctBehavior() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("test-input");
        assertEquals("test-input", input.val());
        assertEquals("test-input", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("test-textarea");
        assertEquals("test-textarea", textarea.val());
        assertEquals("test-textarea", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtml_formattingAndSelfClosing() {
        Element img = new Element(Tag.valueOf("img"), "");
        img.attr("src", "image.jpg");
        assertEquals("<img src=\"image.jpg\" />", img.outerHtml());

        Element div = new Element(Tag.valueOf("div"), "");
        div.html("<span>Hello</span>");
        assertEquals("<span>Hello</span>", div.html());
        assertEquals("<div><span>Hello</span></div>", div.outerHtml().replaceAll("\n", "").replaceAll("\\s+", " "));
        assertEquals(div.outerHtml(), div.toString());
    }

    @Test
    public void testEqualsAndHashCode_standardObjects() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("div"), "");

        assertEquals(el1, el1);
        assertNotEquals(el1, el2);
        assertNotEquals(el1, "string");
        assertNotEquals(el1, null);

        assertEquals(el1.hashCode(), el1.hashCode());
    }

    @Test
    public void testClone_elementWithChildrenAndClasses_createsIndependentCopy() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("original");
        el.appendElement("span").text("text");

        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.outerHtml(), clone.outerHtml());

        clone.addClass("cloned");
        assertFalse(el.hasClass("cloned"));
        assertTrue(clone.hasClass("cloned"));
    }
}
