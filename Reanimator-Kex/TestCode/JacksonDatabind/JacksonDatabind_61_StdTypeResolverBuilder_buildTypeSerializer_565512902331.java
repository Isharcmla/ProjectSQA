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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356037;
     Object term356299;
     Object term356778;
     Object term356782;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term356785 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term356784 = ((Class) term356785).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term356784).setAccessible(true);
        Object enum409 = ((Field) term356784).get((Object) null);
        term356037 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term356037, term356037.getClass(), "_appliesFor", enum409);
        term356299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term356405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term356299, term356299.getClass(), "_referencedType", term356405);
        Class<? extends Object> term357125 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term357124 = ((Class) term357125).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term357124).setAccessible(true);
        Object enum410 = ((Field) term357124).get((Object) null);
        term356778 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term356778, term356778.getClass(), "_appliesFor", enum410);
        setField(term356778, term356778.getClass(), "_idType", null);
        setField(term356778, term356778.getClass(), "_includeAs", null);
        setField(term356778, term356778.getClass(), "_typeProperty", null);
        setBooleanField(term356778, term356778.getClass(), "_typeIdVisible", false);
        setField(term356778, term356778.getClass(), "_defaultImpl", null);
        setField(term356778, term356778.getClass(), "_customIdResolver", null);
        term356782 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term356783 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term356783, term356783.getClass(), "_elementType", null);
        setField(term356783, term356783.getClass(), "_superClass", null);
        setField(term356783, term356783.getClass(), "_superInterfaces", null);
        setField(term356783, term356783.getClass(), "_bindings", null);
        setField(term356783, term356783.getClass(), "_canonicalName", null);
        setField(term356783, term356783.getClass(), "_class", null);
        setIntField(term356783, term356783.getClass(), "_hash", 0);
        setField(term356783, term356783.getClass(), "_valueHandler", null);
        setField(term356783, term356783.getClass(), "_typeHandler", null);
        setBooleanField(term356783, term356783.getClass(), "_asStatic", false);
        setField(term356782, term356782.getClass(), "_referencedType", term356783);
        setField(term356782, term356782.getClass(), "_anchorType", null);
        setField(term356782, term356782.getClass(), "_superClass", null);
        setField(term356782, term356782.getClass(), "_superInterfaces", null);
        setField(term356782, term356782.getClass(), "_bindings", null);
        setField(term356782, term356782.getClass(), "_canonicalName", null);
        setField(term356782, term356782.getClass(), "_class", null);
        setIntField(term356782, term356782.getClass(), "_hash", 0);
        setField(term356782, term356782.getClass(), "_valueHandler", null);
        setField(term356782, term356782.getClass(), "_typeHandler", null);
        setBooleanField(term356782, term356782.getClass(), "_asStatic", false);
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
        args[1] = term356299;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term356037, args);
        assertTrue(recursiveEquals(term356037, term356778));
        assertTrue(recursiveEquals(term356299, null));
    }

};


