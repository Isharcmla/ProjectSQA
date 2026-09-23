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

public class FieldProperty_init_79566906112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57473;
     Object term57817;
     Object term57965;

    public FieldProperty_init_79566906112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56987 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term57091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term57183 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term57339 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term56987, term56987.getClass(), "_metadata", null);
        setIntField(term56987, term56987.getClass(), "_propertyIndex", 0);
        setField(term56987, term56987.getClass(), "_propName", null);
        setField(term56987, term56987.getClass(), "_type", term57091);
        setField(term56987, term56987.getClass(), "_wrapperName", term57183);
        setField(term56987, term56987.getClass(), "_contextAnnotations", term57339);
        setField(term56987, term56987.getClass(), "_viewMatcher", null);
        term57473 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term57565 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term57703 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term57565, term57565.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term57473, term57473.getClass(), "_fullName", term57565);
        setField(term57473, term57473.getClass(), "_annotationIntrospector", null);
        setField(term57473, term57473.getClass(), "_metadata", term57703);
        term57817 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term57965 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term57473;
        args[1] = term57817;
        args[2] = term57965;
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


