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

public class CreatorProperty_init_1700879389130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116735;
     Object term116865;
     Object term117013;
     Object term117129;
     Object term117229;

    public CreatorProperty_init_1700879389130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term116089 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object term116181 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term116295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term116387 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term116543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term116643 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term116089, term116089.getClass(), "_metadata", null);
        setIntField(term116089, term116089.getClass(), "_propertyIndex", 0);
        setField(term116089, term116089.getClass(), "_propName", term116181);
        setField(term116089, term116089.getClass(), "_type", term116295);
        setField(term116089, term116089.getClass(), "_wrapperName", term116387);
        setField(term116089, term116089.getClass(), "_contextAnnotations", term116543);
        setField(term116089, term116089.getClass(), "_viewMatcher", term116643);
        term116735 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term116735, term116735.getClass(), "_simpleName", "");
        term116865 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term117013 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term117129 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        term117229 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
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
        args[0] = term116735;
        args[1] = null;
        args[2] = term116865;
        args[3] = term117013;
        args[4] = term117129;
        args[5] = null;
        args[6] = 0;
        args[7] = null;
        args[8] = term117229;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


