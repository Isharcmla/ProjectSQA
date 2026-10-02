package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class TokeniserTest {

    @Test
    public void testStateTransitionAndGetState_normalStateChange_stateUpdated() {
        CharacterReader reader = new CharacterReader("test");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        assertEquals(TokeniserState.Data, tokeniser.getState());
        tokeniser.transition(TokeniserState.TagOpen);
        assertEquals(TokeniserState.TagOpen, tokeniser.getState());
    }

    @Test
    public void testAdvanceTransition_characterAdvancedAndStateUpdated() {
        CharacterReader reader = new CharacterReader("abc");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.advanceTransition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
        assertEquals('b', reader.current());
    }

    @Test
    public void testCreateAndEmitTagPending_startTag_emittedCorrectly() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.Tag tag = tokeniser.createTagPending(true);
        tag.name("p");
        tokeniser.emitTagPending();

        Token token = tokeniser.read();
        assertTrue(token.isStartTag());
        assertEquals("p", token.asStartTag().name());
    }

    @Test
    public void testCreateAndEmitTagPending_endTag_emittedCorrectly() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.Tag tag = tokeniser.createTagPending(false);
        tag.name("p");
        tokeniser.emitTagPending();

        Token token = tokeniser.read();
        assertTrue(token.isEndTag());
        assertEquals("p", token.asEndTag().name());
    }

    @Test
    public void testEmitEndTagWithAttributes_logsError() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.Tag tag = tokeniser.createTagPending(false);
        tag.name("p");
        tag.attributes.put("class", "error");
        tokeniser.emitTagPending();

        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Attributes incorrectly present on end tag"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmit_whenEmitAlreadyPending_throwsException() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.Tag tag1 = tokeniser.createTagPending(true);
        tag1.name("div");
        tokeniser.emit(tag1);

        Token.Tag tag2 = tokeniser.createTagPending(true);
        tag2.name("span");
        tokeniser.emit(tag2);
    }

    @Test
    public void testEmitCharacterAndStringBuffers_returnsCharacterTokenBeforePendingToken() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.emit('a');
        tokeniser.emit("bc");

        Token.Tag tag = tokeniser.createTagPending(true);
        tag.name("div");
        tokeniser.emitTagPending();

        Token charToken = tokeniser.read();
        assertTrue(charToken.isCharacter());
        assertEquals("abc", charToken.asCharacter().getData());

        Token tagToken = tokeniser.read();
        assertTrue(tagToken.isStartTag());
        assertEquals("div", tagToken.asStartTag().name());
    }

    @Test
    public void testSelfClosingFlagNotAcknowledged_emitsErrorOnNextRead() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag tag = (Token.StartTag) tokeniser.createTagPending(true);
        tag.name("img");
        tag.selfClosing = true;
        tokeniser.emitTagPending();

        tokeniser.read();
        assertEquals(0, errors.size());

        tokeniser.read();
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Self closing flag not acknowledged"));
    }

    @Test
    public void testAcknowledgeSelfClosingFlag_noErrorEmitted() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag tag = (Token.StartTag) tokeniser.createTagPending(true);
        tag.name("img");
        tag.selfClosing = true;
        tokeniser.emitTagPending();

        tokeniser.read();
        tokeniser.acknowledgeSelfClosingFlag();
        tokeniser.read();

        assertEquals(0, errors.size());
    }

    @Test
    public void testAppropriateEndTagToken_matchingAndMismatchingTags() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.name("script");
        tokeniser.emitTagPending();
        tokeniser.read();

        assertEquals("script", tokeniser.appropriateEndTagName());

        Token.Tag endTag = tokeniser.createTagPending(false);
        endTag.name("script");
        assertTrue(tokeniser.isAppropriateEndTagToken());

        endTag.name("style");
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testCommentPending_createAndEmit() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.createCommentPending();
        tokeniser.commentPending.data.append("hello comment");
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();
        assertTrue(token.isComment());
        assertEquals("hello comment", token.asComment().getData());
    }

    @Test
    public void testDoctypePending_createAndEmit() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("html");
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();
        assertTrue(token.isDoctype());
        assertEquals("html", token.asDoctype().getName());
    }

    @Test
    public void testCreateTempBuffer_initializesDataBuffer() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        assertNull(tokeniser.dataBuffer);
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
    }

    @Test
    public void testCurrentNodeInHtmlNS_returnsTrue() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void testErrorAndEofError_withTracking_recordsErrors() {
        CharacterReader reader = new CharacterReader("a");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);

        assertEquals(2, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Unexpected character"));
        assertTrue(errors.get(1).getErrorMessage().contains("reached end of file"));
    }

    @Test
    public void testErrorAndEofError_withoutTracking_doesNotRecordErrors() {
        CharacterReader reader = new CharacterReader("a");
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);

        assertEquals(0, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_emptyReader_returnsNull() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_additionalAllowedCharMatches_returnsNull() {
        CharacterReader reader = new CharacterReader("\"test");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        assertNull(tokeniser.consumeCharacterReference('"', false));
        assertEquals('"', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_whitespaceOrSpecialChar_returnsNull() {
        char[] specialChars = new char[]{'\t', '\n', '\f', ' ', '<', '&'};
        for (char c : specialChars) {
            CharacterReader reader = new CharacterReader(String.valueOf(c));
            Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());
            assertNull(tokeniser.consumeCharacterReference(null, false));
        }
    }

    @Test
    public void testConsumeCharacterReference_hexNumericValid_returnsChar() {
        CharacterReader reader = new CharacterReader("#x41;");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testConsumeCharacterReference_hexNumericWithoutSemicolon_returnsCharAndRecordsError() {
        CharacterReader reader = new CharacterReader("#X41 ");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Character.valueOf('A'), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_decNumericValid_returnsChar() {
        CharacterReader reader = new CharacterReader("#65;");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testConsumeCharacterReference_numericNoDigits_returnsNullAndRecordsError() {
        CharacterReader reader = new CharacterReader("#;");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
        assertEquals('#', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_numericOutOfRangeSurrogate_returnsReplacementChar() {
        CharacterReader reader = new CharacterReader("#xD800;");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
    }

    @Test
    public void testConsumeCharacterReference_numericOutOfRangeMax_returnsReplacementChar() {
        CharacterReader reader = new CharacterReader("#x110000;");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
    }

    @Test
    public void testConsumeCharacterReference_namedValidWithSemicolon_returnsChar() {
        CharacterReader reader = new CharacterReader("lt;");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('<'), result);
    }

    @Test
    public void testConsumeCharacterReference_namedValidWithoutSemicolon_returnsCharAndRecordsError() {
        CharacterReader reader = new CharacterReader("lt ");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('<'), result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_namedInvalidWithSemicolon_returnsNullAndRecordsError() {
        CharacterReader reader = new CharacterReader("nonexistententity;");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("invalid named referenece 'nonexistententity'"));
        assertEquals('n', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_namedInvalidWithoutSemicolon_returnsNullNoSemicolonError() {
        CharacterReader reader = new CharacterReader("nonexistententity ");
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(0, errors.size());
        assertEquals('n', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_inAttributeWithSuffixDisallowed_returnsNull() {
        CharacterReader reader = new CharacterReader("lt=value");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        Character result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
        assertEquals('l', reader.current());
    }

    @Test
    public void testConsumeCharacterReference_namedMultiPrefixUnconsume_matchesPrefix() {
        CharacterReader reader = new CharacterReader("notin;");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());

        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
    }
}
