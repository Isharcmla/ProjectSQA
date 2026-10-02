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
    public void testConstructor_standardAndOverloads_success() {
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Element el1 = new Element(tag, "http://example.com", attrs);
        assertEquals("div", el1.tagName());
        assertEquals("http://example.com", el1.baseUri());
        assertEquals("test", el1.id());

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
    public void testNodeNameAndTagName_returnsCorrectName() {
        Element el = new Element(Tag.valueOf("span"), "");
        assertEquals("span", el.nodeName());
        assertEquals("span", el.tagName());
        assertEquals(Tag.valueOf("span"), el.tag());
    }

    @Test
    public void testTagName_changeTagName_updatesTag() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName("div");
        assertEquals("div", el.tagName());
        assertEquals(Tag.valueOf("div"), el.tag());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyString_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void testIsBlock_returnsCorrectStatus() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        assertTrue(div.isBlock());
        assertFalse(span.isBlock());
    }

    @Test
    public void testId_presentAndAbsent_returnsCorrectValue() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id());
        el.attr("id", "main");
        assertEquals("main", el.id());
    }

    @Test
    public void testAttr_chainingAndUpdating_worksCorrectly() {
        Element el = new Element(Tag.valueOf("a"), "");
        Element returned = el.attr("href", "http://jsoup.org");
        assertSame(el, returned);
        assertEquals("http://jsoup.org", el.attr("href"));
    }

    @Test
    public void testDataset_customDataAttributes_reflectedCorrectly() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-package", "jsoup");
        el.attr("data-language", "Java");
        el.attr("class", "group");

        Map<String, String> dataset = el.dataset();
        assertEquals(2, dataset.size());
        assertEquals("jsoup", dataset.get("package"));
        assertEquals("Java", dataset.get("language"));

        dataset.put("version", "1.0");
        assertEquals("1.0", el.attr("data-version"));
    }

    @Test
    public void testParentAndParents_hierarchicalStructure() {
        Element doc = new Element(Tag.valueOf("#root"), "");
        Element html = doc.appendElement("html");
        Element body = html.appendElement("body");
        Element div = body.appendElement("div");

        assertSame(body, div.parent());
        Elements parents = div.parents();
        assertEquals(2, parents.size());
        assertEquals("body", parents.get(0).tagName());
        assertEquals("html", parents.get(1).tagName());

        Element standalone = new Element(Tag.valueOf("p"), "");
        assertNull(standalone.parent());
        assertTrue(standalone.parents().isEmpty());
    }

    @Test
    public void testChildrenAndChild_returnsElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Text 1");
        Element p1 = div.appendElement("p");
        div.appendText("Text 2");
        Element p2 = div.appendElement("p");

        Elements children = div.children();
        assertEquals(2, children.size());
        assertSame(p1, div.child(0));
        assertSame(p2, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_outOfBounds_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes_filterNodes() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        script.appendChild(new TextNode("text content", ""));
        script.appendChild(new DataNode("var b = 2;", ""));

        List<TextNode> textNodes = script.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("text content", textNodes.get(0).getWholeText());

        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals("var a = 1;", dataNodes.get(0).getWholeData());
        assertEquals("var b = 2;", dataNodes.get(1).getWholeData());
    }

    @Test
    public void testSelect_executesQuery() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p class='intro'>Hello</p><p>World</p>");
        Elements selected = div.select("p.intro");
        assertEquals(1, selected.size());
        assertEquals("Hello", selected.get(0).text());
    }

    @Test
    public void testAppendChildAndPrependChild_addsNodes() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("span"), "");

        div.appendChild(child1);
        assertSame(child1, div.child(0));

        div.prependChild(child2);
        assertSame(child2, div.child(0));
        assertSame(child1, div.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_nullChild_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_nullChild_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prependChild(null);
    }

    @Test
    public void testInsertChildren_validAndNegativeIndex() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = new Element(Tag.valueOf("p"), "").text("1");
        Element p2 = new Element(Tag.valueOf("p"), "").text("2");
        div.appendChild(p1);
        div.appendChild(p2);

        List<Node> newNodes = new ArrayList<Node>();
        newNodes.add(new Element(Tag.valueOf("span"), "").text("start"));
        div.insertChildren(0, newNodes);
        assertEquals("start", div.child(0).text());

        List<Node> endNodes = new ArrayList<Node>();
        endNodes.add(new Element(Tag.valueOf("span"), "").text("end"));
        div.insertChildren(-1, endNodes);
        assertEquals("end", div.child(div.children().size() - 1).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_nullCollection_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_outOfBounds_throwsException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(5, Collections.singletonList(new TextNode("a", "")));
    }

    @Test
    public void testAppendAndPrependElement_createsAndAddsElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element last = div.appendElement("span");
        assertEquals("span", last.tagName());
        assertSame(last, div.child(0));

        Element first = div.prependElement("p");
        assertEquals("p", first.tagName());
        assertSame(first, div.child(0));
        assertSame(last, div.child(1));
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
        div.append("<p>One</p>");
        assertEquals(1, div.children().size());
        assertEquals("One", div.child(0).text());

        div.prepend("<b>Zero</b>");
        assertEquals(2, div.children().size());
        assertEquals("Zero", div.child(0).text());
        assertEquals("One", div.child(1).text());
    }

    @Test
    public void testBeforeAndAfter_stringsAndNodes() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = div.appendElement("p").text("Middle");

        p.before("<span>Before</span>");
        p.after("<span>After</span>");

        assertEquals(3, div.children().size());
        assertEquals("Before", div.child(0).text());
        assertEquals("Middle", div.child(1).text());
        assertEquals("After", div.child(2).text());

        Element nodeBefore = new Element(Tag.valueOf("i"), "").text("IBefore");
        Element nodeAfter = new Element(Tag.valueOf("i"), "").text("IAfter");

        p.before(nodeBefore);
        p.after(nodeAfter);

        assertEquals(5, div.children().size());
        assertEquals("IBefore", div.child(1).text());
        assertEquals("IAfter", div.child(3).text());
    }

    @Test
    public void testEmpty_clearsChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>1</p><p>2</p>");
        assertEquals(2, div.children().size());
        div.empty();
        assertEquals(0, div.children().size());
    }

    @Test
    public void testWrap_wrapsAroundElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = div.appendElement("p").text("Test");
        Element wrappedP = p.wrap("<div class='wrapper'></div>");

        assertSame(p, wrappedP);
        assertEquals("wrapper", div.child(0).className());
        assertEquals("Test", div.child(0).child(0).text());
    }

    @Test
    public void testSiblingNavigationMethods_standaloneElement() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.siblingElements().isEmpty());
        assertNull(el.nextElementSibling());
        assertNull(el.previousElementSibling());
        assertNull(el.firstElementSibling());
        assertNull(el.lastElementSibling());
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testSiblingNavigationMethods_withSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("span").text("1");
        Element child2 = parent.appendElement("p").text("2");
        Element child3 = parent.appendElement("b").text("3");

        assertEquals(2, child1.siblingElements().size());
        assertTrue(child1.siblingElements().contains(child2));
        assertTrue(child1.siblingElements().contains(child3));
        assertFalse(child1.siblingElements().contains(child1));

        assertEquals(Integer.valueOf(0), child1.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), child2.elementSiblingIndex());
        assertEquals(Integer.valueOf(2), child3.elementSiblingIndex());

        assertSame(child2, child1.nextElementSibling());
        assertNull(child1.previousElementSibling());

        assertSame(child3, child2.nextElementSibling());
        assertSame(child1, child2.previousElementSibling());

        assertNull(child3.nextElementSibling());
        assertSame(child2, child3.previousElementSibling());

        assertSame(child1, child2.firstElementSibling());
        assertSame(child3, child2.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag_findsMatchingElements() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<p>1</p><p>2</p><span>3</span>");
        Elements ps = root.getElementsByTag("p");
        assertEquals(2, ps.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_empty_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByTag("");
    }

    @Test
    public void testGetElementById_findsElement() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<p id='foo'>One</p><p id='bar'>Two</p>");
        Element foo = root.getElementById("foo");
        assertNotNull(foo);
        assertEquals("One", foo.text());

        Element nonExistent = root.getElementById("baz");
        assertNull(nonExistent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_empty_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementById("");
    }

    @Test
    public void testGetElementsByClass_findsElements() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<p class='test high'>One</p><p class='test low'>Two</p><p>Three</p>");
        Elements testClass = root.getElementsByClass("test");
        assertEquals(2, testClass.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_empty_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByClass("");
    }

    @Test
    public void testGetElementsByAttribute_variousAttributeSelectors() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<a href='http://jsoup.org' title='Jsoup home' data-id='100'>Link</a>");
        root.append("<a href='http://google.com' title='Google search' data-id='200'>Google</a>");
        root.append("<a notitle>Other</a>");

        assertEquals(2, root.getElementsByAttribute("href").size());
        assertEquals(2, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "http://jsoup.org").size());
        assertEquals(2, root.getElementsByAttributeValueNot("href", "http://jsoup.org").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "http://js").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "google.com").size());
        assertEquals(2, root.getElementsByAttributeValueContaining("href", "http").size());

        assertEquals(1, root.getElementsByAttributeValueMatching("title", Pattern.compile("home")).size());
        assertEquals(1, root.getElementsByAttributeValueMatching("title", ".*search.*").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_badRegex_throwsException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByAttributeValueMatching("href", "[unclosed");
    }

    @Test
    public void testGetElementsByIndex_filtersByIndex() {
        Element root = new Element(Tag.valueOf("ul"), "");
        root.append("<li>0</li><li>1</li><li>2</li><li>3</li>");

        assertEquals(2, root.getElementsByIndexLessThan(2).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(2).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());
    }

    @Test
    public void testGetElementsContainingTextAndMatching_findsMatches() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<p>Hello World</p><p>Hello <span>There</span></p><p>Foo Bar</p>");

        assertEquals(2, root.getElementsContainingText("Hello").size());
        assertEquals(2, root.getElementsContainingOwnText("Hello").size());

        assertEquals(2, root.getElementsMatchingText(Pattern.compile("(?i)hello")).size());
        assertEquals(2, root.getElementsMatchingText("(?i)hello").size());

        assertEquals(2, root.getElementsMatchingOwnText(Pattern.compile("Hello")).size());
        assertEquals(2, root.getElementsMatchingOwnText("Hello").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_badRegex_throwsException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsMatchingText("[unclosed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_badRegex_throwsException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsMatchingOwnText("[unclosed");
    }

    @Test
    public void testGetAllElements_returnsSelfAndAllDescendants() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<p><span>Text</span></p>");
        Elements all = root.getAllElements();
        assertEquals(3, all.size());
    }

    @Test
    public void testTextAndOwnText_normalAndWhitespacePreserve() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.append("One <span>Two</span> Three <br> Four");

        assertEquals("One Two Three Four", p.text());
        assertEquals("One Three Four", p.ownText());

        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.append("  line1  \n  line2  ");
        assertEquals("  line1  \n  line2  ", pre.text());

        Element preChild = pre.appendElement("span");
        preChild.appendText("  line3  ");
        assertTrue(Element.preserveWhitespace(preChild));
        assertFalse(Element.preserveWhitespace(new Element(Tag.valueOf("div"), "")));
        assertFalse(Element.preserveWhitespace(null));

        Element el = new Element(Tag.valueOf("p"), "");
        el.text("New text");
        assertEquals("New text", el.text());
        assertEquals(1, el.textNodes().size());
    }

    @Test
    public void testHasText_detectsContent() {
        Element empty = new Element(Tag.valueOf("div"), "");
        assertFalse(empty.hasText());

        Element whitespaceOnly = new Element(Tag.valueOf("div"), "");
        whitespaceOnly.appendText("   ");
        assertFalse(whitespaceOnly.hasText());

        Element withText = new Element(Tag.valueOf("div"), "");
        withText.appendText("content");
        assertTrue(withText.hasText());

        Element withChildText = new Element(Tag.valueOf("div"), "");
        withChildText.appendElement("p").text("child");
        assertTrue(withChildText.hasText());
    }

    @Test
    public void testData_extractsDataNodesRecursively() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var x = 1;", ""));
        Element inner = script.appendElement("script");
        inner.appendChild(new DataNode("var y = 2;", ""));

        assertEquals("var x = 1;var y = 2;", script.data());
    }

    @Test
    public void testClassManipulation_addClassRemoveClassToggleClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());

        el.addClass("foo");
        assertEquals("foo", el.className());
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("FOO"));

        el.addClass("bar");
        assertEquals("foo bar", el.className());

        el.removeClass("foo");
        assertEquals("bar", el.className());
        assertFalse(el.hasClass("foo"));

        el.toggleClass("bar");
        assertFalse(el.hasClass("bar"));
        el.toggleClass("bar");
        assertTrue(el.hasClass("bar"));

        Set<String> customClasses = new LinkedHashSet<String>(Arrays.asList("c1", "c2"));
        el.classNames(customClasses);
        assertEquals("c1 c2", el.className());
    }

    @Test
    public void testVal_inputAndTextArea() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("user");
        assertEquals("user", input.val());
        assertEquals("user", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("content");
        assertEquals("content", textarea.val());
        assertEquals("content", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtml_rendering() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.html("<p>Hello</p>");
        assertEquals("<p>Hello</p>", div.html());
        assertEquals("<div>\n <p>Hello</p>\n</div>", div.outerHtml());
        assertEquals(div.outerHtml(), div.toString());

        Element img = new Element(Tag.valueOf("img"), "");
        img.attr("src", "pic.jpg");
        assertEquals("<img src=\"pic.jpg\" />", img.outerHtml());

        Document doc = Jsoup.parse("<div><p>A</p><p>B</p></div>");
        doc.outputSettings().prettyPrint(false);
        assertEquals("<div><p>A</p><p>B</p></div>", doc.body().child(0).outerHtml());

        doc.outputSettings().outline(true).prettyPrint(true);
        assertTrue(doc.body().child(0).outerHtml().contains("<div>"));
    }

    @Test
    public void testEqualsAndHashCode_referenceEquality() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("div"), "");

        assertEquals(el1, el1);
        assertNotEquals(el1, el2);
        assertNotEquals(el1, "string");
        assertNotEquals(el1, null);

        assertNotEquals(0, el1.hashCode());
    }

    @Test
    public void testClone_clonesStructureAndAttributes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("foo");
        el.appendElement("p").text("Text");

        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.outerHtml(), clone.outerHtml());

        clone.addClass("bar");
        assertFalse(el.hasClass("bar"));
        assertTrue(clone.hasClass("bar"));
    }
}
