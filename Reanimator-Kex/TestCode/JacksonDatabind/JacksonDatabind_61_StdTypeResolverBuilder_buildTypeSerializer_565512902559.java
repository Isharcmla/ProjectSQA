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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674022;
     Object term674424;
     Object term675593;
     Object term675602;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term675612 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term675611 = ((Class) term675612).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term675611).setAccessible(true);
        Object enum715 = ((Field) term675611).get((Object) null);
        Class<? extends Object> term675952 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term675951 = ((Class) term675952).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term675951).setAccessible(true);
        Object enum716 = ((Field) term675951).get((Object) null);
        term674022 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term674022, term674022.getClass(), "_appliesFor", enum715);
        setField(term674022, term674022.getClass(), "_idType", enum716);
        setField(term674022, term674022.getClass(), "_customIdResolver", null);
        Class<? extends Object> term674552 = Class.forName((String) "java.lang.ProcessEnvironment$StringValues");
        term674424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term674516 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term674516, term674516.getClass(), "_class", term674552);
        setField(term674424, term674424.getClass(), "_referencedType", term674516);
        Class<? extends Object> term676363 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term676362 = ((Class) term676363).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term676362).setAccessible(true);
        Object enum717 = ((Field) term676362).get((Object) null);
        Class<? extends Object> term676703 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term676702 = ((Class) term676703).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term676702).setAccessible(true);
        Object enum718 = ((Field) term676702).get((Object) null);
        term675593 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term675593, term675593.getClass(), "_appliesFor", enum717);
        setField(term675593, term675593.getClass(), "_idType", enum718);
        setField(term675593, term675593.getClass(), "_includeAs", null);
        setField(term675593, term675593.getClass(), "_typeProperty", null);
        setBooleanField(term675593, term675593.getClass(), "_typeIdVisible", false);
        setField(term675593, term675593.getClass(), "_defaultImpl", null);
        setField(term675593, term675593.getClass(), "_customIdResolver", null);
        Class<? extends Object> term675604 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer");
        term675602 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term675603 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term675603, term675603.getClass(), "_keyType", null);
        setField(term675603, term675603.getClass(), "_valueType", null);
        setField(term675603, term675603.getClass(), "_superClass", null);
        setField(term675603, term675603.getClass(), "_superInterfaces", null);
        setField(term675603, term675603.getClass(), "_bindings", null);
        setField(term675603, term675603.getClass(), "_canonicalName", null);
        setField(term675603, term675603.getClass(), "_class", term675604);
        setIntField(term675603, term675603.getClass(), "_hash", 0);
        setField(term675603, term675603.getClass(), "_valueHandler", null);
        setField(term675603, term675603.getClass(), "_typeHandler", null);
        setBooleanField(term675603, term675603.getClass(), "_asStatic", false);
        setField(term675602, term675602.getClass(), "_referencedType", term675603);
        setField(term675602, term675602.getClass(), "_anchorType", null);
        setField(term675602, term675602.getClass(), "_superClass", null);
        setField(term675602, term675602.getClass(), "_superInterfaces", null);
        setField(term675602, term675602.getClass(), "_bindings", null);
        setField(term675602, term675602.getClass(), "_canonicalName", null);
        setField(term675602, term675602.getClass(), "_class", null);
        setIntField(term675602, term675602.getClass(), "_hash", 0);
        setField(term675602, term675602.getClass(), "_valueHandler", null);
        setField(term675602, term675602.getClass(), "_typeHandler", null);
        setBooleanField(term675602, term675602.getClass(), "_asStatic", false);
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
        args[1] = term674424;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term674022, args);
        assertTrue(recursiveEquals(term674022, term675593));
        assertTrue(recursiveEquals(term674424, null));
    }

};


