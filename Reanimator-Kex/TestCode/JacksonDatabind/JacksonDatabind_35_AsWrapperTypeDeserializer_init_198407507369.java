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

public class AsWrapperTypeDeserializer_init_198407507369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51709;
     Object term51843;

    public AsWrapperTypeDeserializer_init_198407507369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51511 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term51603 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term51511, term51511.getClass(), "_baseType", term51603);
        setField(term51511, term51511.getClass(), "_idResolver", null);
        setField(term51511, term51511.getClass(), "_typePropertyName", null);
        setBooleanField(term51511, term51511.getClass(), "_typeIdVisible", false);
        setField(term51511, term51511.getClass(), "_deserializers", null);
        term51709 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term51807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term51709, term51709.getClass(), "_class", null);
        setField(term51709, term51709.getClass(), "_elementType", term51807);
        setBooleanField(term51709, term51709.getClass(), "_asStatic", false);
        term51843 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer");
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
        args[0] = term51709;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term51843;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


