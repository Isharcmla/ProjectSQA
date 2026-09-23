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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491573;
     Object term492107;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term493561 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term493560 = ((Class) term493561).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term493560).setAccessible(true);
        Object enum552 = ((Field) term493560).get((Object) null);
        Class<? extends Object> term493901 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term493900 = ((Class) term493901).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term493900).setAccessible(true);
        Object enum553 = ((Field) term493900).get((Object) null);
        term491573 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term492003 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term491573, term491573.getClass(), "_appliesFor", enum552);
        setField(term491573, term491573.getClass(), "_idType", enum553);
        setField(term491573, term491573.getClass(), "_customIdResolver", term492003);
        Class<? extends Object> term492263 = Class.forName((String) "java.util.concurrent.ForkJoinPool$DefaultForkJoinWorkerThreadFactory$1");
        term492107 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term492227 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term492227, term492227.getClass(), "_class", term492263);
        setField(term492107, term492107.getClass(), "_referencedType", term492227);
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
        args[1] = term492107;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term491573, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


