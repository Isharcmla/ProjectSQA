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

public class CSVFormat_hashCode_482767773278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149816;
     Object term150601;

    public CSVFormat_hashCode_482767773278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150606 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term150605 = ((Class) term150606).getDeclaredField((String) "ALL");
        ((Field) term150605).setAccessible(true);
        Object enum272 = ((Field) term150605).get((Object) null);
        term149816 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term149816, term149816.getClass(), "delimiter", (char) 0);
        setField(term149816, term149816.getClass(), "quotePolicy", enum272);
        setField(term149816, term149816.getClass(), "quoteChar", null);
        setField(term149816, term149816.getClass(), "commentStart", null);
        setField(term149816, term149816.getClass(), "escape", null);
        setField(term149816, term149816.getClass(), "nullString", null);
        setBooleanField(term149816, term149816.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term149816, term149816.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term149816, term149816.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term150762 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term150761 = ((Class) term150762).getDeclaredField((String) "ALL");
        ((Field) term150761).setAccessible(true);
        Object enum273 = ((Field) term150761).get((Object) null);
        term150601 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term150601, term150601.getClass(), "delimiter", (char) 0);
        setField(term150601, term150601.getClass(), "quoteChar", null);
        setField(term150601, term150601.getClass(), "quotePolicy", enum273);
        setField(term150601, term150601.getClass(), "commentStart", null);
        setField(term150601, term150601.getClass(), "escape", null);
        setBooleanField(term150601, term150601.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term150601, term150601.getClass(), "ignoreEmptyLines", false);
        setField(term150601, term150601.getClass(), "recordSeparator", null);
        setField(term150601, term150601.getClass(), "nullString", null);
        setField(term150601, term150601.getClass(), "header", null);
        setBooleanField(term150601, term150601.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term149816, args);
        assertTrue(recursiveEquals(term149816, term150601));
        assertTrue(recursiveEquals(retValue, 890674083));
    }

};


