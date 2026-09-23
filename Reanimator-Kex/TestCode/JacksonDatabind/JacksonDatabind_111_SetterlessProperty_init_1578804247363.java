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

public class SetterlessProperty_init_1578804247363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261248;

    public SetterlessProperty_init_1578804247363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term261120 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        term261248 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term261340 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term261482 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term261602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term261746 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term261888 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term261248, term261248.getClass(), "_name", term261340);
        setBooleanField(term261248, term261248.getClass(), "_forSerialization", false);
        setField(term261248, term261248.getClass(), "_ctorParameters", null);
        setField(term261482, term261482.getClass(), "next", null);
        setField(term261482, term261482.getClass(), "value", term261602);
        setField(term261248, term261248.getClass(), "_setters", term261482);
        setField(term261248, term261248.getClass(), "_annotationIntrospector", term261746);
        setField(term261248, term261248.getClass(), "_metadata", null);
        setField(term261888, term261888.getClass(), "value", null);
        setField(term261888, term261888.getClass(), "next", term261888);
        setField(term261248, term261248.getClass(), "_fields", term261888);
        setField(term261248, term261248.getClass(), "_getters", null);
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
        args[0] = term261248;
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


