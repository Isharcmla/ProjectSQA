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

public class ObjectReader_init_1613963825271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43295;
     Object term43498;
     Object term43540;
     Object term43543;
     Object term43544;

    public ObjectReader_init_1613963825271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43093 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term43498 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term43498, term43498.getClass(), "_rootName", null);
        setIntField(term43498, term43498.getClass(), "_deserFeatures", -1);
        setField(term43093, term43093.getClass(), "_config", term43498);
        setField(term43093, term43093.getClass(), "_context", null);
        setField(term43093, term43093.getClass(), "_rootDeserializers", null);
        setField(term43093, term43093.getClass(), "_parserFactory", null);
        setField(term43093, term43093.getClass(), "_valueType", null);
        setField(term43093, term43093.getClass(), "_valueToUpdate", null);
        setField(term43093, term43093.getClass(), "_schema", null);
        setField(term43093, term43093.getClass(), "_injectableValues", null);
        term43295 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term43443 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term43295, term43295.getClass(), "_deserializationContext", term43443);
        setField(term43295, term43295.getClass(), "_rootDeserializers", null);
        setField(term43295, term43295.getClass(), "_jsonFactory", null);
        term43540 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term43541 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term43542 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term43541, term43541.getClass(), "_problemHandlers", null);
        setField(term43541, term43541.getClass(), "_nodeFactory", null);
        setIntField(term43541, term43541.getClass(), "_deserFeatures", -1);
        setIntField(term43541, term43541.getClass(), "_parserFeatures", 0);
        setIntField(term43541, term43541.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term43541, term43541.getClass(), "_formatReadFeatures", 0);
        setIntField(term43541, term43541.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term43541, term43541.getClass(), "_mixIns", null);
        setField(term43541, term43541.getClass(), "_subtypeResolver", null);
        setField(term43541, term43541.getClass(), "_rootName", null);
        setField(term43541, term43541.getClass(), "_view", null);
        setField(term43541, term43541.getClass(), "_attributes", null);
        setField(term43541, term43541.getClass(), "_rootNames", null);
        setField(term43541, term43541.getClass(), "_configOverrides", null);
        setIntField(term43541, term43541.getClass(), "_mapperFeatures", 0);
        setField(term43541, term43541.getClass(), "_base", null);
        setField(term43540, term43540.getClass(), "_config", term43541);
        setField(term43542, term43542.getClass(), "_objectIds", null);
        setField(term43542, term43542.getClass(), "_objectIdResolvers", null);
        setField(term43542, term43542.getClass(), "_cache", null);
        setField(term43542, term43542.getClass(), "_factory", null);
        setField(term43542, term43542.getClass(), "_config", null);
        setIntField(term43542, term43542.getClass(), "_featureFlags", 0);
        setField(term43542, term43542.getClass(), "_view", null);
        setField(term43542, term43542.getClass(), "_parser", null);
        setField(term43542, term43542.getClass(), "_injectableValues", null);
        setField(term43542, term43542.getClass(), "_arrayBuilders", null);
        setField(term43542, term43542.getClass(), "_objectBuffer", null);
        setField(term43542, term43542.getClass(), "_dateFormat", null);
        setField(term43542, term43542.getClass(), "_attributes", null);
        setField(term43542, term43542.getClass(), "_currentType", null);
        setField(term43540, term43540.getClass(), "_context", term43542);
        setField(term43540, term43540.getClass(), "_parserFactory", null);
        setBooleanField(term43540, term43540.getClass(), "_unwrapRoot", true);
        setField(term43540, term43540.getClass(), "_filter", null);
        setField(term43540, term43540.getClass(), "_valueType", null);
        setField(term43540, term43540.getClass(), "_rootDeserializer", null);
        setField(term43540, term43540.getClass(), "_valueToUpdate", null);
        setField(term43540, term43540.getClass(), "_schema", null);
        setField(term43540, term43540.getClass(), "_injectableValues", null);
        setField(term43540, term43540.getClass(), "_dataFormatReaders", null);
        setField(term43540, term43540.getClass(), "_rootDeserializers", null);
        term43543 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term43543, term43543.getClass(), "_problemHandlers", null);
        setField(term43543, term43543.getClass(), "_nodeFactory", null);
        setIntField(term43543, term43543.getClass(), "_deserFeatures", -1);
        setIntField(term43543, term43543.getClass(), "_parserFeatures", 0);
        setIntField(term43543, term43543.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term43543, term43543.getClass(), "_formatReadFeatures", 0);
        setIntField(term43543, term43543.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term43543, term43543.getClass(), "_mixIns", null);
        setField(term43543, term43543.getClass(), "_subtypeResolver", null);
        setField(term43543, term43543.getClass(), "_rootName", null);
        setField(term43543, term43543.getClass(), "_view", null);
        setField(term43543, term43543.getClass(), "_attributes", null);
        setField(term43543, term43543.getClass(), "_rootNames", null);
        setField(term43543, term43543.getClass(), "_configOverrides", null);
        setIntField(term43543, term43543.getClass(), "_mapperFeatures", 0);
        setField(term43543, term43543.getClass(), "_base", null);
        term43544 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term43545 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term43544, term43544.getClass(), "_jsonFactory", null);
        setField(term43544, term43544.getClass(), "_typeFactory", null);
        setField(term43544, term43544.getClass(), "_injectableValues", null);
        setField(term43544, term43544.getClass(), "_subtypeResolver", null);
        setField(term43544, term43544.getClass(), "_configOverrides", null);
        setField(term43544, term43544.getClass(), "_mixIns", null);
        setField(term43544, term43544.getClass(), "_serializationConfig", null);
        setField(term43544, term43544.getClass(), "_serializerProvider", null);
        setField(term43544, term43544.getClass(), "_serializerFactory", null);
        setField(term43544, term43544.getClass(), "_deserializationConfig", null);
        setField(term43545, term43545.getClass(), "_objectIds", null);
        setField(term43545, term43545.getClass(), "_objectIdResolvers", null);
        setField(term43545, term43545.getClass(), "_cache", null);
        setField(term43545, term43545.getClass(), "_factory", null);
        setField(term43545, term43545.getClass(), "_config", null);
        setIntField(term43545, term43545.getClass(), "_featureFlags", 0);
        setField(term43545, term43545.getClass(), "_view", null);
        setField(term43545, term43545.getClass(), "_parser", null);
        setField(term43545, term43545.getClass(), "_injectableValues", null);
        setField(term43545, term43545.getClass(), "_arrayBuilders", null);
        setField(term43545, term43545.getClass(), "_objectBuffer", null);
        setField(term43545, term43545.getClass(), "_dateFormat", null);
        setField(term43545, term43545.getClass(), "_attributes", null);
        setField(term43545, term43545.getClass(), "_currentType", null);
        setField(term43544, term43544.getClass(), "_deserializationContext", term43545);
        setField(term43544, term43544.getClass(), "_registeredModuleTypes", null);
        setField(term43544, term43544.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term43295;
        args[1] = term43498;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43540));
        assertTrue(recursiveEquals(term43295, term43543));
        assertTrue(recursiveEquals(term43498, term43544));
    }

};


