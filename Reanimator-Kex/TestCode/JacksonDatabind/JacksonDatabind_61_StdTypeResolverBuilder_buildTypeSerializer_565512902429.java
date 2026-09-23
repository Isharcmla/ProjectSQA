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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472989;
     Object term473251;
     Object term473823;
     Object term473827;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473831 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term473830 = ((Class) term473831).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term473830).setAccessible(true);
        Object enum534 = ((Field) term473830).get((Object) null);
        term472989 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term472989, term472989.getClass(), "_appliesFor", enum534);
        term473251 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term473355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term473447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term473355, term473355.getClass(), "_referencedType", term473447);
        setField(term473251, term473251.getClass(), "_referencedType", term473355);
        Class<? extends Object> term474171 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term474170 = ((Class) term474171).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term474170).setAccessible(true);
        Object enum535 = ((Field) term474170).get((Object) null);
        term473823 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term473823, term473823.getClass(), "_appliesFor", enum535);
        setField(term473823, term473823.getClass(), "_idType", null);
        setField(term473823, term473823.getClass(), "_includeAs", null);
        setField(term473823, term473823.getClass(), "_typeProperty", null);
        setBooleanField(term473823, term473823.getClass(), "_typeIdVisible", false);
        setField(term473823, term473823.getClass(), "_defaultImpl", null);
        setField(term473823, term473823.getClass(), "_customIdResolver", null);
        term473827 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term473828 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term473829 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term473829, term473829.getClass(), "_keyType", null);
        setField(term473829, term473829.getClass(), "_valueType", null);
        setField(term473829, term473829.getClass(), "_superClass", null);
        setField(term473829, term473829.getClass(), "_superInterfaces", null);
        setField(term473829, term473829.getClass(), "_bindings", null);
        setField(term473829, term473829.getClass(), "_canonicalName", null);
        setField(term473829, term473829.getClass(), "_class", null);
        setIntField(term473829, term473829.getClass(), "_hash", 0);
        setField(term473829, term473829.getClass(), "_valueHandler", null);
        setField(term473829, term473829.getClass(), "_typeHandler", null);
        setBooleanField(term473829, term473829.getClass(), "_asStatic", false);
        setField(term473828, term473828.getClass(), "_referencedType", term473829);
        setField(term473828, term473828.getClass(), "_anchorType", null);
        setField(term473828, term473828.getClass(), "_superClass", null);
        setField(term473828, term473828.getClass(), "_superInterfaces", null);
        setField(term473828, term473828.getClass(), "_bindings", null);
        setField(term473828, term473828.getClass(), "_canonicalName", null);
        setField(term473828, term473828.getClass(), "_class", null);
        setIntField(term473828, term473828.getClass(), "_hash", 0);
        setField(term473828, term473828.getClass(), "_valueHandler", null);
        setField(term473828, term473828.getClass(), "_typeHandler", null);
        setBooleanField(term473828, term473828.getClass(), "_asStatic", false);
        setField(term473827, term473827.getClass(), "_referencedType", term473828);
        setField(term473827, term473827.getClass(), "_anchorType", null);
        setField(term473827, term473827.getClass(), "_superClass", null);
        setField(term473827, term473827.getClass(), "_superInterfaces", null);
        setField(term473827, term473827.getClass(), "_bindings", null);
        setField(term473827, term473827.getClass(), "_canonicalName", null);
        setField(term473827, term473827.getClass(), "_class", null);
        setIntField(term473827, term473827.getClass(), "_hash", 0);
        setField(term473827, term473827.getClass(), "_valueHandler", null);
        setField(term473827, term473827.getClass(), "_typeHandler", null);
        setBooleanField(term473827, term473827.getClass(), "_asStatic", false);
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
        args[1] = term473251;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term472989, args);
        assertTrue(recursiveEquals(term472989, term473823));
        assertTrue(recursiveEquals(term473251, null));
    }

};


