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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37777;
     Object term37869;
     Object term38142;
     Object term38154;
     Object term38162;

    public AsWrapperTypeDeserializer_init_198407507355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37671 = new HashMap();
        Object term37489 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term37623 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term37489, term37489.getClass(), "_baseType", null);
        setField(term37489, term37489.getClass(), "_idResolver", term37623);
        setField(term37489, term37489.getClass(), "_typePropertyName", null);
        setBooleanField(term37489, term37489.getClass(), "_typeIdVisible", false);
        setField(term37489, term37489.getClass(), "_deserializers", term37671);
        term37869 = Class.forName((String) "java.lang.reflect.AnnotatedElement");
        term37777 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term37777, term37777.getClass(), "_class", term37869);
        Class<? extends Object> term38144 = Class.forName((String) "kex.sun.misc.FloatConsts");
        HashMap term38153 = new HashMap();
        term38142 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term38143 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term38142, term38142.getClass(), "_idResolver", null);
        setField(term38143, term38143.getClass(), "_elementType", null);
        setField(term38143, term38143.getClass(), "_canonicalName", null);
        setField(term38143, term38143.getClass(), "_class", term38144);
        setIntField(term38143, term38143.getClass(), "_hash", 0);
        setField(term38143, term38143.getClass(), "_valueHandler", null);
        setField(term38143, term38143.getClass(), "_typeHandler", null);
        setBooleanField(term38143, term38143.getClass(), "_asStatic", false);
        setField(term38142, term38142.getClass(), "_baseType", term38143);
        setField(term38142, term38142.getClass(), "_property", null);
        setField(term38142, term38142.getClass(), "_defaultImpl", term38143);
        setField(term38142, term38142.getClass(), "_typePropertyName", "java.lang.Object[]");
        setBooleanField(term38142, term38142.getClass(), "_typeIdVisible", true);
        setField(term38142, term38142.getClass(), "_deserializers", term38153);
        setField(term38142, term38142.getClass(), "_defaultImplDeserializer", null);
        Class<? extends Object> term38155 = Class.forName((String) "kex.sun.misc.FloatConsts");
        term38154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term38154, term38154.getClass(), "_elementType", null);
        setField(term38154, term38154.getClass(), "_canonicalName", null);
        setField(term38154, term38154.getClass(), "_class", term38155);
        setIntField(term38154, term38154.getClass(), "_hash", 0);
        setField(term38154, term38154.getClass(), "_valueHandler", null);
        setField(term38154, term38154.getClass(), "_typeHandler", null);
        setBooleanField(term38154, term38154.getClass(), "_asStatic", false);
        term38162 = Class.forName((String) "kex.sun.misc.FloatConsts");
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
        args[0] = term37777;
        args[1] = null;
        args[2] = "java.lang.Object[]";
        args[3] = true;
        args[4] = term37869;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38142));
        assertTrue(recursiveEquals(term37777, term38154));
        assertTrue(recursiveEquals(term37869, true));
    }

};


