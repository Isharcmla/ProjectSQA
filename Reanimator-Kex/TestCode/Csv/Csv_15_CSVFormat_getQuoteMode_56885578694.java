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

public class CSVFormat_getQuoteMode_56885578694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6187;
     Object term51204;
     Object enum105;

    public CSVFormat_getQuoteMode_56885578694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6189 = new Character('b');
        Character term6192 = new Character('z');
        Character term6307 = new Character('j');
        Class<? extends Object> term51324 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51323 = ((Class) term51324).getDeclaredField((String) "MINIMAL");
        ((Field) term51323).setAccessible(true);
        Object enum103 = ((Field) term51323).get((Object) null);
        term6187 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6194 = (Object[]) newArray("java.lang.String", 2);
        Object[] term6219 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term6187, term6187.getClass(), "allowMissingColumnNames", true);
        setField(term6187, term6187.getClass(), "commentMarker", term6189);
        setCharField(term6187, term6187.getClass(), "delimiter", 'S');
        setField(term6187, term6187.getClass(), "escapeCharacter", term6192);
        setElement(term6194, 0, "LWyEaeIyAo");
        setElement(term6194, 1, "yVMkkQhvmN");
        setField(term6187, term6187.getClass(), "header", term6194);
        setElement(term6219, 0, "mvrkADEgpp");
        setElement(term6219, 1, "pXOkjyeIRb");
        setElement(term6219, 2, "GgZWSjxjyE");
        setElement(term6219, 3, "EeBVbzjcCI");
        setElement(term6219, 4, "UfQtPRyWRC");
        setElement(term6219, 5, "FPvxVzzSvD");
        setField(term6187, term6187.getClass(), "headerComments", term6219);
        setBooleanField(term6187, term6187.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term6187, term6187.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term6187, term6187.getClass(), "ignoreSurroundingSpaces", false);
        setField(term6187, term6187.getClass(), "nullString", "WHcwFgsGFC");
        setField(term6187, term6187.getClass(), "quoteCharacter", term6307);
        setField(term6187, term6187.getClass(), "quoteMode", enum103);
        setField(term6187, term6187.getClass(), "recordSeparator", "HzqpegHiRq");
        setBooleanField(term6187, term6187.getClass(), "skipHeaderRecord", true);
        setBooleanField(term6187, term6187.getClass(), "trailingDelimiter", true);
        setBooleanField(term6187, term6187.getClass(), "trim", false);
        setBooleanField(term6187, term6187.getClass(), "autoFlush", false);
        Character term51205 = new Character('b');
        Character term51206 = new Character('z');
        Character term51227 = new Character('j');
        Class<? extends Object> term51612 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51611 = ((Class) term51612).getDeclaredField((String) "MINIMAL");
        ((Field) term51611).setAccessible(true);
        Object enum104 = ((Field) term51611).get((Object) null);
        term51204 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term51207 = (Object[]) newArray("java.lang.String", 2);
        Object[] term51212 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term51204, term51204.getClass(), "allowMissingColumnNames", true);
        setField(term51204, term51204.getClass(), "commentMarker", term51205);
        setCharField(term51204, term51204.getClass(), "delimiter", 'S');
        setField(term51204, term51204.getClass(), "escapeCharacter", term51206);
        setElement(term51207, 0, "LWyEaeIyAo");
        setElement(term51207, 1, "yVMkkQhvmN");
        setField(term51204, term51204.getClass(), "header", term51207);
        setElement(term51212, 0, "mvrkADEgpp");
        setElement(term51212, 1, "pXOkjyeIRb");
        setElement(term51212, 2, "GgZWSjxjyE");
        setElement(term51212, 3, "EeBVbzjcCI");
        setElement(term51212, 4, "UfQtPRyWRC");
        setElement(term51212, 5, "FPvxVzzSvD");
        setField(term51204, term51204.getClass(), "headerComments", term51212);
        setBooleanField(term51204, term51204.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term51204, term51204.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term51204, term51204.getClass(), "ignoreSurroundingSpaces", false);
        setField(term51204, term51204.getClass(), "nullString", "WHcwFgsGFC");
        setField(term51204, term51204.getClass(), "quoteCharacter", term51227);
        setField(term51204, term51204.getClass(), "quoteMode", enum104);
        setField(term51204, term51204.getClass(), "recordSeparator", "HzqpegHiRq");
        setBooleanField(term51204, term51204.getClass(), "skipHeaderRecord", true);
        setBooleanField(term51204, term51204.getClass(), "trailingDelimiter", true);
        setBooleanField(term51204, term51204.getClass(), "trim", false);
        setBooleanField(term51204, term51204.getClass(), "autoFlush", false);
        Class<? extends Object> term51822 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51821 = ((Class) term51822).getDeclaredField((String) "MINIMAL");
        ((Field) term51821).setAccessible(true);
        enum105 = ((Field) term51821).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteMode", argTypes, term6187, args);
        assertTrue(recursiveEquals(term6187, term51204));
        assertTrue(recursiveEquals(retValue, enum105));
    }

};


