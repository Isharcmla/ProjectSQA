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

public class CSVFormat_getDelimiter_155525069565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305;
     Object term42702;

    public CSVFormat_getDelimiter_155525069565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2307 = new Character('g');
        Class<? extends Object> term42730 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42729 = ((Class) term42730).getDeclaredField((String) "NONE");
        ((Field) term42729).setAccessible(true);
        Object enum64 = ((Field) term42729).get((Object) null);
        Character term2317 = new Character('Q');
        Character term2319 = new Character('H');
        term2305 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2348 = (Object[]) newArray("java.lang.String", 5);
        Object[] term2409 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term2305, term2305.getClass(), "delimiter", 'c');
        setField(term2305, term2305.getClass(), "quoteCharacter", term2307);
        setField(term2305, term2305.getClass(), "quoteMode", enum64);
        setField(term2305, term2305.getClass(), "commentMarker", term2317);
        setField(term2305, term2305.getClass(), "escapeCharacter", term2319);
        setBooleanField(term2305, term2305.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term2305, term2305.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term2305, term2305.getClass(), "ignoreEmptyLines", false);
        setField(term2305, term2305.getClass(), "recordSeparator", "onpbIeEKoi");
        setField(term2305, term2305.getClass(), "nullString", "YRHGsAkhxb");
        setElement(term2348, 0, "ffYhPOzlUs");
        setElement(term2348, 1, "MLqYREekMl");
        setElement(term2348, 2, "ytSBIKXogI");
        setElement(term2348, 3, "nHXjMycHlU");
        setElement(term2348, 4, "ieCtQFdkii");
        setField(term2305, term2305.getClass(), "header", term2348);
        setElement(term2409, 0, "dEnhdmILtU");
        setElement(term2409, 1, "hoicvmsovO");
        setField(term2305, term2305.getClass(), "headerComments", term2409);
        setBooleanField(term2305, term2305.getClass(), "skipHeaderRecord", true);
        setBooleanField(term2305, term2305.getClass(), "ignoreHeaderCase", true);
        Character term42703 = new Character('g');
        Class<? extends Object> term43001 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43000 = ((Class) term43001).getDeclaredField((String) "NONE");
        ((Field) term43000).setAccessible(true);
        Object enum65 = ((Field) term43000).get((Object) null);
        Character term42707 = new Character('Q');
        Character term42708 = new Character('H');
        term42702 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42713 = (Object[]) newArray("java.lang.String", 5);
        Object[] term42724 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term42702, term42702.getClass(), "delimiter", 'c');
        setField(term42702, term42702.getClass(), "quoteCharacter", term42703);
        setField(term42702, term42702.getClass(), "quoteMode", enum65);
        setField(term42702, term42702.getClass(), "commentMarker", term42707);
        setField(term42702, term42702.getClass(), "escapeCharacter", term42708);
        setBooleanField(term42702, term42702.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term42702, term42702.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term42702, term42702.getClass(), "ignoreEmptyLines", false);
        setField(term42702, term42702.getClass(), "recordSeparator", "onpbIeEKoi");
        setField(term42702, term42702.getClass(), "nullString", "YRHGsAkhxb");
        setElement(term42713, 0, "ffYhPOzlUs");
        setElement(term42713, 1, "MLqYREekMl");
        setElement(term42713, 2, "ytSBIKXogI");
        setElement(term42713, 3, "nHXjMycHlU");
        setElement(term42713, 4, "ieCtQFdkii");
        setField(term42702, term42702.getClass(), "header", term42713);
        setElement(term42724, 0, "dEnhdmILtU");
        setElement(term42724, 1, "hoicvmsovO");
        setField(term42702, term42702.getClass(), "headerComments", term42724);
        setBooleanField(term42702, term42702.getClass(), "skipHeaderRecord", true);
        setBooleanField(term42702, term42702.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelimiter", argTypes, term2305, args);
        assertTrue(recursiveEquals(term2305, term42702));
        assertTrue(recursiveEquals(retValue, 'c'));
    }

};


