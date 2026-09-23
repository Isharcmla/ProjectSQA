package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;

public class ObjectIdValueProperty_init_138267413627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3711;
     Object term4286;
     Object term4287;

    public ObjectIdValueProperty_init_138267413627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3711 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        term4286 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term4286, term4286.getClass(), "_objectIdReader", null);
        setField(term4286, term4286.getClass(), "_propName", null);
        setField(term4286, term4286.getClass(), "_type", null);
        setField(term4286, term4286.getClass(), "_wrapperName", null);
        setField(term4286, term4286.getClass(), "_contextAnnotations", null);
        setField(term4286, term4286.getClass(), "_valueDeserializer", null);
        setField(term4286, term4286.getClass(), "_valueTypeDeserializer", null);
        setField(term4286, term4286.getClass(), "_managedReferenceName", null);
        setField(term4286, term4286.getClass(), "_objectIdInfo", null);
        setField(term4286, term4286.getClass(), "_viewMatcher", null);
        setIntField(term4286, term4286.getClass(), "_propertyIndex", 0);
        setField(term4286, term4286.getClass(), "_metadata", null);
        setField(term4286, term4286.getClass(), "_format", null);
        term4287 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term4287, term4287.getClass(), "_objectIdReader", null);
        setField(term4287, term4287.getClass(), "_propName", null);
        setField(term4287, term4287.getClass(), "_type", null);
        setField(term4287, term4287.getClass(), "_wrapperName", null);
        setField(term4287, term4287.getClass(), "_contextAnnotations", null);
        setField(term4287, term4287.getClass(), "_valueDeserializer", null);
        setField(term4287, term4287.getClass(), "_valueTypeDeserializer", null);
        setField(term4287, term4287.getClass(), "_managedReferenceName", null);
        setField(term4287, term4287.getClass(), "_objectIdInfo", null);
        setField(term4287, term4287.getClass(), "_viewMatcher", null);
        setIntField(term4287, term4287.getClass(), "_propertyIndex", 0);
        setField(term4287, term4287.getClass(), "_metadata", null);
        setField(term4287, term4287.getClass(), "_format", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term3711;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4286));
        assertTrue(recursiveEquals(term3711, term4287));
    }

};


