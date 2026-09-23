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

public class ObjectReader_init_2022192560223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30201;
     Object term30311;
     Object term30497;
     Object term30499;
     Object term30500;

    public ObjectReader_init_2022192560223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29999 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term30109 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term29999, term29999.getClass(), "_config", term30109);
        term30201 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term30311 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term30497 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term30498 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term30498, term30498.getClass(), "_deserFeatures", 0);
        setField(term30498, term30498.getClass(), "_problemHandlers", null);
        setField(term30498, term30498.getClass(), "_nodeFactory", null);
        setIntField(term30498, term30498.getClass(), "_parserFeatures", 0);
        setIntField(term30498, term30498.getClass(), "_parserFeaturesToChange", 0);
        setField(term30498, term30498.getClass(), "_mixInAnnotations", null);
        setField(term30498, term30498.getClass(), "_subtypeResolver", null);
        setField(term30498, term30498.getClass(), "_rootName", null);
        setField(term30498, term30498.getClass(), "_view", null);
        setField(term30498, term30498.getClass(), "_attributes", null);
        setIntField(term30498, term30498.getClass(), "_mapperFeatures", 0);
        setField(term30498, term30498.getClass(), "_base", null);
        setField(term30497, term30497.getClass(), "_config", term30498);
        setField(term30497, term30497.getClass(), "_context", null);
        setField(term30497, term30497.getClass(), "_parserFactory", null);
        setBooleanField(term30497, term30497.getClass(), "_unwrapRoot", false);
        setField(term30497, term30497.getClass(), "_valueType", null);
        setField(term30497, term30497.getClass(), "_rootDeserializer", null);
        setField(term30497, term30497.getClass(), "_valueToUpdate", null);
        setField(term30497, term30497.getClass(), "_schema", null);
        setField(term30497, term30497.getClass(), "_injectableValues", null);
        setField(term30497, term30497.getClass(), "_dataFormatReaders", null);
        setField(term30497, term30497.getClass(), "_rootDeserializers", null);
        setField(term30497, term30497.getClass(), "_rootNames", null);
        term30499 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term30499, term30499.getClass(), "_deserFeatures", 0);
        setField(term30499, term30499.getClass(), "_problemHandlers", null);
        setField(term30499, term30499.getClass(), "_nodeFactory", null);
        setIntField(term30499, term30499.getClass(), "_parserFeatures", 0);
        setIntField(term30499, term30499.getClass(), "_parserFeaturesToChange", 0);
        setField(term30499, term30499.getClass(), "_mixInAnnotations", null);
        setField(term30499, term30499.getClass(), "_subtypeResolver", null);
        setField(term30499, term30499.getClass(), "_rootName", null);
        setField(term30499, term30499.getClass(), "_view", null);
        setField(term30499, term30499.getClass(), "_attributes", null);
        setIntField(term30499, term30499.getClass(), "_mapperFeatures", 0);
        setField(term30499, term30499.getClass(), "_base", null);
        term30500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term30500, term30500.getClass(), "_config", null);
        setField(term30500, term30500.getClass(), "_context", null);
        setField(term30500, term30500.getClass(), "_parserFactory", null);
        setBooleanField(term30500, term30500.getClass(), "_unwrapRoot", false);
        setField(term30500, term30500.getClass(), "_valueType", null);
        setField(term30500, term30500.getClass(), "_rootDeserializer", null);
        setField(term30500, term30500.getClass(), "_valueToUpdate", null);
        setField(term30500, term30500.getClass(), "_schema", null);
        setField(term30500, term30500.getClass(), "_injectableValues", null);
        setField(term30500, term30500.getClass(), "_dataFormatReaders", null);
        setField(term30500, term30500.getClass(), "_rootDeserializers", null);
        setField(term30500, term30500.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term30201;
        args[1] = term30311;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30497));
        assertTrue(recursiveEquals(term30201, term30499));
        assertTrue(recursiveEquals(term30311, term30500));
    }

};


