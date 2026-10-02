import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TokenQueueTest {

    private TokenQueue queue;

    @Before
    public void setUp() {
        queue = new TokenQueue("");
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_normalInput_createsQueue() {
        TokenQueue tq = new TokenQueue("hello");
        assertEquals("hello", tq.toString());
    }

    @Test
    public void testConstructor_emptyString_createsEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertTrue(tq.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullInput_throwsException() {
        new TokenQueue(null);
    }

    // ---------- isEmpty ----------

    @Test
    public void testIsEmpty_emptyQueue_returnsTrue() {
        TokenQueue tq = new TokenQueue("");
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyQueue_returnsFalse() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.isEmpty());
    }

    // ---------- peek ----------

    @Test
    public void testPeek_nonEmptyQueue_returnsFirstChar() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.peek());
    }

    @Test
    public void testPeek_emptyQueue_returnsZero() {
        TokenQueue tq = new TokenQueue("");
        assertEquals(0, tq.peek());
    }

    // ---------- addFirst(Character) ----------

    @Test
    public void testAddFirstChar_normalInput_addsCharacter() {
        TokenQueue tq = new TokenQueue("bc");
        tq.addFirst(Character.valueOf('a'));
        assertEquals("abc", tq.toString());
    }

    // ---------- addFirst(String) ----------

    @Test
    public void testAddFirstString_normalInput_addsString() {
        TokenQueue tq = new TokenQueue("world");
        tq.addFirst("hello ");
        assertEquals("hello world", tq.toString());
    }

    @Test
    public void testAddFirstString_afterConsume_addsCorrectRemaining() {
        TokenQueue tq = new TokenQueue("abcdef");
        tq.consume();
        tq.consume();
        tq.addFirst("XY");
        assertEquals("XYcdef", tq.toString());
    }

    // ---------- matches ----------

    @Test
    public void testMatches_caseInsensitiveMatch_returnsTrue() {
        TokenQueue tq = new TokenQueue("Hello World");
        assertTrue(tq.matches("hello"));
    }

    @Test
    public void testMatches_noMatch_returnsFalse() {
        TokenQueue tq = new TokenQueue("Hello World");
        assertFalse(tq.matches("world"));
    }

    // ---------- matchesCS ----------

    @Test
    public void testMatchesCS_caseSensitiveMatch_returnsTrue() {
        TokenQueue tq = new TokenQueue("Hello");
        assertTrue(tq.matchesCS("Hello"));
    }

    @Test
    public void testMatchesCS_caseMismatch_returnsFalse() {
        TokenQueue tq = new TokenQueue("Hello");
        assertFalse(tq.matchesCS("hello"));
    }

    // ---------- matchesAny(String...) ----------

    @Test
    public void testMatchesAnyString_matchFound_returnsTrue() {
        TokenQueue tq = new TokenQueue("foobar");
        assertTrue(tq.matchesAny("baz", "foo"));
    }

    @Test
    public void testMatchesAnyString_noMatch_returnsFalse() {
        TokenQueue tq = new TokenQueue("foobar");
        assertFalse(tq.matchesAny("baz", "qux"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void testMatchesAnyChar_matchFound_returnsTrue() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchesAny('x', 'a'));
    }

    @Test
    public void testMatchesAnyChar_noMatch_returnsFalse() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesAnyChar_emptyQueue_returnsFalse() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.matchesAny('a', 'b'));
    }

    // ---------- matchesStartTag ----------

    @Test
    public void testMatchesStartTag_validStartTag_returnsTrue() {
        TokenQueue tq = new TokenQueue("<div>");
        assertTrue(tq.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_notATag_returnsFalse() {
        TokenQueue tq = new TokenQueue("<1div>");
        assertFalse(tq.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_tooShort_returnsFalse() {
        TokenQueue tq = new TokenQueue("<");
        assertFalse(tq.matchesStartTag());
    }

    // ---------- matchChomp ----------

    @Test
    public void testMatchChomp_matchFound_removesAndReturnsTrue() {
        TokenQueue tq = new TokenQueue("hello world");
        assertTrue(tq.matchChomp("hello"));
        assertEquals(" world", tq.toString());
    }

    @Test
    public void testMatchChomp_noMatch_returnsFalse() {
        TokenQueue tq = new TokenQueue("hello world");
        assertFalse(tq.matchChomp("world"));
        assertEquals("hello world", tq.toString());
    }

    // ---------- matchesWhitespace ----------

    @Test
    public void testMatchesWhitespace_whitespaceChar_returnsTrue() {
        TokenQueue tq = new TokenQueue(" abc");
        assertTrue(tq.matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespace_nonWhitespaceChar_returnsFalse() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespace_emptyQueue_returnsFalse() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.matchesWhitespace());
    }

    // ---------- matchesWord ----------

    @Test
    public void testMatchesWord_letterChar_returnsTrue() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchesWord());
    }

    @Test
    public void testMatchesWord_nonWordChar_returnsFalse() {
        TokenQueue tq = new TokenQueue("!abc");
        assertFalse(tq.matchesWord());
    }

    @Test
    public void testMatchesWord_emptyQueue_returnsFalse() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.matchesWord());
    }

    // ---------- advance ----------

    @Test
    public void testAdvance_nonEmptyQueue_movesPositionForward() {
        TokenQueue tq = new TokenQueue("abc");
        tq.advance();
        assertEquals("bc", tq.toString());
    }

    @Test
    public void testAdvance_emptyQueue_noChange() {
        TokenQueue tq = new TokenQueue("");
        tq.advance();
        assertEquals("", tq.toString());
    }

    // ---------- consume() ----------

    @Test
    public void testConsume_normalInput_returnsFirstCharAndAdvances() {
        TokenQueue tq = new TokenQueue("abc");
        char c = tq.consume();
        assertEquals('a', c);
        assertEquals("bc", tq.toString());
    }

    // ---------- consume(String) ----------

    @Test
    public void testConsumeString_matchFound_advancesQueue() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume("hello");
        assertEquals(" world", tq.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeString_noMatch_throwsException() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume("world");
    }

    // ---------- consumeTo ----------

    @Test
    public void testConsumeTo_seqFound_returnsConsumedPortion() {
        TokenQueue tq = new TokenQueue("hello world");
        String result = tq.consumeTo("world");
        assertEquals("hello ", result);
        assertEquals("world", tq.toString());
    }

    @Test
    public void testConsumeTo_seqNotFound_returnsRemainder() {
        TokenQueue tq = new TokenQueue("hello world");
        String result = tq.consumeTo("xyz");
        assertEquals("hello world", result);
        assertTrue(tq.isEmpty());
    }

    // ---------- consumeToIgnoreCase ----------

    @Test
    public void testConsumeToIgnoreCase_seqFoundCaseInsensitive_returnsConsumed() {
        TokenQueue tq = new TokenQueue("hello WORLD");
        String result = tq.consumeToIgnoreCase("world");
        assertEquals("hello ", result);
    }

    @Test
    public void testConsumeToIgnoreCase_seqNotFound_returnsRemainder() {
        TokenQueue tq = new TokenQueue("hello world");
        String result = tq.consumeToIgnoreCase("xyz");
        assertEquals("hello world", result);
    }

    @Test
    public void testConsumeToIgnoreCase_firstCharNotCased_scansCorrectly() {
        TokenQueue tq = new TokenQueue("123abc456");
        String result = tq.consumeToIgnoreCase("456");
        assertEquals("123abc", result);
    }

    // ---------- consumeToAny ----------

    @Test
    public void testConsumeToAny_seqFound_returnsConsumed() {
        TokenQueue tq = new TokenQueue("hello,world;end");
        String result = tq.consumeToAny(",", ";");
        assertEquals("hello", result);
    }

    @Test
    public void testConsumeToAny_noMatch_consumesAll() {
        TokenQueue tq = new TokenQueue("hello world");
        String result = tq.consumeToAny("xyz");
        assertEquals("hello world", result);
        assertTrue(tq.isEmpty());
    }

    // ---------- chompTo ----------

    @Test
    public void testChompTo_seqFound_returnsAndRemovesMatched() {
        TokenQueue tq = new TokenQueue("hello world end");
        String result = tq.chompTo("world");
        assertEquals("hello ", result);
        assertEquals(" end", tq.toString());
    }

    // ---------- chompToIgnoreCase ----------

    @Test
    public void testChompToIgnoreCase_seqFound_returnsAndRemovesMatched() {
        TokenQueue tq = new TokenQueue("hello WORLD end");
        String result = tq.chompToIgnoreCase("world");
        assertEquals("hello ", result);
        assertEquals(" end", tq.toString());
    }

    // ---------- chompBalanced ----------

    @Test
    public void testChompBalanced_normalInput_returnsBalancedContent() {
        TokenQueue tq = new TokenQueue("(one (two) three) four");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one (two) three", result);
        assertEquals(" four", tq.toString());
    }

    @Test
    public void testChompBalanced_withQuotes_returnsCorrectContent() {
        TokenQueue tq = new TokenQueue("('one two') three");
        String result = tq.chompBalanced('(', ')');
        assertEquals("'one two'", result);
    }

    @Test
    public void testChompBalanced_emptyQueue_returnsEmptyString() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.chompBalanced('(', ')');
        assertEquals("", result);
    }

    @Test
    public void testChompBalanced_withEscapedChar_returnsContentWithEscape() {
        TokenQueue tq = new TokenQueue("(one \\) two) three");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one \\) two", result);
    }

    // ---------- unescape (static) ----------

    @Test
    public void testUnescape_normalEscapedString_returnsUnescaped() {
        String result = TokenQueue.unescape("one\\.two");
        assertEquals("one.two", result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        String result = TokenQueue.unescape("");
        assertEquals("", result);
    }

    @Test
    public void testUnescape_noEscapes_returnsSameString() {
        String result = TokenQueue.unescape("hello");
        assertEquals("hello", result);
    }

    // ---------- consumeWhitespace ----------

    @Test
    public void testConsumeWhitespace_leadingWhitespace_consumesAndReturnsTrue() {
        TokenQueue tq = new TokenQueue("   abc");
        boolean seen = tq.consumeWhitespace();
        assertTrue(seen);
        assertEquals("abc", tq.toString());
    }

    @Test
    public void testConsumeWhitespace_noLeadingWhitespace_returnsFalse() {
        TokenQueue tq = new TokenQueue("abc");
        boolean seen = tq.consumeWhitespace();
        assertFalse(seen);
    }

    // ---------- consumeWord ----------

    @Test
    public void testConsumeWord_wordChars_returnsWord() {
        TokenQueue tq = new TokenQueue("abc123 def");
        String result = tq.consumeWord();
        assertEquals("abc123", result);
    }

    @Test
    public void testConsumeWord_noWordChars_returnsEmptyString() {
        TokenQueue tq = new TokenQueue("!!!abc");
        String result = tq.consumeWord();
        assertEquals("", result);
    }

    // ---------- consumeTagName ----------

    @Test
    public void testConsumeTagName_normalTagName_returnsTagName() {
        TokenQueue tq = new TokenQueue("div-el_1:x rest");
        String result = tq.consumeTagName();
        assertEquals("div-el_1:x", result);
    }

    @Test
    public void testConsumeTagName_emptyQueue_returnsEmptyString() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.consumeTagName();
        assertEquals("", result);
    }

    // ---------- consumeElementSelector ----------

    @Test
    public void testConsumeElementSelector_normalSelector_returnsSelector() {
        TokenQueue tq = new TokenQueue("ns|el_1 rest");
        String result = tq.consumeElementSelector();
        assertEquals("ns|el_1", result);
    }

    @Test
    public void testConsumeElementSelector_wildcardNamespace_returnsSelector() {
        TokenQueue tq = new TokenQueue("*|el rest");
        String result = tq.consumeElementSelector();
        assertEquals("*|el", result);
    }

    // ---------- consumeCssIdentifier ----------

    @Test
    public void testConsumeCssIdentifier_normalIdentifier_returnsIdentifier() {
        TokenQueue tq = new TokenQueue("my-class_1 rest");
        String result = tq.consumeCssIdentifier();
        assertEquals("my-class_1", result);
    }

    @Test
    public void testConsumeCssIdentifier_emptyQueue_returnsEmptyString() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.consumeCssIdentifier();
        assertEquals("", result);
    }

    // ---------- consumeAttributeKey ----------

    @Test
    public void testConsumeAttributeKey_normalKey_returnsKey() {
        TokenQueue tq = new TokenQueue("data-foo:bar= rest");
        String result = tq.consumeAttributeKey();
        assertEquals("data-foo:bar", result);
    }

    @Test
    public void testConsumeAttributeKey_emptyQueue_returnsEmptyString() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.consumeAttributeKey();
        assertEquals("", result);
    }

    // ---------- remainder ----------

    @Test
    public void testRemainder_normalInput_returnsRestAndEmptiesQueue() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume("hello ");
        String result = tq.remainder();
        assertEquals("world", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testRemainder_emptyQueue_returnsEmptyString() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.remainder();
        assertEquals("", result);
    }

    // ---------- toString ----------

    @Test
    public void testToString_afterConsuming_returnsRemainingQueue() {
        TokenQueue tq = new TokenQueue("hello world");
        tq.consume();
        assertEquals("ello world", tq.toString());
    }

    @Test
    public void testToString_freshQueue_returnsFullString() {
        TokenQueue tq = new TokenQueue("hello");
        assertEquals("hello", tq.toString());
    }
}
