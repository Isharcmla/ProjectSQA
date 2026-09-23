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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10164;
     Object term10278;
     Object term10322;
     Object term10323;
     Object term10312;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10164 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term10164, term10164.getClass(), "_mapperFeatures", 0);
        term10278 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term10322 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term10322, term10322.getClass(), "_serFeatures", 0);
        setField(term10322, term10322.getClass(), "_serializationInclusion", null);
        setField(term10322, term10322.getClass(), "_filterProvider", null);
        setField(term10322, term10322.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term10322, term10322.getClass(), "_generatorFeatures", 0);
        setIntField(term10322, term10322.getClass(), "_generatorFeaturesToChange", 0);
        setField(term10322, term10322.getClass(), "_mixIns", null);
        setField(term10322, term10322.getClass(), "_subtypeResolver", null);
        setField(term10322, term10322.getClass(), "_rootName", null);
        setField(term10322, term10322.getClass(), "_view", null);
        setField(term10322, term10322.getClass(), "_attributes", null);
        setField(term10322, term10322.getClass(), "_rootNames", null);
        setIntField(term10322, term10322.getClass(), "_mapperFeatures", 0);
        setField(term10322, term10322.getClass(), "_base", null);
        term10323 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term10323, term10323.getClass(), "_elementType", null);
        setField(term10323, term10323.getClass(), "_canonicalName", null);
        setField(term10323, term10323.getClass(), "_class", null);
        setIntField(term10323, term10323.getClass(), "_hash", 0);
        setField(term10323, term10323.getClass(), "_valueHandler", null);
        setField(term10323, term10323.getClass(), "_typeHandler", null);
        setBooleanField(term10323, term10323.getClass(), "_asStatic", false);
        term10312 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term10312, term10312.getClass(), "_elementType", null);
        setField(term10312, term10312.getClass(), "_canonicalName", null);
        setField(term10312, term10312.getClass(), "_class", null);
        setIntField(term10312, term10312.getClass(), "_hash", 0);
        setField(term10312, term10312.getClass(), "_valueHandler", null);
        setField(term10312, term10312.getClass(), "_typeHandler", null);
        setBooleanField(term10312, term10312.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term10164;
        args[1] = null;
        args[2] = term10278;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term10164, term10322));
        assertTrue(recursiveEquals(term10278, null));
        assertTrue(recursiveEquals(retValue, term10312));
    }

};


