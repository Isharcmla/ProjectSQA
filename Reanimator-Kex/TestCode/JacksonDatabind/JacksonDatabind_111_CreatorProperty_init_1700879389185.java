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

public class CreatorProperty_init_1700879389185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298843;
     Object term298973;
     Object term299121;
     Object term299588;
     Object term299688;

    public CreatorProperty_init_1700879389185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term299176 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term299226 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term299272 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term299318 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term299364 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term299422 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term299472 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term299176, term299176.getClass(), "_metadata", term299226);
        setIntField(term299176, term299176.getClass(), "_propertyIndex", 0);
        setField(term299176, term299176.getClass(), "_propName", term299272);
        setField(term299176, term299176.getClass(), "_type", term299318);
        setField(term299176, term299176.getClass(), "_wrapperName", term299364);
        setField(term299176, term299176.getClass(), "_contextAnnotations", term299422);
        setField(term299176, term299176.getClass(), "_viewMatcher", term299472);
        term298843 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term298843, term298843.getClass(), "_simpleName", "");
        term298973 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term299121 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term299121, term299121.getClass(), "_property", term299176);
        term299588 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term299688 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
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
        args[0] = term298843;
        args[1] = null;
        args[2] = term298973;
        args[3] = term299121;
        args[4] = term299588;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term299688;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


