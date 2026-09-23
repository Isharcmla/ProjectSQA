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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49412;
     Object term49780;
     Object term50010;
     Object term50327;
     Object term50330;
     Object term50331;
     Object term50048;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49412 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term49512 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term49660 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term49412, term49412.getClass(), "_mapperFeatures", -1);
        setField(term49512, term49512.getClass(), "_annotationIntrospector", term49660);
        setField(term49412, term49412.getClass(), "_base", term49512);
        term49780 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term49896 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term49780, term49780.getClass(), "_annotations", term49896);
        term50010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term50327 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term50328 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term50329 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term50327, term50327.getClass(), "_serFeatures", 0);
        setField(term50327, term50327.getClass(), "_serializationInclusion", null);
        setField(term50327, term50327.getClass(), "_filterProvider", null);
        setField(term50327, term50327.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term50327, term50327.getClass(), "_generatorFeatures", 0);
        setIntField(term50327, term50327.getClass(), "_generatorFeaturesToChange", 0);
        setField(term50327, term50327.getClass(), "_mixIns", null);
        setField(term50327, term50327.getClass(), "_subtypeResolver", null);
        setField(term50327, term50327.getClass(), "_rootName", null);
        setField(term50327, term50327.getClass(), "_view", null);
        setField(term50327, term50327.getClass(), "_attributes", null);
        setField(term50327, term50327.getClass(), "_rootNames", null);
        setIntField(term50327, term50327.getClass(), "_mapperFeatures", -1);
        setField(term50328, term50328.getClass(), "_classIntrospector", null);
        setField(term50328, term50328.getClass(), "_annotationIntrospector", term50329);
        setField(term50328, term50328.getClass(), "_visibilityChecker", null);
        setField(term50328, term50328.getClass(), "_propertyNamingStrategy", null);
        setField(term50328, term50328.getClass(), "_typeFactory", null);
        setField(term50328, term50328.getClass(), "_typeResolverBuilder", null);
        setField(term50328, term50328.getClass(), "_dateFormat", null);
        setField(term50328, term50328.getClass(), "_handlerInstantiator", null);
        setField(term50328, term50328.getClass(), "_locale", null);
        setField(term50328, term50328.getClass(), "_timeZone", null);
        setField(term50328, term50328.getClass(), "_defaultBase64", null);
        setField(term50327, term50327.getClass(), "_base", term50328);
        term50330 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term50330, term50330.getClass(), "_elementType", null);
        setField(term50330, term50330.getClass(), "_canonicalName", null);
        setField(term50330, term50330.getClass(), "_class", null);
        setIntField(term50330, term50330.getClass(), "_hash", 0);
        setField(term50330, term50330.getClass(), "_valueHandler", null);
        setField(term50330, term50330.getClass(), "_typeHandler", null);
        setBooleanField(term50330, term50330.getClass(), "_asStatic", false);
        term50331 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term50332 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term50331, term50331.getClass(), "_method", null);
        setField(term50331, term50331.getClass(), "_paramClasses", null);
        setField(term50331, term50331.getClass(), "_serialization", null);
        setField(term50331, term50331.getClass(), "_paramAnnotations", null);
        setField(term50331, term50331.getClass(), "_context", null);
        setField(term50332, term50332.getClass(), "_annotations", null);
        setField(term50331, term50331.getClass(), "_annotations", term50332);
        term50048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term50048, term50048.getClass(), "_elementType", null);
        setField(term50048, term50048.getClass(), "_canonicalName", null);
        setField(term50048, term50048.getClass(), "_class", null);
        setIntField(term50048, term50048.getClass(), "_hash", 0);
        setField(term50048, term50048.getClass(), "_valueHandler", null);
        setField(term50048, term50048.getClass(), "_typeHandler", null);
        setBooleanField(term50048, term50048.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term49412;
        args[1] = term49780;
        args[2] = term50010;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term49412, term50327));
        assertTrue(recursiveEquals(term49780, term50330));
        assertTrue(recursiveEquals(term50010, term50331));
        assertTrue(recursiveEquals(retValue, term50048));
    }

};


