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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480264;
     Object term480526;
     Object term481693;
     Object term481697;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term481707 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term481706 = ((Class) term481707).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term481706).setAccessible(true);
        Object enum541 = ((Field) term481706).get((Object) null);
        term480264 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term480264, term480264.getClass(), "_appliesFor", enum541);
        Class<? extends Object> term480682 = Class.forName((String) "java.io.IOException");
        term480526 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term480646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term480646, term480646.getClass(), "_class", term480682);
        setField(term480526, term480526.getClass(), "_referencedType", term480646);
        Class<? extends Object> term482127 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term482126 = ((Class) term482127).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term482126).setAccessible(true);
        Object enum542 = ((Field) term482126).get((Object) null);
        term481693 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term481693, term481693.getClass(), "_appliesFor", enum542);
        setField(term481693, term481693.getClass(), "_idType", null);
        setField(term481693, term481693.getClass(), "_includeAs", null);
        setField(term481693, term481693.getClass(), "_typeProperty", null);
        setBooleanField(term481693, term481693.getClass(), "_typeIdVisible", false);
        setField(term481693, term481693.getClass(), "_defaultImpl", null);
        setField(term481693, term481693.getClass(), "_customIdResolver", null);
        Class<? extends Object> term481699 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing");
        term481697 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term481698 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term481698, term481698.getClass(), "_referencedType", null);
        setField(term481698, term481698.getClass(), "_superClass", null);
        setField(term481698, term481698.getClass(), "_superInterfaces", null);
        setField(term481698, term481698.getClass(), "_bindings", null);
        setField(term481698, term481698.getClass(), "_canonicalName", null);
        setField(term481698, term481698.getClass(), "_class", term481699);
        setIntField(term481698, term481698.getClass(), "_hash", 0);
        setField(term481698, term481698.getClass(), "_valueHandler", null);
        setField(term481698, term481698.getClass(), "_typeHandler", null);
        setBooleanField(term481698, term481698.getClass(), "_asStatic", false);
        setField(term481697, term481697.getClass(), "_referencedType", term481698);
        setField(term481697, term481697.getClass(), "_anchorType", null);
        setField(term481697, term481697.getClass(), "_superClass", null);
        setField(term481697, term481697.getClass(), "_superInterfaces", null);
        setField(term481697, term481697.getClass(), "_bindings", null);
        setField(term481697, term481697.getClass(), "_canonicalName", null);
        setField(term481697, term481697.getClass(), "_class", null);
        setIntField(term481697, term481697.getClass(), "_hash", 0);
        setField(term481697, term481697.getClass(), "_valueHandler", null);
        setField(term481697, term481697.getClass(), "_typeHandler", null);
        setBooleanField(term481697, term481697.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term480526;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term480264, args);
        assertTrue(recursiveEquals(term480264, term481693));
        assertTrue(recursiveEquals(term480526, null));
    }

};


