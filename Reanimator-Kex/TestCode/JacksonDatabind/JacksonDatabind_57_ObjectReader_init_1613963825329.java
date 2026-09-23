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

public class ObjectReader_init_1613963825329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100547;
     Object term100805;
     Object term100962;
     Object term100968;
     Object term100972;

    public ObjectReader_init_1613963825329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99883 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term100031 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term100113 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term100195 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term100309 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term100347 = newInstance(Class.forName("java.lang.Object"));
        Object term99759 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term100455 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term99883, term99883.getClass(), "_config", null);
        setField(term99883, term99883.getClass(), "_context", term100031);
        setField(term99883, term99883.getClass(), "_rootDeserializers", term100113);
        setField(term99883, term99883.getClass(), "_parserFactory", term100195);
        setField(term99883, term99883.getClass(), "_valueType", term100309);
        setField(term99883, term99883.getClass(), "_valueToUpdate", term100347);
        setField(term99883, term99883.getClass(), "_schema", term99759);
        setField(term99883, term99883.getClass(), "_injectableValues", term100455);
        term100547 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term100695 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term100547, term100547.getClass(), "_deserializationContext", term100695);
        setField(term100547, term100547.getClass(), "_rootDeserializers", null);
        setField(term100547, term100547.getClass(), "_jsonFactory", null);
        term100805 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term100897 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term100897, term100897.getClass(), "_namespace", null);
        setField(term100897, term100897.getClass(), "_simpleName", "");
        setField(term100805, term100805.getClass(), "_rootName", term100897);
        term100962 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term100963 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term100964 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term100967 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term100963, term100963.getClass(), "_problemHandlers", null);
        setField(term100963, term100963.getClass(), "_nodeFactory", null);
        setIntField(term100963, term100963.getClass(), "_deserFeatures", 0);
        setIntField(term100963, term100963.getClass(), "_parserFeatures", 0);
        setIntField(term100963, term100963.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term100963, term100963.getClass(), "_formatReadFeatures", 0);
        setIntField(term100963, term100963.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term100963, term100963.getClass(), "_mixIns", null);
        setField(term100963, term100963.getClass(), "_subtypeResolver", null);
        setField(term100964, term100964.getClass(), "_simpleName", "");
        setField(term100964, term100964.getClass(), "_namespace", null);
        setField(term100964, term100964.getClass(), "_encodedSimple", null);
        setField(term100963, term100963.getClass(), "_rootName", term100964);
        setField(term100963, term100963.getClass(), "_view", null);
        setField(term100963, term100963.getClass(), "_attributes", null);
        setField(term100963, term100963.getClass(), "_rootNames", null);
        setIntField(term100963, term100963.getClass(), "_mapperFeatures", 0);
        setField(term100963, term100963.getClass(), "_base", null);
        setField(term100962, term100962.getClass(), "_config", term100963);
        setField(term100967, term100967.getClass(), "_objectIds", null);
        setField(term100967, term100967.getClass(), "_objectIdResolvers", null);
        setField(term100967, term100967.getClass(), "_cache", null);
        setField(term100967, term100967.getClass(), "_factory", null);
        setField(term100967, term100967.getClass(), "_config", null);
        setIntField(term100967, term100967.getClass(), "_featureFlags", 0);
        setField(term100967, term100967.getClass(), "_view", null);
        setField(term100967, term100967.getClass(), "_parser", null);
        setField(term100967, term100967.getClass(), "_injectableValues", null);
        setField(term100967, term100967.getClass(), "_arrayBuilders", null);
        setField(term100967, term100967.getClass(), "_objectBuffer", null);
        setField(term100967, term100967.getClass(), "_dateFormat", null);
        setField(term100967, term100967.getClass(), "_attributes", null);
        setField(term100967, term100967.getClass(), "_currentType", null);
        setField(term100962, term100962.getClass(), "_context", term100967);
        setField(term100962, term100962.getClass(), "_parserFactory", null);
        setBooleanField(term100962, term100962.getClass(), "_unwrapRoot", false);
        setField(term100962, term100962.getClass(), "_filter", null);
        setField(term100962, term100962.getClass(), "_valueType", null);
        setField(term100962, term100962.getClass(), "_rootDeserializer", null);
        setField(term100962, term100962.getClass(), "_valueToUpdate", null);
        setField(term100962, term100962.getClass(), "_schema", null);
        setField(term100962, term100962.getClass(), "_injectableValues", null);
        setField(term100962, term100962.getClass(), "_dataFormatReaders", null);
        setField(term100962, term100962.getClass(), "_rootDeserializers", null);
        term100968 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term100969 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term100968, term100968.getClass(), "_problemHandlers", null);
        setField(term100968, term100968.getClass(), "_nodeFactory", null);
        setIntField(term100968, term100968.getClass(), "_deserFeatures", 0);
        setIntField(term100968, term100968.getClass(), "_parserFeatures", 0);
        setIntField(term100968, term100968.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term100968, term100968.getClass(), "_formatReadFeatures", 0);
        setIntField(term100968, term100968.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term100968, term100968.getClass(), "_mixIns", null);
        setField(term100968, term100968.getClass(), "_subtypeResolver", null);
        setField(term100969, term100969.getClass(), "_simpleName", "");
        setField(term100969, term100969.getClass(), "_namespace", null);
        setField(term100969, term100969.getClass(), "_encodedSimple", null);
        setField(term100968, term100968.getClass(), "_rootName", term100969);
        setField(term100968, term100968.getClass(), "_view", null);
        setField(term100968, term100968.getClass(), "_attributes", null);
        setField(term100968, term100968.getClass(), "_rootNames", null);
        setIntField(term100968, term100968.getClass(), "_mapperFeatures", 0);
        setField(term100968, term100968.getClass(), "_base", null);
        term100972 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term100973 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term100972, term100972.getClass(), "_jsonFactory", null);
        setField(term100972, term100972.getClass(), "_typeFactory", null);
        setField(term100972, term100972.getClass(), "_injectableValues", null);
        setField(term100972, term100972.getClass(), "_subtypeResolver", null);
        setField(term100972, term100972.getClass(), "_mixIns", null);
        setField(term100972, term100972.getClass(), "_serializationConfig", null);
        setField(term100972, term100972.getClass(), "_serializerProvider", null);
        setField(term100972, term100972.getClass(), "_serializerFactory", null);
        setField(term100972, term100972.getClass(), "_deserializationConfig", null);
        setField(term100973, term100973.getClass(), "_objectIds", null);
        setField(term100973, term100973.getClass(), "_objectIdResolvers", null);
        setField(term100973, term100973.getClass(), "_cache", null);
        setField(term100973, term100973.getClass(), "_factory", null);
        setField(term100973, term100973.getClass(), "_config", null);
        setIntField(term100973, term100973.getClass(), "_featureFlags", 0);
        setField(term100973, term100973.getClass(), "_view", null);
        setField(term100973, term100973.getClass(), "_parser", null);
        setField(term100973, term100973.getClass(), "_injectableValues", null);
        setField(term100973, term100973.getClass(), "_arrayBuilders", null);
        setField(term100973, term100973.getClass(), "_objectBuffer", null);
        setField(term100973, term100973.getClass(), "_dateFormat", null);
        setField(term100973, term100973.getClass(), "_attributes", null);
        setField(term100973, term100973.getClass(), "_currentType", null);
        setField(term100972, term100972.getClass(), "_deserializationContext", term100973);
        setField(term100972, term100972.getClass(), "_registeredModuleTypes", null);
        setField(term100972, term100972.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term100547;
        args[1] = term100805;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term100962));
        assertTrue(recursiveEquals(term100547, term100968));
        assertTrue(recursiveEquals(term100805, term100972));
    }

};


