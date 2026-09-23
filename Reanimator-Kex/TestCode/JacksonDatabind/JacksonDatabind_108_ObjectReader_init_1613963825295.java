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

public class ObjectReader_init_1613963825295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63779;
     Object term64037;
     Object term64192;
     Object term64198;
     Object term64202;

    public ObjectReader_init_1613963825295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63023 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term63133 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term63281 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term63363 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term63445 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term63541 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term63579 = newInstance(Class.forName("java.lang.Object"));
        Object term62901 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term63687 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term63023, term63023.getClass(), "_config", term63133);
        setField(term63023, term63023.getClass(), "_context", term63281);
        setField(term63023, term63023.getClass(), "_rootDeserializers", term63363);
        setField(term63023, term63023.getClass(), "_parserFactory", term63445);
        setField(term63023, term63023.getClass(), "_valueType", term63541);
        setField(term63023, term63023.getClass(), "_valueToUpdate", term63579);
        setField(term63023, term63023.getClass(), "_schema", term62901);
        setField(term63023, term63023.getClass(), "_injectableValues", term63687);
        term63779 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term63927 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term63779, term63779.getClass(), "_deserializationContext", term63927);
        setField(term63779, term63779.getClass(), "_rootDeserializers", null);
        setField(term63779, term63779.getClass(), "_jsonFactory", null);
        term64037 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term64129 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term64129, term64129.getClass(), "_namespace", "");
        setField(term64037, term64037.getClass(), "_rootName", term64129);
        term64192 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term64193 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term64194 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term64197 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term64193, term64193.getClass(), "_problemHandlers", null);
        setField(term64193, term64193.getClass(), "_nodeFactory", null);
        setIntField(term64193, term64193.getClass(), "_deserFeatures", 0);
        setIntField(term64193, term64193.getClass(), "_parserFeatures", 0);
        setIntField(term64193, term64193.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term64193, term64193.getClass(), "_formatReadFeatures", 0);
        setIntField(term64193, term64193.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term64193, term64193.getClass(), "_mixIns", null);
        setField(term64193, term64193.getClass(), "_subtypeResolver", null);
        setField(term64194, term64194.getClass(), "_simpleName", null);
        setField(term64194, term64194.getClass(), "_namespace", "");
        setField(term64194, term64194.getClass(), "_encodedSimple", null);
        setField(term64193, term64193.getClass(), "_rootName", term64194);
        setField(term64193, term64193.getClass(), "_view", null);
        setField(term64193, term64193.getClass(), "_attributes", null);
        setField(term64193, term64193.getClass(), "_rootNames", null);
        setField(term64193, term64193.getClass(), "_configOverrides", null);
        setIntField(term64193, term64193.getClass(), "_mapperFeatures", 0);
        setField(term64193, term64193.getClass(), "_base", null);
        setField(term64192, term64192.getClass(), "_config", term64193);
        setField(term64197, term64197.getClass(), "_objectIds", null);
        setField(term64197, term64197.getClass(), "_objectIdResolvers", null);
        setField(term64197, term64197.getClass(), "_cache", null);
        setField(term64197, term64197.getClass(), "_factory", null);
        setField(term64197, term64197.getClass(), "_config", null);
        setIntField(term64197, term64197.getClass(), "_featureFlags", 0);
        setField(term64197, term64197.getClass(), "_view", null);
        setField(term64197, term64197.getClass(), "_parser", null);
        setField(term64197, term64197.getClass(), "_injectableValues", null);
        setField(term64197, term64197.getClass(), "_arrayBuilders", null);
        setField(term64197, term64197.getClass(), "_objectBuffer", null);
        setField(term64197, term64197.getClass(), "_dateFormat", null);
        setField(term64197, term64197.getClass(), "_attributes", null);
        setField(term64197, term64197.getClass(), "_currentType", null);
        setField(term64192, term64192.getClass(), "_context", term64197);
        setField(term64192, term64192.getClass(), "_parserFactory", null);
        setBooleanField(term64192, term64192.getClass(), "_unwrapRoot", true);
        setField(term64192, term64192.getClass(), "_filter", null);
        setField(term64192, term64192.getClass(), "_valueType", null);
        setField(term64192, term64192.getClass(), "_rootDeserializer", null);
        setField(term64192, term64192.getClass(), "_valueToUpdate", null);
        setField(term64192, term64192.getClass(), "_schema", null);
        setField(term64192, term64192.getClass(), "_injectableValues", null);
        setField(term64192, term64192.getClass(), "_dataFormatReaders", null);
        setField(term64192, term64192.getClass(), "_rootDeserializers", null);
        term64198 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term64199 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term64198, term64198.getClass(), "_problemHandlers", null);
        setField(term64198, term64198.getClass(), "_nodeFactory", null);
        setIntField(term64198, term64198.getClass(), "_deserFeatures", 0);
        setIntField(term64198, term64198.getClass(), "_parserFeatures", 0);
        setIntField(term64198, term64198.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term64198, term64198.getClass(), "_formatReadFeatures", 0);
        setIntField(term64198, term64198.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term64198, term64198.getClass(), "_mixIns", null);
        setField(term64198, term64198.getClass(), "_subtypeResolver", null);
        setField(term64199, term64199.getClass(), "_simpleName", null);
        setField(term64199, term64199.getClass(), "_namespace", "");
        setField(term64199, term64199.getClass(), "_encodedSimple", null);
        setField(term64198, term64198.getClass(), "_rootName", term64199);
        setField(term64198, term64198.getClass(), "_view", null);
        setField(term64198, term64198.getClass(), "_attributes", null);
        setField(term64198, term64198.getClass(), "_rootNames", null);
        setField(term64198, term64198.getClass(), "_configOverrides", null);
        setIntField(term64198, term64198.getClass(), "_mapperFeatures", 0);
        setField(term64198, term64198.getClass(), "_base", null);
        term64202 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term64203 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term64202, term64202.getClass(), "_jsonFactory", null);
        setField(term64202, term64202.getClass(), "_typeFactory", null);
        setField(term64202, term64202.getClass(), "_injectableValues", null);
        setField(term64202, term64202.getClass(), "_subtypeResolver", null);
        setField(term64202, term64202.getClass(), "_configOverrides", null);
        setField(term64202, term64202.getClass(), "_mixIns", null);
        setField(term64202, term64202.getClass(), "_serializationConfig", null);
        setField(term64202, term64202.getClass(), "_serializerProvider", null);
        setField(term64202, term64202.getClass(), "_serializerFactory", null);
        setField(term64202, term64202.getClass(), "_deserializationConfig", null);
        setField(term64203, term64203.getClass(), "_objectIds", null);
        setField(term64203, term64203.getClass(), "_objectIdResolvers", null);
        setField(term64203, term64203.getClass(), "_cache", null);
        setField(term64203, term64203.getClass(), "_factory", null);
        setField(term64203, term64203.getClass(), "_config", null);
        setIntField(term64203, term64203.getClass(), "_featureFlags", 0);
        setField(term64203, term64203.getClass(), "_view", null);
        setField(term64203, term64203.getClass(), "_parser", null);
        setField(term64203, term64203.getClass(), "_injectableValues", null);
        setField(term64203, term64203.getClass(), "_arrayBuilders", null);
        setField(term64203, term64203.getClass(), "_objectBuffer", null);
        setField(term64203, term64203.getClass(), "_dateFormat", null);
        setField(term64203, term64203.getClass(), "_attributes", null);
        setField(term64203, term64203.getClass(), "_currentType", null);
        setField(term64202, term64202.getClass(), "_deserializationContext", term64203);
        setField(term64202, term64202.getClass(), "_registeredModuleTypes", null);
        setField(term64202, term64202.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term63779;
        args[1] = term64037;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term64192));
        assertTrue(recursiveEquals(term63779, term64198));
        assertTrue(recursiveEquals(term64037, term64202));
    }

};


