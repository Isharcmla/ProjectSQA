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

public class ObjectReader_init_2022192560358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160213;
     Object term160471;
     Object term160569;
     Object term160657;
     Object term160663;
     Object term160664;
     Object term160665;

    public ObjectReader_init_2022192560358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term159973 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term160121 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term159973, term159973.getClass(), "_config", null);
        setField(term159973, term159973.getClass(), "_context", term160121);
        setField(term159973, term159973.getClass(), "_rootDeserializers", null);
        setField(term159973, term159973.getClass(), "_parserFactory", null);
        setField(term159973, term159973.getClass(), "_rootNames", null);
        setField(term159973, term159973.getClass(), "_valueType", null);
        setField(term159973, term159973.getClass(), "_rootDeserializer", null);
        setField(term159973, term159973.getClass(), "_valueToUpdate", null);
        setField(term159973, term159973.getClass(), "_schema", null);
        setField(term159973, term159973.getClass(), "_injectableValues", null);
        term160213 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term160361 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term160213, term160213.getClass(), "_context", term160361);
        setField(term160213, term160213.getClass(), "_rootDeserializers", null);
        setField(term160213, term160213.getClass(), "_parserFactory", null);
        setField(term160213, term160213.getClass(), "_rootNames", null);
        term160471 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term160471, term160471.getClass(), "_rootName", null);
        setIntField(term160471, term160471.getClass(), "_deserFeatures", -1);
        term160569 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term160657 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term160658 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term160659 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term160660 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term160658, term160658.getClass(), "_deserFeatures", -1);
        setField(term160658, term160658.getClass(), "_problemHandlers", null);
        setField(term160658, term160658.getClass(), "_nodeFactory", null);
        setIntField(term160658, term160658.getClass(), "_parserFeatures", 0);
        setIntField(term160658, term160658.getClass(), "_parserFeaturesToChange", 0);
        setField(term160658, term160658.getClass(), "_mixInAnnotations", null);
        setField(term160658, term160658.getClass(), "_subtypeResolver", null);
        setField(term160658, term160658.getClass(), "_rootName", null);
        setField(term160658, term160658.getClass(), "_view", null);
        setField(term160658, term160658.getClass(), "_attributes", null);
        setIntField(term160658, term160658.getClass(), "_mapperFeatures", 0);
        setField(term160658, term160658.getClass(), "_base", null);
        setField(term160657, term160657.getClass(), "_config", term160658);
        setField(term160659, term160659.getClass(), "_objectIds", null);
        setField(term160659, term160659.getClass(), "_objectIdResolvers", null);
        setField(term160659, term160659.getClass(), "_cache", null);
        setField(term160659, term160659.getClass(), "_factory", null);
        setField(term160659, term160659.getClass(), "_config", null);
        setIntField(term160659, term160659.getClass(), "_featureFlags", 0);
        setField(term160659, term160659.getClass(), "_view", null);
        setField(term160659, term160659.getClass(), "_parser", null);
        setField(term160659, term160659.getClass(), "_injectableValues", null);
        setField(term160659, term160659.getClass(), "_arrayBuilders", null);
        setField(term160659, term160659.getClass(), "_objectBuffer", null);
        setField(term160659, term160659.getClass(), "_dateFormat", null);
        setField(term160659, term160659.getClass(), "_attributes", null);
        setField(term160659, term160659.getClass(), "_currentType", null);
        setField(term160657, term160657.getClass(), "_context", term160659);
        setField(term160657, term160657.getClass(), "_parserFactory", null);
        setBooleanField(term160657, term160657.getClass(), "_unwrapRoot", true);
        setField(term160660, term160660.getClass(), "_typeParametersFor", null);
        setField(term160660, term160660.getClass(), "_typeParameters", null);
        setField(term160660, term160660.getClass(), "_typeNames", null);
        setField(term160660, term160660.getClass(), "_canonicalName", null);
        setField(term160660, term160660.getClass(), "_class", null);
        setIntField(term160660, term160660.getClass(), "_hash", 0);
        setField(term160660, term160660.getClass(), "_valueHandler", null);
        setField(term160660, term160660.getClass(), "_typeHandler", null);
        setBooleanField(term160660, term160660.getClass(), "_asStatic", false);
        setField(term160657, term160657.getClass(), "_valueType", term160660);
        setField(term160657, term160657.getClass(), "_rootDeserializer", null);
        setField(term160657, term160657.getClass(), "_valueToUpdate", "");
        setField(term160657, term160657.getClass(), "_schema", null);
        setField(term160657, term160657.getClass(), "_injectableValues", null);
        setField(term160657, term160657.getClass(), "_dataFormatReaders", null);
        setField(term160657, term160657.getClass(), "_rootDeserializers", null);
        setField(term160657, term160657.getClass(), "_rootNames", null);
        term160663 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term160663, term160663.getClass(), "_typeParametersFor", null);
        setField(term160663, term160663.getClass(), "_typeParameters", null);
        setField(term160663, term160663.getClass(), "_typeNames", null);
        setField(term160663, term160663.getClass(), "_canonicalName", null);
        setField(term160663, term160663.getClass(), "_class", null);
        setIntField(term160663, term160663.getClass(), "_hash", 0);
        setField(term160663, term160663.getClass(), "_valueHandler", null);
        setField(term160663, term160663.getClass(), "_typeHandler", null);
        setBooleanField(term160663, term160663.getClass(), "_asStatic", false);
        term160664 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term160664, term160664.getClass(), "_deserFeatures", -1);
        setField(term160664, term160664.getClass(), "_problemHandlers", null);
        setField(term160664, term160664.getClass(), "_nodeFactory", null);
        setIntField(term160664, term160664.getClass(), "_parserFeatures", 0);
        setIntField(term160664, term160664.getClass(), "_parserFeaturesToChange", 0);
        setField(term160664, term160664.getClass(), "_mixInAnnotations", null);
        setField(term160664, term160664.getClass(), "_subtypeResolver", null);
        setField(term160664, term160664.getClass(), "_rootName", null);
        setField(term160664, term160664.getClass(), "_view", null);
        setField(term160664, term160664.getClass(), "_attributes", null);
        setIntField(term160664, term160664.getClass(), "_mapperFeatures", 0);
        setField(term160664, term160664.getClass(), "_base", null);
        term160665 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term160666 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term160665, term160665.getClass(), "_config", null);
        setField(term160666, term160666.getClass(), "_objectIds", null);
        setField(term160666, term160666.getClass(), "_objectIdResolvers", null);
        setField(term160666, term160666.getClass(), "_cache", null);
        setField(term160666, term160666.getClass(), "_factory", null);
        setField(term160666, term160666.getClass(), "_config", null);
        setIntField(term160666, term160666.getClass(), "_featureFlags", 0);
        setField(term160666, term160666.getClass(), "_view", null);
        setField(term160666, term160666.getClass(), "_parser", null);
        setField(term160666, term160666.getClass(), "_injectableValues", null);
        setField(term160666, term160666.getClass(), "_arrayBuilders", null);
        setField(term160666, term160666.getClass(), "_objectBuffer", null);
        setField(term160666, term160666.getClass(), "_dateFormat", null);
        setField(term160666, term160666.getClass(), "_attributes", null);
        setField(term160666, term160666.getClass(), "_currentType", null);
        setField(term160665, term160665.getClass(), "_context", term160666);
        setField(term160665, term160665.getClass(), "_parserFactory", null);
        setBooleanField(term160665, term160665.getClass(), "_unwrapRoot", false);
        setField(term160665, term160665.getClass(), "_valueType", null);
        setField(term160665, term160665.getClass(), "_rootDeserializer", null);
        setField(term160665, term160665.getClass(), "_valueToUpdate", null);
        setField(term160665, term160665.getClass(), "_schema", null);
        setField(term160665, term160665.getClass(), "_injectableValues", null);
        setField(term160665, term160665.getClass(), "_dataFormatReaders", null);
        setField(term160665, term160665.getClass(), "_rootDeserializers", null);
        setField(term160665, term160665.getClass(), "_rootNames", null);
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
        args[0] = term160213;
        args[1] = term160471;
        args[2] = term160569;
        args[3] = null;
        args[4] = "";
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term160657));
        assertTrue(recursiveEquals(term160213, term160663));
        assertTrue(recursiveEquals(term160471, term160664));
        assertTrue(recursiveEquals(term160569, term160665));
    }

};


