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

public class StdValueInstantiator_init_1394365189305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357444;

    public StdValueInstantiator_init_1394365189305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term357340 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term357480 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        Class<? extends Object> term357646 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        term357444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term357610 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term357766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term357924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term357444, term357444.getClass(), "_class", term357480);
        setField(term357610, term357610.getClass(), "_canonicalName", null);
        setField(term357610, term357610.getClass(), "_class", term357646);
        setField(term357766, term357766.getClass(), "_canonicalName", "");
        setField(term357610, term357610.getClass(), "_keyType", term357766);
        setField(term357610, term357610.getClass(), "_valueType", term357924);
        setField(term357444, term357444.getClass(), "_referencedType", term357610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term357444;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


