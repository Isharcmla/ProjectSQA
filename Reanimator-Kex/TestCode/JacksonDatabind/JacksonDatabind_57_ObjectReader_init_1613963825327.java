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

public class ObjectReader_init_1613963825327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99282;
     Object term99540;
     Object term99696;
     Object term99702;
     Object term99706;

    public ObjectReader_init_1613963825327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98524 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term98634 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term98782 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term98864 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term98946 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term99044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term99082 = newInstance(Class.forName("java.lang.Object"));
        Object term98401 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term99190 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term98524, term98524.getClass(), "_config", term98634);
        setField(term98524, term98524.getClass(), "_context", term98782);
        setField(term98524, term98524.getClass(), "_rootDeserializers", term98864);
        setField(term98524, term98524.getClass(), "_parserFactory", term98946);
        setField(term98524, term98524.getClass(), "_valueType", term99044);
        setField(term98524, term98524.getClass(), "_valueToUpdate", term99082);
        setField(term98524, term98524.getClass(), "_schema", term98401);
        setField(term98524, term98524.getClass(), "_injectableValues", term99190);
        term99282 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term99430 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term99282, term99282.getClass(), "_deserializationContext", term99430);
        setField(term99282, term99282.getClass(), "_rootDeserializers", null);
        setField(term99282, term99282.getClass(), "_jsonFactory", null);
        term99540 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term99632 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term99632, term99632.getClass(), "_namespace", "");
        setField(term99540, term99540.getClass(), "_rootName", term99632);
        term99696 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term99697 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term99698 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term99701 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term99697, term99697.getClass(), "_problemHandlers", null);
        setField(term99697, term99697.getClass(), "_nodeFactory", null);
        setIntField(term99697, term99697.getClass(), "_deserFeatures", 0);
        setIntField(term99697, term99697.getClass(), "_parserFeatures", 0);
        setIntField(term99697, term99697.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term99697, term99697.getClass(), "_formatReadFeatures", 0);
        setIntField(term99697, term99697.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term99697, term99697.getClass(), "_mixIns", null);
        setField(term99697, term99697.getClass(), "_subtypeResolver", null);
        setField(term99698, term99698.getClass(), "_simpleName", null);
        setField(term99698, term99698.getClass(), "_namespace", "");
        setField(term99698, term99698.getClass(), "_encodedSimple", null);
        setField(term99697, term99697.getClass(), "_rootName", term99698);
        setField(term99697, term99697.getClass(), "_view", null);
        setField(term99697, term99697.getClass(), "_attributes", null);
        setField(term99697, term99697.getClass(), "_rootNames", null);
        setIntField(term99697, term99697.getClass(), "_mapperFeatures", 0);
        setField(term99697, term99697.getClass(), "_base", null);
        setField(term99696, term99696.getClass(), "_config", term99697);
        setField(term99701, term99701.getClass(), "_objectIds", null);
        setField(term99701, term99701.getClass(), "_objectIdResolvers", null);
        setField(term99701, term99701.getClass(), "_cache", null);
        setField(term99701, term99701.getClass(), "_factory", null);
        setField(term99701, term99701.getClass(), "_config", null);
        setIntField(term99701, term99701.getClass(), "_featureFlags", 0);
        setField(term99701, term99701.getClass(), "_view", null);
        setField(term99701, term99701.getClass(), "_parser", null);
        setField(term99701, term99701.getClass(), "_injectableValues", null);
        setField(term99701, term99701.getClass(), "_arrayBuilders", null);
        setField(term99701, term99701.getClass(), "_objectBuffer", null);
        setField(term99701, term99701.getClass(), "_dateFormat", null);
        setField(term99701, term99701.getClass(), "_attributes", null);
        setField(term99701, term99701.getClass(), "_currentType", null);
        setField(term99696, term99696.getClass(), "_context", term99701);
        setField(term99696, term99696.getClass(), "_parserFactory", null);
        setBooleanField(term99696, term99696.getClass(), "_unwrapRoot", true);
        setField(term99696, term99696.getClass(), "_filter", null);
        setField(term99696, term99696.getClass(), "_valueType", null);
        setField(term99696, term99696.getClass(), "_rootDeserializer", null);
        setField(term99696, term99696.getClass(), "_valueToUpdate", null);
        setField(term99696, term99696.getClass(), "_schema", null);
        setField(term99696, term99696.getClass(), "_injectableValues", null);
        setField(term99696, term99696.getClass(), "_dataFormatReaders", null);
        setField(term99696, term99696.getClass(), "_rootDeserializers", null);
        term99702 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term99703 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term99702, term99702.getClass(), "_problemHandlers", null);
        setField(term99702, term99702.getClass(), "_nodeFactory", null);
        setIntField(term99702, term99702.getClass(), "_deserFeatures", 0);
        setIntField(term99702, term99702.getClass(), "_parserFeatures", 0);
        setIntField(term99702, term99702.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term99702, term99702.getClass(), "_formatReadFeatures", 0);
        setIntField(term99702, term99702.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term99702, term99702.getClass(), "_mixIns", null);
        setField(term99702, term99702.getClass(), "_subtypeResolver", null);
        setField(term99703, term99703.getClass(), "_simpleName", null);
        setField(term99703, term99703.getClass(), "_namespace", "");
        setField(term99703, term99703.getClass(), "_encodedSimple", null);
        setField(term99702, term99702.getClass(), "_rootName", term99703);
        setField(term99702, term99702.getClass(), "_view", null);
        setField(term99702, term99702.getClass(), "_attributes", null);
        setField(term99702, term99702.getClass(), "_rootNames", null);
        setIntField(term99702, term99702.getClass(), "_mapperFeatures", 0);
        setField(term99702, term99702.getClass(), "_base", null);
        term99706 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term99707 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term99706, term99706.getClass(), "_jsonFactory", null);
        setField(term99706, term99706.getClass(), "_typeFactory", null);
        setField(term99706, term99706.getClass(), "_injectableValues", null);
        setField(term99706, term99706.getClass(), "_subtypeResolver", null);
        setField(term99706, term99706.getClass(), "_mixIns", null);
        setField(term99706, term99706.getClass(), "_serializationConfig", null);
        setField(term99706, term99706.getClass(), "_serializerProvider", null);
        setField(term99706, term99706.getClass(), "_serializerFactory", null);
        setField(term99706, term99706.getClass(), "_deserializationConfig", null);
        setField(term99707, term99707.getClass(), "_objectIds", null);
        setField(term99707, term99707.getClass(), "_objectIdResolvers", null);
        setField(term99707, term99707.getClass(), "_cache", null);
        setField(term99707, term99707.getClass(), "_factory", null);
        setField(term99707, term99707.getClass(), "_config", null);
        setIntField(term99707, term99707.getClass(), "_featureFlags", 0);
        setField(term99707, term99707.getClass(), "_view", null);
        setField(term99707, term99707.getClass(), "_parser", null);
        setField(term99707, term99707.getClass(), "_injectableValues", null);
        setField(term99707, term99707.getClass(), "_arrayBuilders", null);
        setField(term99707, term99707.getClass(), "_objectBuffer", null);
        setField(term99707, term99707.getClass(), "_dateFormat", null);
        setField(term99707, term99707.getClass(), "_attributes", null);
        setField(term99707, term99707.getClass(), "_currentType", null);
        setField(term99706, term99706.getClass(), "_deserializationContext", term99707);
        setField(term99706, term99706.getClass(), "_registeredModuleTypes", null);
        setField(term99706, term99706.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term99282;
        args[1] = term99540;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term99696));
        assertTrue(recursiveEquals(term99282, term99702));
        assertTrue(recursiveEquals(term99540, term99706));
    }

};


