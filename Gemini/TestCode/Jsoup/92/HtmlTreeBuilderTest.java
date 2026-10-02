package org.jsoup.parser;

import org.jsoup.Jsoup;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;
    private Parser parser;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);
    }

    @Test
    public void testDefaultSettings_returnsHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void testInitialiseParse_resetsAllFields() {
        builder.initialiseParse(new StringReader("<div></div>"), "http://example.com/base/", parser);
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertNull(builder.getHeadElement());
        assertNull(builder.getFormElement());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFosterInserts());
        assertFalse(builder.isFragmentParsing());
        assertNotNull(builder.getPendingTableCharacters());
        assertTrue(builder.getPendingTableCharacters().isEmpty());
        assertEquals("http://example.com/base/", builder.getBaseUri());
    }

    @Test
    public void testParseFragment_nullContext() {
        List<Node> nodes = builder.parseFragment("<p>One</p><p>Two</p>", null, "http://example.com/", parser);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void testParseFragment_rcdataContext() {
        Element titleContext = new Element(Tag.valueOf("title"), "http://example.com/");
        List<Node> nodes = builder.parseFragment("Hello <b>world</b>", titleContext, "http://example.com/", parser);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof TextNode);
    }

    @Test
    public void testParseFragment_rawtextContext() {
        String[] tags = new String[]{"iframe", "noembed", "noframes", "style", "xmp"};
        for (String tag : tags) {
            Element ctx = new Element(Tag.valueOf(tag), "http://example.com/");
            List<Node> nodes = builder.parseFragment("var x = 1;", ctx, "http://example.com/", parser);
            assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragment_scriptContext() {
        Element scriptContext = new Element(Tag.valueOf("script"), "http://example.com/");
        List<Node> nodes = builder.parseFragment("console.log('test');", scriptContext, "http://example.com/", parser);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof DataNode);
    }

    @Test
    public void testParseFragment_noscriptAndPlaintextContext() {
        Element noscript = new Element(Tag.valueOf("noscript"), "http://example.com/");
        List<Node> nodes = builder.parseFragment("plain text", noscript, "http://example.com/", parser);
        assertNotNull(nodes);

        Element plaintext = new Element(Tag.valueOf("plaintext"), "http://example.com/");
        nodes = builder.parseFragment("plain text", plaintext, "http://example.com/", parser);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_withFormAncestorChain() {
        Document doc = Jsoup.parse("<div><form id='f1'><div id='inner'></div></form></div>");
        doc.quirksMode(Document.QuirksMode.quirks);
        Element inner = doc.selectFirst("#inner");
        assertNotNull(inner);

        List<Node> nodes = builder.parseFragment("<input type='text'>", inner, "http://example.com/", parser);
        assertNotNull(nodes);
        assertNotNull(builder.getFormElement());
        assertEquals("f1", builder.getFormElement().id());
    }

    @Test
    public void testProcess_normalToken() {
        Token.Comment comment = new Token.Comment();
        comment.getData().append("hello comment");
        boolean processed = builder.process(comment);
        assertTrue(processed);
    }

    @Test
    public void testProcess_withExplicitState() {
        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment in body");
        boolean processed = builder.process(comment, HtmlTreeBuilderState.InBody);
        assertTrue(processed);
    }

    @Test
    public void testTransition_and_markInsertionMode() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InTable);
        assertEquals(HtmlTreeBuilderState.InTable, builder.state());
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testFramesetOk_toggle() {
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());
    }

    @Test
    public void testGetDocument_returnsDoc() {
        assertNotNull(builder.getDocument());
    }

    @Test
    public void testMaybeSetBaseUri_validHrefAndSubsequentIgnored() {
        Element base1 = new Element(Tag.valueOf("base"), "http://example.com/");
        base1.attr("href", "http://example.com/sub/");
        builder.maybeSetBaseUri(base1);
        assertEquals("http://example.com/sub/", builder.getBaseUri());

        Element base2 = new Element(Tag.valueOf("base"), "http://example.com/");
        base2.attr("href", "http://example.com/another/");
        builder.maybeSetBaseUri(base2);
        assertEquals("http://example.com/sub/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHrefIgnored() {
        String initialBase = builder.getBaseUri();
        Element base = new Element(Tag.valueOf("base"), "");
        base.attr("target", "_blank");
        builder.maybeSetBaseUri(base);
        assertEquals(initialBase, builder.getBaseUri());
    }

    @Test
    public void testError_withErrorTrackingEnabled() {
        parser.setTrackErrors(10);
        builder.process(new Token.EndTag().name("div"));
        builder.error(HtmlTreeBuilderState.Initial);
        assertEquals(1, parser.getErrors().size());
    }

    @Test
    public void testInsert_startTagNormalAndSelfClosing() {
        Token.StartTag normalTag = new Token.StartTag();
        normalTag.nameAttr("div", new Attributes());
        Element el = builder.insert(normalTag);
        assertNotNull(el);
        assertEquals("div", el.normalName());
        assertTrue(builder.onStack(el));

        Token.StartTag selfClosing = new Token.StartTag();
        selfClosing.nameAttr("custom-element", new Attributes());
        selfClosing.selfClosing = true;
        Element selfClosingEl = builder.insert(selfClosing);
        assertNotNull(selfClosingEl);
        assertEquals("custom-element", selfClosingEl.normalName());
    }

    @Test
    public void testInsertStartTag_byName() {
        Element el = builder.insertStartTag("span");
        assertNotNull(el);
        assertEquals("span", el.normalName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertEmpty_knownAndVoidAndUnknown() {
        Token.StartTag imgTag = new Token.StartTag();
        imgTag.nameAttr("img", new Attributes());
        imgTag.selfClosing = true;
        Element imgEl = builder.insertEmpty(imgTag);
        assertEquals("img", imgEl.normalName());

        Token.StartTag divTag = new Token.StartTag();
        divTag.nameAttr("div", new Attributes());
        divTag.selfClosing = true;
        Element divEl = builder.insertEmpty(divTag);
        assertEquals("div", divEl.normalName());

        Token.StartTag unknownTag = new Token.StartTag();
        unknownTag.nameAttr("my-tag", new Attributes());
        unknownTag.selfClosing = true;
        Element unknownEl = builder.insertEmpty(unknownTag);
        assertEquals("my-tag", unknownEl.normalName());
        assertTrue(unknownEl.tag().isSelfClosing());
    }

    @Test
    public void testInsertForm_onStackAndNotOnStack() {
        Token.StartTag formTag1 = new Token.StartTag();
        formTag1.nameAttr("form", new Attributes());
        FormElement f1 = builder.insertForm(formTag1, true);
        assertNotNull(f1);
        assertEquals(f1, builder.getFormElement());
        assertTrue(builder.onStack(f1));

        Token.StartTag formTag2 = new Token.StartTag();
        formTag2.nameAttr("form", new Attributes());
        FormElement f2 = builder.insertForm(formTag2, false);
        assertEquals(f2, builder.getFormElement());
        assertFalse(builder.onStack(f2));
    }

    @Test
    public void testInsert_commentAndCharacterVariants() {
        Element body = builder.insertStartTag("body");

        Token.Comment comment = new Token.Comment();
        comment.getData().append("A comment");
        builder.insert(comment);
        assertEquals(1, body.childNodeSize());
        assertTrue(body.childNode(0) instanceof Comment);

        Token.Character textChar = new Token.Character();
        textChar.data("Hello text");
        builder.insert(textChar);
        assertTrue(body.childNode(1) instanceof TextNode);

        Token.Character cdataChar = new Token.CData("CData text");
        builder.insert(cdataChar);
        assertTrue(body.childNode(2) instanceof CDataNode);

        Element script = builder.insertStartTag("script");
        Token.Character scriptChar = new Token.Character();
        scriptChar.data("var x = 10;");
        builder.insert(scriptChar);
        assertEquals(1, script.childNodeSize());
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertNode_formListedElementAssociatedWithForm() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.nameAttr("input", new Attributes());
        Element inputEl = builder.insert(inputTag);

        assertTrue(form.elements().contains(inputEl));
    }

    @Test
    public void testStackOperations() {
        Element el1 = new Element(Tag.valueOf("html"), "");
        Element el2 = new Element(Tag.valueOf("body"), "");
        Element el3 = new Element(Tag.valueOf("div"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);

        assertEquals(3, builder.getStack().size());
        assertTrue(builder.onStack(el2));
        assertEquals(el3, builder.currentElement());

        Element popped = builder.pop();
        assertEquals(el3, popped);
        assertFalse(builder.onStack(el3));

        assertEquals(el2, builder.getFromStack("body"));
        assertNull(builder.getFromStack("nonexistent"));

        assertEquals(el1, builder.aboveOnStack(el2));
        assertNull(builder.aboveOnStack(el1));

        Element elInserted = new Element(Tag.valueOf("p"), "");
        builder.insertOnStackAfter(el1, elInserted);
        assertEquals(1, builder.getStack().indexOf(elInserted));

        Element elReplaced = new Element(Tag.valueOf("section"), "");
        builder.replaceOnStack(elInserted, elReplaced);
        assertEquals(1, builder.getStack().indexOf(elReplaced));
        assertFalse(builder.onStack(elInserted));

        assertTrue(builder.removeFromStack(elReplaced));
        assertFalse(builder.removeFromStack(elInserted));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notFoundThrowsException() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        builder.insertOnStackAfter(el1, el2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_notFoundThrowsException() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        builder.replaceOnStack(el1, el2);
    }

    @Test
    public void testPopStackToClose_singleAndArray() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element p = builder.insertStartTag("p");
        Element span = builder.insertStartTag("span");

        builder.popStackToClose("p");
        assertFalse(builder.onStack(span));
        assertFalse(builder.onStack(p));
        assertTrue(builder.onStack(body));
        assertTrue(builder.onStack(html));

        builder.insertStartTag("div");
        builder.insertStartTag("b");
        // Pop to close any of the sorted array
        builder.popStackToClose(new String[]{"b", "div"});
        assertFalse(builder.onStack(builder.getFromStack("b")));
    }

    @Test
    public void testPopStackToBefore() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");
        Element span = builder.insertStartTag("span");

        builder.popStackToBefore("div");
        assertTrue(builder.onStack(html));
        assertTrue(builder.onStack(body));
        assertTrue(builder.onStack(div));
        assertFalse(builder.onStack(span));
    }

    @Test
    public void testClearStackToContexts() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableRowContext();
        assertEquals("tr", builder.currentElement().normalName());

        builder.insertStartTag("td");
        builder.clearStackToTableBodyContext();
        assertEquals("tbody", builder.currentElement().normalName());

        builder.insertStartTag("tr");
        builder.clearStackToTableContext();
        assertEquals("table", builder.currentElement().normalName());
    }

    @Test
    public void testResetInsertionMode_variousElements() {
        String[] tags = new String[]{
                "select", "td", "th", "tr", "tbody", "thead", "tfoot",
                "caption", "colgroup", "table", "head", "body", "frameset", "html"
        };
        HtmlTreeBuilderState[] expectedStates = new HtmlTreeBuilderState[]{
                HtmlTreeBuilderState.InSelect, HtmlTreeBuilderState.InCell, HtmlTreeBuilderState.InCell,
                HtmlTreeBuilderState.InRow, HtmlTreeBuilderState.InTableBody, HtmlTreeBuilderState.InTableBody,
                HtmlTreeBuilderState.InTableBody, HtmlTreeBuilderState.InCaption, HtmlTreeBuilderState.InColumnGroup,
                HtmlTreeBuilderState.InTable, HtmlTreeBuilderState.InBody, HtmlTreeBuilderState.InBody,
                HtmlTreeBuilderState.InFrameset, HtmlTreeBuilderState.BeforeHead
        };

        for (int i = 0; i < tags.length; i++) {
            builder.getStack().clear();
            builder.push(new Element(Tag.valueOf("html"), ""));
            builder.push(new Element(Tag.valueOf(tags[i]), ""));
            builder.resetInsertionMode();
            assertEquals("Failed for tag: " + tags[i], expectedStates[i], builder.state());
        }
    }

    @Test
    public void testResetInsertionMode_lastElementFallback() {
        builder.getStack().clear();
        Element custom = new Element(Tag.valueOf("custom-tag"), "");
        builder.push(custom);
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void testInScopeVariants() {
        builder.getStack().clear();
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        builder.insertStartTag("p");
        builder.insertStartTag("span");

        assertTrue(builder.inScope("p"));
        assertTrue(builder.inScope("span"));
        assertTrue(builder.inScope(new String[]{"p", "div"}));
        assertFalse(builder.inScope("body"));

        assertTrue(builder.inTableScope("table"));
        assertFalse(builder.inTableScope("p"));

        builder.insertStartTag("button");
        builder.insertStartTag("b");
        assertTrue(builder.inButtonScope("button"));
        assertFalse(builder.inButtonScope("table"));

        builder.insertStartTag("ul");
        builder.insertStartTag("li");
        assertTrue(builder.inListItemScope("li"));

        builder.getStack().clear();
        builder.insertStartTag("select");
        builder.insertStartTag("option");
        assertTrue(builder.inSelectScope("option"));
        assertFalse(builder.inSelectScope("div"));
    }

    @Test
    public void testInScope_depthBeyondMaxScopeSearchDepth() {
        builder.getStack().clear();
        builder.insertStartTag("html");
        for (int i = 0; i < HtmlTreeBuilder.MaxScopeSearchDepth + 10; i++) {
            builder.insertStartTag("div");
        }
        builder.insertStartTag("span");
        assertTrue(builder.inScope("span"));
        assertFalse(builder.inScope("html"));
    }

    @Test
    public void testHeadElement_getterSetter() {
        Element head = new Element(Tag.valueOf("head"), "");
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());
    }

    @Test
    public void testFosterInserts_getterSetterAndExecution() {
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());

        builder.getStack().clear();
        Element doc = builder.getDocument();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");

        TextNode textInFoster = new TextNode("Fostered Text");
        builder.insertInFosterParent(textInFoster);

        assertEquals(table.parent(), textInFoster.parent());
        assertEquals(0, body.childNodes().indexOf(textInFoster));

        // When table has no parent (detached from tree, only on stack)
        Element detachedTable = new Element(Tag.valueOf("table"), "");
        builder.push(detachedTable);
        TextNode textAbove = new TextNode("Above on stack text");
        builder.insertInFosterParent(textAbove);

        // When no table is present on stack
        builder.getStack().clear();
        builder.push(html);
        TextNode textRoot = new TextNode("Root foster text");
        builder.insertInFosterParent(textRoot);
        assertEquals(html, textRoot.parent());
    }

    @Test
    public void testPendingTableCharacters() {
        builder.newPendingTableCharacters();
        List<String> chars = builder.getPendingTableCharacters();
        assertNotNull(chars);
        chars.add("char1");
        assertEquals(1, builder.getPendingTableCharacters().size());
        assertEquals("char1", builder.getPendingTableCharacters().get(0));
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("span");
        builder.insertStartTag("li");

        builder.generateImpliedEndTags("p");
        assertFalse(builder.onStack(builder.getFromStack("li")));

        builder.insertStartTag("dd");
        builder.generateImpliedEndTags();
        assertNull(builder.getFromStack("dd"));
    }

    @Test
    public void testIsSpecial() {
        for (String specialTag : HtmlTreeBuilder.TagSearchSpecial) {
            Element el = new Element(Tag.valueOf(specialTag), "");
            assertTrue("Expected special for tag: " + specialTag, builder.isSpecial(el));
        }
        Element nonSpecial = new Element(Tag.valueOf("span"), "");
        assertFalse(builder.isSpecial(nonSpecial));
        Element customTag = new Element(Tag.valueOf("custom-element"), "");
        assertFalse(builder.isSpecial(customTag));
    }

    @Test
    public void testActiveFormattingElements_pushLimitThreeAndReplacement() {
        Element a1 = new Element(Tag.valueOf("a"), "");
        a1.attr("href", "http://example.com");
        Element a2 = new Element(Tag.valueOf("a"), "");
        a2.attr("href", "http://example.com");
        Element a3 = new Element(Tag.valueOf("a"), "");
        a3.attr("href", "http://example.com");
        Element a4 = new Element(Tag.valueOf("a"), "");
        a4.attr("href", "http://example.com");

        builder.pushActiveFormattingElements(a1);
        builder.pushActiveFormattingElements(a2);
        builder.pushActiveFormattingElements(a3);
        assertTrue(builder.isInActiveFormattingElements(a1));

        builder.pushActiveFormattingElements(a4);
        assertFalse(builder.isInActiveFormattingElements(a1));
        assertTrue(builder.isInActiveFormattingElements(a4));
        assertEquals(a4, builder.lastFormattingElement());

        Element removed = builder.removeLastFormattingElement();
        assertEquals(a4, removed);

        Element b = new Element(Tag.valueOf("b"), "");
        builder.pushActiveFormattingElements(b);
        assertEquals(b, builder.getActiveFormattingElement("b"));
        assertNull(builder.getActiveFormattingElement("i"));

        Element bReplacement = new Element(Tag.valueOf("b"), "");
        bReplacement.attr("id", "replaced");
        builder.replaceActiveFormattingElement(b, bReplacement);
        assertTrue(builder.isInActiveFormattingElements(bReplacement));
        assertFalse(builder.isInActiveFormattingElements(b));

        builder.removeFromActiveFormattingElements(bReplacement);
        assertFalse(builder.isInActiveFormattingElements(bReplacement));
    }

    @Test
    public void testActiveFormattingElements_markers() {
        builder.pushActiveFormattingElements(new Element(Tag.valueOf("b"), ""));
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(new Element(Tag.valueOf("i"), ""));

        assertNull(builder.getActiveFormattingElement("b")); // blocked by marker

        builder.clearFormattingElementsToLastMarker();
        assertNull(builder.lastFormattingElement() != null && builder.lastFormattingElement().normalName().equals("i") ? builder.lastFormattingElement() : null);
        assertNotNull(builder.getActiveFormattingElement("b"));
    }

    @Test
    public void testReconstructFormattingElements() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b"), "");
        b.attr("class", "boldClass");
        builder.pushActiveFormattingElements(b);

        Element i = new Element(Tag.valueOf("i"), "");
        builder.pushActiveFormattingElements(i);

        builder.reconstructFormattingElements();

        assertTrue(builder.onStack(builder.getFromStack("b")));
        assertTrue(builder.onStack(builder.getFromStack("i")));
        assertEquals("boldClass", builder.getFromStack("b").attr("class"));

        // Second call should be a no-op because last formatting element is on stack
        builder.reconstructFormattingElements();
    }

    @Test
    public void testRemoveLastFormattingElement_emptyReturnsNull() {
        assertNull(builder.removeLastFormattingElement());
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void testToString_notNullAndContainsEssentialInfo() {
        String str = builder.toString();
        assertNotNull(str);
        assertTrue(str.contains("TreeBuilder{"));
        assertTrue(str.contains("state="));
    }
}
