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

public class CSVFormat_withEscape_91649797668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8080;
     Object term8187;
     Object term32094;
     Object term31997;

    public CSVFormat_withEscape_91649797668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8082 = new Character('h');
        Class<? extends Object> term32117 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term32116 = ((Class) term32117).getDeclaredField((String) "MINIMAL");
        ((Field) term32116).setAccessible(true);
        Object enum92 = ((Field) term32116).get((Object) null);
        Character term8095 = new Character('k');
        Character term8097 = new Character('X');
        term8080 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8125 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term8080, term8080.getClass(), "delimiter", 'l');
        setField(term8080, term8080.getClass(), "quoteChar", term8082);
        setField(term8080, term8080.getClass(), "quotePolicy", enum92);
        setField(term8080, term8080.getClass(), "commentStart", term8095);
        setField(term8080, term8080.getClass(), "escape", term8097);
        setBooleanField(term8080, term8080.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term8080, term8080.getClass(), "ignoreEmptyLines", true);
        setField(term8080, term8080.getClass(), "recordSeparator", "HzqpegHiRq");
        setField(term8080, term8080.getClass(), "nullString", "jwsfVjMoJT");
        setElement(term8125, 0, "ZfdXfCCFDf");
        setElement(term8125, 1, "MwwjNtdOFT");
        setElement(term8125, 2, "VYkqXKVlAJ");
        setElement(term8125, 3, "XkIoWJRNwN");
        setElement(term8125, 4, "aNWLJdrZMq");
        setField(term8080, term8080.getClass(), "header", term8125);
        setBooleanField(term8080, term8080.getClass(), "skipHeaderRecord", false);
        term8187 = new Character('u');
        Character term32095 = new Character('h');
        Class<? extends Object> term32355 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term32354 = ((Class) term32355).getDeclaredField((String) "MINIMAL");
        ((Field) term32354).setAccessible(true);
        Object enum93 = ((Field) term32354).get((Object) null);
        Character term32099 = new Character('k');
        Character term32100 = new Character('X');
        term32094 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term32105 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term32094, term32094.getClass(), "delimiter", 'l');
        setField(term32094, term32094.getClass(), "quoteChar", term32095);
        setField(term32094, term32094.getClass(), "quotePolicy", enum93);
        setField(term32094, term32094.getClass(), "commentStart", term32099);
        setField(term32094, term32094.getClass(), "escape", term32100);
        setBooleanField(term32094, term32094.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term32094, term32094.getClass(), "ignoreEmptyLines", true);
        setField(term32094, term32094.getClass(), "recordSeparator", "HzqpegHiRq");
        setField(term32094, term32094.getClass(), "nullString", "jwsfVjMoJT");
        setElement(term32105, 0, "ZfdXfCCFDf");
        setElement(term32105, 1, "MwwjNtdOFT");
        setElement(term32105, 2, "VYkqXKVlAJ");
        setElement(term32105, 3, "XkIoWJRNwN");
        setElement(term32105, 4, "aNWLJdrZMq");
        setField(term32094, term32094.getClass(), "header", term32105);
        setBooleanField(term32094, term32094.getClass(), "skipHeaderRecord", false);
        Character term31999 = new Character('h');
        Class<? extends Object> term32593 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term32592 = ((Class) term32593).getDeclaredField((String) "MINIMAL");
        ((Field) term32592).setAccessible(true);
        Object enum94 = ((Field) term32592).get((Object) null);
        Character term32001 = new Character('k');
        Character term32003 = new Character('u');
        term31997 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term32031 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term31997, term31997.getClass(), "delimiter", 'l');
        setField(term31997, term31997.getClass(), "quoteChar", term31999);
        setField(term31997, term31997.getClass(), "quotePolicy", enum94);
        setField(term31997, term31997.getClass(), "commentStart", term32001);
        setField(term31997, term31997.getClass(), "escape", term32003);
        setBooleanField(term31997, term31997.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term31997, term31997.getClass(), "ignoreEmptyLines", true);
        setField(term31997, term31997.getClass(), "recordSeparator", "HzqpegHiRq");
        setField(term31997, term31997.getClass(), "nullString", "jwsfVjMoJT");
        setElement(term32031, 0, "ZfdXfCCFDf");
        setElement(term32031, 1, "MwwjNtdOFT");
        setElement(term32031, 2, "VYkqXKVlAJ");
        setElement(term32031, 3, "XkIoWJRNwN");
        setElement(term32031, 4, "aNWLJdrZMq");
        setField(term31997, term31997.getClass(), "header", term32031);
        setBooleanField(term31997, term31997.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term8187;
        Object retValue = callMethod(klass, "withEscape", argTypes, term8080, args);
        assertTrue(recursiveEquals(term8080, term32094));
        assertTrue(recursiveEquals(term8187, 'u'));
        assertTrue(recursiveEquals(retValue, term31997));
    }

};


