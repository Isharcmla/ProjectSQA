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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502507;
     Object term502769;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term505026 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term505025 = ((Class) term505026).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term505025).setAccessible(true);
        Object enum564 = ((Field) term505025).get((Object) null);
        term502507 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term502507, term502507.getClass(), "_appliesFor", enum564);
        term502769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term502875 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term502769, term502769.getClass(), "_referencedType", term502875);
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
        args[1] = term502769;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term502507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


