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
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_18068970385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38533;
     Object term38793;

    public JavaUtilCollectionsDeserializers_converter_18068970385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38661 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldStaticReadWrite");
        term38533 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term38625 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term38757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term38533, term38533.getClass(), "_class", null);
        setField(term38625, term38625.getClass(), "_class", term38661);
        setField(term38625, term38625.getClass(), "_superClass", term38757);
        setField(term38533, term38533.getClass(), "_superClass", term38625);
        term38793 = Class.forName((String) "java.nio.file.Files$AcceptAllFilter");
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
        args[1] = term38533;
        args[2] = term38793;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


