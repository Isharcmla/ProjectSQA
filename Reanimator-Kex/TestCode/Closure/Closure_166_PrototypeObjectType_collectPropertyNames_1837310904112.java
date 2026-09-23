package com.google.javascript.rhino.jstype;

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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_collectPropertyNames_1837310904112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16299;

    public PrototypeObjectType_collectPropertyNames_1837310904112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16437 = newInstance(Class.forName("java.lang.Object"));
        Object term16475 = newInstance(Class.forName("java.lang.Object"));
        HashMap term16347 = new HashMap();
        ((HashMap) term16347).put(term16437, term16437);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        ((HashMap) term16347).put(term16475, term16475);
        term16299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term16299, term16299.getClass(), "properties", term16347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "collectPropertyNames", argTypes, term16299, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


