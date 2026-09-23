package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;

public class ObjectReader_init_2073957032305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76860;
     Object term76970;
     Object term77074;
     Object term77203;
     Object term77208;
     Object term77209;
     Object term77210;

    public ObjectReader_init_2073957032305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76658 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term76768 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term76658, term76658.getClass(), "_config", term76768);
        setField(term76658, term76658.getClass(), "_context", null);
        setField(term76658, term76658.getClass(), "_rootDeserializers", null);
        setField(term76658, term76658.getClass(), "_parserFactory", null);
        setField(term76658, term76658.getClass(), "_valueType", null);
        setField(term76658, term76658.getClass(), "_valueToUpdate", null);
        setField(term76658, term76658.getClass(), "_schema", null);
        setField(term76658, term76658.getClass(), "_injectableValues", null);
        term76860 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term76860, term76860.getClass(), "_deserializationContext", null);
        setField(term76860, term76860.getClass(), "_rootDeserializers", null);
        setField(term76860, term76860.getClass(), "_jsonFactory", null);
        term76970 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term76970, term76970.getClass(), "_rootName", null);
        setIntField(term76970, term76970.getClass(), "_deserFeatures", 0);
        term77074 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term77203 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term77204 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term77205 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term77204, term77204.getClass(), "_problemHandlers", null);
        setField(term77204, term77204.getClass(), "_nodeFactory", null);
        setIntField(term77204, term77204.getClass(), "_deserFeatures", 0);
        setIntField(term77204, term77204.getClass(), "_parserFeatures", 0);
        setIntField(term77204, term77204.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term77204, term77204.getClass(), "_formatReadFeatures", 0);
        setIntField(term77204, term77204.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term77204, term77204.getClass(), "_mixIns", null);
        setField(term77204, term77204.getClass(), "_subtypeResolver", null);
        setField(term77204, term77204.getClass(), "_rootName", null);
        setField(term77204, term77204.getClass(), "_view", null);
        setField(term77204, term77204.getClass(), "_attributes", null);
        setField(term77204, term77204.getClass(), "_rootNames", null);
        setIntField(term77204, term77204.getClass(), "_mapperFeatures", 0);
        setField(term77204, term77204.getClass(), "_base", null);
        setField(term77203, term77203.getClass(), "_config", term77204);
        setField(term77203, term77203.getClass(), "_context", null);
        setField(term77203, term77203.getClass(), "_parserFactory", null);
        setBooleanField(term77203, term77203.getClass(), "_unwrapRoot", false);
        setField(term77203, term77203.getClass(), "_filter", null);
        setField(term77205, term77205.getClass(), "_referencedType", null);
        setField(term77205, term77205.getClass(), "_superClass", null);
        setField(term77205, term77205.getClass(), "_superInterfaces", null);
        setField(term77205, term77205.getClass(), "_bindings", null);
        setField(term77205, term77205.getClass(), "_canonicalName", null);
        setField(term77205, term77205.getClass(), "_class", null);
        setIntField(term77205, term77205.getClass(), "_hash", 0);
        setField(term77205, term77205.getClass(), "_valueHandler", null);
        setField(term77205, term77205.getClass(), "_typeHandler", null);
        setBooleanField(term77205, term77205.getClass(), "_asStatic", false);
        setField(term77203, term77203.getClass(), "_valueType", term77205);
        setField(term77203, term77203.getClass(), "_rootDeserializer", null);
        setField(term77203, term77203.getClass(), "_valueToUpdate", "");
        setField(term77203, term77203.getClass(), "_schema", null);
        setField(term77203, term77203.getClass(), "_injectableValues", null);
        setField(term77203, term77203.getClass(), "_dataFormatReaders", null);
        setField(term77203, term77203.getClass(), "_rootDeserializers", null);
        term77208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term77208, term77208.getClass(), "_referencedType", null);
        setField(term77208, term77208.getClass(), "_superClass", null);
        setField(term77208, term77208.getClass(), "_superInterfaces", null);
        setField(term77208, term77208.getClass(), "_bindings", null);
        setField(term77208, term77208.getClass(), "_canonicalName", null);
        setField(term77208, term77208.getClass(), "_class", null);
        setIntField(term77208, term77208.getClass(), "_hash", 0);
        setField(term77208, term77208.getClass(), "_valueHandler", null);
        setField(term77208, term77208.getClass(), "_typeHandler", null);
        setBooleanField(term77208, term77208.getClass(), "_asStatic", false);
        term77209 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term77209, term77209.getClass(), "_problemHandlers", null);
        setField(term77209, term77209.getClass(), "_nodeFactory", null);
        setIntField(term77209, term77209.getClass(), "_deserFeatures", 0);
        setIntField(term77209, term77209.getClass(), "_parserFeatures", 0);
        setIntField(term77209, term77209.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term77209, term77209.getClass(), "_formatReadFeatures", 0);
        setIntField(term77209, term77209.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term77209, term77209.getClass(), "_mixIns", null);
        setField(term77209, term77209.getClass(), "_subtypeResolver", null);
        setField(term77209, term77209.getClass(), "_rootName", null);
        setField(term77209, term77209.getClass(), "_view", null);
        setField(term77209, term77209.getClass(), "_attributes", null);
        setField(term77209, term77209.getClass(), "_rootNames", null);
        setIntField(term77209, term77209.getClass(), "_mapperFeatures", 0);
        setField(term77209, term77209.getClass(), "_base", null);
        term77210 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term77210, term77210.getClass(), "_jsonFactory", null);
        setField(term77210, term77210.getClass(), "_typeFactory", null);
        setField(term77210, term77210.getClass(), "_injectableValues", null);
        setField(term77210, term77210.getClass(), "_subtypeResolver", null);
        setField(term77210, term77210.getClass(), "_mixIns", null);
        setField(term77210, term77210.getClass(), "_serializationConfig", null);
        setField(term77210, term77210.getClass(), "_serializerProvider", null);
        setField(term77210, term77210.getClass(), "_serializerFactory", null);
        setField(term77210, term77210.getClass(), "_deserializationConfig", null);
        setField(term77210, term77210.getClass(), "_deserializationContext", null);
        setField(term77210, term77210.getClass(), "_registeredModuleTypes", null);
        setField(term77210, term77210.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        Object[] args = new Object[6];
        args[0] = term76860;
        args[1] = term76970;
        args[2] = term77074;
        args[3] = "";
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term77203));
        assertTrue(recursiveEquals(term76860, term77208));
        assertTrue(recursiveEquals(term76970, term77209));
        assertTrue(recursiveEquals(term77074, term77210));
    }

};


