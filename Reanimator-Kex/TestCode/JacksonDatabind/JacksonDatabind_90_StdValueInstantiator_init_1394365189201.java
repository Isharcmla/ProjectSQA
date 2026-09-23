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

public class StdValueInstantiator_init_1394365189201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169878;

    public StdValueInstantiator_init_1394365189201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term169774 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term171038 = Class.forName((String) "java.util.stream.LongPipeline$6$1");
        Class term171029 = Array.newInstance(term171038, 0).getClass();
        Class term171014 = Array.newInstance(term171029, 0).getClass();
        Class term169914 = Array.newInstance(term171014, 0).getClass();
        Class<? extends Object> term170080 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term170246 = Class.forName((String) "java.lang.Class");
        term169878 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term170044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term170210 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term170338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term169878, term169878.getClass(), "_class", term169914);
        setField(term170044, term170044.getClass(), "_canonicalName", null);
        setField(term170044, term170044.getClass(), "_class", term170080);
        setField(term170210, term170210.getClass(), "_canonicalName", null);
        setField(term170210, term170210.getClass(), "_class", term170246);
        setField(term170210, term170210.getClass(), "_keyType", term170338);
        setField(term170044, term170044.getClass(), "_keyType", term170210);
        setField(term169878, term169878.getClass(), "_referencedType", term170044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term169878;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


