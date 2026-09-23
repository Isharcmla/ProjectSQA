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
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61641;
     Object term62031;
     Object term62067;

    public AsWrapperTypeDeserializer_init_198407507377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term61449 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term61549 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term61449, term61449.getClass(), "_baseType", term61549);
        setField(term61449, term61449.getClass(), "_idResolver", null);
        setField(term61449, term61449.getClass(), "_typePropertyName", null);
        setBooleanField(term61449, term61449.getClass(), "_typeIdVisible", false);
        setField(term61449, term61449.getClass(), "_deserializers", null);
        term61641 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term61747 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term61861 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term61641, term61641.getClass(), "_class", null);
        setIntField(term61747, term61747.getClass(), "_hash", 0);
        setField(term61641, term61641.getClass(), "_keyType", term61747);
        setField(term61641, term61641.getClass(), "_valueType", term61861);
        setField(term61641, term61641.getClass(), "_valueHandler", "byte");
        setField(term61641, term61641.getClass(), "_typeHandler", null);
        setBooleanField(term61641, term61641.getClass(), "_asStatic", false);
        term62031 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        term62067 = Class.forName((String) "java.util.concurrent.Callable");
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
        args[0] = term61641;
        args[1] = term62031;
        args[2] = null;
        args[3] = true;
        args[4] = term62067;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


