package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
    }

    @Test
    public void testParse_standardHtml_returnsDocument() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Document doc = builder.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com/", errors);
        Assert.assertNotNull(doc);
        Assert.assertEquals("Test", doc.title());
        Assert.assertEquals("Hello", doc.select("p").text());
        Assert.assertEquals(0, errors.size());
    }

    @Test
    public void testParseFragment_nullContext_returnsChildNodes() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        List<Node> nodes = builder.parseFragment("<div><p>Fragment</p></div>", null, "http://example.com/", errors);
        Assert.assertNotNull(nodes);
        Assert.assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragment_variousContextElements_handlesStatesCorrectly() {
        String[] contexts = {"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (String tagName : contexts) {
            Element context = new Element(Tag.valueOf(tagName), "http://example.com/");
            Document ownerDoc = new Document("http://example.com/");
            ownerDoc.quirksMode(Document.QuirksMode.quirks);
            ownerDoc.appendChild(context);

            ParseErrorList errors = ParseErrorList.noTracking();
            List<Node> nodes = builder.parseFragment("content text", context, "http://example.com/", errors);
            Assert.assertNotNull(nodes);
            Assert.assertTrue(builder.isFragmentParsing());
        }
    }

    @Test
    public void testParseFragment_contextInForm_associatesFormElement() {
        Document doc = new Document("http://example.com/");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        doc.appendChild(form);
        form.appendChild(div);

        List<Node> nodes = builder.parseFragment("<input type='text' name='test' />", div, "http://example.com/", ParseErrorList.noTracking());
        Assert.assertNotNull(nodes);
        Assert.assertNotNull(builder.getFormElement());
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testStateAndTransition() {
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.AfterBody);
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, builder.state());
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testFramesetOk() {
        Assert.assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void testGetDocumentAndBaseUri() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/dir/", ParseErrorList.noTracking());
        Assert.assertNotNull(builder.getDocument());
        Assert.assertEquals("http://example.com/dir/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_validAndSubsequentIgnored() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        Element base1 = new Element(Tag.valueOf("base"), "http://example.com/");
        base1.attr("href", "http://example.com/path/");
        builder.maybeSetBaseUri(base1);
        Assert.assertEquals("http://example.com/path/", builder.getBaseUri());

        Element base2 = new Element(Tag.valueOf("base"), "http://example.com/path/");
        base2.attr("href", "http://example.org/other/");
        builder.maybeSetBaseUri(base2);
        Assert.assertEquals("http://example.com/path/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_emptyHref_ignored() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element base = new Element(Tag.valueOf("base"), "http://example.com/");
        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testError() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        builder.parse("<p>test", "http://example.com/", errors);
        Token.StartTag tag = new Token.StartTag("span");
        builder.process(tag, HtmlTreeBuilderState.Initial);
        builder.error(HtmlTreeBuilderState.Initial);
        Assert.assertTrue(errors.size() > 0);
    }

    @Test
    public void testInsertStartTag_normalAndSelfClosing() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        Token.StartTag startTag = new Token.StartTag("div");
        Element div = builder.insert(startTag);
        Assert.assertEquals("div", div.nodeName());
        Assert.assertTrue(builder.onStack(div));

        Token.StartTag imgTag = new Token.StartTag("img");
        imgTag.selfClosing = true;
        Element img = builder.insert(imgTag);
        Assert.assertEquals("img", img.nodeName());

        Token.StartTag customTag = new Token.StartTag("custom-tag");
        customTag.selfClosing = true;
        Element custom = builder.insert(customTag);
        Assert.assertEquals("custom-tag", custom.nodeName());
    }

    @Test
    public void testInsertStringAndElement() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element span = builder.insert("span");
        Assert.assertEquals("span", span.nodeName());
        Assert.assertEquals(span, builder.getStack().peekLast());

        Element section = new Element(Tag.valueOf("section"), "http://example.com/");
        builder.insert(section);
        Assert.assertEquals(section, builder.getStack().peekLast());
    }

    @Test
    public void testInsertEmpty() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        Token.StartTag brTag = new Token.StartTag("br");
        brTag.selfClosing = true;
        Element br = builder.insertEmpty(brTag);
        Assert.assertEquals("br", br.nodeName());

        Token.StartTag customEmptyTag = new Token.StartTag("unknown-tag");
        customEmptyTag.selfClosing = true;
        Element custom = builder.insertEmpty(customEmptyTag);
        Assert.assertEquals("unknown-tag", custom.nodeName());
        Assert.assertTrue(custom.tag().isSelfClosing());
    }

    @Test
    public void testInsertForm_withAndWithoutStack() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        Token.StartTag formTag = new Token.StartTag("form");
        FormElement form1 = builder.insertForm(formTag, true);
        Assert.assertEquals(form1, builder.getFormElement());
        Assert.assertTrue(builder.onStack(form1));

        Token.StartTag formTag2 = new Token.StartTag("form");
        FormElement form2 = builder.insertForm(formTag2, false);
        Assert.assertEquals(form2, builder.getFormElement());
        Assert.assertFalse(builder.onStack(form2));
    }

    @Test
    public void testInsertCommentAndCharacter() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("test comment");
        builder.insert(commentToken);
        Assert.assertTrue(builder.getDocument().body().childNode(0) instanceof Comment);

        Token.Character charToken = new Token.Character("hello text");
        builder.insert(charToken);
        Assert.assertTrue(builder.getDocument().body().text().contains("hello text"));

        Element script = builder.insert("script");
        Token.Character scriptChar = new Token.Character("var x = 10;");
        builder.insert(scriptChar);
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertNode_emptyStackAndFormListing() {
        HtmlTreeBuilder freshBuilder = new HtmlTreeBuilder();
        freshBuilder.initialiseParse("<div></div>", "http://example.com/", ParseErrorList.noTracking());
        freshBuilder.getStack().clear();
        
        Comment comment = new Comment("top level comment", "http://example.com/");
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("doc comment");
        freshBuilder.insert(commentToken);
        Assert.assertEquals(1, freshBuilder.getDocument().childNodeSize());

        Token.StartTag formTag = new Token.StartTag("form");
        FormElement formEl = freshBuilder.insertForm(formTag, true);
        Token.StartTag inputTag = new Token.StartTag("input");
        Element inputEl = freshBuilder.insertEmpty(inputTag);
        Assert.assertEquals(1, formEl.elements().size());
    }

    @Test
    public void testPopAndPush() {
        builder.parse("<html><head></head><body><div></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element p = new Element(Tag.valueOf("p"), "http://example.com/");
        builder.push(p);
        Assert.assertTrue(builder.onStack(p));
        Element popped = builder.pop();
        Assert.assertEquals(p, popped);
        Assert.assertFalse(builder.onStack(p));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPop_poppingHtml_throwsException() {
        builder.parse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        while (builder.getStack().size() > 1) {
            builder.pop();
        }
        builder.pop();
    }

    @Test
    public void testGetFromStackAndRemoveFromStack() {
        builder.parse("<html><head></head><body><div><span></span></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = builder.getFromStack("div");
        Assert.assertNotNull(div);
        Assert.assertEquals("div", div.nodeName());
        Assert.assertNull(builder.getFromStack("nonexistent"));

        boolean removed = builder.removeFromStack(div);
        Assert.assertTrue(removed);
        Assert.assertFalse(builder.onStack(div));
        Assert.assertFalse(builder.removeFromStack(div));
    }

    @Test
    public void testPopStackToClose_singleAndMultiple() {
        builder.parse("<html><head></head><body><div><section><p>text</p></section></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.popStackToClose("p");
        Assert.assertNull(builder.getFromStack("p"));

        builder.insert("span");
        builder.insert("strong");
        builder.popStackToClose("div", "span");
        Assert.assertNull(builder.getFromStack("strong"));
    }

    @Test
    public void testPopStackToBefore() {
        builder.parse("<html><head></head><body><div><span><strong>text</strong></span></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.popStackToBefore("span");
        Assert.assertNull(builder.getFromStack("strong"));
        Assert.assertNotNull(builder.getFromStack("span"));
    }

    @Test
    public void testClearStackToContext() {
        builder.parse("<html><head></head><body><table><tbody><tr><td>test</td></tr></tbody></table></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        builder.clearStackToTableRowContext();
        Assert.assertEquals("tr", builder.getStack().peekLast().nodeName());

        builder.clearStackToTableBodyContext();
        Assert.assertEquals("tbody", builder.getStack().peekLast().nodeName());

        builder.clearStackToTableContext();
        Assert.assertEquals("table", builder.getStack().peekLast().nodeName());
    }

    @Test
    public void testAboveOnStack() {
        builder.parse("<html><head></head><body><div><p></p></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element body = builder.getFromStack("body");
        Element div = builder.getFromStack("div");
        Element above = builder.aboveOnStack(div);
        Assert.assertEquals(body, above);
    }

    @Test
    public void testInsertOnStackAfterAndReplaceOnStack() {
        builder.parse("<html><head></head><body><div></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = builder.getFromStack("div");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");
        builder.insertOnStackAfter(div, span);
        Assert.assertTrue(builder.onStack(span));

        Element section = new Element(Tag.valueOf("section"), "http://example.com/");
        builder.replaceOnStack(span, section);
        Assert.assertFalse(builder.onStack(span));
        Assert.assertTrue(builder.onStack(section));
    }

    @Test
    public void testResetInsertionMode_allBranches() {
        String[] tagNames = {"select", "td", "tr", "tbody", "thead", "tfoot", "caption", "colgroup", "table", "head", "body", "frameset", "html"};
        for (String name : tagNames) {
            HtmlTreeBuilder b = new HtmlTreeBuilder();
            b.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
            Element el = new Element(Tag.valueOf(name), "http://example.com/");
            b.push(el);
            b.resetInsertionMode();
            Assert.assertNotNull(b.state());
        }
    }

    @Test
    public void testInScope_variousScopes() {
        builder.parse("<html><body><div><p><span>text</span></p></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope(new String[]{"span", "p"}));
        Assert.assertTrue(builder.inScope("div", new String[]{"body"}));
        Assert.assertFalse(builder.inScope("nonexistent"));

        builder.parse("<html><body><ul><li><span>item</span></li></ul></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Assert.assertTrue(builder.inListItemScope("li"));

        builder.parse("<html><body><button><span>click</span></button></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Assert.assertTrue(builder.inButtonScope("span"));

        builder.parse("<html><body><table><tr><td>cell</td></tr></table></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Assert.assertTrue(builder.inTableScope("table"));

        builder.parse("<html><body><select><option>opt</option></select></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertFalse(builder.inSelectScope("input"));
    }

    @Test
    public void testHeadAndFormElementGetSet() {
        Element head = new Element(Tag.valueOf("head"), "http://example.com/");
        builder.setHeadElement(head);
        Assert.assertEquals(head, builder.getHeadElement());

        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        builder.setFormElement(form);
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testFosterInsertsAndPendingTableCharacters() {
        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());
        builder.setFosterInserts(false);
        Assert.assertFalse(builder.isFosterInserts());

        List<Token.Character> chars = new ArrayList<Token.Character>();
        chars.add(new Token.Character("abc"));
        builder.setPendingTableCharacters(chars);
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());

        builder.newPendingTableCharacters();
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.parse("<html><body><div><p><p></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element p = builder.insert("p");
        builder.generateImpliedEndTags();
        builder.generateImpliedEndTags("p");
    }

    @Test
    public void testIsSpecial() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        Assert.assertTrue(builder.isSpecial(div));
        Element custom = new Element(Tag.valueOf("custom-tag"), "http://example.com/");
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void testActiveFormattingElements_operations() {
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com/");
        a1.attr("href", "1");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com/");
        a2.attr("href", "1");
        Element a3 = new Element(Tag.valueOf("a"), "http://example.com/");
        a3.attr("href", "1");
        Element a4 = new Element(Tag.valueOf("a"), "http://example.com/");
        a4.attr("href", "1");

        builder.pushActiveFormattingElements(a1);
        builder.pushActiveFormattingElements(a2);
        builder.pushActiveFormattingElements(a3);
        builder.pushActiveFormattingElements(a4);

        Assert.assertTrue(builder.isInActiveFormattingElements(a4));
        Assert.assertEquals(a4, builder.getActiveFormattingElement("a"));

        builder.insertMarkerToFormattingElements();
        Assert.assertNull(builder.getActiveFormattingElement("a"));

        Element b = new Element(Tag.valueOf("b"), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        builder.clearFormattingElementsToLastMarker();
        Assert.assertFalse(builder.isInActiveFormattingElements(b));

        builder.pushActiveFormattingElements(b);
        Element c = new Element(Tag.valueOf("i"), "http://example.com/");
        builder.replaceActiveFormattingElement(b, c);
        Assert.assertFalse(builder.isInActiveFormattingElements(b));
        Assert.assertTrue(builder.isInActiveFormattingElements(c));

        builder.removeFromActiveFormattingElements(c);
        Assert.assertFalse(builder.isInActiveFormattingElements(c));
    }

    @Test
    public void testReconstructFormattingElements() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        
        builder.reconstructFormattingElements();

        Element b = new Element(Tag.valueOf("b"), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        builder.reconstructFormattingElements();
        Assert.assertTrue(builder.onStack(b) || builder.getFromStack("b") != null);

        builder.insertMarkerToFormattingElements();
        Element em = new Element(Tag.valueOf("em"), "http://example.com/");
        builder.pushActiveFormattingElements(em);
        builder.reconstructFormattingElements();
        Assert.assertNotNull(builder.getFromStack("em"));
    }

    @Test
    public void testInsertInFosterParent() {
        builder.parse("<html><body><table><tr><td>cell</td></tr></table></body></html>", "http://example.com/", ParseErrorList.noTracking());
        TextNode text = new TextNode("fostered text", "http://example.com/");
        builder.insertInFosterParent(text);
        Assert.assertTrue(builder.getDocument().body().text().contains("fostered text"));

        HtmlTreeBuilder fragBuilder = new HtmlTreeBuilder();
        fragBuilder.parseFragment("<span>test</span>", null, "http://example.com/", ParseErrorList.noTracking());
        TextNode fragText = new TextNode("frag text", "http://example.com/");
        fragBuilder.insertInFosterParent(fragText);
        Assert.assertNotNull(fragBuilder.getDocument());
    }

    @Test
    public void testToString() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        String str = builder.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("TreeBuilder{"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_elementNotFound_throwsException() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com/");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com/");
        builder.insertOnStackAfter(el1, el2);
    }
}
