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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665436;
     Object term665698;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term666818 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term666817 = ((Class) term666818).getDeclaredField((String) "NON_FINAL");
        ((Field) term666817).setAccessible(true);
        Object enum707 = ((Field) term666817).get((Object) null);
        term665436 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term665436, term665436.getClass(), "_appliesFor", enum707);
        Class<? extends Object> term665840 = Class.forName((String) "kex.java.util.HashMap");
        term665698 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term665804 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term665804, term665804.getClass(), "_class", term665840);
        setField(term665698, term665698.getClass(), "_referencedType", term665804);
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
        args[1] = term665698;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term665436, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


