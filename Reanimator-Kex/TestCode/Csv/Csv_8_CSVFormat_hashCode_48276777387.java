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
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_hashCode_48276777387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44953;
     Object term45408;

    public CSVFormat_hashCode_48276777387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45418 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term45417 = ((Class) term45418).getDeclaredField((String) "NONE");
        ((Field) term45417).setAccessible(true);
        Object enum131 = ((Field) term45417).get((Object) null);
        Character term45105 = new Character((char) 0);
        Character term45157 = new Character((char) 0);
        Character term45209 = new Character((char) 0);
        term44953 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term44953, term44953.getClass(), "delimiter", (char) 0);
        setField(term44953, term44953.getClass(), "quotePolicy", enum131);
        setField(term44953, term44953.getClass(), "quoteChar", term45105);
        setField(term44953, term44953.getClass(), "commentStart", term45157);
        setField(term44953, term44953.getClass(), "escape", term45209);
        setField(term44953, term44953.getClass(), "nullString", "NONE");
        setBooleanField(term44953, term44953.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term44953, term44953.getClass(), "ignoreEmptyLines", false);
        Character term45409 = new Character((char) 0);
        Class<? extends Object> term45581 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term45580 = ((Class) term45581).getDeclaredField((String) "NONE");
        ((Field) term45580).setAccessible(true);
        Object enum132 = ((Field) term45580).get((Object) null);
        Character term45413 = new Character((char) 0);
        Character term45414 = new Character((char) 0);
        term45408 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term45408, term45408.getClass(), "delimiter", (char) 0);
        setField(term45408, term45408.getClass(), "quoteChar", term45409);
        setField(term45408, term45408.getClass(), "quotePolicy", enum132);
        setField(term45408, term45408.getClass(), "commentStart", term45413);
        setField(term45408, term45408.getClass(), "escape", term45414);
        setBooleanField(term45408, term45408.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term45408, term45408.getClass(), "ignoreEmptyLines", false);
        setField(term45408, term45408.getClass(), "recordSeparator", null);
        setField(term45408, term45408.getClass(), "nullString", "NONE");
        setField(term45408, term45408.getClass(), "header", null);
        setBooleanField(term45408, term45408.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term44953, args);
        assertTrue(recursiveEquals(term44953, term45408));
        assertTrue(recursiveEquals(retValue, 1019922880));
    }

};


