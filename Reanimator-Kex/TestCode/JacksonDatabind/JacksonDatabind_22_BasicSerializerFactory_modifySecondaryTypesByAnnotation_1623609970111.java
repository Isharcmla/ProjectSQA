package com.fasterxml.jackson.databind.ser;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33538;
     Object term33906;
     Object term34012;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33538 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term33638 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term33786 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term33538, term33538.getClass(), "_mapperFeatures", -1);
        setField(term33638, term33638.getClass(), "_annotationIntrospector", term33786);
        setField(term33538, term33538.getClass(), "_base", term33638);
        term33906 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term34012 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term33538;
        args[1] = term33906;
        args[2] = term34012;
        try {
            callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


