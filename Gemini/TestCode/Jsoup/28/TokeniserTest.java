package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TokeniserTest {

    private Tokeniser createTokeniser(String html, int maxErrors) {
        CharacterReader reader = new CharacterReader(html);
        ParseErrorList errors = maxErrors > 0 ? ParseErrorList.tracking(maxErrors) : ParseErrorList.noTracking();
        return new Tokeniser(reader, errors);
    }

    private Tokeniser createTokeniser(String html) {
        return createTokeniser(html, 0);
    }

    @Test
    public void testConstructorAndInitialState() {
        Tokeniser tokeniser = createTokeniser("test");
        assertEquals(TokeniserState.Data, tokeniser.getState());
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void testTransitionAndAdvanceTransition() {
        Tokeniser tokeniser = createTokeniser("abc");
        assertEquals(TokeniserState.Data, tokeniser.getState());

        tokeniser.transition(TokeniserState.TagOpen);
        assertEquals(TokeniserState.TagOpen, tokeniser.getState());

        tokeniser.advanceTransition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());
    }

    @Test
    public void testCreateAndEmitTagPending_startTag() {
        Tokeniser tokeniser = createTokeniser("");
        Token.Tag startTag = tokeniser.createTagPending(true);
        assertTrue(startTag.isStartTag());
        startTag.name("div");

        tokeniser.emitTagPending();
        Token token = tokeniser.read();
        assertTrue(token.isStartTag());
        assertEquals("div", token.asStartTag().name());
    }

    @Test
    public void testCreateAndEmitTagPending_endTag() {
        Tokeniser tokeniser = createTokeniser("");
        Token.Tag endTag = tokeniser.createTagPending(false);
        assertFalse(endTag.isStartTag());
        endTag.name("div");

        tokeniser.emitTagPending();
        Token token = tokeniser.read();
        assertFalse(token.isStartTag());
        assertEquals("div", token.asEndTag().name());
    }

    @Test
    public void testCreateAndEmitCommentPending() {
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createCommentPending();
        tokeniser.commentPending.data.append("a comment");

        tokeniser.emitCommentPending();
        Token token = tokeniser.read();
        assertTrue(token.isComment());
        assertEquals("a comment", token.asComment().getData());
    }

    @Test
    public void testCreateAndEmitDoctypePending() {
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name.append("html");

        tokeniser.emitDoctypePending();
        Token token = tokeniser.read();
        assertTrue(token.isDoctype());
        assertEquals("html", token.asDoctype().getName());
    }

    @Test
    public void testCreateTempBuffer() {
        Tokeniser tokeniser = createTokeniser("");
        assertNull(tokeniser.dataBuffer);
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
        tokeniser.dataBuffer.append("temp");
        assertEquals("temp", tokeniser.dataBuffer.toString());
    }

    @Test
    public void testIsAppropriateEndTagToken_withMatchingAndNonMatchingTags() {
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.createTagPending(false);
        tokeniser.tagPending.name("div");

        // lastStartTag is null
        assertFalse(tokeniser.isAppropriateEndTagToken());

        // Emit start tag "script"
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("script");
        tokeniser.emit(startTag);
        tokeniser.read(); // consume start tag

        assertEquals("script", tokeniser.appropriateEndTagName());
        assertFalse(tokeniser.isAppropriateEndTagToken());

        tokeniser.tagPending.name("script");
        assertTrue(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testEmitCharacterAndStringBufferingBeforeToken() {
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.emit('H');
        tokeniser.emit("ello ");
        tokeniser.emit("World");

        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        tokeniser.emit(tag);

        // First read should return buffered characters
        Token charToken = tokeniser.read();
        assertTrue(charToken.isCharacter());
        assertEquals("Hello World", charToken.asCharacter().getData());

        // Next read should return the pending tag
        Token tagToken = tokeniser.read();
        assertTrue(tagToken.isStartTag());
        assertEquals("p", tagToken.asStartTag().name());
    }

    @Test
    public void testEmitDuplicateTokenThrowsException() {
        Tokeniser tokeniser = createTokeniser("");
        tokeniser.emit(new Token.Character("a"));
        try {
            tokeniser.emit(new Token.Character("b"));
            fail("Should have thrown IllegalArgumentException for pending unread token");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("There is an unread token pending!"));
        }
    }

    @Test
    public void testSelfClosingFlagAcknowledgment() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;
        tokeniser.emit(startTag);

        // Read the token; selfClosingFlagAcknowledged is false initially for selfClosing startTag
        Token token1 = tokeniser.read();
        assertEquals("img", token1.asStartTag().name());

        // Next read without acknowledging will trigger error
        tokeniser.emit(new Token.EOF());
        tokeniser.read();

        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Self closing flag not acknowledged"));
    }

    @Test
    public void testSelfClosingFlagExplicitAcknowledge() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("");
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
    public void testEndTagWithAttributesProducesError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        endTag.attributes = new org.jsoup.nodes.Attributes();
        endTag.attributes.put("id", "test");

        tokeniser.emit(endTag);
        tokeniser.read();

        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Attributes incorrectly present on end tag"));
    }

    @Test
    public void testErrorsLogging() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("x");
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.error(TokeniserState.Data);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Unexpected character 'x' in input state [Data]"));

        tokeniser.eofError(TokeniserState.TagOpen);
        assertEquals(2, errors.size());
        assertTrue(errors.get(1).getErrorMessage().contains("Unexpectedly reached end of file (EOF) in input state [TagOpen]"));
    }

    @Test
    public void testConsumeCharacterReference_emptyReader() {
        Tokeniser tokeniser = createTokeniser("");
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_additionalAllowedCharacter() {
        Tokeniser tokeniser = createTokeniser("\"hello");
        assertNull(tokeniser.consumeCharacterReference('\"', false));
    }

    @Test
    public void testConsumeCharacterReference_whitespaceAndSpecialChars() {
        char[] specialChars = new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'};
        for (char c : specialChars) {
            Tokeniser tokeniser = createTokeniser(String.valueOf(c));
            assertNull(tokeniser.consumeCharacterReference(null, false));
        }
    }

    @Test
    public void testConsumeCharacterReference_hexValid() {
        Tokeniser tokeniser = createTokeniser("#x41;");
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testConsumeCharacterReference_hexLowerCaseValid() {
        Tokeniser tokeniser = createTokeniser("#X42;");
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('B'), c);
    }

    @Test
    public void testConsumeCharacterReference_hexMissingSemicolon() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("#x41 "), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_hexNoDigits() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("#x;"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
    }

    @Test
    public void testConsumeCharacterReference_decimalValid() {
        Tokeniser tokeniser = createTokeniser("#65;");
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testConsumeCharacterReference_decimalMissingSemicolon() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("#65 "), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_decimalNoDigits() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("#;"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
    }

    @Test
    public void testConsumeCharacterReference_outOfRangeAndSurrogates() {
        ParseErrorList errors = ParseErrorList.tracking(10);

        // Surrogate code point 0xD800 = 55296
        Tokeniser tokeniserSurrogate = new Tokeniser(new CharacterReader("#55296;"), errors);
        Character c1 = tokeniserSurrogate.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), c1);

        // Above 0x10FFFF = 1114112
        Tokeniser tokeniserTooBig = new Tokeniser(new CharacterReader("#1114112;"), errors);
        Character c2 = tokeniserTooBig.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), c2);

        // Overflow number format
        Tokeniser tokeniserOverflow = new Tokeniser(new CharacterReader("#99999999999999999999;"), errors);
        Character c3 = tokeniserOverflow.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), c3);

        assertTrue(errors.size() >= 3);
    }

    @Test
    public void testConsumeCharacterReference_namedEntityValidWithSemicolon() {
        Tokeniser tokeniser = createTokeniser("lt;");
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('<'), c);
    }

    @Test
    public void testConsumeCharacterReference_namedEntityValidWithoutSemicolon() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("copy "), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('©'), c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeCharacterReference_invalidNamedEntityWithSemicolon() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("notanentity;"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("invalid named referenece 'notanentity'"));
    }

    @Test
    public void testConsumeCharacterReference_invalidNamedEntityWithoutSemicolon() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("notanentity"), errors);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(0, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_inAttributeSpecialBoundary() {
        // When inAttribute is true and entity is followed by =, letter, digit, -, _
        Tokeniser tokeniserLetter = createTokeniser("copyx", 0);
        assertNull(tokeniserLetter.consumeCharacterReference(null, true));

        Tokeniser tokeniserEquals = createTokeniser("copy=", 0);
        assertNull(tokeniserEquals.consumeCharacterReference(null, true));

        Tokeniser tokeniserDash = createTokeniser("copy-", 0);
        assertNull(tokeniserDash.consumeCharacterReference(null, true));

        Tokeniser tokeniserUnderscore = createTokeniser("copy_", 0);
        assertNull(tokeniserUnderscore.consumeCharacterReference(null, true));

        Tokeniser tokeniserDigit = createTokeniser("copy2", 0);
        assertNull(tokeniserDigit.consumeCharacterReference(null, true));

        // When inAttribute is false, should succeed even if followed by letter (unconsumes)
        Tokeniser tokeniserNotInAttr = createTokeniser("copyx", 0);
        Character c = tokeniserNotInAttr.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('©'), c);
    }

    @Test
    public void testFullReadFlowHtml() {
        Tokeniser tokeniser = createTokeniser("<div class=\"main\">Hello</div>");
        Token token;
        boolean sawStart = false;
        boolean sawChar = false;
        boolean sawEnd = false;

        while ((token = tokeniser.read()).type != Token.TokenType.EOF) {
            if (token.isStartTag()) {
                sawStart = true;
                assertEquals("div", token.asStartTag().name());
                assertEquals("main", token.asStartTag().attributes.get("class"));
            } else if (token.isCharacter()) {
                sawChar = true;
                assertEquals("Hello", token.asCharacter().getData());
            } else if (token.isEndTag()) {
                sawEnd = true;
                assertEquals("div", token.asEndTag().name());
            }
        }

        assertTrue(sawStart);
        assertTrue(sawChar);
        assertTrue(sawEnd);
    }
}
