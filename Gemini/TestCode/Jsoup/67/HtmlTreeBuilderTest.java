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
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
    }

    private void initBuilder(String html) {
        builder.initialiseParse(new StringReader(html), "http://example.com/", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
    }

    @Test
    public void testDefaultSettings_returnsHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
        assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void testInitialiseParse_resetsAllFields() {
        initBuilder("<div>test</div>");
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertNull(builder.originalState());
        assertNull(builder.getHeadElement());
        assertNull(builder.getFormElement());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFosterInserts());
        assertFalse(builder.isFragmentParsing());
        assertNotNull(builder.getDocument());
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testStateTransitionsAndMark() {
        initBuilder("");
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InTable);
        assertEquals(HtmlTreeBuilderState.InTable, builder.state());
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testFramesetOk_getAndSet() {
        initBuilder("");
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testMaybeSetBaseUri_validHrefAndDuplicateCall() {
        initBuilder("");
        Element baseEl = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        baseEl.attr("href", "http://example.com/subpath/");

        builder.maybeSetBaseUri(baseEl);
        assertEquals("http://example.com/subpath/", builder.getBaseUri());
        assertEquals("http://example.com/subpath/", builder.getDocument().baseUri());

        // Second call should be ignored because baseUriSetFromDoc is true
        Element baseEl2 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        baseEl2.attr("href", "http://other.org/");
        builder.maybeSetBaseUri(baseEl2);
        assertEquals("http://example.com/subpath/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHrefIgnored() {
        initBuilder("");
        Element baseEl = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        builder.maybeSetBaseUri(baseEl);
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testErrorTracking() {
        ParseErrorList errors = ParseErrorList.tracking(2);
        builder.initialiseParse(new StringReader(""), "http://example.com/", errors, ParseSettings.htmlDefault);
        
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        builder.process(tag, HtmlTreeBuilderState.Initial);

        builder.error(HtmlTreeBuilderState.Initial);
        assertEquals(1, errors.size());
    }

    @Test
    public void testProcessToken_delegatesToState() {
        initBuilder("");
        Token.Comment comment = new Token.Comment();
        comment.getData().append("hello");
        boolean handled = builder.process(comment);
        assertTrue(handled);
        assertEquals(1, builder.getDocument().childNodeSize());
    }

    @Test
    public void testInsertStartTag_normal() {
        initBuilder("");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("div", new Attributes());
        Element el = builder.insert(startTag);

        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertStartTag_selfClosingKnownNonVoid() {
        initBuilder("");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("div", new Attributes());
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertEquals("div", el.tagName());
    }

    @Test
    public void testInsertStartTag_selfClosingUnknown() {
        initBuilder("");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("custom-element", new Attributes());
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        assertNotNull(el);
        assertEquals("custom-element", el.tagName());
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testInsertStartTagName_string() {
        initBuilder("");
        Element el = builder.insertStartTag("span");
        assertNotNull(el);
        assertEquals("span", el.tagName());
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertEmpty_knownVoidTag() {
        initBuilder("");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("img", new Attributes());
        startTag.selfClosing = true;

        Element el = builder.insertEmpty(startTag);
        assertNotNull(el);
        assertEquals("img", el.tagName());
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testInsertForm() {
        initBuilder("");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("form", new Attributes());

        FormElement form1 = builder.insertForm(startTag, true);
        assertNotNull(form1);
        assertEquals(form1, builder.getFormElement());
        assertTrue(builder.onStack(form1));

        FormElement form2 = builder.insertForm(startTag, false);
        assertNotNull(form2);
        assertEquals(form2, builder.getFormElement());
        assertFalse(builder.getStack().contains(form2));
    }

    @Test
    public void testInsertComment_emptyStackAndWithStack() {
        initBuilder("");
        Token.Comment comment = new Token.Comment();
        comment.getData().append("top comment");
        builder.insert(comment);
        assertEquals(1, builder.getDocument().childNodeSize());
        assertTrue(builder.getDocument().childNode(0) instanceof Comment);

        Element div = builder.insertStartTag("div");
        Token.Comment childComment = new Token.Comment();
        childComment.getData().append("nested comment");
        builder.insert(childComment);
        assertEquals(1, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof Comment);
    }

    @Test
    public void testInsertCharacter_textAndDataNode() {
        initBuilder("");
        Element div = builder.insertStartTag("div");
        Token.Character textToken = new Token.Character();
        textToken.data("plain text");
        builder.insert(textToken);
        assertEquals(1, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof TextNode);

        Element script = builder.insertStartTag("script");
        Token.Character scriptToken = new Token.Character();
        scriptToken.data("var x = 1;");
        builder.insert(scriptToken);
        assertEquals(1, script.childNodeSize());
        assertTrue(script.childNode(0) instanceof DataNode);

        builder.pop(); // pop script
        Element style = builder.insertStartTag("style");
        Token.Character styleToken = new Token.Character();
        styleToken.data("body { color: red; }");
        builder.insert(styleToken);
        assertEquals(1, style.childNodeSize());
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertNode_formListedAssociatesWithForm() {
        initBuilder("");
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.nameAttr("input", new Attributes());
        Element input = builder.insertEmpty(inputTag);

        assertTrue(form.elements().contains(input));
    }

    @Test
    public void testStackOperations() {
        initBuilder("");
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element p = builder.insertStartTag("p");

        assertEquals(3, builder.getStack().size());
        assertEquals(p, builder.currentElement());
        assertTrue(builder.onStack(p));
        assertTrue(builder.onStack(body));
        assertTrue(builder.onStack(html));

        assertEquals(body, builder.aboveOnStack(p));
        assertEquals(html, builder.aboveOnStack(body));

        Element found = builder.getFromStack("body");
        assertEquals(body, found);
        assertNull(builder.getFromStack("div"));

        Element popped = builder.pop();
        assertEquals(p, popped);
        assertFalse(builder.onStack(p));

        builder.push(p);
        assertTrue(builder.onStack(p));

        boolean removed = builder.removeFromStack(body);
        assertTrue(removed);
        assertFalse(builder.onStack(body));
        assertFalse(builder.removeFromStack(body));
    }

    @Test
    public void testInsertOnStackAfter_andReplaceOnStack() {
        initBuilder("");
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");

        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        builder.insertOnStackAfter(html, div);
        assertEquals(div, builder.getStack().get(1));

        Element section = new Element(Tag.valueOf("section", ParseSettings.htmlDefault), "");
        builder.replaceOnStack(div, section);
        assertEquals(section, builder.getStack().get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notFoundThrowsException() {
        initBuilder("");
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        builder.insertOnStackAfter(el1, el2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_notFoundThrowsException() {
        initBuilder("");
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        builder.replaceOnStack(el1, el2);
    }

    @Test
    public void testPopStackToClose() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("p");

        builder.popStackToClose("div");
        assertEquals("body", builder.currentElement().nodeName());

        builder.insertStartTag("ul");
        builder.insertStartTag("li");
        builder.popStackToClose("ul", "ol");
        assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void testPopStackToBefore() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.popStackToBefore("tr");
        assertEquals("tr", builder.currentElement().nodeName());
    }

    @Test
    public void testClearStackToContexts() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableRowContext();
        assertEquals("tr", builder.currentElement().nodeName());

        builder.insertStartTag("td");
        builder.clearStackToTableBodyContext();
        assertEquals("tbody", builder.currentElement().nodeName());

        builder.insertStartTag("tr");
        builder.clearStackToTableContext();
        assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void testResetInsertionMode_variousElements() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("select");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, builder.state());

        builder.pop(); // select
        builder.insertStartTag("table");
        builder.insertStartTag("caption");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, builder.state());

        builder.pop(); // caption
        builder.insertStartTag("colgroup");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, builder.state());

        builder.pop(); // colgroup
        builder.insertStartTag("tbody");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, builder.state());

        builder.insertStartTag("tr");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, builder.state());

        builder.insertStartTag("td");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, builder.state());

        builder.pop(); builder.pop(); builder.pop(); // td, tr, tbody
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, builder.state());

        builder.pop(); // table
        builder.insertStartTag("frameset");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, builder.state());

        builder.pop(); // frameset
        builder.pop(); // body
        builder.insertStartTag("head");
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.pop(); // head
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, builder.state());
    }

    @Test
    public void testScopes() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");

        assertTrue(builder.inScope("div"));
        assertTrue(builder.inScope(new String[]{"div", "span"}));
        assertFalse(builder.inScope("p"));

        builder.insertStartTag("table");
        assertFalse(builder.inScope("div")); // table acts as scope boundary
        assertTrue(builder.inTableScope("table"));

        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        builder.insertStartTag("ol");
        builder.insertStartTag("li");
        assertTrue(builder.inListItemScope("li"));

        builder.insertStartTag("button");
        assertTrue(builder.inButtonScope("button"));

        builder.insertStartTag("select");
        builder.insertStartTag("option");
        assertTrue(builder.inSelectScope("option"));
        assertFalse(builder.inSelectScope("input"));
    }

    @Test
    public void testHeadAndFormElementGetSet() {
        initBuilder("");
        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), "");
        builder.setHeadElement(head);
        assertEquals(head, builder.getHeadElement());

        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "", new Attributes());
        builder.setFormElement(form);
        assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testFosterInsertsAndPendingTableCharacters() {
        initBuilder("");
        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());

        List<String> chars = new ArrayList<>();
        chars.add("a");
        chars.add("b");
        builder.setPendingTableCharacters(chars);
        assertEquals(2, builder.getPendingTableCharacters().size());

        builder.newPendingTableCharacters();
        assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("dd");
        builder.insertStartTag("li");

        builder.generateImpliedEndTags("li");
        assertEquals("li", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void testIsSpecial() {
        Element p = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        Element custom = new Element(Tag.valueOf("custom", ParseSettings.htmlDefault), "");

        assertTrue(builder.isSpecial(p));
        assertFalse(builder.isSpecial(b));
        assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void testFormattingElementsManagement() {
        initBuilder("");
        assertNull(builder.lastFormattingElement());
        assertNull(builder.removeLastFormattingElement());

        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b1.attr("class", "bold");
        builder.pushActiveFormattingElements(b1);
        assertEquals(b1, builder.lastFormattingElement());
        assertTrue(builder.isInActiveFormattingElements(b1));
        assertEquals(b1, builder.getActiveFormattingElement("b"));

        // Add duplicate formatting elements to test max 3 identical elements policy
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b2.attr("class", "bold");
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b3.attr("class", "bold");
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b4.attr("class", "bold");

        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        builder.pushActiveFormattingElements(b4); // Should evict b1

        assertFalse(builder.isInActiveFormattingElements(b1));
        assertTrue(builder.isInActiveFormattingElements(b4));

        // Test marker & clear to marker
        builder.insertMarkerToFormattingElements();
        assertNull(builder.getActiveFormattingElement("b"));

        Element i = new Element(Tag.valueOf("i", ParseSettings.htmlDefault), "");
        builder.pushActiveFormattingElements(i);
        assertEquals(i, builder.lastFormattingElement());

        builder.clearFormattingElementsToLastMarker();
        assertFalse(builder.isInActiveFormattingElements(i));

        // Test replace
        Element replacement = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        builder.replaceActiveFormattingElement(b4, replacement);
        assertTrue(builder.isInActiveFormattingElements(replacement));
        assertFalse(builder.isInActiveFormattingElements(b4));

        // Test remove
        builder.removeFromActiveFormattingElements(replacement);
        assertFalse(builder.isInActiveFormattingElements(replacement));
    }

    @Test
    public void testReconstructFormattingElements() {
        initBuilder("");
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");
        b.attr("id", "myB");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();
        assertEquals("b", builder.currentElement().nodeName());
        assertEquals("myB", builder.currentElement().id());

        // Already on stack, reconstruct does nothing
        builder.reconstructFormattingElements();
        assertEquals("b", builder.currentElement().nodeName());
    }

    @Test
    public void testFosterParentInsertion() {
        initBuilder("");
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");

        builder.setFosterInserts(true);
        TextNode text = new TextNode("fostered text");
        builder.insertInFosterParent(text);

        // Text should be inserted before the table in body
        assertEquals(text, body.childNode(0));
        assertEquals(table, body.childNode(1));

        // Foster insert when table is inside stack without parent
        builder.setFosterInserts(false);
        HtmlTreeBuilder fragBuilder = new HtmlTreeBuilder();
        fragBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element root = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        fragBuilder.push(root);
        fragBuilder.insertInFosterParent(new TextNode("frag foster"));
        assertEquals(1, root.childNodeSize());
    }

    @Test
    public void testParseFragment_variousContexts() {
        Element divCtx = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        List<Node> nodes = builder.parseFragment("<p>hello</p>", divCtx, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(nodes.isEmpty());
        assertEquals("p", nodes.get(0).nodeName());

        Element titleCtx = new Element(Tag.valueOf("title", ParseSettings.htmlDefault), "");
        List<Node> titleNodes = builder.parseFragment("Title text", titleCtx, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(titleNodes.isEmpty());

        Element scriptCtx = new Element(Tag.valueOf("script", ParseSettings.htmlDefault), "");
        List<Node> scriptNodes = builder.parseFragment("var x = 1;", scriptCtx, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(scriptNodes.isEmpty());

        Element styleCtx = new Element(Tag.valueOf("style", ParseSettings.htmlDefault), "");
        List<Node> styleNodes = builder.parseFragment("body{}", styleCtx, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(styleNodes.isEmpty());

        Element noscriptCtx = new Element(Tag.valueOf("noscript", ParseSettings.htmlDefault), "");
        List<Node> noscriptNodes = builder.parseFragment("content", noscriptCtx, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(noscriptNodes.isEmpty());

        Element plaintextCtx = new Element(Tag.valueOf("plaintext", ParseSettings.htmlDefault), "");
        List<Node> plainNodes = builder.parseFragment("content", plaintextCtx, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(plainNodes.isEmpty());

        // Context inside a form
        Document doc = new Document("http://example.com/");
        doc.quirksMode(Document.QuirksMode.quirks);
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com/", new Attributes());
        doc.appendChild(form);
        Element innerDiv = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        form.appendChild(innerDiv);

        List<Node> formFragNodes = builder.parseFragment("<input name='q'>", innerDiv, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(formFragNodes.isEmpty());
        assertEquals(form, builder.getFormElement());
        assertEquals(Document.QuirksMode.quirks, builder.getDocument().quirksMode());

        // Null context
        List<Node> nullCtxNodes = builder.parseFragment("<p>test</p>", null, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertFalse(nullCtxNodes.isEmpty());
    }

    @Test
    public void testToString() {
        initBuilder("<div></div>");
        String str = builder.toString();
        assertNotNull(str);
        assertTrue(str.contains("TreeBuilder{"));
    }
}
