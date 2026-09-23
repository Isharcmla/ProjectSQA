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

public class SetterlessProperty_init_1578804247407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308866;

    public SetterlessProperty_init_1578804247407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term308638 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term308738 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term308638, term308638.getClass(), "_metadata", term308738);
        setIntField(term308638, term308638.getClass(), "_propertyIndex", 0);
        term308866 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term308958 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term309138 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term309280 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term309380 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term308958, term308958.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term308866, term308866.getClass(), "_name", term308958);
        setBooleanField(term308866, term308866.getClass(), "_forSerialization", false);
        setField(term308866, term308866.getClass(), "_ctorParameters", null);
        setField(term309138, term309138.getClass(), "next", null);
        setField(term309138, term309138.getClass(), "value", null);
        setField(term308866, term308866.getClass(), "_setters", term309138);
        setField(term309280, term309280.getClass(), "value", null);
        setField(term309280, term309280.getClass(), "next", null);
        setField(term308866, term308866.getClass(), "_fields", term309280);
        setField(term308866, term308866.getClass(), "_getters", null);
        setField(term308866, term308866.getClass(), "_metadata", term309380);
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
        args[0] = term308866;
        args[1] = null;
        args[2] = null;
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


