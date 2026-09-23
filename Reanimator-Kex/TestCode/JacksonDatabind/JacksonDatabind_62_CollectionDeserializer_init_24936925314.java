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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Boolean;

public class CollectionDeserializer_init_24936925314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;
     Object term18;

    public CollectionDeserializer_init_24936925314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        Boolean term17 = new Boolean(false);
        term16 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term16, term16.getClass(), "_collectionType", null);
        setField(term16, term16.getClass(), "_valueDeserializer", null);
        setField(term16, term16.getClass(), "_valueTypeDeserializer", null);
        setField(term16, term16.getClass(), "_valueInstantiator", null);
        setField(term16, term16.getClass(), "_delegateDeserializer", null);
        setField(term16, term16.getClass(), "_unwrapSingle", term17);
        setField(term16, term16.getClass(), "_valueClass", null);
        term18 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[5] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16));
        assertTrue(recursiveEquals(term1, term18));
    }

};


