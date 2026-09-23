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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30226;
     Object term30600;
     Object term30692;
     Object term31007;
     Object term31010;
     Object term31011;
     Object term30730;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30226 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term30326 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term30474 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term30226, term30226.getClass(), "_mapperFeatures", -1);
        setField(term30326, term30326.getClass(), "_annotationIntrospector", term30474);
        setField(term30226, term30226.getClass(), "_base", term30326);
        term30600 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        term30692 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30692, term30692.getClass(), "_keyType", null);
        term31007 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term31008 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term31009 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term31007, term31007.getClass(), "_serFeatures", 0);
        setField(term31007, term31007.getClass(), "_serializationInclusion", null);
        setField(term31007, term31007.getClass(), "_filterProvider", null);
        setField(term31007, term31007.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term31007, term31007.getClass(), "_generatorFeatures", 0);
        setIntField(term31007, term31007.getClass(), "_generatorFeaturesToChange", 0);
        setField(term31007, term31007.getClass(), "_mixIns", null);
        setField(term31007, term31007.getClass(), "_subtypeResolver", null);
        setField(term31007, term31007.getClass(), "_rootName", null);
        setField(term31007, term31007.getClass(), "_view", null);
        setField(term31007, term31007.getClass(), "_attributes", null);
        setField(term31007, term31007.getClass(), "_rootNames", null);
        setIntField(term31007, term31007.getClass(), "_mapperFeatures", -1);
        setField(term31008, term31008.getClass(), "_classIntrospector", null);
        setField(term31008, term31008.getClass(), "_annotationIntrospector", term31009);
        setField(term31008, term31008.getClass(), "_visibilityChecker", null);
        setField(term31008, term31008.getClass(), "_propertyNamingStrategy", null);
        setField(term31008, term31008.getClass(), "_typeFactory", null);
        setField(term31008, term31008.getClass(), "_typeResolverBuilder", null);
        setField(term31008, term31008.getClass(), "_dateFormat", null);
        setField(term31008, term31008.getClass(), "_handlerInstantiator", null);
        setField(term31008, term31008.getClass(), "_locale", null);
        setField(term31008, term31008.getClass(), "_timeZone", null);
        setField(term31008, term31008.getClass(), "_defaultBase64", null);
        setField(term31007, term31007.getClass(), "_base", term31008);
        term31010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term31010, term31010.getClass(), "_keyType", null);
        setField(term31010, term31010.getClass(), "_valueType", null);
        setField(term31010, term31010.getClass(), "_canonicalName", null);
        setField(term31010, term31010.getClass(), "_class", null);
        setIntField(term31010, term31010.getClass(), "_hash", 0);
        setField(term31010, term31010.getClass(), "_valueHandler", null);
        setField(term31010, term31010.getClass(), "_typeHandler", null);
        setBooleanField(term31010, term31010.getClass(), "_asStatic", false);
        term31011 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(term31011, term31011.getClass(), "_owner", null);
        setField(term31011, term31011.getClass(), "_type", null);
        setIntField(term31011, term31011.getClass(), "_index", 0);
        setField(term31011, term31011.getClass(), "_context", null);
        setField(term31011, term31011.getClass(), "_annotations", null);
        term30730 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term30730, term30730.getClass(), "_keyType", null);
        setField(term30730, term30730.getClass(), "_valueType", null);
        setField(term30730, term30730.getClass(), "_canonicalName", null);
        setField(term30730, term30730.getClass(), "_class", null);
        setIntField(term30730, term30730.getClass(), "_hash", 0);
        setField(term30730, term30730.getClass(), "_valueHandler", null);
        setField(term30730, term30730.getClass(), "_typeHandler", null);
        setBooleanField(term30730, term30730.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term30226;
        args[1] = term30600;
        args[2] = term30692;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term30226, term31007));
        assertTrue(recursiveEquals(term30600, term31010));
        assertTrue(recursiveEquals(term30692, term31011));
        assertTrue(recursiveEquals(retValue, term30730));
    }

};


