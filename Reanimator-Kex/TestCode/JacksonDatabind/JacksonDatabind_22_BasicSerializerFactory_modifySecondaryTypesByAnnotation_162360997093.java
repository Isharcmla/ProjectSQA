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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20929;
     Object term21269;
     Object term21317;
     Object term21320;
     Object term21307;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20929 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term21029 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term21173 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setIntField(term20929, term20929.getClass(), "_mapperFeatures", -1);
        setField(term21029, term21029.getClass(), "_annotationIntrospector", term21173);
        setField(term20929, term20929.getClass(), "_base", term21029);
        term21269 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term21317 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term21318 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term21319 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setIntField(term21317, term21317.getClass(), "_serFeatures", 0);
        setField(term21317, term21317.getClass(), "_serializationInclusion", null);
        setField(term21317, term21317.getClass(), "_filterProvider", null);
        setField(term21317, term21317.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term21317, term21317.getClass(), "_generatorFeatures", 0);
        setIntField(term21317, term21317.getClass(), "_generatorFeaturesToChange", 0);
        setField(term21317, term21317.getClass(), "_mixIns", null);
        setField(term21317, term21317.getClass(), "_subtypeResolver", null);
        setField(term21317, term21317.getClass(), "_rootName", null);
        setField(term21317, term21317.getClass(), "_view", null);
        setField(term21317, term21317.getClass(), "_attributes", null);
        setField(term21317, term21317.getClass(), "_rootNames", null);
        setIntField(term21317, term21317.getClass(), "_mapperFeatures", -1);
        setField(term21318, term21318.getClass(), "_classIntrospector", null);
        setField(term21318, term21318.getClass(), "_annotationIntrospector", term21319);
        setField(term21318, term21318.getClass(), "_visibilityChecker", null);
        setField(term21318, term21318.getClass(), "_propertyNamingStrategy", null);
        setField(term21318, term21318.getClass(), "_typeFactory", null);
        setField(term21318, term21318.getClass(), "_typeResolverBuilder", null);
        setField(term21318, term21318.getClass(), "_dateFormat", null);
        setField(term21318, term21318.getClass(), "_handlerInstantiator", null);
        setField(term21318, term21318.getClass(), "_locale", null);
        setField(term21318, term21318.getClass(), "_timeZone", null);
        setField(term21318, term21318.getClass(), "_defaultBase64", null);
        setField(term21317, term21317.getClass(), "_base", term21318);
        term21320 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term21320, term21320.getClass(), "_componentType", null);
        setField(term21320, term21320.getClass(), "_emptyArray", null);
        setField(term21320, term21320.getClass(), "_canonicalName", null);
        setField(term21320, term21320.getClass(), "_class", null);
        setIntField(term21320, term21320.getClass(), "_hash", 0);
        setField(term21320, term21320.getClass(), "_valueHandler", null);
        setField(term21320, term21320.getClass(), "_typeHandler", null);
        setBooleanField(term21320, term21320.getClass(), "_asStatic", false);
        term21307 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term21307, term21307.getClass(), "_componentType", null);
        setField(term21307, term21307.getClass(), "_emptyArray", null);
        setField(term21307, term21307.getClass(), "_canonicalName", null);
        setField(term21307, term21307.getClass(), "_class", null);
        setIntField(term21307, term21307.getClass(), "_hash", 0);
        setField(term21307, term21307.getClass(), "_valueHandler", null);
        setField(term21307, term21307.getClass(), "_typeHandler", null);
        setBooleanField(term21307, term21307.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term20929;
        args[1] = null;
        args[2] = term21269;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term20929, term21317));
        assertTrue(recursiveEquals(term21269, null));
        assertTrue(recursiveEquals(retValue, term21307));
    }

};


