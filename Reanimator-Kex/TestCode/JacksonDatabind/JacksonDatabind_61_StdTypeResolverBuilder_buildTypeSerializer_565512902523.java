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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619742;
     Object term620004;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term621113 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term621112 = ((Class) term621113).getDeclaredField((String) "NON_FINAL");
        ((Field) term621112).setAccessible(true);
        Object enum669 = ((Field) term621112).get((Object) null);
        term619742 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term619742, term619742.getClass(), "_appliesFor", enum669);
        Class<? extends Object> term620132 = Class.forName((String) "java.lang.ref.Reference$1");
        term620004 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term620096 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term620096, term620096.getClass(), "_class", term620132);
        setField(term620004, term620004.getClass(), "_referencedType", term620096);
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
        args[1] = term620004;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term619742, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


