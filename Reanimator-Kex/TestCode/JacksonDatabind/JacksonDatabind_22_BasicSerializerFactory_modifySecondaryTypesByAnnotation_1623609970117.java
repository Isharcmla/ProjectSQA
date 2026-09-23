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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39284;
     Object term39650;
     Object term39858;
     Object term40178;
     Object term40181;
     Object term40182;
     Object term39896;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39284 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term39384 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term39532 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term39284, term39284.getClass(), "_mapperFeatures", -1);
        setField(term39384, term39384.getClass(), "_annotationIntrospector", term39532);
        setField(term39284, term39284.getClass(), "_base", term39384);
        term39650 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term39766 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term39650, term39650.getClass(), "_classAnnotations", term39766);
        term39858 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term39858, term39858.getClass(), "_keyType", null);
        term40178 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term40179 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term40180 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term40178, term40178.getClass(), "_serFeatures", 0);
        setField(term40178, term40178.getClass(), "_serializationInclusion", null);
        setField(term40178, term40178.getClass(), "_filterProvider", null);
        setField(term40178, term40178.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term40178, term40178.getClass(), "_generatorFeatures", 0);
        setIntField(term40178, term40178.getClass(), "_generatorFeaturesToChange", 0);
        setField(term40178, term40178.getClass(), "_mixIns", null);
        setField(term40178, term40178.getClass(), "_subtypeResolver", null);
        setField(term40178, term40178.getClass(), "_rootName", null);
        setField(term40178, term40178.getClass(), "_view", null);
        setField(term40178, term40178.getClass(), "_attributes", null);
        setField(term40178, term40178.getClass(), "_rootNames", null);
        setIntField(term40178, term40178.getClass(), "_mapperFeatures", -1);
        setField(term40179, term40179.getClass(), "_classIntrospector", null);
        setField(term40179, term40179.getClass(), "_annotationIntrospector", term40180);
        setField(term40179, term40179.getClass(), "_visibilityChecker", null);
        setField(term40179, term40179.getClass(), "_propertyNamingStrategy", null);
        setField(term40179, term40179.getClass(), "_typeFactory", null);
        setField(term40179, term40179.getClass(), "_typeResolverBuilder", null);
        setField(term40179, term40179.getClass(), "_dateFormat", null);
        setField(term40179, term40179.getClass(), "_handlerInstantiator", null);
        setField(term40179, term40179.getClass(), "_locale", null);
        setField(term40179, term40179.getClass(), "_timeZone", null);
        setField(term40179, term40179.getClass(), "_defaultBase64", null);
        setField(term40178, term40178.getClass(), "_base", term40179);
        term40181 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term40181, term40181.getClass(), "_keyType", null);
        setField(term40181, term40181.getClass(), "_valueType", null);
        setField(term40181, term40181.getClass(), "_canonicalName", null);
        setField(term40181, term40181.getClass(), "_class", null);
        setIntField(term40181, term40181.getClass(), "_hash", 0);
        setField(term40181, term40181.getClass(), "_valueHandler", null);
        setField(term40181, term40181.getClass(), "_typeHandler", null);
        setBooleanField(term40181, term40181.getClass(), "_asStatic", false);
        term40182 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term40183 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term40182, term40182.getClass(), "_class", null);
        setField(term40182, term40182.getClass(), "_superTypes", null);
        setField(term40182, term40182.getClass(), "_annotationIntrospector", null);
        setField(term40182, term40182.getClass(), "_mixInResolver", null);
        setField(term40182, term40182.getClass(), "_primaryMixIn", null);
        setField(term40183, term40183.getClass(), "_annotations", null);
        setField(term40182, term40182.getClass(), "_classAnnotations", term40183);
        setBooleanField(term40182, term40182.getClass(), "_creatorsResolved", false);
        setField(term40182, term40182.getClass(), "_defaultConstructor", null);
        setField(term40182, term40182.getClass(), "_constructors", null);
        setField(term40182, term40182.getClass(), "_creatorMethods", null);
        setField(term40182, term40182.getClass(), "_memberMethods", null);
        setField(term40182, term40182.getClass(), "_fields", null);
        term39896 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term39896, term39896.getClass(), "_keyType", null);
        setField(term39896, term39896.getClass(), "_valueType", null);
        setField(term39896, term39896.getClass(), "_canonicalName", null);
        setField(term39896, term39896.getClass(), "_class", null);
        setIntField(term39896, term39896.getClass(), "_hash", 0);
        setField(term39896, term39896.getClass(), "_valueHandler", null);
        setField(term39896, term39896.getClass(), "_typeHandler", null);
        setBooleanField(term39896, term39896.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term39284;
        args[1] = term39650;
        args[2] = term39858;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term39284, term40178));
        assertTrue(recursiveEquals(term39650, term40181));
        assertTrue(recursiveEquals(term39858, term40182));
        assertTrue(recursiveEquals(retValue, term39896));
    }

};


