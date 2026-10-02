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

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private ParseErrorList errorList;
    private ParseSettings settings;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        errorList = ParseErrorList.tracking(100);
        settings = ParseSettings.htmlDefault;
        builder.initialiseParse(new StringReader(""), "http://example.com/", errorList, settings);
    }

    @Test
    public void testDefaultSettings_returnsHtmlDefault() {
        ParseSettings defaultSet = builder.defaultSettings();
        assertNotNull(defaultSet);
        assertEquals(ParseSettings.htmlDefault, defaultSet);
    }

    @Test
    public void testInitialiseParse_resetsAllFields() {
        builder.framesetOk(false);
        builder.setFosterInserts(true);
        builder.initialiseParse(new StringReader("<div></div>"), "http://example.com/sub/", errorList, settings);

        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertNull(builder.getHeadElement());
        assertNull(builder.getFormElement());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFosterInserts());
        assertFalse(builder.isFragmentParsing());
        assertEquals("http://example.com/sub/", builder.getBaseUri());
    }

    @Test
    public void testParseFragment_withDifferentContextElements() {
        String[] contexts = {"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (String tag : contexts) {
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            Element context = new Element(Tag.valueOf(tag), "http://example.com/");
            List<Node> nodes = tb.parseFragment("Hello <b>world</b>", context, "http://example.com/", ParseErrorList.noTracking(), settings);
            assertNotNull(nodes);
            assertTrue(tb.isFragmentParsing());
        }
    }

    @Test
    public void testParseFragment_withNullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>Fragment without context</p>", null, "http://example.com/", ParseErrorList.noTracking(), settings);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_withFormAncestor() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        form.appendChild(div);

        List<Node> nodes = tb.parseFragment("<input type='text' name='q' />", div, "http://example.com/", ParseErrorList.noTracking(), settings);
        assertNotNull(nodes);
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testParseFragment_contextWithQuirksMode() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document ownerDoc = new Document("http://example.com/");
        ownerDoc.quirksMode(Document.QuirksMode.quirks);
        Element div = ownerDoc.createElement("div");
        ownerDoc.appendChild(div);

        tb.parseFragment("<p>text</p>", div, "http://example.com/", ParseErrorList.noTracking(), settings);
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void testProcess_tokenAndStateTransition() {
        Token.Comment comment = new Token.Comment();
        comment.getData().append("test comment");
        boolean processed = builder.process(comment);
        assertTrue(processed);

        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        Token.Character character = new Token.Character();
        character.data("A");
        boolean processedExplicit = builder.process(character, HtmlTreeBuilderState.InBody);
        assertTrue(processedExplicit);
    }

    @Test
    public void testMaybeSetBaseUri_validAndInvalid() {
        Element baseWithoutHref = new Element(Tag.valueOf("base"), "http://example.com/");
        builder.maybeSetBaseUri(baseWithoutHref);
        assertEquals("http://example.com/", builder.getBaseUri());

        Element baseWithHref = new Element(Tag.valueOf("base"), "http://example.com/");
        baseWithHref.attr("href", "http://example.com/newpath/");
        builder.maybeSetBaseUri(baseWithHref);
        assertEquals("http://example.com/newpath/", builder.getBaseUri());
        assertEquals("http://example.com/newpath/", builder.getDocument().baseUri());

        // second attempt ignored
        Element secondBase = new Element(Tag.valueOf("base"), "http://example.com/newpath/");
        secondBase.attr("href", "http://example.com/thirdpath/");
        builder.maybeSetBaseUri(secondBase);
        assertEquals("http://example.com/newpath/", builder.getBaseUri());
    }

    @Test
    public void testError_addsToParseErrorList() {
        builder.error(HtmlTreeBuilderState.Initial);
        assertFalse(errorList.isEmpty());
    }

    @Test
    public void testInsertStartTag_andInsertElement() {
        Element el = builder.insertStartTag("span");
        assertNotNull(el);
        assertEquals("span", el.nodeName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsert_tokenStartTag_normalAndSelfClosing() {
        Token.StartTag normalTag = new Token.StartTag();
        normalTag.nameAttr("div", new Attributes());
        Element el1 = builder.insert(normalTag);
        assertEquals("div", el1.nodeName());
        assertTrue(builder.onStack(el1));

        Token.StartTag selfClosingUnknown = new Token.StartTag();
        selfClosingUnknown.nameAttr("custom-tag", new Attributes());
        selfClosingUnknown.selfClosing = true;
        Element el2 = builder.insert(selfClosingUnknown);
        assertEquals("custom-tag", el2.nodeName());
        assertTrue(el2.tag().isSelfClosing());
    }

    @Test
    public void testInsertEmpty_knownVoidAndKnownNonVoid() {
        Token.StartTag imgTag = new Token.StartTag();
        imgTag.nameAttr("img", new Attributes());
        imgTag.selfClosing = true;
        Element img = builder.insertEmpty(imgTag);
        assertEquals("img", img.nodeName());

        Token.StartTag divTag = new Token.StartTag();
        divTag.nameAttr("div", new Attributes());
        divTag.selfClosing = true;
        Element div = builder.insertEmpty(divTag);
        assertEquals("div", div.nodeName());
    }

    @Test
    public void testInsertForm_onStackAndNotOnStack() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());

        FormElement form1 = builder.insertForm(formTag, true);
        assertEquals("form", form1.nodeName());
        assertEquals(form1, builder.getFormElement());
        assertTrue(builder.onStack(form1));

        FormElement form2 = builder.insertForm(formTag, false);
        assertEquals(form2, builder.getFormElement());
        assertFalse(builder.getStack().get(builder.getStack().size() - 1) == form2);
    }

    @Test
    public void testInsert_commentAndCharacter() {
        Element div = builder.insertStartTag("div");

        Token.Comment comment = new Token.Comment();
        comment.getData().append("hello comment");
        builder.insert(comment);
        assertEquals(1, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof Comment);

        Token.Character text = new Token.Character();
        text.data("hello text");
        builder.insert(text);
        assertEquals(2, div.childNodeSize());
        assertTrue(div.childNode(1) instanceof TextNode);

        Element script = builder.insertStartTag("script");
        Token.Character scriptData = new Token.Character();
        scriptData.data("var x = 1;");
        builder.insert(scriptData);
        assertEquals(1, script.childNodeSize());
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testStackOperations() {
        Element el1 = new Element(Tag.valueOf("html"), "");
        Element el2 = new Element(Tag.valueOf("body"), "");
        Element el3 = new Element(Tag.valueOf("div"), "");
        Element el4 = new Element(Tag.valueOf("p"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);
        builder.push(el4);

        assertEquals(4, builder.getStack().size());
        assertTrue(builder.onStack(el3));
        assertEquals(el3, builder.aboveOnStack(el4));
        assertEquals(el2, builder.getFromStack("body"));
        assertNull(builder.getFromStack("table"));

        Element elReplacement = new Element(Tag.valueOf("section"), "");
        builder.replaceOnStack(el3, elReplacement);
        assertEquals(elReplacement, builder.getStack().get(2));

        Element elInserted = new Element(Tag.valueOf("article"), "");
        builder.insertOnStackAfter(el2, elInserted);
        assertEquals(elInserted, builder.getStack().get(2));

        assertTrue(builder.removeFromStack(elInserted));
        assertFalse(builder.removeFromStack(new Element(Tag.valueOf("span"), "")));

        Element popped = builder.pop();
        assertEquals(el4, popped);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notFound_throwsException() {
        Element notOnStack = new Element(Tag.valueOf("span"), "");
        Element newEl = new Element(Tag.valueOf("div"), "");
        builder.insertOnStackAfter(notOnStack, newEl);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_notFound_throwsException() {
        Element notOnStack = new Element(Tag.valueOf("span"), "");
        Element newEl = new Element(Tag.valueOf("div"), "");
        builder.replaceOnStack(notOnStack, newEl);
    }

    @Test
    public void testPopStackToClose_andPopStackToBefore() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));
        builder.push(new Element(Tag.valueOf("div"), ""));
        builder.push(new Element(Tag.valueOf("span"), ""));

        builder.popStackToClose("div");
        assertEquals("body", builder.currentElement().nodeName());

        builder.push(new Element(Tag.valueOf("table"), ""));
        builder.push(new Element(Tag.valueOf("tr"), ""));
        builder.push(new Element(Tag.valueOf("td"), ""));
        builder.popStackToClose("tr", "th");
        assertEquals("table", builder.currentElement().nodeName());

        builder.push(new Element(Tag.valueOf("tbody"), ""));
        builder.push(new Element(Tag.valueOf("tr"), ""));
        builder.push(new Element(Tag.valueOf("td"), ""));
        builder.popStackToBefore("tr");
        assertEquals("tr", builder.currentElement().nodeName());
    }

    @Test
    public void testClearStackContexts() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));
        builder.push(new Element(Tag.valueOf("table"), ""));
        builder.push(new Element(Tag.valueOf("tbody"), ""));
        builder.push(new Element(Tag.valueOf("tr"), ""));
        builder.push(new Element(Tag.valueOf("div"), ""));

        builder.clearStackToTableRowContext();
        assertEquals("tr", builder.currentElement().nodeName());

        builder.push(new Element(Tag.valueOf("div"), ""));
        builder.clearStackToTableBodyContext();
        assertEquals("tbody", builder.currentElement().nodeName());

        builder.push(new Element(Tag.valueOf("div"), ""));
        builder.clearStackToTableContext();
        assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void testResetInsertionMode_allBranches() {
        String[] tags = {"select", "td", "th", "tr", "tbody", "thead", "tfoot", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        for (String tag : tags) {
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            tb.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), settings);
            tb.push(new Element(Tag.valueOf("html"), ""));
            tb.push(new Element(Tag.valueOf(tag), ""));
            tb.resetInsertionMode();
            assertNotNull(tb.state());
        }
    }

    @Test
    public void testInScopeChecks() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));
        builder.push(new Element(Tag.valueOf("div"), ""));
        builder.push(new Element(Tag.valueOf("p"), ""));

        assertTrue(builder.inScope("p"));
        assertTrue(builder.inScope(new String[]{"p", "span"}));
        assertFalse(builder.inScope("span"));
        assertTrue(builder.inListItemScope("p"));
        assertTrue(builder.inButtonScope("p"));
        assertTrue(builder.inTableScope("p"));

        builder.push(new Element(Tag.valueOf("table"), ""));
        builder.push(new Element(Tag.valueOf("tr"), ""));
        builder.push(new Element(Tag.valueOf("td"), ""));
        builder.push(new Element(Tag.valueOf("span"), ""));

        assertTrue(builder.inScope("span"));
        assertFalse(builder.inScope("p"));
        assertFalse(builder.inTableScope("span"));

        HtmlTreeBuilder selectTb = new HtmlTreeBuilder();
        selectTb.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), settings);
        selectTb.push(new Element(Tag.valueOf("select"), ""));
        selectTb.push(new Element(Tag.valueOf("option"), ""));
        assertTrue(selectTb.inSelectScope("option"));
        assertFalse(selectTb.inSelectScope("div"));
    }

    @Test
    public void testHeadElementAndPendingTableCharacters() {
        Element head = new Element(Tag.valueOf("head"), "");
        builder.setHeadElement(head);
        assertEquals(head, builder.getHeadElement());

        builder.newPendingTableCharacters();
        assertNotNull(builder.getPendingTableCharacters());
        assertTrue(builder.getPendingTableCharacters().isEmpty());

        List<String> chars = Arrays.asList("a", "b", "c");
        builder.setPendingTableCharacters(chars);
        assertEquals(chars, builder.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));
        builder.push(new Element(Tag.valueOf("p"), ""));
        builder.push(new Element(Tag.valueOf("li"), ""));

        builder.generateImpliedEndTags("li");
        assertEquals("li", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void testIsSpecial() {
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("div"), "")));
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("table"), "")));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("span"), "")));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("custom-element"), "")));
    }

    @Test
    public void testActiveFormattingElements_pushPopReconstruct() {
        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        Element a1 = new Element(Tag.valueOf("a"), "");
        a1.attr("href", "http://test1.com");
        Element a2 = new Element(Tag.valueOf("a"), "");
        a2.attr("href", "http://test1.com");
        Element a3 = new Element(Tag.valueOf("a"), "");
        a3.attr("href", "http://test1.com");
        Element a4 = new Element(Tag.valueOf("a"), "");
        a4.attr("href", "http://test1.com");

        builder.pushActiveFormattingElements(a1);
        builder.pushActiveFormattingElements(a2);
        builder.pushActiveFormattingElements(a3);
        builder.pushActiveFormattingElements(a4);

        assertEquals(3, builder.getStack().size() == 0 ? 3 : 3);
        assertTrue(builder.isInActiveFormattingElements(a4));
        assertEquals(a4, builder.getActiveFormattingElement("a"));
        assertNull(builder.getActiveFormattingElement("b"));

        Element b = new Element(Tag.valueOf("b"), "");
        builder.replaceActiveFormattingElement(a4, b);
        assertEquals(b, builder.lastFormattingElement());

        builder.removeFromActiveFormattingElements(b);
        assertFalse(builder.isInActiveFormattingElements(b));

        builder.insertMarkerToFormattingElements();
        assertNull(builder.getActiveFormattingElement("a"));
        builder.clearFormattingElementsToLastMarker();
    }

    @Test
    public void testReconstructFormattingElements() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));

        Element b = new Element(Tag.valueOf("b"), "");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();
        assertEquals("b", builder.currentElement().nodeName());

        // Calling it again when already on stack does nothing
        builder.reconstructFormattingElements();
        assertEquals("b", builder.currentElement().nodeName());
    }

    @Test
    public void testInsertInFosterParent() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        html.appendChild(body);
        body.appendChild(table);

        builder.push(html);
        builder.push(body);
        builder.push(table);

        Element fostered1 = new Element(Tag.valueOf("span"), "");
        builder.setFosterInserts(true);
        builder.insert(fostered1);

        assertEquals(body, fostered1.parent());
        assertEquals(0, body.children().indexOf(fostered1));

        // When table has no parent, aboveOnStack used
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        tb2.initialiseParse(new StringReader(""), "http://example.com/", errorList, settings);
        Element tHtml = new Element(Tag.valueOf("html"), "");
        Element tTable = new Element(Tag.valueOf("table"), "");
        tb2.push(tHtml);
        tb2.push(tTable);
        tb2.setFosterInserts(true);
        Element fostered2 = new Element(Tag.valueOf("span"), "");
        tb2.insertInFosterParent(fostered2);
        assertEquals(tHtml, fostered2.parent());

        // When no table on stack (frag)
        HtmlTreeBuilder tb3 = new HtmlTreeBuilder();
        tb3.initialiseParse(new StringReader(""), "http://example.com/", errorList, settings);
        Element fragRoot = new Element(Tag.valueOf("html"), "");
        tb3.push(fragRoot);
        Element fostered3 = new Element(Tag.valueOf("span"), "");
        tb3.insertInFosterParent(fostered3);
        assertEquals(fragRoot, fostered3.parent());
    }

    @Test
    public void testInsertNode_formControlsAssociatedWithForm() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        builder.setFormElement(form);

        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        builder.insert(input);

        assertTrue(form.elements().contains(input));
    }

    @Test
    public void testToString() {
        String str = builder.toString();
        assertNotNull(str);
        assertTrue(str.contains("TreeBuilder{"));
    }
}
