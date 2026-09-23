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

public class CSVFormat_getEscape_40509755648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1634;
     Object term18174;
     Object term17844;

    public CSVFormat_getEscape_40509755648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1636 = new Character('g');
        Class<? extends Object> term18191 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term18190 = ((Class) term18191).getDeclaredField((String) "NONE");
        ((Field) term18190).setAccessible(true);
        Object enum49 = ((Field) term18190).get((Object) null);
        Character term1646 = new Character('Q');
        Character term1648 = new Character('H');
        term1634 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1676 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term1634, term1634.getClass(), "delimiter", 'c');
        setField(term1634, term1634.getClass(), "quoteChar", term1636);
        setField(term1634, term1634.getClass(), "quotePolicy", enum49);
        setField(term1634, term1634.getClass(), "commentStart", term1646);
        setField(term1634, term1634.getClass(), "escape", term1648);
        setBooleanField(term1634, term1634.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1634, term1634.getClass(), "ignoreEmptyLines", true);
        setField(term1634, term1634.getClass(), "recordSeparator", "TEParAifyi");
        setField(term1634, term1634.getClass(), "nullString", "OWDIEULEFu");
        setElement(term1676, 0, "dWRymuLBtr");
        setElement(term1676, 1, "AijpHYOFuy");
        setField(term1634, term1634.getClass(), "header", term1676);
        setBooleanField(term1634, term1634.getClass(), "skipHeaderRecord", true);
        Character term18175 = new Character('g');
        Class<? extends Object> term18390 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term18389 = ((Class) term18390).getDeclaredField((String) "NONE");
        ((Field) term18389).setAccessible(true);
        Object enum50 = ((Field) term18389).get((Object) null);
        Character term18179 = new Character('Q');
        Character term18180 = new Character('H');
        term18174 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18185 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term18174, term18174.getClass(), "delimiter", 'c');
        setField(term18174, term18174.getClass(), "quoteChar", term18175);
        setField(term18174, term18174.getClass(), "quotePolicy", enum50);
        setField(term18174, term18174.getClass(), "commentStart", term18179);
        setField(term18174, term18174.getClass(), "escape", term18180);
        setBooleanField(term18174, term18174.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term18174, term18174.getClass(), "ignoreEmptyLines", true);
        setField(term18174, term18174.getClass(), "recordSeparator", "TEParAifyi");
        setField(term18174, term18174.getClass(), "nullString", "OWDIEULEFu");
        setElement(term18185, 0, "dWRymuLBtr");
        setElement(term18185, 1, "AijpHYOFuy");
        setField(term18174, term18174.getClass(), "header", term18185);
        setBooleanField(term18174, term18174.getClass(), "skipHeaderRecord", true);
        term17844 = new Character('H');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEscape", argTypes, term1634, args);
        assertTrue(recursiveEquals(term1634, term18174));
        assertTrue(recursiveEquals(retValue, term17844));
    }

};


