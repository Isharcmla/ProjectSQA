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

public class CSVFormat_hashCode_482767773279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150258;
     Object term151039;

    public CSVFormat_hashCode_482767773279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term151045 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term151044 = ((Class) term151045).getDeclaredField((String) "MINIMAL");
        ((Field) term151044).setAccessible(true);
        Object enum274 = ((Field) term151044).get((Object) null);
        Character term150410 = new Character((char) 0);
        term150258 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term150258, term150258.getClass(), "delimiter", (char) 0);
        setField(term150258, term150258.getClass(), "quotePolicy", enum274);
        setField(term150258, term150258.getClass(), "quoteChar", term150410);
        setField(term150258, term150258.getClass(), "commentStart", null);
        setField(term150258, term150258.getClass(), "escape", null);
        setField(term150258, term150258.getClass(), "nullString", null);
        setBooleanField(term150258, term150258.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term150258, term150258.getClass(), "ignoreEmptyLines", true);
        Character term151040 = new Character((char) 0);
        Class<? extends Object> term151213 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term151212 = ((Class) term151213).getDeclaredField((String) "MINIMAL");
        ((Field) term151212).setAccessible(true);
        Object enum275 = ((Field) term151212).get((Object) null);
        term151039 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term151039, term151039.getClass(), "delimiter", (char) 0);
        setField(term151039, term151039.getClass(), "quoteChar", term151040);
        setField(term151039, term151039.getClass(), "quotePolicy", enum275);
        setField(term151039, term151039.getClass(), "commentStart", null);
        setField(term151039, term151039.getClass(), "escape", null);
        setBooleanField(term151039, term151039.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term151039, term151039.getClass(), "ignoreEmptyLines", true);
        setField(term151039, term151039.getClass(), "recordSeparator", null);
        setField(term151039, term151039.getClass(), "nullString", null);
        setField(term151039, term151039.getClass(), "header", null);
        setBooleanField(term151039, term151039.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term150258, args);
        assertTrue(recursiveEquals(term150258, term151039));
        assertTrue(recursiveEquals(retValue, 1068484855));
    }

};


