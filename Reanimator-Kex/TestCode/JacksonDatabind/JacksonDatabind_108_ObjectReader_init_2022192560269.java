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

public class ObjectReader_init_2022192560269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41545;
     Object term41803;
     Object term41845;
     Object term41848;
     Object term41849;

    public ObjectReader_init_2022192560269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41343 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41453 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term41343, term41343.getClass(), "_config", term41453);
        setField(term41343, term41343.getClass(), "_context", null);
        setField(term41343, term41343.getClass(), "_rootDeserializers", null);
        setField(term41343, term41343.getClass(), "_parserFactory", null);
        setField(term41343, term41343.getClass(), "_valueType", null);
        setField(term41343, term41343.getClass(), "_rootDeserializer", null);
        setField(term41343, term41343.getClass(), "_valueToUpdate", null);
        setField(term41343, term41343.getClass(), "_schema", null);
        setField(term41343, term41343.getClass(), "_injectableValues", null);
        term41545 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41693 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term41545, term41545.getClass(), "_context", term41693);
        setField(term41545, term41545.getClass(), "_rootDeserializers", null);
        setField(term41545, term41545.getClass(), "_parserFactory", null);
        term41803 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term41803, term41803.getClass(), "_rootName", null);
        setIntField(term41803, term41803.getClass(), "_deserFeatures", -1);
        term41845 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41846 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term41847 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term41846, term41846.getClass(), "_problemHandlers", null);
        setField(term41846, term41846.getClass(), "_nodeFactory", null);
        setIntField(term41846, term41846.getClass(), "_deserFeatures", -1);
        setIntField(term41846, term41846.getClass(), "_parserFeatures", 0);
        setIntField(term41846, term41846.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term41846, term41846.getClass(), "_formatReadFeatures", 0);
        setIntField(term41846, term41846.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term41846, term41846.getClass(), "_mixIns", null);
        setField(term41846, term41846.getClass(), "_subtypeResolver", null);
        setField(term41846, term41846.getClass(), "_rootName", null);
        setField(term41846, term41846.getClass(), "_view", null);
        setField(term41846, term41846.getClass(), "_attributes", null);
        setField(term41846, term41846.getClass(), "_rootNames", null);
        setField(term41846, term41846.getClass(), "_configOverrides", null);
        setIntField(term41846, term41846.getClass(), "_mapperFeatures", 0);
        setField(term41846, term41846.getClass(), "_base", null);
        setField(term41845, term41845.getClass(), "_config", term41846);
        setField(term41847, term41847.getClass(), "_objectIds", null);
        setField(term41847, term41847.getClass(), "_objectIdResolvers", null);
        setField(term41847, term41847.getClass(), "_cache", null);
        setField(term41847, term41847.getClass(), "_factory", null);
        setField(term41847, term41847.getClass(), "_config", null);
        setIntField(term41847, term41847.getClass(), "_featureFlags", 0);
        setField(term41847, term41847.getClass(), "_view", null);
        setField(term41847, term41847.getClass(), "_parser", null);
        setField(term41847, term41847.getClass(), "_injectableValues", null);
        setField(term41847, term41847.getClass(), "_arrayBuilders", null);
        setField(term41847, term41847.getClass(), "_objectBuffer", null);
        setField(term41847, term41847.getClass(), "_dateFormat", null);
        setField(term41847, term41847.getClass(), "_attributes", null);
        setField(term41847, term41847.getClass(), "_currentType", null);
        setField(term41845, term41845.getClass(), "_context", term41847);
        setField(term41845, term41845.getClass(), "_parserFactory", null);
        setBooleanField(term41845, term41845.getClass(), "_unwrapRoot", true);
        setField(term41845, term41845.getClass(), "_filter", null);
        setField(term41845, term41845.getClass(), "_valueType", null);
        setField(term41845, term41845.getClass(), "_rootDeserializer", null);
        setField(term41845, term41845.getClass(), "_valueToUpdate", null);
        setField(term41845, term41845.getClass(), "_schema", null);
        setField(term41845, term41845.getClass(), "_injectableValues", null);
        setField(term41845, term41845.getClass(), "_dataFormatReaders", null);
        setField(term41845, term41845.getClass(), "_rootDeserializers", null);
        term41848 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term41848, term41848.getClass(), "_problemHandlers", null);
        setField(term41848, term41848.getClass(), "_nodeFactory", null);
        setIntField(term41848, term41848.getClass(), "_deserFeatures", -1);
        setIntField(term41848, term41848.getClass(), "_parserFeatures", 0);
        setIntField(term41848, term41848.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term41848, term41848.getClass(), "_formatReadFeatures", 0);
        setIntField(term41848, term41848.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term41848, term41848.getClass(), "_mixIns", null);
        setField(term41848, term41848.getClass(), "_subtypeResolver", null);
        setField(term41848, term41848.getClass(), "_rootName", null);
        setField(term41848, term41848.getClass(), "_view", null);
        setField(term41848, term41848.getClass(), "_attributes", null);
        setField(term41848, term41848.getClass(), "_rootNames", null);
        setField(term41848, term41848.getClass(), "_configOverrides", null);
        setIntField(term41848, term41848.getClass(), "_mapperFeatures", 0);
        setField(term41848, term41848.getClass(), "_base", null);
        term41849 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41850 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term41849, term41849.getClass(), "_config", null);
        setField(term41850, term41850.getClass(), "_objectIds", null);
        setField(term41850, term41850.getClass(), "_objectIdResolvers", null);
        setField(term41850, term41850.getClass(), "_cache", null);
        setField(term41850, term41850.getClass(), "_factory", null);
        setField(term41850, term41850.getClass(), "_config", null);
        setIntField(term41850, term41850.getClass(), "_featureFlags", 0);
        setField(term41850, term41850.getClass(), "_view", null);
        setField(term41850, term41850.getClass(), "_parser", null);
        setField(term41850, term41850.getClass(), "_injectableValues", null);
        setField(term41850, term41850.getClass(), "_arrayBuilders", null);
        setField(term41850, term41850.getClass(), "_objectBuffer", null);
        setField(term41850, term41850.getClass(), "_dateFormat", null);
        setField(term41850, term41850.getClass(), "_attributes", null);
        setField(term41850, term41850.getClass(), "_currentType", null);
        setField(term41849, term41849.getClass(), "_context", term41850);
        setField(term41849, term41849.getClass(), "_parserFactory", null);
        setBooleanField(term41849, term41849.getClass(), "_unwrapRoot", false);
        setField(term41849, term41849.getClass(), "_filter", null);
        setField(term41849, term41849.getClass(), "_valueType", null);
        setField(term41849, term41849.getClass(), "_rootDeserializer", null);
        setField(term41849, term41849.getClass(), "_valueToUpdate", null);
        setField(term41849, term41849.getClass(), "_schema", null);
        setField(term41849, term41849.getClass(), "_injectableValues", null);
        setField(term41849, term41849.getClass(), "_dataFormatReaders", null);
        setField(term41849, term41849.getClass(), "_rootDeserializers", null);
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
        args[0] = term41545;
        args[1] = term41803;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41845));
        assertTrue(recursiveEquals(term41545, term41848));
        assertTrue(recursiveEquals(term41803, term41849));
    }

};


