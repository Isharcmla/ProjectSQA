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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113236;
     Object term113500;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114550 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term114549 = ((Class) term114550).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term114549).setAccessible(true);
        Object enum174 = ((Field) term114549).get((Object) null);
        term113236 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term113236, term113236.getClass(), "_appliesFor", enum174);
        Class<? extends Object> term113536 = Class.forName((String) "java.util.Hashtable$Enumerator");
        term113500 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term113500, term113500.getClass(), "_class", term113536);
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
        args[1] = term113500;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term113236, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


