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

public class ObjectReader_init_2073957032265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44963;
     Object term45221;
     Object term45335;
     Object term45422;
     Object term45426;
     Object term45427;
     Object term45428;

    public ObjectReader_init_2073957032265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44761 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term44871 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term44761, term44761.getClass(), "_config", term44871);
        setField(term44761, term44761.getClass(), "_context", null);
        setField(term44761, term44761.getClass(), "_rootDeserializers", null);
        setField(term44761, term44761.getClass(), "_parserFactory", null);
        setField(term44761, term44761.getClass(), "_valueType", null);
        setField(term44761, term44761.getClass(), "_valueToUpdate", null);
        setField(term44761, term44761.getClass(), "_schema", null);
        setField(term44761, term44761.getClass(), "_injectableValues", null);
        setBooleanField(term44761, term44761.getClass(), "_unwrapRoot", false);
        term44963 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term45111 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term44963, term44963.getClass(), "_deserializationContext", term45111);
        setField(term44963, term44963.getClass(), "_rootDeserializers", null);
        setField(term44963, term44963.getClass(), "_jsonFactory", null);
        term45221 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term45221, term45221.getClass(), "_rootName", null);
        setIntField(term45221, term45221.getClass(), "_deserFeatures", 0);
        term45335 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term45422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term45423 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term45424 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term45425 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term45423, term45423.getClass(), "_problemHandlers", null);
        setField(term45423, term45423.getClass(), "_nodeFactory", null);
        setIntField(term45423, term45423.getClass(), "_deserFeatures", 0);
        setIntField(term45423, term45423.getClass(), "_parserFeatures", 0);
        setIntField(term45423, term45423.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term45423, term45423.getClass(), "_formatReadFeatures", 0);
        setIntField(term45423, term45423.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term45423, term45423.getClass(), "_mixIns", null);
        setField(term45423, term45423.getClass(), "_subtypeResolver", null);
        setField(term45423, term45423.getClass(), "_rootName", null);
        setField(term45423, term45423.getClass(), "_view", null);
        setField(term45423, term45423.getClass(), "_attributes", null);
        setField(term45423, term45423.getClass(), "_rootNames", null);
        setIntField(term45423, term45423.getClass(), "_mapperFeatures", 0);
        setField(term45423, term45423.getClass(), "_base", null);
        setField(term45422, term45422.getClass(), "_config", term45423);
        setField(term45424, term45424.getClass(), "_objectIds", null);
        setField(term45424, term45424.getClass(), "_objectIdResolvers", null);
        setField(term45424, term45424.getClass(), "_cache", null);
        setField(term45424, term45424.getClass(), "_factory", null);
        setField(term45424, term45424.getClass(), "_config", null);
        setIntField(term45424, term45424.getClass(), "_featureFlags", 0);
        setField(term45424, term45424.getClass(), "_view", null);
        setField(term45424, term45424.getClass(), "_parser", null);
        setField(term45424, term45424.getClass(), "_injectableValues", null);
        setField(term45424, term45424.getClass(), "_arrayBuilders", null);
        setField(term45424, term45424.getClass(), "_objectBuffer", null);
        setField(term45424, term45424.getClass(), "_dateFormat", null);
        setField(term45424, term45424.getClass(), "_attributes", null);
        setField(term45424, term45424.getClass(), "_currentType", null);
        setField(term45422, term45422.getClass(), "_context", term45424);
        setField(term45422, term45422.getClass(), "_parserFactory", null);
        setBooleanField(term45422, term45422.getClass(), "_unwrapRoot", false);
        setField(term45422, term45422.getClass(), "_filter", null);
        setField(term45425, term45425.getClass(), "_elementType", null);
        setField(term45425, term45425.getClass(), "_superClass", null);
        setField(term45425, term45425.getClass(), "_superInterfaces", null);
        setField(term45425, term45425.getClass(), "_bindings", null);
        setField(term45425, term45425.getClass(), "_canonicalName", null);
        setField(term45425, term45425.getClass(), "_class", null);
        setIntField(term45425, term45425.getClass(), "_hash", 0);
        setField(term45425, term45425.getClass(), "_valueHandler", null);
        setField(term45425, term45425.getClass(), "_typeHandler", null);
        setBooleanField(term45425, term45425.getClass(), "_asStatic", false);
        setField(term45422, term45422.getClass(), "_valueType", term45425);
        setField(term45422, term45422.getClass(), "_rootDeserializer", null);
        setField(term45422, term45422.getClass(), "_valueToUpdate", null);
        setField(term45422, term45422.getClass(), "_schema", null);
        setField(term45422, term45422.getClass(), "_injectableValues", null);
        setField(term45422, term45422.getClass(), "_dataFormatReaders", null);
        setField(term45422, term45422.getClass(), "_rootDeserializers", null);
        term45426 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term45426, term45426.getClass(), "_problemHandlers", null);
        setField(term45426, term45426.getClass(), "_nodeFactory", null);
        setIntField(term45426, term45426.getClass(), "_deserFeatures", 0);
        setIntField(term45426, term45426.getClass(), "_parserFeatures", 0);
        setIntField(term45426, term45426.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term45426, term45426.getClass(), "_formatReadFeatures", 0);
        setIntField(term45426, term45426.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term45426, term45426.getClass(), "_mixIns", null);
        setField(term45426, term45426.getClass(), "_subtypeResolver", null);
        setField(term45426, term45426.getClass(), "_rootName", null);
        setField(term45426, term45426.getClass(), "_view", null);
        setField(term45426, term45426.getClass(), "_attributes", null);
        setField(term45426, term45426.getClass(), "_rootNames", null);
        setIntField(term45426, term45426.getClass(), "_mapperFeatures", 0);
        setField(term45426, term45426.getClass(), "_base", null);
        term45427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term45427, term45427.getClass(), "_elementType", null);
        setField(term45427, term45427.getClass(), "_superClass", null);
        setField(term45427, term45427.getClass(), "_superInterfaces", null);
        setField(term45427, term45427.getClass(), "_bindings", null);
        setField(term45427, term45427.getClass(), "_canonicalName", null);
        setField(term45427, term45427.getClass(), "_class", null);
        setIntField(term45427, term45427.getClass(), "_hash", 0);
        setField(term45427, term45427.getClass(), "_valueHandler", null);
        setField(term45427, term45427.getClass(), "_typeHandler", null);
        setBooleanField(term45427, term45427.getClass(), "_asStatic", false);
        term45428 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term45429 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term45428, term45428.getClass(), "_jsonFactory", null);
        setField(term45428, term45428.getClass(), "_typeFactory", null);
        setField(term45428, term45428.getClass(), "_injectableValues", null);
        setField(term45428, term45428.getClass(), "_subtypeResolver", null);
        setField(term45428, term45428.getClass(), "_mixIns", null);
        setField(term45428, term45428.getClass(), "_serializationConfig", null);
        setField(term45428, term45428.getClass(), "_serializerProvider", null);
        setField(term45428, term45428.getClass(), "_serializerFactory", null);
        setField(term45428, term45428.getClass(), "_deserializationConfig", null);
        setField(term45429, term45429.getClass(), "_objectIds", null);
        setField(term45429, term45429.getClass(), "_objectIdResolvers", null);
        setField(term45429, term45429.getClass(), "_cache", null);
        setField(term45429, term45429.getClass(), "_factory", null);
        setField(term45429, term45429.getClass(), "_config", null);
        setIntField(term45429, term45429.getClass(), "_featureFlags", 0);
        setField(term45429, term45429.getClass(), "_view", null);
        setField(term45429, term45429.getClass(), "_parser", null);
        setField(term45429, term45429.getClass(), "_injectableValues", null);
        setField(term45429, term45429.getClass(), "_arrayBuilders", null);
        setField(term45429, term45429.getClass(), "_objectBuffer", null);
        setField(term45429, term45429.getClass(), "_dateFormat", null);
        setField(term45429, term45429.getClass(), "_attributes", null);
        setField(term45429, term45429.getClass(), "_currentType", null);
        setField(term45428, term45428.getClass(), "_deserializationContext", term45429);
        setField(term45428, term45428.getClass(), "_registeredModuleTypes", null);
        setField(term45428, term45428.getClass(), "_rootDeserializers", null);
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
        args[0] = term44963;
        args[1] = term45221;
        args[2] = term45335;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45422));
        assertTrue(recursiveEquals(term44963, term45426));
        assertTrue(recursiveEquals(term45221, term45427));
        assertTrue(recursiveEquals(term45335, term45428));
    }

};


