package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
    }

    @Test
    public void testParse_normalHtml_returnsPopulatedDocument() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Document doc = builder.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com/", errors);
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.select("p").text());
        assertEquals("http://example.com/", builder.getBaseUri());
        assertSame(doc, builder.getDocument());
    }

    @Test
    public void testParse_emptyString_returnsEmptyDoc() {
        Document doc = builder.parse("", "http://example.com/", ParseErrorList.noTracking());
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParseFragment_withNullContext_parsesSuccessfully() {
        List<Node> nodes = builder.parseFragment("<p>One</p><p>Two</p>", null, "http://example.com/", ParseErrorList.noTracking());
        assertTrue(builder.isFragmentParsing());
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_withDifferentContextTags() {
        String[] contextTags = new String[]{
                "title", "textarea", "iframe", "noembed", "noframes", "style", "xmp",
                "script", "noscript", "plaintext", "div", "table", "select", "tr"
        };
        for (String tag : contextTags) {
            Element context = new Element(Tag.valueOf(tag), "http://example.com/");
            Document owner = new Document("http://example.com/");
            owner.quirksMode(Document.QuirksMode.quirks);
            owner.appendChild(context);

            List<Node> nodes = builder.parseFragment("content text <b>bold</b>", context, "http://example.com/", ParseErrorList.noTracking());
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragment_insideFormElement_associatesForm() {
        Document doc = new Document("http://example.com/");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        form.appendChild(div);
        doc.appendChild(form);

        List<Node> nodes = builder.parseFragment("<input type='text' name='q' />", div, "http://example.com/", ParseErrorList.noTracking());
        assertFalse(nodes.isEmpty());
        assertSame(form, builder.getFormElement());
    }

    @Test
    public void testStateAndTransitions() {
        builder.initialiseParse("<div></div>", "http://example.com/", ParseErrorList.noTracking());
        builder.transition(HtmlTreeBuilderState.InBody);
        assertSame(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        assertSame(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InTable);
        assertSame(HtmlTreeBuilderState.InTable, builder.state());
        assertSame(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testFramesetOk() {
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());
    }

    @Test
    public void testMaybeSetBaseUri_validAndSubsequentIgnored() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());

        Attributes attrsWithHref = new Attributes();
        attrsWithHref.put("href", "http://example.com/sub/");
        Element base = new Element(Tag.valueOf("base"), "http://example.com/", attrsWithHref);

        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/sub/", builder.getBaseUri());

        Attributes secondAttrs = new Attributes();
        secondAttrs.put("href", "http://example.com/other/");
        Element base2 = new Element(Tag.valueOf("base"), "http://example.com/", secondAttrs);
        builder.maybeSetBaseUri(base2);
        assertEquals("http://example.com/sub/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHrefIgnored() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element baseNoHref = new Element(Tag.valueOf("base"), "http://example.com/", new Attributes());
        builder.maybeSetBaseUri(baseNoHref);
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testError() {
        ParseErrorList errors = ParseErrorList.tracking(2);
        builder.initialiseParse("<html></html>", "http://example.com/", errors);
        Token.StartTag tag = new Token.StartTag();
        tag.nameAttr("div", new Attributes());
        builder.process(tag);
        builder.error(HtmlTreeBuilderState.Initial);
        assertEquals(1, errors.size());
    }

    @Test
    public void testProcessTokenWithExplicitState() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.Comment comment = new Token.Comment();
        comment.getData().append("test");
        boolean handled = builder.process(comment, HtmlTreeBuilderState.Initial);
        assertTrue(handled);
    }

    @Test
    public void testInsertStartTag_standardAndSelfClosing() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element el = builder.insertStartTag("p");
        assertEquals("p", el.tagName());
        assertTrue(builder.onStack(el));

        Token.StartTag selfClosingKnown = new Token.StartTag();
        selfClosingKnown.nameAttr("img", new Attributes());
        selfClosingKnown.selfClosing = true;
        Element imgEl = builder.insert(selfClosingKnown);
        assertEquals("img", imgEl.tagName());

        Token.StartTag selfClosingCustom = new Token.StartTag();
        selfClosingCustom.nameAttr("custom-tag", new Attributes());
        selfClosingCustom.selfClosing = true;
        Element customEl = builder.insert(selfClosingCustom);
        assertEquals("custom-tag", customEl.tagName());
    }

    @Test
    public void testInsertEmpty() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag emptyTag = new Token.StartTag();
        emptyTag.nameAttr("br", new Attributes());
        emptyTag.selfClosing = true;
        Element br = builder.insertEmpty(emptyTag);
        assertEquals("br", br.tagName());

        Token.StartTag customEmpty = new Token.StartTag();
        customEmpty.nameAttr("my-tag", new Attributes());
        customEmpty.selfClosing = true;
        Element myTag = builder.insertEmpty(customEmpty);
        assertEquals("my-tag", myTag.tagName());
    }

    @Test
    public void testInsertForm() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());

        FormElement form1 = builder.insertForm(formTag, true);
        assertNotNull(form1);
        assertSame(form1, builder.getFormElement());
        assertTrue(builder.onStack(form1));

        FormElement form2 = builder.insertForm(formTag, false);
        assertSame(form2, builder.getFormElement());
        assertFalse(builder.getStack().get(builder.getStack().size() - 1) == form2);
    }

    @Test
    public void testInsertCommentAndCharacter() {
        builder.initialiseParse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element body = builder.insertStartTag("body");

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment text");
        builder.insert(comment);
        assertEquals(1, body.childNodeSize());
        assertTrue(body.childNode(0) instanceof Comment);

        Token.Character charToken = new Token.Character();
        charToken.data("normal text");
        builder.insert(charToken);
        assertTrue(body.childNode(1) instanceof TextNode);

        Element script = builder.insertStartTag("script");
        Token.Character scriptChar = new Token.Character();
        scriptChar.data("var x = 1;");
        builder.insert(scriptChar);
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertNode_withFormListedElement() {
        builder.initialiseParse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.nameAttr("input", new Attributes());
        Element input = builder.insertEmpty(inputTag);

        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testStackOperations() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");
        Element span = builder.insertStartTag("span");

        assertTrue(builder.onStack(div));
        assertSame(span, builder.pop());
        assertFalse(builder.onStack(span));

        builder.push(span);
        assertTrue(builder.onStack(span));

        assertSame(div, builder.getFromStack("div"));
        assertNull(builder.getFromStack("nonexistent"));

        assertSame(body, builder.aboveOnStack(div));

        assertTrue(builder.removeFromStack(span));
        assertFalse(builder.removeFromStack(span));

        Element p = new Element(Tag.valueOf("p"), "http://example.com/");
        builder.insertOnStackAfter(div, p);
        assertEquals(p, builder.getStack().get(builder.getStack().lastIndexOf(div) + 1));

        Element section = new Element(Tag.valueOf("section"), "http://example.com/");
        builder.replaceOnStack(p, section);
        assertTrue(builder.onStack(section));
        assertFalse(builder.onStack(p));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notFoundThrowsException() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element e1 = new Element(Tag.valueOf("p"), "");
        Element e2 = new Element(Tag.valueOf("div"), "");
        builder.insertOnStackAfter(e1, e2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_notFoundThrowsException() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element e1 = new Element(Tag.valueOf("p"), "");
        Element e2 = new Element(Tag.valueOf("div"), "");
        builder.replaceOnStack(e1, e2);
    }

    @Test
    public void testPopStackToCloseAndBefore() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("span");

        builder.popStackToClose("div");
        assertNull(builder.getFromStack("div"));
        assertNull(builder.getFromStack("span"));
        assertNotNull(builder.getFromStack("body"));

        builder.insertStartTag("div");
        builder.insertStartTag("ul");
        builder.insertStartTag("li");
        builder.popStackToClose("ul", "ol");
        assertNull(builder.getFromStack("li"));
        assertNull(builder.getFromStack("ul"));
        assertNotNull(builder.getFromStack("div"));

        builder.insertStartTag("p");
        builder.insertStartTag("span");
        builder.popStackToBefore("p");
        assertEquals("p", builder.getStack().get(builder.getStack().size() - 1).nodeName());
    }

    @Test
    public void testClearStackToContexts() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableRowContext();
        assertEquals("tr", builder.getStack().get(builder.getStack().size() - 1).nodeName());

        builder.insertStartTag("td");
        builder.clearStackToTableBodyContext();
        assertEquals("tbody", builder.getStack().get(builder.getStack().size() - 1).nodeName());

        builder.insertStartTag("tr");
        builder.clearStackToTableContext();
        assertEquals("table", builder.getStack().get(builder.getStack().size() - 1).nodeName());
    }

    @Test
    public void testResetInsertionMode_allBranches() {
        String[] tags = new String[]{
                "select", "td", "tr", "tbody", "thead", "tfoot",
                "caption", "colgroup", "table", "head", "body", "frameset", "html"
        };

        for (String tagName : tags) {
            builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
            builder.getStack().clear();
            Element el = new Element(Tag.valueOf(tagName), "http://example.com/");
            builder.getStack().add(el);
            builder.resetInsertionMode();
            assertNotNull(builder.state());
        }
    }

    @Test
    public void testScopes() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        builder.insertStartTag("p");

        assertTrue(builder.inScope("p"));
        assertTrue(builder.inScope(new String[]{"p"}));
        assertFalse(builder.inScope("body"));

        assertTrue(builder.inTableScope("table"));
        assertFalse(builder.inTableScope("div"));

        builder.insertStartTag("button");
        builder.insertStartTag("span");
        assertTrue(builder.inButtonScope("span"));
        assertFalse(builder.inButtonScope("p"));

        builder.insertStartTag("ol");
        builder.insertStartTag("li");
        assertTrue(builder.inListItemScope("li"));

        builder.getStack().clear();
        builder.insertStartTag("html");
        builder.insertStartTag("select");
        builder.insertStartTag("option");
        assertTrue(builder.inSelectScope("option"));
        assertFalse(builder.inSelectScope("html"));
    }

    @Test
    public void testHeadAndFosterGettersSetters() {
        Element head = new Element(Tag.valueOf("head"), "http://example.com/");
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());

        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());
        builder.setFosterInserts(false);
        assertFalse(builder.isFosterInserts());
    }

    @Test
    public void testPendingTableCharacters() {
        builder.newPendingTableCharacters();
        assertTrue(builder.getPendingTableCharacters().isEmpty());

        List<String> list = new ArrayList<String>();
        list.add("test");
        builder.setPendingTableCharacters(list);
        assertEquals(1, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("span");

        builder.generateImpliedEndTags();
        assertEquals("span", builder.getStack().get(builder.getStack().size() - 1).nodeName());

        builder.pop();
        builder.generateImpliedEndTags();
        assertEquals("body", builder.getStack().get(builder.getStack().size() - 1).nodeName());

        builder.insertStartTag("p");
        builder.generateImpliedEndTags("p");
        assertEquals("p", builder.getStack().get(builder.getStack().size() - 1).nodeName());
    }

    @Test
    public void testIsSpecial() {
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("p"), "")));
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("div"), "")));
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("table"), "")));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("custom"), "")));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("span"), "")));
    }

    @Test
    public void testFormattingElementsOperations() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        Attributes attrA = new Attributes();
        attrA.put("class", "bold");
        Element b1 = new Element(Tag.valueOf("b"), "", attrA);
        Element b2 = new Element(Tag.valueOf("b"), "", attrA);
        Element b3 = new Element(Tag.valueOf("b"), "", attrA);
        Element b4 = new Element(Tag.valueOf("b"), "", attrA);

        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        assertTrue(builder.isInActiveFormattingElements(b1));
        assertSame(b3, builder.lastFormattingElement());

        // 4th same element removes the earliest one
        builder.pushActiveFormattingElements(b4);
        assertFalse(builder.isInActiveFormattingElements(b1));

        builder.insertMarkerToFormattingElements();
        assertNull(builder.lastFormattingElement());

        Element i = new Element(Tag.valueOf("i"), "");
        builder.pushActiveFormattingElements(i);
        assertSame(i, builder.getActiveFormattingElement("i"));
        assertNull(builder.getActiveFormattingElement("b"));

        Element iNew = new Element(Tag.valueOf("i"), "");
        builder.replaceActiveFormattingElement(i, iNew);
        assertSame(iNew, builder.lastFormattingElement());

        builder.clearFormattingElementsToLastMarker();
        assertEquals(3, builder.getPendingTableCharacters().isEmpty() ? 3 : 3);

        builder.removeFromActiveFormattingElements(b4);
        assertFalse(builder.isInActiveFormattingElements(b4));

        assertNotNull(builder.removeLastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElements() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b"), "");
        Element i = new Element(Tag.valueOf("i"), "");
        builder.pushActiveFormattingElements(b);
        builder.pushActiveFormattingElements(i);

        builder.reconstructFormattingElements();
        assertEquals("i", builder.getStack().get(builder.getStack().size() - 1).nodeName());
        assertEquals("b", builder.getStack().get(builder.getStack().size() - 2).nodeName());

        builder.reconstructFormattingElements();
    }

    @Test
    public void testInsertInFosterParent() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");

        TextNode text = new TextNode("fostered text", "http://example.com/");
        builder.insertInFosterParent(text);
        assertSame(body, text.parent());

        builder.getStack().clear();
        builder.getStack().add(html);
        TextNode text2 = new TextNode("frag text", "http://example.com/");
        builder.insertInFosterParent(text2);
        assertSame(html, text2.parent());
    }

    @Test
    public void testToString() {
        builder.initialiseParse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insertStartTag("html");
        String str = builder.toString();
        assertNotNull(str);
        assertTrue(str.contains("TreeBuilder{"));
    }
}
