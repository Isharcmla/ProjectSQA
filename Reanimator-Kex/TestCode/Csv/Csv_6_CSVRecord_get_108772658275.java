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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CSVRecord_get_108772658275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18262;
     Object enum15;

    public CSVRecord_get_108772658275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18310 = new HashMap();
        term18262 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term18262, term18262.getClass(), "mapping", term18310);
        Class<? extends Object> term18822 = Class.forName((String) "java.util.Locale$Category");
        Field term18821 = ((Class) term18822).getDeclaredField((String) "DISPLAY");
        ((Field) term18821).setAccessible(true);
        enum15 = ((Field) term18821).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum15;
        try {
            callMethod(klass, "get", argTypes, term18262, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


