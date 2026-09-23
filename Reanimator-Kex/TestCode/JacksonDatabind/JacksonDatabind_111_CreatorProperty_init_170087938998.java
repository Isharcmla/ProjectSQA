package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatorProperty_init_170087938998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37344;
     Object term37644;

    public CreatorProperty_init_170087938998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37399 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term37449 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term37498 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term37544 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term37399, term37399.getClass(), "_metadata", term37449);
        setIntField(term37399, term37399.getClass(), "_propertyIndex", 0);
        setField(term37399, term37399.getClass(), "_propName", null);
        setField(term37399, term37399.getClass(), "_type", term37498);
        setField(term37399, term37399.getClass(), "_wrapperName", term37544);
        setField(term37399, term37399.getClass(), "_contextAnnotations", null);
        setField(term37399, term37399.getClass(), "_viewMatcher", null);
        term37344 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term37344, term37344.getClass(), "_property", term37399);
        term37644 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term37344;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term37644;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


