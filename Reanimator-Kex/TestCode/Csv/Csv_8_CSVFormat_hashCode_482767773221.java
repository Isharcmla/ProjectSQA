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

public class CSVFormat_hashCode_482767773221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112109;
     Object term112448;

    public CSVFormat_hashCode_482767773221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112455 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term112454 = ((Class) term112455).getDeclaredField((String) "NONE");
        ((Field) term112454).setAccessible(true);
        Object enum188 = ((Field) term112454).get((Object) null);
        Character term112261 = new Character((char) 0);
        term112109 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term112109, term112109.getClass(), "delimiter", (char) 0);
        setField(term112109, term112109.getClass(), "quotePolicy", enum188);
        setField(term112109, term112109.getClass(), "quoteChar", term112261);
        setField(term112109, term112109.getClass(), "commentStart", term112261);
        setField(term112109, term112109.getClass(), "escape", null);
        Character term112449 = new Character((char) 0);
        Class<? extends Object> term112614 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term112613 = ((Class) term112614).getDeclaredField((String) "NONE");
        ((Field) term112613).setAccessible(true);
        Object enum189 = ((Field) term112613).get((Object) null);
        Character term112453 = new Character((char) 0);
        term112448 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term112448, term112448.getClass(), "delimiter", (char) 0);
        setField(term112448, term112448.getClass(), "quoteChar", term112449);
        setField(term112448, term112448.getClass(), "quotePolicy", enum189);
        setField(term112448, term112448.getClass(), "commentStart", term112453);
        setField(term112448, term112448.getClass(), "escape", null);
        setBooleanField(term112448, term112448.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term112448, term112448.getClass(), "ignoreEmptyLines", false);
        setField(term112448, term112448.getClass(), "recordSeparator", null);
        setField(term112448, term112448.getClass(), "nullString", null);
        setField(term112448, term112448.getClass(), "header", null);
        setBooleanField(term112448, term112448.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term112109, args);
        assertTrue(recursiveEquals(term112109, term112448));
        assertTrue(recursiveEquals(retValue, 1843673854));
    }

};


