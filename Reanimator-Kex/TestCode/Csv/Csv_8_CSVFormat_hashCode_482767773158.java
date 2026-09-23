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

public class CSVFormat_hashCode_482767773158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74509;
     Object term74846;

    public CSVFormat_hashCode_482767773158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74852 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term74851 = ((Class) term74852).getDeclaredField((String) "NONE");
        ((Field) term74851).setAccessible(true);
        Object enum157 = ((Field) term74851).get((Object) null);
        Character term74661 = new Character((char) 0);
        term74509 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term74509, term74509.getClass(), "delimiter", (char) 0);
        setField(term74509, term74509.getClass(), "quotePolicy", enum157);
        setField(term74509, term74509.getClass(), "quoteChar", term74661);
        setField(term74509, term74509.getClass(), "commentStart", null);
        Character term74847 = new Character((char) 0);
        Class<? extends Object> term75011 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term75010 = ((Class) term75011).getDeclaredField((String) "NONE");
        ((Field) term75010).setAccessible(true);
        Object enum158 = ((Field) term75010).get((Object) null);
        term74846 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term74846, term74846.getClass(), "delimiter", (char) 0);
        setField(term74846, term74846.getClass(), "quoteChar", term74847);
        setField(term74846, term74846.getClass(), "quotePolicy", enum158);
        setField(term74846, term74846.getClass(), "commentStart", null);
        setField(term74846, term74846.getClass(), "escape", null);
        setBooleanField(term74846, term74846.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term74846, term74846.getClass(), "ignoreEmptyLines", false);
        setField(term74846, term74846.getClass(), "recordSeparator", null);
        setField(term74846, term74846.getClass(), "nullString", null);
        setField(term74846, term74846.getClass(), "header", null);
        setBooleanField(term74846, term74846.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term74509, args);
        assertTrue(recursiveEquals(term74509, term74846));
        assertTrue(recursiveEquals(retValue, 1843673854));
    }

};


