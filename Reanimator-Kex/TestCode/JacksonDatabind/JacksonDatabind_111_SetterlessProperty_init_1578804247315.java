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

public class SetterlessProperty_init_1578804247315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208944;
     Object term209602;

    public SetterlessProperty_init_1578804247315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term209665 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term209715 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term209775 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term209833 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term209665, term209665.getClass(), "_metadata", term209715);
        setIntField(term209665, term209665.getClass(), "_propertyIndex", 0);
        setField(term209665, term209665.getClass(), "_propName", null);
        setField(term209665, term209665.getClass(), "_type", term209775);
        setField(term209665, term209665.getClass(), "_wrapperName", null);
        setField(term209665, term209665.getClass(), "_contextAnnotations", term209833);
        setField(term209665, term209665.getClass(), "_viewMatcher", null);
        term208944 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term209086 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term209206 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term209354 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term209454 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term208944, term208944.getClass(), "_name", null);
        setBooleanField(term208944, term208944.getClass(), "_forSerialization", false);
        setField(term208944, term208944.getClass(), "_ctorParameters", null);
        setField(term209086, term209086.getClass(), "next", null);
        setField(term209086, term209086.getClass(), "value", term209206);
        setField(term208944, term208944.getClass(), "_setters", term209086);
        setField(term208944, term208944.getClass(), "_annotationIntrospector", term209354);
        setField(term208944, term208944.getClass(), "_metadata", term209454);
        term209602 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term209602, term209602.getClass(), "_property", term209665);
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
        args[0] = term208944;
        args[1] = null;
        args[2] = term209602;
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


