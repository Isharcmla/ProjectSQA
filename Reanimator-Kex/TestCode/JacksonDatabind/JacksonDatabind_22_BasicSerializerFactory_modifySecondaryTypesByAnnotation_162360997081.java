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
import java.lang.Object;

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13712;
     Object term13910;
     Object term13948;
     Object term13950;
     Object term13944;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13712 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term13812 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term13712, term13712.getClass(), "_mapperFeatures", -1);
        setField(term13812, term13812.getClass(), "_annotationIntrospector", null);
        setField(term13712, term13712.getClass(), "_base", term13812);
        term13910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term13948 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term13949 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term13948, term13948.getClass(), "_serFeatures", 0);
        setField(term13948, term13948.getClass(), "_serializationInclusion", null);
        setField(term13948, term13948.getClass(), "_filterProvider", null);
        setField(term13948, term13948.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term13948, term13948.getClass(), "_generatorFeatures", 0);
        setIntField(term13948, term13948.getClass(), "_generatorFeaturesToChange", 0);
        setField(term13948, term13948.getClass(), "_mixIns", null);
        setField(term13948, term13948.getClass(), "_subtypeResolver", null);
        setField(term13948, term13948.getClass(), "_rootName", null);
        setField(term13948, term13948.getClass(), "_view", null);
        setField(term13948, term13948.getClass(), "_attributes", null);
        setField(term13948, term13948.getClass(), "_rootNames", null);
        setIntField(term13948, term13948.getClass(), "_mapperFeatures", -1);
        setField(term13949, term13949.getClass(), "_classIntrospector", null);
        setField(term13949, term13949.getClass(), "_annotationIntrospector", null);
        setField(term13949, term13949.getClass(), "_visibilityChecker", null);
        setField(term13949, term13949.getClass(), "_propertyNamingStrategy", null);
        setField(term13949, term13949.getClass(), "_typeFactory", null);
        setField(term13949, term13949.getClass(), "_typeResolverBuilder", null);
        setField(term13949, term13949.getClass(), "_dateFormat", null);
        setField(term13949, term13949.getClass(), "_handlerInstantiator", null);
        setField(term13949, term13949.getClass(), "_locale", null);
        setField(term13949, term13949.getClass(), "_timeZone", null);
        setField(term13949, term13949.getClass(), "_defaultBase64", null);
        setField(term13948, term13948.getClass(), "_base", term13949);
        term13950 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term13950, term13950.getClass(), "_typeParametersFor", null);
        setField(term13950, term13950.getClass(), "_typeParameters", null);
        setField(term13950, term13950.getClass(), "_typeNames", null);
        setField(term13950, term13950.getClass(), "_canonicalName", null);
        setField(term13950, term13950.getClass(), "_class", null);
        setIntField(term13950, term13950.getClass(), "_hash", 0);
        setField(term13950, term13950.getClass(), "_valueHandler", null);
        setField(term13950, term13950.getClass(), "_typeHandler", null);
        setBooleanField(term13950, term13950.getClass(), "_asStatic", false);
        term13944 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term13944, term13944.getClass(), "_typeParametersFor", null);
        setField(term13944, term13944.getClass(), "_typeParameters", null);
        setField(term13944, term13944.getClass(), "_typeNames", null);
        setField(term13944, term13944.getClass(), "_canonicalName", null);
        setField(term13944, term13944.getClass(), "_class", null);
        setIntField(term13944, term13944.getClass(), "_hash", 0);
        setField(term13944, term13944.getClass(), "_valueHandler", null);
        setField(term13944, term13944.getClass(), "_typeHandler", null);
        setBooleanField(term13944, term13944.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term13712;
        args[1] = null;
        args[2] = term13910;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term13712, term13948));
        assertTrue(recursiveEquals(term13910, null));
        assertTrue(recursiveEquals(retValue, term13944));
    }

};


