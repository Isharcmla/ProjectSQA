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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MethodProperty_init_2028953326130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64670;

    public MethodProperty_init_2028953326130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64542 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        term64670 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term64762 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term64904 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term65030 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term65190 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor"));
        Object term65334 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term65476 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term64670, term64670.getClass(), "_name", term64762);
        setBooleanField(term64670, term64670.getClass(), "_forSerialization", false);
        setField(term65030, term65030.getClass(), "_owner", term65190);
        setField(term64904, term64904.getClass(), "value", term65030);
        setField(term64904, term64904.getClass(), "next", null);
        setField(term64670, term64670.getClass(), "_ctorParameters", term64904);
        setField(term64670, term64670.getClass(), "_annotationIntrospector", term65334);
        setField(term64670, term64670.getClass(), "_metadata", null);
        setField(term64670, term64670.getClass(), "_setters", null);
        setField(term64670, term64670.getClass(), "_fields", null);
        setField(term64670, term64670.getClass(), "_getters", term65476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term64670;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


