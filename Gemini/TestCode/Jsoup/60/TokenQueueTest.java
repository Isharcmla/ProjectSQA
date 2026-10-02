package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class TokenQueueTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsIllegalArgumentException() {
        new TokenQueue(null);
    }

    @Test
    public void testIsEmpty_emptyAndNonEmpty_correctStatus() {
        TokenQueue queue = new TokenQueue("");
        assertTrue(queue.isEmpty());

        TokenQueue queue2 = new TokenQueue("data");
        assertFalse(queue2.isEmpty());
        queue2.remainder();
        assertTrue(queue2.isEmpty());
    }

    @Test
    public void testPeek_variousStates_correctCharOrZero() {
        TokenQueue queue = new TokenQueue("");
        assertEquals(0, queue.peek());

        TokenQueue queue2 = new TokenQueue("abc");
        assertEquals('a', queue2.peek());
        assertEquals('a', queue2.peek()); // peek should not consume
    }

    @Test
    public void testAddFirst_character_prependedCorrectly() {
        TokenQueue queue = new TokenQueue("bc");
        queue.addFirst('a');
        assertEquals("abc", queue.remainder());
    }

    @Test
    public void testAddFirst_string_prependedCorrectly() {
        TokenQueue queue = new TokenQueue("world");
        queue.consume(); // pos = 1 ("orld")
        queue.addFirst("hello ");
        assertEquals("hello orld", queue.remainder());
    }

    @Test
    public void testMatches_caseInsensitive_returnsTrueOrFalse() {
        TokenQueue queue = new TokenQueue("HeLLo World");
        assertTrue(queue.matches("hello"));
        assertTrue(queue.matches("HELLO"));
        assertFalse(queue.matches("world"));
    }

    @Test
    public void testMatchesCS_caseSensitive_returnsTrueOrFalse() {
        TokenQueue queue = new TokenQueue("Hello World");
        assertTrue(queue.matchesCS("Hello"));
        assertFalse(queue.matchesCS("hello"));
        assertFalse(queue.matchesCS("World"));
    }

    @Test
    public void testMatchesAny_string_variousMatches() {
        TokenQueue queue = new TokenQueue("Hello World");
        assertTrue(queue.matchesAny("foo", "hel", "bar"));
        assertFalse(queue.matchesAny("foo", "bar"));
        assertFalse(queue.matchesAny());
    }

    @Test
    public void testMatchesAny_char_variousMatches() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertFalse(emptyQueue.matchesAny('a', 'b'));

        TokenQueue queue = new TokenQueue("Hello");
        assertTrue(queue.matchesAny('x', 'H', 'z'));
        assertFalse(queue.matchesAny('h', 'e')); // case-sensitive check on char
        assertFalse(queue.matchesAny());
    }

    @Test
    public void testMatchesStartTag_variousInputs_correctMatch() {
        TokenQueue queue1 = new TokenQueue("<div");
        assertTrue(queue1.matchesStartTag());

        TokenQueue queue2 = new TokenQueue("<1tag");
        assertFalse(queue2.matchesStartTag());

        TokenQueue queue3 = new TokenQueue("<");
        assertFalse(queue3.matchesStartTag());

        TokenQueue queue4 = new TokenQueue("div");
        assertFalse(queue4.matchesStartTag());

        TokenQueue queue5 = new TokenQueue("");
        assertFalse(queue5.matchesStartTag());
    }

    @Test
    public void testMatchChomp_matchAndMismatch_advancesOnlyOnMatch() {
        TokenQueue queue = new TokenQueue("Hello World");
        assertFalse(queue.matchChomp("World"));
        assertEquals("Hello World", queue.toString());

        assertTrue(queue.matchChomp("hello "));
        assertEquals("World", queue.toString());
    }

    @Test
    public void testMatchesWhitespace_emptyAndCharacters_correctStatus() {
        TokenQueue empty = new TokenQueue("");
        assertFalse(empty.matchesWhitespace());

        TokenQueue whitespace = new TokenQueue(" \t\n");
        assertTrue(whitespace.matchesWhitespace());

        TokenQueue nonWhitespace = new TokenQueue("abc");
        assertFalse(nonWhitespace.matchesWhitespace());
    }

    @Test
    public void testMatchesWord_emptyAndCharacters_correctStatus() {
        TokenQueue empty = new TokenQueue("");
        assertFalse(empty.matchesWord());

        TokenQueue letter = new TokenQueue("abc");
        assertTrue(letter.matchesWord());

        TokenQueue digit = new TokenQueue("123");
        assertTrue(digit.matchesWord());

        TokenQueue symbol = new TokenQueue("!@#");
        assertFalse(symbol.matchesWord());
    }

    @Test
    public void testAdvance_emptyAndNonEmpty_advancesSafely() {
        TokenQueue queue = new TokenQueue("ab");
        queue.advance();
        assertEquals('b', queue.peek());
        queue.advance();
        assertEquals(0, queue.peek());
        queue.advance(); // on empty
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsume_char_advancesPosition() {
        TokenQueue queue = new TokenQueue("ab");
        assertEquals('a', queue.consume());
        assertEquals('b', queue.consume());
    }

    @Test
    public void testConsume_string_success() {
        TokenQueue queue = new TokenQueue("HelloWorld");
        queue.consume("hello");
        assertEquals("World", queue.remainder());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsume_stringNotMatching_throwsIllegalStateException() {
        TokenQueue queue = new TokenQueue("HelloWorld");
        queue.consume("world");
    }

    @Test
    public void testConsumeTo_foundAndNotFound_caseSensitive() {
        TokenQueue queue = new TokenQueue("One Two Three");
        String consumed = queue.consumeTo("Two");
        assertEquals("One ", consumed);
        assertEquals("Two Three", queue.remainder());

        TokenQueue queueNotFound = new TokenQueue("One Two Three");
        String consumedAll = queueNotFound.consumeTo("Four");
        assertEquals("One Two Three", consumedAll);
        assertTrue(queueNotFound.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCase_casedStartChar_consumesProperly() {
        TokenQueue queue = new TokenQueue("one TWO three");
        String consumed = queue.consumeToIgnoreCase("two");
        assertEquals("one ", consumed);
        assertEquals("TWO three", queue.remainder());

        TokenQueue queueNotFound = new TokenQueue("one two three");
        String consumedAll = queueNotFound.consumeToIgnoreCase("four");
        assertEquals("one two three", consumedAll);
        assertTrue(queueNotFound.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCase_uncasedStartChar_branchCoverage() {
        // skip > 0 branch: uncased char with skip offset
        TokenQueue queue1 = new TokenQueue("abc 123 def");
        assertEquals("abc ", queue1.consumeToIgnoreCase("123"));
        assertEquals("123 def", queue1.remainder());

        // skip == 0 branch: first character matches uncased search, but remainder of sequence does not
        TokenQueue queue2 = new TokenQueue("-124-123xyz");
        assertEquals("-124", queue2.consumeToIgnoreCase("-123"));
        assertEquals("-123xyz", queue2.remainder());

        // skip < 0 branch: uncased character never appears in queue
        TokenQueue queue3 = new TokenQueue("abcdef");
        assertEquals("abcdef", queue3.consumeToIgnoreCase("123"));
        assertTrue(queue3.isEmpty());
    }

    @Test
    public void testConsumeToAny_multipleSequences_consumesToFirstMatch() {
        TokenQueue queue = new TokenQueue("One Two Three");
        String consumed = queue.consumeToAny("two", "three");
        assertEquals("One ", consumed);
        assertEquals("Two Three", queue.remainder());

        TokenQueue queueNotFound = new TokenQueue("One Two Three");
        String consumedAll = queueNotFound.consumeToAny("four", "five");
        assertEquals("One Two Three", consumedAll);
        assertTrue(queueNotFound.isEmpty());
    }

    @Test
    public void testChompTo_foundAndNotFound_consumesAndDropsMatched() {
        TokenQueue queue = new TokenQueue("One Two Three");
        String consumed = queue.chompTo("Two ");
        assertEquals("One ", consumed);
        assertEquals("Three", queue.remainder());

        TokenQueue queueNotFound = new TokenQueue("One Two Three");
        String consumedAll = queueNotFound.chompTo("Four");
        assertEquals("One Two Three", consumedAll);
        assertTrue(queueNotFound.isEmpty());
    }

    @Test
    public void testChompToIgnoreCase_foundAndNotFound_consumesCaseInsensitive() {
        TokenQueue queue = new TokenQueue("One TWO Three");
        String consumed = queue.chompToIgnoreCase("two ");
        assertEquals("One ", consumed);
        assertEquals("Three", queue.remainder());
    }

    @Test
    public void testChompBalanced_standardParentheses_balancedExtracted() {
        TokenQueue queue = new TokenQueue("(one (two) three) four");
        assertEquals("one (two) three", queue.chompBalanced('(', ')'));
        assertEquals(" four", queue.remainder());
    }

    @Test
    public void testChompBalanced_withQuotesAndEscapes_ignoresNestedQuotes() {
        TokenQueue queue = new TokenQueue("('(' \"(\" \\( ) rest");
        assertEquals("'(' \"(\" \\(", queue.chompBalanced('(', ')'));
        assertEquals(" rest", queue.remainder());

        // Escaped quote test
        TokenQueue queueEscapedQuote = new TokenQueue("(\\' text) rest");
        assertEquals("\\' text", queueEscapedQuote.chompBalanced('(', ')'));
        assertEquals(" rest", queueEscapedQuote.remainder());
    }

    @Test
    public void testChompBalanced_openIsQuote_handlesProperly() {
        TokenQueue queue = new TokenQueue("'quoted (string)' rest");
        assertEquals("quoted (string)", queue.chompBalanced('\'', '\''));
        assertEquals(" rest", queue.remainder());
    }

    @Test
    public void testChompBalanced_unbalancedOrEmpty_returnsEmptyOrTruncated() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals("", emptyQueue.chompBalanced('(', ')'));

        TokenQueue unbalancedQueue = new TokenQueue("(unbalanced");
        assertEquals("unbalanced", unbalancedQueue.chompBalanced('(', ')'));

        TokenQueue justOpen = new TokenQueue("(");
        assertEquals("", justOpen.chompBalanced('(', ')'));
    }

    @Test
    public void testUnescape_variousEscapedStrings_properlyUnescaped() {
        assertEquals("one\\twothree", TokenQueue.unescape("one\\\\two\\three"));
        assertEquals("", TokenQueue.unescape("\\"));
        assertEquals("", TokenQueue.unescape(""));
        assertEquals("plain", TokenQueue.unescape("plain"));
    }

    @Test
    public void testConsumeWhitespace_variousStrings_consumesAndReturnsStatus() {
        TokenQueue queue = new TokenQueue("   abc");
        assertTrue(queue.consumeWhitespace());
        assertEquals("abc", queue.remainder());

        TokenQueue noWsQueue = new TokenQueue("abc");
        assertFalse(noWsQueue.consumeWhitespace());
        assertEquals("abc", noWsQueue.remainder());
    }

    @Test
    public void testConsumeWord_wordsAndSymbols_consumesWordOnly() {
        TokenQueue queue = new TokenQueue("Word123_test");
        assertEquals("Word123", queue.consumeWord());
        assertEquals("_test", queue.remainder());

        TokenQueue nonWordQueue = new TokenQueue("!abc");
        assertEquals("", nonWordQueue.consumeWord());
    }

    @Test
    public void testConsumeTagName_validTagNames_consumesValidChars() {
        TokenQueue queue = new TokenQueue("tag-name_1:2.class");
        assertEquals("tag-name_1:2", queue.consumeTagName());
        assertEquals(".class", queue.remainder());
    }

    @Test
    public void testConsumeElementSelector_validSelectors_consumesValidChars() {
        TokenQueue queue = new TokenQueue("ns|tag_name-1*|all:pseudo");
        assertEquals("ns|tag_name-1*|all", queue.consumeElementSelector());
        assertEquals(":pseudo", queue.remainder());
    }

    @Test
    public void testConsumeCssIdentifier_validIdentifiers_consumesValidChars() {
        TokenQueue queue = new TokenQueue("css-id_123.class");
        assertEquals("css-id_123", queue.consumeCssIdentifier());
        assertEquals(".class", queue.remainder());
    }

    @Test
    public void testConsumeAttributeKey_validKeys_consumesValidChars() {
        TokenQueue queue = new TokenQueue("xml:attr-name_1=val");
        assertEquals("xml:attr-name_1", queue.consumeAttributeKey());
        assertEquals("=val", queue.remainder());
    }

    @Test
    public void testRemainderAndToString_returnsRemainingQueue() {
        TokenQueue queue = new TokenQueue("abcde");
        queue.advance();
        assertEquals("bcde", queue.toString());
        assertEquals("bcde", queue.remainder());
        assertTrue(queue.isEmpty());
        assertEquals("", queue.remainder());
        assertEquals("", queue.toString());
    }
}
