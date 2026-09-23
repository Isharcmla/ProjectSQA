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

public class CSVFormat_getRecordSeparator_169175301392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6600;
     Object term50941;

    public CSVFormat_getRecordSeparator_169175301392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6602 = new Character('V');
        Character term6605 = new Character('O');
        Character term6720 = new Character('Q');
        Class<? extends Object> term51061 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51060 = ((Class) term51061).getDeclaredField((String) "ALL");
        ((Field) term51060).setAccessible(true);
        Object enum103 = ((Field) term51060).get((Object) null);
        term6600 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6607 = (Object[]) newArray("java.lang.String", 6);
        Object[] term6680 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term6600, term6600.getClass(), "allowMissingColumnNames", true);
        setField(term6600, term6600.getClass(), "commentMarker", term6602);
        setCharField(term6600, term6600.getClass(), "delimiter", 'p');
        setField(term6600, term6600.getClass(), "escapeCharacter", term6605);
        setElement(term6607, 0, "jwsfVjMoJT");
        setElement(term6607, 1, "ZfdXfCCFDf");
        setElement(term6607, 2, "MwwjNtdOFT");
        setElement(term6607, 3, "VYkqXKVlAJ");
        setElement(term6607, 4, "XkIoWJRNwN");
        setElement(term6607, 5, "aNWLJdrZMq");
        setField(term6600, term6600.getClass(), "header", term6607);
        setElement(term6680, 0, "HHmNoYxIGj");
        setElement(term6680, 1, "PtirvZmsGt");
        setField(term6600, term6600.getClass(), "headerComments", term6680);
        setBooleanField(term6600, term6600.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term6600, term6600.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term6600, term6600.getClass(), "ignoreSurroundingSpaces", true);
        setField(term6600, term6600.getClass(), "nullString", "HWkpTmtlrc");
        setField(term6600, term6600.getClass(), "quoteCharacter", term6720);
        setField(term6600, term6600.getClass(), "quoteMode", enum103);
        setField(term6600, term6600.getClass(), "recordSeparator", "hMmaoREuCK");
        setBooleanField(term6600, term6600.getClass(), "skipHeaderRecord", true);
        setBooleanField(term6600, term6600.getClass(), "trailingDelimiter", true);
        setBooleanField(term6600, term6600.getClass(), "trim", false);
        Character term50942 = new Character('V');
        Character term50943 = new Character('O');
        Character term50964 = new Character('Q');
        Class<? extends Object> term51337 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51336 = ((Class) term51337).getDeclaredField((String) "ALL");
        ((Field) term51336).setAccessible(true);
        Object enum104 = ((Field) term51336).get((Object) null);
        term50941 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50944 = (Object[]) newArray("java.lang.String", 6);
        Object[] term50957 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term50941, term50941.getClass(), "allowMissingColumnNames", true);
        setField(term50941, term50941.getClass(), "commentMarker", term50942);
        setCharField(term50941, term50941.getClass(), "delimiter", 'p');
        setField(term50941, term50941.getClass(), "escapeCharacter", term50943);
        setElement(term50944, 0, "jwsfVjMoJT");
        setElement(term50944, 1, "ZfdXfCCFDf");
        setElement(term50944, 2, "MwwjNtdOFT");
        setElement(term50944, 3, "VYkqXKVlAJ");
        setElement(term50944, 4, "XkIoWJRNwN");
        setElement(term50944, 5, "aNWLJdrZMq");
        setField(term50941, term50941.getClass(), "header", term50944);
        setElement(term50957, 0, "HHmNoYxIGj");
        setElement(term50957, 1, "PtirvZmsGt");
        setField(term50941, term50941.getClass(), "headerComments", term50957);
        setBooleanField(term50941, term50941.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term50941, term50941.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term50941, term50941.getClass(), "ignoreSurroundingSpaces", true);
        setField(term50941, term50941.getClass(), "nullString", "HWkpTmtlrc");
        setField(term50941, term50941.getClass(), "quoteCharacter", term50964);
        setField(term50941, term50941.getClass(), "quoteMode", enum104);
        setField(term50941, term50941.getClass(), "recordSeparator", "hMmaoREuCK");
        setBooleanField(term50941, term50941.getClass(), "skipHeaderRecord", true);
        setBooleanField(term50941, term50941.getClass(), "trailingDelimiter", true);
        setBooleanField(term50941, term50941.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSeparator", argTypes, term6600, args);
        assertTrue(recursiveEquals(term6600, term50941));
        assertTrue(recursiveEquals(retValue, "hMmaoREuCK"));
    }

};


