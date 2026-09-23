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

public class ObjectReader_init_1619648465287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57614;
     Object term57724;
     Object term57764;
     Object term57766;
     Object term57767;

    public ObjectReader_init_1619648465287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57264 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term57374 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term57522 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term57264, term57264.getClass(), "_config", term57374);
        setField(term57264, term57264.getClass(), "_context", term57522);
        setField(term57264, term57264.getClass(), "_rootDeserializers", null);
        setField(term57264, term57264.getClass(), "_parserFactory", null);
        setField(term57264, term57264.getClass(), "_valueType", null);
        setField(term57264, term57264.getClass(), "_rootDeserializer", null);
        setField(term57264, term57264.getClass(), "_valueToUpdate", null);
        setField(term57264, term57264.getClass(), "_schema", null);
        setField(term57264, term57264.getClass(), "_injectableValues", null);
        term57614 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term57614, term57614.getClass(), "_context", null);
        setField(term57614, term57614.getClass(), "_rootDeserializers", null);
        setField(term57614, term57614.getClass(), "_parserFactory", null);
        setField(term57614, term57614.getClass(), "_valueType", null);
        setField(term57614, term57614.getClass(), "_rootDeserializer", null);
        setField(term57614, term57614.getClass(), "_valueToUpdate", null);
        setField(term57614, term57614.getClass(), "_schema", null);
        setField(term57614, term57614.getClass(), "_injectableValues", null);
        term57724 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term57724, term57724.getClass(), "_rootName", null);
        setIntField(term57724, term57724.getClass(), "_deserFeatures", -1);
        term57764 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term57765 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term57765, term57765.getClass(), "_problemHandlers", null);
        setField(term57765, term57765.getClass(), "_nodeFactory", null);
        setIntField(term57765, term57765.getClass(), "_deserFeatures", -1);
        setIntField(term57765, term57765.getClass(), "_parserFeatures", 0);
        setIntField(term57765, term57765.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term57765, term57765.getClass(), "_formatReadFeatures", 0);
        setIntField(term57765, term57765.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term57765, term57765.getClass(), "_mixIns", null);
        setField(term57765, term57765.getClass(), "_subtypeResolver", null);
        setField(term57765, term57765.getClass(), "_rootName", null);
        setField(term57765, term57765.getClass(), "_view", null);
        setField(term57765, term57765.getClass(), "_attributes", null);
        setField(term57765, term57765.getClass(), "_rootNames", null);
        setField(term57765, term57765.getClass(), "_configOverrides", null);
        setIntField(term57765, term57765.getClass(), "_mapperFeatures", 0);
        setField(term57765, term57765.getClass(), "_base", null);
        setField(term57764, term57764.getClass(), "_config", term57765);
        setField(term57764, term57764.getClass(), "_context", null);
        setField(term57764, term57764.getClass(), "_parserFactory", null);
        setBooleanField(term57764, term57764.getClass(), "_unwrapRoot", true);
        setField(term57764, term57764.getClass(), "_filter", null);
        setField(term57764, term57764.getClass(), "_valueType", null);
        setField(term57764, term57764.getClass(), "_rootDeserializer", null);
        setField(term57764, term57764.getClass(), "_valueToUpdate", null);
        setField(term57764, term57764.getClass(), "_schema", null);
        setField(term57764, term57764.getClass(), "_injectableValues", null);
        setField(term57764, term57764.getClass(), "_dataFormatReaders", null);
        setField(term57764, term57764.getClass(), "_rootDeserializers", null);
        term57766 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term57766, term57766.getClass(), "_problemHandlers", null);
        setField(term57766, term57766.getClass(), "_nodeFactory", null);
        setIntField(term57766, term57766.getClass(), "_deserFeatures", -1);
        setIntField(term57766, term57766.getClass(), "_parserFeatures", 0);
        setIntField(term57766, term57766.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term57766, term57766.getClass(), "_formatReadFeatures", 0);
        setIntField(term57766, term57766.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term57766, term57766.getClass(), "_mixIns", null);
        setField(term57766, term57766.getClass(), "_subtypeResolver", null);
        setField(term57766, term57766.getClass(), "_rootName", null);
        setField(term57766, term57766.getClass(), "_view", null);
        setField(term57766, term57766.getClass(), "_attributes", null);
        setField(term57766, term57766.getClass(), "_rootNames", null);
        setField(term57766, term57766.getClass(), "_configOverrides", null);
        setIntField(term57766, term57766.getClass(), "_mapperFeatures", 0);
        setField(term57766, term57766.getClass(), "_base", null);
        term57767 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term57767, term57767.getClass(), "_config", null);
        setField(term57767, term57767.getClass(), "_context", null);
        setField(term57767, term57767.getClass(), "_parserFactory", null);
        setBooleanField(term57767, term57767.getClass(), "_unwrapRoot", false);
        setField(term57767, term57767.getClass(), "_filter", null);
        setField(term57767, term57767.getClass(), "_valueType", null);
        setField(term57767, term57767.getClass(), "_rootDeserializer", null);
        setField(term57767, term57767.getClass(), "_valueToUpdate", null);
        setField(term57767, term57767.getClass(), "_schema", null);
        setField(term57767, term57767.getClass(), "_injectableValues", null);
        setField(term57767, term57767.getClass(), "_dataFormatReaders", null);
        setField(term57767, term57767.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term57614;
        args[1] = term57724;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term57764));
        assertTrue(recursiveEquals(term57614, term57766));
        assertTrue(recursiveEquals(term57724, term57767));
    }

};


