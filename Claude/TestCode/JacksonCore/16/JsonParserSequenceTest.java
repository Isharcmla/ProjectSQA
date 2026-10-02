package com.fasterxml.jackson.core.util;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParseException;

public class JsonParserSequenceTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    // ---------------------------------------------------------------
    // createFlattened(...) tests
    // ---------------------------------------------------------------

    @Test
    public void testCreateFlattened_twoSimpleParsers_createsSequenceWithTwoParsers() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertNotNull(seq);
        assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testCreateFlattened_firstIsSequence_flattensParsers() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParser p3 = factory.createParser("3");
        JsonParserSequence innerSeq = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(innerSeq, p3);
        assertEquals(3, outerSeq.containedParsersCount());
    }

    @Test
    public void testCreateFlattened_secondIsSequence_flattensParsers() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParser p3 = factory.createParser("3");
        JsonParserSequence innerSeq = JsonParserSequence.createFlattened(p2, p3);
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(p1, innerSeq);
        assertEquals(3, outerSeq.containedParsersCount());
    }

    @Test
    public void testCreateFlattened_bothAreSequences_flattensParsers() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParser p3 = factory.createParser("3");
        JsonParser p4 = factory.createParser("4");
        JsonParserSequence seqA = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seqB = JsonParserSequence.createFlattened(p3, p4);
        JsonParserSequence combined = JsonParserSequence.createFlattened(seqA, seqB);
        assertEquals(4, combined.containedParsersCount());
    }

    // ---------------------------------------------------------------
    // nextToken() tests
    // ---------------------------------------------------------------

    @Test
    public void testNextToken_multipleParsers_returnsTokensInSequence() throws IOException {
        JsonParser p1 = factory.createParser("1 2");
        JsonParser p2 = factory.createParser("3 4");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        assertEquals(1, seq.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        assertEquals(2, seq.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        assertEquals(3, seq.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        assertEquals(4, seq.getIntValue());
        assertNull(seq.nextToken());
    }

    @Test
    public void testNextToken_emptyParsers_returnsNull() throws IOException {
        JsonParser p1 = factory.createParser("");
        JsonParser p2 = factory.createParser("");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertNull(seq.nextToken());
    }

    @Test
    public void testNextToken_firstParserExhaustedSwitchesToSecond_returnsSecondToken() throws IOException {
        JsonParser p1 = factory.createParser("");
        JsonParser p2 = factory.createParser("true");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(JsonToken.VALUE_TRUE, seq.nextToken());
    }

    @Test
    public void testNextToken_singleParserOnlySequence_returnsAllTokensThenNull() throws IOException {
        JsonParser p1 = factory.createParser("5");
        JsonParser p2 = factory.createParser("");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        assertEquals(5, seq.getIntValue());
        assertNull(seq.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testNextToken_malformedJson_throwsJsonParseException() throws IOException {
        JsonParser p1 = factory.createParser("{invalid");
        JsonParser p2 = factory.createParser("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        while (seq.nextToken() != null) {
            // consume until exception thrown due to malformed content
        }
    }

    // ---------------------------------------------------------------
    // close() tests
    // ---------------------------------------------------------------

    @Test
    public void testClose_multipleParsers_closesAllParsers() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.close();
        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
    }

    @Test
    public void testClose_singleParserOnlySequence_closesParser() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParser p3 = factory.createParser("3");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(seq, p3);
        outerSeq.close();
        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
        assertTrue(p3.isClosed());
    }

    @Test
    public void testNextToken_afterClose_handledGracefully() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.close();
        try {
            JsonToken t = seq.nextToken();
            // Depending on underlying implementation this may return null
            // instead of throwing after being closed.
            assertNull(t);
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // containedParsersCount() tests
    // ---------------------------------------------------------------

    @Test
    public void testContainedParsersCount_twoParsers_returnsTwo() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testContainedParsersCount_flattenedThreeParsers_returnsThree() throws IOException {
        JsonParser p1 = factory.createParser("1");
        JsonParser p2 = factory.createParser("2");
        JsonParser p3 = factory.createParser("3");
        JsonParserSequence innerSeq = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(innerSeq, p3);
        assertEquals(3, outerSeq.containedParsersCount());
    }
}
