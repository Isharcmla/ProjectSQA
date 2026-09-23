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

public class SetterlessProperty_init_1578804247327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221127;
     Object term221465;
     Object term221607;
     Object term221763;

    public SetterlessProperty_init_1578804247327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term220437 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term220537 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term220651 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term220743 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term220899 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term220999 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term220437, term220437.getClass(), "_metadata", term220537);
        setIntField(term220437, term220437.getClass(), "_propertyIndex", 0);
        setField(term220437, term220437.getClass(), "_propName", null);
        setField(term220437, term220437.getClass(), "_type", term220651);
        setField(term220437, term220437.getClass(), "_wrapperName", term220743);
        setField(term220437, term220437.getClass(), "_contextAnnotations", term220899);
        setField(term220437, term220437.getClass(), "_viewMatcher", term220999);
        term221127 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term221269 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term221369 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term221127, term221127.getClass(), "_name", null);
        setBooleanField(term221127, term221127.getClass(), "_forSerialization", true);
        setField(term221127, term221127.getClass(), "_getters", null);
        setField(term221269, term221269.getClass(), "value", null);
        setField(term221269, term221269.getClass(), "next", null);
        setField(term221127, term221127.getClass(), "_fields", term221269);
        setField(term221127, term221127.getClass(), "_metadata", term221369);
        term221465 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term221607 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        term221763 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term221127;
        args[1] = term221465;
        args[2] = term221607;
        args[3] = term221763;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


