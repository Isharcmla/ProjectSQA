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
import java.lang.Object;

public class CSVRecord_get_91017979743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8549;
     Object term8554;

    public CSVRecord_get_91017979743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8549 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term8468 = (Object[]) newArray("java.lang.String", 41);
        setField(term8549, term8549.getClass(), "values", term8468);
        term8554 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term8555 = (Object[]) newArray("java.lang.String", 41);
        setField(term8554, term8554.getClass(), "comment", null);
        setField(term8554, term8554.getClass(), "mapping", null);
        setLongField(term8554, term8554.getClass(), "recordNumber", 0L);
        setField(term8554, term8554.getClass(), "values", term8555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 40;
        Object retValue = callMethod(klass, "get", argTypes, term8549, args);
        assertTrue(recursiveEquals(term8549, term8554));
        assertTrue(recursiveEquals(retValue, null));
    }

};


