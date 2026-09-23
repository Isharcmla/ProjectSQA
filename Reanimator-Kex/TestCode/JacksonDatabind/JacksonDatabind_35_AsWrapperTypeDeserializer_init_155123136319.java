package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;

public class AsWrapperTypeDeserializer_init_155123136319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2438;
     Object term2443;
     Object term2444;

    public AsWrapperTypeDeserializer_init_155123136319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2438 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term2443 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term2443, term2443.getClass(), "_idResolver", null);
        setField(term2443, term2443.getClass(), "_baseType", null);
        setField(term2443, term2443.getClass(), "_property", null);
        setField(term2443, term2443.getClass(), "_defaultImpl", null);
        setField(term2443, term2443.getClass(), "_typePropertyName", null);
        setBooleanField(term2443, term2443.getClass(), "_typeIdVisible", false);
        setField(term2443, term2443.getClass(), "_deserializers", null);
        setField(term2443, term2443.getClass(), "_defaultImplDeserializer", null);
        term2444 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term2444, term2444.getClass(), "_idResolver", null);
        setField(term2444, term2444.getClass(), "_baseType", null);
        setField(term2444, term2444.getClass(), "_property", null);
        setField(term2444, term2444.getClass(), "_defaultImpl", null);
        setField(term2444, term2444.getClass(), "_typePropertyName", null);
        setBooleanField(term2444, term2444.getClass(), "_typeIdVisible", false);
        setField(term2444, term2444.getClass(), "_deserializers", null);
        setField(term2444, term2444.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Object[] args = new Object[2];
        args[0] = term2438;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2443));
        assertTrue(recursiveEquals(term2438, term2444));
    }

};


