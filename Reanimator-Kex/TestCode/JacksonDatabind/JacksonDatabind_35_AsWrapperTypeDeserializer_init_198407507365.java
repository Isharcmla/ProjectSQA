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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47637;
     Object term47943;
     Object term48017;

    public AsWrapperTypeDeserializer_init_198407507365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47545 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term47545, term47545.getClass(), "_baseType", null);
        setField(term47545, term47545.getClass(), "_idResolver", null);
        setField(term47545, term47545.getClass(), "_typePropertyName", null);
        setBooleanField(term47545, term47545.getClass(), "_typeIdVisible", false);
        setField(term47545, term47545.getClass(), "_deserializers", null);
        Class<? extends Object> term47673 = Class.forName((String) "java.util.PrimitiveIterator$OfDouble");
        term47637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term47771 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term47637, term47637.getClass(), "_class", term47673);
        setField(term47637, term47637.getClass(), "_keyType", term47771);
        setField(term47637, term47637.getClass(), "_valueType", null);
        setField(term47637, term47637.getClass(), "_valueHandler", null);
        setField(term47637, term47637.getClass(), "_typeHandler", "byte");
        setBooleanField(term47637, term47637.getClass(), "_asStatic", false);
        term47943 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        term48017 = Class.forName((String) "java.util.concurrent.ScheduledExecutorService");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term47637;
        args[1] = term47943;
        args[2] = "";
        args[3] = true;
        args[4] = term48017;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


