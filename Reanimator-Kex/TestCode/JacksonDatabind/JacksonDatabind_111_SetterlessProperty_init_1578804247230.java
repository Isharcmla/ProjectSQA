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

public class SetterlessProperty_init_1578804247230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140335;
     Object term140483;
     Object term140599;

    public SetterlessProperty_init_1578804247230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term139693 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term139793 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term139885 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term139991 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term140107 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term140207 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term139693, term139693.getClass(), "_metadata", term139793);
        setIntField(term139693, term139693.getClass(), "_propertyIndex", 0);
        setField(term139693, term139693.getClass(), "_propName", term139885);
        setField(term139693, term139693.getClass(), "_type", term139991);
        setField(term139693, term139693.getClass(), "_wrapperName", term139885);
        setField(term139693, term139693.getClass(), "_contextAnnotations", term140107);
        setField(term139693, term139693.getClass(), "_viewMatcher", term140207);
        term140335 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term140335, term140335.getClass(), "_name", null);
        setBooleanField(term140335, term140335.getClass(), "_forSerialization", true);
        setField(term140335, term140335.getClass(), "_getters", null);
        setField(term140335, term140335.getClass(), "_fields", null);
        setField(term140335, term140335.getClass(), "_metadata", null);
        setField(term140335, term140335.getClass(), "_annotationIntrospector", null);
        term140483 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term140599 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term140335;
        args[1] = null;
        args[2] = term140483;
        args[3] = term140599;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


