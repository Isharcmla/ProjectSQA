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

public class SetterlessProperty_init_1578804247349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249538;
     Object term250196;

    public SetterlessProperty_init_1578804247349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term249222 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term249314 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term249410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term249222, term249222.getClass(), "_metadata", null);
        setIntField(term249222, term249222.getClass(), "_propertyIndex", 0);
        setField(term249222, term249222.getClass(), "_propName", term249314);
        setField(term249222, term249222.getClass(), "_type", term249410);
        setField(term249222, term249222.getClass(), "_wrapperName", term249314);
        setField(term249222, term249222.getClass(), "_contextAnnotations", null);
        setField(term249222, term249222.getClass(), "_viewMatcher", null);
        term249538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term249680 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term249800 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term249948 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term250048 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term249538, term249538.getClass(), "_name", null);
        setBooleanField(term249538, term249538.getClass(), "_forSerialization", false);
        setField(term249538, term249538.getClass(), "_ctorParameters", null);
        setField(term249680, term249680.getClass(), "next", null);
        setField(term249680, term249680.getClass(), "value", term249800);
        setField(term249538, term249538.getClass(), "_setters", term249680);
        setField(term249538, term249538.getClass(), "_annotationIntrospector", term249948);
        setField(term249538, term249538.getClass(), "_metadata", term250048);
        term250196 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term249538;
        args[1] = null;
        args[2] = term250196;
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


