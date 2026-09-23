package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215594;

    public StdValueInstantiator_init_1394365189227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term215490 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term216708 = Class.forName((String) "java.lang.invoke.InfoFromMemberName");
        Class term216699 = Array.newInstance(term216708, 0).getClass();
        Class term216684 = Array.newInstance(term216699, 0).getClass();
        Class term215630 = Array.newInstance(term216684, 0).getClass();
        Class<? extends Object> term215796 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        term215594 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term215760 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term215934 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term215594, term215594.getClass(), "_class", term215630);
        setField(term215760, term215760.getClass(), "_canonicalName", null);
        setField(term215760, term215760.getClass(), "_class", term215796);
        setField(term215934, term215934.getClass(), "_canonicalName", "kex.java.lang.AbstractStringBuilder");
        setField(term215760, term215760.getClass(), "_keyType", term215934);
        setField(term215594, term215594.getClass(), "_referencedType", term215760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term215594;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


