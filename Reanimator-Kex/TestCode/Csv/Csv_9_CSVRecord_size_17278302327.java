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
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_size_17278302327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1720;
     Object term5256;

    public CSVRecord_size_17278302327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1733 = new HashMap();
        term1720 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1745 = (Object[]) newArray("java.lang.String", 2);
        setField(term1720, term1720.getClass(), "comment", "swZVeJAxjt");
        setField(term1720, term1720.getClass(), "mapping", term1733);
        setLongField(term1720, term1720.getClass(), "recordNumber", -8885298608300233488L);
        setElement(term1745, 0, "GVizqqzXpy");
        setElement(term1745, 1, "JqXGgAhZPl");
        setField(term1720, term1720.getClass(), "values", term1745);
        HashMap term5259 = new HashMap();
        term5256 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5260 = (Object[]) newArray("java.lang.String", 2);
        setField(term5256, term5256.getClass(), "comment", "swZVeJAxjt");
        setField(term5256, term5256.getClass(), "mapping", term5259);
        setLongField(term5256, term5256.getClass(), "recordNumber", -8885298608300233488L);
        setElement(term5260, 0, "GVizqqzXpy");
        setElement(term5260, 1, "JqXGgAhZPl");
        setField(term5256, term5256.getClass(), "values", term5260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term1720, args);
        assertTrue(recursiveEquals(term1720, term5256));
        assertTrue(recursiveEquals(retValue, 2));
    }

};


