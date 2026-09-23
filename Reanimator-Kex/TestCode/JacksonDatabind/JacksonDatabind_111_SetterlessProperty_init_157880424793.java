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

public class SetterlessProperty_init_157880424793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38117;
     Object term38363;
     Object term38511;

    public SetterlessProperty_init_157880424793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37627 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term37719 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term37825 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term37983 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term37627, term37627.getClass(), "_metadata", null);
        setIntField(term37627, term37627.getClass(), "_propertyIndex", 0);
        setField(term37627, term37627.getClass(), "_propName", term37719);
        setField(term37627, term37627.getClass(), "_type", term37825);
        setField(term37627, term37627.getClass(), "_wrapperName", null);
        setField(term37627, term37627.getClass(), "_contextAnnotations", term37983);
        setField(term37627, term37627.getClass(), "_viewMatcher", null);
        term38117 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term38265 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term38117, term38117.getClass(), "_fullName", null);
        setField(term38117, term38117.getClass(), "_annotationIntrospector", term38265);
        setField(term38117, term38117.getClass(), "_member", null);
        setField(term38117, term38117.getClass(), "_metadata", null);
        term38363 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term38511 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term38117;
        args[1] = term38363;
        args[2] = term38511;
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


