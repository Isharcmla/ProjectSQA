package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
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
        builder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
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
        builder.setHeadElement(new Element(Tag.valueOf("head"), ""));
        builder.setFormElement(new FormElement(Tag.valueOf("form"), "", new Attributes()));

        builder.initialiseParse(new StringReader("<div></div>"), "http://base.com/", ParseErrorList.tracking(5), ParseSettings.preserveCase);

        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertNull(builder.originalState());
        Assert.assertNull(builder.getHeadElement());
        Assert.assertNull(builder.getFormElement());
        Assert.assertTrue(builder.framesetOk());
        Assert.assertFalse(builder.isFosterInserts());
        Assert.assertFalse(builder.isFragmentParsing());
        Assert.assertNotNull(builder.getDocument());
        Assert.assertEquals("http://base.com/", builder.getBaseUri());
    }

    @Test
    public void testParseFragment_contextNull_returnsNodes() {
        List<Node> nodes = builder.parseFragment("<p>Hello</p>", null, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertNotNull(nodes);
        Assert.assertTrue(nodes.size() > 0);
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void testParseFragment_variousContextTags() {
        String[] tags = new String[]{"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (String tag : tags) {
            Document doc = new Document("http://example.com/");
            doc.quirksMode(Document.QuirksMode.quirks);
            Element context = new Element(Tag.valueOf(tag), "http://example.com/");
            doc.appendChild(context);

            List<Node> nodes = builder.parseFragment("text content <p>para</p>", context, "http://example.com/", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
            Assert.assertNotNull(nodes);
        }
    }

    @Test
    public void testParseFragment_contextWithParentForm_setsFormElement() {
        Document doc = new Document("http://example.com/");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        doc.appendChild(form);
        form.appendChild(div);

        builder.parseFragment("<input type='text' />", div, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testStateAndTransition() {
        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testProcessToken_andProcessWithState() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("test comment");
        boolean result = builder.process(commentToken);
        Assert.assertTrue(result);

        boolean customStateResult = builder.process(commentToken, HtmlTreeBuilderState.InBody);
        Assert.assertTrue(customStateResult);
    }

    @Test
    public void testFramesetOk() {
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void testMaybeSetBaseUri_firstBaseHrefSetsUri_subsequentIgnored() {
        Element base1 = new Element(Tag.valueOf("base"), "http://example.com/");
        base1.attr("href", "http://example.com/sub/");
        builder.maybeSetBaseUri(base1);
        Assert.assertEquals("http://example.com/sub/", builder.getBaseUri());

        Element base2 = new Element(Tag.valueOf("base"), "http://example.com/");
        base2.attr("href", "http://example.com/other/");
        builder.maybeSetBaseUri(base2);
        Assert.assertEquals("http://example.com/sub/", builder.getBaseUri());

        HtmlTreeBuilder freshBuilder = new HtmlTreeBuilder();
        freshBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Element baseNoHref = new Element(Tag.valueOf("base"), "http://example.com/");
        freshBuilder.maybeSetBaseUri(baseNoHref);
        Assert.assertEquals("http://example.com/", freshBuilder.getBaseUri());
    }

    @Test
    public void testError_addsToParseErrorsWhenTracking() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        builder.initialiseParse(new StringReader(""), "http://example.com/", errors, ParseSettings.htmlDefault);
        builder.process(new Token.Comment());
        builder.error(HtmlTreeBuilderState.Initial);
        Assert.assertEquals(1, errors.size());

        ParseErrorList noErrors = ParseErrorList.noTracking();
        builder.initialiseParse(new StringReader(""), "http://example.com/", noErrors, ParseSettings.htmlDefault);
        builder.process(new Token.Comment());
        builder.error(HtmlTreeBuilderState.Initial);
        Assert.assertEquals(0, noErrors.size());
    }

    @Test
    public void testInsert_startTag_andSelfClosing() {
        Token.StartTag normalTag = new Token.StartTag();
        normalTag.nameAttr("div", new Attributes());
        Element el = builder.insert(normalTag);
        Assert.assertEquals("div", el.nodeName());
        Assert.assertTrue(builder.onStack(el));

        Token.StartTag selfClosingUnknown = new Token.StartTag();
        selfClosingUnknown.nameAttr("custom-element", new Attributes());
        selfClosingUnknown.selfClosing = true;
        Element elUnknown = builder.insert(selfClosingUnknown);
        Assert.assertEquals("custom-element", elUnknown.nodeName());

        Token.StartTag selfClosingKnownNonEmpty = new Token.StartTag();
        selfClosingKnownNonEmpty.nameAttr("div", new Attributes());
        selfClosingKnownNonEmpty.selfClosing = true;
        Element elKnown = builder.insert(selfClosingKnownNonEmpty);
        Assert.assertEquals("div", elKnown.nodeName());
    }

    @Test
    public void testInsertStartTag_byName() {
        Element el = builder.insertStartTag("span");
        Assert.assertEquals("span", el.nodeName());
        Assert.assertEquals(el, builder.currentElement());
    }

    @Test
    public void testInsertEmpty_knownAndUnknown() {
        Token.StartTag imgTag = new Token.StartTag();
        imgTag.nameAttr("img", new Attributes());
        imgTag.selfClosing = true;
        Element imgEl = builder.insertEmpty(imgTag);
        Assert.assertEquals("img", imgEl.nodeName());

        Token.StartTag customTag = new Token.StartTag();
        customTag.nameAttr("custom-tag", new Attributes());
        customTag.selfClosing = true;
        Element customEl = builder.insertEmpty(customTag);
        Assert.assertEquals("custom-tag", customEl.nodeName());
        Assert.assertTrue(customEl.tag().isSelfClosing());
    }

    @Test
    public void testInsertForm() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());
        FormElement formElOnStack = builder.insertForm(formTag, true);
        Assert.assertNotNull(formElOnStack);
        Assert.assertEquals(formElOnStack, builder.getFormElement());
        Assert.assertTrue(builder.onStack(formElOnStack));

        FormElement formElOffStack = builder.insertForm(formTag, false);
        Assert.assertEquals(formElOffStack, builder.getFormElement());
        Assert.assertFalse(builder.getStack().get(builder.getStack().size() - 1) == formElOffStack);
    }

    @Test
    public void testInsertComment() {
        Token.Comment comment = new Token.Comment();
        comment.setData("hello comment");
        builder.insert(comment);
        Assert.assertTrue(builder.getDocument().childNode(0) instanceof Comment);
        Assert.assertEquals("hello comment", ((Comment) builder.getDocument().childNode(0)).getData());
    }

    @Test
    public void testInsertCharacter_dataNodeAndTextNode() {
        Element script = builder.insertStartTag("script");
        Token.Character dataChar = new Token.Character();
        dataChar.data("var x = 1;");
        builder.insert(dataChar);
        Assert.assertTrue(script.childNode(0) instanceof DataNode);

        Element div = builder.insertStartTag("div");
        Token.Character textChar = new Token.Character();
        textChar.data("Some text");
        builder.insert(textChar);
        Assert.assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test
    public void testInsertNode_formListedElementAssociatesWithForm() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        builder.setFormElement(form);
        Element input = new Element(Tag.valueOf("input"), "");
        builder.push(new Element(Tag.valueOf("div"), ""));
        builder.insert(input);

        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void testStackOperations_popPushGetRemoveAbove() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        Element el3 = new Element(Tag.valueOf("b"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);

        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertTrue(builder.onStack(el2));
        Assert.assertEquals(el2, builder.aboveOnStack(el3));
        Assert.assertEquals(el2, builder.getFromStack("span"));
        Assert.assertNull(builder.getFromStack("nonexistent"));

        Element popped = builder.pop();
        Assert.assertEquals(el3, popped);

        boolean removed = builder.removeFromStack(el2);
        Assert.assertTrue(removed);
        Assert.assertFalse(builder.onStack(el2));
        Assert.assertFalse(builder.removeFromStack(el2));
    }

    @Test
    public void testInsertOnStackAfter_andReplaceOnStack() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        Element el3 = new Element(Tag.valueOf("p"), "");
        Element replacement = new Element(Tag.valueOf("a"), "");

        builder.push(el1);
        builder.push(el3);

        builder.insertOnStackAfter(el1, el2);
        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertEquals(el2, builder.getStack().get(1));

        builder.replaceOnStack(el2, replacement);
        Assert.assertEquals(replacement, builder.getStack().get(1));
        Assert.assertFalse(builder.onStack(el2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_notFound_throwsException() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        builder.insertOnStackAfter(el1, el2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_notFound_throwsException() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element replacement = new Element(Tag.valueOf("a"), "");
        builder.replaceOnStack(el1, replacement);
    }

    @Test
    public void testPopStackToClose_singleAndVarargs() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");

        builder.push(html);
        builder.push(body);
        builder.push(div);
        builder.push(p);

        builder.popStackToClose("p");
        Assert.assertFalse(builder.onStack(p));
        Assert.assertTrue(builder.onStack(div));

        builder.popStackToClose("div", "body");
        Assert.assertFalse(builder.onStack(div));
        Assert.assertTrue(builder.onStack(body));
    }

    @Test
    public void testPopStackToBefore() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");

        builder.push(html);
        builder.push(body);
        builder.push(div);
        builder.push(p);

        builder.popStackToBefore("body");
        Assert.assertEquals(2, builder.getStack().size());
        Assert.assertEquals(body, builder.currentElement());
    }

    @Test
    public void testClearStackToContexts() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tbody = new Element(Tag.valueOf("tbody"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");
        Element td = new Element(Tag.valueOf("td"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tbody);
        builder.push(tr);
        builder.push(td);

        builder.clearStackToTableRowContext();
        Assert.assertEquals(tr, builder.currentElement());

        builder.push(td);
        builder.clearStackToTableBodyContext();
        Assert.assertEquals(tbody, builder.currentElement());

        builder.push(tr);
        builder.push(td);
        builder.clearStackToTableContext();
        Assert.assertEquals(table, builder.currentElement());
    }

    @Test
    public void testResetInsertionMode_allBranches() {
        String[] tags = new String[]{"select", "td", "th", "tr", "tbody", "thead", "tfoot", "caption", "colgroup", "table", "head", "body", "frameset", "html", "div"};
        HtmlTreeBuilderState[] expectedStates = new HtmlTreeBuilderState[]{
                HtmlTreeBuilderState.InSelect,
                HtmlTreeBuilderState.InCell,
                HtmlTreeBuilderState.InCell,
                HtmlTreeBuilderState.InRow,
                HtmlTreeBuilderState.InTableBody,
                HtmlTreeBuilderState.InTableBody,
                HtmlTreeBuilderState.InTableBody,
                HtmlTreeBuilderState.InCaption,
                HtmlTreeBuilderState.InColumnGroup,
                HtmlTreeBuilderState.InTable,
                HtmlTreeBuilderState.InBody,
                HtmlTreeBuilderState.InBody,
                HtmlTreeBuilderState.InFrameset,
                HtmlTreeBuilderState.BeforeHead,
                HtmlTreeBuilderState.InBody
        };

        for (int i = 0; i < tags.length; i++) {
            builder.getStack().clear();
            Element root = new Element(Tag.valueOf("html"), "");
            Element target = new Element(Tag.valueOf(tags[i]), "");
            builder.push(root);
            builder.push(target);
            builder.resetInsertionMode();
            Assert.assertEquals("Failed for tag " + tags[i], expectedStates[i], builder.state());
        }

        // Test th when pos == 0 (last = true)
        builder.getStack().clear();
        Element th = new Element(Tag.valueOf("th"), "");
        builder.push(th);
        builder.resetInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void testScopeMethods() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");
        Element td = new Element(Tag.valueOf("td"), "");
        Element p = new Element(Tag.valueOf("p"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tr);
        builder.push(td);
        builder.push(p);

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope(new String[]{"p", "div"}));
        Assert.assertFalse(builder.inScope("html"));
        Assert.assertFalse(builder.inTableScope("p"));
        Assert.assertTrue(builder.inTableScope("table"));

        Element ul = new Element(Tag.valueOf("ul"), "");
        Element li = new Element(Tag.valueOf("li"), "");
        builder.push(ul);
        builder.push(li);
        Assert.assertTrue(builder.inListItemScope("li"));

        Element button = new Element(Tag.valueOf("button"), "");
        builder.push(button);
        Assert.assertTrue(builder.inButtonScope("button"));
    }

    @Test
    public void testInSelectScope() {
        Element select = new Element(Tag.valueOf("select"), "");
        Element optgroup = new Element(Tag.valueOf("optgroup"), "");
        Element option = new Element(Tag.valueOf("option"), "");

        builder.push(select);
        builder.push(optgroup);
        builder.push(option);

        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertTrue(builder.inSelectScope("optgroup"));
        Assert.assertFalse(builder.inSelectScope("input"));
    }

    @Test
    public void testInSpecificScope_depthExceedsMaxDepth() {
        for (int i = 0; i < HtmlTreeBuilder.MaxScopeSearchDepth + 10; i++) {
            builder.push(new Element(Tag.valueOf("div"), ""));
        }
        Element span = new Element(Tag.valueOf("span"), "");
        builder.push(span);
        Assert.assertTrue(builder.inScope("span"));
    }

    @Test
    public void testPendingTableCharacters() {
        Assert.assertNotNull(builder.getPendingTableCharacters());
        List<String> list = new ArrayList<>();
        list.add("a");
        builder.setPendingTableCharacters(list);
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());
        builder.newPendingTableCharacters();
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));
        builder.push(new Element(Tag.valueOf("p"), ""));
        builder.push(new Element(Tag.valueOf("li"), ""));
        builder.push(new Element(Tag.valueOf("dt"), ""));
        builder.push(new Element(Tag.valueOf("dd"), ""));
        builder.push(new Element(Tag.valueOf("option"), ""));
        builder.push(new Element(Tag.valueOf("optgroup"), ""));
        builder.push(new Element(Tag.valueOf("rp"), ""));
        builder.push(new Element(Tag.valueOf("rt"), ""));

        builder.generateImpliedEndTags("rp");
        Assert.assertEquals("rp", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void testIsSpecial() {
        Assert.assertTrue(builder.isSpecial(new Element(Tag.valueOf("p"), "")));
        Assert.assertTrue(builder.isSpecial(new Element(Tag.valueOf("table"), "")));
        Assert.assertFalse(builder.isSpecial(new Element(Tag.valueOf("custom-tag"), "")));
    }

    @Test
    public void testFormattingElements_basicOperations() {
        Assert.assertNull(builder.lastFormattingElement());
        Assert.assertNull(builder.removeLastFormattingElement());

        Element b = new Element(Tag.valueOf("b"), "");
        builder.pushActiveFormattingElements(b);
        Assert.assertEquals(b, builder.lastFormattingElement());
        Assert.assertTrue(builder.isInActiveFormattingElements(b));
        Assert.assertEquals(b, builder.getActiveFormattingElement("b"));
        Assert.assertNull(builder.getActiveFormattingElement("i"));

        Element i = new Element(Tag.valueOf("i"), "");
        builder.replaceActiveFormattingElement(b, i);
        Assert.assertFalse(builder.isInActiveFormattingElements(b));
        Assert.assertTrue(builder.isInActiveFormattingElements(i));

        builder.removeFromActiveFormattingElements(i);
        Assert.assertFalse(builder.isInActiveFormattingElements(i));
        Assert.assertNull(builder.lastFormattingElement());
    }

    @Test
    public void testFormattingElements_duplicateLimit_andMarkers() {
        Element a1 = new Element(Tag.valueOf("a"), "");
        a1.attr("href", "1");
        Element a2 = new Element(Tag.valueOf("a"), "");
        a2.attr("href", "1");
        Element a3 = new Element(Tag.valueOf("a"), "");
        a3.attr("href", "1");
        Element a4 = new Element(Tag.valueOf("a"), "");
        a4.attr("href", "1");

        builder.pushActiveFormattingElements(a1);
        builder.pushActiveFormattingElements(a2);
        builder.pushActiveFormattingElements(a3);
        builder.pushActiveFormattingElements(a4);

        Assert.assertFalse(builder.isInActiveFormattingElements(a1));
        Assert.assertTrue(builder.isInActiveFormattingElements(a4));

        builder.insertMarkerToFormattingElements();
        Assert.assertNull(builder.lastFormattingElement());
        Assert.assertNull(builder.getActiveFormattingElement("a"));

        builder.clearFormattingElementsToLastMarker();
        Assert.assertEquals(a4, builder.lastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElements() {
        Element b = new Element(Tag.valueOf("b"), "");
        b.attr("class", "bold");
        builder.pushActiveFormattingElements(b);

        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));

        builder.reconstructFormattingElements();
        Assert.assertEquals("b", builder.currentElement().nodeName());
        Assert.assertEquals("bold", builder.currentElement().attr("class"));

        // When all formatting elements are already on stack
        builder.reconstructFormattingElements();

        // When last element is null (marker)
        builder.insertMarkerToFormattingElements();
        builder.reconstructFormattingElements();
    }

    @Test
    public void testReconstructFormattingElements_withMarkerInBetween() {
        Element b = new Element(Tag.valueOf("b"), "");
        Element i = new Element(Tag.valueOf("i"), "");

        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));

        builder.pushActiveFormattingElements(b);
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(i);

        builder.reconstructFormattingElements();
        Assert.assertEquals("i", builder.currentElement().nodeName());
    }

    @Test
    public void testInsertInFosterParent_withTableInStack() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        html.appendChild(body);
        body.appendChild(table);

        builder.push(html);
        builder.push(body);
        builder.push(table);
        builder.setFosterInserts(true);

        Element fostered = new Element(Tag.valueOf("span"), "");
        builder.insert(fostered);

        Assert.assertEquals(body, fostered.parent());
        Assert.assertEquals(0, body.children().indexOf(fostered));
    }

    @Test
    public void testInsertInFosterParent_tableWithoutParent_usesAboveOnStack() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element table = new Element(Tag.valueOf("table"), "");

        builder.push(html);
        builder.push(body);
        builder.push(table);

        Element fostered = new Element(Tag.valueOf("span"), "");
        builder.insertInFosterParent(fostered);
        Assert.assertEquals(body, fostered.parent());
    }

    @Test
    public void testInsertInFosterParent_noTableInStack_appendsToRoot() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

        Element fostered = new Element(Tag.valueOf("span"), "");
        builder.insertInFosterParent(fostered);
        Assert.assertEquals(html, fostered.parent());
    }

    @Test
    public void testToString() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        String str = builder.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("TreeBuilder"));
        Assert.assertTrue(str.contains("state="));
    }
}
