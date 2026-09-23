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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65141;
     Object term65509;
     Object term65787;
     Object term66119;
     Object term66122;
     Object term66123;
     Object term65825;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65141 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term65241 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term65389 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term65141, term65141.getClass(), "_mapperFeatures", -1);
        setField(term65241, term65241.getClass(), "_annotationIntrospector", term65389);
        setField(term65141, term65141.getClass(), "_base", term65241);
        HashMap term65673 = new HashMap();
        term65509 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term65625 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term65625, term65625.getClass(), "_annotations", term65673);
        setField(term65509, term65509.getClass(), "_annotations", term65625);
        term65787 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term66119 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term66120 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term66121 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setIntField(term66119, term66119.getClass(), "_serFeatures", 0);
        setField(term66119, term66119.getClass(), "_serializationInclusion", null);
        setField(term66119, term66119.getClass(), "_filterProvider", null);
        setField(term66119, term66119.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term66119, term66119.getClass(), "_generatorFeatures", 0);
        setIntField(term66119, term66119.getClass(), "_generatorFeaturesToChange", 0);
        setField(term66119, term66119.getClass(), "_mixIns", null);
        setField(term66119, term66119.getClass(), "_subtypeResolver", null);
        setField(term66119, term66119.getClass(), "_rootName", null);
        setField(term66119, term66119.getClass(), "_view", null);
        setField(term66119, term66119.getClass(), "_attributes", null);
        setField(term66119, term66119.getClass(), "_rootNames", null);
        setIntField(term66119, term66119.getClass(), "_mapperFeatures", -1);
        setField(term66120, term66120.getClass(), "_classIntrospector", null);
        setField(term66120, term66120.getClass(), "_annotationIntrospector", term66121);
        setField(term66120, term66120.getClass(), "_visibilityChecker", null);
        setField(term66120, term66120.getClass(), "_propertyNamingStrategy", null);
        setField(term66120, term66120.getClass(), "_typeFactory", null);
        setField(term66120, term66120.getClass(), "_typeResolverBuilder", null);
        setField(term66120, term66120.getClass(), "_dateFormat", null);
        setField(term66120, term66120.getClass(), "_handlerInstantiator", null);
        setField(term66120, term66120.getClass(), "_locale", null);
        setField(term66120, term66120.getClass(), "_timeZone", null);
        setField(term66120, term66120.getClass(), "_defaultBase64", null);
        setField(term66119, term66119.getClass(), "_base", term66120);
        term66122 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term66122, term66122.getClass(), "_elementType", null);
        setField(term66122, term66122.getClass(), "_canonicalName", null);
        setField(term66122, term66122.getClass(), "_class", null);
        setIntField(term66122, term66122.getClass(), "_hash", 0);
        setField(term66122, term66122.getClass(), "_valueHandler", null);
        setField(term66122, term66122.getClass(), "_typeHandler", null);
        setBooleanField(term66122, term66122.getClass(), "_asStatic", false);
        HashMap term66125 = new HashMap();
        term66123 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term66124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term66123, term66123.getClass(), "_method", null);
        setField(term66123, term66123.getClass(), "_paramClasses", null);
        setField(term66123, term66123.getClass(), "_serialization", null);
        setField(term66123, term66123.getClass(), "_paramAnnotations", null);
        setField(term66123, term66123.getClass(), "_context", null);
        setField(term66124, term66124.getClass(), "_annotations", term66125);
        setField(term66123, term66123.getClass(), "_annotations", term66124);
        term65825 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term65825, term65825.getClass(), "_elementType", null);
        setField(term65825, term65825.getClass(), "_canonicalName", null);
        setField(term65825, term65825.getClass(), "_class", null);
        setIntField(term65825, term65825.getClass(), "_hash", 0);
        setField(term65825, term65825.getClass(), "_valueHandler", null);
        setField(term65825, term65825.getClass(), "_typeHandler", null);
        setBooleanField(term65825, term65825.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term65141;
        args[1] = term65509;
        args[2] = term65787;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term65141, term66119));
        assertTrue(recursiveEquals(term65509, term66122));
        assertTrue(recursiveEquals(term65787, term66123));
        assertTrue(recursiveEquals(retValue, term65825));
    }

};


