import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TokenQueueTest {

    private TokenQueue queue;

    @Before
    public void setUp() {
        queue = null;
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_normalInput_success() {
        TokenQueue tq = new TokenQueue("hello");
        assertNotNull(tq);
        assertEquals("hello", tq.toString());
    }

    @Test
    public void testConstructor_nullInput_throwsException() {
        boolean thrown = false;
        try {
            new TokenQueue(null);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testConstructor_emptyString_success() {
        TokenQueue tq = new TokenQueue("");
        assertTrue(tq.isEmpty());
    }

    // ---------- isEmpty ----------

    @Test
    public void testIsEmpty_emptyQueue_returnsTrue() {
        queue = new TokenQueue("");
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyQueue_returnsFalse() {
        queue = new TokenQueue("abc");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsEmpty_afterConsumingAll_returnsTrue() {
        queue = new TokenQueue("a");
        queue.consume();
        assertTrue(queue.isEmpty());
    }

    // ---------- peek ----------

    @Test
    public void testPeek_normalInput_returnsFirstChar() {
        queue = new TokenQueue("abc");
        assertEquals('a', queue.peek());
    }

    @Test
    public void testPeek_emptyQueue_returnsZero() {
        queue = new TokenQueue("");
        assertEquals(0, queue.peek());
    }

    // ---------- addFirst(Character) ----------

    @Test
    public void testAddFirstChar_normalInput_addsCharacter() {
        queue = new TokenQueue("bc");
        queue.addFirst(new Character('a'));
        assertEquals("abc", queue.toString());
    }

    // ---------- addFirst(String) ----------

    @Test
    public void testAddFirstString_normalInput_addsString() {
        queue = new TokenQueue("world");
        queue.addFirst("hello ");
        assertEquals("hello world", queue.toString());
    }

    @Test
    public void testAddFirstString_afterConsume_addsAtCurrentPos() {
        queue = new TokenQueue("abc");
        queue.consume(); // pos=1
        queue.addFirst("X");
        assertEquals("Xbc", queue.toString());
    }

    // ---------- matches(String) ----------

    @Test
    public void testMatches_caseInsensitiveMatch_returnsTrue() {
        queue = new TokenQueue("Hello World");
        assertTrue(queue.matches("hello"));
    }

    @Test
    public void testMatches_noMatch_returnsFalse() {
        queue = new TokenQueue("Hello World");
        assertFalse(queue.matches("bye"));
    }

    @Test
    public void testMatches_seqLongerThanRemaining_returnsFalse() {
        queue = new TokenQueue("ab");
        assertFalse(queue.matches("abcdef"));
    }

    // ---------- matchesCS(String) ----------

    @Test
    public void testMatchesCS_caseSensitiveMatch_returnsTrue() {
        queue = new TokenQueue("Hello");
        assertTrue(queue.matchesCS("Hello"));
    }

    @Test
    public void testMatchesCS_caseSensitiveMismatch_returnsFalse() {
        queue = new TokenQueue("Hello");
        assertFalse(queue.matchesCS("hello"));
    }

    // ---------- matchesAny(String...) ----------

    @Test
    public void testMatchesAnyStrings_matchFound_returnsTrue() {
        queue = new TokenQueue("test");
        assertTrue(queue.matchesAny("foo", "te", "bar"));
    }

    @Test
    public void testMatchesAnyStrings_noMatch_returnsFalse() {
        queue = new TokenQueue("test");
        assertFalse(queue.matchesAny("foo", "bar"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void testMatchesAnyChars_matchFound_returnsTrue() {
        queue = new TokenQueue("test");
        assertTrue(queue.matchesAny('x', 't', 'y'));
    }

    @Test
    public void testMatchesAnyChars_noMatch_returnsFalse() {
        queue = new TokenQueue("test");
        assertFalse(queue.matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesAnyChars_emptyQueue_returnsFalse() {
        queue = new TokenQueue("");
        assertFalse(queue.matchesAny('x', 'y'));
    }

    // ---------- matchesStartTag ----------

    @Test
    public void testMatchesStartTag_validStartTag_returnsTrue() {
        queue = new TokenQueue("<div>");
        assertTrue(queue.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_notLessThan_returnsFalse() {
        queue = new TokenQueue("div>");
        assertFalse(queue.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_secondCharNotLetter_returnsFalse() {
        queue = new TokenQueue("<1div>");
        assertFalse(queue.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_tooShort_returnsFalse() {
        queue = new TokenQueue("<");
        assertFalse(queue.matchesStartTag());
    }

    // ---------- matchChomp ----------

    @Test
    public void testMatchChomp_matchFound_removesAndReturnsTrue() {
        queue = new TokenQueue("hello world");
        boolean result = queue.matchChomp("hello");
        assertTrue(result);
        assertEquals(" world", queue.toString());
    }

    @Test
    public void testMatchChomp_noMatch_returnsFalse() {
        queue = new TokenQueue("hello world");
        boolean result = queue.matchChomp("bye");
        assertFalse(result);
        assertEquals("hello world", queue.toString());
    }

    // ---------- matchesWhitespace ----------

    @Test
    public void testMatchesWhitespace_whitespaceFirst_returnsTrue() {
        queue = new TokenQueue(" abc");
        assertTrue(queue.matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespace_nonWhitespaceFirst_returnsFalse() {
        queue = new TokenQueue("abc");
        assertFalse(queue.matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespace_emptyQueue_returnsFalse() {
        queue = new TokenQueue("");
        assertFalse(queue.matchesWhitespace());
    }

    // ---------- matchesWord ----------

    @Test
    public void testMatchesWord_letterFirst_returnsTrue() {
        queue = new TokenQueue("abc");
        assertTrue(queue.matchesWord());
    }

    @Test
    public void testMatchesWord_nonWordFirst_returnsFalse() {
        queue = new TokenQueue("!abc");
        assertFalse(queue.matchesWord());
    }

    @Test
    public void testMatchesWord_emptyQueue_returnsFalse() {
        queue = new TokenQueue("");
        assertFalse(queue.matchesWord());
    }

    // ---------- advance ----------

    @Test
    public void testAdvance_normalInput_movesPosition() {
        queue = new TokenQueue("abc");
        queue.advance();
        assertEquals("bc", queue.toString());
    }

    @Test
    public void testAdvance_emptyQueue_doesNothing() {
        queue = new TokenQueue("");
        queue.advance();
        assertEquals("", queue.toString());
    }

    // ---------- consume() ----------

    @Test
    public void testConsume_normalInput_returnsFirstCharAndAdvances() {
        queue = new TokenQueue("abc");
        char c = queue.consume();
        assertEquals('a', c);
        assertEquals("bc", queue.toString());
    }

    @Test
    public void testConsume_emptyQueue_throwsException() {
        queue = new TokenQueue("");
        boolean thrown = false;
        try {
            queue.consume();
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    // ---------- consume(String) ----------

    @Test
    public void testConsumeString_matchFound_consumesSequence() {
        queue = new TokenQueue("Hello World");
        queue.consume("hello");
        assertEquals(" World", queue.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeString_noMatch_throwsIllegalStateException() {
        queue = new TokenQueue("Hello World");
        queue.consume("bye");
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void testConsumeTo_seqFound_returnsConsumedData() {
        queue = new TokenQueue("one two three");
        String result = queue.consumeTo("two");
        assertEquals("one ", result);
        assertEquals("two three", queue.toString());
    }

    @Test
    public void testConsumeTo_seqNotFound_returnsRemainder() {
        queue = new TokenQueue("one two three");
        String result = queue.consumeTo("xyz");
        assertEquals("one two three", result);
        assertTrue(queue.isEmpty());
    }

    // ---------- consumeToIgnoreCase(String) ----------

    @Test
    public void testConsumeToIgnoreCase_seqFound_returnsConsumedData() {
        queue = new TokenQueue("one Two three");
        String result = queue.consumeToIgnoreCase("two");
        assertEquals("one ", result);
        assertTrue(queue.matches("Two"));
    }

    @Test
    public void testConsumeToIgnoreCase_seqNotFound_consumesAll() {
        queue = new TokenQueue("abcdef");
        String result = queue.consumeToIgnoreCase("xyz");
        assertEquals("abcdef", result);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCase_nonCasedFirstChar_scansCorrectly() {
        queue = new TokenQueue("123-abc");
        String result = queue.consumeToIgnoreCase("-abc");
        assertEquals("123", result);
    }

    // ---------- consumeToAny(String...) ----------

    @Test
    public void testConsumeToAny_matchFound_returnsConsumedData() {
        queue = new TokenQueue("one,two;three");
        String result = queue.consumeToAny(",", ";");
        assertEquals("one", result);
        assertTrue(queue.matches(","));
    }

    @Test
    public void testConsumeToAny_noMatch_consumesAll() {
        queue = new TokenQueue("onetwothree");
        String result = queue.consumeToAny(",", ";");
        assertEquals("onetwothree", result);
        assertTrue(queue.isEmpty());
    }

    // ---------- chompTo(String) ----------

    @Test
    public void testChompTo_seqFound_returnsAndRemovesSeq() {
        queue = new TokenQueue("one two three");
        String result = queue.chompTo("two");
        assertEquals("one ", result);
        assertEquals(" three", queue.toString());
    }

    // ---------- chompToIgnoreCase(String) ----------

    @Test
    public void testChompToIgnoreCase_seqFound_returnsAndRemovesSeq() {
        queue = new TokenQueue("one TWO three");
        String result = queue.chompToIgnoreCase("two");
        assertEquals("one ", result);
        assertEquals(" three", queue.toString());
    }

    // ---------- chompBalanced(char, char) ----------

    @Test
    public void testChompBalanced_normalInput_returnsBalancedString() {
        queue = new TokenQueue("(one (two) three) four");
        String result = queue.chompBalanced('(', ')');
        assertEquals("one (two) three", result);
        assertEquals(" four", queue.toString());
    }

    @Test
    public void testChompBalanced_noOpener_returnsEmptyString() {
        queue = new TokenQueue("no brackets here");
        String result = queue.chompBalanced('(', ')');
        assertEquals("", result);
    }

    @Test
    public void testChompBalanced_withEscapedChar_returnsUnbalancedIncluded() {
        queue = new TokenQueue("(one \\) two) three");
        String result = queue.chompBalanced('(', ')');
        assertEquals("one \\) two", result);
    }

    // ---------- unescape(String) ----------

    @Test
    public void testUnescape_normalInput_removesBackslash() {
        String result = TokenQueue.unescape("one\\ two");
        assertEquals("one two", result);
    }

    @Test
    public void testUnescape_doubleBackslash_returnsSingleBackslash() {
        String result = TokenQueue.unescape("\\\\");
        assertEquals("\\", result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        String result = TokenQueue.unescape("");
        assertEquals("", result);
    }

    @Test
    public void testUnescape_noEscapes_returnsSameString() {
        String result = TokenQueue.unescape("plain");
        assertEquals("plain", result);
    }

    // ---------- consumeWhitespace ----------

    @Test
    public void testConsumeWhitespace_leadingWhitespace_returnsTrue() {
        queue = new TokenQueue("   abc");
        boolean result = queue.consumeWhitespace();
        assertTrue(result);
        assertEquals("abc", queue.toString());
    }

    @Test
    public void testConsumeWhitespace_noLeadingWhitespace_returnsFalse() {
        queue = new TokenQueue("abc");
        boolean result = queue.consumeWhitespace();
        assertFalse(result);
    }

    // ---------- consumeWord ----------

    @Test
    public void testConsumeWord_normalInput_returnsWord() {
        queue = new TokenQueue("hello123 world");
        String result = queue.consumeWord();
        assertEquals("hello123", result);
        assertEquals(" world", queue.toString());
    }

    @Test
    public void testConsumeWord_noWordChars_returnsEmptyString() {
        queue = new TokenQueue("!!!hello");
        String result = queue.consumeWord();
        assertEquals("", result);
    }

    // ---------- consumeTagName ----------

    @Test
    public void testConsumeTagName_normalInput_returnsTagName() {
        queue = new TokenQueue("div-tag:name rest");
        String result = queue.consumeTagName();
        assertEquals("div-tag:name", result);
    }

    @Test
    public void testConsumeTagName_emptyQueue_returnsEmptyString() {
        queue = new TokenQueue("");
        String result = queue.consumeTagName();
        assertEquals("", result);
    }

    // ---------- consumeElementSelector ----------

    @Test
    public void testConsumeElementSelector_normalInput_returnsSelector() {
        queue = new TokenQueue("div|name_rest more");
        String result = queue.consumeElementSelector();
        assertEquals("div|name_rest", result);
    }

    // ---------- consumeCssIdentifier ----------

    @Test
    public void testConsumeCssIdentifier_normalInput_returnsIdentifier() {
        queue = new TokenQueue("my-class_1 rest");
        String result = queue.consumeCssIdentifier();
        assertEquals("my-class_1", result);
    }

    // ---------- consumeAttributeKey ----------

    @Test
    public void testConsumeAttributeKey_normalInput_returnsKey() {
        queue = new TokenQueue("data-foo:bar=value");
        String result = queue.consumeAttributeKey();
        assertEquals("data-foo:bar", result);
    }

    // ---------- remainder ----------

    @Test
    public void testRemainder_normalInput_returnsRemainingAndEmptiesQueue() {
        queue = new TokenQueue("abc");
        queue.consume();
        String result = queue.remainder();
        assertEquals("bc", result);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testRemainder_emptyQueue_returnsEmptyString() {
        queue = new TokenQueue("");
        String result = queue.remainder();
        assertEquals("", result);
    }

    // ---------- toString ----------

    @Test
    public void testToString_afterConsume_returnsRemainingQueue() {
        queue = new TokenQueue("hello");
        queue.consume();
        assertEquals("ello", queue.toString());
    }

    @Test
    public void testToString_freshQueue_returnsFullString() {
        queue = new TokenQueue("full string");
        assertEquals("full string", queue.toString());
    }
}
