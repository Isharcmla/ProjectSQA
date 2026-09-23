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

public class BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14819;
     Object term14915;
     Object term14959;
     Object term14960;
     Object term14949;

    public BasicSerializerFactory_modifySecondaryTypesByAnnotation_162360997083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14819 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term14819, term14819.getClass(), "_mapperFeatures", 0);
        term14915 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term14959 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term14959, term14959.getClass(), "_serFeatures", 0);
        setField(term14959, term14959.getClass(), "_serializationInclusion", null);
        setField(term14959, term14959.getClass(), "_filterProvider", null);
        setField(term14959, term14959.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term14959, term14959.getClass(), "_generatorFeatures", 0);
        setIntField(term14959, term14959.getClass(), "_generatorFeaturesToChange", 0);
        setField(term14959, term14959.getClass(), "_mixIns", null);
        setField(term14959, term14959.getClass(), "_subtypeResolver", null);
        setField(term14959, term14959.getClass(), "_rootName", null);
        setField(term14959, term14959.getClass(), "_view", null);
        setField(term14959, term14959.getClass(), "_attributes", null);
        setField(term14959, term14959.getClass(), "_rootNames", null);
        setIntField(term14959, term14959.getClass(), "_mapperFeatures", 0);
        setField(term14959, term14959.getClass(), "_base", null);
        term14960 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term14960, term14960.getClass(), "_componentType", null);
        setField(term14960, term14960.getClass(), "_emptyArray", null);
        setField(term14960, term14960.getClass(), "_canonicalName", null);
        setField(term14960, term14960.getClass(), "_class", null);
        setIntField(term14960, term14960.getClass(), "_hash", 0);
        setField(term14960, term14960.getClass(), "_valueHandler", null);
        setField(term14960, term14960.getClass(), "_typeHandler", null);
        setBooleanField(term14960, term14960.getClass(), "_asStatic", false);
        term14949 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term14949, term14949.getClass(), "_componentType", null);
        setField(term14949, term14949.getClass(), "_emptyArray", null);
        setField(term14949, term14949.getClass(), "_canonicalName", null);
        setField(term14949, term14949.getClass(), "_class", null);
        setIntField(term14949, term14949.getClass(), "_hash", 0);
        setField(term14949, term14949.getClass(), "_valueHandler", null);
        setField(term14949, term14949.getClass(), "_typeHandler", null);
        setBooleanField(term14949, term14949.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BasicSerializerFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term14819;
        args[1] = null;
        args[2] = term14915;
        Object retValue = callMethod(klass, "modifySecondaryTypesByAnnotation", argTypes, null, args);
        assertTrue(recursiveEquals(term14819, term14959));
        assertTrue(recursiveEquals(term14915, null));
        assertTrue(recursiveEquals(retValue, term14949));
    }

};


