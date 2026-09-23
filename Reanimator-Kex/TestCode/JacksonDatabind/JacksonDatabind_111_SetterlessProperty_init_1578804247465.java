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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetterlessProperty_init_1578804247465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392571;
     Object term392949;

    public SetterlessProperty_init_1578804247465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term392343 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term392443 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term392343, term392343.getClass(), "_metadata", null);
        setIntField(term392343, term392343.getClass(), "_propertyIndex", 0);
        setField(term392343, term392343.getClass(), "_propName", null);
        setField(term392343, term392343.getClass(), "_type", null);
        setField(term392343, term392343.getClass(), "_wrapperName", null);
        setField(term392343, term392343.getClass(), "_contextAnnotations", null);
        setField(term392343, term392343.getClass(), "_viewMatcher", term392443);
        term392571 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term392663 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term392801 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term392663, term392663.getClass(), "_simpleName", "");
        setField(term392571, term392571.getClass(), "_name", term392663);
        setBooleanField(term392571, term392571.getClass(), "_forSerialization", false);
        setField(term392571, term392571.getClass(), "_ctorParameters", null);
        setField(term392571, term392571.getClass(), "_setters", null);
        setField(term392571, term392571.getClass(), "_fields", null);
        setField(term392571, term392571.getClass(), "_getters", null);
        setField(term392571, term392571.getClass(), "_metadata", term392801);
        term392949 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term392571;
        args[1] = null;
        args[2] = term392949;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


