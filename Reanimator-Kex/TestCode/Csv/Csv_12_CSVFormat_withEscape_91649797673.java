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

public class CSVFormat_withEscape_91649797673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9278;
     Object term9406;
     Object term38056;
     Object term37934;

    public CSVFormat_withEscape_91649797673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9280 = new Character('g');
        Class<? extends Object> term38083 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term38082 = ((Class) term38083).getDeclaredField((String) "ALL");
        ((Field) term38082).setAccessible(true);
        Object enum96 = ((Field) term38082).get((Object) null);
        Character term9289 = new Character('E');
        Character term9291 = new Character('T');
        term9278 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9320 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term9278, term9278.getClass(), "delimiter", 'i');
        setField(term9278, term9278.getClass(), "quoteCharacter", term9280);
        setField(term9278, term9278.getClass(), "quoteMode", enum96);
        setField(term9278, term9278.getClass(), "commentMarker", term9289);
        setField(term9278, term9278.getClass(), "escapeCharacter", term9291);
        setBooleanField(term9278, term9278.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9278, term9278.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term9278, term9278.getClass(), "ignoreEmptyLines", true);
        setField(term9278, term9278.getClass(), "recordSeparator", "aWYOWZFyaX");
        setField(term9278, term9278.getClass(), "nullString", "BRIVNtfUWU");
        setElement(term9320, 0, "DbiCVtPPCT");
        setElement(term9320, 1, "WzFopsaDuG");
        setElement(term9320, 2, "PapWxkhEWe");
        setElement(term9320, 3, "smnHEqRFRx");
        setElement(term9320, 4, "XYtryyobou");
        setElement(term9320, 5, "OYbzXylRWW");
        setElement(term9320, 6, "DSNsTGYXDF");
        setField(term9278, term9278.getClass(), "header", term9320);
        setBooleanField(term9278, term9278.getClass(), "skipHeaderRecord", false);
        term9406 = new Character('m');
        Character term38057 = new Character('g');
        Class<? extends Object> term38349 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term38348 = ((Class) term38349).getDeclaredField((String) "ALL");
        ((Field) term38348).setAccessible(true);
        Object enum97 = ((Field) term38348).get((Object) null);
        Character term38061 = new Character('E');
        Character term38062 = new Character('T');
        term38056 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term38067 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term38056, term38056.getClass(), "delimiter", 'i');
        setField(term38056, term38056.getClass(), "quoteCharacter", term38057);
        setField(term38056, term38056.getClass(), "quoteMode", enum97);
        setField(term38056, term38056.getClass(), "commentMarker", term38061);
        setField(term38056, term38056.getClass(), "escapeCharacter", term38062);
        setBooleanField(term38056, term38056.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term38056, term38056.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term38056, term38056.getClass(), "ignoreEmptyLines", true);
        setField(term38056, term38056.getClass(), "recordSeparator", "aWYOWZFyaX");
        setField(term38056, term38056.getClass(), "nullString", "BRIVNtfUWU");
        setElement(term38067, 0, "DbiCVtPPCT");
        setElement(term38067, 1, "WzFopsaDuG");
        setElement(term38067, 2, "PapWxkhEWe");
        setElement(term38067, 3, "smnHEqRFRx");
        setElement(term38067, 4, "XYtryyobou");
        setElement(term38067, 5, "OYbzXylRWW");
        setElement(term38067, 6, "DSNsTGYXDF");
        setField(term38056, term38056.getClass(), "header", term38067);
        setBooleanField(term38056, term38056.getClass(), "skipHeaderRecord", false);
        Character term37936 = new Character('g');
        Class<? extends Object> term38615 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term38614 = ((Class) term38615).getDeclaredField((String) "ALL");
        ((Field) term38614).setAccessible(true);
        Object enum98 = ((Field) term38614).get((Object) null);
        Character term37938 = new Character('E');
        Character term37940 = new Character('m');
        term37934 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term37969 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term37934, term37934.getClass(), "delimiter", 'i');
        setField(term37934, term37934.getClass(), "quoteCharacter", term37936);
        setField(term37934, term37934.getClass(), "quoteMode", enum98);
        setField(term37934, term37934.getClass(), "commentMarker", term37938);
        setField(term37934, term37934.getClass(), "escapeCharacter", term37940);
        setBooleanField(term37934, term37934.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term37934, term37934.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term37934, term37934.getClass(), "ignoreEmptyLines", true);
        setField(term37934, term37934.getClass(), "recordSeparator", "aWYOWZFyaX");
        setField(term37934, term37934.getClass(), "nullString", "BRIVNtfUWU");
        setElement(term37969, 0, "DbiCVtPPCT");
        setElement(term37969, 1, "WzFopsaDuG");
        setElement(term37969, 2, "PapWxkhEWe");
        setElement(term37969, 3, "smnHEqRFRx");
        setElement(term37969, 4, "XYtryyobou");
        setElement(term37969, 5, "OYbzXylRWW");
        setElement(term37969, 6, "DSNsTGYXDF");
        setField(term37934, term37934.getClass(), "header", term37969);
        setBooleanField(term37934, term37934.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term9406;
        Object retValue = callMethod(klass, "withEscape", argTypes, term9278, args);
        assertTrue(recursiveEquals(term9278, term38056));
        assertTrue(recursiveEquals(term9406, 'm'));
        assertTrue(recursiveEquals(retValue, term37934));
    }

};


