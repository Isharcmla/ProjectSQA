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

public class ObjectReader_init_1613963825248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48498;
     Object term48608;
     Object term48647;
     Object term48649;
     Object term48650;

    public ObjectReader_init_1613963825248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48148 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term48258 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48406 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term48148, term48148.getClass(), "_config", term48258);
        setField(term48148, term48148.getClass(), "_context", term48406);
        setField(term48148, term48148.getClass(), "_rootDeserializers", null);
        setField(term48148, term48148.getClass(), "_parserFactory", null);
        setField(term48148, term48148.getClass(), "_rootNames", null);
        setField(term48148, term48148.getClass(), "_valueType", null);
        setField(term48148, term48148.getClass(), "_valueToUpdate", null);
        setField(term48148, term48148.getClass(), "_schema", null);
        setField(term48148, term48148.getClass(), "_injectableValues", null);
        term48498 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term48498, term48498.getClass(), "_deserializationContext", null);
        setField(term48498, term48498.getClass(), "_rootDeserializers", null);
        setField(term48498, term48498.getClass(), "_jsonFactory", null);
        setField(term48498, term48498.getClass(), "_rootNames", null);
        term48608 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term48608, term48608.getClass(), "_rootName", null);
        setIntField(term48608, term48608.getClass(), "_deserFeatures", -1);
        term48647 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term48648 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term48648, term48648.getClass(), "_deserFeatures", -1);
        setField(term48648, term48648.getClass(), "_problemHandlers", null);
        setField(term48648, term48648.getClass(), "_nodeFactory", null);
        setIntField(term48648, term48648.getClass(), "_parserFeatures", 0);
        setIntField(term48648, term48648.getClass(), "_parserFeaturesToChange", 0);
        setField(term48648, term48648.getClass(), "_mixInAnnotations", null);
        setField(term48648, term48648.getClass(), "_subtypeResolver", null);
        setField(term48648, term48648.getClass(), "_rootName", null);
        setField(term48648, term48648.getClass(), "_view", null);
        setField(term48648, term48648.getClass(), "_attributes", null);
        setIntField(term48648, term48648.getClass(), "_mapperFeatures", 0);
        setField(term48648, term48648.getClass(), "_base", null);
        setField(term48647, term48647.getClass(), "_config", term48648);
        setField(term48647, term48647.getClass(), "_context", null);
        setField(term48647, term48647.getClass(), "_parserFactory", null);
        setBooleanField(term48647, term48647.getClass(), "_unwrapRoot", true);
        setField(term48647, term48647.getClass(), "_valueType", null);
        setField(term48647, term48647.getClass(), "_rootDeserializer", null);
        setField(term48647, term48647.getClass(), "_valueToUpdate", null);
        setField(term48647, term48647.getClass(), "_schema", null);
        setField(term48647, term48647.getClass(), "_injectableValues", null);
        setField(term48647, term48647.getClass(), "_dataFormatReaders", null);
        setField(term48647, term48647.getClass(), "_rootDeserializers", null);
        setField(term48647, term48647.getClass(), "_rootNames", null);
        term48649 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term48649, term48649.getClass(), "_deserFeatures", -1);
        setField(term48649, term48649.getClass(), "_problemHandlers", null);
        setField(term48649, term48649.getClass(), "_nodeFactory", null);
        setIntField(term48649, term48649.getClass(), "_parserFeatures", 0);
        setIntField(term48649, term48649.getClass(), "_parserFeaturesToChange", 0);
        setField(term48649, term48649.getClass(), "_mixInAnnotations", null);
        setField(term48649, term48649.getClass(), "_subtypeResolver", null);
        setField(term48649, term48649.getClass(), "_rootName", null);
        setField(term48649, term48649.getClass(), "_view", null);
        setField(term48649, term48649.getClass(), "_attributes", null);
        setIntField(term48649, term48649.getClass(), "_mapperFeatures", 0);
        setField(term48649, term48649.getClass(), "_base", null);
        term48650 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term48650, term48650.getClass(), "_jsonFactory", null);
        setField(term48650, term48650.getClass(), "_typeFactory", null);
        setField(term48650, term48650.getClass(), "_injectableValues", null);
        setField(term48650, term48650.getClass(), "_subtypeResolver", null);
        setField(term48650, term48650.getClass(), "_rootNames", null);
        setField(term48650, term48650.getClass(), "_mixInAnnotations", null);
        setField(term48650, term48650.getClass(), "_serializationConfig", null);
        setField(term48650, term48650.getClass(), "_serializerProvider", null);
        setField(term48650, term48650.getClass(), "_serializerFactory", null);
        setField(term48650, term48650.getClass(), "_deserializationConfig", null);
        setField(term48650, term48650.getClass(), "_deserializationContext", null);
        setField(term48650, term48650.getClass(), "_registeredModuleTypes", null);
        setField(term48650, term48650.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term48498;
        args[1] = term48608;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48647));
        assertTrue(recursiveEquals(term48498, term48649));
        assertTrue(recursiveEquals(term48608, term48650));
    }

};


