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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29248;
     Object term29346;
     Object term29384;
     Object term29385;
     Object term29380;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29248 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term29248, term29248.getClass(), "_mapperFeatures", 0);
        term29346 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term29384 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term29384, term29384.getClass(), "_serFeatures", 0);
        setField(term29384, term29384.getClass(), "_serializationInclusion", null);
        setField(term29384, term29384.getClass(), "_filterProvider", null);
        setField(term29384, term29384.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term29384, term29384.getClass(), "_generatorFeatures", 0);
        setIntField(term29384, term29384.getClass(), "_generatorFeaturesToChange", 0);
        setField(term29384, term29384.getClass(), "_mixIns", null);
        setField(term29384, term29384.getClass(), "_subtypeResolver", null);
        setField(term29384, term29384.getClass(), "_rootName", null);
        setField(term29384, term29384.getClass(), "_view", null);
        setField(term29384, term29384.getClass(), "_attributes", null);
        setField(term29384, term29384.getClass(), "_rootNames", null);
        setIntField(term29384, term29384.getClass(), "_mapperFeatures", 0);
        setField(term29384, term29384.getClass(), "_base", null);
        term29385 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term29385, term29385.getClass(), "_typeParametersFor", null);
        setField(term29385, term29385.getClass(), "_typeParameters", null);
        setField(term29385, term29385.getClass(), "_typeNames", null);
        setField(term29385, term29385.getClass(), "_canonicalName", null);
        setField(term29385, term29385.getClass(), "_class", null);
        setIntField(term29385, term29385.getClass(), "_hash", 0);
        setField(term29385, term29385.getClass(), "_valueHandler", null);
        setField(term29385, term29385.getClass(), "_typeHandler", null);
        setBooleanField(term29385, term29385.getClass(), "_asStatic", false);
        term29380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term29380, term29380.getClass(), "_typeParametersFor", null);
        setField(term29380, term29380.getClass(), "_typeParameters", null);
        setField(term29380, term29380.getClass(), "_typeNames", null);
        setField(term29380, term29380.getClass(), "_canonicalName", null);
        setField(term29380, term29380.getClass(), "_class", null);
        setIntField(term29380, term29380.getClass(), "_hash", 0);
        setField(term29380, term29380.getClass(), "_valueHandler", null);
        setField(term29380, term29380.getClass(), "_typeHandler", null);
        setBooleanField(term29380, term29380.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term29248;
        args[1] = null;
        args[2] = term29346;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term29248, term29384));
        assertTrue(recursiveEquals(term29346, null));
        assertTrue(recursiveEquals(retValue, term29380));
    }

};


