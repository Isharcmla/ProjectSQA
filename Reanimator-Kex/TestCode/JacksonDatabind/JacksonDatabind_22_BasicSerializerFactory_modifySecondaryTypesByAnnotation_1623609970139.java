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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62986;
     Object term63364;
     Object term63586;
     Object term63903;
     Object term63906;
     Object term63907;
     Object term63624;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62986 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term63086 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term63234 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term62986, term62986.getClass(), "_mapperFeatures", -1);
        setField(term63086, term63086.getClass(), "_annotationIntrospector", term63234);
        setField(term62986, term62986.getClass(), "_base", term63086);
        term63364 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term63480 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term63364, term63364.getClass(), "_annotations", term63480);
        term63586 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term63903 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term63904 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term63905 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term63903, term63903.getClass(), "_serFeatures", 0);
        setField(term63903, term63903.getClass(), "_serializationInclusion", null);
        setField(term63903, term63903.getClass(), "_filterProvider", null);
        setField(term63903, term63903.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term63903, term63903.getClass(), "_generatorFeatures", 0);
        setIntField(term63903, term63903.getClass(), "_generatorFeaturesToChange", 0);
        setField(term63903, term63903.getClass(), "_mixIns", null);
        setField(term63903, term63903.getClass(), "_subtypeResolver", null);
        setField(term63903, term63903.getClass(), "_rootName", null);
        setField(term63903, term63903.getClass(), "_view", null);
        setField(term63903, term63903.getClass(), "_attributes", null);
        setField(term63903, term63903.getClass(), "_rootNames", null);
        setIntField(term63903, term63903.getClass(), "_mapperFeatures", -1);
        setField(term63904, term63904.getClass(), "_classIntrospector", null);
        setField(term63904, term63904.getClass(), "_annotationIntrospector", term63905);
        setField(term63904, term63904.getClass(), "_visibilityChecker", null);
        setField(term63904, term63904.getClass(), "_propertyNamingStrategy", null);
        setField(term63904, term63904.getClass(), "_typeFactory", null);
        setField(term63904, term63904.getClass(), "_typeResolverBuilder", null);
        setField(term63904, term63904.getClass(), "_dateFormat", null);
        setField(term63904, term63904.getClass(), "_handlerInstantiator", null);
        setField(term63904, term63904.getClass(), "_locale", null);
        setField(term63904, term63904.getClass(), "_timeZone", null);
        setField(term63904, term63904.getClass(), "_defaultBase64", null);
        setField(term63903, term63903.getClass(), "_base", term63904);
        term63906 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term63906, term63906.getClass(), "_elementType", null);
        setField(term63906, term63906.getClass(), "_canonicalName", null);
        setField(term63906, term63906.getClass(), "_class", null);
        setIntField(term63906, term63906.getClass(), "_hash", 0);
        setField(term63906, term63906.getClass(), "_valueHandler", null);
        setField(term63906, term63906.getClass(), "_typeHandler", null);
        setBooleanField(term63906, term63906.getClass(), "_asStatic", false);
        term63907 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        Object term63908 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term63907, term63907.getClass(), "_constructor", null);
        setField(term63907, term63907.getClass(), "_serialization", null);
        setField(term63907, term63907.getClass(), "_paramAnnotations", null);
        setField(term63907, term63907.getClass(), "_context", null);
        setField(term63908, term63908.getClass(), "_annotations", null);
        setField(term63907, term63907.getClass(), "_annotations", term63908);
        term63624 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term63624, term63624.getClass(), "_elementType", null);
        setField(term63624, term63624.getClass(), "_canonicalName", null);
        setField(term63624, term63624.getClass(), "_class", null);
        setIntField(term63624, term63624.getClass(), "_hash", 0);
        setField(term63624, term63624.getClass(), "_valueHandler", null);
        setField(term63624, term63624.getClass(), "_typeHandler", null);
        setBooleanField(term63624, term63624.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term62986;
        args[1] = term63364;
        args[2] = term63586;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term62986, term63903));
        assertTrue(recursiveEquals(term63364, term63906));
        assertTrue(recursiveEquals(term63586, term63907));
        assertTrue(recursiveEquals(retValue, term63624));
    }

};


