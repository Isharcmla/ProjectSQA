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

public class StdValueInstantiator_init_1394365189177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129150;

    public StdValueInstantiator_init_1394365189177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129046 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class term129186 = boolean.class;
        Class<? extends Object> term129352 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        term129150 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term129316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term129490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term129150, term129150.getClass(), "_class", term129186);
        setField(term129316, term129316.getClass(), "_canonicalName", null);
        setField(term129316, term129316.getClass(), "_class", term129352);
        setField(term129316, term129316.getClass(), "_keyType", term129490);
        setField(term129150, term129150.getClass(), "_referencedType", term129316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term129150;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


