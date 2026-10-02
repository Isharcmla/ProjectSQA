package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testPredefinedFormats_constantsConfiguredCorrectly() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteChar());
        assertNull(CSVFormat.DEFAULT.getQuotePolicy());
        assertNull(CSVFormat.DEFAULT.getCommentStart());
        assertNull(CSVFormat.DEFAULT.getEscape());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertNull(CSVFormat.DEFAULT.getNullString());
        assertNull(CSVFormat.DEFAULT.getHeader());
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());

        assertNotNull(CSVFormat.RFC4180);
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());

        assertNotNull(CSVFormat.EXCEL);
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());

        assertNotNull(CSVFormat.TDF);
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());

        assertNotNull(CSVFormat.MYSQL);
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscape());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
        assertNull(CSVFormat.MYSQL.getQuoteChar());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
    }

    @Test
    public void testNewFormat_validDelimiter_success() {
        final CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteChar());
        assertNull(format.getQuotePolicy());
        assertNull(format.getCommentStart());
        assertNull(format.getEscape());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertNull(format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_withLFDelimiter_throwsException() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_withCRDelimiter_throwsException() {
        CSVFormat.newFormat('\r');
    }

    @Test
    public void testWithDelimiter_validDelimiter_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_lfDelimiter_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_crDelimiter_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test
    public void testWithQuoteChar_primitiveChar_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('\'');
        assertEquals(Character.valueOf('\''), format.getQuoteChar());
    }

    @Test
    public void testWithQuoteChar_characterObjectAndNull_success() {
        final CSVFormat formatWithChar = CSVFormat.DEFAULT.withQuoteChar(Character.valueOf('\''));
        assertEquals(Character.valueOf('\''), formatWithChar.getQuoteChar());

        final CSVFormat formatWithNull = CSVFormat.DEFAULT.withQuoteChar((Character) null);
        assertNull(formatWithNull.getQuoteChar());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_lfChar_throwsException() {
        CSVFormat.DEFAULT.withQuoteChar('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_crCharacterObject_throwsException() {
        CSVFormat.DEFAULT.withQuoteChar(Character.valueOf('\r'));
    }

    @Test
    public void testWithQuotePolicy_allValues_success() {
        for (final Quote quotePolicy : Quote.values()) {
            final CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(quotePolicy);
            assertEquals(quotePolicy, format.getQuotePolicy());
        }
        final CSVFormat formatNull = CSVFormat.DEFAULT.withQuotePolicy(null);
        assertNull(formatNull.getQuotePolicy());
    }

    @Test
    public void testWithCommentStart_primitiveChar_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        assertEquals(Character.valueOf('#'), format.getCommentStart());
        assertTrue(format.isCommentingEnabled());
    }

    @Test
    public void testWithCommentStart_characterObjectAndNull_success() {
        final CSVFormat formatWithChar = CSVFormat.DEFAULT.withCommentStart(Character.valueOf('#'));
        assertEquals(Character.valueOf('#'), formatWithChar.getCommentStart());
        assertTrue(formatWithChar.isCommentingEnabled());

        final CSVFormat formatWithNull = formatWithChar.withCommentStart((Character) null);
        assertNull(formatWithNull.getCommentStart());
        assertFalse(formatWithNull.isCommentingEnabled());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_lfChar_throwsException() {
        CSVFormat.DEFAULT.withCommentStart('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_crCharacterObject_throwsException() {
        CSVFormat.DEFAULT.withCommentStart(Character.valueOf('\r'));
    }

    @Test
    public void testWithEscape_primitiveChar_success() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscape());
        assertTrue(format.isEscaping());
    }

    @Test
    public void testWithEscape_characterObjectAndNull_success() {
        final CSVFormat formatWithChar = CSVFormat.DEFAULT.withEscape(Character.valueOf('\\'));
        assertEquals(Character.valueOf('\\'), formatWithChar.getEscape());
        assertTrue(formatWithChar.isEscaping());

        final CSVFormat formatWithNull = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(formatWithNull.getEscape());
        assertFalse(formatWithNull.isEscaping());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_lfChar_throwsException() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_crCharacterObject_throwsException() {
        CSVFormat.DEFAULT.withEscape(Character.valueOf('\r'));
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_booleanFlag_success() {
        final CSVFormat formatTrue = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(formatTrue.getIgnoreSurroundingSpaces());

        final CSVFormat formatFalse = formatTrue.withIgnoreSurroundingSpaces(false);
        assertFalse(formatFalse.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreEmptyLines_booleanFlag_success() {
        final CSVFormat formatFalse = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(formatFalse.getIgnoreEmptyLines());

        final CSVFormat formatTrue = formatFalse.withIgnoreEmptyLines(true);
        assertTrue(formatTrue.getIgnoreEmptyLines());
    }

    @Test
    public void testWithRecordSeparator_charAndStringAndNull_success() {
        final CSVFormat formatChar = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", formatChar.getRecordSeparator());

        final CSVFormat formatString = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", formatString.getRecordSeparator());

        final CSVFormat formatNull = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        assertNull(formatNull.getRecordSeparator());
    }

    @Test
    public void testWithNullString_validAndNull_success() {
        final CSVFormat formatWithNullString = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", formatWithNullString.getNullString());
        assertTrue(formatWithNullString.isNullHandling());

        final CSVFormat formatWithoutNullString = CSVFormat.DEFAULT.withNullString(null);
        assertNull(formatWithoutNullString.getNullString());
        assertFalse(formatWithoutNullString.isNullHandling());
    }

    @Test
    public void testWithHeader_variousHeaders_clonedAndRetrieved() {
        final String[] headers = new String[] { "A", "B", "C" };
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(headers);
        assertArrayEquals(headers, format.getHeader());

        // Header array encapsulation verification
        final String[] retrievedHeader = format.getHeader();
        retrievedHeader[0] = "MODIFIED";
        assertEquals("A", format.getHeader()[0]);

        // Empty header varargs
        final CSVFormat formatEmptyHeader = CSVFormat.DEFAULT.withHeader();
        assertArrayEquals(new String[0], formatEmptyHeader.getHeader());

        // Null header
        final CSVFormat formatNullHeader = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(formatNullHeader.getHeader());
    }

    @Test
    public void testWithSkipHeaderRecord_booleanFlag_success() {
        final CSVFormat formatTrue = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(formatTrue.getSkipHeaderRecord());

        final CSVFormat formatFalse = formatTrue.withSkipHeaderRecord(false);
        assertFalse(formatFalse.getSkipHeaderRecord());
    }

    @Test
    public void testIsQuoting_booleanLogic() {
        assertTrue(CSVFormat.DEFAULT.isQuoting());
        assertFalse(CSVFormat.DEFAULT.withQuoteChar(null).isQuoting());
    }

    @Test
    public void testFormat_validValues_returnsTrimmedFormattedRecord() {
        final String formatted = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", formatted);
    }

    @Test
    public void testParse_validReader_returnsCSVParser() throws Exception {
        final StringReader reader = new StringReader("a,b,c\n1,2,3");
        final CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        assertEquals(2, parser.getRecords().size());
    }

    @Test
    public void testToString_variousConfigurations_includesAllFields() {
        final String defaultString = CSVFormat.DEFAULT.toString();
        assertTrue(defaultString.contains("Delimiter=<,>"));
        assertTrue(defaultString.contains("QuoteChar=<\">"));
        assertTrue(defaultString.contains("RecordSeparator=<\r\n>"));
        assertTrue(defaultString.contains("EmptyLines:ignored"));
        assertTrue(defaultString.contains("SkipHeaderRecord:false"));
        assertFalse(defaultString.contains("Escape="));
        assertFalse(defaultString.contains("CommentStart="));
        assertFalse(defaultString.contains("NullString="));
        assertFalse(defaultString.contains("SurroundingSpaces:ignored"));
        assertFalse(defaultString.contains("Header:"));

        final CSVFormat fullyPopulated = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentStart('#')
                .withNullString("NULL")
                .withIgnoreSurroundingSpaces(true)
                .withHeader("Col1", "Col2")
                .withSkipHeaderRecord(true);

        final String fullString = fullyPopulated.toString();
        assertTrue(fullString.contains("Delimiter=<,>"));
        assertTrue(fullString.contains("Escape=<\\>"));
        assertTrue(fullString.contains("QuoteChar=<\">"));
        assertTrue(fullString.contains("CommentStart=<#>"));
        assertTrue(fullString.contains("NullString=<NULL>"));
        assertTrue(fullString.contains("RecordSeparator=<\r\n>"));
        assertTrue(fullString.contains("EmptyLines:ignored"));
        assertTrue(fullString.contains("SurroundingSpaces:ignored"));
        assertTrue(fullString.contains("SkipHeaderRecord:true"));
        assertTrue(fullString.contains("Header:[Col1, Col2]"));

        final CSVFormat minimal = CSVFormat.newFormat('|');
        final String minimalString = minimal.toString();
        assertEquals("Delimiter=<|> SkipHeaderRecord:false", minimalString);
    }

    @Test
    public void testEqualsAndHashCode_comprehensiveCoverage() {
        final CSVFormat f1 = CSVFormat.DEFAULT;
        final CSVFormat f2 = CSVFormat.DEFAULT;

        // equals identity and null / class checks
        assertTrue(f1.equals(f1));
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("OtherClass"));

        // Base equality
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());

        // Field: delimiter
        final CSVFormat diffDelimiter = f1.withDelimiter(';');
        assertFalse(f1.equals(diffDelimiter));
        assertNotEquals(f1.hashCode(), diffDelimiter.hashCode());

        // Field: quotePolicy
        final CSVFormat diffQuotePolicy = f1.withQuotePolicy(Quote.ALL);
        assertFalse(f1.equals(diffQuotePolicy));
        assertNotEquals(f1.hashCode(), diffQuotePolicy.hashCode());

        // Field: quoteChar
        final CSVFormat fNullQuote = f1.withQuoteChar((Character) null);
        final CSVFormat fCharQuote = f1.withQuoteChar('\'');
        assertFalse(f1.equals(fNullQuote));
        assertFalse(fNullQuote.equals(f1));
        assertFalse(f1.equals(fCharQuote));
        assertTrue(fNullQuote.equals(fNullQuote));
        assertEquals(fNullQuote.hashCode(), fNullQuote.hashCode());

        // Field: commentStart
        final CSVFormat fNullComment = f1.withCommentStart((Character) null);
        final CSVFormat fCharComment = f1.withCommentStart('#');
        final CSVFormat fCharComment2 = f1.withCommentStart('!');
        assertFalse(fNullComment.equals(fCharComment));
        assertFalse(fCharComment.equals(fNullComment));
        assertFalse(fCharComment.equals(fCharComment2));
        assertTrue(fCharComment.equals(f1.withCommentStart('#')));
        assertEquals(fCharComment.hashCode(), f1.withCommentStart('#').hashCode());

        // Field: escape
        final CSVFormat fNullEscape = f1.withEscape((Character) null);
        final CSVFormat fCharEscape = f1.withEscape('\\');
        final CSVFormat fCharEscape2 = f1.withEscape('^');
        assertFalse(fNullEscape.equals(fCharEscape));
        assertFalse(fCharEscape.equals(fNullEscape));
        assertFalse(fCharEscape.equals(fCharEscape2));
        assertTrue(fCharEscape.equals(f1.withEscape('\\')));
        assertEquals(fCharEscape.hashCode(), f1.withEscape('\\').hashCode());

        // Field: nullString
        final CSVFormat fNullStringNull = f1.withNullString(null);
        final CSVFormat fNullStringVal = f1.withNullString("NULL");
        final CSVFormat fNullStringVal2 = f1.withNullString("N/A");
        assertFalse(fNullStringNull.equals(fNullStringVal));
        assertFalse(fNullStringVal.equals(fNullStringNull));
        assertFalse(fNullStringVal.equals(fNullStringVal2));
        assertTrue(fNullStringVal.equals(f1.withNullString("NULL")));
        assertEquals(fNullStringVal.hashCode(), f1.withNullString("NULL").hashCode());

        // Field: header
        final CSVFormat fHeaderNull = f1.withHeader((String[]) null);
        final CSVFormat fHeaderVal = f1.withHeader("A", "B");
        final CSVFormat fHeaderVal2 = f1.withHeader("C", "D");
        assertFalse(fHeaderNull.equals(fHeaderVal));
        assertFalse(fHeaderVal.equals(fHeaderVal2));
        assertTrue(fHeaderVal.equals(f1.withHeader("A", "B")));
        assertEquals(fHeaderVal.hashCode(), f1.withHeader("A", "B").hashCode());

        // Field: ignoreSurroundingSpaces
        final CSVFormat diffSpaces = f1.withIgnoreSurroundingSpaces(true);
        assertFalse(f1.equals(diffSpaces));
        assertNotEquals(f1.hashCode(), diffSpaces.hashCode());

        // Field: ignoreEmptyLines
        final CSVFormat diffEmptyLines = f1.withIgnoreEmptyLines(false);
        assertFalse(f1.equals(diffEmptyLines));
        assertNotEquals(f1.hashCode(), diffEmptyLines.hashCode());

        // Field: skipHeaderRecord
        final CSVFormat diffSkipHeader = f1.withSkipHeaderRecord(true);
        assertFalse(f1.equals(diffSkipHeader));
        assertNotEquals(f1.hashCode(), diffSkipHeader.hashCode());

        // Field: recordSeparator
        final CSVFormat fNullSeparator = f1.withRecordSeparator((String) null);
        final CSVFormat fSeparatorVal = f1.withRecordSeparator("\n");
        final CSVFormat fSeparatorVal2 = f1.withRecordSeparator("\r");
        assertFalse(fNullSeparator.equals(fSeparatorVal));
        assertFalse(fSeparatorVal.equals(fNullSeparator));
        assertFalse(fSeparatorVal.equals(fSeparatorVal2));
        assertTrue(fSeparatorVal.equals(f1.withRecordSeparator("\n")));
        assertEquals(fNullSeparator.hashCode(), f1.withRecordSeparator((String) null).hashCode());
    }

    @Test
    public void testValidate_validConfigurations_passes() {
        CSVFormat.DEFAULT.validate();
        CSVFormat.MYSQL.validate();
        CSVFormat.DEFAULT.withEscape('\\').withQuotePolicy(Quote.NONE).validate();
        CSVFormat.DEFAULT.withHeader("A", "B", "C").validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_quoteCharEqualsDelimiter_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\'').withQuoteChar('\'').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_escapeEqualsDelimiter_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('\\').withEscape('\\').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_commentStartEqualsDelimiter_throwsException() {
        CSVFormat.DEFAULT.withDelimiter('#').withCommentStart('#').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_quoteCharEqualsCommentStart_throwsException() {
        CSVFormat.DEFAULT.withQuoteChar('#').withCommentStart('#').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_escapeEqualsCommentStart_throwsException() {
        CSVFormat.DEFAULT.withEscape('#').withCommentStart('#').validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_quotePolicyNoneWithoutEscape_throwsException() {
        CSVFormat.DEFAULT.withEscape(null).withQuotePolicy(Quote.NONE).validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidate_duplicateHeaders_throwsException() {
        CSVFormat.DEFAULT.withHeader("Col1", "Col2", "Col1").validate();
    }

    @Test
    public void testSerialization_roundTrip_equalsOriginal() throws Exception {
        final CSVFormat original = CSVFormat.DEFAULT
                .withCommentStart('#')
                .withEscape('\\')
                .withHeader("A", "B", "C")
                .withNullString("NULL")
                .withQuotePolicy(Quote.MINIMAL)
                .withSkipHeaderRecord(true);

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.flush();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final CSVFormat deserialized = (CSVFormat) ois.readObject();

        assertEquals(original, deserialized);
        assertEquals(original.hashCode(), deserialized.hashCode());
    }
}
