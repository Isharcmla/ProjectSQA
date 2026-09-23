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

public class CSVRecord_get_108772658289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23267;
     Object enum23;

    public CSVRecord_get_108772658289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term23137 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term23315 = new HashMap();
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)null, (Object)null);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)null, (Object)null);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        ((HashMap) term23315).put((Object)term23137, (Object)term23137);
        term23267 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term23267, term23267.getClass(), "mapping", term23315);
        Class<? extends Object> term24041 = Class.forName((String) "java.util.Locale$Category");
        Field term24040 = ((Class) term24041).getDeclaredField((String) "DISPLAY");
        ((Field) term24040).setAccessible(true);
        enum23 = ((Field) term24040).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum23;
        try {
            callMethod(klass, "get", argTypes, term23267, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


