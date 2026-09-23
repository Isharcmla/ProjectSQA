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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90748;
     Object term90762;
     Object term90756;

    public JavaUtilCollectionsDeserializers_converter_180689703143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90748 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term90748, term90748.getClass(), "_class", null);
        term90762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term90762, term90762.getClass(), "_keyType", null);
        setField(term90762, term90762.getClass(), "_valueType", null);
        setField(term90762, term90762.getClass(), "_superClass", null);
        setField(term90762, term90762.getClass(), "_superInterfaces", null);
        setField(term90762, term90762.getClass(), "_bindings", null);
        setField(term90762, term90762.getClass(), "_canonicalName", null);
        setField(term90762, term90762.getClass(), "_class", null);
        setIntField(term90762, term90762.getClass(), "_hash", 0);
        setField(term90762, term90762.getClass(), "_valueHandler", null);
        setField(term90762, term90762.getClass(), "_typeHandler", null);
        setBooleanField(term90762, term90762.getClass(), "_asStatic", false);
        term90756 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term90753 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term90753, term90753.getClass(), "_keyType", null);
        setField(term90753, term90753.getClass(), "_valueType", null);
        setField(term90753, term90753.getClass(), "_superClass", null);
        setField(term90753, term90753.getClass(), "_superInterfaces", null);
        setField(term90753, term90753.getClass(), "_bindings", null);
        setField(term90753, term90753.getClass(), "_canonicalName", null);
        setField(term90753, term90753.getClass(), "_class", null);
        setIntField(term90753, term90753.getClass(), "_hash", 0);
        setField(term90753, term90753.getClass(), "_valueHandler", null);
        setField(term90753, term90753.getClass(), "_typeHandler", null);
        setBooleanField(term90753, term90753.getClass(), "_asStatic", false);
        setField(term90756, term90756.getClass(), "_inputType", term90753);
        setIntField(term90756, term90756.getClass(), "_kind", 0);
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
        args[1] = term90748;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term90748, null));
        assertTrue(recursiveEquals(retValue, term90756));
    }

};


