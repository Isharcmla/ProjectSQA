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

public class CSVFormat_getRecordSeparator_169175301395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6624;
     Object term52156;

    public CSVFormat_getRecordSeparator_169175301395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6626 = new Character('V');
        Character term6629 = new Character('O');
        Character term6744 = new Character('Q');
        Class<? extends Object> term52425 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52424 = ((Class) term52425).getDeclaredField((String) "NONE");
        ((Field) term52424).setAccessible(true);
        Object enum106 = ((Field) term52424).get((Object) null);
        term6624 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6631 = (Object[]) newArray("java.lang.String", 6);
        Object[] term6704 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term6624, term6624.getClass(), "allowMissingColumnNames", false);
        setField(term6624, term6624.getClass(), "commentMarker", term6626);
        setCharField(term6624, term6624.getClass(), "delimiter", 'p');
        setField(term6624, term6624.getClass(), "escapeCharacter", term6629);
        setElement(term6631, 0, "jwsfVjMoJT");
        setElement(term6631, 1, "ZfdXfCCFDf");
        setElement(term6631, 2, "MwwjNtdOFT");
        setElement(term6631, 3, "VYkqXKVlAJ");
        setElement(term6631, 4, "XkIoWJRNwN");
        setElement(term6631, 5, "aNWLJdrZMq");
        setField(term6624, term6624.getClass(), "header", term6631);
        setElement(term6704, 0, "HHmNoYxIGj");
        setElement(term6704, 1, "PtirvZmsGt");
        setField(term6624, term6624.getClass(), "headerComments", term6704);
        setBooleanField(term6624, term6624.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term6624, term6624.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term6624, term6624.getClass(), "ignoreSurroundingSpaces", false);
        setField(term6624, term6624.getClass(), "nullString", "HWkpTmtlrc");
        setField(term6624, term6624.getClass(), "quoteCharacter", term6744);
        setField(term6624, term6624.getClass(), "quoteMode", enum106);
        setField(term6624, term6624.getClass(), "recordSeparator", "hMmaoREuCK");
        setBooleanField(term6624, term6624.getClass(), "skipHeaderRecord", false);
        setBooleanField(term6624, term6624.getClass(), "trailingDelimiter", false);
        setBooleanField(term6624, term6624.getClass(), "trim", true);
        setBooleanField(term6624, term6624.getClass(), "autoFlush", false);
        Character term52157 = new Character('V');
        Character term52158 = new Character('O');
        Character term52179 = new Character('Q');
        Class<? extends Object> term52704 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52703 = ((Class) term52704).getDeclaredField((String) "NONE");
        ((Field) term52703).setAccessible(true);
        Object enum107 = ((Field) term52703).get((Object) null);
        term52156 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term52159 = (Object[]) newArray("java.lang.String", 6);
        Object[] term52172 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term52156, term52156.getClass(), "allowMissingColumnNames", false);
        setField(term52156, term52156.getClass(), "commentMarker", term52157);
        setCharField(term52156, term52156.getClass(), "delimiter", 'p');
        setField(term52156, term52156.getClass(), "escapeCharacter", term52158);
        setElement(term52159, 0, "jwsfVjMoJT");
        setElement(term52159, 1, "ZfdXfCCFDf");
        setElement(term52159, 2, "MwwjNtdOFT");
        setElement(term52159, 3, "VYkqXKVlAJ");
        setElement(term52159, 4, "XkIoWJRNwN");
        setElement(term52159, 5, "aNWLJdrZMq");
        setField(term52156, term52156.getClass(), "header", term52159);
        setElement(term52172, 0, "HHmNoYxIGj");
        setElement(term52172, 1, "PtirvZmsGt");
        setField(term52156, term52156.getClass(), "headerComments", term52172);
        setBooleanField(term52156, term52156.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term52156, term52156.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term52156, term52156.getClass(), "ignoreSurroundingSpaces", false);
        setField(term52156, term52156.getClass(), "nullString", "HWkpTmtlrc");
        setField(term52156, term52156.getClass(), "quoteCharacter", term52179);
        setField(term52156, term52156.getClass(), "quoteMode", enum107);
        setField(term52156, term52156.getClass(), "recordSeparator", "hMmaoREuCK");
        setBooleanField(term52156, term52156.getClass(), "skipHeaderRecord", false);
        setBooleanField(term52156, term52156.getClass(), "trailingDelimiter", false);
        setBooleanField(term52156, term52156.getClass(), "trim", true);
        setBooleanField(term52156, term52156.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSeparator", argTypes, term6624, args);
        assertTrue(recursiveEquals(term6624, term52156));
        assertTrue(recursiveEquals(retValue, "hMmaoREuCK"));
    }

};


