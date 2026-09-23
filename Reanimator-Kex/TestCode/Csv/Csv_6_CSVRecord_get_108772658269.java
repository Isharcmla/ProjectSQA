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
import java.lang.String;
import java.lang.Object;

public class CSVRecord_get_108772658269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15210;
     Object enum11;

    public CSVRecord_get_108772658269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15210 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Class<? extends Object> term16541 = Class.forName((String) "java.util.stream.Collector$Characteristics");
        Field term16540 = ((Class) term16541).getDeclaredField((String) "CONCURRENT");
        ((Field) term16540).setAccessible(true);
        enum11 = ((Field) term16540).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum11;
        try {
            callMethod(klass, "get", argTypes, term15210, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


