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

public class SetterlessProperty_init_1578804247197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115344;
     Object term115874;
     Object term116032;

    public SetterlessProperty_init_1578804247197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term114660 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term114752 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term114866 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term114958 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term115116 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term115216 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term114560, term114560.getClass(), "_metadata", term114660);
        setIntField(term114560, term114560.getClass(), "_propertyIndex", 0);
        setField(term114560, term114560.getClass(), "_propName", term114752);
        setField(term114560, term114560.getClass(), "_type", term114866);
        setField(term114560, term114560.getClass(), "_wrapperName", term114958);
        setField(term114560, term114560.getClass(), "_contextAnnotations", term115116);
        setField(term114560, term114560.getClass(), "_viewMatcher", term115216);
        term115344 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term115486 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term115628 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term115728 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term115344, term115344.getClass(), "_name", null);
        setBooleanField(term115344, term115344.getClass(), "_forSerialization", false);
        setField(term115344, term115344.getClass(), "_ctorParameters", null);
        setField(term115486, term115486.getClass(), "next", null);
        setField(term115486, term115486.getClass(), "value", null);
        setField(term115344, term115344.getClass(), "_setters", term115486);
        setField(term115344, term115344.getClass(), "_fields", null);
        setField(term115628, term115628.getClass(), "next", null);
        setField(term115628, term115628.getClass(), "value", null);
        setField(term115344, term115344.getClass(), "_getters", term115628);
        setField(term115344, term115344.getClass(), "_metadata", term115728);
        term115874 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term116032 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term115344;
        args[1] = null;
        args[2] = term115874;
        args[3] = term116032;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


