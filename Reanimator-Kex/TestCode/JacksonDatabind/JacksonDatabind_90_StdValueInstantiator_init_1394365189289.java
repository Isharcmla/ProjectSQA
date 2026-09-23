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

public class StdValueInstantiator_init_1394365189289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330363;

    public StdValueInstantiator_init_1394365189289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term330259 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term330399 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        Class<? extends Object> term330565 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class term330731 = int.class;
        term330363 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term330529 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term330695 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term330883 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term330363, term330363.getClass(), "_class", term330399);
        setField(term330529, term330529.getClass(), "_canonicalName", null);
        setField(term330529, term330529.getClass(), "_class", term330565);
        setField(term330695, term330695.getClass(), "_canonicalName", null);
        setField(term330695, term330695.getClass(), "_class", term330731);
        setField(term330883, term330883.getClass(), "_canonicalName", "");
        setField(term330695, term330695.getClass(), "_keyType", term330883);
        setField(term330529, term330529.getClass(), "_keyType", term330695);
        setField(term330363, term330363.getClass(), "_referencedType", term330529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term330363;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


