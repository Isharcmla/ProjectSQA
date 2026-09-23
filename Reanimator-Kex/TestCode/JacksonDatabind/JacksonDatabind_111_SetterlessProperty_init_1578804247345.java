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

public class SetterlessProperty_init_1578804247345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240025;
     Object term240286;
     Object term240434;
     Object term240550;

    public SetterlessProperty_init_1578804247345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term239475 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term239575 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term239667 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term240071 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term239897 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term239475, term239475.getClass(), "_metadata", term239575);
        setIntField(term239475, term239475.getClass(), "_propertyIndex", 0);
        setField(term239475, term239475.getClass(), "_propName", term239667);
        setField(term239475, term239475.getClass(), "_type", null);
        setField(term240071, term240071.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term239475, term239475.getClass(), "_wrapperName", term240071);
        setField(term239475, term239475.getClass(), "_contextAnnotations", null);
        setField(term239475, term239475.getClass(), "_viewMatcher", term239897);
        term240025 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term240190 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term240025, term240025.getClass(), "_name", term240071);
        setBooleanField(term240025, term240025.getClass(), "_forSerialization", false);
        setField(term240025, term240025.getClass(), "_ctorParameters", null);
        setField(term240025, term240025.getClass(), "_setters", null);
        setField(term240025, term240025.getClass(), "_fields", null);
        setField(term240025, term240025.getClass(), "_getters", null);
        setField(term240025, term240025.getClass(), "_metadata", term240190);
        term240286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term240434 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term240550 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term240025;
        args[1] = term240286;
        args[2] = term240434;
        args[3] = term240550;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


