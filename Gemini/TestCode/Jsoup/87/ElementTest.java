package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
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
import static org.junit.Assert.fail;

public class ElementTest {

    @Test
    public void testConstructors_validInputs_createdCorrectly() {
        Element el1 = new Element("div");
        assertEquals("div", el1.tagName());
        assertEquals("", el1.baseUri());
        assertFalse(el1.hasAttributes());

        Tag tagP = Tag.valueOf("p");
        Element el2 = new Element(tagP, "http://example.com");
        assertEquals("p", el2.tagName());
        assertEquals("http://example.com", el2.baseUri());
        assertFalse(el2.hasAttributes());

        Attributes attrs = new Attributes();
        attrs.put("class", "main");
        Element el3 = new Element(tagP, "http://example.com", attrs);
        assertEquals("p", el3.tagName());
        assertEquals("http://example.com", el3.baseUri());
        assertTrue(el3.hasAttributes());
        assertEquals("main", el3.attr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element((Tag) null, "http://example.com", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUri_throwsException() {
        new Element(Tag.valueOf("div"), null, new Attributes());
    }

    @Test
    public void testAttributesAndBaseUri_manipulation() {
        Element el = new Element("div");
        assertFalse(el.hasAttributes());
        assertNotNull(el.attributes()); // lazy init
        assertTrue(el.hasAttributes());

        el.doSetBaseUri("http://example.org");
        assertEquals("http://example.org", el.baseUri());

        el.attr("title", "Hello");
        assertEquals("Hello", el.attr("title"));

        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));

        el.attr("data-name", "jsoup");
        el.attr("data-ver", "1.0");
        Map<String, String> dataset = el.dataset();
        assertEquals("jsoup", dataset.get("name"));
        assertEquals("1.0", dataset.get("ver"));
    }

    @Test
    public void testNodeNameAndTagNames() {
        Element el = new Element("div");
        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertTrue(el.isBlock());
        assertSame(Tag.valueOf("div"), el.tag());

        el.tagName("span");
        assertEquals("span", el.tagName());
        assertFalse(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_empty_throwsException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testId() {
        Element el = new Element("div");
        assertEquals("", el.id());
        el.attr("id", "main-id");
        assertEquals("main-id", el.id());
    }

    @Test
    public void testParentAndParents() {
        Element root = new Element("div");
        Element p = root.appendElement("p");
        Element span = p.appendElement("span");

        assertSame(p, span.parent());
        assertSame(root, p.parent());
        assertNull(root.parent());

        Elements parents = span.parents();
        assertEquals(2, parents.size());
        assertEquals("p", parents.get(0).tagName());
        assertEquals("div", parents.get(1).tagName());

        Element docRoot = new Element(Tag.valueOf("#root"), "");
        docRoot.appendChild(root);
        Elements parentsWithDoc = span.parents();
        assertEquals(2, parentsWithDoc.size());
    }

    @Test
    public void testChildrenAndChildAccess() {
        Element parent = new Element("div");
        assertEquals(0, parent.children().size());

        parent.appendText("text1");
        Element p = parent.appendElement("p");
        parent.appendText("text2");
        Element span = parent.appendElement("span");

        assertEquals(4, parent.childNodeSize());
        assertEquals(2, parent.children().size());
        assertSame(p, parent.child(0));
        assertSame(span, parent.child(1));

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("text1", textNodes.get(0).text());
        assertEquals("text2", textNodes.get(1).text());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_outOfBounds_throwsException() {
        Element parent = new Element("div");
        parent.child(0);
    }

    @Test
    public void testDataNodes() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var a = 1;"));
        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var a = 1;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testSelectAndIs() {
        Element div = new Element("div");
        div.attr("id", "myDiv");
        Element p = div.appendElement("p");
        p.attr("class", "myClass");
        p.text("Hello");

        Elements result = div.select("p.myClass");
        assertEquals(1, result.size());
        assertSame(p, result.first());

        Element first = div.selectFirst("p");
        assertSame(p, first);
        assertNull(div.selectFirst("span"));

        assertTrue(p.is("p.myClass"));
        assertFalse(p.is("span"));
        assertTrue(p.is(new Evaluator.Class("myClass")));
    }

    @Test
    public void testAppendPrependAndInsertChildren() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        assertEquals(1, parent.childNodeSize());
        assertSame(child1, parent.child(0));

        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertSame(child2, parent.child(0));
        assertSame(child1, parent.child(1));

        Element child3 = new Element("b");
        child3.appendTo(parent);
        assertEquals(3, parent.childNodeSize());
        assertSame(child3, parent.child(2));

        Element child4 = new Element("i");
        Element child5 = new Element("u");
        parent.insertChildren(1, Arrays.asList(child4, child5));
        assertEquals(5, parent.childNodeSize());
        assertSame(child4, parent.child(1));
        assertSame(child5, parent.child(2));

        Element child6 = new Element("em");
        parent.insertChildren(-1, child6);
        assertSame(child6, parent.child(parent.children().size() - 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_null_throwsException() {
        new Element("div").appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_null_throwsException() {
        new Element("div").prependChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTo_null_throwsException() {
        new Element("div").appendTo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenCollection_null_throwsException() {
        new Element("div").insertChildren(0, (List<Node>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenArray_null_throwsException() {
        new Element("div").insertChildren(0, (Node[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_outOfBounds_throwsException() {
        new Element("div").insertChildren(10, new Element("p"));
    }

    @Test
    public void testAppendPrependElementsAndText() {
        Element parent = new Element("div");
        Element p = parent.appendElement("p");
        assertEquals("p", p.tagName());
        assertSame(p, parent.child(0));

        Element h1 = parent.prependElement("h1");
        assertEquals("h1", h1.tagName());
        assertSame(h1, parent.child(0));

        parent.appendText("end");
        parent.prependText("start");
        assertEquals("start", ((TextNode) parent.childNodes().get(0)).getWholeText());
        assertEquals("end", ((TextNode) parent.childNodes().get(parent.childNodes().size() - 1)).getWholeText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_null_throwsException() {
        new Element("div").appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependText_null_throwsException() {
        new Element("div").prependText(null);
    }

    @Test
    public void testAppendAndPrependHtml() {
        Element div = new Element("div");
        div.append("<p>One</p>");
        assertEquals(1, div.children().size());
        assertEquals("One", div.child(0).text());

        div.prepend("<span>Zero</span>");
        assertEquals(2, div.children().size());
        assertEquals("Zero", div.child(0).text());
        assertEquals("One", div.child(1).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendHtml_null_throwsException() {
        new Element("div").append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependHtml_null_throwsException() {
        new Element("div").prepend(null);
    }

    @Test
    public void testBeforeAndAfterNodesAndHtml() {
        Element parent = new Element("div");
        Element p = parent.appendElement("p");
        p.text("Mid");

        p.before("<h1>Before HTML</h1>");
        p.before(new Element("h2").text("Before Node"));
        p.after("<h3>After HTML</h3>");
        p.after(new Element("h4").text("After Node"));

        assertEquals(5, parent.children().size());
        assertEquals("h1", parent.child(0).tagName());
        assertEquals("h2", parent.child(1).tagName());
        assertEquals("p", parent.child(2).tagName());
        assertEquals("h4", parent.child(3).tagName());
        assertEquals("h3", parent.child(4).tagName());
    }

    @Test
    public void testEmptyAndWrap() {
        Element div = new Element("div");
        div.appendElement("p").text("Hello");
        assertEquals(1, div.childNodeSize());
        div.empty();
        assertEquals(0, div.childNodeSize());

        Element span = div.appendElement("span");
        span.wrap("<div class='wrapper'></div>");
        assertEquals("div", div.child(0).tagName());
        assertEquals("wrapper", div.child(0).className());
        assertEquals("span", div.child(0).child(0).tagName());
    }

    @Test
    public void testCssSelector() {
        Element div = new Element("div");
        div.attr("id", "main");
        assertEquals("#main", div.cssSelector());

        Document doc = Jsoup.parse("<html><body><div><p class='first'>A</p><p class='first'>B</p><ns:custom class='foo'>C</ns:custom></div></body></html>");
        Element p1 = doc.select("p.first").first();
        Element p2 = doc.select("p.first").last();
        Element custom = doc.select("ns\\:custom").first();

        assertTrue(p1.cssSelector().contains("p.first:nth-child(1)"));
        assertTrue(p2.cssSelector().contains("p.first:nth-child(2)"));
        assertTrue(custom.cssSelector().contains("ns|custom.foo"));

        Element standalone = new Element("section");
        assertEquals("section", standalone.cssSelector());
    }

    @Test
    public void testSiblingNavigation() {
        Element standalone = new Element("div");
        assertEquals(0, standalone.siblingElements().size());
        assertNull(standalone.nextElementSibling());
        assertNull(standalone.previousElementSibling());
        assertEquals(0, standalone.nextElementSiblings().size());
        assertEquals(0, standalone.previousElementSiblings().size());
        assertEquals(0, standalone.elementSiblingIndex());

        Element parent = new Element("div");
        Element p1 = parent.appendElement("p");
        Element p2 = parent.appendElement("p");
        Element p3 = parent.appendElement("p");

        assertEquals(2, p1.siblingElements().size());
        assertSame(p2, p1.nextElementSibling());
        assertNull(p3.nextElementSibling());

        assertSame(p2, p3.previousElementSibling());
        assertNull(p1.previousElementSibling());

        Elements nextSiblings = p1.nextElementSiblings();
        assertEquals(2, nextSiblings.size());
        assertSame(p2, nextSiblings.get(0));
        assertSame(p3, nextSiblings.get(1));

        Elements prevSiblings = p3.previousElementSiblings();
        assertEquals(2, prevSiblings.size());
        assertSame(p2, prevSiblings.get(0));
        assertSame(p1, prevSiblings.get(1));

        assertSame(p1, p2.firstElementSibling());
        assertSame(p3, p2.lastElementSibling());

        assertEquals(0, p1.elementSiblingIndex());
        assertEquals(1, p2.elementSiblingIndex());
        assertEquals(2, p3.elementSiblingIndex());

        Element singleParent = new Element("div");
        Element singleChild = singleParent.appendElement("span");
        assertNull(singleChild.firstElementSibling());
        assertNull(singleChild.lastElementSibling());
    }

    @Test
    public void testDomSelectionMethods() {
        Document doc = Jsoup.parse("<div id='root' data-test='value1'>" +
                "<p class='highlight' title='first title' custom-attr='123'>Paragraph <b>One</b></p>" +
                "<p class='normal' title='second title'>Paragraph Two</p>" +
                "<input type='text' value='foo bar' />" +
                "</div>");
        Element root = doc.getElementById("root");

        assertEquals(2, root.getElementsByTag("p").size());
        assertSame(root, root.getElementById("root"));
        assertNull(root.getElementById("non-existent"));

        assertEquals(1, root.getElementsByClass("highlight").size());
        assertEquals(2, root.getElementsByAttribute("title").size());
        assertEquals(1, root.getElementsByAttributeStarting("custom-").size());
        assertEquals(1, root.getElementsByAttributeValue("title", "first title").size());
        assertTrue(root.getElementsByAttributeValueNot("title", "first title").size() > 0);
        assertEquals(2, root.getElementsByAttributeValueStarting("title", "first").size() + root.getElementsByAttributeValueStarting("title", "second").size());
        assertEquals(2, root.getElementsByAttributeValueEnding("title", "title").size());
        assertEquals(2, root.getElementsByAttributeValueContaining("title", "title").size());

        assertEquals(1, root.getElementsByAttributeValueMatching("title", Pattern.compile("^first.*")).size());
        assertEquals(1, root.getElementsByAttributeValueMatching("title", "^first.*").size());

        assertEquals(1, root.getElementsByIndexLessThan(1).size());
        assertTrue(root.getElementsByIndexGreaterThan(0).size() >= 2);
        assertEquals(1, root.getElementsByIndexEquals(1).size());

        assertEquals(2, root.getElementsContainingText("Paragraph").size());
        assertEquals(1, root.getElementsContainingOwnText("Paragraph One").size());

        assertEquals(2, root.getElementsMatchingText(Pattern.compile("Paragraph (One|Two)")).size());
        assertEquals(2, root.getElementsMatchingText("Paragraph (One|Two)").size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Paragraph One")).size());
        assertEquals(1, root.getElementsMatchingOwnText("Paragraph One").size());

        assertTrue(root.getAllElements().size() >= 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_empty_throwsException() {
        new Element("div").getElementsByTag("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_empty_throwsException() {
        new Element("div").getElementById("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_empty_throwsException() {
        new Element("div").getElementsByClass("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_empty_throwsException() {
        new Element("div").getElementsByAttribute("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_empty_throwsException() {
        new Element("div").getElementsByAttributeStarting("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegex_throwsException() {
        new Element("div").getElementsByAttributeValueMatching("title", "[unclosed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegex_throwsException() {
        new Element("div").getElementsMatchingText("[unclosed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegex_throwsException() {
        new Element("div").getElementsMatchingOwnText("[unclosed");
    }

    @Test
    public void testTextAndWholeTextAndOwnText() {
        Document doc = Jsoup.parse("<div>Hello <span>there</span><br><b>world</b> <pre>  preserve   spaces  </pre></div>");
        Element div = doc.select("div").first();

        assertEquals("Hello there world preserve spaces", div.text());
        assertEquals("Hello world", div.ownText());
        assertTrue(div.wholeText().contains("Hello "));

        Element pre = doc.select("pre").first();
        assertEquals("preserve spaces", pre.text());
        assertTrue(Element.preserveWhitespace(pre));

        Element elWithBr = new Element("p");
        elWithBr.appendText("A");
        elWithBr.appendElement("br");
        elWithBr.appendText("B");
        assertEquals("A B", elWithBr.ownText());

        Element textSetter = new Element("p");
        textSetter.text("New Content");
        assertEquals("New Content", textSetter.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextSetter_null_throwsException() {
        new Element("div").text(null);
    }

    @Test
    public void testHasText() {
        Element empty = new Element("div");
        assertFalse(empty.hasText());

        empty.appendText("   ");
        assertFalse(empty.hasText());

        empty.appendText("valid");
        assertTrue(empty.hasText());

        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        assertFalse(parent.hasText());
        child.text("text");
        assertTrue(parent.hasText());
    }

    @Test
    public void testData() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var x = 10;"));
        script.appendChild(new Comment("a comment"));
        Element child = script.appendElement("script");
        child.appendChild(new DataNode("var y = 20;"));
        script.appendChild(new CDataNode("cdata content"));

        assertEquals("var x = 10;a commentvar y = 20;cdata content", script.data());
    }

    @Test
    public void testClassManipulations() {
        Element el = new Element("div");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());

        el.addClass("header");
        assertEquals("header", el.className());
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("HEADER")); // case-insensitive

        el.addClass("first");
        assertEquals("header first", el.className());
        assertTrue(el.hasClass("first"));
        assertFalse(el.hasClass("second"));
        assertFalse(el.hasClass("fir"));
        assertFalse(el.hasClass("first-extra"));

        el.removeClass("header");
        assertEquals("first", el.className());
        assertFalse(el.hasClass("header"));

        el.toggleClass("active");
        assertTrue(el.hasClass("active"));
        el.toggleClass("active");
        assertFalse(el.hasClass("active"));

        Set<String> customClasses = new HashSet<>(Arrays.asList("one", "two"));
        el.classNames(customClasses);
        assertTrue(el.hasClass("one"));
        assertTrue(el.hasClass("two"));

        el.classNames(Collections.emptySet());
        assertEquals("", el.className());
        assertFalse(el.hasAttr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_null_throwsException() {
        new Element("div").addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_null_throwsException() {
        new Element("div").removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_null_throwsException() {
        new Element("div").toggleClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNames_null_throwsException() {
        new Element("div").classNames(null);
    }

    @Test
    public void testVal() {
        Element input = new Element("input");
        input.val("user");
        assertEquals("user", input.val());

        Element textarea = new Element("textarea");
        textarea.val("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void testHtmlAndOuterHtml() throws IOException {
        Element div = new Element("div");
        div.html("<p>Paragraph</p>");
        assertEquals("<p>Paragraph</p>", div.html());

        StringBuilder sb = new StringBuilder();
        div.html(sb);
        assertEquals("<p>Paragraph</p>", sb.toString());

        Element img = new Element("img");
        assertEquals("<img>", img.outerHtml());

        Document xmlDoc = Jsoup.parse("<img />", "", org.jsoup.parser.Parser.xmlParser());
        assertEquals("<img />", xmlDoc.select("img").outerHtml());

        Document doc = Jsoup.parse("<div><p><span>Hello</span></p></div>");
        doc.outputSettings().outline(true);
        assertTrue(doc.outerHtml().contains("<span>"));
    }

    @Test
    public void testCloning() {
        Element parent = new Element("div");
        parent.attr("id", "orig");
        Element child = parent.appendElement("span");
        child.text("Child Text");

        Element clone = parent.clone();
        assertNotEquals(System.identityHashCode(parent), System.identityHashCode(clone));
        assertEquals(parent.outerHtml(), clone.outerHtml());
        assertEquals("orig", clone.attr("id"));
        assertEquals(1, clone.children().size());

        Element shallow = parent.shallowClone();
        assertEquals("div", shallow.tagName());
        assertEquals(0, shallow.children().size());
        assertEquals("orig", shallow.attr("id"));
    }
}
