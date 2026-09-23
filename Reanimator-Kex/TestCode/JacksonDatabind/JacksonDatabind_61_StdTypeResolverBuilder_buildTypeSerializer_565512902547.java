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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654746;
     Object term655008;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term656145 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term656144 = ((Class) term656145).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term656144).setAccessible(true);
        Object enum698 = ((Field) term656144).get((Object) null);
        term654746 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term654746, term654746.getClass(), "_appliesFor", enum698);
        Class<? extends Object> term655140 = Class.forName((String) "java.lang.ModuleLayer$Controller");
        term655008 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term655104 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term655104, term655104.getClass(), "_class", term655140);
        setField(term655008, term655008.getClass(), "_referencedType", term655104);
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
        args[1] = term655008;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term654746, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


