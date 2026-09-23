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

public class FieldProperty_init_7956690674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27673;

    public FieldProperty_init_7956690674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27445 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term27545 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term27445, term27445.getClass(), "_metadata", term27545);
        setIntField(term27445, term27445.getClass(), "_propertyIndex", 0);
        term27673 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term27765 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term27945 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term28045 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term27765, term27765.getClass(), "_simpleName", "");
        setField(term27673, term27673.getClass(), "_name", term27765);
        setBooleanField(term27673, term27673.getClass(), "_forSerialization", false);
        setField(term27673, term27673.getClass(), "_ctorParameters", null);
        setField(term27673, term27673.getClass(), "_setters", null);
        setField(term27673, term27673.getClass(), "_fields", null);
        setField(term27945, term27945.getClass(), "next", null);
        setField(term27945, term27945.getClass(), "value", null);
        setField(term27673, term27673.getClass(), "_getters", term27945);
        setField(term27673, term27673.getClass(), "_metadata", term28045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term27673;
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


