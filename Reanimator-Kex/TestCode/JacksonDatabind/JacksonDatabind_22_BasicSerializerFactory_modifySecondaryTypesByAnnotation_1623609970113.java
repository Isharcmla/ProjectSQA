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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35271;
     Object term35637;
     Object term35733;
     Object term36047;
     Object term36050;
     Object term36051;
     Object term35771;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35271 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term35371 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term35519 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term35271, term35271.getClass(), "_mapperFeatures", -1);
        setField(term35371, term35371.getClass(), "_annotationIntrospector", term35519);
        setField(term35271, term35271.getClass(), "_base", term35371);
        term35637 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        term35733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term36047 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term36048 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term36049 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term36047, term36047.getClass(), "_serFeatures", 0);
        setField(term36047, term36047.getClass(), "_serializationInclusion", null);
        setField(term36047, term36047.getClass(), "_filterProvider", null);
        setField(term36047, term36047.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term36047, term36047.getClass(), "_generatorFeatures", 0);
        setIntField(term36047, term36047.getClass(), "_generatorFeaturesToChange", 0);
        setField(term36047, term36047.getClass(), "_mixIns", null);
        setField(term36047, term36047.getClass(), "_subtypeResolver", null);
        setField(term36047, term36047.getClass(), "_rootName", null);
        setField(term36047, term36047.getClass(), "_view", null);
        setField(term36047, term36047.getClass(), "_attributes", null);
        setField(term36047, term36047.getClass(), "_rootNames", null);
        setIntField(term36047, term36047.getClass(), "_mapperFeatures", -1);
        setField(term36048, term36048.getClass(), "_classIntrospector", null);
        setField(term36048, term36048.getClass(), "_annotationIntrospector", term36049);
        setField(term36048, term36048.getClass(), "_visibilityChecker", null);
        setField(term36048, term36048.getClass(), "_propertyNamingStrategy", null);
        setField(term36048, term36048.getClass(), "_typeFactory", null);
        setField(term36048, term36048.getClass(), "_typeResolverBuilder", null);
        setField(term36048, term36048.getClass(), "_dateFormat", null);
        setField(term36048, term36048.getClass(), "_handlerInstantiator", null);
        setField(term36048, term36048.getClass(), "_locale", null);
        setField(term36048, term36048.getClass(), "_timeZone", null);
        setField(term36048, term36048.getClass(), "_defaultBase64", null);
        setField(term36047, term36047.getClass(), "_base", term36048);
        term36050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term36050, term36050.getClass(), "_componentType", null);
        setField(term36050, term36050.getClass(), "_emptyArray", null);
        setField(term36050, term36050.getClass(), "_canonicalName", null);
        setField(term36050, term36050.getClass(), "_class", null);
        setIntField(term36050, term36050.getClass(), "_hash", 0);
        setField(term36050, term36050.getClass(), "_valueHandler", null);
        setField(term36050, term36050.getClass(), "_typeHandler", null);
        setBooleanField(term36050, term36050.getClass(), "_asStatic", false);
        term36051 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term36051, term36051.getClass(), "_field", null);
        setField(term36051, term36051.getClass(), "_serialization", null);
        setField(term36051, term36051.getClass(), "_context", null);
        setField(term36051, term36051.getClass(), "_annotations", null);
        term35771 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term35771, term35771.getClass(), "_componentType", null);
        setField(term35771, term35771.getClass(), "_emptyArray", null);
        setField(term35771, term35771.getClass(), "_canonicalName", null);
        setField(term35771, term35771.getClass(), "_class", null);
        setIntField(term35771, term35771.getClass(), "_hash", 0);
        setField(term35771, term35771.getClass(), "_valueHandler", null);
        setField(term35771, term35771.getClass(), "_typeHandler", null);
        setBooleanField(term35771, term35771.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term35271;
        args[1] = term35637;
        args[2] = term35733;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term35271, term36047));
        assertTrue(recursiveEquals(term35637, term36050));
        assertTrue(recursiveEquals(term35733, term36051));
        assertTrue(recursiveEquals(retValue, term35771));
    }

};


