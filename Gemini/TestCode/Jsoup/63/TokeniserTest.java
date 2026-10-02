package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserTest {

    @Test
    public void testRead_simpleCharacterTokens() {
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        Token t1 = tokeniser.read();
        assertEquals(Token.TokenType.Character, t1.type);
        assertEquals("abc", ((Token.Character) t1).getData());

        Token t2 = tokeniser.read();
        assertEquals(Token.TokenType.EOF, t2.type);
    }

    @Test
    public void testRead_singleEmitString() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        tokeniser.emit("hello");
        Token.EOF eof = new Token.EOF();
        tokeniser.emit(eof);

        Token t1 = tokeniser.read();
        assertEquals(Token.TokenType.Character, t1.type);
        assertEquals("hello", ((Token.Character) t1).getData());

        Token t2 = tokeniser.read();
        assertSame(eof, t2);
    }

    @Test
    public void testRead_multipleEmitString_usesCharsBuilder() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        tokeniser.emit("foo");
        tokeniser.emit("bar");
        tokeniser.emit("baz");
        Token.EOF eof = new Token.EOF();
        tokeniser.emit(eof);

        Token t1 = tokeniser.read();
        assertEquals(Token.TokenType.Character, t1.type);
        assertEquals("foobarbaz", ((Token.Character) t1).getData());

        Token t2 = tokeniser.read();
        assertSame(eof, t2);
    }

    @Test
    public void testRead_unacknowledgedSelfClosingFlag_logsError() {
        CharacterReader reader = new CharacterReader("<div></div>");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;
        tokeniser.emit(startTag);

        Token t1 = tokeniser.read();
        assertSame(startTag, t1);

        // Next read without acknowledging self closing flag
        Token.EOF eof = new Token.EOF();
        tokeniser.emit(eof);
        Token t2 = tokeniser.read();
        assertSame(eof, t2);

        assertTrue(errors.size() > 0);
        assertTrue(errors.get(0).getErrorMessage().contains("Self closing flag not acknowledged"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmit_duplicatePendingToken_throwsException() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        tokeniser.emit(new Token.StartTag());
        tokeniser.emit(new Token.EndTag());
    }

    @Test
    public void testEmit_endTagWithAttributes_logsError() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        endTag.attributes = new org.jsoup.nodes.Attributes();
        endTag.attributes.put("class", "error");

        tokeniser.emit(endTag);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Attributes incorrectly present on end tag"));
    }

    @Test
    public void testEmit_charArray_intCodepoints_andChar() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        tokeniser.emit(new char[]{'a', 'b'});
        tokeniser.emit(new int[]{0x63, 0x64}); // 'c', 'd'
        tokeniser.emit('e');
        tokeniser.emit(new Token.EOF());

        Token t = tokeniser.read();
        assertEquals(Token.TokenType.Character, t.type);
        assertEquals("abcde", ((Token.Character) t).getData());
    }

    @Test
    public void testStateAndTransitions() {
        CharacterReader reader = new CharacterReader("test");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        assertEquals(TokeniserState.Data, tokeniser.getState());

        tokeniser.transition(TokeniserState.TagOpen);
        assertEquals(TokeniserState.TagOpen, tokeniser.getState());

        tokeniser.advanceTransition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
        assertEquals('e', reader.current());
    }

    @Test
    public void testAcknowledgeSelfClosingFlag() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing = true;
        tokeniser.emit(startTag);

        tokeniser.read();
        tokeniser.acknowledgeSelfClosingFlag();

        tokeniser.emit(new Token.EOF());
        tokeniser.read();

        assertEquals(0, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_emptyReader_returnsNull() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_additionalAllowedChar_returnsNull() {
        CharacterReader reader = new CharacterReader("\"foo");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        int[] result = tokeniser.consumeCharacterReference('\"', true);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_notCharRefChars_returnsNull() {
        CharacterReader reader = new CharacterReader("   ");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_numericHex_valid() {
        CharacterReader reader = new CharacterReader("#x41;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(0x41, result[0]);
        assertEquals(0, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_numericHex_missingSemicolon() {
        CharacterReader reader = new CharacterReader("#x41 ");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(0x41, result[0]);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_numericDec_valid() {
        CharacterReader reader = new CharacterReader("#65;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(65, result[0]);
    }

    @Test
    public void testConsumeCharacterReference_numeric_noNumerals() {
        CharacterReader reader = new CharacterReader("#;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
    }

    @Test
    public void testConsumeCharacterReference_numeric_outOfRange() {
        CharacterReader reader = new CharacterReader("#xD800;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Tokeniser.replacementChar, (char) result[0]);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));

        // Test over 0x10FFFF
        reader = new CharacterReader("#x110000;");
        tokeniser = new Tokeniser(reader, errors);
        result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Tokeniser.replacementChar, (char) result[0]);
    }

    @Test
    public void testConsumeCharacterReference_named_validSingle() {
        CharacterReader reader = new CharacterReader("amp;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals('&', (char) result[0]);
    }

    @Test
    public void testConsumeCharacterReference_named_validMulti() {
        CharacterReader reader = new CharacterReader("NotEqualTilde;");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    @Test
    public void testConsumeCharacterReference_named_missingSemicolon_baseEntity() {
        CharacterReader reader = new CharacterReader("gt ");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals('>', (char) result[0]);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_named_inAttributeWithDisallowedFollowingChar() {
        CharacterReader reader = new CharacterReader("gt=1");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        int[] result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
        assertEquals('g', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_named_notFoundWithSemicolon() {
        CharacterReader reader = new CharacterReader("nonexistententity;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        int[] result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("invalid named referenece"));
    }

    @Test
    public void testTagPending_createAndEmit() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        Token.Tag startTag = tokeniser.createTagPending(true);
        assertSame(tokeniser.startPending, startTag);
        startTag.name("div");
        tokeniser.emitTagPending();

        Token readStart = tokeniser.read();
        assertEquals(Token.TokenType.StartTag, readStart.type);
        assertEquals("div", ((Token.StartTag) readStart).name());

        Token.Tag endTag = tokeniser.createTagPending(false);
        assertSame(tokeniser.endPending, endTag);
        endTag.name("div");
        tokeniser.emitTagPending();

        Token readEnd = tokeniser.read();
        assertEquals(Token.TokenType.EndTag, readEnd.type);
        assertEquals("div", ((Token.EndTag) readEnd).name());
    }

    @Test
    public void testCommentPending_createAndEmit() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        tokeniser.createCommentPending();
        tokeniser.commentPending.data.append("a comment");
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Comment, token.type);
        assertEquals("a comment", ((Token.Comment) token).getData());
    }

    @Test
    public void testDoctypePending_createAndEmit() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("html");
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Doctype, token.type);
        assertEquals("html", ((Token.Doctype) token).getName());
    }

    @Test
    public void testCreateTempBuffer() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        tokeniser.dataBuffer.append("temporary data");
        assertEquals(14, tokeniser.dataBuffer.length());

        tokeniser.createTempBuffer();
        assertEquals(0, tokeniser.dataBuffer.length());
    }

    @Test
    public void testAppropriateEndTagToken() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        assertNull(tokeniser.appropriateEndTagName());
        tokeniser.createTagPending(false);
        tokeniser.tagPending.name("script");
        assertFalse(tokeniser.isAppropriateEndTagToken());

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("script");
        tokeniser.emit(startTag);
        tokeniser.read();

        assertEquals("script", tokeniser.appropriateEndTagName());

        tokeniser.createTagPending(false);
        tokeniser.tagPending.name("script");
        assertTrue(tokeniser.isAppropriateEndTagToken());

        tokeniser.createTagPending(false);
        tokeniser.tagPending.name("div");
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testErrorMethods() {
        CharacterReader reader = new CharacterReader("abc");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);
        tokeniser.error("Custom error message");

        assertEquals(3, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Unexpected character 'a' in input state [Data]"));
        assertTrue(errors.get(1).getErrorMessage().contains("Unexpectedly reached end of file (EOF) in input state [Data]"));
        assertTrue(errors.get(2).getErrorMessage().contains("Custom error message"));

        Tokeniser tokeniserNoTrack = new Tokeniser(reader, ParseErrorList.noTracking());
        tokeniserNoTrack.error(TokeniserState.Data);
        tokeniserNoTrack.eofError(TokeniserState.Data);
        tokeniserNoTrack.error("Custom error message");
    }

    @Test
    public void testCurrentNodeInHtmlNS() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void testUnescapeEntities() {
        CharacterReader reader = new CharacterReader("Hello &amp; &lt;World&gt; &#65; &NotEqualTilde; &unknown; &");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(10));

        String unescaped = tokeniser.unescapeEntities(false);
        assertTrue(unescaped.startsWith("Hello & <World> A "));
        assertTrue(unescaped.endsWith("&unknown; &"));
    }

    @Test
    public void testUnescapeEntities_inAttribute() {
        CharacterReader reader = new CharacterReader("foo&amp;bar&gt=1");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        String unescaped = tokeniser.unescapeEntities(true);
        assertEquals("foo&bar&gt=1", unescaped);
    }
}
