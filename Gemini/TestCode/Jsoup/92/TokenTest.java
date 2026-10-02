package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testResetStringBuilder_nullAndNonNull_resetsProperly() {
        Token.reset((StringBuilder) null); // should not throw NPE

        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    @Test
    public void testTokenType_returnsSimpleClassName() {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("Doctype", doctype.tokenType());

        Token.StartTag startTag = new Token.StartTag();
        assertEquals("StartTag", startTag.tokenType());

        Token.EndTag endTag = new Token.EndTag();
        assertEquals("EndTag", endTag.tokenType());

        Token.Comment comment = new Token.Comment();
        assertEquals("Comment", comment.tokenType());

        Token.Character character = new Token.Character();
        assertEquals("Character", character.tokenType());

        Token.CData cdata = new Token.CData("data");
        assertEquals("CData", cdata.tokenType());

        Token.EOF eof = new Token.EOF();
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testTypeCheckAndCastMethods_allTokens_correctFlagsAndCasts() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isCData());
        assertFalse(doctype.isEOF());
        assertSame(doctype, doctype.asDoctype());

        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
        assertFalse(startTag.isDoctype());
        assertSame(startTag, startTag.asStartTag());

        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
        assertFalse(endTag.isStartTag());
        assertSame(endTag, endTag.asEndTag());

        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertFalse(comment.isCharacter());
        assertSame(comment, comment.asComment());

        Token.Character character = new Token.Character();
        assertTrue(character.isCharacter());
        assertFalse(character.isCData());
        assertFalse(character.isComment());
        assertSame(character, character.asCharacter());

        Token.CData cdata = new Token.CData("test");
        assertTrue(cdata.isCharacter());
        assertTrue(cdata.isCData());

        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isCharacter());
    }

    @Test
    public void testDoctype_gettersSettersAndReset_workCorrectly() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("pub-id");
        doctype.systemIdentifier.append("sys-id");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPubSysKey());
        assertEquals("pub-id", doctype.getPublicIdentifier());
        assertEquals("sys-id", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());

        doctype.reset();
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
        assertEquals(Token.TokenType.Doctype, doctype.type);
    }

    @Test
    public void testTag_nameAndNormalName_preservesAndNormalizesCase() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("DIV");

        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());
        assertFalse(tag.isSelfClosing());

        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameNull_throwsException() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameEmpty_throwsException() {
        Token.StartTag tag = new Token.StartTag();
        tag.tagName = "";
        tag.name();
    }

    @Test
    public void testTag_appendTagName_appendsCorrectly() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("d");
        tag.appendTagName("iv");
        tag.appendTagName('1');

        assertEquals("div1", tag.name());
        assertEquals("div1", tag.normalName());
    }

    @Test
    public void testTag_attributeNameAndValue_oneShotValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals("http://example.com", attrs.get("href"));
    }

    @Test
    public void testTag_attributeNameAndValue_accumulatedValueAndCharVariants() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName('v');
        tag.appendAttributeName("al");
        tag.appendAttributeValue("a");
        tag.appendAttributeValue('b');
        tag.appendAttributeValue(new char[]{'c', 'd'});
        tag.appendAttributeValue(new int[]{0x65, 0x66}); // 'e', 'f'
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals("abcdef", attrs.get("val"));
    }

    @Test
    public void testTag_attributeEmptyValue_setsEmptyString() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("option");
        tag.appendAttributeName("selected");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals("", attrs.get("selected"));
    }

    @Test
    public void testTag_attributeBooleanNullValue_setsNull() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("disabled");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertTrue(attrs.hasKey("disabled"));
        assertEquals("", attrs.get("disabled"));
    }

    @Test
    public void testTag_newAttribute_withWhitespaceName_ignoresAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("   ");
        tag.newAttribute();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals(0, attrs.size());
    }

    @Test
    public void testTag_newAttribute_withNullAttributeName_doesNothing() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.newAttribute();

        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTag_finaliseTag_createsPendingAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("class");
        tag.appendAttributeValue("container");
        tag.finaliseTag();

        Attributes attrs = tag.getAttributes();
        assertNotNull(attrs);
        assertEquals("container", attrs.get("class"));

        // Second call when pendingAttributeName is null
        tag.finaliseTag();
        assertEquals(1, attrs.size());
    }

    @Test
    public void testTag_newAttributeWhenAttributesNull_createsAttributes() {
        Token.EndTag tag = new Token.EndTag();
        assertNull(tag.getAttributes());
        tag.appendAttributeName("id");
        tag.appendAttributeValue("test");
        tag.newAttribute();

        assertNotNull(tag.getAttributes());
        assertEquals("test", tag.getAttributes().get("id"));
    }

    @Test
    public void testStartTag_nameAttrAndToString() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("span");
        assertEquals("<span>", startTag.toString());

        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        startTag.nameAttr("p", attrs);

        assertEquals("p", startTag.name());
        assertEquals("p", startTag.normalName());
        assertEquals("<p id=\"main\">", startTag.toString());

        startTag.reset();
        assertEquals(Token.TokenType.StartTag, startTag.type);
        assertNotNull(startTag.getAttributes());
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testStartTag_toString_attributesNullOrEmpty() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        startTag.attributes = null;
        assertEquals("<div>", startTag.toString());

        startTag.attributes = new Attributes();
        assertEquals("<div>", startTag.toString());
    }

    @Test
    public void testEndTag_toString() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertEquals("</div>", endTag.toString());
    }

    @Test
    public void testComment_dataAndToStringAndReset() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("This is a comment");
        comment.bogus = true;

        assertEquals("This is a comment", comment.getData());
        assertEquals("<!--This is a comment-->", comment.toString());
        assertTrue(comment.bogus);

        comment.reset();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
        assertEquals(Token.TokenType.Comment, comment.type);
    }

    @Test
    public void testCharacter_dataAndToStringAndReset() {
        Token.Character character = new Token.Character();
        character.data("sample text");

        assertEquals("sample text", character.getData());
        assertEquals("sample text", character.toString());

        character.reset();
        assertNull(character.getData());
        assertEquals(Token.TokenType.Character, character.type);
    }

    @Test
    public void testCData_toString() {
        Token.CData cdata = new Token.CData("cdata text");
        assertEquals("cdata text", cdata.getData());
        assertEquals("<![CDATA[cdata text]]>", cdata.toString());
        assertTrue(cdata.isCData());
        assertTrue(cdata.isCharacter());
    }

    @Test
    public void testEOF_reset() {
        Token.EOF eof = new Token.EOF();
        assertSame(eof, eof.reset());
        assertTrue(eof.isEOF());
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    @Test
    public void testTokenTypeEnum_valuesAndValueOf() {
        for (Token.TokenType type : Token.TokenType.values()) {
            assertNotNull(Token.TokenType.valueOf(type.name()));
        }
        assertEquals(6, Token.TokenType.values().length);
    }
}
