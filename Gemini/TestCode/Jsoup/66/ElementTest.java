package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructorWithStringTag_createsElementProperly() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertEquals("", el.baseUri());
        assertEquals(0, el.childNodeSize());
        assertNotNull(el.attributes());
        assertTrue(el.isBlock());
    }

    @Test
    public void testConstructorWithTagAndBaseUri_createsElementProperly() {
        Tag spanTag = Tag.valueOf("span");
        Element el = new Element(spanTag, "http://example.com");
        assertEquals("span", el.tagName());
        assertEquals("http://example.com", el.baseUri());
        assertFalse(el.isBlock());
        assertFalse(el.hasAttributes());
        assertNotNull(el.attributes()); // lazy init
        assertTrue(el.hasAttributes());
    }

    @Test
    public void testConstructorWithTagBaseUriAndAttributes_createsElementProperly() {
        Tag pTag = Tag.valueOf("p");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Element el = new Element(pTag, "http://example.com", attrs);
        assertEquals("p", el.tagName());
        assertEquals("http://example.com", el.baseUri());
        assertEquals("main", el.id());
        assertTrue(el.hasAttributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTagThrowsException() {
        new Element((Tag) null, "http://example.com", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUriThrowsException() {
        new Element(Tag.valueOf("div"), null, new Attributes());
    }

    @Test
    public void testTagNameChange_preservesCaseAndUpdates() {
        Element el = new Element("div");
        el.tagName("SPAN");
        assertEquals("SPAN", el.tagName());
        assertEquals("SPAN", el.nodeName());
        assertEquals("SPAN", el.tag().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameChange_emptyStringThrowsException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testBaseUriAndDoSetBaseUri_worksCorrectly() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("http://example.com", el.baseUri());
        el.setBaseUri("http://example.org");
        assertEquals("http://example.org", el.baseUri());
    }

    @Test
    public void testIdAttribute_returnsValueOrEmpty() {
        Element el = new Element("div");
        assertEquals("", el.id());
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testAttr_stringKeyAndValue() {
        Element el = new Element("a");
        Element chain = el.attr("href", "http://jsoup.org");
        assertSame(el, chain);
        assertEquals("http://jsoup.org", el.attr("href"));
    }

    @Test
    public void testAttr_booleanValue() {
        Element el = new Element("input");
        Element chain = el.attr("disabled", true);
        assertSame(el, chain);
        assertTrue(el.hasAttr("disabled"));

        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    @Test
    public void testDataset_retrievesAndModifiesCustomData() {
        Element el = new Element("div");
        el.attr("data-item", "book");
        el.attr("data-price", "100");
        el.attr("class", "product");

        Map<String, String> dataset = el.dataset();
        assertEquals(2, dataset.size());
        assertEquals("book", dataset.get("item"));
        assertEquals("100", dataset.get("price"));

        dataset.put("author", "John");
        assertEquals("John", el.attr("data-author"));
    }

    @Test
    public void testParentAndParents_traversesAncestorsExcludingRoot() {
        Document doc = Jsoup.parse("<div><p><span>Hello</span></p></div>");
        Element span = doc.selectFirst("span");
        assertNotNull(span);
        assertEquals("p", span.parent().tagName());

        Elements parents = span.parents();
        assertEquals(4, parents.size());
        assertEquals("p", parents.get(0).tagName());
        assertEquals("div", parents.get(1).tagName());
        assertEquals("body", parents.get(2).tagName());
        assertEquals("html", parents.get(3).tagName());

        Element standalone = new Element("div");
        assertEquals(0, standalone.parents().size());
        assertNull(standalone.parent());
    }

    @Test
    public void testChildAndChildren_retrievesElementChildrenOnly() {
        Element div = new Element("div");
        div.appendText("Text before ");
        Element p = div.appendElement("p");
        div.appendText(" Text between ");
        Element span = div.appendElement("span");

        assertEquals(4, div.childNodeSize());
        assertEquals(2, div.children().size());
        assertSame(p, div.child(0));
        assertSame(span, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_outOfBoundsThrowsException() {
        Element div = new Element("div");
        div.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes_retrievesFilteredUnmodifiableLists() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var x = 10;"));
        script.appendChild(new TextNode("Some text"));

        List<TextNode> textNodes = script.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Some text", textNodes.get(0).getWholeText());

        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var x = 10;", dataNodes.get(0).getWholeData());

        Element emptyDiv = new Element("div");
        assertTrue(emptyDiv.textNodes().isEmpty());
        assertTrue(emptyDiv.dataNodes().isEmpty());
    }

    @Test
    public void testSelectAndSelectFirst_queriesElements() {
        Document doc = Jsoup.parse("<div id='one'><span class='target'>A</span><span class='target'>B</span></div>");
        Elements targets = doc.select(".target");
        assertEquals(2, targets.size());
        assertEquals("A", targets.get(0).text());

        Element firstTarget = doc.selectFirst(".target");
        assertNotNull(firstTarget);
        assertEquals("A", firstTarget.text());

        assertNull(doc.selectFirst(".non-existent"));
    }

    @Test
    public void testIs_withStringAndEvaluator() {
        Document doc = Jsoup.parse("<div id='myDiv' class='box active'></div>");
        Element div = doc.selectFirst("#myDiv");
        assertNotNull(div);

        assertTrue(div.is("#myDiv"));
        assertTrue(div.is(".box.active"));
        assertFalse(div.is("span"));
        assertTrue(div.is(new Evaluator.Id("myDiv")));
        assertFalse(div.is(new Evaluator.Tag("span")));
    }

    @Test
    public void testAppendChildAndPrependChild() {
        Element div = new Element("div");
        Element p = new Element("p");
        Element span = new Element("span");

        div.appendChild(p);
        assertSame(p, div.child(0));

        div.prependChild(span);
        assertSame(span, div.child(0));
        assertSame(p, div.child(1));
        assertEquals(0, span.siblingIndex());
        assertEquals(1, p.siblingIndex());
    }

    @Test
    public void testAppendTo_addsToParent() {
        Element parent = new Element("div");
        Element child = new Element("p");
        Element returned = child.appendTo(parent);

        assertSame(child, returned);
        assertEquals(1, parent.children().size());
        assertSame(child, parent.child(0));
    }

    @Test
    public void testInsertChildren_collectionAndVarargs() {
        Element div = new Element("div");
        Element p1 = new Element("p");
        Element p2 = new Element("p");
        Element p3 = new Element("p");

        div.insertChildren(0, Arrays.asList(p1, p3));
        assertEquals(2, div.children().size());
        assertSame(p1, div.child(0));
        assertSame(p3, div.child(1));

        // Insert at index 1 (between p1 and p3)
        div.insertChildren(1, p2);
        assertEquals(3, div.children().size());
        assertSame(p1, div.child(0));
        assertSame(p2, div.child(1));
        assertSame(p3, div.child(2));

        // Insert using negative index (-1 inserts at end)
        Element p4 = new Element("p");
        div.insertChildren(-1, Collections.singletonList(p4));
        assertEquals(4, div.children().size());
        assertSame(p4, div.child(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_outOfBoundsThrowsException() {
        Element div = new Element("div");
        div.insertChildren(5, new Node[]{new Element("span")});
    }

    @Test
    public void testAppendAndPrependElement() {
        Element div = new Element("div");
        Element p = div.appendElement("p");
        assertEquals("p", p.tagName());
        assertSame(p, div.child(0));

        Element header = div.prependElement("header");
        assertEquals("header", header.tagName());
        assertSame(header, div.child(0));
        assertSame(p, div.child(1));
    }

    @Test
    public void testAppendAndPrependText() {
        Element div = new Element("div");
        div.appendText("World");
        div.prependText("Hello ");
        assertEquals("Hello World", div.text());
    }

    @Test
    public void testAppendAndPrependHtml() {
        Element div = new Element("div");
        div.append("<p>World</p>");
        div.prepend("<h1>Hello</h1>");
        assertEquals(2, div.children().size());
        assertEquals("<h1>Hello</h1>\n<p>World</p>", div.html());
    }

    @Test
    public void testBeforeAndAfter_stringAndNode() {
        Document doc = Jsoup.parse("<div><p id='center'>Center</p></div>");
        Element center = doc.selectFirst("#center");
        assertNotNull(center);

        Element beforeSpan = new Element("span").text("BeforeNode");
        Element afterSpan = new Element("span").text("AfterNode");

        center.before(beforeSpan);
        center.after(afterSpan);
        center.before("<header>BeforeHtml</header>");
        center.after("<footer>AfterHtml</footer>");

        Element div = doc.selectFirst("div");
        assertEquals(5, div.children().size());
        assertEquals("span", div.child(0).tagName());
        assertEquals("header", div.child(1).tagName());
        assertEquals("p", div.child(2).tagName());
        assertEquals("footer", div.child(3).tagName());
        assertEquals("span", div.child(4).tagName());
    }

    @Test
    public void testEmpty_clearsChildNodes() {
        Element div = new Element("div");
        div.append("<p>1</p><span>2</span>");
        assertEquals(2, div.children().size());
        div.empty();
        assertEquals(0, div.childNodeSize());
        assertEquals(0, div.children().size());
    }

    @Test
    public void testWrap_wrapsAroundElement() {
        Document doc = Jsoup.parse("<div id='root'><p>Text</p></div>");
        Element p = doc.selectFirst("p");
        assertNotNull(p);
        p.wrap("<section class='wrapper'></section>");

        Element wrapper = doc.selectFirst("section.wrapper");
        assertNotNull(wrapper);
        assertSame(p, wrapper.child(0));
    }

    @Test
    public void testCssSelector_withAndWithoutIdAndClasses() {
        Document doc = Jsoup.parse("<div id='main'><ul class='list primary'><li>First</li><li>Second</li></ul></div>");
        Element main = doc.selectFirst("#main");
        assertEquals("#main", main.cssSelector());

        Element secondLi = doc.select("li").get(1);
        assertEquals("#main > ul.list.primary > li:nth-child(2)", secondLi.cssSelector());

        Element standalone = new Element("div").attr("class", "test");
        assertEquals("div.test", standalone.cssSelector());

        Element xmlNs = new Element("ns:custom");
        assertEquals("ns|custom", xmlNs.cssSelector());
    }

    @Test
    public void testSiblingNavigationMethods() {
        Document doc = Jsoup.parse("<div><p id='1'>One</p><p id='2'>Two</p><p id='3'>Three</p></div>");
        Element one = doc.selectFirst("#1");
        Element two = doc.selectFirst("#2");
        Element three = doc.selectFirst("#3");

        assertEquals(2, one.siblingElements().size());
        assertSame(two, one.nextElementSibling());
        assertNull(one.previousElementSibling());
        assertSame(one, one.firstElementSibling());
        assertSame(three, one.lastElementSibling());
        assertEquals(0, one.elementSiblingIndex());

        assertSame(three, two.nextElementSibling());
        assertSame(one, two.previousElementSibling());
        assertEquals(1, two.elementSiblingIndex());

        assertNull(three.nextElementSibling());
        assertSame(two, three.previousElementSibling());
        assertEquals(2, three.elementSiblingIndex());

        Element standalone = new Element("div");
        assertEquals(0, standalone.siblingElements().size());
        assertNull(standalone.nextElementSibling());
        assertNull(standalone.previousElementSibling());
        assertNull(standalone.firstElementSibling());
        assertNull(standalone.lastElementSibling());
        assertEquals(0, standalone.elementSiblingIndex());
    }

    @Test
    public void testDomSearchMethods() {
        Document doc = Jsoup.parse("<div id='root' class='container primary'>" +
                "<p id='p1' class='text item' data-type='alpha'>Hello <b>World</b></p>" +
                "<p id='p2' class='text' data-type='beta'>Hello Jsoup</p>" +
                "<span id='s1' class='text' data-num='123'>Sample <i>Data</i></span>" +
                "</div>");
        Element root = doc.selectFirst("#root");
        assertNotNull(root);

        assertEquals(2, root.getElementsByTag("P").size());
        assertSame(root.child(0), root.getElementById("p1"));
        assertNull(root.getElementById("non-existent"));
        assertEquals(3, root.getElementsByClass("text").size());

        assertEquals(2, root.getElementsByAttribute("data-type").size());
        assertEquals(3, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("data-type", "alpha").size());
        assertTrue(root.getElementsByAttributeValueNot("data-type", "alpha").size() > 0);
        assertEquals(2, root.getElementsByAttributeValueStarting("data-type", "al").size() + root.getElementsByAttributeValueStarting("data-type", "be").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("data-type", "ha").size());
        assertEquals(2, root.getElementsByAttributeValueContaining("data-type", "t").size());

        assertEquals(2, root.getElementsByAttributeValueMatching("data-type", Pattern.compile("^al.*|^be.*")).size());
        assertEquals(2, root.getElementsByAttributeValueMatching("data-type", "^(alpha|beta)$").size());

        assertEquals(1, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());

        assertEquals(2, root.getElementsContainingText("Hello").size());
        assertEquals(1, root.getElementsContainingOwnText("Hello").size());

        assertEquals(2, root.getElementsMatchingText(Pattern.compile("Hello.*")).size());
        assertEquals(2, root.getElementsMatchingText("Hello.*").size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("^Hello$")).size());
        assertEquals(1, root.getElementsMatchingOwnText("^Hello$").size());

        assertEquals(6, root.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_invalidRegexThrowsException() {
        Element el = new Element("div");
        el.getElementsByAttributeValueMatching("id", "[invalid(");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_invalidRegexThrowsException() {
        Element el = new Element("div");
        el.getElementsMatchingText("[invalid(");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_invalidRegexThrowsException() {
        Element el = new Element("div");
        el.getElementsMatchingOwnText("[invalid(");
    }

    @Test
    public void testTextAndOwnText() {
        Document doc = Jsoup.parse("<div>Hello <span>World</span> and <br> everyone!</div>");
        Element div = doc.selectFirst("div");
        assertNotNull(div);

        assertEquals("Hello World and everyone!", div.text());
        assertEquals("Hello and everyone!", div.ownText());

        Element p = new Element("p");
        p.text("New Content");
        assertEquals("New Content", p.text());
    }

    @Test
    public void testPreserveWhitespaceInPre() {
        Document doc = Jsoup.parse("<pre>  line 1  \n  line 2  </pre>");
        Element pre = doc.selectFirst("pre");
        assertNotNull(pre);
        assertEquals("  line 1  \n  line 2  ", pre.text());
    }

    @Test
    public void testHasText() {
        Element divWithText = new Element("div").text("some text");
        assertTrue(divWithText.hasText());

        Element divWithBlank = new Element("div").text("   ");
        assertFalse(divWithBlank.hasText());

        Element nested = new Element("div");
        Element child = new Element("p").text("nested");
        nested.appendChild(child);
        assertTrue(nested.hasText());
    }

    @Test
    public void testDataMethod_aggregatesDataAndCommentNodes() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var a = 1;"));
        assertEquals("var a = 1;", script.data());

        Element div = new Element("div");
        div.appendChild(new Comment("comment text"));
        assertEquals("comment text", div.data());

        Element wrapper = new Element("div");
        wrapper.appendChild(script);
        assertEquals("var a = 1;", wrapper.data());
    }

    @Test
    public void testClassManipulation() {
        Element el = new Element("div");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());
        assertFalse(el.hasClass("active"));

        el.addClass("active");
        assertEquals("active", el.className());
        assertTrue(el.hasClass("active"));
        assertTrue(el.hasClass("ACTIVE")); // case insensitive

        el.addClass("selected");
        assertEquals("active selected", el.className());
        assertTrue(el.hasClass("selected"));
        assertFalse(el.hasClass("select"));

        el.removeClass("active");
        assertEquals("selected", el.className());
        assertFalse(el.hasClass("active"));

        el.toggleClass("selected");
        assertFalse(el.hasClass("selected"));

        el.toggleClass("selected");
        assertTrue(el.hasClass("selected"));

        Set<String> set = new LinkedHashSet<>();
        set.add("one");
        set.add("two");
        el.classNames(set);
        assertEquals("one two", el.className());
        assertEquals(2, el.classNames().size());
    }

    @Test
    public void testVal_inputAndTextarea() {
        Element input = new Element("input").attr("value", "sample input");
        assertEquals("sample input", input.val());
        input.val("new input");
        assertEquals("new input", input.attr("value"));

        Element textarea = new Element("textarea").text("sample text");
        assertEquals("sample text", textarea.val());
        textarea.val("new text");
        assertEquals("new text", textarea.text());
    }

    @Test
    public void testHtmlAndOuterHtmlFormatting() {
        Document doc = Jsoup.parse("<div><p>Paragraph</p><img src='test.jpg'></div>");
        doc.outputSettings().prettyPrint(false);
        Element div = doc.selectFirst("div");
        assertNotNull(div);

        assertEquals("<p>Paragraph</p><img>", div.html());

        doc.outputSettings().prettyPrint(true);
        assertTrue(div.html().contains("<p>Paragraph</p>"));

        StringBuilder sb = new StringBuilder();
        div.html(sb);
        assertTrue(sb.length() > 0);

        div.html("<span>Replaced</span>");
        assertEquals("<span>Replaced</span>", div.html());
    }

    @Test
    public void testOuterHtmlXmlSyntax() {
        Element img = new Element(Tag.valueOf("img"), "");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);

        StringBuilder sb = new StringBuilder();
        try {
            img.outerHtmlHead(sb, 0, settings);
            img.outerHtmlTail(sb, 0, settings);
        } catch (IOException e) {
            fail(e.getMessage());
        }
        assertEquals("<img />", sb.toString());
    }

    @Test
    public void testToStringMatchesOuterHtml() {
        Element el = new Element("div").attr("id", "test");
        assertEquals(el.outerHtml(), el.toString());
    }

    @Test
    public void testClone_createsDeepCopy() {
        Element original = new Element("div").attr("id", "main");
        original.append("<p class='para'>Hello</p>");

        Element copy = original.clone();
        assertNotSame(original, copy);
        assertEquals(original.outerHtml(), copy.outerHtml());

        copy.attr("id", "modified");
        assertEquals("main", original.attr("id"));
        assertEquals("modified", copy.attr("id"));

        copy.selectFirst("p").text("Modified text");
        assertEquals("Hello", original.selectFirst("p").text());
        assertEquals("Modified text", copy.selectFirst("p").text());
    }
}
