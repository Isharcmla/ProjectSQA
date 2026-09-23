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

public class CSVRecord_get_1087726582101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28553;
     Object enum29;

    public CSVRecord_get_1087726582101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28601 = new HashMap();
        term28553 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term28553, term28553.getClass(), "mapping", term28601);
        Class<? extends Object> term29236 = Class.forName((String) "java.nio.file.FileTreeWalker$EventType");
        Field term29235 = ((Class) term29236).getDeclaredField((String) "START_DIRECTORY");
        ((Field) term29235).setAccessible(true);
        enum29 = ((Field) term29235).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum29;
        try {
            callMethod(klass, "get", argTypes, term28553, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


