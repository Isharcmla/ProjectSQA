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
import org.mockito.Mockito;

public class ObjectReader_init_1613963825299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67134;
     Object term67392;
     Object term67548;
     Object term67554;
     Object term67558;

    public ObjectReader_init_1613963825299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66488 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term66636 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term66718 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term66800 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term66896 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term66934 = newInstance(Class.forName("java.lang.Object"));
        Object term66366 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term67042 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term66488, term66488.getClass(), "_config", null);
        setField(term66488, term66488.getClass(), "_context", term66636);
        setField(term66488, term66488.getClass(), "_rootDeserializers", term66718);
        setField(term66488, term66488.getClass(), "_parserFactory", term66800);
        setField(term66488, term66488.getClass(), "_valueType", term66896);
        setField(term66488, term66488.getClass(), "_valueToUpdate", term66934);
        setField(term66488, term66488.getClass(), "_schema", term66366);
        setField(term66488, term66488.getClass(), "_injectableValues", term67042);
        term67134 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term67282 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term67134, term67134.getClass(), "_deserializationContext", term67282);
        setField(term67134, term67134.getClass(), "_rootDeserializers", null);
        setField(term67134, term67134.getClass(), "_jsonFactory", null);
        term67392 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term67484 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term67484, term67484.getClass(), "_namespace", null);
        setField(term67484, term67484.getClass(), "_simpleName", "");
        setField(term67392, term67392.getClass(), "_rootName", term67484);
        term67548 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term67549 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term67550 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term67553 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term67549, term67549.getClass(), "_problemHandlers", null);
        setField(term67549, term67549.getClass(), "_nodeFactory", null);
        setIntField(term67549, term67549.getClass(), "_deserFeatures", 0);
        setIntField(term67549, term67549.getClass(), "_parserFeatures", 0);
        setIntField(term67549, term67549.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term67549, term67549.getClass(), "_formatReadFeatures", 0);
        setIntField(term67549, term67549.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term67549, term67549.getClass(), "_mixIns", null);
        setField(term67549, term67549.getClass(), "_subtypeResolver", null);
        setField(term67550, term67550.getClass(), "_simpleName", "");
        setField(term67550, term67550.getClass(), "_namespace", null);
        setField(term67550, term67550.getClass(), "_encodedSimple", null);
        setField(term67549, term67549.getClass(), "_rootName", term67550);
        setField(term67549, term67549.getClass(), "_view", null);
        setField(term67549, term67549.getClass(), "_attributes", null);
        setField(term67549, term67549.getClass(), "_rootNames", null);
        setField(term67549, term67549.getClass(), "_configOverrides", null);
        setIntField(term67549, term67549.getClass(), "_mapperFeatures", 0);
        setField(term67549, term67549.getClass(), "_base", null);
        setField(term67548, term67548.getClass(), "_config", term67549);
        setField(term67553, term67553.getClass(), "_objectIds", null);
        setField(term67553, term67553.getClass(), "_objectIdResolvers", null);
        setField(term67553, term67553.getClass(), "_cache", null);
        setField(term67553, term67553.getClass(), "_factory", null);
        setField(term67553, term67553.getClass(), "_config", null);
        setIntField(term67553, term67553.getClass(), "_featureFlags", 0);
        setField(term67553, term67553.getClass(), "_view", null);
        setField(term67553, term67553.getClass(), "_parser", null);
        setField(term67553, term67553.getClass(), "_injectableValues", null);
        setField(term67553, term67553.getClass(), "_arrayBuilders", null);
        setField(term67553, term67553.getClass(), "_objectBuffer", null);
        setField(term67553, term67553.getClass(), "_dateFormat", null);
        setField(term67553, term67553.getClass(), "_attributes", null);
        setField(term67553, term67553.getClass(), "_currentType", null);
        setField(term67548, term67548.getClass(), "_context", term67553);
        setField(term67548, term67548.getClass(), "_parserFactory", null);
        setBooleanField(term67548, term67548.getClass(), "_unwrapRoot", false);
        setField(term67548, term67548.getClass(), "_filter", null);
        setField(term67548, term67548.getClass(), "_valueType", null);
        setField(term67548, term67548.getClass(), "_rootDeserializer", null);
        setField(term67548, term67548.getClass(), "_valueToUpdate", null);
        setField(term67548, term67548.getClass(), "_schema", null);
        setField(term67548, term67548.getClass(), "_injectableValues", null);
        setField(term67548, term67548.getClass(), "_dataFormatReaders", null);
        setField(term67548, term67548.getClass(), "_rootDeserializers", null);
        term67554 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term67555 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term67554, term67554.getClass(), "_problemHandlers", null);
        setField(term67554, term67554.getClass(), "_nodeFactory", null);
        setIntField(term67554, term67554.getClass(), "_deserFeatures", 0);
        setIntField(term67554, term67554.getClass(), "_parserFeatures", 0);
        setIntField(term67554, term67554.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term67554, term67554.getClass(), "_formatReadFeatures", 0);
        setIntField(term67554, term67554.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term67554, term67554.getClass(), "_mixIns", null);
        setField(term67554, term67554.getClass(), "_subtypeResolver", null);
        setField(term67555, term67555.getClass(), "_simpleName", "");
        setField(term67555, term67555.getClass(), "_namespace", null);
        setField(term67555, term67555.getClass(), "_encodedSimple", null);
        setField(term67554, term67554.getClass(), "_rootName", term67555);
        setField(term67554, term67554.getClass(), "_view", null);
        setField(term67554, term67554.getClass(), "_attributes", null);
        setField(term67554, term67554.getClass(), "_rootNames", null);
        setField(term67554, term67554.getClass(), "_configOverrides", null);
        setIntField(term67554, term67554.getClass(), "_mapperFeatures", 0);
        setField(term67554, term67554.getClass(), "_base", null);
        term67558 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term67559 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term67558, term67558.getClass(), "_jsonFactory", null);
        setField(term67558, term67558.getClass(), "_typeFactory", null);
        setField(term67558, term67558.getClass(), "_injectableValues", null);
        setField(term67558, term67558.getClass(), "_subtypeResolver", null);
        setField(term67558, term67558.getClass(), "_configOverrides", null);
        setField(term67558, term67558.getClass(), "_mixIns", null);
        setField(term67558, term67558.getClass(), "_serializationConfig", null);
        setField(term67558, term67558.getClass(), "_serializerProvider", null);
        setField(term67558, term67558.getClass(), "_serializerFactory", null);
        setField(term67558, term67558.getClass(), "_deserializationConfig", null);
        setField(term67559, term67559.getClass(), "_objectIds", null);
        setField(term67559, term67559.getClass(), "_objectIdResolvers", null);
        setField(term67559, term67559.getClass(), "_cache", null);
        setField(term67559, term67559.getClass(), "_factory", null);
        setField(term67559, term67559.getClass(), "_config", null);
        setIntField(term67559, term67559.getClass(), "_featureFlags", 0);
        setField(term67559, term67559.getClass(), "_view", null);
        setField(term67559, term67559.getClass(), "_parser", null);
        setField(term67559, term67559.getClass(), "_injectableValues", null);
        setField(term67559, term67559.getClass(), "_arrayBuilders", null);
        setField(term67559, term67559.getClass(), "_objectBuffer", null);
        setField(term67559, term67559.getClass(), "_dateFormat", null);
        setField(term67559, term67559.getClass(), "_attributes", null);
        setField(term67559, term67559.getClass(), "_currentType", null);
        setField(term67558, term67558.getClass(), "_deserializationContext", term67559);
        setField(term67558, term67558.getClass(), "_registeredModuleTypes", null);
        setField(term67558, term67558.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term67134;
        args[1] = term67392;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term67548));
        assertTrue(recursiveEquals(term67134, term67554));
        assertTrue(recursiveEquals(term67392, term67558));
    }

};


