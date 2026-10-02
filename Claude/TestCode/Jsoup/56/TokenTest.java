package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

public class TokenTest {

    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Doctype doctype;
    private Token.Comment comment;
    private Token.Character character;
    private Token.EOF eof;

    @Before
    public void setUp() {
        startTag = new Token.StartTag();
        endTag = new Token.EndTag();
        doctype = new Token.Doctype();
        comment = new Token.Comment();
        character = new Token.Character();
        eof = new Token.EOF();
    }

    // ---------- tokenType() ----------
    @Test
    public void testTokenType_returnsSimpleClassName() {
        assertEquals("StartTag", startTag.tokenType());
        assertEquals("EndTag", endTag.tokenType());
        assertEquals("Doctype", doctype.tokenType());
        assertEquals("Comment", comment.tokenType());
        assertEquals("Character", character.tokenType());
        assertEquals("EOF", eof.tokenType());
    }

    // ---------- static reset(StringBuilder) ----------
    @Test
    public void testStaticReset_withNullStringBuilder_noException() {
        Token.reset((StringBuilder) null);
        // no exception thrown
        assertTrue(true);
    }

    @Test
    public void testStaticReset_withNonNullStringBuilder_clearsContent() {
        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    // ---------- Doctype ----------
    @Test
    public void testDoctypeReset_resetsAllFields() {
        doctype.name.append("html");
        doctype.publicIdentifier.append("pub");
        doctype.systemIdentifier.append("sys");
        doctype.forceQuirks = true;

        Token result = doctype.reset();

        assertSame(doctype, result);
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeGetName_normalValue() {
        doctype.name.append("html");
        assertEquals("html", doctype.getName());
    }

    @Test
    public void testDoctypeGetName_emptyValue() {
        assertEquals("", doctype.getName());
    }

    @Test
    public void testDoctypeGetPublicIdentifier_normalValue() {
        doctype.publicIdentifier.append("public-id");
        assertEquals("public-id", doctype.getPublicIdentifier());
    }

    @Test
    public void testDoctypeGetSystemIdentifier_normalValue() {
        doctype.systemIdentifier.append("system-id");
        assertEquals("system-id", doctype.getSystemIdentifier());
    }

    @Test
    public void testDoctypeIsForceQuirks_defaultFalse() {
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeIsForceQuirks_setTrue() {
        doctype.forceQuirks = true;
        assertTrue(doctype.isForceQuirks());
    }

    // ---------- Tag (via StartTag/EndTag) ----------
    @Test
    public void testTagName_setsTagNameAndNormalName() {
        startTag.name("DIV");
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_nullTagName_throwsException() {
        startTag.name(null);
        startTag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagName_emptyTagName_throwsException() {
        startTag.name("");
        startTag.name();
    }

    @Test
    public void testTagAppendTagNameString_appendsToExisting() {
        startTag.name("di");
        startTag.appendTagName("v");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTagAppendTagNameString_whenNull_setsAsFirst() {
        startTag.appendTagName("span");
        assertEquals("span", startTag.name());
    }

    @Test
    public void testTagAppendTagNameChar_appendsCharacter() {
        startTag.name("di");
        startTag.appendTagName('v');
        assertEquals("div", startTag.name());
    }

    @Test
    public void testTagAppendAttributeNameString_appendsToExisting() {
        startTag.appendAttributeName("hr");
        startTag.appendAttributeName("ef");
        startTag.appendAttributeValue("test");
        startTag.newAttribute();
        assertNotNull(startTag.getAttributes());
        assertTrue(startTag.getAttributes().hasKey("href"));
    }

    @Test
    public void testTagAppendAttributeNameChar_appendsCharacter() {
        startTag.appendAttributeName('i');
        startTag.appendAttributeName('d');
        startTag.appendAttributeValue("main");
        startTag.newAttribute();
        assertTrue(startTag.getAttributes().hasKey("id"));
    }

    @Test
    public void testTagAppendAttributeValueString_singleShot() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("myclass");
        startTag.newAttribute();
        assertEquals("myclass", startTag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeValueString_secondHitUsesBuilder() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("part1");
        startTag.appendAttributeValue("part2");
        startTag.newAttribute();
        assertEquals("part1part2", startTag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeValueChar_appendsCharacter() {
        startTag.appendAttributeName("data");
        startTag.appendAttributeValue('a');
        startTag.appendAttributeValue('b');
        startTag.newAttribute();
        assertEquals("ab", startTag.getAttributes().get("data"));
    }

    @Test
    public void testTagAppendAttributeValueCharArray_appendsArray() {
        startTag.appendAttributeName("data");
        char[] chars = {'x', 'y', 'z'};
        startTag.appendAttributeValue(chars);
        startTag.newAttribute();
        assertEquals("xyz", startTag.getAttributes().get("data"));
    }

    @Test
    public void testTagAppendAttributeValueIntArray_appendsCodepoints() {
        startTag.appendAttributeName("data");
        int[] codepoints = {'a', 'b', 'c'};
        startTag.appendAttributeValue(codepoints);
        startTag.newAttribute();
        assertEquals("abc", startTag.getAttributes().get("data"));
    }

    @Test
    public void testTagSetEmptyAttributeValue_createsEmptyStringAttribute() {
        startTag.appendAttributeName("disabled");
        startTag.setEmptyAttributeValue();
        startTag.newAttribute();
        assertEquals("", startTag.getAttributes().get("disabled"));
    }

    @Test
    public void testTagNewAttribute_booleanAttribute_whenNoValueSet() {
        startTag.appendAttributeName("checked");
        startTag.newAttribute();
        assertTrue(startTag.getAttributes().hasKey("checked"));
    }

    @Test
    public void testTagNewAttribute_withNullPendingName_doesNotAddAttribute() {
        // no attribute name appended
        startTag.newAttribute();
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testTagFinaliseTag_finalisesPendingAttribute() {
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.finaliseTag();
        assertTrue(startTag.getAttributes().hasKey("id"));
    }

    @Test
    public void testTagFinaliseTag_withoutPendingAttribute_doesNothing() {
        startTag.finaliseTag();
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testTagIsSelfClosing_defaultFalse() {
        assertFalse(startTag.isSelfClosing());
    }

    @Test
    public void testTagIsSelfClosing_setTrue() {
        startTag.selfClosing = true;
        assertTrue(startTag.isSelfClosing());
    }

    @Test
    public void testTagGetAttributes_returnsAttributesObject() {
        assertNotNull(startTag.getAttributes());
    }

    @Test
    public void testTagReset_resetsAllFields() {
        startTag.name("div");
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.newAttribute();
        startTag.selfClosing = true;

        Token.Tag result = startTag.reset();

        assertSame(startTag, result);
        assertNull(startTag.tagName);
        assertNull(startTag.normalName);
        assertFalse(startTag.isSelfClosing());
        assertEquals(0, startTag.getAttributes().size());
    }

    // ---------- StartTag ----------
    @Test
    public void testStartTagReset_reinitialisesAttributes() {
        startTag.name("div");
        startTag.attributes = null;
        Token.Tag result = startTag.reset();
        assertNotNull(((Token.StartTag) result).getAttributes());
    }

    @Test
    public void testStartTagNameAttr_setsNameAndAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Token.StartTag result = startTag.nameAttr("div", attrs);
        assertSame(startTag, result);
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
        assertSame(attrs, startTag.getAttributes());
    }

    @Test
    public void testStartTagToString_withAttributes() {
        startTag.name("div");
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.newAttribute();
        String str = startTag.toString();
        assertTrue(str.startsWith("<div"));
        assertTrue(str.endsWith(">"));
    }

    @Test
    public void testStartTagToString_withoutAttributes() {
        startTag.name("br");
        startTag.attributes = new Attributes(); // empty attributes
        String str = startTag.toString();
        assertEquals("<br>", str);
    }

    @Test
    public void testStartTagToString_withNullAttributes() {
        startTag.name("br");
        startTag.attributes = null;
        String str = startTag.toString();
        assertEquals("<br>", str);
    }

    // ---------- EndTag ----------
    @Test
    public void testEndTagToString_returnsCorrectFormat() {
        endTag.name("div");
        String str = endTag.toString();
        assertEquals("</div>", str);
    }

    // ---------- Comment ----------
    @Test
    public void testCommentReset_resetsData() {
        comment.data.append("some comment");
        comment.bogus = true;
        Token result = comment.reset();
        assertSame(comment, result);
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCommentGetData_returnsCorrectData() {
        comment.data.append("hello");
        assertEquals("hello", comment.getData());
    }

    @Test
    public void testCommentToString_returnsCorrectFormat() {
        comment.data.append("hello");
        assertEquals("<!--hello-->", comment.toString());
    }

    // ---------- Character ----------
    @Test
    public void testCharacterReset_setsDataNull() {
        character.data("abc");
        Token result = character.reset();
        assertSame(character, result);
        assertNull(character.getData());
    }

    @Test
    public void testCharacterDataAndGetData_normalValue() {
        Token.Character result = character.data("abc");
        assertSame(character, result);
        assertEquals("abc", character.getData());
    }

    @Test
    public void testCharacterDataAndGetData_emptyValue() {
        character.data("");
        assertEquals("", character.getData());
    }

    @Test
    public void testCharacterToString_returnsData() {
        character.data("text content");
        assertEquals("text content", character.toString());
    }

    // ---------- EOF ----------
    @Test
    public void testEOFReset_returnsSameInstance() {
        Token result = eof.reset();
        assertSame(eof, result);
    }

    // ---------- Type check helpers ----------
    @Test
    public void testIsDoctype_and_asDoctype() {
        assertTrue(doctype.isDoctype());
        assertSame(doctype, doctype.asDoctype());
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testIsStartTag_and_asStartTag() {
        assertTrue(startTag.isStartTag());
        assertSame(startTag, startTag.asStartTag());
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testIsEndTag_and_asEndTag() {
        assertTrue(endTag.isEndTag());
        assertSame(endTag, endTag.asEndTag());
        assertFalse(startTag.isEndTag());
    }

    @Test
    public void testIsComment_and_asComment() {
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());
        assertFalse(doctype.isComment());
    }

    @Test
    public void testIsCharacter_and_asCharacter() {
        assertTrue(character.isCharacter());
        assertSame(character, character.asCharacter());
        assertFalse(comment.isCharacter());
    }

    @Test
    public void testIsEOF_returnsTrueForEOF() {
        assertTrue(eof.isEOF());
        assertFalse(character.isEOF());
    }

    // ---------- Cast exceptions ----------
    @Test(expected = ClassCastException.class)
    public void testAsDoctype_wrongType_throwsClassCastException() {
        Token token = startTag;
        Token.Doctype d = token.asDoctype();
    }

    @Test(expected = ClassCastException.class)
    public void testAsStartTag_wrongType_throwsClassCastException() {
        Token token = doctype;
        Token.StartTag s = token.asStartTag();
    }

    @Test(expected = ClassCastException.class)
    public void testAsEndTag_wrongType_throwsClassCastException() {
        Token token = doctype;
        Token.EndTag e = token.asEndTag();
    }

    @Test(expected = ClassCastException.class)
    public void testAsComment_wrongType_throwsClassCastException() {
        Token token = doctype;
        Token.Comment c = token.asComment();
    }

    @Test(expected = ClassCastException.class)
    public void testAsCharacter_wrongType_throwsClassCastException() {
        Token token = doctype;
        Token.Character ch = token.asCharacter();
    }
}
