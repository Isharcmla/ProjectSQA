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

public class CSVFormat_getSkipHeaderRecord_128768154156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4286;
     Object term23201;

    public CSVFormat_getSkipHeaderRecord_128768154156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4288 = new Character('b');
        Class<? extends Object> term23220 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term23219 = ((Class) term23220).getDeclaredField((String) "NONE");
        ((Field) term23219).setAccessible(true);
        Object enum66 = ((Field) term23219).get((Object) null);
        Character term4298 = new Character('S');
        Character term4300 = new Character('S');
        term4286 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4328 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term4286, term4286.getClass(), "delimiter", 'R');
        setField(term4286, term4286.getClass(), "quoteChar", term4288);
        setField(term4286, term4286.getClass(), "quotePolicy", enum66);
        setField(term4286, term4286.getClass(), "commentStart", term4298);
        setField(term4286, term4286.getClass(), "escape", term4300);
        setBooleanField(term4286, term4286.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4286, term4286.getClass(), "ignoreEmptyLines", false);
        setField(term4286, term4286.getClass(), "recordSeparator", "wGmYcqUkgE");
        setField(term4286, term4286.getClass(), "nullString", "idgaQsnJpQ");
        setElement(term4328, 0, "VgZnGoIFwQ");
        setElement(term4328, 1, "jUbSRrkrYZ");
        setElement(term4328, 2, "bWWfajKbEX");
        setField(term4286, term4286.getClass(), "header", term4328);
        setBooleanField(term4286, term4286.getClass(), "skipHeaderRecord", false);
        Character term23202 = new Character('b');
        Class<? extends Object> term23429 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term23428 = ((Class) term23429).getDeclaredField((String) "NONE");
        ((Field) term23428).setAccessible(true);
        Object enum67 = ((Field) term23428).get((Object) null);
        Character term23206 = new Character('S');
        Character term23207 = new Character('S');
        term23201 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23212 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term23201, term23201.getClass(), "delimiter", 'R');
        setField(term23201, term23201.getClass(), "quoteChar", term23202);
        setField(term23201, term23201.getClass(), "quotePolicy", enum67);
        setField(term23201, term23201.getClass(), "commentStart", term23206);
        setField(term23201, term23201.getClass(), "escape", term23207);
        setBooleanField(term23201, term23201.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term23201, term23201.getClass(), "ignoreEmptyLines", false);
        setField(term23201, term23201.getClass(), "recordSeparator", "wGmYcqUkgE");
        setField(term23201, term23201.getClass(), "nullString", "idgaQsnJpQ");
        setElement(term23212, 0, "VgZnGoIFwQ");
        setElement(term23212, 1, "jUbSRrkrYZ");
        setElement(term23212, 2, "bWWfajKbEX");
        setField(term23201, term23201.getClass(), "header", term23212);
        setBooleanField(term23201, term23201.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipHeaderRecord", argTypes, term4286, args);
        assertTrue(recursiveEquals(term4286, term23201));
    }

};


