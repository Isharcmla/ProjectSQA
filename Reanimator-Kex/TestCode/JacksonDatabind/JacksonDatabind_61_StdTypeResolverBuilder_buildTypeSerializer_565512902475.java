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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537759;
     Object term538021;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term539157 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term539156 = ((Class) term539157).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term539156).setAccessible(true);
        Object enum594 = ((Field) term539156).get((Object) null);
        term537759 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term537759, term537759.getClass(), "_appliesFor", enum594);
        Class<? extends Object> term538163 = Class.forName((String) "java.util.concurrent.locks.ReadWriteLock");
        term538021 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term538127 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term538127, term538127.getClass(), "_class", term538163);
        setField(term538021, term538021.getClass(), "_referencedType", term538127);
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
        args[1] = term538021;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term537759, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


