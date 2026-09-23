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

public class ObjectReader_init_1605742296357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127672;
     Object term127864;
     Object term127955;
     Object term127958;
     Object term127959;

    public ObjectReader_init_1605742296357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term127580 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term127672 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term127782 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term127782, term127782.getClass(), "_mapperFeatures", -1);
        setField(term127672, term127672.getClass(), "_config", term127782);
        term127864 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term127955 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term127956 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term127957 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term127956, term127956.getClass(), "_problemHandlers", null);
        setField(term127956, term127956.getClass(), "_nodeFactory", null);
        setIntField(term127956, term127956.getClass(), "_deserFeatures", 0);
        setIntField(term127956, term127956.getClass(), "_parserFeatures", 0);
        setIntField(term127956, term127956.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term127956, term127956.getClass(), "_formatReadFeatures", 0);
        setIntField(term127956, term127956.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term127956, term127956.getClass(), "_mixIns", null);
        setField(term127956, term127956.getClass(), "_subtypeResolver", null);
        setField(term127956, term127956.getClass(), "_rootName", null);
        setField(term127956, term127956.getClass(), "_view", null);
        setField(term127956, term127956.getClass(), "_attributes", null);
        setField(term127956, term127956.getClass(), "_rootNames", null);
        setIntField(term127956, term127956.getClass(), "_mapperFeatures", -32769);
        setField(term127956, term127956.getClass(), "_base", null);
        setField(term127955, term127955.getClass(), "_config", term127956);
        setField(term127955, term127955.getClass(), "_context", null);
        setField(term127957, term127957.getClass(), "_rootCharSymbols", null);
        setField(term127957, term127957.getClass(), "_byteSymbolCanonicalizer", null);
        setField(term127957, term127957.getClass(), "_objectCodec", null);
        setIntField(term127957, term127957.getClass(), "_factoryFeatures", 0);
        setIntField(term127957, term127957.getClass(), "_parserFeatures", 0);
        setIntField(term127957, term127957.getClass(), "_generatorFeatures", 0);
        setField(term127957, term127957.getClass(), "_characterEscapes", null);
        setField(term127957, term127957.getClass(), "_inputDecorator", null);
        setField(term127957, term127957.getClass(), "_outputDecorator", null);
        setField(term127957, term127957.getClass(), "_rootValueSeparator", null);
        setField(term127955, term127955.getClass(), "_parserFactory", term127957);
        setBooleanField(term127955, term127955.getClass(), "_unwrapRoot", false);
        setField(term127955, term127955.getClass(), "_filter", null);
        setField(term127955, term127955.getClass(), "_valueType", null);
        setField(term127955, term127955.getClass(), "_rootDeserializer", null);
        setField(term127955, term127955.getClass(), "_valueToUpdate", null);
        setField(term127955, term127955.getClass(), "_schema", null);
        setField(term127955, term127955.getClass(), "_injectableValues", null);
        setField(term127955, term127955.getClass(), "_dataFormatReaders", null);
        setField(term127955, term127955.getClass(), "_rootDeserializers", null);
        term127958 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term127958, term127958.getClass(), "_rootCharSymbols", null);
        setField(term127958, term127958.getClass(), "_byteSymbolCanonicalizer", null);
        setField(term127958, term127958.getClass(), "_objectCodec", null);
        setIntField(term127958, term127958.getClass(), "_factoryFeatures", 0);
        setIntField(term127958, term127958.getClass(), "_parserFeatures", 0);
        setIntField(term127958, term127958.getClass(), "_generatorFeatures", 0);
        setField(term127958, term127958.getClass(), "_characterEscapes", null);
        setField(term127958, term127958.getClass(), "_inputDecorator", null);
        setField(term127958, term127958.getClass(), "_outputDecorator", null);
        setField(term127958, term127958.getClass(), "_rootValueSeparator", null);
        term127959 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term127960 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term127960, term127960.getClass(), "_problemHandlers", null);
        setField(term127960, term127960.getClass(), "_nodeFactory", null);
        setIntField(term127960, term127960.getClass(), "_deserFeatures", 0);
        setIntField(term127960, term127960.getClass(), "_parserFeatures", 0);
        setIntField(term127960, term127960.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term127960, term127960.getClass(), "_formatReadFeatures", 0);
        setIntField(term127960, term127960.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term127960, term127960.getClass(), "_mixIns", null);
        setField(term127960, term127960.getClass(), "_subtypeResolver", null);
        setField(term127960, term127960.getClass(), "_rootName", null);
        setField(term127960, term127960.getClass(), "_view", null);
        setField(term127960, term127960.getClass(), "_attributes", null);
        setField(term127960, term127960.getClass(), "_rootNames", null);
        setIntField(term127960, term127960.getClass(), "_mapperFeatures", -1);
        setField(term127960, term127960.getClass(), "_base", null);
        setField(term127959, term127959.getClass(), "_config", term127960);
        setField(term127959, term127959.getClass(), "_context", null);
        setField(term127959, term127959.getClass(), "_parserFactory", null);
        setBooleanField(term127959, term127959.getClass(), "_unwrapRoot", false);
        setField(term127959, term127959.getClass(), "_filter", null);
        setField(term127959, term127959.getClass(), "_valueType", null);
        setField(term127959, term127959.getClass(), "_rootDeserializer", null);
        setField(term127959, term127959.getClass(), "_valueToUpdate", null);
        setField(term127959, term127959.getClass(), "_schema", null);
        setField(term127959, term127959.getClass(), "_injectableValues", null);
        setField(term127959, term127959.getClass(), "_dataFormatReaders", null);
        setField(term127959, term127959.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term127672;
        args[1] = term127864;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term127955));
        assertTrue(recursiveEquals(term127672, term127958));
        assertTrue(recursiveEquals(term127864, term127959));
    }

};


