package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class TokenTest {

    @Before
    public void setUp() {
    }

    // ---------- Doctype tests ----------

    @Test
    public void testDoctype_defaultValues_returnsEmptyStringsAndFalse() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
        assertEquals(Token.TokenType.Doctype, doctype.type);
    }

    @Test
    public void testDoctype_appendToBuilders_returnsExpectedStrings() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("pubId");
        doctype.systemIdentifier.append("sysId");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("pubId", doctype.getPublicIdentifier());
        assertEquals("sysId", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());
    }

    @Test
    public void testTokenType_forDoctype_returnsClassSimpleName() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("Doctype", doctype.tokenType());
    }

    // ---------- StartTag tests ----------

    @Test
    public void testStartTag_defaultConstructor_hasEmptyAttributesAndNullTagName() {
        Token.StartTag startTag = new Token.StartTag();
        assertNotNull(startTag.getAttributes());
        assertEquals(Token.TokenType.StartTag, startTag.type);
        assertNull(startTag.tagName);
        assertFalse(startTag.isSelfClosing());
    }

    @Test
    public void testStartTag_nameConstructor_setsTagName() {
        Token.StartTag startTag = new Token.StartTag("div");
        assertEquals("div", startTag.name());
    }

    @Test
    public void testStartTag_nameAndAttributesConstructor_setsBoth() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Token.StartTag startTag = new Token.StartTag("div", attrs);
        assertEquals("div", startTag.name());
        assertEquals(attrs, startTag.getAttributes());
    }

    @Test
    public void testStartTag_toString_withoutAttributes_returnsSimpleTag() {
        Token.StartTag startTag = new Token.StartTag("br");
        startTag.attributes = new Attributes();
        assertEquals("<br>", startTag.toString());
    }

    @Test
    public void testStartTag_toString_withAttributes_returnsTagWithAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Token.StartTag startTag = new Token.StartTag("div", attrs);
        String result = startTag.toString();
        assertTrue(result.startsWith("<div "));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testStartTag_name_setsAndReturnsTagName() {
        Token.StartTag startTag = new Token.StartTag();
        Token.Tag returned = startTag.name("span");
        assertEquals("span", startTag.name());
        assertSame(startTag, returned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStartTag_name_withEmptyTagName_throwsException() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "";
        startTag.name();
    }

    @Test
    public void testStartTag_appendTagName_withNullInitial_setsTagName() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendTagName("div");
        assertEquals("div", startTag.tagName);
    }

    @Test
    public void testStartTag_appendTagName_withExistingTagName_concatenates() {
        Token.StartTag startTag = new Token.StartTag("di");
        startTag.appendTagName("v");
        assertEquals("div", startTag.tagName);
    }

    @Test
    public void testStartTag_appendTagNameChar_appendsCharacter() {
        Token.StartTag startTag = new Token.StartTag("di");
        startTag.appendTagName('v');
        assertEquals("div", startTag.tagName);
    }

    @Test
    public void testStartTag_isSelfClosing_defaultFalse() {
        Token.StartTag startTag = new Token.StartTag("br");
        assertFalse(startTag.isSelfClosing());
    }

    @Test
    public void testStartTag_selfClosingFlag_setToTrue_returnsTrue() {
        Token.StartTag startTag = new Token.StartTag("br");
        startTag.selfClosing = true;
        assertTrue(startTag.isSelfClosing());
    }

    @Test
    public void testStartTag_newAttribute_withNameOnly_addsAttributeWithEmptyValue() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName("href");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("", attrs.get("href"));
    }

    @Test
    public void testStartTag_newAttribute_withNameAndValue_addsAttributeWithValue() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("http://example.com");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("http://example.com", attrs.get("href"));
    }

    @Test
    public void testStartTag_appendAttributeName_concatenatesMultipleCalls() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName("hr");
        startTag.appendAttributeName("ef");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("", attrs.get("href"));
    }

    @Test
    public void testStartTag_appendAttributeNameChar_appendsCharacter() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName('h');
        startTag.appendAttributeName("ref");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("", attrs.get("href"));
    }

    @Test
    public void testStartTag_appendAttributeValue_concatenatesMultipleCalls() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("http://");
        startTag.appendAttributeValue("example.com");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("http://example.com", attrs.get("href"));
    }

    @Test
    public void testStartTag_appendAttributeValueChar_appendsCharacter() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue('x');
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("x", attrs.get("href"));
    }

    @Test
    public void testStartTag_newAttribute_withoutPendingName_doesNotAddAttribute() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals(0, attrs.size());
    }

    @Test
    public void testStartTag_finaliseTag_withPendingAttribute_addsAttribute() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("test");
        startTag.finaliseTag();
        Attributes attrs = startTag.getAttributes();
        assertEquals("test", attrs.get("href"));
    }

    @Test
    public void testStartTag_finaliseTag_withoutPendingAttribute_doesNothingExtra() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.finaliseTag();
        Attributes attrs = startTag.getAttributes();
        assertEquals(0, attrs.size());
    }

    // ---------- EndTag tests ----------

    @Test
    public void testEndTag_defaultConstructor_hasNullTagNameAndCorrectType() {
        Token.EndTag endTag = new Token.EndTag();
        assertEquals(Token.TokenType.EndTag, endTag.type);
        assertNull(endTag.tagName);
    }

    @Test
    public void testEndTag_nameConstructor_setsTagName() {
        Token.EndTag endTag = new Token.EndTag("div");
        assertEquals("div", endTag.name());
    }

    @Test
    public void testEndTag_toString_returnsClosingTag() {
        Token.EndTag endTag = new Token.EndTag("div");
        assertEquals("</div>", endTag.toString());
    }

    // ---------- Comment tests ----------

    @Test
    public void testComment_defaultData_isEmptyString() {
        Token.Comment comment = new Token.Comment();
        assertEquals("", comment.getData());
        assertEquals(Token.TokenType.Comment, comment.type);
    }

    @Test
    public void testComment_appendData_returnsAppendedString() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("this is a comment");
        assertEquals("this is a comment", comment.getData());
    }

    @Test
    public void testComment_toString_returnsFormattedComment() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("hello");
        assertEquals("<!--hello-->", comment.toString());
    }

    // ---------- Character tests ----------

    @Test
    public void testCharacter_getData_returnsConstructedString() {
        Token.Character character = new Token.Character("some text");
        assertEquals("some text", character.getData());
        assertEquals(Token.TokenType.Character, character.type);
    }

    @Test
    public void testCharacter_getData_withEmptyString_returnsEmptyString() {
        Token.Character character = new Token.Character("");
        assertEquals("", character.getData());
    }

    @Test
    public void testCharacter_toString_returnsData() {
        Token.Character character = new Token.Character("abc");
        assertEquals("abc", character.toString());
    }

    // ---------- EOF tests ----------

    @Test
    public void testEOF_constructor_setsCorrectType() {
        Token.EOF eof = new Token.EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    // ---------- Token is*/as* methods ----------

    @Test
    public void testIsDoctype_withDoctypeToken_returnsTrue() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertSame(doctype, doctype.asDoctype());
    }

    @Test
    public void testIsDoctype_withNonDoctypeToken_returnsFalse() {
        Token.StartTag startTag = new Token.StartTag("div");
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testIsStartTag_withStartTagToken_returnsTrue() {
        Token.StartTag startTag = new Token.StartTag("div");
        assertTrue(startTag.isStartTag());
        assertSame(startTag, startTag.asStartTag());
    }

    @Test
    public void testIsStartTag_withNonStartTagToken_returnsFalse() {
        Token.EndTag endTag = new Token.EndTag("div");
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testIsEndTag_withEndTagToken_returnsTrue() {
        Token.EndTag endTag = new Token.EndTag("div");
        assertTrue(endTag.isEndTag());
        assertSame(endTag, endTag.asEndTag());
    }

    @Test
    public void testIsEndTag_withNonEndTagToken_returnsFalse() {
        Token.StartTag startTag = new Token.StartTag("div");
        assertFalse(startTag.isEndTag());
    }

    @Test
    public void testIsComment_withCommentToken_returnsTrue() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());
    }

    @Test
    public void testIsComment_withNonCommentToken_returnsFalse() {
        Token.EOF eof = new Token.EOF();
        assertFalse(eof.isComment());
    }

    @Test
    public void testIsCharacter_withCharacterToken_returnsTrue() {
        Token.Character character = new Token.Character("text");
        assertTrue(character.isCharacter());
        assertSame(character, character.asCharacter());
    }

    @Test
    public void testIsCharacter_withNonCharacterToken_returnsFalse() {
        Token.EOF eof = new Token.EOF();
        assertFalse(eof.isCharacter());
    }

    @Test
    public void testIsEOF_withEOFToken_returnsTrue() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
    }

    @Test
    public void testIsEOF_withNonEOFToken_returnsFalse() {
        Token.Character character = new Token.Character("text");
        assertFalse(character.isEOF());
    }

    // ---------- TokenType enum ----------

    @Test
    public void testTokenType_valuesAreDefinedCorrectly() {
        Token.TokenType[] values = Token.TokenType.values();
        assertEquals(6, values.length);
        assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
        assertEquals(Token.TokenType.StartTag, Token.TokenType.valueOf("StartTag"));
        assertEquals(Token.TokenType.EndTag, Token.TokenType.valueOf("EndTag"));
        assertEquals(Token.TokenType.Comment, Token.TokenType.valueOf("Comment"));
        assertEquals(Token.TokenType.Character, Token.TokenType.valueOf("Character"));
        assertEquals(Token.TokenType.EOF, Token.TokenType.valueOf("EOF"));
    }
}
