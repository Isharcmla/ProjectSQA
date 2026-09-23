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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26578;
     Object term26782;
     Object term26820;
     Object term26822;
     Object term26816;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_1623609970101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26578 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term26678 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term26578, term26578.getClass(), "_mapperFeatures", -1);
        setField(term26678, term26678.getClass(), "_annotationIntrospector", null);
        setField(term26578, term26578.getClass(), "_base", term26678);
        term26782 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term26820 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term26821 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setIntField(term26820, term26820.getClass(), "_serFeatures", 0);
        setField(term26820, term26820.getClass(), "_serializationInclusion", null);
        setField(term26820, term26820.getClass(), "_filterProvider", null);
        setField(term26820, term26820.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term26820, term26820.getClass(), "_generatorFeatures", 0);
        setIntField(term26820, term26820.getClass(), "_generatorFeaturesToChange", 0);
        setField(term26820, term26820.getClass(), "_mixIns", null);
        setField(term26820, term26820.getClass(), "_subtypeResolver", null);
        setField(term26820, term26820.getClass(), "_rootName", null);
        setField(term26820, term26820.getClass(), "_view", null);
        setField(term26820, term26820.getClass(), "_attributes", null);
        setField(term26820, term26820.getClass(), "_rootNames", null);
        setIntField(term26820, term26820.getClass(), "_mapperFeatures", -1);
        setField(term26821, term26821.getClass(), "_classIntrospector", null);
        setField(term26821, term26821.getClass(), "_annotationIntrospector", null);
        setField(term26821, term26821.getClass(), "_visibilityChecker", null);
        setField(term26821, term26821.getClass(), "_propertyNamingStrategy", null);
        setField(term26821, term26821.getClass(), "_typeFactory", null);
        setField(term26821, term26821.getClass(), "_typeResolverBuilder", null);
        setField(term26821, term26821.getClass(), "_dateFormat", null);
        setField(term26821, term26821.getClass(), "_handlerInstantiator", null);
        setField(term26821, term26821.getClass(), "_locale", null);
        setField(term26821, term26821.getClass(), "_timeZone", null);
        setField(term26821, term26821.getClass(), "_defaultBase64", null);
        setField(term26820, term26820.getClass(), "_base", term26821);
        term26822 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26822, term26822.getClass(), "_referencedType", null);
        setField(term26822, term26822.getClass(), "_typeParametersFor", null);
        setField(term26822, term26822.getClass(), "_typeParameters", null);
        setField(term26822, term26822.getClass(), "_typeNames", null);
        setField(term26822, term26822.getClass(), "_canonicalName", null);
        setField(term26822, term26822.getClass(), "_class", null);
        setIntField(term26822, term26822.getClass(), "_hash", 0);
        setField(term26822, term26822.getClass(), "_valueHandler", null);
        setField(term26822, term26822.getClass(), "_typeHandler", null);
        setBooleanField(term26822, term26822.getClass(), "_asStatic", false);
        term26816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26816, term26816.getClass(), "_referencedType", null);
        setField(term26816, term26816.getClass(), "_typeParametersFor", null);
        setField(term26816, term26816.getClass(), "_typeParameters", null);
        setField(term26816, term26816.getClass(), "_typeNames", null);
        setField(term26816, term26816.getClass(), "_canonicalName", null);
        setField(term26816, term26816.getClass(), "_class", null);
        setIntField(term26816, term26816.getClass(), "_hash", 0);
        setField(term26816, term26816.getClass(), "_valueHandler", null);
        setField(term26816, term26816.getClass(), "_typeHandler", null);
        setBooleanField(term26816, term26816.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term26578;
        args[1] = null;
        args[2] = term26782;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term26578, term26820));
        assertTrue(recursiveEquals(term26782, null));
        assertTrue(recursiveEquals(retValue, term26816));
    }

};


