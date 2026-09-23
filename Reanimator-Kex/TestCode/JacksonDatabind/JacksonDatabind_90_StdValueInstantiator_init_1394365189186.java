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

public class StdValueInstantiator_init_1394365189186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141879;

    public StdValueInstantiator_init_1394365189186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141775 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term141915 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class<? extends Object> term146607 = Class.forName((String) "java.util.concurrent.Semaphore$FairSync");
        Class term146598 = Array.newInstance(term146607, 0).getClass();
        Class term146583 = Array.newInstance(term146598, 0).getClass();
        Class term142081 = Array.newInstance(term146583, 0).getClass();
        term141879 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term142045 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term142211 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term142325 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term141879, term141879.getClass(), "_class", term141915);
        setField(term142045, term142045.getClass(), "_canonicalName", null);
        setField(term142045, term142045.getClass(), "_class", term142081);
        setField(term142211, term142211.getClass(), "_canonicalName", "kex.java.lang.AbstractStringBuilder");
        setField(term142045, term142045.getClass(), "_keyType", term142211);
        setField(term142045, term142045.getClass(), "_valueType", term142325);
        setField(term141879, term141879.getClass(), "_referencedType", term142045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term141879;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


