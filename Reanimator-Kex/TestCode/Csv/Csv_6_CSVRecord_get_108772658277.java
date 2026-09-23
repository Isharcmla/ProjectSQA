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

public class CSVRecord_get_108772658277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19066;
     Object enum17;

    public CSVRecord_get_108772658277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19114 = new HashMap();
        term19066 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term19066, term19066.getClass(), "mapping", term19114);
        Class<? extends Object> term19827 = Class.forName((String) "java.lang.module.ModuleDescriptor$Requires$Modifier");
        Field term19826 = ((Class) term19827).getDeclaredField((String) "TRANSITIVE");
        ((Field) term19826).setAccessible(true);
        enum17 = ((Field) term19826).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum17;
        try {
            callMethod(klass, "get", argTypes, term19066, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


