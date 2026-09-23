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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628358;
     Object term628620;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term629758 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term629757 = ((Class) term629758).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term629757).setAccessible(true);
        Object enum675 = ((Field) term629757).get((Object) null);
        term628358 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term628358, term628358.getClass(), "_appliesFor", enum675);
        Class<? extends Object> term628762 = Class.forName((String) "com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type");
        term628620 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term628726 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term628726, term628726.getClass(), "_class", term628762);
        setField(term628620, term628620.getClass(), "_referencedType", term628726);
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
        args[1] = term628620;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term628358, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


