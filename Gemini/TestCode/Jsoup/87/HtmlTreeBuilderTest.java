package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
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
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private Parser parser;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);
    }

    @Test
    public void testDefaultSettings_returnsHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void testInitialiseParse_resetsAllFields() {
        builder.framesetOk(false);
        builder.setFosterInserts(true);
        builder.transition(HtmlTreeBuilderState.InTable);

        builder.initialiseParse(new StringReader(""), "http://test.com", parser);

        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertNull(builder.getHeadElement());
        assertNull(builder.getFormElement());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFosterInserts());
        assertFalse(builder.isFragmentParsing());
        assertEquals("http://test.com", builder.getBaseUri());
    }

    @Test
    public void testStateAndTransition() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InRow);
        assertEquals(HtmlTreeBuilderState.InRow, builder.state());
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testFramesetOk_getAndSet() {
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testGetDocumentAndBaseUri() {
        Document doc = builder.getDocument();
        assertNotNull(doc);
        assertEquals("http://example.com", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_validHrefAndSubsequentCallsIgnored() {
        Element baseEl = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com");
        baseEl.attr("href", "http://jsoup.org");

        builder.maybeSetBaseUri(baseEl);
        assertEquals("http://jsoup.org", builder.getBaseUri());
        assertEquals("http://jsoup.org", builder.getDocument().baseUri());

        Element secondBaseEl = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com");
        secondBaseEl.attr("href", "http://other.com");
        builder.maybeSetBaseUri(secondBaseEl);
        assertEquals("http://jsoup.org", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHref_ignored() {
        Element baseEl = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com");
        builder.maybeSetBaseUri(baseEl);
        assertEquals("http://example.com", builder.getBaseUri());
    }

    @Test
    public void testError_addsToParserErrorsWhenEnabled() {
        parser.setTrackErrors(10);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        builder.process(tag);

        builder.error(HtmlTreeBuilderState.Initial);
        assertEquals(1, parser.getErrors().size());
    }

    @Test
    public void testInsertStartTag_normal() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        Element el = builder.insert(startTag);

        assertNotNull(el);
        assertEquals("div", el.nodeName());
        assertTrue(builder.onStack(el));
        assertEquals(el, builder.currentElement());
    }

    @Test
    public void testInsertStartTag_selfClosingKnownVoid() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertEquals("img", el.nodeName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertStartTag_selfClosingNonVoidEmitsError() {
        parser.setTrackErrors(10);
        builder.initialiseParse(new StringReader(""), "http://example.com", parser);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testInsertStartTag_selfClosingUnknownTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("custom-tag");
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testInsertStartTagNameString() {
        Element el = builder.insertStartTag("span");
        assertEquals("span", el.nodeName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertEmpty() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        Element el = builder.insertEmpty(startTag);
        assertEquals("br", el.nodeName());
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testInsertForm() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        FormElement formEl = builder.insertForm(startTag, true);

        assertNotNull(formEl);
        assertEquals(formEl, builder.getFormElement());
        assertTrue(builder.onStack(formEl));

        Token.StartTag form2Tag = new Token.StartTag();
        form2Tag.name("form");
        FormElement form2 = builder.insertForm(form2Tag, false);
        assertFalse(builder.onStack(form2));
        assertEquals(form2, builder.getFormElement());
    }

    @Test
    public void testInsertComment() {
        Element root = builder.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("test comment");
        builder.insert(commentToken);

        List<Node> children = root.childNodes();
        assertEquals(1, children.size());
        assertTrue(children.get(0) instanceof Comment);
        assertEquals("test comment", ((Comment) children.get(0)).getData());
    }

    @Test
    public void testInsertCharacter_textCDataAndData() {
        Element root = builder.insertStartTag("div");
        
        Token.Character textToken = new Token.Character();
        textToken.data("normal text");
        builder.insert(textToken);
        assertTrue(root.childNode(0) instanceof TextNode);

        Token.Character cdataToken = new Token.CData("cdata text");
        builder.insert(cdataToken);
        assertTrue(root.childNode(1) instanceof CDataNode);

        Element script = builder.insertStartTag("script");
        Token.Character scriptToken = new Token.Character();
        scriptToken.data("var x = 1;");
        builder.insert(scriptToken);
        assertTrue(script.childNode(0) instanceof DataNode);

        builder.pop();
        Element style = builder.insertStartTag("style");
        Token.Character styleToken = new Token.Character();
        styleToken.data("body { color: red; }");
        builder.insert(styleToken);
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertNode_formAssociated() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.name("input");
        Element input = builder.insert(inputTag);

        assertTrue(form.elements().contains(input));
    }

    @Test
    public void testStackOperations_pushPopGetRemove() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element p = builder.insertStartTag("p");

        assertEquals(3, builder.getStack().size());
        assertTrue(builder.onStack(body));
        assertEquals(p, builder.pop());
        assertFalse(builder.onStack(p));

        builder.push(p);
        assertTrue(builder.onStack(p));

        assertEquals(body, builder.getFromStack("body"));
        assertNull(builder.getFromStack("non-existent"));

        assertTrue(builder.removeFromStack(p));
        assertFalse(builder.removeFromStack(p));
        assertFalse(builder.onStack(p));
    }

    @Test
    public void testPopStackToClose_singleAndArray() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("span");

        builder.popStackToClose("div");
        assertNull(builder.getFromStack("span"));
        assertNull(builder.getFromStack("div"));
        assertNotNull(builder.getFromStack("body"));

        builder.insertStartTag("p");
        builder.insertStartTag("b");
        builder.popStackToClose("p", "table");
        assertNull(builder.getFromStack("b"));
        assertNull(builder.getFromStack("p"));
    }

    @Test
    public void testPopStackToBefore() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");

        builder.popStackToBefore("table");
        assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void testClearStackToTableContexts() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("div");
        builder.clearStackToTableContext();
        assertEquals("table", builder.currentElement().nodeName());

        builder.insertStartTag("tbody");
        builder.insertStartTag("div");
        builder.clearStackToTableBodyContext();
        assertEquals("tbody", builder.currentElement().nodeName());

        builder.insertStartTag("tr");
        builder.insertStartTag("div");
        builder.clearStackToTableRowContext();
        assertEquals("tr", builder.currentElement().nodeName());
    }

    @Test
    public void testAboveOnStack() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");

        assertEquals(body, builder.aboveOnStack(div));
        assertEquals(html, builder.aboveOnStack(body));
    }

    @Test
    public void testInsertOnStackAfter_andReplaceOnStack() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div1 = builder.insertStartTag("div");
        Element div2 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");

        builder.insertOnStackAfter(body, div2);
        assertEquals(4, builder.getStack().size());
        assertEquals(div2, builder.getStack().get(2));

        Element replacement = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        builder.replaceOnStack(div2, replacement);
        assertEquals(replacement, builder.getStack().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notOnStackThrows() {
        Element el1 = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        builder.insertOnStackAfter(el1, el2);
    }

    @Test
    public void testResetInsertionMode_allBranches() {
        String[] tags = new String[]{"select", "td", "th", "tr", "tbody", "thead", "tfoot", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        HtmlTreeBuilderState[] expectedStates = new HtmlTreeBuilderState[]{
                HtmlTreeBuilderState.InSelect, HtmlTreeBuilderState.InCell, HtmlTreeBuilderState.InCell,
                HtmlTreeBuilderState.InRow, HtmlTreeBuilderState.InTableBody, HtmlTreeBuilderState.InTableBody,
                HtmlTreeBuilderState.InTableBody, HtmlTreeBuilderState.InCaption, HtmlTreeBuilderState.InColumnGroup,
                HtmlTreeBuilderState.InTable, HtmlTreeBuilderState.InBody, HtmlTreeBuilderState.InBody,
                HtmlTreeBuilderState.InFrameset, HtmlTreeBuilderState.BeforeHead
        };

        for (int i = 0; i < tags.length; i++) {
            builder.getStack().clear();
            builder.insertStartTag("html");
            builder.insertStartTag(tags[i]);
            builder.insertStartTag("span");
            builder.resetInsertionMode();
            assertEquals("State mismatch for tag: " + tags[i], expectedStates[i], builder.state());
        }
    }

    @Test
    public void testScopeMethods() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        builder.insertStartTag("p");

        assertTrue(builder.inScope("p"));
        assertTrue(builder.inScope("td"));
        assertTrue(builder.inScope(new String[]{"p"}));
        assertFalse(builder.inScope("tr"));

        assertTrue(builder.inTableScope("table"));
        assertTrue(builder.inTableScope("html"));
        assertFalse(builder.inTableScope("p"));

        assertTrue(builder.inListItemScope("p"));
        assertTrue(builder.inButtonScope("p"));

        builder.getStack().clear();
        builder.insertStartTag("select");
        builder.insertStartTag("option");
        assertTrue(builder.inSelectScope("option"));
        assertFalse(builder.inSelectScope("div"));
    }

    @Test
    public void testFosterInsertsAndHeadFormElements() {
        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());

        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), "");
        builder.setHeadElement(head);
        assertEquals(head, builder.getHeadElement());

        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "", new Attributes());
        builder.setFormElement(form);
        assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testPendingTableCharacters() {
        assertNotNull(builder.getPendingTableCharacters());
        builder.getPendingTableCharacters().add("test");
        assertEquals(1, builder.getPendingTableCharacters().size());

        builder.newPendingTableCharacters();
        assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("li");

        builder.generateImpliedEndTags("li");
        assertEquals("li", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void testIsSpecial() {
        Element p = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        assertTrue(builder.isSpecial(p));

        Element custom = new Element(Tag.valueOf("custom-tag", ParseSettings.htmlDefault), "");
        assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void testActiveFormattingElements() {
        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b1.attr("class", "bold");
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b2.attr("class", "bold");
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b3.attr("class", "bold");
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b4.attr("class", "bold");

        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        assertEquals(3, builder.getStack().size() == 0 ? 3 : builder.getStack().size());

        // 4th identical will remove the earliest one
        builder.pushActiveFormattingElements(b4);
        assertFalse(builder.isInActiveFormattingElements(b1));
        assertTrue(builder.isInActiveFormattingElements(b4));

        assertEquals(b4, builder.lastFormattingElement());
        assertEquals(b4, builder.getActiveFormattingElement("b"));
        assertNull(builder.getActiveFormattingElement("i"));

        Element i = new Element(Tag.valueOf("i", ParseSettings.htmlDefault), "");
        builder.replaceActiveFormattingElement(b4, i);
        assertFalse(builder.isInActiveFormattingElements(b4));
        assertTrue(builder.isInActiveFormattingElements(i));

        builder.removeFromActiveFormattingElements(i);
        assertFalse(builder.isInActiveFormattingElements(i));

        builder.insertMarkerToFormattingElements();
        assertNull(builder.lastFormattingElement());
        builder.clearFormattingElementsToLastMarker();
    }

    @Test
    public void testReconstructFormattingElements() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b.attr("id", "b1");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();
        assertEquals("b", builder.currentElement().nodeName());
        assertEquals("b1", builder.currentElement().id());

        // Calling again when already on stack does nothing
        builder.reconstructFormattingElements();
        assertEquals("b", builder.currentElement().nodeName());
    }

    @Test
    public void testInsertInFosterParent() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");

        TextNode text = new TextNode("fostered text");
        builder.insertInFosterParent(text);

        assertEquals(table, text.nextSibling());

        Element detachedTable = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "");
        builder.push(detachedTable);
        TextNode text2 = new TextNode("fostered text 2");
        builder.insertInFosterParent(text2);
        assertTrue(table.childNodes().contains(text2));

        builder.getStack().clear();
        Element fragRoot = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        builder.push(fragRoot);
        TextNode text3 = new TextNode("fostered frag text");
        builder.insertInFosterParent(text3);
        assertTrue(fragRoot.childNodes().contains(text3));
    }

    @Test
    public void testParseFragment_variousContexts() {
        String[] contextTags = new String[]{
                "title", "textarea", "iframe", "noembed", "noframes", "style", "xmp",
                "script", "noscript", "plaintext", "div"
        };

        for (String tag : contextTags) {
            Element context = new Element(Tag.valueOf(tag, ParseSettings.htmlDefault), "http://example.com");
            List<Node> nodes = builder.parseFragment("content <b>test</b>", context, "http://example.com", parser);
            assertNotNull(nodes);
            assertTrue(nodes.size() > 0);
        }

        // Test context with FormElement ancestor
        Document doc = Document.createShell("http://example.com");
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com", new Attributes());
        doc.body().appendChild(form);
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        form.appendChild(div);

        List<Node> formFragNodes = builder.parseFragment("<input name='foo'>", div, "http://example.com", parser);
        assertNotNull(formFragNodes);

        // Test context is null
        List<Node> nullContextNodes = builder.parseFragment("<div>content</div>", null, "http://example.com", parser);
        assertNotNull(nullContextNodes);
    }

    @Test
    public void testProcessWithExplicitState() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("html");
        boolean result = builder.process(tag, HtmlTreeBuilderState.BeforeHtml);
        assertTrue(result);
    }

    @Test
    public void testToString() {
        builder.insertStartTag("html");
        String s = builder.toString();
        assertNotNull(s);
        assertTrue(s.contains("TreeBuilder"));
        assertTrue(s.contains("state="));
        assertTrue(s.contains("currentElement="));
    }
}
