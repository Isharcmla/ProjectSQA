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

public class ObjectReader_init_2073957032277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48502;
     Object term48760;
     Object term48864;
     Object term48950;
     Object term48954;
     Object term48955;
     Object term48956;

    public ObjectReader_init_2073957032277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48152 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term48262 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48410 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term48152, term48152.getClass(), "_config", term48262);
        setField(term48152, term48152.getClass(), "_context", term48410);
        setField(term48152, term48152.getClass(), "_rootDeserializers", null);
        setField(term48152, term48152.getClass(), "_parserFactory", null);
        setField(term48152, term48152.getClass(), "_valueType", null);
        setField(term48152, term48152.getClass(), "_valueToUpdate", null);
        setField(term48152, term48152.getClass(), "_schema", null);
        setField(term48152, term48152.getClass(), "_injectableValues", null);
        setBooleanField(term48152, term48152.getClass(), "_unwrapRoot", false);
        term48502 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term48650 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term48502, term48502.getClass(), "_deserializationContext", term48650);
        setField(term48502, term48502.getClass(), "_rootDeserializers", null);
        setField(term48502, term48502.getClass(), "_jsonFactory", null);
        term48760 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term48760, term48760.getClass(), "_rootName", null);
        setIntField(term48760, term48760.getClass(), "_deserFeatures", 0);
        term48864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term48950 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term48951 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48952 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term48953 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term48951, term48951.getClass(), "_problemHandlers", null);
        setField(term48951, term48951.getClass(), "_nodeFactory", null);
        setIntField(term48951, term48951.getClass(), "_deserFeatures", 0);
        setIntField(term48951, term48951.getClass(), "_parserFeatures", 0);
        setIntField(term48951, term48951.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term48951, term48951.getClass(), "_formatReadFeatures", 0);
        setIntField(term48951, term48951.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term48951, term48951.getClass(), "_mixIns", null);
        setField(term48951, term48951.getClass(), "_subtypeResolver", null);
        setField(term48951, term48951.getClass(), "_rootName", null);
        setField(term48951, term48951.getClass(), "_view", null);
        setField(term48951, term48951.getClass(), "_attributes", null);
        setField(term48951, term48951.getClass(), "_rootNames", null);
        setField(term48951, term48951.getClass(), "_configOverrides", null);
        setIntField(term48951, term48951.getClass(), "_mapperFeatures", 0);
        setField(term48951, term48951.getClass(), "_base", null);
        setField(term48950, term48950.getClass(), "_config", term48951);
        setField(term48952, term48952.getClass(), "_objectIds", null);
        setField(term48952, term48952.getClass(), "_objectIdResolvers", null);
        setField(term48952, term48952.getClass(), "_cache", null);
        setField(term48952, term48952.getClass(), "_factory", null);
        setField(term48952, term48952.getClass(), "_config", null);
        setIntField(term48952, term48952.getClass(), "_featureFlags", 0);
        setField(term48952, term48952.getClass(), "_view", null);
        setField(term48952, term48952.getClass(), "_parser", null);
        setField(term48952, term48952.getClass(), "_injectableValues", null);
        setField(term48952, term48952.getClass(), "_arrayBuilders", null);
        setField(term48952, term48952.getClass(), "_objectBuffer", null);
        setField(term48952, term48952.getClass(), "_dateFormat", null);
        setField(term48952, term48952.getClass(), "_attributes", null);
        setField(term48952, term48952.getClass(), "_currentType", null);
        setField(term48950, term48950.getClass(), "_context", term48952);
        setField(term48950, term48950.getClass(), "_parserFactory", null);
        setBooleanField(term48950, term48950.getClass(), "_unwrapRoot", false);
        setField(term48950, term48950.getClass(), "_filter", null);
        setField(term48953, term48953.getClass(), "_referencedType", null);
        setField(term48953, term48953.getClass(), "_anchorType", null);
        setField(term48953, term48953.getClass(), "_superClass", null);
        setField(term48953, term48953.getClass(), "_superInterfaces", null);
        setField(term48953, term48953.getClass(), "_bindings", null);
        setField(term48953, term48953.getClass(), "_canonicalName", null);
        setField(term48953, term48953.getClass(), "_class", null);
        setIntField(term48953, term48953.getClass(), "_hash", 0);
        setField(term48953, term48953.getClass(), "_valueHandler", null);
        setField(term48953, term48953.getClass(), "_typeHandler", null);
        setBooleanField(term48953, term48953.getClass(), "_asStatic", false);
        setField(term48950, term48950.getClass(), "_valueType", term48953);
        setField(term48950, term48950.getClass(), "_rootDeserializer", null);
        setField(term48950, term48950.getClass(), "_valueToUpdate", null);
        setField(term48950, term48950.getClass(), "_schema", null);
        setField(term48950, term48950.getClass(), "_injectableValues", null);
        setField(term48950, term48950.getClass(), "_dataFormatReaders", null);
        setField(term48950, term48950.getClass(), "_rootDeserializers", null);
        term48954 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term48954, term48954.getClass(), "_problemHandlers", null);
        setField(term48954, term48954.getClass(), "_nodeFactory", null);
        setIntField(term48954, term48954.getClass(), "_deserFeatures", 0);
        setIntField(term48954, term48954.getClass(), "_parserFeatures", 0);
        setIntField(term48954, term48954.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term48954, term48954.getClass(), "_formatReadFeatures", 0);
        setIntField(term48954, term48954.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term48954, term48954.getClass(), "_mixIns", null);
        setField(term48954, term48954.getClass(), "_subtypeResolver", null);
        setField(term48954, term48954.getClass(), "_rootName", null);
        setField(term48954, term48954.getClass(), "_view", null);
        setField(term48954, term48954.getClass(), "_attributes", null);
        setField(term48954, term48954.getClass(), "_rootNames", null);
        setField(term48954, term48954.getClass(), "_configOverrides", null);
        setIntField(term48954, term48954.getClass(), "_mapperFeatures", 0);
        setField(term48954, term48954.getClass(), "_base", null);
        term48955 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term48955, term48955.getClass(), "_referencedType", null);
        setField(term48955, term48955.getClass(), "_anchorType", null);
        setField(term48955, term48955.getClass(), "_superClass", null);
        setField(term48955, term48955.getClass(), "_superInterfaces", null);
        setField(term48955, term48955.getClass(), "_bindings", null);
        setField(term48955, term48955.getClass(), "_canonicalName", null);
        setField(term48955, term48955.getClass(), "_class", null);
        setIntField(term48955, term48955.getClass(), "_hash", 0);
        setField(term48955, term48955.getClass(), "_valueHandler", null);
        setField(term48955, term48955.getClass(), "_typeHandler", null);
        setBooleanField(term48955, term48955.getClass(), "_asStatic", false);
        term48956 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term48957 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term48956, term48956.getClass(), "_jsonFactory", null);
        setField(term48956, term48956.getClass(), "_typeFactory", null);
        setField(term48956, term48956.getClass(), "_injectableValues", null);
        setField(term48956, term48956.getClass(), "_subtypeResolver", null);
        setField(term48956, term48956.getClass(), "_configOverrides", null);
        setField(term48956, term48956.getClass(), "_mixIns", null);
        setField(term48956, term48956.getClass(), "_serializationConfig", null);
        setField(term48956, term48956.getClass(), "_serializerProvider", null);
        setField(term48956, term48956.getClass(), "_serializerFactory", null);
        setField(term48956, term48956.getClass(), "_deserializationConfig", null);
        setField(term48957, term48957.getClass(), "_objectIds", null);
        setField(term48957, term48957.getClass(), "_objectIdResolvers", null);
        setField(term48957, term48957.getClass(), "_cache", null);
        setField(term48957, term48957.getClass(), "_factory", null);
        setField(term48957, term48957.getClass(), "_config", null);
        setIntField(term48957, term48957.getClass(), "_featureFlags", 0);
        setField(term48957, term48957.getClass(), "_view", null);
        setField(term48957, term48957.getClass(), "_parser", null);
        setField(term48957, term48957.getClass(), "_injectableValues", null);
        setField(term48957, term48957.getClass(), "_arrayBuilders", null);
        setField(term48957, term48957.getClass(), "_objectBuffer", null);
        setField(term48957, term48957.getClass(), "_dateFormat", null);
        setField(term48957, term48957.getClass(), "_attributes", null);
        setField(term48957, term48957.getClass(), "_currentType", null);
        setField(term48956, term48956.getClass(), "_deserializationContext", term48957);
        setField(term48956, term48956.getClass(), "_registeredModuleTypes", null);
        setField(term48956, term48956.getClass(), "_rootDeserializers", null);
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
        args[0] = term48502;
        args[1] = term48760;
        args[2] = term48864;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48950));
        assertTrue(recursiveEquals(term48502, term48954));
        assertTrue(recursiveEquals(term48760, term48955));
        assertTrue(recursiveEquals(term48864, term48956));
    }

};


