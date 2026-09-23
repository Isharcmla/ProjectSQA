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

public class ObjectReader_init_1605742296340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116906;
     Object term117120;
     Object term117219;
     Object term117222;
     Object term117223;

    public ObjectReader_init_1605742296340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term116814 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term116906 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term117016 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term117016, term117016.getClass(), "_mapperFeatures", -1);
        setField(term116906, term116906.getClass(), "_config", term117016);
        term117120 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        term117219 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term117220 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term117221 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        setField(term117220, term117220.getClass(), "_problemHandlers", null);
        setField(term117220, term117220.getClass(), "_nodeFactory", null);
        setIntField(term117220, term117220.getClass(), "_deserFeatures", 0);
        setIntField(term117220, term117220.getClass(), "_parserFeatures", 0);
        setIntField(term117220, term117220.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term117220, term117220.getClass(), "_formatReadFeatures", 0);
        setIntField(term117220, term117220.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term117220, term117220.getClass(), "_mixIns", null);
        setField(term117220, term117220.getClass(), "_subtypeResolver", null);
        setField(term117220, term117220.getClass(), "_rootName", null);
        setField(term117220, term117220.getClass(), "_view", null);
        setField(term117220, term117220.getClass(), "_attributes", null);
        setField(term117220, term117220.getClass(), "_rootNames", null);
        setField(term117220, term117220.getClass(), "_configOverrides", null);
        setIntField(term117220, term117220.getClass(), "_mapperFeatures", -131073);
        setField(term117220, term117220.getClass(), "_base", null);
        setField(term117219, term117219.getClass(), "_config", term117220);
        setField(term117219, term117219.getClass(), "_context", null);
        setField(term117221, term117221.getClass(), "_rootCharSymbols", null);
        setField(term117221, term117221.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term117221, term117221.getClass(), "_factoryFeatures", 0);
        setIntField(term117221, term117221.getClass(), "_parserFeatures", 0);
        setIntField(term117221, term117221.getClass(), "_generatorFeatures", 0);
        setField(term117221, term117221.getClass(), "_objectCodec", null);
        setField(term117221, term117221.getClass(), "_characterEscapes", null);
        setField(term117221, term117221.getClass(), "_inputDecorator", null);
        setField(term117221, term117221.getClass(), "_outputDecorator", null);
        setField(term117221, term117221.getClass(), "_rootValueSeparator", null);
        setIntField(term117221, term117221.getClass(), "_maximumNonEscapedChar", 0);
        setField(term117219, term117219.getClass(), "_parserFactory", term117221);
        setBooleanField(term117219, term117219.getClass(), "_unwrapRoot", false);
        setField(term117219, term117219.getClass(), "_filter", null);
        setField(term117219, term117219.getClass(), "_valueType", null);
        setField(term117219, term117219.getClass(), "_rootDeserializer", null);
        setField(term117219, term117219.getClass(), "_valueToUpdate", null);
        setField(term117219, term117219.getClass(), "_schema", null);
        setField(term117219, term117219.getClass(), "_injectableValues", null);
        setField(term117219, term117219.getClass(), "_dataFormatReaders", null);
        setField(term117219, term117219.getClass(), "_rootDeserializers", null);
        term117222 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        setField(term117222, term117222.getClass(), "_rootCharSymbols", null);
        setField(term117222, term117222.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term117222, term117222.getClass(), "_factoryFeatures", 0);
        setIntField(term117222, term117222.getClass(), "_parserFeatures", 0);
        setIntField(term117222, term117222.getClass(), "_generatorFeatures", 0);
        setField(term117222, term117222.getClass(), "_objectCodec", null);
        setField(term117222, term117222.getClass(), "_characterEscapes", null);
        setField(term117222, term117222.getClass(), "_inputDecorator", null);
        setField(term117222, term117222.getClass(), "_outputDecorator", null);
        setField(term117222, term117222.getClass(), "_rootValueSeparator", null);
        setIntField(term117222, term117222.getClass(), "_maximumNonEscapedChar", 0);
        term117223 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term117224 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term117224, term117224.getClass(), "_problemHandlers", null);
        setField(term117224, term117224.getClass(), "_nodeFactory", null);
        setIntField(term117224, term117224.getClass(), "_deserFeatures", 0);
        setIntField(term117224, term117224.getClass(), "_parserFeatures", 0);
        setIntField(term117224, term117224.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term117224, term117224.getClass(), "_formatReadFeatures", 0);
        setIntField(term117224, term117224.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term117224, term117224.getClass(), "_mixIns", null);
        setField(term117224, term117224.getClass(), "_subtypeResolver", null);
        setField(term117224, term117224.getClass(), "_rootName", null);
        setField(term117224, term117224.getClass(), "_view", null);
        setField(term117224, term117224.getClass(), "_attributes", null);
        setField(term117224, term117224.getClass(), "_rootNames", null);
        setField(term117224, term117224.getClass(), "_configOverrides", null);
        setIntField(term117224, term117224.getClass(), "_mapperFeatures", -1);
        setField(term117224, term117224.getClass(), "_base", null);
        setField(term117223, term117223.getClass(), "_config", term117224);
        setField(term117223, term117223.getClass(), "_context", null);
        setField(term117223, term117223.getClass(), "_parserFactory", null);
        setBooleanField(term117223, term117223.getClass(), "_unwrapRoot", false);
        setField(term117223, term117223.getClass(), "_filter", null);
        setField(term117223, term117223.getClass(), "_valueType", null);
        setField(term117223, term117223.getClass(), "_rootDeserializer", null);
        setField(term117223, term117223.getClass(), "_valueToUpdate", null);
        setField(term117223, term117223.getClass(), "_schema", null);
        setField(term117223, term117223.getClass(), "_injectableValues", null);
        setField(term117223, term117223.getClass(), "_dataFormatReaders", null);
        setField(term117223, term117223.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term116906;
        args[1] = term117120;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term117219));
        assertTrue(recursiveEquals(term116906, term117222));
        assertTrue(recursiveEquals(term117120, term117223));
    }

};


