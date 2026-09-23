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

public class SetterlessProperty_init_197036148031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4737;
     Object term5158;
     Object term5159;

    public SetterlessProperty_init_197036148031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4737 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        term5158 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(term5158, term5158.getClass(), "_annotated", null);
        setField(term5158, term5158.getClass(), "_getter", null);
        setField(term5158, term5158.getClass(), "_propName", null);
        setField(term5158, term5158.getClass(), "_type", null);
        setField(term5158, term5158.getClass(), "_wrapperName", null);
        setField(term5158, term5158.getClass(), "_contextAnnotations", null);
        setField(term5158, term5158.getClass(), "_valueDeserializer", null);
        setField(term5158, term5158.getClass(), "_valueTypeDeserializer", null);
        setField(term5158, term5158.getClass(), "_nullProvider", null);
        setField(term5158, term5158.getClass(), "_managedReferenceName", null);
        setField(term5158, term5158.getClass(), "_objectIdInfo", null);
        setField(term5158, term5158.getClass(), "_viewMatcher", null);
        setIntField(term5158, term5158.getClass(), "_propertyIndex", 0);
        setField(term5158, term5158.getClass(), "_metadata", null);
        setField(term5158, term5158.getClass(), "_propertyFormat", null);
        setField(term5158, term5158.getClass(), "_aliases", null);
        term5159 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        setField(term5159, term5159.getClass(), "_annotated", null);
        setField(term5159, term5159.getClass(), "_getter", null);
        setField(term5159, term5159.getClass(), "_propName", null);
        setField(term5159, term5159.getClass(), "_type", null);
        setField(term5159, term5159.getClass(), "_wrapperName", null);
        setField(term5159, term5159.getClass(), "_contextAnnotations", null);
        setField(term5159, term5159.getClass(), "_valueDeserializer", null);
        setField(term5159, term5159.getClass(), "_valueTypeDeserializer", null);
        setField(term5159, term5159.getClass(), "_nullProvider", null);
        setField(term5159, term5159.getClass(), "_managedReferenceName", null);
        setField(term5159, term5159.getClass(), "_objectIdInfo", null);
        setField(term5159, term5159.getClass(), "_viewMatcher", null);
        setIntField(term5159, term5159.getClass(), "_propertyIndex", 0);
        setField(term5159, term5159.getClass(), "_metadata", null);
        setField(term5159, term5159.getClass(), "_propertyFormat", null);
        setField(term5159, term5159.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term4737;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5158));
        assertTrue(recursiveEquals(term4737, term5159));
    }

};


