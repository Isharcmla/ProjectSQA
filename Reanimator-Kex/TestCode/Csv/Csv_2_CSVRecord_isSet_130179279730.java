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

public class CSVRecord_isSet_130179279730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4938;
     Object term5036;

    public CSVRecord_isSet_130179279730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4938 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term4938, term4938.getClass(), "mapping", null);
        term5036 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term5036, term5036.getClass(), "values", null);
        setField(term5036, term5036.getClass(), "mapping", null);
        setField(term5036, term5036.getClass(), "comment", null);
        setLongField(term5036, term5036.getClass(), "recordNumber", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isSet", argTypes, term4938, args);
        assertTrue(recursiveEquals(term4938, term5036));
        assertTrue(recursiveEquals(retValue, false));
    }

};


