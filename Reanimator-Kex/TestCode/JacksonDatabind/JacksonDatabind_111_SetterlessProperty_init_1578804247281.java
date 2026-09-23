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

public class SetterlessProperty_init_1578804247281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182452;
     Object term182830;

    public SetterlessProperty_init_1578804247281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term182224 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term182324 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term182224, term182224.getClass(), "_metadata", null);
        setIntField(term182224, term182224.getClass(), "_propertyIndex", 0);
        setField(term182224, term182224.getClass(), "_propName", null);
        setField(term182224, term182224.getClass(), "_type", null);
        setField(term182224, term182224.getClass(), "_wrapperName", null);
        setField(term182224, term182224.getClass(), "_contextAnnotations", null);
        setField(term182224, term182224.getClass(), "_viewMatcher", term182324);
        term182452 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term182544 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term182682 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term182544, term182544.getClass(), "_simpleName", "");
        setField(term182452, term182452.getClass(), "_name", term182544);
        setBooleanField(term182452, term182452.getClass(), "_forSerialization", false);
        setField(term182452, term182452.getClass(), "_ctorParameters", null);
        setField(term182452, term182452.getClass(), "_setters", null);
        setField(term182452, term182452.getClass(), "_fields", null);
        setField(term182452, term182452.getClass(), "_getters", null);
        setField(term182452, term182452.getClass(), "_metadata", term182682);
        term182830 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
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
        args[0] = term182452;
        args[1] = null;
        args[2] = term182830;
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


