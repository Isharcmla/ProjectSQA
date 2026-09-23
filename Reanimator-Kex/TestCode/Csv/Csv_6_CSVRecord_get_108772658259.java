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

public class CSVRecord_get_108772658259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10833;
     Object enum3;

    public CSVRecord_get_108772658259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10881 = new HashMap();
        term10833 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term10833, term10833.getClass(), "mapping", term10881);
        Class<? extends Object> term11640 = Class.forName((String) "java.io.File$PathStatus");
        Field term11639 = ((Class) term11640).getDeclaredField((String) "INVALID");
        ((Field) term11639).setAccessible(true);
        enum3 = ((Field) term11639).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum3;
        try {
            callMethod(klass, "get", argTypes, term10833, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


