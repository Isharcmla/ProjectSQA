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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37444;
     Object term37810;
     Object term37902;
     Object term38224;
     Object term38227;
     Object term38228;
     Object term37940;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37444 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term37544 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term37692 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term37444, term37444.getClass(), "_mapperFeatures", -1);
        setField(term37544, term37544.getClass(), "_annotationIntrospector", term37692);
        setField(term37444, term37444.getClass(), "_base", term37544);
        term37810 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        term37902 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term37902, term37902.getClass(), "_keyType", null);
        term38224 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term38225 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term38226 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term38224, term38224.getClass(), "_serFeatures", 0);
        setField(term38224, term38224.getClass(), "_serializationInclusion", null);
        setField(term38224, term38224.getClass(), "_filterProvider", null);
        setField(term38224, term38224.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term38224, term38224.getClass(), "_generatorFeatures", 0);
        setIntField(term38224, term38224.getClass(), "_generatorFeaturesToChange", 0);
        setField(term38224, term38224.getClass(), "_mixIns", null);
        setField(term38224, term38224.getClass(), "_subtypeResolver", null);
        setField(term38224, term38224.getClass(), "_rootName", null);
        setField(term38224, term38224.getClass(), "_view", null);
        setField(term38224, term38224.getClass(), "_attributes", null);
        setField(term38224, term38224.getClass(), "_rootNames", null);
        setIntField(term38224, term38224.getClass(), "_mapperFeatures", -1);
        setField(term38225, term38225.getClass(), "_classIntrospector", null);
        setField(term38225, term38225.getClass(), "_annotationIntrospector", term38226);
        setField(term38225, term38225.getClass(), "_visibilityChecker", null);
        setField(term38225, term38225.getClass(), "_propertyNamingStrategy", null);
        setField(term38225, term38225.getClass(), "_typeFactory", null);
        setField(term38225, term38225.getClass(), "_typeResolverBuilder", null);
        setField(term38225, term38225.getClass(), "_dateFormat", null);
        setField(term38225, term38225.getClass(), "_handlerInstantiator", null);
        setField(term38225, term38225.getClass(), "_locale", null);
        setField(term38225, term38225.getClass(), "_timeZone", null);
        setField(term38225, term38225.getClass(), "_defaultBase64", null);
        setField(term38224, term38224.getClass(), "_base", term38225);
        term38227 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term38227, term38227.getClass(), "_keyType", null);
        setField(term38227, term38227.getClass(), "_valueType", null);
        setField(term38227, term38227.getClass(), "_canonicalName", null);
        setField(term38227, term38227.getClass(), "_class", null);
        setIntField(term38227, term38227.getClass(), "_hash", 0);
        setField(term38227, term38227.getClass(), "_valueHandler", null);
        setField(term38227, term38227.getClass(), "_typeHandler", null);
        setBooleanField(term38227, term38227.getClass(), "_asStatic", false);
        term38228 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term38229 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term38228, term38228.getClass(), "_class", null);
        setField(term38228, term38228.getClass(), "_superTypes", null);
        setField(term38228, term38228.getClass(), "_annotationIntrospector", null);
        setField(term38228, term38228.getClass(), "_mixInResolver", null);
        setField(term38228, term38228.getClass(), "_primaryMixIn", null);
        setField(term38229, term38229.getClass(), "_annotations", null);
        setField(term38228, term38228.getClass(), "_classAnnotations", term38229);
        setBooleanField(term38228, term38228.getClass(), "_creatorsResolved", false);
        setField(term38228, term38228.getClass(), "_defaultConstructor", null);
        setField(term38228, term38228.getClass(), "_constructors", null);
        setField(term38228, term38228.getClass(), "_creatorMethods", null);
        setField(term38228, term38228.getClass(), "_memberMethods", null);
        setField(term38228, term38228.getClass(), "_fields", null);
        term37940 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term37940, term37940.getClass(), "_keyType", null);
        setField(term37940, term37940.getClass(), "_valueType", null);
        setField(term37940, term37940.getClass(), "_canonicalName", null);
        setField(term37940, term37940.getClass(), "_class", null);
        setIntField(term37940, term37940.getClass(), "_hash", 0);
        setField(term37940, term37940.getClass(), "_valueHandler", null);
        setField(term37940, term37940.getClass(), "_typeHandler", null);
        setBooleanField(term37940, term37940.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term37444;
        args[1] = term37810;
        args[2] = term37902;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term37444, term38224));
        assertTrue(recursiveEquals(term37810, term38227));
        assertTrue(recursiveEquals(term37902, term38228));
        assertTrue(recursiveEquals(retValue, term37940));
    }

};


