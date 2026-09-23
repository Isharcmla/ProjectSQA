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
import java.util.HashMap;

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47294;
     Object term47660;
     Object term47916;
     Object term48251;
     Object term48254;
     Object term48255;
     Object term47954;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47294 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term47394 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term47542 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term47294, term47294.getClass(), "_mapperFeatures", -1);
        setField(term47394, term47394.getClass(), "_annotationIntrospector", term47542);
        setField(term47294, term47294.getClass(), "_base", term47394);
        HashMap term47824 = new HashMap();
        term47660 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term47776 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term47776, term47776.getClass(), "_annotations", term47824);
        setField(term47660, term47660.getClass(), "_classAnnotations", term47776);
        term47916 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term47916, term47916.getClass(), "_keyType", null);
        term48251 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term48252 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term48253 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term48251, term48251.getClass(), "_serFeatures", 0);
        setField(term48251, term48251.getClass(), "_serializationInclusion", null);
        setField(term48251, term48251.getClass(), "_filterProvider", null);
        setField(term48251, term48251.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term48251, term48251.getClass(), "_generatorFeatures", 0);
        setIntField(term48251, term48251.getClass(), "_generatorFeaturesToChange", 0);
        setField(term48251, term48251.getClass(), "_mixIns", null);
        setField(term48251, term48251.getClass(), "_subtypeResolver", null);
        setField(term48251, term48251.getClass(), "_rootName", null);
        setField(term48251, term48251.getClass(), "_view", null);
        setField(term48251, term48251.getClass(), "_attributes", null);
        setField(term48251, term48251.getClass(), "_rootNames", null);
        setIntField(term48251, term48251.getClass(), "_mapperFeatures", -1);
        setField(term48252, term48252.getClass(), "_classIntrospector", null);
        setField(term48252, term48252.getClass(), "_annotationIntrospector", term48253);
        setField(term48252, term48252.getClass(), "_visibilityChecker", null);
        setField(term48252, term48252.getClass(), "_propertyNamingStrategy", null);
        setField(term48252, term48252.getClass(), "_typeFactory", null);
        setField(term48252, term48252.getClass(), "_typeResolverBuilder", null);
        setField(term48252, term48252.getClass(), "_dateFormat", null);
        setField(term48252, term48252.getClass(), "_handlerInstantiator", null);
        setField(term48252, term48252.getClass(), "_locale", null);
        setField(term48252, term48252.getClass(), "_timeZone", null);
        setField(term48252, term48252.getClass(), "_defaultBase64", null);
        setField(term48251, term48251.getClass(), "_base", term48252);
        term48254 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term48254, term48254.getClass(), "_keyType", null);
        setField(term48254, term48254.getClass(), "_valueType", null);
        setField(term48254, term48254.getClass(), "_canonicalName", null);
        setField(term48254, term48254.getClass(), "_class", null);
        setIntField(term48254, term48254.getClass(), "_hash", 0);
        setField(term48254, term48254.getClass(), "_valueHandler", null);
        setField(term48254, term48254.getClass(), "_typeHandler", null);
        setBooleanField(term48254, term48254.getClass(), "_asStatic", false);
        HashMap term48257 = new HashMap();
        term48255 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term48256 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term48255, term48255.getClass(), "_class", null);
        setField(term48255, term48255.getClass(), "_superTypes", null);
        setField(term48255, term48255.getClass(), "_annotationIntrospector", null);
        setField(term48255, term48255.getClass(), "_mixInResolver", null);
        setField(term48255, term48255.getClass(), "_primaryMixIn", null);
        setField(term48256, term48256.getClass(), "_annotations", term48257);
        setField(term48255, term48255.getClass(), "_classAnnotations", term48256);
        setBooleanField(term48255, term48255.getClass(), "_creatorsResolved", false);
        setField(term48255, term48255.getClass(), "_defaultConstructor", null);
        setField(term48255, term48255.getClass(), "_constructors", null);
        setField(term48255, term48255.getClass(), "_creatorMethods", null);
        setField(term48255, term48255.getClass(), "_memberMethods", null);
        setField(term48255, term48255.getClass(), "_fields", null);
        term47954 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term47954, term47954.getClass(), "_keyType", null);
        setField(term47954, term47954.getClass(), "_valueType", null);
        setField(term47954, term47954.getClass(), "_canonicalName", null);
        setField(term47954, term47954.getClass(), "_class", null);
        setIntField(term47954, term47954.getClass(), "_hash", 0);
        setField(term47954, term47954.getClass(), "_valueHandler", null);
        setField(term47954, term47954.getClass(), "_typeHandler", null);
        setBooleanField(term47954, term47954.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term47294;
        args[1] = term47660;
        args[2] = term47916;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term47294, term48251));
        assertTrue(recursiveEquals(term47660, term48254));
        assertTrue(recursiveEquals(term47916, term48255));
        assertTrue(recursiveEquals(retValue, term47954));
    }

};


