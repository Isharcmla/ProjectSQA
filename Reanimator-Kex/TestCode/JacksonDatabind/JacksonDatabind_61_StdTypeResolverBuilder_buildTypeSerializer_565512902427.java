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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470141;
     Object term470403;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471651 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term471650 = ((Class) term471651).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term471650).setAccessible(true);
        Object enum532 = ((Field) term471650).get((Object) null);
        term470141 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term470141, term470141.getClass(), "_appliesFor", enum532);
        Class<? extends Object> term470543 = Class.forName((String) "java.util.Spliterators$EmptySpliterator$OfLong");
        term470403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term470507 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term470507, term470507.getClass(), "_class", term470543);
        setField(term470403, term470403.getClass(), "_referencedType", term470507);
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
        args[1] = term470403;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term470141, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


