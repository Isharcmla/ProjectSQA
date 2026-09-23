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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BuilderBasedDeserializer_init_146553405674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13253;

    public BuilderBasedDeserializer_init_146553405674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13123 = Class.forName((String) "java.lang.invoke.VarHandleChars$FieldInstanceReadOnly");
        Object term13087 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term13087, term13087.getClass(), "_valueClass", term13123);
        term13253 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term13371 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term13253, term13253.getClass(), "_type", null);
        setField(term13253, term13253.getClass(), "_classInfo", term13371);
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
        args[1] = term13253;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = false;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


