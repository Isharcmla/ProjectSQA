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

public class CSVFormat_withQuote_453915255135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26285;
     Object term26441;
     Object term101086;
     Object term100936;

    public CSVFormat_withQuote_453915255135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term26287 = new Character('B');
        Character term26290 = new Character('q');
        Character term26417 = new Character('F');
        Class<? extends Object> term101218 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term101217 = ((Class) term101218).getDeclaredField((String) "ALL");
        ((Field) term101217).setAccessible(true);
        Object enum205 = ((Field) term101217).get((Object) null);
        term26285 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26292 = (Object[]) newArray("java.lang.String", 4);
        Object[] term26341 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term26285, term26285.getClass(), "allowMissingColumnNames", true);
        setField(term26285, term26285.getClass(), "commentMarker", term26287);
        setCharField(term26285, term26285.getClass(), "delimiter", 'Y');
        setField(term26285, term26285.getClass(), "escapeCharacter", term26290);
        setElement(term26292, 0, "wgRGBNrTGP");
        setElement(term26292, 1, "FIdNVptZpW");
        setElement(term26292, 2, "rQjxAhisjm");
        setElement(term26292, 3, "ZDhASPHjDG");
        setField(term26285, term26285.getClass(), "header", term26292);
        setElement(term26341, 0, "HNVOAXYNEZ");
        setElement(term26341, 1, "gbbYBYyfvr");
        setElement(term26341, 2, "SrWMUlbtWV");
        setElement(term26341, 3, "VePIumgrrU");
        setElement(term26341, 4, "DPwIqlszZo");
        setField(term26285, term26285.getClass(), "headerComments", term26341);
        setBooleanField(term26285, term26285.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term26285, term26285.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term26285, term26285.getClass(), "ignoreSurroundingSpaces", false);
        setField(term26285, term26285.getClass(), "nullString", "mNgDshwZNc");
        setField(term26285, term26285.getClass(), "quoteCharacter", term26417);
        setField(term26285, term26285.getClass(), "quoteMode", enum205);
        setField(term26285, term26285.getClass(), "recordSeparator", "pDqgDbJoFw");
        setBooleanField(term26285, term26285.getClass(), "skipHeaderRecord", true);
        setBooleanField(term26285, term26285.getClass(), "trailingDelimiter", true);
        setBooleanField(term26285, term26285.getClass(), "trim", false);
        term26441 = new Character('I');
        Character term101087 = new Character('B');
        Character term101088 = new Character('q');
        Character term101111 = new Character('F');
        Class<? extends Object> term101504 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term101503 = ((Class) term101504).getDeclaredField((String) "ALL");
        ((Field) term101503).setAccessible(true);
        Object enum206 = ((Field) term101503).get((Object) null);
        term101086 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term101089 = (Object[]) newArray("java.lang.String", 4);
        Object[] term101098 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term101086, term101086.getClass(), "allowMissingColumnNames", true);
        setField(term101086, term101086.getClass(), "commentMarker", term101087);
        setCharField(term101086, term101086.getClass(), "delimiter", 'Y');
        setField(term101086, term101086.getClass(), "escapeCharacter", term101088);
        setElement(term101089, 0, "wgRGBNrTGP");
        setElement(term101089, 1, "FIdNVptZpW");
        setElement(term101089, 2, "rQjxAhisjm");
        setElement(term101089, 3, "ZDhASPHjDG");
        setField(term101086, term101086.getClass(), "header", term101089);
        setElement(term101098, 0, "HNVOAXYNEZ");
        setElement(term101098, 1, "gbbYBYyfvr");
        setElement(term101098, 2, "SrWMUlbtWV");
        setElement(term101098, 3, "VePIumgrrU");
        setElement(term101098, 4, "DPwIqlszZo");
        setField(term101086, term101086.getClass(), "headerComments", term101098);
        setBooleanField(term101086, term101086.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term101086, term101086.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term101086, term101086.getClass(), "ignoreSurroundingSpaces", false);
        setField(term101086, term101086.getClass(), "nullString", "mNgDshwZNc");
        setField(term101086, term101086.getClass(), "quoteCharacter", term101111);
        setField(term101086, term101086.getClass(), "quoteMode", enum206);
        setField(term101086, term101086.getClass(), "recordSeparator", "pDqgDbJoFw");
        setBooleanField(term101086, term101086.getClass(), "skipHeaderRecord", true);
        setBooleanField(term101086, term101086.getClass(), "trailingDelimiter", true);
        setBooleanField(term101086, term101086.getClass(), "trim", false);
        Character term100938 = new Character('B');
        Character term100941 = new Character('q');
        Character term101068 = new Character('I');
        Class<? extends Object> term101790 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term101789 = ((Class) term101790).getDeclaredField((String) "ALL");
        ((Field) term101789).setAccessible(true);
        Object enum207 = ((Field) term101789).get((Object) null);
        term100936 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term100943 = (Object[]) newArray("java.lang.String", 4);
        Object[] term100992 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term100936, term100936.getClass(), "allowMissingColumnNames", true);
        setField(term100936, term100936.getClass(), "commentMarker", term100938);
        setCharField(term100936, term100936.getClass(), "delimiter", 'Y');
        setField(term100936, term100936.getClass(), "escapeCharacter", term100941);
        setElement(term100943, 0, "wgRGBNrTGP");
        setElement(term100943, 1, "FIdNVptZpW");
        setElement(term100943, 2, "rQjxAhisjm");
        setElement(term100943, 3, "ZDhASPHjDG");
        setField(term100936, term100936.getClass(), "header", term100943);
        setElement(term100992, 0, "HNVOAXYNEZ");
        setElement(term100992, 1, "gbbYBYyfvr");
        setElement(term100992, 2, "SrWMUlbtWV");
        setElement(term100992, 3, "VePIumgrrU");
        setElement(term100992, 4, "DPwIqlszZo");
        setField(term100936, term100936.getClass(), "headerComments", term100992);
        setBooleanField(term100936, term100936.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term100936, term100936.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term100936, term100936.getClass(), "ignoreSurroundingSpaces", false);
        setField(term100936, term100936.getClass(), "nullString", "mNgDshwZNc");
        setField(term100936, term100936.getClass(), "quoteCharacter", term101068);
        setField(term100936, term100936.getClass(), "quoteMode", enum207);
        setField(term100936, term100936.getClass(), "recordSeparator", "pDqgDbJoFw");
        setBooleanField(term100936, term100936.getClass(), "skipHeaderRecord", true);
        setBooleanField(term100936, term100936.getClass(), "trailingDelimiter", true);
        setBooleanField(term100936, term100936.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term26441;
        Object retValue = callMethod(klass, "withQuote", argTypes, term26285, args);
        assertTrue(recursiveEquals(term26285, term101086));
        assertTrue(recursiveEquals(term26441, 'I'));
        assertTrue(recursiveEquals(retValue, term100936));
    }

};


