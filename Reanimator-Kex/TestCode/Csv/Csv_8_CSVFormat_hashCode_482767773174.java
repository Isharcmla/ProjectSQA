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

public class CSVFormat_hashCode_482767773174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77660;
     Object term77939;

    public CSVFormat_hashCode_482767773174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77944 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term77943 = ((Class) term77944).getDeclaredField((String) "ALL");
        ((Field) term77943).setAccessible(true);
        Object enum160 = ((Field) term77943).get((Object) null);
        term77660 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term77660, term77660.getClass(), "delimiter", (char) 0);
        setField(term77660, term77660.getClass(), "quotePolicy", enum160);
        setField(term77660, term77660.getClass(), "quoteChar", null);
        Class<? extends Object> term78100 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term78099 = ((Class) term78100).getDeclaredField((String) "ALL");
        ((Field) term78099).setAccessible(true);
        Object enum161 = ((Field) term78099).get((Object) null);
        term77939 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term77939, term77939.getClass(), "delimiter", (char) 0);
        setField(term77939, term77939.getClass(), "quoteChar", null);
        setField(term77939, term77939.getClass(), "quotePolicy", enum161);
        setField(term77939, term77939.getClass(), "commentStart", null);
        setField(term77939, term77939.getClass(), "escape", null);
        setBooleanField(term77939, term77939.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term77939, term77939.getClass(), "ignoreEmptyLines", false);
        setField(term77939, term77939.getClass(), "recordSeparator", null);
        setField(term77939, term77939.getClass(), "nullString", null);
        setField(term77939, term77939.getClass(), "header", null);
        setBooleanField(term77939, term77939.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term77660, args);
        assertTrue(recursiveEquals(term77660, term77939));
        assertTrue(recursiveEquals(retValue, 890679849));
    }

};


