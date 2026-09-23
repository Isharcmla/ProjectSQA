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

public class CSVFormat_hashCode_482767773271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145900;
     Object term146979;

    public CSVFormat_hashCode_482767773271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146989 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term146988 = ((Class) term146989).getDeclaredField((String) "MINIMAL");
        ((Field) term146988).setAccessible(true);
        Object enum262 = ((Field) term146988).get((Object) null);
        Character term146052 = new Character((char) 0);
        Character term146104 = new Character((char) 0);
        Character term146156 = new Character((char) 0);
        term145900 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term145900, term145900.getClass(), "delimiter", (char) 0);
        setField(term145900, term145900.getClass(), "quotePolicy", enum262);
        setField(term145900, term145900.getClass(), "quoteChar", term146052);
        setField(term145900, term145900.getClass(), "commentStart", term146104);
        setField(term145900, term145900.getClass(), "escape", term146156);
        setField(term145900, term145900.getClass(), "nullString", "NONE");
        setBooleanField(term145900, term145900.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term145900, term145900.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term145900, term145900.getClass(), "skipHeaderRecord", true);
        Character term146980 = new Character((char) 0);
        Class<? extends Object> term147161 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term147160 = ((Class) term147161).getDeclaredField((String) "MINIMAL");
        ((Field) term147160).setAccessible(true);
        Object enum263 = ((Field) term147160).get((Object) null);
        Character term146984 = new Character((char) 0);
        Character term146985 = new Character((char) 0);
        term146979 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term146979, term146979.getClass(), "delimiter", (char) 0);
        setField(term146979, term146979.getClass(), "quoteChar", term146980);
        setField(term146979, term146979.getClass(), "quotePolicy", enum263);
        setField(term146979, term146979.getClass(), "commentStart", term146984);
        setField(term146979, term146979.getClass(), "escape", term146985);
        setBooleanField(term146979, term146979.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term146979, term146979.getClass(), "ignoreEmptyLines", false);
        setField(term146979, term146979.getClass(), "recordSeparator", null);
        setField(term146979, term146979.getClass(), "nullString", "NONE");
        setField(term146979, term146979.getClass(), "header", null);
        setBooleanField(term146979, term146979.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term145900, args);
        assertTrue(recursiveEquals(term145900, term146979));
        assertTrue(recursiveEquals(retValue, 255989113));
    }

};


