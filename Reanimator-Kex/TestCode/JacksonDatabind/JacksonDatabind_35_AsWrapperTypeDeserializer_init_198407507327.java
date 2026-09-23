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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8663;
     Object term8717;

    public AsWrapperTypeDeserializer_init_198407507327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8571 = new HashMap();
        Object term8337 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term8485 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term8337, term8337.getClass(), "_baseType", null);
        setField(term8337, term8337.getClass(), "_idResolver", term8485);
        setField(term8337, term8337.getClass(), "_typePropertyName", "byte");
        setBooleanField(term8337, term8337.getClass(), "_typeIdVisible", false);
        setField(term8337, term8337.getClass(), "_deserializers", term8571);
        term8717 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat");
        term8663 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term8663, term8663.getClass(), "_class", term8717);
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
        args[0] = term8663;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term8717;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


