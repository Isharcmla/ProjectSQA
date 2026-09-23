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

public class JavaUtilCollectionsDeserializers_converter_180689703383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362706;
     Object term363102;

    public JavaUtilCollectionsDeserializers_converter_180689703383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term362742 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer");
        Class<? extends Object> term362870 = Class.forName((String) "java.util.jar.JarVerifier$1");
        term362706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term362834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term362962 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term363066 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term362706, term362706.getClass(), "_class", term362742);
        setField(term362834, term362834.getClass(), "_class", term362870);
        setField(term362962, term362962.getClass(), "_class", null);
        setField(term362962, term362962.getClass(), "_superClass", term363066);
        setField(term362834, term362834.getClass(), "_superClass", term362962);
        setField(term362706, term362706.getClass(), "_superClass", term362834);
        term363102 = Class.forName((String) "java.nio.file.TempFileHelper");
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
        args[1] = term362706;
        args[2] = term363102;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


