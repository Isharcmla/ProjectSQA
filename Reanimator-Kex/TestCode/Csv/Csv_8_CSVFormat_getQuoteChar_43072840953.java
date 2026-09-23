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

public class CSVFormat_getQuoteChar_43072840953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3329;
     Object term21028;
     Object term20719;

    public CSVFormat_getQuoteChar_43072840953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3331 = new Character('p');
        Class<? extends Object> term21051 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term21050 = ((Class) term21051).getDeclaredField((String) "MINIMAL");
        ((Field) term21050).setAccessible(true);
        Object enum58 = ((Field) term21050).get((Object) null);
        Character term3344 = new Character('V');
        Character term3346 = new Character('m');
        term3329 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3374 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term3329, term3329.getClass(), "delimiter", 'Z');
        setField(term3329, term3329.getClass(), "quoteChar", term3331);
        setField(term3329, term3329.getClass(), "quotePolicy", enum58);
        setField(term3329, term3329.getClass(), "commentStart", term3344);
        setField(term3329, term3329.getClass(), "escape", term3346);
        setBooleanField(term3329, term3329.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3329, term3329.getClass(), "ignoreEmptyLines", true);
        setField(term3329, term3329.getClass(), "recordSeparator", "dEnhdmILtU");
        setField(term3329, term3329.getClass(), "nullString", "hoicvmsovO");
        setElement(term3374, 0, "eqJfYWRaEL");
        setElement(term3374, 1, "fhkbdRViHi");
        setElement(term3374, 2, "uWHnvSvaPl");
        setElement(term3374, 3, "kBdSllIBVz");
        setElement(term3374, 4, "TJmVBGfTML");
        setField(term3329, term3329.getClass(), "header", term3374);
        setBooleanField(term3329, term3329.getClass(), "skipHeaderRecord", true);
        Character term21029 = new Character('p');
        Class<? extends Object> term21297 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term21296 = ((Class) term21297).getDeclaredField((String) "MINIMAL");
        ((Field) term21296).setAccessible(true);
        Object enum59 = ((Field) term21296).get((Object) null);
        Character term21033 = new Character('V');
        Character term21034 = new Character('m');
        term21028 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21039 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term21028, term21028.getClass(), "delimiter", 'Z');
        setField(term21028, term21028.getClass(), "quoteChar", term21029);
        setField(term21028, term21028.getClass(), "quotePolicy", enum59);
        setField(term21028, term21028.getClass(), "commentStart", term21033);
        setField(term21028, term21028.getClass(), "escape", term21034);
        setBooleanField(term21028, term21028.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term21028, term21028.getClass(), "ignoreEmptyLines", true);
        setField(term21028, term21028.getClass(), "recordSeparator", "dEnhdmILtU");
        setField(term21028, term21028.getClass(), "nullString", "hoicvmsovO");
        setElement(term21039, 0, "eqJfYWRaEL");
        setElement(term21039, 1, "fhkbdRViHi");
        setElement(term21039, 2, "uWHnvSvaPl");
        setElement(term21039, 3, "kBdSllIBVz");
        setElement(term21039, 4, "TJmVBGfTML");
        setField(term21028, term21028.getClass(), "header", term21039);
        setBooleanField(term21028, term21028.getClass(), "skipHeaderRecord", true);
        term20719 = new Character('p');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteChar", argTypes, term3329, args);
        assertTrue(recursiveEquals(term3329, term21028));
        assertTrue(recursiveEquals(retValue, term20719));
    }

};


