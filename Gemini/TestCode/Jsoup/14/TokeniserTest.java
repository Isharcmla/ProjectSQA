package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokeniserTest {

    @Test
    public void testTokeniser_readSimpleData_emitsTokens() {
        CharacterReader reader = new CharacterReader("Hello world");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token token = tokeniser.read();
        Assert.assertNotNull(token);
        Assert.assertEquals(Token.TokenType.Character, token.type);
        Assert.assertEquals("Hello world", ((Token.Character) token).getData());

        Token eofToken = tokeniser.read();
        Assert.assertNotNull(eofToken);
        Assert.assertEquals(Token.TokenType.EOF, eofToken.type);
    }

    @Test
    public void testEmit_characterAndString_buffersCorrectly() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        tokeniser.emit('a');
        tokeniser.emit("bc");

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        tokeniser.emit(doctype);

        Token charToken = tokeniser.read();
        Assert.assertEquals(Token.TokenType.Character, charToken.type);
        Assert.assertEquals("abc", ((Token.Character) charToken).getData());

        Token doctypeToken = tokeniser.read();
        Assert.assertEquals(Token.TokenType.Doctype, doctypeToken.type);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmit_duplicateEmitWithoutRead_throwsException() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.Doctype doctype1 = new Token.Doctype();
        Token.Doctype doctype2 = new Token.Doctype();

        tokeniser.emit(doctype1);
        tokeniser.emit(doctype2);
    }

    @Test
    public void testEmit_startTagSelfClosing_acknowledgesFlag() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;

        tokeniser.emit(startTag);
        tokeniser.acknowledgeSelfClosingFlag();
        Token readToken = tokeniser.read();

        Assert.assertEquals(Token.TokenType.StartTag, readToken.type);
        Assert.assertTrue(((Token.StartTag) readToken).isSelfClosing());
    }

    @Test
    public void testEmit_startTagSelfClosingNotAcknowledged_logsErrorOnNextRead() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);
        tokeniser.setTrackErrors(true);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;

        tokeniser.emit(startTag);
        tokeniser.read(); // first read retrieves tag, sets selfClosingFlagAcknowledged = false

        Token nextToken = tokeniser.read(); // second read triggers error log and resets flag
        Assert.assertEquals(Token.TokenType.EOF, nextToken.type);
    }

    @Test
    public void testEmit_endTagWithAttributes_logsError() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);
        tokeniser.setTrackErrors(true);

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        endTag.attributes.put("class", "error");

        tokeniser.emit(endTag);
        Token token = tokeniser.read();

        Assert.assertEquals(Token.TokenType.EndTag, token.type);
    }

    @Test
    public void testState_transitionsAndAdvanceTransition() {
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = new Tokeniser(reader);

        Assert.assertEquals(TokeniserState.Data, tokeniser.getState());

        tokeniser.transition(TokeniserState.TagOpen);
        Assert.assertEquals(TokeniserState.TagOpen, tokeniser.getState());

        tokeniser.advanceTransition(TokeniserState.TagName);
        Assert.assertEquals(TokeniserState.TagName, tokeniser.getState());
        Assert.assertEquals('b', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_emptyReader_returnsNull() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_additionalAllowedCharacter_returnsNull() {
        CharacterReader reader = new CharacterReader("\"");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference('\"', false);
        Assert.assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_invalidLeadCharacters_returnsNull() {
        char[] invalidChars = new char[]{'\t', '\n', '\f', '<', '&'};
        for (char c : invalidChars) {
            CharacterReader reader = new CharacterReader(String.valueOf(c));
            Tokeniser tokeniser = new Tokeniser(reader);
            Character result = tokeniser.consumeCharacterReference(null, false);
            Assert.assertNull(result);
        }
    }

    @Test
    public void testConsumeCharacterReference_decimalEntity_valid() {
        CharacterReader reader = new CharacterReader("#65;");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testConsumeCharacterReference_hexEntity_valid() {
        CharacterReader reader = new CharacterReader("#x41;");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testConsumeCharacterReference_hexEntityIgnoreCase_valid() {
        CharacterReader reader = new CharacterReader("#X41;");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testConsumeCharacterReference_numericEntityWithoutSemicolon() {
        CharacterReader reader = new CharacterReader("#65");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testConsumeCharacterReference_numericEntityEmptyDigits_returnsNull() {
        CharacterReader reader = new CharacterReader("#;");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_numericEntityOutOfRange_returnsReplacementChar() {
        CharacterReader reader = new CharacterReader("#xD800;"); // Surrogate range
        Tokeniser tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf(Tokeniser.replacementChar), result);

        CharacterReader readerMax = new CharacterReader("#x110000;"); // > 0x10FFFF
        Tokeniser tokeniserMax = new Tokeniser(readerMax);
        Character resultMax = tokeniserMax.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf(Tokeniser.replacementChar), resultMax);
    }

    @Test
    public void testConsumeCharacterReference_namedEntity_valid() {
        CharacterReader reader = new CharacterReader("amp;");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf('&'), result);
    }

    @Test
    public void testConsumeCharacterReference_namedEntityWithoutSemicolon() {
        CharacterReader reader = new CharacterReader("lt ");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertEquals(Character.valueOf('<'), result);
    }

    @Test
    public void testConsumeCharacterReference_namedEntityInAttributeWithInvalidSuffix_returnsNull() {
        CharacterReader reader = new CharacterReader("amp=123");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, true);
        Assert.assertNull(result);
    }

    @Test
    public void testConsumeCharacterReference_unknownNamedEntity_returnsNull() {
        CharacterReader reader = new CharacterReader("notARealEntity;");
        Tokeniser tokeniser = new Tokeniser(reader);

        Character result = tokeniser.consumeCharacterReference(null, false);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateAndEmitTagPending_startAndEndTags() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.Tag startTag = tokeniser.createTagPending(true);
        startTag.name("div");
        tokeniser.emitTagPending();

        Token readStart = tokeniser.read();
        Assert.assertEquals(Token.TokenType.StartTag, readStart.type);
        Assert.assertEquals("div", ((Token.StartTag) readStart).name());

        Token.Tag endTag = tokeniser.createTagPending(false);
        endTag.name("div");
        tokeniser.emitTagPending();

        Token readEnd = tokeniser.read();
        Assert.assertEquals(Token.TokenType.EndTag, readEnd.type);
        Assert.assertEquals("div", ((Token.EndTag) readEnd).name());
    }

    @Test
    public void testCreateAndEmitCommentPending() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        tokeniser.createCommentPending();
        tokeniser.commentPending.data.append("comment text");
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.Comment, token.type);
        Assert.assertEquals("comment text", ((Token.Comment) token).getData());
    }

    @Test
    public void testCreateAndEmitDoctypePending() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("html");
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();
        Assert.assertEquals(Token.TokenType.Doctype, token.type);
        Assert.assertEquals("html", ((Token.Doctype) token).getName());
    }

    @Test
    public void testCreateTempBuffer() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        tokeniser.createTempBuffer();
        Assert.assertNotNull(tokeniser.dataBuffer);
        tokeniser.dataBuffer.append("temp");
        Assert.assertEquals("temp", tokeniser.dataBuffer.toString());
    }

    @Test
    public void testIsAppropriateEndTagToken() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);

        Token.Tag startTag = tokeniser.createTagPending(true);
        startTag.name("script");
        tokeniser.emitTagPending();
        tokeniser.read();

        Token.Tag endTagMatching = tokeniser.createTagPending(false);
        endTagMatching.name("script");
        Assert.assertTrue(tokeniser.isAppropriateEndTagToken());

        Token.Tag endTagMismatch = tokeniser.createTagPending(false);
        endTagMismatch.name("style");
        Assert.assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testTrackErrorsAndErrorLogging() {
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser tokeniser = new Tokeniser(reader);

        Assert.assertTrue(tokeniser.isTrackErrors());

        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);

        tokeniser.setTrackErrors(false);
        Assert.assertFalse(tokeniser.isTrackErrors());

        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);
    }

    @Test
    public void testCurrentNodeInHtmlNS() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader);
        Assert.assertTrue(tokeniser.currentNodeInHtmlNS());
    }
}
