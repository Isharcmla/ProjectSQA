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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43025;
     Object term43393;
     Object term43615;
     Object term43932;
     Object term43935;
     Object term43936;
     Object term43653;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43025 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term43125 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term43273 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term43025, term43025.getClass(), "_mapperFeatures", -1);
        setField(term43125, term43125.getClass(), "_annotationIntrospector", term43273);
        setField(term43025, term43025.getClass(), "_base", term43125);
        term43393 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term43509 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term43393, term43393.getClass(), "_annotations", term43509);
        term43615 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term43932 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term43933 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term43934 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term43932, term43932.getClass(), "_serFeatures", 0);
        setField(term43932, term43932.getClass(), "_serializationInclusion", null);
        setField(term43932, term43932.getClass(), "_filterProvider", null);
        setField(term43932, term43932.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term43932, term43932.getClass(), "_generatorFeatures", 0);
        setIntField(term43932, term43932.getClass(), "_generatorFeaturesToChange", 0);
        setField(term43932, term43932.getClass(), "_mixIns", null);
        setField(term43932, term43932.getClass(), "_subtypeResolver", null);
        setField(term43932, term43932.getClass(), "_rootName", null);
        setField(term43932, term43932.getClass(), "_view", null);
        setField(term43932, term43932.getClass(), "_attributes", null);
        setField(term43932, term43932.getClass(), "_rootNames", null);
        setIntField(term43932, term43932.getClass(), "_mapperFeatures", -1);
        setField(term43933, term43933.getClass(), "_classIntrospector", null);
        setField(term43933, term43933.getClass(), "_annotationIntrospector", term43934);
        setField(term43933, term43933.getClass(), "_visibilityChecker", null);
        setField(term43933, term43933.getClass(), "_propertyNamingStrategy", null);
        setField(term43933, term43933.getClass(), "_typeFactory", null);
        setField(term43933, term43933.getClass(), "_typeResolverBuilder", null);
        setField(term43933, term43933.getClass(), "_dateFormat", null);
        setField(term43933, term43933.getClass(), "_handlerInstantiator", null);
        setField(term43933, term43933.getClass(), "_locale", null);
        setField(term43933, term43933.getClass(), "_timeZone", null);
        setField(term43933, term43933.getClass(), "_defaultBase64", null);
        setField(term43932, term43932.getClass(), "_base", term43933);
        term43935 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term43935, term43935.getClass(), "_elementType", null);
        setField(term43935, term43935.getClass(), "_canonicalName", null);
        setField(term43935, term43935.getClass(), "_class", null);
        setIntField(term43935, term43935.getClass(), "_hash", 0);
        setField(term43935, term43935.getClass(), "_valueHandler", null);
        setField(term43935, term43935.getClass(), "_typeHandler", null);
        setBooleanField(term43935, term43935.getClass(), "_asStatic", false);
        term43936 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term43937 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term43936, term43936.getClass(), "_method", null);
        setField(term43936, term43936.getClass(), "_paramClasses", null);
        setField(term43936, term43936.getClass(), "_serialization", null);
        setField(term43936, term43936.getClass(), "_paramAnnotations", null);
        setField(term43936, term43936.getClass(), "_context", null);
        setField(term43937, term43937.getClass(), "_annotations", null);
        setField(term43936, term43936.getClass(), "_annotations", term43937);
        term43653 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term43653, term43653.getClass(), "_elementType", null);
        setField(term43653, term43653.getClass(), "_canonicalName", null);
        setField(term43653, term43653.getClass(), "_class", null);
        setIntField(term43653, term43653.getClass(), "_hash", 0);
        setField(term43653, term43653.getClass(), "_valueHandler", null);
        setField(term43653, term43653.getClass(), "_typeHandler", null);
        setBooleanField(term43653, term43653.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term43025;
        args[1] = term43393;
        args[2] = term43615;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term43025, term43932));
        assertTrue(recursiveEquals(term43393, term43935));
        assertTrue(recursiveEquals(term43615, term43936));
        assertTrue(recursiveEquals(retValue, term43653));
    }

};


