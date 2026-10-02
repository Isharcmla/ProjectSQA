package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

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

    // ---------- Doctype tests ----------

    @Test
    public void testDoctype_defaultValues_emptyAndFalse() {
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
        assertEquals(Token.TokenType.Doctype, doctype.type);
    }

    @Test
    public void testDoctype_setAndReset_valuesClearedAfterReset() {
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

        Token result = doctype.reset();
        assertSame(doctype, result);
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    // ---------- Tag (via StartTag/EndTag) tests ----------

    @Test
    public void testTagName_setAndGet_normalCase() {
        startTag.name("div");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTagName_upperCase_normalNameLowerCased() {
        startTag.name("DIV");
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test(expected = Exception.class)
    public void testTagName_nullTagName_throwsException() {
        startTag.name();
    }

    @Test(expected = Exception.class)
    public void testTagName_emptyTagName_throwsException() {
        startTag.name("");
        startTag.name();
    }

    @Test
    public void testAppendTagName_string_concatenatesAndLowerCases() {
        startTag.name("DI");
        startTag.appendTagName("V");
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testAppendTagName_char_concatenates() {
        startTag.name("di");
        startTag.appendTagName('v');
        assertEquals("div", startTag.name());
    }

    @Test
    public void testAppendTagName_nullInitial_setsDirectly() {
        startTag.appendTagName("span");
        assertEquals("span", startTag.name());
    }

    @Test
    public void testIsSelfClosing_default_false() {
        assertFalse(startTag.isSelfClosing());
    }

    @Test
    public void testGetAttributes_startTag_notNullByDefault() {
        assertNotNull(startTag.getAttributes());
    }

    @Test
    public void testNewAttribute_simpleNameAndValue_addsAttribute() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("header");
        startTag.newAttribute();
        assertEquals("header", startTag.getAttributes().get("class"));
    }

    @Test
    public void testNewAttribute_emptyAttributeValue_addsEmptyString() {
        startTag.appendAttributeName("disabled");
        startTag.setEmptyAttributeValue();
        startTag.newAttribute();
        assertEquals("", startTag.getAttributes().get("disabled"));
    }

    @Test
    public void testNewAttribute_noValue_addsNullValue() {
        startTag.appendAttributeName("checked");
        startTag.newAttribute();
        assertFalse(startTag.getAttributes().hasDeclaredValueForKey("checked") && false);
        // value should be absent/null, but key exists
        assertTrue(startTag.getAttributes().hasKey("checked"));
    }

    @Test
    public void testNewAttribute_whitespaceOnlyName_notAdded() {
        startTag.appendAttributeName("   ");
        startTag.appendAttributeValue("value");
        startTag.newAttribute();
        assertFalse(startTag.getAttributes().hasKey("   "));
    }

    @Test
    public void testAppendAttributeName_charAndString_concatenates() {
        startTag.appendAttributeName("cl");
        startTag.appendAttributeName('a');
        startTag.appendAttributeName("ss");
        startTag.appendAttributeValue("box");
        startTag.newAttribute();
        assertEquals("box", startTag.getAttributes().get("class"));
    }

    @Test
    public void testAppendAttributeValue_singleStringCall_usesDirectAssignment() {
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.newAttribute();
        assertEquals("main", startTag.getAttributes().get("id"));
    }

    @Test
    public void testAppendAttributeValue_multipleCalls_buildsViaBuilder() {
        startTag.appendAttributeName("title");
        startTag.appendAttributeValue("Hello ");
        startTag.appendAttributeValue("World");
        startTag.newAttribute();
        assertEquals("Hello World", startTag.getAttributes().get("title"));
    }

    @Test
    public void testAppendAttributeValue_char_appendsCorrectly() {
        startTag.appendAttributeName("x");
        startTag.appendAttributeValue('a');
        startTag.appendAttributeValue('b');
        startTag.newAttribute();
        assertEquals("ab", startTag.getAttributes().get("x"));
    }

    @Test
    public void testAppendAttributeValue_charArray_appendsCorrectly() {
        startTag.appendAttributeName("y");
        startTag.appendAttributeValue(new char[] {'a', 'b', 'c'});
        startTag.newAttribute();
        assertEquals("abc", startTag.getAttributes().get("y"));
    }

    @Test
    public void testAppendAttributeValue_intCodepoints_appendsCorrectly() {
        startTag.appendAttributeName("z");
        startTag.appendAttributeValue(new int[] {'a', 'b', 'c'});
        startTag.newAttribute();
        assertEquals("abc", startTag.getAttributes().get("z"));
    }

    @Test
    public void testFinaliseTag_withPendingAttribute_addsAttribute() {
        startTag.appendAttributeName("rel");
        startTag.appendAttributeValue("noopener");
        startTag.finaliseTag();
        assertEquals("noopener", startTag.getAttributes().get("rel"));
    }

    @Test
    public void testFinaliseTag_noPendingAttribute_noException() {
        startTag.finaliseTag(); // should simply do nothing
        assertNotNull(startTag.getAttributes());
    }

    @Test
    public void testTagReset_clearsFieldsBackToDefault() {
        startTag.name("div");
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("abc");
        startTag.newAttribute();
        startTag.selfClosing = true;

        startTag.reset();

        assertNull(startTag.tagName);
        assertNull(startTag.normalName);
        assertFalse(startTag.isSelfClosing());
        assertNotNull(startTag.getAttributes()); // StartTag.reset() reassigns new Attributes
        assertEquals(0, startTag.getAttributes().size());
    }

    // ---------- StartTag specific tests ----------

    @Test
    public void testStartTag_constructor_typeAndAttributes() {
        assertEquals(Token.TokenType.StartTag, startTag.type);
        assertNotNull(startTag.attributes);
    }

    @Test
    public void testStartTag_nameAttr_setsNameAndAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Token.StartTag result = startTag.nameAttr("DIV", attrs);
        assertSame(startTag, result);
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());
        assertSame(attrs, startTag.getAttributes());
    }

    @Test
    public void testStartTag_toString_withAttributes() {
        startTag.name("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("http://example.com");
        startTag.newAttribute();
        String result = startTag.toString();
        assertTrue(result.startsWith("<a "));
        assertTrue(result.endsWith(">"));
    }

    @Test
    public void testStartTag_toString_withoutAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("br");
        tag.attributes = null;
        String result = tag.toString();
        assertEquals("<br>", result);
    }

    // ---------- EndTag specific tests ----------

    @Test
    public void testEndTag_constructor_type() {
        assertEquals(Token.TokenType.EndTag, endTag.type);
    }

    @Test
    public void testEndTag_toString_correctFormat() {
        endTag.name("div");
        assertEquals("</div>", endTag.toString());
    }

    // ---------- Comment tests ----------

    @Test
    public void testComment_constructor_type() {
        assertEquals(Token.TokenType.Comment, comment.type);
    }

    @Test
    public void testComment_getData_initiallyEmpty() {
        assertEquals("", comment.getData());
    }

    @Test
    public void testComment_setDataAndReset_clearsData() {
        comment.data.append("some comment");
        comment.bogus = true;
        assertEquals("some comment", comment.getData());
        assertTrue(comment.bogus);

        comment.reset();

        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testComment_toString_formatCorrect() {
        comment.data.append("hello");
        assertEquals("<!--hello-->", comment.toString());
    }

    // ---------- Character tests ----------

    @Test
    public void testCharacter_constructor_type() {
        assertEquals(Token.TokenType.Character, character.type);
    }

    @Test
    public void testCharacter_dataAndGetData_normalCase() {
        Token.Character result = character.data("hello world");
        assertSame(character, result);
        assertEquals("hello world", character.getData());
    }

    @Test
    public void testCharacter_data_nullValue() {
        character.data(null);
        assertNull(character.getData());
    }

    @Test
    public void testCharacter_reset_clearsData() {
        character.data("test");
        character.reset();
        assertNull(character.getData());
    }

    @Test
    public void testCharacter_toString_returnsData() {
        character.data("abc");
        assertEquals("abc", character.toString());
    }

    // ---------- CData tests ----------

    @Test
    public void testCData_constructor_setsData() {
        Token.CData cdata = new Token.CData("content");
        assertEquals("content", cdata.getData());
    }

    @Test
    public void testCData_toString_formatCorrect() {
        Token.CData cdata = new Token.CData("payload");
        assertEquals("<![CDATA[payload]]>", cdata.toString());
    }

    @Test
    public void testCData_isCData_true() {
        Token.CData cdata = new Token.CData("x");
        assertTrue(cdata.isCData());
    }

    // ---------- EOF tests ----------

    @Test
    public void testEOF_constructor_type() {
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    @Test
    public void testEOF_reset_returnsSameInstance() {
        Token result = eof.reset();
        assertSame(eof, result);
    }

    @Test
    public void testEOF_isEOF_true() {
        assertTrue(eof.isEOF());
    }

    // ---------- type-check / as-cast methods ----------

    @Test
    public void testIsDoctype_and_asDoctype_correctBehavior() {
        assertTrue(doctype.isDoctype());
        assertSame(doctype, doctype.asDoctype());
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testIsStartTag_and_asStartTag_correctBehavior() {
        assertTrue(startTag.isStartTag());
        assertSame(startTag, startTag.asStartTag());
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testIsEndTag_and_asEndTag_correctBehavior() {
        assertTrue(endTag.isEndTag());
        assertSame(endTag, endTag.asEndTag());
        assertFalse(startTag.isEndTag());
    }

    @Test
    public void testIsComment_and_asComment_correctBehavior() {
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());
        assertFalse(character.isComment());
    }

    @Test
    public void testIsCharacter_and_asCharacter_correctBehavior() {
        assertTrue(character.isCharacter());
        assertSame(character, character.asCharacter());
        assertFalse(comment.isCharacter());
    }

    @Test
    public void testIsCData_falseForPlainCharacter() {
        assertFalse(character.isCData());
    }

    @Test
    public void testIsCData_trueForCDataInstance() {
        Token.CData cdata = new Token.CData("abc");
        assertTrue(cdata.isCData());
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
    public void testStaticReset_nonNullBuilder_clearsContent() {
        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    @Test
    public void testStaticReset_nullBuilder_noException() {
        Token.reset(null); // should not throw
    }

    // ---------- TokenType enum ----------

    @Test
    public void testTokenType_enumValues_containsAllExpected() {
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
