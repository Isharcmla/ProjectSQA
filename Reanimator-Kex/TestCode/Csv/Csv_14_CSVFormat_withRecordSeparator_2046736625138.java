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

public class CSVFormat_withRecordSeparator_2046736625138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28028;
     Object term28120;
     Object term106341;
     Object term106272;

    public CSVFormat_withRecordSeparator_2046736625138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28030 = new Character('u');
        Character term28033 = new Character('I');
        Character term28088 = new Character('D');
        Class<? extends Object> term106401 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term106400 = ((Class) term106401).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term106400).setAccessible(true);
        Object enum216 = ((Field) term106400).get((Object) null);
        term28028 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28035 = (Object[]) newArray("java.lang.String", 3);
        Object[] term28072 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term28028, term28028.getClass(), "allowMissingColumnNames", true);
        setField(term28028, term28028.getClass(), "commentMarker", term28030);
        setCharField(term28028, term28028.getClass(), "delimiter", 'W');
        setField(term28028, term28028.getClass(), "escapeCharacter", term28033);
        setElement(term28035, 0, "DuKcNfVVYR");
        setElement(term28035, 1, "fRujHWvXjJ");
        setElement(term28035, 2, "EAIAAStlTz");
        setField(term28028, term28028.getClass(), "header", term28035);
        setField(term28028, term28028.getClass(), "headerComments", term28072);
        setBooleanField(term28028, term28028.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term28028, term28028.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term28028, term28028.getClass(), "ignoreSurroundingSpaces", true);
        setField(term28028, term28028.getClass(), "nullString", "yIWXcOQTgy");
        setField(term28028, term28028.getClass(), "quoteCharacter", term28088);
        setField(term28028, term28028.getClass(), "quoteMode", enum216);
        setField(term28028, term28028.getClass(), "recordSeparator", "xAWekqanqc");
        setBooleanField(term28028, term28028.getClass(), "skipHeaderRecord", true);
        setBooleanField(term28028, term28028.getClass(), "trailingDelimiter", true);
        setBooleanField(term28028, term28028.getClass(), "trim", true);
        term28120 = new Character('J');
        Character term106342 = new Character('u');
        Character term106343 = new Character('I');
        Character term106354 = new Character('D');
        Class<? extends Object> term106651 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term106650 = ((Class) term106651).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term106650).setAccessible(true);
        Object enum217 = ((Field) term106650).get((Object) null);
        term106341 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term106344 = (Object[]) newArray("java.lang.String", 3);
        Object[] term106351 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term106341, term106341.getClass(), "allowMissingColumnNames", true);
        setField(term106341, term106341.getClass(), "commentMarker", term106342);
        setCharField(term106341, term106341.getClass(), "delimiter", 'W');
        setField(term106341, term106341.getClass(), "escapeCharacter", term106343);
        setElement(term106344, 0, "DuKcNfVVYR");
        setElement(term106344, 1, "fRujHWvXjJ");
        setElement(term106344, 2, "EAIAAStlTz");
        setField(term106341, term106341.getClass(), "header", term106344);
        setField(term106341, term106341.getClass(), "headerComments", term106351);
        setBooleanField(term106341, term106341.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term106341, term106341.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term106341, term106341.getClass(), "ignoreSurroundingSpaces", true);
        setField(term106341, term106341.getClass(), "nullString", "yIWXcOQTgy");
        setField(term106341, term106341.getClass(), "quoteCharacter", term106354);
        setField(term106341, term106341.getClass(), "quoteMode", enum217);
        setField(term106341, term106341.getClass(), "recordSeparator", "xAWekqanqc");
        setBooleanField(term106341, term106341.getClass(), "skipHeaderRecord", true);
        setBooleanField(term106341, term106341.getClass(), "trailingDelimiter", true);
        setBooleanField(term106341, term106341.getClass(), "trim", true);
        Character term106274 = new Character('u');
        Character term106277 = new Character('I');
        Character term106332 = new Character('D');
        Class<? extends Object> term106901 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term106900 = ((Class) term106901).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term106900).setAccessible(true);
        Object enum218 = ((Field) term106900).get((Object) null);
        term106272 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term106279 = (Object[]) newArray("java.lang.String", 3);
        Object[] term106316 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term106272, term106272.getClass(), "allowMissingColumnNames", true);
        setField(term106272, term106272.getClass(), "commentMarker", term106274);
        setCharField(term106272, term106272.getClass(), "delimiter", 'W');
        setField(term106272, term106272.getClass(), "escapeCharacter", term106277);
        setElement(term106279, 0, "DuKcNfVVYR");
        setElement(term106279, 1, "fRujHWvXjJ");
        setElement(term106279, 2, "EAIAAStlTz");
        setField(term106272, term106272.getClass(), "header", term106279);
        setField(term106272, term106272.getClass(), "headerComments", term106316);
        setBooleanField(term106272, term106272.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term106272, term106272.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term106272, term106272.getClass(), "ignoreSurroundingSpaces", true);
        setField(term106272, term106272.getClass(), "nullString", "yIWXcOQTgy");
        setField(term106272, term106272.getClass(), "quoteCharacter", term106332);
        setField(term106272, term106272.getClass(), "quoteMode", enum218);
        setField(term106272, term106272.getClass(), "recordSeparator", "J");
        setBooleanField(term106272, term106272.getClass(), "skipHeaderRecord", true);
        setBooleanField(term106272, term106272.getClass(), "trailingDelimiter", true);
        setBooleanField(term106272, term106272.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term28120;
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term28028, args);
        assertTrue(recursiveEquals(term28028, term106341));
        assertTrue(recursiveEquals(term28120, 'J'));
        assertTrue(recursiveEquals(retValue, term106272));
    }

};


