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

public class CSVRecord_get_1087726582103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29576;
     Object enum31;

    public CSVRecord_get_1087726582103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29624 = new HashMap();
        term29576 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term29576, term29576.getClass(), "mapping", term29624);
        Class<? extends Object> term30269 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Field term30268 = ((Class) term30269).getDeclaredField((String) "CONCURRENT");
        ((Field) term30268).setAccessible(true);
        enum31 = ((Field) term30268).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum31;
        try {
            callMethod(klass, "get", argTypes, term29576, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


