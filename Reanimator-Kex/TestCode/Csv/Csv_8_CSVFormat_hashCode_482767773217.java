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

public class CSVFormat_hashCode_482767773217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110733;
     Object term111080;

    public CSVFormat_hashCode_482767773217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111088 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term111087 = ((Class) term111088).getDeclaredField((String) "NONE");
        ((Field) term111087).setAccessible(true);
        Object enum185 = ((Field) term111087).get((Object) null);
        Character term110885 = new Character((char) 0);
        term110733 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term110733, term110733.getClass(), "delimiter", (char) 0);
        setField(term110733, term110733.getClass(), "quotePolicy", enum185);
        setField(term110733, term110733.getClass(), "quoteChar", term110885);
        setField(term110733, term110733.getClass(), "commentStart", null);
        setField(term110733, term110733.getClass(), "escape", null);
        setField(term110733, term110733.getClass(), "nullString", "NONE");
        Character term111081 = new Character((char) 0);
        Class<? extends Object> term111251 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term111250 = ((Class) term111251).getDeclaredField((String) "NONE");
        ((Field) term111250).setAccessible(true);
        Object enum186 = ((Field) term111250).get((Object) null);
        term111080 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term111080, term111080.getClass(), "delimiter", (char) 0);
        setField(term111080, term111080.getClass(), "quoteChar", term111081);
        setField(term111080, term111080.getClass(), "quotePolicy", enum186);
        setField(term111080, term111080.getClass(), "commentStart", null);
        setField(term111080, term111080.getClass(), "escape", null);
        setBooleanField(term111080, term111080.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term111080, term111080.getClass(), "ignoreEmptyLines", false);
        setField(term111080, term111080.getClass(), "recordSeparator", null);
        setField(term111080, term111080.getClass(), "nullString", "NONE");
        setField(term111080, term111080.getClass(), "header", null);
        setBooleanField(term111080, term111080.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term110733, args);
        assertTrue(recursiveEquals(term110733, term111080));
        assertTrue(recursiveEquals(retValue, 1025464006));
    }

};


