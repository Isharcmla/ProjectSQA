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

public class CSVRecord_get_108772658287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22222;
     Object enum21;

    public CSVRecord_get_108772658287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term22092 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term22270 = new HashMap();
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)null, (Object)null);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)null, (Object)null);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        ((HashMap) term22270).put((Object)term22092, (Object)term22092);
        term22222 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term22222, term22222.getClass(), "mapping", term22270);
        Class<? extends Object> term22982 = Class.forName((String) "java.io.File$PathStatus");
        Field term22981 = ((Class) term22982).getDeclaredField((String) "INVALID");
        ((Field) term22981).setAccessible(true);
        enum21 = ((Field) term22981).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum21;
        try {
            callMethod(klass, "get", argTypes, term22222, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


