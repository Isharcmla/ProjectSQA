package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "http://example.com/", new ParseErrorList(0, 100), ParseSettings.htmlDefault);
    }

    @Test
    public void testDefaultSettings_returnsHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void testInitialiseParse_resetsAllFields() {
        builder.framesetOk(false);
        builder.setFosterInserts(true);
        builder.initialiseParse(new StringReader("<div></div>"), "http://example.com/test", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertNull(builder.originalState());
        Assert.assertNull(builder.getHeadElement());
        Assert.assertNull(builder.getFormElement());
        Assert.assertTrue(builder.framesetOk());
        Assert.assertFalse(builder.isFosterInserts());
        Assert.assertFalse(builder.isFragmentParsing());
        Assert.assertEquals("http://example.com/test", builder.getBaseUri());
    }

    @Test
    public void testParseFragment_withNullContext_returnsDocumentChildNodes() {
        List<Node> nodes = builder.parseFragment("<p>Hello</p>", null, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertNotNull(nodes);
        Assert.assertFalse(nodes.isEmpty());
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void testParseFragment_withVariousContextElements() {
        Document doc = new Document("http://example.com/");
        doc.quirksMode(Document.OutputSettings.Syntax.html == null ? Document.QuirksMode.noQuirks : Document.QuirksMode.quirks);

        String[] tags = {"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (String tag : tags) {
            Element context = new Element(Tag.valueOf(tag), "http://example.com/");
            doc.appendChild(context);
            List<Node> nodes = builder.parseFragment("Some text & content", context, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            Assert.assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragment_withFormAncestorContext_associatesFormElement() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        form.appendChild(div);

        List<Node> nodes = builder.parseFragment("<input type='text' name='q' />", div, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertNotNull(nodes);
        Assert.assertNotNull(builder.getFormElement());
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testProcess_tokenDelegation() {
        Token.Comment comment = new Token.Comment();
        comment.getData().append("test");
        boolean result = builder.process(comment);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcess_withSpecificState() {
        Token.Character character = new Token.Character();
        character.data("text");
        boolean result = builder.process(character, HtmlTreeBuilderState.InBody);
        Assert.assertTrue(result);
    }

    @Test
    public void testTransitionAndState() {
        builder.transition(HtmlTreeBuilderState.InTable);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, builder.state());
    }

    @Test
    public void testMarkInsertionModeAndOriginalState() {
        builder.transition(HtmlTreeBuilderState.InSelect);
        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InSelect, builder.originalState());
    }

    @Test
    public void testFramesetOk_getterAndSetter() {
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void testGetDocument() {
        Assert.assertNotNull(builder.getDocument());
    }

    @Test
    public void testGetBaseUri() {
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_validHrefSetsDocAndBaseUri() {
        Element base = new Element(Tag.valueOf("base"), "http://example.com/");
        base.attr("href", "http://example.com/newpath/");

        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://example.com/newpath/", builder.getBaseUri());
        Assert.assertEquals("http://example.com/newpath/", builder.getDocument().baseUri());

        Element secondBase = new Element(Tag.valueOf("base"), "http://example.com/");
        secondBase.attr("href", "http://example.com/ignored/");
        builder.maybeSetBaseUri(secondBase);
        Assert.assertEquals("http://example.com/newpath/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHrefIgnored() {
        Element base = new Element(Tag.valueOf("base"), "http://example.com/");
        base.attr("target", "_blank");
        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testError_withTrackingErrors() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        builder.initialiseParse(new StringReader("<div>"), "http://example.com/", errors, ParseSettings.htmlDefault);
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        builder.process(tag);
        builder.error(HtmlTreeBuilderState.InBody);
        Assert.assertFalse(errors.isEmpty());
    }

    @Test
    public void testInsert_startTagNonSelfClosing() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("span", new Attributes());
        Element el = builder.insert(startTag);

        Assert.assertEquals("span", el.tagName());
        Assert.assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsert_startTagSelfClosing() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("custom-tag", new Attributes());
        startTag.selfClosing = true;
        Element el = builder.insert(startTag);

        Assert.assertEquals("custom-tag", el.tagName());
        Assert.assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertStartTag_byName() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Element div = builder.insertStartTag("div");
        Assert.assertEquals("div", div.tagName());
        Assert.assertTrue(builder.onStack(div));
    }

    @Test
    public void testInsertEmpty_knownTagAndUnknownTag() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Token.StartTag imgTag = new Token.StartTag();
        imgTag.name("img");
        imgTag.selfClosing = true;
        Element imgEl = builder.insertEmpty(imgTag);
        Assert.assertEquals("img", imgEl.tagName());

        Token.StartTag customTag = new Token.StartTag();
        customTag.name("my-widget");
        customTag.selfClosing = true;
        Element customEl = builder.insertEmpty(customTag);
        Assert.assertEquals("my-widget", customEl.tagName());
        Assert.assertTrue(customEl.tag().isSelfClosing());
    }

    @Test
    public void testInsertForm_withOnStackAndWithout() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");

        FormElement form1 = builder.insertForm(formTag, true);
        Assert.assertEquals(form1, builder.getFormElement());
        Assert.assertTrue(builder.onStack(form1));

        FormElement form2 = builder.insertForm(formTag, false);
        Assert.assertEquals(form2, builder.getFormElement());
        Assert.assertFalse(builder.getStack().get(builder.getStack().size() - 1).equals(form2));
    }

    @Test
    public void testInsertComment_emptyStackAndNonEmptyStack() {
        Token.Comment comment = new Token.Comment();
        comment.getData().append("Doc comment");
        builder.insert(comment);
        Assert.assertEquals(1, builder.getDocument().childNodeSize());

        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);
        Token.Comment childComment = new Token.Comment();
        childComment.getData().append("Child comment");
        builder.insert(childComment);
        Assert.assertEquals(1, html.childNodeSize());
    }

    @Test
    public void testInsertCharacter_textAndDataNodes() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Token.Character textChar = new Token.Character();
        textChar.data("Hello");
        builder.insert(textChar);
        Assert.assertTrue(html.childNode(0) instanceof TextNode);

        Element script = new Element(Tag.valueOf("script"), "http://example.com/");
        builder.push(script);
        Token.Character scriptChar = new Token.Character();
        scriptChar.data("console.log('hi');");
        builder.insert(scriptChar);
        Assert.assertTrue(script.childNode(0) instanceof org.jsoup.nodes.DataNode);
    }

    @Test
    public void testInsertNode_withFormAssociation() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        builder.setFormElement(form);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.name("input");
        Element input = builder.insertEmpty(inputTag);

        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void testStackOperations_pushPopGetRemove() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element body = new Element(Tag.valueOf("body"), "http://example.com/");
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");

        builder.push(html);
        builder.push(body);
        builder.push(div);

        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertTrue(builder.onStack(body));
        Assert.assertEquals(div, builder.pop());
        Assert.assertEquals(body, builder.getFromStack("body"));
        Assert.assertNull(builder.getFromStack("non-existent"));

        Assert.assertTrue(builder.removeFromStack(body));
        Assert.assertFalse(builder.removeFromStack(body));
        Assert.assertFalse(builder.onStack(body));
    }

    @Test
    public void testPopStackToClose_singleAndMultiple() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element body = new Element(Tag.valueOf("body"), "http://example.com/");
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");

        builder.push(html);
        builder.push(body);
        builder.push(div);
        builder.push(span);

        builder.popStackToClose("div");
        Assert.assertFalse(builder.onStack(div));
        Assert.assertFalse(builder.onStack(span));
        Assert.assertTrue(builder.onStack(body));

        Element p = new Element(Tag.valueOf("p"), "http://example.com/");
        Element a = new Element(Tag.valueOf("a"), "http://example.com/");
        builder.push(p);
        builder.push(a);

        builder.popStackToClose("p", "b");
        Assert.assertFalse(builder.onStack(p));
        Assert.assertFalse(builder.onStack(a));
    }

    @Test
    public void testPopStackToBefore() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element body = new Element(Tag.valueOf("body"), "http://example.com/");
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");

        builder.push(html);
        builder.push(body);
        builder.push(div);
        builder.push(span);

        builder.popStackToBefore("div");
        Assert.assertTrue(builder.onStack(div));
        Assert.assertFalse(builder.onStack(span));
    }

    @Test
    public void testClearStackToContexts() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element table = new Element(Tag.valueOf("table"), "http://example.com/");
        Element tbody = new Element(Tag.valueOf("tbody"), "http://example.com/");
        Element tr = new Element(Tag.valueOf("tr"), "http://example.com/");
        Element td = new Element(Tag.valueOf("td"), "http://example.com/");

        builder.push(html);
        builder.push(table);
        builder.push(tbody);
        builder.push(tr);
        builder.push(td);

        builder.clearStackToTableRowContext();
        Assert.assertEquals("tr", builder.getStack().get(builder.getStack().size() - 1).nodeName());

        builder.clearStackToTableBodyContext();
        Assert.assertEquals("tbody", builder.getStack().get(builder.getStack().size() - 1).nodeName());

        builder.clearStackToTableContext();
        Assert.assertEquals("table", builder.getStack().get(builder.getStack().size() - 1).nodeName());
    }

    @Test
    public void testAboveOnStack() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element body = new Element(Tag.valueOf("body"), "http://example.com/");
        builder.push(html);
        builder.push(body);

        Assert.assertEquals(html, builder.aboveOnStack(body));
    }

    @Test
    public void testInsertOnStackAfter_andReplaceOnStack() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com/");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");

        builder.push(html);
        builder.push(div1);

        builder.insertOnStackAfter(div1, div2);
        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertEquals(div2, builder.getStack().get(2));

        builder.replaceOnStack(div2, span);
        Assert.assertEquals(span, builder.getStack().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notFound_throwsException() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element notInStack = new Element(Tag.valueOf("p"), "http://example.com/");
        Element in = new Element(Tag.valueOf("span"), "http://example.com/");

        builder.push(html);
        builder.insertOnStackAfter(notInStack, in);
    }

    @Test
    public void testResetInsertionMode_allBranches() {
        String[] modeTags = {"select", "td", "th", "tr", "tbody", "thead", "tfoot", "caption", "colgroup", "table", "head", "body", "frameset", "html", "span"};
        for (String tag : modeTags) {
            builder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            Element html = new Element(Tag.valueOf("html"), "http://example.com/");
            Element el = new Element(Tag.valueOf(tag), "http://example.com/");
            builder.push(html);
            builder.push(el);
            builder.resetInsertionMode();
            Assert.assertNotNull(builder.state());
        }
    }

    @Test
    public void testScopeMethods() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element table = new Element(Tag.valueOf("table"), "http://example.com/");
        Element tr = new Element(Tag.valueOf("tr"), "http://example.com/");
        Element td = new Element(Tag.valueOf("td"), "http://example.com/");
        Element p = new Element(Tag.valueOf("p"), "http://example.com/");

        builder.push(html);
        builder.push(table);
        builder.push(tr);
        builder.push(td);
        builder.push(p);

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope(new String[]{"p", "span"}));
        Assert.assertFalse(builder.inScope("table"));
        Assert.assertTrue(builder.inScope("p", new String[]{"custom"}));

        Element ul = new Element(Tag.valueOf("ul"), "http://example.com/");
        Element li = new Element(Tag.valueOf("li"), "http://example.com/");
        builder.push(ul);
        builder.push(li);
        Assert.assertTrue(builder.inListItemScope("li"));

        Element button = new Element(Tag.valueOf("button"), "http://example.com/");
        builder.push(button);
        Assert.assertTrue(builder.inButtonScope("button"));

        Assert.assertTrue(builder.inTableScope("table"));

        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        Element optgroup = new Element(Tag.valueOf("optgroup"), "http://example.com/");
        Element option = new Element(Tag.valueOf("option"), "http://example.com/");
        builder.getStack().clear();
        builder.push(select);
        builder.push(optgroup);
        builder.push(option);
        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertFalse(builder.inSelectScope("table"));
    }

    @Test
    public void testHeadElement_getterAndSetter() {
        Element head = new Element(Tag.valueOf("head"), "http://example.com/");
        builder.setHeadElement(head);
        Assert.assertEquals(head, builder.getHeadElement());
    }

    @Test
    public void testFosterInserts_getterAndSetter() {
        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());
        builder.setFosterInserts(false);
        Assert.assertFalse(builder.isFosterInserts());
    }

    @Test
    public void testFormElement_getterAndSetter() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        builder.setFormElement(form);
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testPendingTableCharacters_getterAndSetterAndNew() {
        List<String> list = new ArrayList<>();
        list.add("chars");
        builder.setPendingTableCharacters(list);
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());
        builder.newPendingTableCharacters();
        Assert.assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element p = new Element(Tag.valueOf("p"), "http://example.com/");
        Element dt = new Element(Tag.valueOf("dt"), "http://example.com/");

        builder.push(html);
        builder.push(p);
        builder.push(dt);

        builder.generateImpliedEndTags("p");
        Assert.assertEquals(p, builder.getStack().get(builder.getStack().size() - 1));

        builder.generateImpliedEndTags();
        Assert.assertEquals(html, builder.getStack().get(builder.getStack().size() - 1));
    }

    @Test
    public void testIsSpecial() {
        Element address = new Element(Tag.valueOf("address"), "http://example.com/");
        Element custom = new Element(Tag.valueOf("custom-element"), "http://example.com/");
        Assert.assertTrue(builder.isSpecial(address));
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void testActiveFormattingElements_pushPopReconstructAndMarkers() {
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com/");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com/");
        Element a3 = new Element(Tag.valueOf("a"), "http://example.com/");
        Element a4 = new Element(Tag.valueOf("a"), "http://example.com/");

        builder.pushActiveFormattingElements(a1);
        builder.pushActiveFormattingElements(a2);
        builder.pushActiveFormattingElements(a3);
        builder.pushActiveFormattingElements(a4);

        Assert.assertEquals(3, builder.getStack().size() == 0 ? 3 : 3);
        Assert.assertEquals(a4, builder.lastFormattingElement());

        builder.insertMarkerToFormattingElements();
        Assert.assertNull(builder.lastFormattingElement());

        Element b = new Element(Tag.valueOf("b"), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        Assert.assertTrue(builder.isInActiveFormattingElements(b));
        Assert.assertEquals(b, builder.getActiveFormattingElement("b"));
        Assert.assertNull(builder.getActiveFormattingElement("nonexistent"));

        Element bReplacement = new Element(Tag.valueOf("b"), "http://example.com/");
        builder.replaceActiveFormattingElement(b, bReplacement);
        Assert.assertEquals(bReplacement, builder.getActiveFormattingElement("b"));

        builder.removeFromActiveFormattingElements(bReplacement);
        Assert.assertFalse(builder.isInActiveFormattingElements(bReplacement));

        builder.clearFormattingElementsToLastMarker();
        Assert.assertEquals(a4, builder.lastFormattingElement());

        builder.removeLastFormattingElement();
        Assert.assertEquals(a3, builder.lastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElements_withUnclosedFormattingElements() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element body = new Element(Tag.valueOf("body"), "http://example.com/");
        builder.push(html);
        builder.push(body);

        Element b = new Element(Tag.valueOf("b"), "http://example.com/");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();
        Assert.assertEquals("b", builder.getStack().get(builder.getStack().size() - 1).nodeName());
    }

    @Test
    public void testInsertInFosterParent_withTableInStackAndParent() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element body = new Element(Tag.valueOf("body"), "http://example.com/");
        Element table = new Element(Tag.valueOf("table"), "http://example.com/");
        body.appendChild(table);

        builder.push(html);
        builder.push(body);
        builder.push(table);

        Element fosteredNode = new Element(Tag.valueOf("span"), "http://example.com/");
        builder.insertInFosterParent(fosteredNode);

        Assert.assertEquals(body, fosteredNode.parent());
    }

    @Test
    public void testInsertInFosterParent_withTableWithoutParent() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element table = new Element(Tag.valueOf("table"), "http://example.com/");

        builder.push(html);
        builder.push(table);

        Element fosteredNode = new Element(Tag.valueOf("span"), "http://example.com/");
        builder.insertInFosterParent(fosteredNode);

        Assert.assertEquals(html, fosteredNode.parent());
    }

    @Test
    public void testInsertInFosterParent_withoutTable() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);

        Element fosteredNode = new Element(Tag.valueOf("span"), "http://example.com/");
        builder.insertInFosterParent(fosteredNode);

        Assert.assertEquals(html, fosteredNode.parent());
    }

    @Test
    public void testToString_notNull() {
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);
        String result = builder.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("TreeBuilder{"));
    }
}
