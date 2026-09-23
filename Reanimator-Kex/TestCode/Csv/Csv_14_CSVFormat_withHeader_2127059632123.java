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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withHeader_2127059632123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21124;
     Object term84624;
     Object term84500;

    public CSVFormat_withHeader_2127059632123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21126 = new Character('T');
        Character term21129 = new Character('m');
        Character term21340 = new Character('M');
        Class<? extends Object> term84840 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term84839 = ((Class) term84840).getDeclaredField((String) "NONE");
        ((Field) term84839).setAccessible(true);
        Object enum169 = ((Field) term84839).get((Object) null);
        term21124 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21131 = (Object[]) newArray("java.lang.String", 9);
        Object[] term21240 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term21124, term21124.getClass(), "allowMissingColumnNames", true);
        setField(term21124, term21124.getClass(), "commentMarker", term21126);
        setCharField(term21124, term21124.getClass(), "delimiter", 'i');
        setField(term21124, term21124.getClass(), "escapeCharacter", term21129);
        setElement(term21131, 0, "UxgSdhxPCH");
        setElement(term21131, 1, "DAujxZPHJC");
        setElement(term21131, 2, "IlBhdrCvHq");
        setElement(term21131, 3, "OirVUQhauU");
        setElement(term21131, 4, "GLbyDfbNZI");
        setElement(term21131, 5, "oNLcCYDAsO");
        setElement(term21131, 6, "CNqMxLvtcJ");
        setElement(term21131, 7, "ktbqerIaKW");
        setElement(term21131, 8, "VoghngXfsK");
        setField(term21124, term21124.getClass(), "header", term21131);
        setElement(term21240, 0, "GbahCBMvct");
        setElement(term21240, 1, "iiHBhsNFgk");
        setElement(term21240, 2, "HknsTajwxJ");
        setElement(term21240, 3, "XtiurrVYKw");
        setElement(term21240, 4, "rsumfoDNHa");
        setElement(term21240, 5, "ceCWHUTQUM");
        setElement(term21240, 6, "LrqwfrKKtS");
        setField(term21124, term21124.getClass(), "headerComments", term21240);
        setBooleanField(term21124, term21124.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term21124, term21124.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term21124, term21124.getClass(), "ignoreSurroundingSpaces", true);
        setField(term21124, term21124.getClass(), "nullString", "ZUdnQXfzCI");
        setField(term21124, term21124.getClass(), "quoteCharacter", term21340);
        setField(term21124, term21124.getClass(), "quoteMode", enum169);
        setField(term21124, term21124.getClass(), "recordSeparator", "EULDrUNQvw");
        setBooleanField(term21124, term21124.getClass(), "skipHeaderRecord", false);
        setBooleanField(term21124, term21124.getClass(), "trailingDelimiter", true);
        setBooleanField(term21124, term21124.getClass(), "trim", true);
        Character term84625 = new Character('T');
        Character term84626 = new Character('m');
        Character term84663 = new Character('M');
        Class<? extends Object> term85199 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term85198 = ((Class) term85199).getDeclaredField((String) "NONE");
        ((Field) term85198).setAccessible(true);
        Object enum170 = ((Field) term85198).get((Object) null);
        term84624 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term84627 = (Object[]) newArray("java.lang.String", 9);
        Object[] term84646 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term84624, term84624.getClass(), "allowMissingColumnNames", true);
        setField(term84624, term84624.getClass(), "commentMarker", term84625);
        setCharField(term84624, term84624.getClass(), "delimiter", 'i');
        setField(term84624, term84624.getClass(), "escapeCharacter", term84626);
        setElement(term84627, 0, "UxgSdhxPCH");
        setElement(term84627, 1, "DAujxZPHJC");
        setElement(term84627, 2, "IlBhdrCvHq");
        setElement(term84627, 3, "OirVUQhauU");
        setElement(term84627, 4, "GLbyDfbNZI");
        setElement(term84627, 5, "oNLcCYDAsO");
        setElement(term84627, 6, "CNqMxLvtcJ");
        setElement(term84627, 7, "ktbqerIaKW");
        setElement(term84627, 8, "VoghngXfsK");
        setField(term84624, term84624.getClass(), "header", term84627);
        setElement(term84646, 0, "GbahCBMvct");
        setElement(term84646, 1, "iiHBhsNFgk");
        setElement(term84646, 2, "HknsTajwxJ");
        setElement(term84646, 3, "XtiurrVYKw");
        setElement(term84646, 4, "rsumfoDNHa");
        setElement(term84646, 5, "ceCWHUTQUM");
        setElement(term84646, 6, "LrqwfrKKtS");
        setField(term84624, term84624.getClass(), "headerComments", term84646);
        setBooleanField(term84624, term84624.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term84624, term84624.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term84624, term84624.getClass(), "ignoreSurroundingSpaces", true);
        setField(term84624, term84624.getClass(), "nullString", "ZUdnQXfzCI");
        setField(term84624, term84624.getClass(), "quoteCharacter", term84663);
        setField(term84624, term84624.getClass(), "quoteMode", enum170);
        setField(term84624, term84624.getClass(), "recordSeparator", "EULDrUNQvw");
        setBooleanField(term84624, term84624.getClass(), "skipHeaderRecord", false);
        setBooleanField(term84624, term84624.getClass(), "trailingDelimiter", true);
        setBooleanField(term84624, term84624.getClass(), "trim", true);
        Character term84502 = new Character('T');
        Character term84505 = new Character('m');
        Character term84607 = new Character('M');
        Class<? extends Object> term85468 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term85467 = ((Class) term85468).getDeclaredField((String) "NONE");
        ((Field) term85467).setAccessible(true);
        Object enum171 = ((Field) term85467).get((Object) null);
        term84500 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term84507 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term84500, term84500.getClass(), "allowMissingColumnNames", true);
        setField(term84500, term84500.getClass(), "commentMarker", term84502);
        setCharField(term84500, term84500.getClass(), "delimiter", 'i');
        setField(term84500, term84500.getClass(), "escapeCharacter", term84505);
        setField(term84500, term84500.getClass(), "header", null);
        setElement(term84507, 0, "GbahCBMvct");
        setElement(term84507, 1, "iiHBhsNFgk");
        setElement(term84507, 2, "HknsTajwxJ");
        setElement(term84507, 3, "XtiurrVYKw");
        setElement(term84507, 4, "rsumfoDNHa");
        setElement(term84507, 5, "ceCWHUTQUM");
        setElement(term84507, 6, "LrqwfrKKtS");
        setField(term84500, term84500.getClass(), "headerComments", term84507);
        setBooleanField(term84500, term84500.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term84500, term84500.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term84500, term84500.getClass(), "ignoreSurroundingSpaces", true);
        setField(term84500, term84500.getClass(), "nullString", "ZUdnQXfzCI");
        setField(term84500, term84500.getClass(), "quoteCharacter", term84607);
        setField(term84500, term84500.getClass(), "quoteMode", enum171);
        setField(term84500, term84500.getClass(), "recordSeparator", "EULDrUNQvw");
        setBooleanField(term84500, term84500.getClass(), "skipHeaderRecord", false);
        setBooleanField(term84500, term84500.getClass(), "trailingDelimiter", true);
        setBooleanField(term84500, term84500.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withHeader", argTypes, term21124, args);
        assertTrue(recursiveEquals(term21124, term84624));
        assertTrue(recursiveEquals(retValue, term84500));
    }

};


