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

public class CSVRecord_get_108772658288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22137;
     Object enum20;

    public CSVRecord_get_108772658288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22185 = new HashMap();
        term22137 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term22137, term22137.getClass(), "mapping", term22185);
        Class<? extends Object> term22828 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Field term22827 = ((Class) term22828).getDeclaredField((String) "CONCURRENT");
        ((Field) term22827).setAccessible(true);
        enum20 = ((Field) term22827).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum20;
        try {
            callMethod(klass, "get", argTypes, term22137, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


