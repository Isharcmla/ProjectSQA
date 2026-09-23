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

public class CreatorProperty_init_1700879389166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218652;
     Object term218782;
     Object term218930;
     Object term218980;

    public CreatorProperty_init_1700879389166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term218270 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        term218980 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term218462 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term218560 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term218270, term218270.getClass(), "_metadata", term218980);
        setIntField(term218270, term218270.getClass(), "_propertyIndex", 0);
        setField(term218270, term218270.getClass(), "_propName", term218462);
        setField(term218270, term218270.getClass(), "_type", term218560);
        setField(term218270, term218270.getClass(), "_wrapperName", null);
        setField(term218270, term218270.getClass(), "_contextAnnotations", null);
        setField(term218270, term218270.getClass(), "_viewMatcher", null);
        term218652 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term218652, term218652.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term218782 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term218930 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
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
        args[0] = term218652;
        args[1] = null;
        args[2] = term218782;
        args[3] = term218930;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term218980;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


