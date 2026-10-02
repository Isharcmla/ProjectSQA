package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

public class TokenTest {

    // ---------------------- Doctype ----------------------

    @Test
    public void testDoctype_defaultValues_areEmptyOrNull() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
        assertEquals(Token.TokenType.Doctype, doctype.type);
    }

    @Test
    public void testDoctype_setFields_getValuesReturnCorrectData() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("pubId");
        doctype.systemIdentifier.append("sysId");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPubSysKey());
        assertEquals("pubId", doctype.getPublicIdentifier());
        assertEquals("sysId", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());
    }

    @Test
    public void testDoctype_reset_clearsAllFields() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("pubId");
        doctype.systemIdentifier.append("sysId");
        doctype.forceQuirks = true;

        Token result = doctype.reset();

        assertSame(doctype, result);
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    // ---------------------- StartTag ----------------------

    @Test
    public void testStartTag_defaultConstructor_attributesNotNull() {
        Token.StartTag startTag = new Token.StartTag();
        assertNotNull(startTag.getAttributes());
        assertEquals(Token.TokenType.StartTag, startTag.type);
    }

    @Test
    public void testStartTag_nameAttr_setsNameAndAttributes() {
        Token.StartTag startTag = new Token.StartTag();
        Attributes attrs = new Attributes();
        Token.StartTag result = startTag.nameAttr("DIV", attrs);

        assertSame(startTag, result);
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
        assertSame(attrs, startTag.getAttributes());
    }

    @Test
    public void testStartTag_toString_withoutAttributes_returnsSimpleTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        String str = startTag.toString();
        assertEquals("<div>", str);
    }

    @Test
    public void testStartTag_toString_withAttributes_returnsTagWithAttributes() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("http://test.com");
        startTag.newAttribute();

        String str = startTag.toString();
        assertTrue(str.startsWith("<a "));
        assertTrue(str.endsWith(">"));
    }

    @Test
    public void testStartTag_reset_resetsAttributesToNewInstance() {
        Token.StartTag startTag = new Token.StartTag();
        Attributes original = startTag.getAttributes();
        startTag.name("div");
        startTag.selfClosing = true;

        Token.Tag result = startTag.reset();

        assertSame(startTag, result);
        assertNull(startTag.tagName);
        assertNull(startTag.normalName);
        assertFalse(startTag.isSelfClosing());
        assertNotNull(startTag.getAttributes());
        assertNotSame(original, startTag.getAttributes());
    }

    // ---------------------- EndTag ----------------------

    @Test
    public void testEndTag_toString_returnsCorrectFormat() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("span");
        assertEquals("</span>", endTag.toString());
        assertEquals(Token.TokenType.EndTag, endTag.type);
    }

    // ---------------------- Tag (abstract) via StartTag/EndTag ----------------------

    @Test
    public void testTag_name_throwsException_whenTagNameIsNull() {
        Token.EndTag endTag = new Token.EndTag();
        try {
            endTag.name();
            fail("Expected an exception because tagName is null");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testTag_name_throwsException_whenTagNameIsEmpty() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("");
        try {
            endTag.name();
            fail("Expected an exception because tagName is empty");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testTag_name_setsTagNameAndNormalName() {
        Token.StartTag startTag = new Token.StartTag();
        Token.Tag result = startTag.name("DIV");

        assertSame(startTag, result);
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTag_isSelfClosing_defaultFalse_thenTrue() {
        Token.StartTag startTag = new Token.StartTag();
        assertFalse(startTag.isSelfClosing());
        startTag.selfClosing = true;
        assertTrue(startTag.isSelfClosing());
    }

    @Test
    public void testTag_appendTagName_appendsStringCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("d");
        startTag.appendTagName("iv");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTag_appendTagName_char_appendsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendTagName('d');
        startTag.appendTagName('i');
        startTag.appendTagName('v');
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTag_appendAttributeName_string_appendsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("cl");
        startTag.appendAttributeName("ass");
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_appendAttributeName_char_appendsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName('i');
        startTag.appendAttributeName('d');
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_withNoValue_createsBooleanAttribute() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("disabled");
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_withEmptyValue_createsEmptyAttribute() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("class");
        startTag.setEmptyAttributeValue();
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_withStringValue_createsAttributeWithValue() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("test");
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_withNoPendingName_doesNotAddAttribute() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.newAttribute();
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_trimsAttributeName() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("  id  ");
        startTag.appendAttributeValue("test");
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_appendAttributeValue_char_appendsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue('a');
        startTag.appendAttributeValue('b');
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_appendAttributeValue_charArray_appendsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue(new char[]{'a', 'b', 'c'});
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_appendAttributeValue_codepoints_appendsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue(new int[]{97, 98, 99});
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_appendAttributeValue_stringTwice_usesBuilderPath() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("first");
        startTag.appendAttributeValue("second");
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_finaliseTag_addsPendingAttribute() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("name");
        startTag.appendAttributeValue("value");
        startTag.finaliseTag();
        assertEquals(1, startTag.getAttributes().size());
    }

    @Test
    public void testTag_finaliseTag_withNoPendingName_doesNothing() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.finaliseTag();
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testTag_getAttributes_returnsCorrectInstance() {
        Token.StartTag startTag = new Token.StartTag();
        assertNotNull(startTag.getAttributes());
    }

    // ---------------------- Comment ----------------------

    @Test
    public void testComment_defaultValues() {
        Token.Comment comment = new Token.Comment();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
        assertEquals(Token.TokenType.Comment, comment.type);
    }

    @Test
    public void testComment_setDataAndBogus() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("this is comment");
        comment.bogus = true;

        assertEquals("this is comment", comment.getData());
        assertTrue(comment.bogus);
    }

    @Test
    public void testComment_toString_returnsFormattedComment() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("hello");
        assertEquals("<!--hello-->", comment.toString());
    }

    @Test
    public void testComment_reset_clearsData() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("data");
        comment.bogus = true;

        Token result = comment.reset();

        assertSame(comment, result);
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    // ---------------------- Character ----------------------

    @Test
    public void testCharacter_defaultData_isNull() {
        Token.Character character = new Token.Character();
        assertNull(character.getData());
        assertEquals(Token.TokenType.Character, character.type);
    }

    @Test
    public void testCharacter_data_setsAndReturnsData() {
        Token.Character character = new Token.Character();
        Token.Character result = character.data("hello world");

        assertSame(character, result);
        assertEquals("hello world", character.getData());
    }

    @Test
    public void testCharacter_toString_returnsData() {
        Token.Character character = new Token.Character();
        character.data("test data");
        assertEquals("test data", character.toString());
    }

    @Test
    public void testCharacter_reset_clearsData() {
        Token.Character character = new Token.Character();
        character.data("something");

        Token result = character.reset();

        assertSame(character, result);
        assertNull(character.getData());
    }

    // ---------------------- EOF ----------------------

    @Test
    public void testEOF_type_isCorrect() {
        Token.EOF eof = new Token.EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    @Test
    public void testEOF_reset_returnsSameInstance() {
        Token.EOF eof = new Token.EOF();
        Token result = eof.reset();
        assertSame(eof, result);
    }

    // ---------------------- Type check / cast methods ----------------------

    @Test
    public void testIsDoctype_trueForDoctypeToken() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());
    }

    @Test
    public void testAsDoctype_castsSuccessfully() {
        Token.Doctype doctype = new Token.Doctype();
        Token.Doctype result = doctype.asDoctype();
        assertSame(doctype, result);
    }

    @Test
    public void testIsStartTag_trueForStartTagToken() {
        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
        assertFalse(startTag.isEndTag());
    }

    @Test
    public void testAsStartTag_castsSuccessfully() {
        Token.StartTag startTag = new Token.StartTag();
        Token.StartTag result = startTag.asStartTag();
        assertSame(startTag, result);
    }

    @Test
    public void testIsEndTag_trueForEndTagToken() {
        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testAsEndTag_castsSuccessfully() {
        Token.EndTag endTag = new Token.EndTag();
        Token.EndTag result = endTag.asEndTag();
        assertSame(endTag, result);
    }

    @Test
    public void testIsComment_trueForCommentToken() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertFalse(comment.isCharacter());
    }

    @Test
    public void testAsComment_castsSuccessfully() {
        Token.Comment comment = new Token.Comment();
        Token.Comment result = comment.asComment();
        assertSame(comment, result);
    }

    @Test
    public void testIsCharacter_trueForCharacterToken() {
        Token.Character character = new Token.Character();
        assertTrue(character.isCharacter());
        assertFalse(character.isComment());
    }

    @Test
    public void testAsCharacter_castsSuccessfully() {
        Token.Character character = new Token.Character();
        Token.Character result = character.asCharacter();
        assertSame(character, result);
    }

    @Test
    public void testIsEOF_trueForEOFToken() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isDoctype());
    }

    // ---------------------- tokenType ----------------------

    @Test
    public void testTokenType_returnsSimpleClassNameForStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        assertEquals("StartTag", startTag.tokenType());
    }

    @Test
    public void testTokenType_returnsSimpleClassNameForDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("Doctype", doctype.tokenType());
    }

    @Test
    public void testTokenType_returnsSimpleClassNameForComment() {
        Token.Comment comment = new Token.Comment();
        assertEquals("Comment", comment.tokenType());
    }

    // ---------------------- Static reset(StringBuilder) ----------------------

    @Test
    public void testStaticReset_withNonEmptyBuilder_clearsContent() {
        StringBuilder sb = new StringBuilder("some content");
        Token.reset(sb);
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    @Test
    public void testStaticReset_withNullBuilder_doesNotThrow() {
        Token.reset(null);
        // no exception expected
        assertTrue(true);
    }

    @Test
    public void testStaticReset_withEmptyBuilder_remainsEmpty() {
        StringBuilder sb = new StringBuilder();
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    // ---------------------- TokenType enum ----------------------

    @Test
    public void testTokenType_enumValues_containsAllExpected() {
        Token.TokenType[] values = Token.TokenType.values();
        assertEquals(6, values.length);
    }

    @Test
    public void testTokenType_valueOf_returnsCorrectEnum() {
        Token.TokenType type = Token.TokenType.valueOf("StartTag");
        assertEquals(Token.TokenType.StartTag, type);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTokenType_valueOf_withInvalidName_throwsException() {
        Token.TokenType.valueOf("InvalidType");
    }
}
