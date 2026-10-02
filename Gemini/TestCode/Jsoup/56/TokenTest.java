package org.jsoup.parser;

import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testToken_resetStringBuilder_nullAndNonNull() {
        Token.reset((StringBuilder) null);

        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    @Test
    public void testToken_typeChecksAndCast_allTypes() {
        Token doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());
        assertNotNull(doctype.asDoctype());
        assertEquals("Doctype", doctype.tokenType());

        Token startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
        assertFalse(startTag.isDoctype());
        assertNotNull(startTag.asStartTag());
        assertEquals("StartTag", startTag.tokenType());

        Token endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
        assertFalse(endTag.isStartTag());
        assertNotNull(endTag.asEndTag());
        assertEquals("EndTag", endTag.tokenType());

        Token comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertFalse(comment.isCharacter());
        assertNotNull(comment.asComment());
        assertEquals("Comment", comment.tokenType());

        Token character = new Token.Character();
        assertTrue(character.isCharacter());
        assertFalse(comment.isCharacter());
        assertNotNull(character.asCharacter());
        assertEquals("Character", character.tokenType());

        Token eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isDoctype());
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testDoctype_gettersAndReset() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("public-id");
        doctype.systemIdentifier.append("system-id");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("public-id", doctype.getPublicIdentifier());
        assertEquals("system-id", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());

        doctype.reset();
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testStartTag_nameAttrAndToString() {
        Token.StartTag startTag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        startTag.nameAttr("DIV", attrs);

        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
        assertEquals(attrs, startTag.getAttributes());
        assertEquals("<DIV id=\"main\">", startTag.toString());

        startTag.reset();
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testStartTag_toStringWithoutAttributes() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("p");
        assertEquals("<p>", startTag.toString());
    }

    @Test
    public void testEndTag_nameAndToString() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("SPAN");
        assertEquals("SPAN", endTag.name());
        assertEquals("span", endTag.normalName());
        assertEquals("</SPAN>", endTag.toString());

        endTag.reset();
        assertNull(endTag.normalName());
        assertNull(endTag.getAttributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameThrowsExceptionWhenNull() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameThrowsExceptionWhenEmpty() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("");
        startTag.name();
    }

    @Test
    public void testTag_appendTagName() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("d");
        tag.appendTagName("iv");
        tag.appendTagName('1');
        assertEquals("div1", tag.name());
        assertEquals("div1", tag.normalName());
    }

    @Test
    public void testTag_appendAttributeName() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("dis");
        tag.appendAttributeName("abled");
        tag.appendAttributeName('2');
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertTrue(attrs.hasKey("disabled2"));
        Attribute attr = attrs.asList().get(0);
        assertTrue(attr instanceof BooleanAttribute);
    }

    @Test
    public void testTag_appendAttributeValueStringAndEnsureValueBranches() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://");
        tag.appendAttributeValue("example.com");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertEquals("http://example.com", attrs.get("href"));
    }

    @Test
    public void testTag_appendAttributeValueSingleStringHit() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("class");
        tag.appendAttributeValue("btn");
        tag.newAttribute();

        assertEquals("btn", tag.getAttributes().get("class"));
    }

    @Test
    public void testTag_appendAttributeValueChars() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        tag.appendAttributeName("title");
        tag.appendAttributeValue('a');
        tag.appendAttributeValue(new char[]{'b', 'c'});
        tag.appendAttributeValue(new int[]{0x64, 0x65}); // 'd', 'e'
        tag.newAttribute();

        assertEquals("abcde", tag.getAttributes().get("title"));
    }

    @Test
    public void testTag_setEmptyAttributeValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("value");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        assertEquals("", tag.getAttributes().get("value"));
    }

    @Test
    public void testTag_finaliseTag() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("id");
        tag.appendAttributeValue("container");
        tag.finaliseTag();

        assertEquals("container", tag.getAttributes().get("id"));

        // Calling finaliseTag when pendingAttributeName is null should do nothing
        tag.finaliseTag();
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testTag_isSelfClosing() {
        Token.StartTag tag = new Token.StartTag();
        assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testTag_newAttributeWithNullPendingName() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertNull(endTag.getAttributes());
        endTag.newAttribute();
        assertNotNull(endTag.getAttributes());
        assertEquals(0, endTag.getAttributes().size());
    }

    @Test
    public void testComment_gettersResetAndToString() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("This is a comment");
        comment.bogus = true;

        assertEquals("This is a comment", comment.getData());
        assertEquals("<!--This is a comment-->", comment.toString());
        assertTrue(comment.bogus);

        comment.reset();
        assertEquals("", comment.getData());
        assertEquals("<!---->", comment.toString());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCharacter_gettersResetAndToString() {
        Token.Character character = new Token.Character();
        character.data("sample text");

        assertEquals("sample text", character.getData());
        assertEquals("sample text", character.toString());

        character.reset();
        assertNull(character.getData());
        assertNull(character.toString());
    }

    @Test
    public void testEOF_reset() {
        Token.EOF eof = new Token.EOF();
        Token result = eof.reset();
        assertSame(eof, result);
    }

    @Test
    public void testTokenType_enumValues() {
        Token.TokenType[] types = Token.TokenType.values();
        assertEquals(6, types.length);
        assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
    }
}
