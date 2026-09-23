package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatorProperty_init_1700879389174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255853;
     Object term256005;
     Object term256151;
     Object term256251;

    public CreatorProperty_init_1700879389174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term255547 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term255647 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term255761 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term255547, term255547.getClass(), "_metadata", term255647);
        setIntField(term255547, term255547.getClass(), "_propertyIndex", 0);
        setField(term255547, term255547.getClass(), "_propName", null);
        setField(term255547, term255547.getClass(), "_type", term255761);
        setField(term255547, term255547.getClass(), "_wrapperName", null);
        setField(term255547, term255547.getClass(), "_contextAnnotations", null);
        setField(term255547, term255547.getClass(), "_viewMatcher", null);
        term255853 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term255853, term255853.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term256005 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term256151 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term256251 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[9];
        args[0] = term255853;
        args[1] = term256005;
        args[2] = null;
        args[3] = term256151;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term256251;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


