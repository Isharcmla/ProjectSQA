package org.apache.commons.csv;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withQuote_453915255105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20610;
     Object term20801;
     Object term88374;
     Object term88190;

    public CSVFormat_withQuote_453915255105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20612 = new Character('e');
        Class<? extends Object> term88412 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term88411 = ((Class) term88412).getDeclaredField((String) "NONE");
        ((Field) term88411).setAccessible(true);
        Object enum157 = ((Field) term88411).get((Object) null);
        Character term20622 = new Character('p');
        Character term20624 = new Character('C');
        term20610 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20653 = (Object[]) newArray("java.lang.String", 3);
        Object[] term20690 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term20610, term20610.getClass(), "delimiter", 'B');
        setField(term20610, term20610.getClass(), "quoteCharacter", term20612);
        setField(term20610, term20610.getClass(), "quoteMode", enum157);
        setField(term20610, term20610.getClass(), "commentMarker", term20622);
        setField(term20610, term20610.getClass(), "escapeCharacter", term20624);
        setBooleanField(term20610, term20610.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term20610, term20610.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term20610, term20610.getClass(), "ignoreEmptyLines", true);
        setField(term20610, term20610.getClass(), "recordSeparator", "mNHyqmOAFy");
        setField(term20610, term20610.getClass(), "nullString", "UxgSdhxPCH");
        setElement(term20653, 0, "DAujxZPHJC");
        setElement(term20653, 1, "IlBhdrCvHq");
        setElement(term20653, 2, "OirVUQhauU");
        setField(term20610, term20610.getClass(), "header", term20653);
        setElement(term20690, 0, "GLbyDfbNZI");
        setElement(term20690, 1, "oNLcCYDAsO");
        setElement(term20690, 2, "CNqMxLvtcJ");
        setElement(term20690, 3, "ktbqerIaKW");
        setElement(term20690, 4, "VoghngXfsK");
        setElement(term20690, 5, "GbahCBMvct");
        setElement(term20690, 6, "iiHBhsNFgk");
        setElement(term20690, 7, "HknsTajwxJ");
        setElement(term20690, 8, "XtiurrVYKw");
        setField(term20610, term20610.getClass(), "headerComments", term20690);
        setBooleanField(term20610, term20610.getClass(), "skipHeaderRecord", true);
        setBooleanField(term20610, term20610.getClass(), "ignoreHeaderCase", false);
        term20801 = new Character('T');
        Character term88375 = new Character('e');
        Class<? extends Object> term88731 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term88730 = ((Class) term88731).getDeclaredField((String) "NONE");
        ((Field) term88730).setAccessible(true);
        Object enum158 = ((Field) term88730).get((Object) null);
        Character term88379 = new Character('p');
        Character term88380 = new Character('C');
        term88374 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term88385 = (Object[]) newArray("java.lang.String", 3);
        Object[] term88392 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term88374, term88374.getClass(), "delimiter", 'B');
        setField(term88374, term88374.getClass(), "quoteCharacter", term88375);
        setField(term88374, term88374.getClass(), "quoteMode", enum158);
        setField(term88374, term88374.getClass(), "commentMarker", term88379);
        setField(term88374, term88374.getClass(), "escapeCharacter", term88380);
        setBooleanField(term88374, term88374.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term88374, term88374.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term88374, term88374.getClass(), "ignoreEmptyLines", true);
        setField(term88374, term88374.getClass(), "recordSeparator", "mNHyqmOAFy");
        setField(term88374, term88374.getClass(), "nullString", "UxgSdhxPCH");
        setElement(term88385, 0, "DAujxZPHJC");
        setElement(term88385, 1, "IlBhdrCvHq");
        setElement(term88385, 2, "OirVUQhauU");
        setField(term88374, term88374.getClass(), "header", term88385);
        setElement(term88392, 0, "GLbyDfbNZI");
        setElement(term88392, 1, "oNLcCYDAsO");
        setElement(term88392, 2, "CNqMxLvtcJ");
        setElement(term88392, 3, "ktbqerIaKW");
        setElement(term88392, 4, "VoghngXfsK");
        setElement(term88392, 5, "GbahCBMvct");
        setElement(term88392, 6, "iiHBhsNFgk");
        setElement(term88392, 7, "HknsTajwxJ");
        setElement(term88392, 8, "XtiurrVYKw");
        setField(term88374, term88374.getClass(), "headerComments", term88392);
        setBooleanField(term88374, term88374.getClass(), "skipHeaderRecord", true);
        setBooleanField(term88374, term88374.getClass(), "ignoreHeaderCase", false);
        Character term88192 = new Character('T');
        Class<? extends Object> term89050 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term89049 = ((Class) term89050).getDeclaredField((String) "NONE");
        ((Field) term89049).setAccessible(true);
        Object enum159 = ((Field) term89049).get((Object) null);
        Character term88194 = new Character('p');
        Character term88196 = new Character('C');
        term88190 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term88225 = (Object[]) newArray("java.lang.String", 3);
        Object[] term88262 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term88190, term88190.getClass(), "delimiter", 'B');
        setField(term88190, term88190.getClass(), "quoteCharacter", term88192);
        setField(term88190, term88190.getClass(), "quoteMode", enum159);
        setField(term88190, term88190.getClass(), "commentMarker", term88194);
        setField(term88190, term88190.getClass(), "escapeCharacter", term88196);
        setBooleanField(term88190, term88190.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term88190, term88190.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term88190, term88190.getClass(), "ignoreEmptyLines", true);
        setField(term88190, term88190.getClass(), "recordSeparator", "mNHyqmOAFy");
        setField(term88190, term88190.getClass(), "nullString", "UxgSdhxPCH");
        setElement(term88225, 0, "DAujxZPHJC");
        setElement(term88225, 1, "IlBhdrCvHq");
        setElement(term88225, 2, "OirVUQhauU");
        setField(term88190, term88190.getClass(), "header", term88225);
        setElement(term88262, 0, "GLbyDfbNZI");
        setElement(term88262, 1, "oNLcCYDAsO");
        setElement(term88262, 2, "CNqMxLvtcJ");
        setElement(term88262, 3, "ktbqerIaKW");
        setElement(term88262, 4, "VoghngXfsK");
        setElement(term88262, 5, "GbahCBMvct");
        setElement(term88262, 6, "iiHBhsNFgk");
        setElement(term88262, 7, "HknsTajwxJ");
        setElement(term88262, 8, "XtiurrVYKw");
        setField(term88190, term88190.getClass(), "headerComments", term88262);
        setBooleanField(term88190, term88190.getClass(), "skipHeaderRecord", true);
        setBooleanField(term88190, term88190.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term20801;
        Object retValue = callMethod(klass, "withQuote", argTypes, term20610, args);
        assertTrue(recursiveEquals(term20610, term88374));
        assertTrue(recursiveEquals(term20801, 'T'));
        assertTrue(recursiveEquals(retValue, term88190));
    }

};


