package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParserSequenceTest {

    private final JsonFactory JSON_F = new JsonFactory();

    @Test
    public void testCreateFlattened_neitherSequence_createsSequence() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        Assert.assertNotNull(seq);
        Assert.assertEquals(2, seq.containedParsersCount());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        Assert.assertEquals(1, seq.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        Assert.assertEquals(2, seq.getIntValue());
        Assert.assertNull(seq.nextToken());
    }

    @Test
    public void testCreateFlattened_firstIsSequence_flattensFirst() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);

        JsonParser p3 = JSON_F.createParser("3");
        JsonParserSequence result = JsonParserSequence.createFlattened(seq1, p3);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.containedParsersCount());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(1, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(2, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(3, result.getIntValue());
        Assert.assertNull(result.nextToken());
    }

    @Test
    public void testCreateFlattened_secondIsSequence_flattensSecond() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParser p3 = JSON_F.createParser("3");
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(p2, p3);

        JsonParserSequence result = JsonParserSequence.createFlattened(p1, seq2);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.containedParsersCount());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(1, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(2, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(3, result.getIntValue());
        Assert.assertNull(result.nextToken());
    }

    @Test
    public void testCreateFlattened_bothAreSequences_flattensBoth() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);

        JsonParser p3 = JSON_F.createParser("3");
        JsonParser p4 = JSON_F.createParser("4");
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(p3, p4);

        JsonParserSequence result = JsonParserSequence.createFlattened(seq1, seq2);

        Assert.assertNotNull(result);
        Assert.assertEquals(4, result.containedParsersCount());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(1, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(2, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(3, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(4, result.getIntValue());
        Assert.assertNull(result.nextToken());
    }

    @Test
    public void testCreateFlattened_nestedSequences_flattensRecursively() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParser p3 = JSON_F.createParser("3");
        JsonParser p4 = JSON_F.createParser("4");

        JsonParserSequence inner = new JsonParserSequence(new JsonParser[]{p1, p2});
        JsonParserSequence outer = new JsonParserSequence(new JsonParser[]{inner, p3});

        JsonParserSequence result = JsonParserSequence.createFlattened(outer, p4);

        Assert.assertEquals(4, result.containedParsersCount());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(1, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(2, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(3, result.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, result.nextToken());
        Assert.assertEquals(4, result.getIntValue());
        Assert.assertNull(result.nextToken());
    }

    @Test
    public void testAddFlattenedActiveParsers_partiallyConsumedSequence_includesActiveOnly() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken()); // Reads 1 from p1
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken()); // Switches to p2, reads 2

        List<JsonParser> resultList = new ArrayList<JsonParser>();
        seq.addFlattenedActiveParsers(resultList);

        // Since p1 was already completed and delegate moved to p2, active parser is only p2
        Assert.assertEquals(1, resultList.size());
        Assert.assertSame(p2, resultList.get(0));
    }

    @Test
    public void testNextToken_emptyParsers_skipsAndReturnsNull() throws IOException {
        JsonParser p1 = JSON_F.createParser("");
        JsonParser p2 = JSON_F.createParser("");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        Assert.assertNull(seq.nextToken());
    }

    @Test
    public void testNextToken_interspersedEmptyAndNonEmptyParsers() throws IOException {
        JsonParser p1 = JSON_F.createParser("");
        JsonParser p2 = JSON_F.createParser("\"hello\"");
        JsonParser p3 = JSON_F.createParser("");

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(seq1, p3);

        Assert.assertEquals(JsonToken.VALUE_STRING, seq2.nextToken());
        Assert.assertEquals("hello", seq2.getText());
        Assert.assertNull(seq2.nextToken());
    }

    @Test
    public void testClose_closesAllUnderlyingParsers() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParser p3 = JSON_F.createParser("3");

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq = JsonParserSequence.createFlattened(seq1, p3);

        Assert.assertFalse(p1.isClosed());
        Assert.assertFalse(p2.isClosed());
        Assert.assertFalse(p3.isClosed());

        seq.close();

        Assert.assertTrue(p1.isClosed());
        Assert.assertTrue(p2.isClosed());
        Assert.assertTrue(p3.isClosed());
        Assert.assertTrue(seq.isClosed());
    }

    @Test
    public void testSwitchToNext_returnsFalseWhenNoMoreParsers() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[]{p1, p2});

        Assert.assertTrue(seq.switchToNext()); // moves to p2
        Assert.assertFalse(seq.switchToNext()); // no more parsers, returns false
    }

    @Test
    public void testContainedParsersCount_returnsConstructedArrayLength() throws IOException {
        JsonParser p1 = JSON_F.createParser("1");
        JsonParser p2 = JSON_F.createParser("2");
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[]{p1, p2});

        Assert.assertEquals(2, seq.containedParsersCount());
        seq.nextToken();
        seq.nextToken();
        // Count remains identical even after tokens are consumed
        Assert.assertEquals(2, seq.containedParsersCount());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_withNullArray_throwsNullPointerException() {
        new JsonParserSequence(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testConstructor_withEmptyArray_throwsArrayIndexOutOfBoundsException() {
        new JsonParserSequence(new JsonParser[0]);
    }
}
