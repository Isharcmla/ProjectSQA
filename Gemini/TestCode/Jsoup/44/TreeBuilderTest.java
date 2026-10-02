package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeBuilderTest {

    private static class ConcreteTreeBuilder extends TreeBuilder {
        final List<Token> processedTokens = new ArrayList<Token>();

        @Override
        protected boolean process(Token token) {
            currentToken = token;
            // Record token types to verify processing
            if (token.type == Token.TokenType.StartTag) {
                Token.StartTag startTag = (Token.StartTag) token;
                Element el = new Element(Tag.valueOf(startTag.name()), baseUri, startTag.attributes);
                stack.add(el);
                doc.appendChild(el);
            } else if (token.type == Token.TokenType.EndTag) {
                if (!stack.isEmpty()) {
                    stack.remove(stack.size() - 1);
                }
            }
            return true;
        }

        public Document getDoc() {
            return doc;
        }

        public ArrayList<Element> getStack() {
            return stack;
        }

        public Tokeniser getTokeniser() {
            return tokeniser;
        }
    }

    private ConcreteTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new ConcreteTreeBuilder();
    }

    @Test
    public void testInitialiseParse_validInput_initialisedCorrectly() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        treeBuilder.initialiseParse("<div>test</div>", "http://example.com", errors);

        Assert.assertNotNull(treeBuilder.doc);
        Assert.assertEquals("http://example.com", treeBuilder.baseUri);
        Assert.assertNotNull(treeBuilder.reader);
        Assert.assertNotNull(treeBuilder.tokeniser);
        Assert.assertNotNull(treeBuilder.stack);
        Assert.assertTrue(treeBuilder.stack.isEmpty());
        Assert.assertEquals(errors, treeBuilder.errors);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_nullInput_throwsException() {
        treeBuilder.initialiseParse(null, "http://example.com", ParseErrorList.noTracking());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_nullBaseUri_throwsException() {
        treeBuilder.initialiseParse("<div></div>", null, ParseErrorList.noTracking());
    }

    @Test
    public void testParse_twoArgs_parsesDocument() {
        Document doc = treeBuilder.parse("<div></div>", "http://example.com/");
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParse_threeArgsWithErrors_parsesDocumentAndTracksErrors() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Document doc = treeBuilder.parse("<span></span>", "http://example.com/", errors);
        Assert.assertNotNull(doc);
        Assert.assertEquals(errors, treeBuilder.errors);
    }

    @Test
    public void testParse_emptyString_parsesDocument() {
        Document doc = treeBuilder.parse("", "");
        Assert.assertNotNull(doc);
        Assert.assertEquals("", doc.baseUri());
    }

    @Test
    public void testRunParser_processesTokensUntilEof() {
        treeBuilder.initialiseParse("<p>Hello</p>", "http://example.com", ParseErrorList.noTracking());
        treeBuilder.runParser();

        Assert.assertNotNull(treeBuilder.currentToken);
        Assert.assertEquals(Token.TokenType.EOF, treeBuilder.currentToken.type);
    }

    @Test
    public void testProcessStartTag_nameOnly_returnsTrueAndModifiesStack() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        boolean result = treeBuilder.processStartTag("div");

        Assert.assertTrue(result);
        Assert.assertEquals(1, treeBuilder.getStack().size());
        Assert.assertEquals("div", treeBuilder.getStack().get(0).tagName());
    }

    @Test
    public void testProcessStartTag_nameAndAttributes_returnsTrueAndCreatesElementWithAttrs() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        attrs.put("class", "content");

        boolean result = treeBuilder.processStartTag("div", attrs);

        Assert.assertTrue(result);
        Assert.assertEquals(1, treeBuilder.getStack().size());
        Element el = treeBuilder.getStack().get(0);
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("main", el.attr("id"));
        Assert.assertEquals("content", el.attr("class"));
    }

    @Test
    public void testProcessStartTag_emptyAttributes_returnsTrue() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();

        boolean result = treeBuilder.processStartTag("span", attrs);

        Assert.assertTrue(result);
        Assert.assertEquals(1, treeBuilder.getStack().size());
        Element el = treeBuilder.getStack().get(0);
        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals(0, el.attributes().size());
    }

    @Test
    public void testProcessEndTag_validName_returnsTrueAndModifiesStack() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        treeBuilder.processStartTag("div");
        Assert.assertEquals(1, treeBuilder.getStack().size());

        boolean result = treeBuilder.processEndTag("div");

        Assert.assertTrue(result);
        Assert.assertEquals(0, treeBuilder.getStack().size());
    }

    @Test
    public void testCurrentElement_emptyStack_returnsNull() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        Element current = treeBuilder.currentElement();
        Assert.assertNull(current);
    }

    @Test
    public void testCurrentElement_nonEmptyStack_returnsLastElement() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        treeBuilder.processStartTag("div");
        treeBuilder.processStartTag("p");

        Element current = treeBuilder.currentElement();
        Assert.assertNotNull(current);
        Assert.assertEquals("p", current.tagName());
    }

    @Test
    public void testCurrentElement_afterPoppingStack_returnsPreviousElement() {
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        treeBuilder.processStartTag("div");
        treeBuilder.processStartTag("p");
        treeBuilder.processEndTag("p");

        Element current = treeBuilder.currentElement();
        Assert.assertNotNull(current);
        Assert.assertEquals("div", current.tagName());
    }
}
