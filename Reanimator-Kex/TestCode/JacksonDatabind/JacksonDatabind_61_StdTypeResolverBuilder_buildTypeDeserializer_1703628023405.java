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
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436487;
     Object term436749;
     Object term438002;
     Object term438006;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term438016 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term438015 = ((Class) term438016).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term438015).setAccessible(true);
        Object enum503 = ((Field) term438015).get((Object) null);
        term436487 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term436487, term436487.getClass(), "_appliesFor", enum503);
        Class<? extends Object> term436905 = Class.forName((String) "java.util.stream.Nodes$1");
        term436749 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term436869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term436869, term436869.getClass(), "_class", term436905);
        setField(term436749, term436749.getClass(), "_referencedType", term436869);
        Class<? extends Object> term438451 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term438450 = ((Class) term438451).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term438450).setAccessible(true);
        Object enum504 = ((Field) term438450).get((Object) null);
        term438002 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term438002, term438002.getClass(), "_appliesFor", enum504);
        setField(term438002, term438002.getClass(), "_idType", null);
        setField(term438002, term438002.getClass(), "_includeAs", null);
        setField(term438002, term438002.getClass(), "_typeProperty", null);
        setBooleanField(term438002, term438002.getClass(), "_typeIdVisible", false);
        setField(term438002, term438002.getClass(), "_defaultImpl", null);
        setField(term438002, term438002.getClass(), "_customIdResolver", null);
        Class<? extends Object> term438008 = Class.forName((String) "com.fasterxml.jackson.databind.deser.ValueInstantiators$Base");
        term438006 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term438007 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term438007, term438007.getClass(), "_referencedType", null);
        setField(term438007, term438007.getClass(), "_superClass", null);
        setField(term438007, term438007.getClass(), "_superInterfaces", null);
        setField(term438007, term438007.getClass(), "_bindings", null);
        setField(term438007, term438007.getClass(), "_canonicalName", null);
        setField(term438007, term438007.getClass(), "_class", term438008);
        setIntField(term438007, term438007.getClass(), "_hash", 0);
        setField(term438007, term438007.getClass(), "_valueHandler", null);
        setField(term438007, term438007.getClass(), "_typeHandler", null);
        setBooleanField(term438007, term438007.getClass(), "_asStatic", false);
        setField(term438006, term438006.getClass(), "_referencedType", term438007);
        setField(term438006, term438006.getClass(), "_anchorType", null);
        setField(term438006, term438006.getClass(), "_superClass", null);
        setField(term438006, term438006.getClass(), "_superInterfaces", null);
        setField(term438006, term438006.getClass(), "_bindings", null);
        setField(term438006, term438006.getClass(), "_canonicalName", null);
        setField(term438006, term438006.getClass(), "_class", null);
        setIntField(term438006, term438006.getClass(), "_hash", 0);
        setField(term438006, term438006.getClass(), "_valueHandler", null);
        setField(term438006, term438006.getClass(), "_typeHandler", null);
        setBooleanField(term438006, term438006.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term436749;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term436487, args);
        assertTrue(recursiveEquals(term436487, term438002));
        assertTrue(recursiveEquals(term436749, null));
    }

};


