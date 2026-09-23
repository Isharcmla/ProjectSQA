package com.fasterxml.jackson.databind.deser.std;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207916;

    public StdValueInstantiator_init_1394365189224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term207812 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term207952 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class<? extends Object> term208118 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class<? extends Object> term208284 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term207916 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term208082 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term208248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term208414 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term207916, term207916.getClass(), "_class", term207952);
        setField(term208082, term208082.getClass(), "_canonicalName", null);
        setField(term208082, term208082.getClass(), "_class", term208118);
        setField(term208248, term208248.getClass(), "_canonicalName", null);
        setField(term208248, term208248.getClass(), "_class", term208284);
        setField(term208414, term208414.getClass(), "_canonicalName", "");
        setField(term208248, term208248.getClass(), "_keyType", term208414);
        setField(term208082, term208082.getClass(), "_keyType", term208248);
        setField(term207916, term207916.getClass(), "_referencedType", term208082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term207916;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


