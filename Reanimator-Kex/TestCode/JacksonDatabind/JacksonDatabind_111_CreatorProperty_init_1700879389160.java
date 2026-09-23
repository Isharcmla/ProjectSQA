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

public class CreatorProperty_init_1700879389160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205671;
     Object term205823;
     Object term205915;
     Object term206063;

    public CreatorProperty_init_1700879389160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term205291 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term205391 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term205483 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term205579 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term205291, term205291.getClass(), "_metadata", term205391);
        setIntField(term205291, term205291.getClass(), "_propertyIndex", 0);
        setField(term205291, term205291.getClass(), "_propName", term205483);
        setField(term205291, term205291.getClass(), "_type", term205579);
        setField(term205291, term205291.getClass(), "_wrapperName", null);
        setField(term205291, term205291.getClass(), "_contextAnnotations", null);
        setField(term205291, term205291.getClass(), "_viewMatcher", null);
        term205671 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term205671, term205671.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        term205823 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term205915 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term206063 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
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
        args[0] = term205671;
        args[1] = term205823;
        args[2] = term205915;
        args[3] = term206063;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


