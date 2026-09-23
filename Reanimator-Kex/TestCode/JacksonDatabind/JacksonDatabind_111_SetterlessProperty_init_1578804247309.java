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

public class SetterlessProperty_init_1578804247309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205080;
     Object term205251;
     Object term205397;

    public SetterlessProperty_init_1578804247309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term204624 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term204724 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term204816 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term205126 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term204624, term204624.getClass(), "_metadata", term204724);
        setIntField(term204624, term204624.getClass(), "_propertyIndex", 0);
        setField(term204624, term204624.getClass(), "_propName", term204816);
        setField(term204624, term204624.getClass(), "_type", null);
        setField(term205126, term205126.getClass(), "_simpleName", "");
        setField(term204624, term204624.getClass(), "_wrapperName", term205126);
        setField(term204624, term204624.getClass(), "_contextAnnotations", null);
        setField(term204624, term204624.getClass(), "_viewMatcher", null);
        term205080 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term205080, term205080.getClass(), "_fullName", term205126);
        setField(term205080, term205080.getClass(), "_annotationIntrospector", null);
        setField(term205080, term205080.getClass(), "_metadata", null);
        term205251 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term205397 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term205080;
        args[1] = term205251;
        args[2] = term205397;
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


