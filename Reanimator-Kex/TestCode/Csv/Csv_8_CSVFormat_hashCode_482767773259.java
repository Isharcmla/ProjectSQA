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

public class CSVFormat_hashCode_482767773259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137837;
     Object term138358;

    public CSVFormat_hashCode_482767773259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term138368 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term138367 = ((Class) term138368).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term138367).setAccessible(true);
        Object enum238 = ((Field) term138367).get((Object) null);
        Character term137989 = new Character((char) 0);
        Character term138041 = new Character((char) 0);
        Character term138093 = new Character((char) 0);
        term137837 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term137837, term137837.getClass(), "delimiter", (char) 0);
        setField(term137837, term137837.getClass(), "quotePolicy", enum238);
        setField(term137837, term137837.getClass(), "quoteChar", term137989);
        setField(term137837, term137837.getClass(), "commentStart", term138041);
        setField(term137837, term137837.getClass(), "escape", term138093);
        setField(term137837, term137837.getClass(), "nullString", "NONE");
        setBooleanField(term137837, term137837.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term137837, term137837.getClass(), "ignoreEmptyLines", true);
        Character term138359 = new Character((char) 0);
        Class<? extends Object> term138552 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term138551 = ((Class) term138552).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term138551).setAccessible(true);
        Object enum239 = ((Field) term138551).get((Object) null);
        Character term138363 = new Character((char) 0);
        Character term138364 = new Character((char) 0);
        term138358 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term138358, term138358.getClass(), "delimiter", (char) 0);
        setField(term138358, term138358.getClass(), "quoteChar", term138359);
        setField(term138358, term138358.getClass(), "quotePolicy", enum239);
        setField(term138358, term138358.getClass(), "commentStart", term138363);
        setField(term138358, term138358.getClass(), "escape", term138364);
        setBooleanField(term138358, term138358.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term138358, term138358.getClass(), "ignoreEmptyLines", true);
        setField(term138358, term138358.getClass(), "recordSeparator", null);
        setField(term138358, term138358.getClass(), "nullString", "NONE");
        setField(term138358, term138358.getClass(), "header", null);
        setBooleanField(term138358, term138358.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term137837, args);
        assertTrue(recursiveEquals(term137837, term138358));
        assertTrue(recursiveEquals(retValue, 337041701));
    }

};


