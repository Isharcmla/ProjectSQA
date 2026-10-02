package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class TokenQueueTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsException() {
        new TokenQueue(null);
    }

    @Test
    public void testIsEmpty_variousStates_returnsCorrectBoolean() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertTrue(emptyQueue.isEmpty());

        TokenQueue queue = new TokenQueue("abc");
        assertFalse(queue.isEmpty());
        queue.consumeTo("c");
        assertFalse(queue.isEmpty());
        queue.consume();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek_emptyAndNonEmpty_returnsExpectedChar() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals(0, emptyQueue.peek());

        TokenQueue queue = new TokenQueue("abc");
        assertEquals('a', queue.peek());
        assertEquals('a', queue.peek()); // Ensure peek does not consume
    }

    @Test
    public void testAddFirst_charAndString_addsToStart() {
        TokenQueue queue = new TokenQueue("world");
        queue.addFirst(' ');
        assertEquals(" world", queue.toString());
        queue.addFirst("hello");
        assertEquals("hello world", queue.toString());

        queue.consume("hello ");
        queue.addFirst("new ");
        assertEquals("new world", queue.toString());
    }

    @Test
    public void testMatches_caseInsensitive_returnsExpected() {
        TokenQueue queue = new TokenQueue("HeLLo World");
        assertTrue(queue.matches("hello"));
        assertTrue(queue.matches("HELLO"));
        assertFalse(queue.matches("world"));
    }

    @Test
    public void testMatchesCS_caseSensitive_returnsExpected() {
        TokenQueue queue = new TokenQueue("HeLLo World");
        assertTrue(queue.matchesCS("HeLLo"));
        assertFalse(queue.matchesCS("hello"));
        assertFalse(queue.matchesCS("World"));
    }

    @Test
    public void testMatchesAny_strings_returnsExpected() {
        TokenQueue queue = new TokenQueue("target string");
        assertTrue(queue.matchesAny("none", "TARGET", "other"));
        assertFalse(queue.matchesAny("none", "other"));
        assertFalse(queue.matchesAny());
    }

    @Test
    public void testMatchesAny_chars_returnsExpected() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertFalse(emptyQueue.matchesAny('a', 'b'));

        TokenQueue queue = new TokenQueue("test");
        assertTrue(queue.matchesAny('x', 't', 'z'));
        assertFalse(queue.matchesAny('x', 'y', 'z'));
        assertFalse(queue.matchesAny());
    }

    @Test
    public void testMatchesStartTag_variousInputs_returnsExpected() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertFalse(emptyQueue.matchesStartTag());

        TokenQueue singleChar = new TokenQueue("<");
        assertFalse(singleChar.matchesStartTag());

        TokenQueue validTag = new TokenQueue("<p>");
        assertTrue(validTag.matchesStartTag());

        TokenQueue validUpperTag = new TokenQueue("<DIV>");
        assertTrue(validUpperTag.matchesStartTag());

        TokenQueue invalidTagNotLetter = new TokenQueue("<?xml>");
        assertFalse(invalidTagNotLetter.matchesStartTag());

        TokenQueue invalidDigit = new TokenQueue("<3");
        assertFalse(invalidDigit.matchesStartTag());

        TokenQueue noTag = new TokenQueue("hello <p>");
        assertFalse(noTag.matchesStartTag());
    }

    @Test
    public void testMatchChomp_matchesAndNonMatches_advancesCorrectly() {
        TokenQueue queue = new TokenQueue("One Two Three");
        assertTrue(queue.matchChomp("one "));
        assertEquals("Two Three", queue.toString());
        assertFalse(queue.matchChomp("Three"));
        assertEquals("Two Three", queue.toString());
    }

    @Test
    public void testMatchesWhitespace_variousInputs_returnsExpected() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertFalse(emptyQueue.matchesWhitespace());

        TokenQueue spaceQueue = new TokenQueue(" \t\n");
        assertTrue(spaceQueue.matchesWhitespace());

        TokenQueue textQueue = new TokenQueue("abc");
        assertFalse(textQueue.matchesWhitespace());
    }

    @Test
    public void testMatchesWord_variousInputs_returnsExpected() {
        TokenQueue emptyQueue = new TokenQueue("");
        assertFalse(emptyQueue.matchesWord());

        TokenQueue letterQueue = new TokenQueue("abc");
        assertTrue(letterQueue.matchesWord());

        TokenQueue digitQueue = new TokenQueue("123");
        assertTrue(digitQueue.matchesWord());

        TokenQueue symbolQueue = new TokenQueue("@#$");
        assertFalse(symbolQueue.matchesWord());
    }

    @Test
    public void testAdvance_emptyAndNonEmptyQueue() {
        TokenQueue emptyQueue = new TokenQueue("");
        emptyQueue.advance();
        assertTrue(emptyQueue.isEmpty());

        TokenQueue queue = new TokenQueue("ab");
        queue.advance();
        assertEquals('b', queue.peek());
        queue.advance();
        assertTrue(queue.isEmpty());
        queue.advance();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsume_character_consumesAndReturns() {
        TokenQueue queue = new TokenQueue("abc");
        assertEquals('a', queue.consume());
        assertEquals('b', queue.consume());
        assertEquals('c', queue.consume());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsume_stringValid_consumesCorrectly() {
        TokenQueue queue = new TokenQueue("HelloWorld");
        queue.consume("hello");
        assertEquals("World", queue.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsume_stringMismatch_throwsException() {
        TokenQueue queue = new TokenQueue("HelloWorld");
        queue.consume("World");
    }

    @Test
    public void testConsumeTo_caseSensitiveFoundAndNotFound() {
        TokenQueue queue = new TokenQueue("one TWO three TWO four");
        String consumed = queue.consumeTo("TWO");
        assertEquals("one ", consumed);
        assertEquals("TWO three TWO four", queue.toString());

        String notFound = queue.consumeTo("not-present");
        assertEquals("TWO three TWO four", notFound);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCase_canScanBranches() {
        // canScan == true (starts with symbol/number that has no uppercase/lowercase difference)
        // 1. skip == 0 branch (match target start char found, but sequence does not match)
        TokenQueue queue1 = new TokenQueue("14_123_target");
        assertEquals("14_", queue1.consumeToIgnoreCase("123"));
        assertEquals("123_target", queue1.toString());

        // 2. skip > 0 branch (scan jumps forward)
        TokenQueue queue2 = new TokenQueue("abc-123-xyz");
        assertEquals("abc-", queue2.consumeToIgnoreCase("123"));
        assertEquals("123-xyz", queue2.toString());

        // 3. skip < 0 branch (target char not found in remaining queue)
        TokenQueue queue3 = new TokenQueue("abcdef");
        assertEquals("abcdef", queue3.consumeToIgnoreCase("123"));
        assertTrue(queue3.isEmpty());

        // canScan == false (starts with cased letter)
        TokenQueue queue4 = new TokenQueue("fooBARbaz");
        assertEquals("foo", queue4.consumeToIgnoreCase("bar"));
        assertEquals("BARbaz", queue4.toString());

        // canScan == false not found
        TokenQueue queue5 = new TokenQueue("fooBARbaz");
        assertEquals("fooBARbaz", queue5.consumeToIgnoreCase("notFound"));
        assertTrue(queue5.isEmpty());
    }

    @Test
    public void testConsumeToAny_caseInsensitive_consumesCorrectly() {
        TokenQueue queue = new TokenQueue("data:text/html;charset=utf-8");
        String consumed = queue.consumeToAny(";", "=");
        assertEquals("data:text/html", consumed);
        assertEquals(";charset=utf-8", queue.toString());

        TokenQueue queueNotFound = new TokenQueue("data:text/html");
        String consumedNotFound = queueNotFound.consumeToAny(";", "=");
        assertEquals("data:text/html", consumedNotFound);
        assertTrue(queueNotFound.isEmpty());
    }

    @Test
    public void testChompTo_caseSensitive_consumesAndRemoves() {
        TokenQueue queue = new TokenQueue("one TWO three");
        assertEquals("one ", queue.chompTo("TWO"));
        assertEquals(" three", queue.toString());

        TokenQueue notFoundQueue = new TokenQueue("one two three");
        assertEquals("one two three", notFoundQueue.chompTo("four"));
        assertTrue(notFoundQueue.isEmpty());
    }

    @Test
    public void testChompToIgnoreCase_caseInsensitive_consumesAndRemoves() {
        TokenQueue queue = new TokenQueue("one TWO three");
        assertEquals("one ", queue.chompToIgnoreCase("two"));
        assertEquals(" three", queue.toString());
    }

    @Test
    public void testChompBalanced_nestedAndEscapes() {
        TokenQueue simple = new TokenQueue("(one (two) three) four");
        assertEquals("one (two) three", simple.chompBalanced('(', ')'));
        assertEquals(" four", simple.toString());

        TokenQueue withEscapes = new TokenQueue("(one \\(two\\) three) four");
        assertEquals("one \\(two\\) three", withEscapes.chompBalanced('(', ')'));
        assertEquals(" four", withEscapes.toString());

        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals("", emptyQueue.chompBalanced('(', ')'));

        TokenQueue notStartingWithOpen = new TokenQueue("no open bracket");
        assertEquals("", notStartingWithOpen.chompBalanced('(', ')'));

        TokenQueue unclosed = new TokenQueue("(unclosed (bracket)");
        assertEquals("unclosed (bracket)", unclosed.chompBalanced('(', ')'));
        assertTrue(unclosed.isEmpty());
    }

    @Test
    public void testUnescape_staticHelper() {
        assertEquals("foo bar", TokenQueue.unescape("foo bar"));
        assertEquals("foo(bar)", TokenQueue.unescape("foo\\(bar\\)"));
        assertEquals("foo\\bar", TokenQueue.unescape("foo\\\\bar"));
        assertEquals("test\\", TokenQueue.unescape("test\\"));
    }

    @Test
    public void testConsumeWhitespace_variousScenarios() {
        TokenQueue queue = new TokenQueue("   \t  abc");
        assertTrue(queue.consumeWhitespace());
        assertEquals("abc", queue.toString());
        assertFalse(queue.consumeWhitespace());
    }

    @Test
    public void testConsumeWord_consumesWordChars() {
        TokenQueue queue = new TokenQueue("hello123_world!");
        assertEquals("hello123", queue.consumeWord());
        assertEquals("_world!", queue.toString());

        TokenQueue nonWord = new TokenQueue("!@#");
        assertEquals("", nonWord.consumeWord());
    }

    @Test
    public void testConsumeTagName_consumesTagNameChars() {
        TokenQueue queue = new TokenQueue("ns:tag_name-1 <other>");
        assertEquals("ns:tag_name-1", queue.consumeTagName());
        assertEquals(" <other>", queue.toString());

        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals("", emptyQueue.consumeTagName());
    }

    @Test
    public void testConsumeElementSelector_consumesSelectorChars() {
        TokenQueue queue = new TokenQueue("ns|tag_name-1:pseudo");
        assertEquals("ns|tag_name-1", queue.consumeElementSelector());
        assertEquals(":pseudo", queue.toString());

        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals("", emptyQueue.consumeElementSelector());
    }

    @Test
    public void testConsumeCssIdentifier_consumesCssChars() {
        TokenQueue queue = new TokenQueue("my-class_name.other");
        assertEquals("my-class_name", queue.consumeCssIdentifier());
        assertEquals(".other", queue.toString());

        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals("", emptyQueue.consumeCssIdentifier());
    }

    @Test
    public void testConsumeAttributeKey_consumesAttributeChars() {
        TokenQueue queue = new TokenQueue("data-custom_attr:ns=value");
        assertEquals("data-custom_attr:ns", queue.consumeAttributeKey());
        assertEquals("=value", queue.toString());

        TokenQueue emptyQueue = new TokenQueue("");
        assertEquals("", emptyQueue.consumeAttributeKey());
    }

    @Test
    public void testRemainder_consumesToEnd() {
        TokenQueue queue = new TokenQueue("one two three");
        queue.consume("one ");
        assertEquals("two three", queue.remainder());
        assertTrue(queue.isEmpty());
        assertEquals("", queue.remainder());
    }

    @Test
    public void testToString_returnsRemainingQueue() {
        TokenQueue queue = new TokenQueue("hello world");
        assertEquals("hello world", queue.toString());
        queue.consume("hello ");
        assertEquals("world", queue.toString());
    }
}
