package org.jsoup.parser;

import org.jsoup.helper.ValidationException;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class TokenTest {

    @Test
    public void testResetStringBuilder_nullInput_doesNotThrow() {
        Token.reset(null);
    }

    @Test
    public void testResetStringBuilder_withContent_clearsBuffer() {
        StringBuilder sb = new StringBuilder("some content");
        Token.reset(sb);
        Assert.assertEquals(0, sb.length());
    }

    @Test
    public void testTokenType_returnsSimpleClassName() {
        Token.Doctype doctype = new Token.Doctype();
        Assert.assertEquals("Doctype", doctype.tokenType());

        Token.StartTag startTag = new Token.StartTag();
        Assert.assertEquals("StartTag", startTag.tokenType());

        Token.EndTag endTag = new Token.EndTag();
        Assert.assertEquals("EndTag", endTag.tokenType());

        Token.Comment comment = new Token.Comment();
        Assert.assertEquals("Comment", comment.tokenType());

        Token.Character character = new Token.Character();
        Assert.assertEquals("Character", character.tokenType());

        Token.EOF eof = new Token.EOF();
        Assert.assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testTypeCheckAndCastMethods_validTokens_correctResults() {
        Token doctype = new Token.Doctype();
        Assert.assertTrue(doctype.isDoctype());
        Assert.assertNotNull(doctype.asDoctype());
        Assert.assertFalse(doctype.isStartTag());
        Assert.assertFalse(doctype.isEndTag());
        Assert.assertFalse(doctype.isComment());
        Assert.assertFalse(doctype.isCharacter());
        Assert.assertFalse(doctype.isEOF());

        Token startTag = new Token.StartTag();
        Assert.assertTrue(startTag.isStartTag());
        Assert.assertNotNull(startTag.asStartTag());
        Assert.assertFalse(startTag.isDoctype());

        Token endTag = new Token.EndTag();
        Assert.assertTrue(endTag.isEndTag());
        Assert.assertNotNull(endTag.asEndTag());
        Assert.assertFalse(endTag.isStartTag());

        Token comment = new Token.Comment();
        Assert.assertTrue(comment.isComment());
        Assert.assertNotNull(comment.asComment());
        Assert.assertFalse(comment.isCharacter());

        Token character = new Token.Character();
        Assert.assertTrue(character.isCharacter());
        Assert.assertNotNull(character.asCharacter());
        Assert.assertFalse(character.isComment());

        Token eof = new Token.EOF();
        Assert.assertTrue(eof.isEOF());
        Assert.assertFalse(eof.isDoctype());
    }

    @Test
    public void testDoctypeToken_gettersAndReset_workCorrectly() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("public-id");
        doctype.systemIdentifier.append("system-id");
        doctype.forceQuirks = true;

        Assert.assertEquals("html", doctype.getName());
        Assert.assertEquals("PUBLIC", doctype.getPubSysKey());
        Assert.assertEquals("public-id", doctype.getPublicIdentifier());
        Assert.assertEquals("system-id", doctype.getSystemIdentifier());
        Assert.assertTrue(doctype.isForceQuirks());

        Token resetToken = doctype.reset();
        Assert.assertSame(doctype, resetToken);
        Assert.assertEquals("", doctype.getName());
        Assert.assertNull(doctype.getPubSysKey());
        Assert.assertEquals("", doctype.getPublicIdentifier());
        Assert.assertEquals("", doctype.getSystemIdentifier());
        Assert.assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testCommentToken_gettersAndReset_workCorrectly() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("This is a comment");
        comment.bogus = true;

        Assert.assertEquals("This is a comment", comment.getData());
        Assert.assertEquals("<!--This is a comment-->", comment.toString());

        Token resetToken = comment.reset();
        Assert.assertSame(comment, resetToken);
        Assert.assertEquals("", comment.getData());
        Assert.assertFalse(comment.bogus);
        Assert.assertEquals("<!---->", comment.toString());
    }

    @Test
    public void testCharacterToken_gettersAndReset_workCorrectly() {
        Token.Character character = new Token.Character();
        character.data("Sample text");

        Assert.assertEquals("Sample text", character.getData());
        Assert.assertEquals("Sample text", character.toString());

        Token resetToken = character.reset();
        Assert.assertSame(character, resetToken);
        Assert.assertNull(character.getData());
        Assert.assertNull(character.toString());
    }

    @Test
    public void testEOFToken_reset_returnsSameInstance() {
        Token.EOF eof = new Token.EOF();
        Token resetToken = eof.reset();
        Assert.assertSame(eof, resetToken);
        Assert.assertTrue(eof.isEOF());
    }

    @Test
    public void testStartTag_nameAttrAndToString_formatsProperly() {
        Token.StartTag startTag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        startTag.nameAttr("DIV", attrs);

        Assert.assertEquals("DIV", startTag.name());
        Assert.assertEquals("div", startTag.normalName());
        Assert.assertEquals("<DIV id=\"main\">", startTag.toString());
        Assert.assertSame(attrs, startTag.getAttributes());

        Token.StartTag emptyAttrTag = new Token.StartTag();
        emptyAttrTag.name("span");
        Assert.assertEquals("<span>", emptyAttrTag.toString());
    }

    @Test
    public void testStartTag_reset_retainsEmptyAttributes() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        startTag.selfClosing = true;
        startTag.attributes.put("key", "val");

        startTag.reset();
        Assert.assertNull(startTag.normalName());
        Assert.assertFalse(startTag.isSelfClosing());
        Assert.assertNotNull(startTag.getAttributes());
        Assert.assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testEndTag_toString_returnsFormattedClosingTag() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("DIV");
        Assert.assertEquals("DIV", endTag.name());
        Assert.assertEquals("div", endTag.normalName());
        Assert.assertEquals("</DIV>", endTag.toString());
    }

    @Test
    public void testTag_nameManagementAndAppendTagName() {
        Token.StartTag tag = new Token.StartTag();

        tag.appendTagName("d");
        tag.appendTagName("iv");
        tag.appendTagName('1');

        Assert.assertEquals("div1", tag.name());
        Assert.assertEquals("div1", tag.normalName());

        tag.name("SPAN");
        Assert.assertEquals("SPAN", tag.name());
        Assert.assertEquals("span", tag.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameThrowsException_whenTagNameNull() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_nameThrowsException_whenTagNameEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("");
        tag.name();
    }

    @Test
    public void testTag_attributesCreation_singleShotValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.newAttribute();

        Assert.assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void testTag_attributesCreation_multiShotValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName('h');
        tag.appendAttributeName("ref");
        tag.appendAttributeValue("http://");
        tag.appendAttributeValue("example.com");
        tag.appendAttributeValue('/');
        tag.appendAttributeValue(new char[]{'t', 'e', 's', 't'});
        tag.appendAttributeValue(new int[]{0x3F, 0x61, 0x3D, 0x31}); // ?a=1
        tag.newAttribute();

        Assert.assertEquals("http://example.com/test?a=1", tag.getAttributes().get("href"));
    }

    @Test
    public void testTag_attributesCreation_emptyAttributeValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("value");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        Assert.assertTrue(tag.getAttributes().hasKey("value"));
        Assert.assertEquals("", tag.getAttributes().get("value"));
    }

    @Test
    public void testTag_attributesCreation_booleanAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("disabled");
        tag.newAttribute();

        Assert.assertTrue(tag.getAttributes().hasKey("disabled"));
        Assert.assertEquals("", tag.getAttributes().get("disabled"));
    }

    @Test
    public void testTag_newAttribute_withNullAttributeName_doesNotAdd() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.newAttribute();
        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTag_finaliseTag_withPendingAttribute_addsAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("class");
        tag.appendAttributeValue("container");
        tag.finaliseTag();

        Assert.assertEquals("container", tag.getAttributes().get("class"));
    }

    @Test
    public void testTag_finaliseTag_withoutPendingAttribute_doesNothing() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.finaliseTag();

        Assert.assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTag_reset_clearsAllState() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("div");
        tag.selfClosing = true;
        tag.appendAttributeName("id");
        tag.appendAttributeValue("test");
        tag.newAttribute();

        tag.reset();
        Assert.assertNull(tag.normalName());
        Assert.assertNull(tag.getAttributes());
        Assert.assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testTokenType_enumValues() {
        Token.TokenType[] types = Token.TokenType.values();
        Assert.assertEquals(6, types.length);
        Assert.assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
        Assert.assertEquals(Token.TokenType.StartTag, Token.TokenType.valueOf("StartTag"));
        Assert.assertEquals(Token.TokenType.EndTag, Token.TokenType.valueOf("EndTag"));
        Assert.assertEquals(Token.TokenType.Comment, Token.TokenType.valueOf("Comment"));
        Assert.assertEquals(Token.TokenType.Character, Token.TokenType.valueOf("Character"));
        Assert.assertEquals(Token.TokenType.EOF, Token.TokenType.valueOf("EOF"));
    }
}
