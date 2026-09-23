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
import java.lang.Object;
import java.lang.String;

public class CSVRecord_get_108772658290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23245;
     Object enum22;

    public CSVRecord_get_108772658290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term23115 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term23293 = new HashMap();
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)null, (Object)null);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)null, (Object)null);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        ((HashMap) term23293).put((Object)term23115, (Object)term23115);
        term23245 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term23245, term23245.getClass(), "mapping", term23293);
        Class<? extends Object> term24005 = Class.forName((String) "java.io.File$PathStatus");
        Field term24004 = ((Class) term24005).getDeclaredField((String) "INVALID");
        ((Field) term24004).setAccessible(true);
        enum22 = ((Field) term24004).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum22;
        try {
            callMethod(klass, "get", argTypes, term23245, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


