package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299953;
     Object term300659;

    public JavaUtilCollectionsDeserializers_converter_180689703334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term299989 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase");
        Class<? extends Object> term300129 = Class.forName((String) "com.fasterxml.jackson.databind.JsonDeserializer$None");
        Class<? extends Object> term300271 = Class.forName((String) "java.lang.invoke.TypeConvertingMethodAdapter");
        Class<? extends Object> term300413 = Class.forName((String) "java.util.stream.WhileOps$DropWhileTask");
        term299953 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term300093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term300235 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term300377 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term300517 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term300623 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term299953, term299953.getClass(), "_class", term299989);
        setField(term300093, term300093.getClass(), "_class", term300129);
        setField(term300235, term300235.getClass(), "_class", term300271);
        setField(term300377, term300377.getClass(), "_class", term300413);
        setField(term300517, term300517.getClass(), "_class", null);
        setField(term300517, term300517.getClass(), "_superClass", term300623);
        setField(term300377, term300377.getClass(), "_superClass", term300517);
        setField(term300235, term300235.getClass(), "_superClass", term300377);
        setField(term300093, term300093.getClass(), "_superClass", term300235);
        setField(term299953, term299953.getClass(), "_superClass", term300093);
        term300659 = Class.forName((String) "com.fasterxml.jackson.core.io.SerializedString");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term299953;
        args[2] = term300659;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


