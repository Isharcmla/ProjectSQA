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

public class StdValueInstantiator_init_1394365189225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210989;

    public StdValueInstantiator_init_1394365189225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term210885 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term213422 = Class.forName((String) "java.util.stream.Sink$ChainedLong");
        Class term213413 = Array.newInstance(term213422, 0).getClass();
        Class term213398 = Array.newInstance(term213413, 0).getClass();
        Class term211025 = Array.newInstance(term213398, 0).getClass();
        Class<? extends Object> term211191 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term210989 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term211155 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term211321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term210989, term210989.getClass(), "_class", term211025);
        setField(term211155, term211155.getClass(), "_canonicalName", null);
        setField(term211155, term211155.getClass(), "_class", term211191);
        setField(term211321, term211321.getClass(), "_canonicalName", "");
        setField(term211155, term211155.getClass(), "_keyType", term211321);
        setField(term211155, term211155.getClass(), "_valueType", term211321);
        setField(term210989, term210989.getClass(), "_referencedType", term211155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term210989;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


