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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372275;
     Object term372537;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term373786 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term373785 = ((Class) term373786).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term373785).setAccessible(true);
        Object enum427 = ((Field) term373785).get((Object) null);
        term372275 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term372275, term372275.getClass(), "_appliesFor", enum427);
        Class<? extends Object> term372677 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicInteger");
        term372537 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term372641 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term372641, term372641.getClass(), "_class", term372677);
        setField(term372537, term372537.getClass(), "_referencedType", term372641);
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
        args[1] = term372537;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term372275, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


