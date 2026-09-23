package com.fasterxml.jackson.databind.deser;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BuilderBasedDeserializer_init_1465534056159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60944;

    public BuilderBasedDeserializer_init_1465534056159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60814 = Class.forName((String) "com.fasterxml.jackson.databind.SerializationConfig");
        Object term60778 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term60778, term60778.getClass(), "_valueClass", term60814);
        Class<? extends Object> term61084 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceValuesToDoubleTask");
        term60944 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term61048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term61202 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term61048, term61048.getClass(), "_class", term61084);
        setField(term60944, term60944.getClass(), "_type", term61048);
        setField(term60944, term60944.getClass(), "_classInfo", term61202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.Set");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term60944;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = false;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


