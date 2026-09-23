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

public class CreatorProperty_init_1700879389118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70037;
     Object term70167;
     Object term70313;

    public CreatorProperty_init_1700879389118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69945 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(term69945, term69945.getClass(), "_metadata", null);
        setIntField(term69945, term69945.getClass(), "_propertyIndex", 0);
        setField(term69945, term69945.getClass(), "_propName", null);
        setField(term69945, term69945.getClass(), "_type", null);
        setField(term69945, term69945.getClass(), "_wrapperName", null);
        setField(term69945, term69945.getClass(), "_contextAnnotations", null);
        setField(term69945, term69945.getClass(), "_viewMatcher", null);
        term70037 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term70037, term70037.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term70167 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term70313 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term70037;
        args[1] = term70167;
        args[2] = null;
        args[3] = term70313;
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


