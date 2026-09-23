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

public class SetterlessProperty_init_1578804247253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158330;
     Object term158818;
     Object term158960;

    public SetterlessProperty_init_1578804247253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term159023 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term159073 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term159133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term159191 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term159241 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term159023, term159023.getClass(), "_metadata", term159073);
        setIntField(term159023, term159023.getClass(), "_propertyIndex", 0);
        setField(term159023, term159023.getClass(), "_propName", null);
        setField(term159023, term159023.getClass(), "_type", term159133);
        setField(term159023, term159023.getClass(), "_wrapperName", null);
        setField(term159023, term159023.getClass(), "_contextAnnotations", term159191);
        setField(term159023, term159023.getClass(), "_viewMatcher", term159241);
        term158330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term158472 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term158614 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term158714 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term158330, term158330.getClass(), "_name", null);
        setBooleanField(term158330, term158330.getClass(), "_forSerialization", false);
        setField(term158330, term158330.getClass(), "_ctorParameters", null);
        setField(term158472, term158472.getClass(), "next", null);
        setField(term158472, term158472.getClass(), "value", null);
        setField(term158330, term158330.getClass(), "_setters", term158472);
        setField(term158330, term158330.getClass(), "_fields", null);
        setField(term158614, term158614.getClass(), "next", null);
        setField(term158614, term158614.getClass(), "value", null);
        setField(term158330, term158330.getClass(), "_getters", term158614);
        setField(term158330, term158330.getClass(), "_metadata", term158714);
        term158818 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term158960 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term158960, term158960.getClass(), "_property", term159023);
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
        args[0] = term158330;
        args[1] = term158818;
        args[2] = term158960;
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


