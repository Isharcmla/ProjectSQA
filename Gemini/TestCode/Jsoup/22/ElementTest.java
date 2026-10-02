package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    @Test
    public void testConstructorsAndGetters_validInputs_success() {
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Element el = new Element(tag, "http://example.com", attrs);

        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals(tag, el.tag());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertEquals("main", el.id());
        Assert.assertTrue(el.isBlock());

        Element el2 = new Element(Tag.valueOf("span"), "");
        Assert.assertEquals("span", el2.tagName());
        Assert.assertFalse(el2.isBlock());
        Assert.assertEquals("", el2.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTag_throwsException() {
        new Element(null, "http://example.com", new Attributes());
    }

    @Test
    public void testTagName_validAndEmptyChange() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("p");
        Assert.assertEquals("p", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyString_throwsException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void testAttrAndDataset() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-test", "val1");
        el.attr("data-other", "val2");
        el.attr("class", "c1");

        Assert.assertEquals("val1", el.attr("data-test"));
        Map<String, String> dataset = el.dataset();
        Assert.assertEquals(2, dataset.size());
        Assert.assertEquals("val1", dataset.get("test"));
        Assert.assertEquals("val2", dataset.get("other"));
    }

    @Test
    public void testParentsAndRoot() {
        Document doc = Jsoup.parse("<div><p><span>text</span></p></div>");
        Element span = doc.select("span").first();
        Elements parents = span.parents();

        Assert.assertEquals(3, parents.size());
        Assert.assertEquals("p", parents.get(0).tagName());
        Assert.assertEquals("div", parents.get(1).tagName());
        Assert.assertEquals("body", parents.get(2).tagName());

        Element standalone = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(standalone.parent());
        Assert.assertEquals(0, standalone.parents().size());
    }

    @Test
    public void testChildrenAndChildNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("Text1<p>Para</p>Text2<!-- comment --><span>Span</span>");

        Elements children = el.children();
        Assert.assertEquals(2, children.size());
        Assert.assertEquals("p", el.child(0).tagName());
        Assert.assertEquals("span", el.child(1).tagName());

        List<TextNode> textNodes = el.textNodes();
        Assert.assertEquals(2, textNodes.size());
        Assert.assertEquals("Text1", textNodes.get(0).text());
        Assert.assertEquals("Text2", textNodes.get(1).text());

        Element script = new Element(Tag.valueOf("script"), "");
        DataNode dataNode = new DataNode("var x = 1;", "");
        script.appendChild(dataNode);
        List<DataNode> dataNodes = script.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testAppendPrependOperations() {
        Element parent = new Element(Tag.valueOf("div"), "");
        
        Element child2 = new Element(Tag.valueOf("span"), "");
        child2.text("2");
        parent.appendChild(child2);

        Element child1 = new Element(Tag.valueOf("span"), "");
        child1.text("1");
        parent.prependChild(child1);

        Element child3 = parent.appendElement("span");
        child3.text("3");

        Element child0 = parent.prependElement("span");
        child0.text("0");

        parent.appendText("End");
        parent.prependText("Start");

        Assert.assertEquals("Start0123End", parent.text());
    }

    @Test
    public void testAppendAndPrependHtml() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p>1</p>");
        parent.prepend("<p>0</p>");
        parent.append("<p>2</p>");

        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("0", parent.child(0).text());
        Assert.assertEquals("1", parent.child(1).text());
        Assert.assertEquals("2", parent.child(2).text());
    }

    @Test
    public void testBeforeAndAfterAndWrap() {
        Document doc = Jsoup.parse("<div><p id='target'>mid</p></div>");
        Element target = doc.getElementById("target");

        target.before("<p>beforeHtml</p>");
        target.before(new Element(Tag.valueOf("p"), "").text("beforeNode"));
        target.after("<p>afterHtml</p>");
        target.after(new Element(Tag.valueOf("p"), "").text("afterNode"));
        target.wrap("<div class='wrapper'></div>");

        Element wrapper = doc.select(".wrapper").first();
        Assert.assertNotNull(wrapper);
        Assert.assertEquals("target", wrapper.child(0).id());
        Assert.assertTrue(doc.html().contains("beforeHtml"));
        Assert.assertTrue(doc.html().contains("afterHtml"));
    }

    @Test
    public void testEmptyAndHtml() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.html("<p>Hello <b>World</b></p>");
        Assert.assertEquals(1, el.children().size());
        Assert.assertEquals("<p>Hello <b>World</b></p>", el.html());

        el.empty();
        Assert.assertEquals(0, el.children().size());
        Assert.assertEquals("", el.html());
    }

    @Test
    public void testSiblingNavigation() {
        Document doc = Jsoup.parse("<div><p id='1'>1</p><p id='2'>2</p><p id='3'>3</p></div>");
        Element p1 = doc.getElementById("1");
        Element p2 = doc.getElementById("2");
        Element p3 = doc.getElementById("3");

        Assert.assertEquals(3, p1.siblingElements().size());
        Assert.assertEquals(p2, p1.nextElementSibling());
        Assert.assertNull(p3.nextElementSibling());
        Assert.assertEquals(p1, p2.previousElementSibling());
        Assert.assertNull(p1.previousElementSibling());

        Assert.assertEquals(p1, p2.firstElementSibling());
        Assert.assertEquals(p3, p2.lastElementSibling());

        Assert.assertEquals(Integer.valueOf(0), p1.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(1), p2.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(2), p3.elementSiblingIndex());

        Element standalone = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals(Integer.valueOf(0), standalone.elementSiblingIndex());
        
        Element singleParent = new Element(Tag.valueOf("div"), "");
        Element onlyChild = singleParent.appendElement("p");
        Assert.assertNull(onlyChild.firstElementSibling());
        Assert.assertNull(onlyChild.lastElementSibling());
    }

    @Test
    public void testGetElementsMethods() {
        Document doc = Jsoup.parse("<div id='root' class='container main'>" +
                "<p id='p1' class='test' data-type='a'>One</p>" +
                "<p id='p2' class='test' data-type='b'>Two</p>" +
                "<p id='p3' class='other' data-item='x'>Three</p>" +
                "<span id='s1'>Four <b>Deep</b></span>" +
                "</div>");
        Element root = doc.getElementById("root");

        Assert.assertEquals(3, root.getElementsByTag("p").size());
        Assert.assertEquals("p1", root.getElementById("p1").id());
        Assert.assertNull(root.getElementById("nonexistent"));
        Assert.assertEquals(2, root.getElementsByClass("test").size());
        Assert.assertEquals(3, root.getElementsByAttribute("data-type").size() + 1);
        Assert.assertEquals(3, root.getElementsByAttributeStarting("data-").size());
        Assert.assertEquals(1, root.getElementsByAttributeValue("data-type", "a").size());
        Assert.assertTrue(root.getElementsByAttributeValueNot("data-type", "a").size() > 0);
        Assert.assertEquals(2, root.getElementsByAttributeValueStarting("data-type", "").size());
        Assert.assertEquals(1, root.getElementsByAttributeValueEnding("data-type", "b").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueContaining("data-type", "").size());

        Assert.assertEquals(1, root.getElementsByAttributeValueMatching("data-type", Pattern.compile("^a$")).size());
        Assert.assertEquals(1, root.getElementsByAttributeValueMatching("data-type", "^b$").size());

        Assert.assertEquals(1, root.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(3, root.getElementsByIndexGreaterThan(0).size());
        Assert.assertEquals(1, root.getElementsByIndexEquals(2).size());

        Assert.assertEquals(1, root.getElementsContainingText("One").size());
        Assert.assertEquals(1, root.getElementsContainingOwnText("One").size());
        Assert.assertEquals(2, root.getElementsContainingText("Deep").size());
        Assert.assertEquals(1, root.getElementsContainingOwnText("Deep").size());

        Assert.assertEquals(1, root.getElementsMatchingText(Pattern.compile("Two")).size());
        Assert.assertEquals(1, root.getElementsMatchingText("Two").size());
        Assert.assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Three")).size());
        Assert.assertEquals(1, root.getElementsMatchingOwnText("Three").size());

        Assert.assertEquals(6, root.getAllElements().size());
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
    public void testTextAndOwnTextAndWhitespace() {
        Document doc = Jsoup.parse("<div>Hello <p>Paragraph <br> Break</p> World</div>");
        Element div = doc.select("div").first();

        Assert.assertEquals("Hello Paragraph Break World", div.text());
        Assert.assertEquals("Hello World", div.ownText());
        Assert.assertTrue(div.hasText());

        Element empty = new Element(Tag.valueOf("div"), "");
        Assert.assertFalse(empty.hasText());
        Assert.assertEquals("", empty.text());
        Assert.assertEquals("", empty.ownText());

        empty.text("New Text");
        Assert.assertEquals("New Text", empty.text());
        Assert.assertTrue(empty.hasText());

        Document preDoc = Jsoup.parse("<pre>  Line 1  \n  Line 2  </pre>");
        Element pre = preDoc.select("pre").first();
        Assert.assertTrue(pre.preserveWhitespace());
        Assert.assertEquals("  Line 1  \n  Line 2  ", pre.text());
    }

    @Test
    public void testBrWhitespaceHandling() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendText("A");
        p.appendElement("br");
        p.appendText("B");
        Assert.assertEquals("A B", p.text());
        Assert.assertEquals("A B", p.ownText());
    }

    @Test
    public void testDataMethod() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("alert('1');", ""));
        Element innerScript = script.appendElement("script");
        innerScript.appendChild(new DataNode("alert('2');", ""));

        Assert.assertEquals("alert('1');alert('2');", script.data());
    }

    @Test
    public void testClassManipulation() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "one two");

        Assert.assertEquals("one two", el.className());
        Assert.assertTrue(el.hasClass("one"));
        Assert.assertTrue(el.hasClass("TWO"));
        Assert.assertFalse(el.hasClass("three"));

        el.addClass("three");
        Assert.assertTrue(el.hasClass("three"));

        el.removeClass("two");
        Assert.assertFalse(el.hasClass("two"));

        el.toggleClass("four");
        Assert.assertTrue(el.hasClass("four"));
        el.toggleClass("four");
        Assert.assertFalse(el.hasClass("four"));

        Set<String> customClasses = new HashSet<String>();
        customClasses.add("alpha");
        customClasses.add("beta");
        el.classNames(customClasses);
        Assert.assertTrue(el.hasClass("alpha"));
        Assert.assertTrue(el.hasClass("beta"));
        Assert.assertFalse(el.hasClass("one"));
    }

    @Test
    public void testValMethod() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("testValue");
        Assert.assertEquals("testValue", input.val());

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("text value");
        Assert.assertEquals("text value", textarea.val());
    }

    @Test
    public void testOuterHtmlAndToString() {
        Element img = new Element(Tag.valueOf("img"), "");
        Assert.assertEquals("<img />", img.outerHtml());

        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("id", "test");
        div.text("Content");
        Assert.assertEquals("<div id=\"test\">\n Content\n</div>", div.outerHtml());
        Assert.assertEquals(div.outerHtml(), div.toString());
    }

    @Test
    public void testEqualsHashCodeAndClone() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        el1.attr("class", "c1");
        Element el2 = el1;
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");

        Assert.assertEquals(el1, el2);
        Assert.assertNotEquals(el1, el3);
        Assert.assertNotEquals(el1, "someString");
        Assert.assertEquals(el1.hashCode(), el2.hashCode());

        Element cloned = el1.clone();
        Assert.assertNotSame(el1, cloned);
        Assert.assertEquals(el1.tagName(), cloned.tagName());
        Assert.assertTrue(cloned.hasClass("c1"));
    }
}
