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

public class SetterlessProperty_init_1578804247117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55772;
     Object term56058;

    public SetterlessProperty_init_1578804247117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55290 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term55390 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term55482 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term55638 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term55290, term55290.getClass(), "_metadata", term55390);
        setIntField(term55290, term55290.getClass(), "_propertyIndex", 0);
        setField(term55290, term55290.getClass(), "_propName", term55482);
        setField(term55290, term55290.getClass(), "_type", null);
        setField(term55290, term55290.getClass(), "_wrapperName", null);
        setField(term55290, term55290.getClass(), "_contextAnnotations", term55638);
        setField(term55290, term55290.getClass(), "_viewMatcher", null);
        term55772 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term55916 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term55772, term55772.getClass(), "_fullName", null);
        setField(term55772, term55772.getClass(), "_annotationIntrospector", term55916);
        setField(term55772, term55772.getClass(), "_member", null);
        setField(term55772, term55772.getClass(), "_metadata", null);
        term56058 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
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
        args[0] = term55772;
        args[1] = null;
        args[2] = term56058;
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


