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

public class JavaUtilCollectionsDeserializers_converter_180689703362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336142;
     Object term336544;

    public JavaUtilCollectionsDeserializers_converter_180689703362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term336178 = Class.forName((String) "java.util.Scanner$TokenSpliterator");
        Class<? extends Object> term336318 = Class.forName((String) "java.util.IdentityHashMap$KeyIterator");
        term336142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term336282 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term336410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term336508 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term336142, term336142.getClass(), "_class", term336178);
        setField(term336282, term336282.getClass(), "_class", term336318);
        setField(term336410, term336410.getClass(), "_class", null);
        setField(term336410, term336410.getClass(), "_superClass", term336508);
        setField(term336282, term336282.getClass(), "_superClass", term336410);
        setField(term336142, term336142.getClass(), "_superClass", term336282);
        term336544 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ForEachTransformedMappingTask");
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
        args[1] = term336142;
        args[2] = term336544;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


