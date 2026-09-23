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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276234;
     Object term276512;
     Object term277509;
     Object term277513;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term277534 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term277533 = ((Class) term277534).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term277533).setAccessible(true);
        Object enum334 = ((Field) term277533).get((Object) null);
        term276234 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term276234, term276234.getClass(), "_appliesFor", enum334);
        Class<? extends Object> term276548 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat$Sorter");
        term276512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term276512, term276512.getClass(), "_class", term276548);
        Class<? extends Object> term278047 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term278046 = ((Class) term278047).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term278046).setAccessible(true);
        Object enum335 = ((Field) term278046).get((Object) null);
        term277509 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term277509, term277509.getClass(), "_appliesFor", enum335);
        setField(term277509, term277509.getClass(), "_idType", null);
        setField(term277509, term277509.getClass(), "_includeAs", null);
        setField(term277509, term277509.getClass(), "_typeProperty", null);
        setBooleanField(term277509, term277509.getClass(), "_typeIdVisible", false);
        setField(term277509, term277509.getClass(), "_defaultImpl", null);
        setField(term277509, term277509.getClass(), "_customIdResolver", null);
        Class<? extends Object> term277514 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer");
        term277513 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term277513, term277513.getClass(), "_referencedType", null);
        setField(term277513, term277513.getClass(), "_superClass", null);
        setField(term277513, term277513.getClass(), "_superInterfaces", null);
        setField(term277513, term277513.getClass(), "_bindings", null);
        setField(term277513, term277513.getClass(), "_canonicalName", null);
        setField(term277513, term277513.getClass(), "_class", term277514);
        setIntField(term277513, term277513.getClass(), "_hash", 0);
        setField(term277513, term277513.getClass(), "_valueHandler", null);
        setField(term277513, term277513.getClass(), "_typeHandler", null);
        setBooleanField(term277513, term277513.getClass(), "_asStatic", false);
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
        args[1] = term276512;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term276234, args);
        assertTrue(recursiveEquals(term276234, term277509));
        assertTrue(recursiveEquals(term276512, null));
    }

};


