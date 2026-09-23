package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class ReferenceType_init_15651464166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13499;
     Object term13603;
     Object term14645;
     Object term14666;
     Object term14667;

    public ReferenceType_init_15651464166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13463 = Class.forName((String) "java.math.BitSieve");
        Object term13427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term13427, term13427.getClass(), "_class", term13463);
        term13499 = Class.forName((String) "java.lang.WeakPairMap");
        term13603 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term13603, term13603.getClass(), "_hash", 0);
        Class<? extends Object> term14647 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer");
        term14645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term14646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term14646, term14646.getClass(), "_referencedType", null);
        setField(term14646, term14646.getClass(), "_typeParametersFor", null);
        setField(term14646, term14646.getClass(), "_typeParameters", null);
        setField(term14646, term14646.getClass(), "_typeNames", null);
        setField(term14646, term14646.getClass(), "_canonicalName", null);
        setField(term14646, term14646.getClass(), "_class", null);
        setIntField(term14646, term14646.getClass(), "_hash", 0);
        setField(term14646, term14646.getClass(), "_valueHandler", null);
        setField(term14646, term14646.getClass(), "_typeHandler", null);
        setBooleanField(term14646, term14646.getClass(), "_asStatic", false);
        setField(term14645, term14645.getClass(), "_referencedType", term14646);
        setField(term14645, term14645.getClass(), "_typeParametersFor", term14647);
        setField(term14645, term14645.getClass(), "_typeParameters", null);
        setField(term14645, term14645.getClass(), "_typeNames", null);
        setField(term14645, term14645.getClass(), "_canonicalName", null);
        setField(term14645, term14645.getClass(), "_class", term14647);
        setIntField(term14645, term14645.getClass(), "_hash", -642390742);
        setField(term14645, term14645.getClass(), "_valueHandler", null);
        setField(term14645, term14645.getClass(), "_typeHandler", null);
        setBooleanField(term14645, term14645.getClass(), "_asStatic", false);
        term14666 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term14666, term14666.getClass(), "_referencedType", null);
        setField(term14666, term14666.getClass(), "_typeParametersFor", null);
        setField(term14666, term14666.getClass(), "_typeParameters", null);
        setField(term14666, term14666.getClass(), "_typeNames", null);
        setField(term14666, term14666.getClass(), "_canonicalName", null);
        setField(term14666, term14666.getClass(), "_class", null);
        setIntField(term14666, term14666.getClass(), "_hash", 0);
        setField(term14666, term14666.getClass(), "_valueHandler", null);
        setField(term14666, term14666.getClass(), "_typeHandler", null);
        setBooleanField(term14666, term14666.getClass(), "_asStatic", false);
        term14667 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term13499;
        args[1] = term13603;
        args[2] = null;
        args[3] = null;
        args[4] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14645));
        assertTrue(recursiveEquals(term13499, term14666));
        assertTrue(recursiveEquals(term13603, term14667));
    }

};


