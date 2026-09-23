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

public class SetterlessProperty_init_1578804247205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122584;
     Object term122788;
     Object term122930;

    public SetterlessProperty_init_1578804247205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term122166 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term122266 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term122358 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term122450 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term122166, term122166.getClass(), "_metadata", term122266);
        setIntField(term122166, term122166.getClass(), "_propertyIndex", 0);
        setField(term122166, term122166.getClass(), "_propName", term122358);
        setField(term122166, term122166.getClass(), "_type", null);
        setField(term122166, term122166.getClass(), "_wrapperName", term122450);
        setField(term122166, term122166.getClass(), "_contextAnnotations", null);
        setField(term122166, term122166.getClass(), "_viewMatcher", null);
        term122584 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term122684 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term122584, term122584.getClass(), "_fullName", null);
        setField(term122584, term122584.getClass(), "_annotationIntrospector", null);
        setField(term122584, term122584.getClass(), "_metadata", term122684);
        term122788 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term122930 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
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
        args[0] = term122584;
        args[1] = term122788;
        args[2] = term122930;
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


