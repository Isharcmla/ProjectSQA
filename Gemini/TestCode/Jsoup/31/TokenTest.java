package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TokenTest {

    @Test
    public void testTokenTypeEnum_valuesAndValueOf_success() {
        Token.TokenType[] types = Token.TokenType.values();
        assertEquals(6, types.length);
        assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
        assertEquals(Token.TokenType.StartTag, Token.TokenType.valueOf("StartTag"));
        assertEquals(Token.TokenType.EndTag, Token.TokenType.valueOf("EndTag"));
        assertEquals(Token.TokenType.Comment, Token.TokenType.valueOf("Comment"));
        assertEquals(Token.TokenType.Character, Token.TokenType.valueOf("Character"));
        assertEquals(Token.TokenType.EOF, Token.TokenType.valueOf("EOF"));
    }

    @Test
    public void testDoctype_defaultValuesAndSetters_gettersReturnExpected() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());
        assertSame(doctype, doctype.asDoctype());

        assertEquals("Doctype", doctype.tokenType());
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());

        doctype.name.append("html");
        doctype.publicIdentifier.append("public-id");
        doctype.systemIdentifier.append("system-id");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("public-id", doctype.getPublicIdentifier());
        assertEquals("system-id", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());
    }

    @Test
    public void testStartTag_constructorsAndToString_success() {
        Token.StartTag tag1 = new Token.StartTag();
        assertTrue(tag1.isStartTag());
        assertFalse(tag1.isDoctype());
        assertSame(tag1, tag1.asStartTag());
        assertEquals("StartTag", tag1.tokenType());
        assertNotNull(tag1.getAttributes());
        assertEquals(0, tag1.getAttributes().size());

        Token.StartTag tag2 = new Token.StartTag("div");
        assertEquals("div", tag2.name());
        assertEquals("<div>", tag2.toString());

        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Token.StartTag tag3 = new Token.StartTag("span", attrs);
        assertEquals("span", tag3.name());
        assertEquals(attrs, tag3.getAttributes());
        assertEquals("<span id=\"main\">", tag3.toString());

        tag3.attributes = null;
        assertEquals("<span>", tag3.toString());
    }

    @Test
    public void testEndTag_constructorsAndToString_success() {
        Token.EndTag endTag1 = new Token.EndTag();
        assertTrue(endTag1.isEndTag());
        assertFalse(endTag1.isStartTag());
        assertSame(endTag1, endTag1.asEndTag());
        assertEquals("EndTag", endTag1.tokenType());
        assertNull(endTag1.getAttributes());

        Token.EndTag endTag2 = new Token.EndTag("div");
        assertEquals("div", endTag2.name());
        assertEquals("</div>", endTag2.toString());
    }

    @Test
    public void testComment_getterAndToString_success() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertFalse(comment.isDoctype());
        assertSame(comment, comment.asComment());
        assertEquals("Comment", comment.tokenType());

        assertEquals("", comment.getData());
        assertEquals("<!---->", comment.toString());

        comment.data.append("sample comment");
        assertEquals("sample comment", comment.getData());
        assertEquals("<!--sample comment-->", comment.toString());
    }

    @Test
    public void testCharacter_getterAndToString_success() {
        Token.Character character = new Token.Character("sample text");
        assertTrue(character.isCharacter());
        assertFalse(character.isComment());
        assertSame(character, character.asCharacter());
        assertEquals("Character", character.tokenType());

        assertEquals("sample text", character.getData());
        assertEquals("sample text", character.toString());
    }

    @Test
    public void testEOF_isEOF_returnsTrue() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isDoctype());
        assertFalse(eof.isStartTag());
        assertFalse(eof.isEndTag());
        assertFalse(eof.isComment());
        assertFalse(eof.isCharacter());
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testTag_appendTagName_stringAndCharBranches() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("d");
        assertEquals("d", tag.tagName);
        tag.appendTagName("iv");
        assertEquals("div", tag.tagName);
        tag.appendTagName('1');
        assertEquals("div1", tag.tagName);
        assertEquals("div1", tag.name());
    }

    @Test
    public void testTag_nameChainingAndSelfClosing() {
        Token.StartTag tag = new Token.StartTag();
        Token.Tag chained = tag.name("input");
        assertSame(tag, chained);
        assertEquals("input", tag.name());

        assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameEmpty_throwsException() {
        Token.StartTag tag = new Token.StartTag("");
        tag.name();
    }

    @Test
    public void testTag_appendAttributeNameAndValue_normalAndAccumulation() {
        Token.EndTag tag = new Token.EndTag("div");
        assertNull(tag.getAttributes());

        tag.appendAttributeName("cla");
        tag.appendAttributeName("ss");
        tag.appendAttributeName('1');

        tag.appendAttributeValue("btn");
        tag.appendAttributeValue("-primary");
        tag.appendAttributeValue('!');

        tag.newAttribute();

        assertNotNull(tag.getAttributes());
        assertTrue(tag.getAttributes().hasKey("class1"));
        assertEquals("btn-primary!", tag.getAttributes().get("class1"));
    }

    @Test
    public void testTag_newAttribute_withoutValue_createsEmptyValueAttribute() {
        Token.StartTag tag = new Token.StartTag("input");
        tag.appendAttributeName("disabled");
        tag.newAttribute();

        assertTrue(tag.getAttributes().hasKey("disabled"));
        assertEquals("", tag.getAttributes().get("disabled"));
    }

    @Test
    public void testTag_newAttribute_withoutPendingAttributeName_doesNothing() {
        Token.StartTag tag = new Token.StartTag("div");
        int countBefore = tag.getAttributes().size();
        tag.newAttribute();
        assertEquals(countBefore, tag.getAttributes().size());
    }

    @Test
    public void testTag_finaliseTag_withAndWithoutPendingName() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("https://example.com");
        tag.finaliseTag();

        assertTrue(tag.getAttributes().hasKey("href"));
        assertEquals("https://example.com", tag.getAttributes().get("href"));

        tag.finaliseTag();
        assertEquals(1, tag.getAttributes().size());
    }
}
