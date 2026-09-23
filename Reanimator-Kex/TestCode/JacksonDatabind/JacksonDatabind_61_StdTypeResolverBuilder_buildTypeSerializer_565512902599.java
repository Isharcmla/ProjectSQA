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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729481;
     Object term729883;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term731420 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term731419 = ((Class) term731420).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term731419).setAccessible(true);
        Object enum770 = ((Field) term731419).get((Object) null);
        Class<? extends Object> term731760 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term731759 = ((Class) term731760).getDeclaredField((String) "MINIMAL_CLASS");
        ((Field) term731759).setAccessible(true);
        Object enum771 = ((Field) term731759).get((Object) null);
        term729481 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term729481, term729481.getClass(), "_appliesFor", enum770);
        setField(term729481, term729481.getClass(), "_idType", enum771);
        setField(term729481, term729481.getClass(), "_customIdResolver", null);
        Class<? extends Object> term730011 = Class.forName((String) "java.nio.charset.Charset$1");
        term729883 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term729975 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term729975, term729975.getClass(), "_class", term730011);
        setField(term729883, term729883.getClass(), "_referencedType", term729975);
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
        args[1] = term729883;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term729481, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


