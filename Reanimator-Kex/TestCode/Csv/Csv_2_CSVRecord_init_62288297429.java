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

public class CSVRecord_init_62288297429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5028;

    public CSVRecord_init_62288297429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4861 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setLongField(term4861, term4861.getClass(), "recordNumber", 0L);
        term5028 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5029 = (Object[]) newArray("java.lang.String", 0);
        setField(term5028, term5028.getClass(), "values", term5029);
        setField(term5028, term5028.getClass(), "mapping", null);
        setField(term5028, term5028.getClass(), "comment", null);
        setLongField(term5028, term5028.getClass(), "recordNumber", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = 0L;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5028));
    }

};


