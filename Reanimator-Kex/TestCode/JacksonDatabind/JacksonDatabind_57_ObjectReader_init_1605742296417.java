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

public class ObjectReader_init_1605742296417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200304;
     Object term200518;
     Object term200582;
     Object term200585;
     Object term200586;

    public ObjectReader_init_1605742296417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term200212 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term200304 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term200414 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term200304, term200304.getClass(), "_config", term200414);
        term200518 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        term200582 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term200583 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term200584 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        setField(term200583, term200583.getClass(), "_problemHandlers", null);
        setField(term200583, term200583.getClass(), "_nodeFactory", null);
        setIntField(term200583, term200583.getClass(), "_deserFeatures", 0);
        setIntField(term200583, term200583.getClass(), "_parserFeatures", 0);
        setIntField(term200583, term200583.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term200583, term200583.getClass(), "_formatReadFeatures", 0);
        setIntField(term200583, term200583.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term200583, term200583.getClass(), "_mixIns", null);
        setField(term200583, term200583.getClass(), "_subtypeResolver", null);
        setField(term200583, term200583.getClass(), "_rootName", null);
        setField(term200583, term200583.getClass(), "_view", null);
        setField(term200583, term200583.getClass(), "_attributes", null);
        setField(term200583, term200583.getClass(), "_rootNames", null);
        setIntField(term200583, term200583.getClass(), "_mapperFeatures", 0);
        setField(term200583, term200583.getClass(), "_base", null);
        setField(term200582, term200582.getClass(), "_config", term200583);
        setField(term200582, term200582.getClass(), "_context", null);
        setField(term200584, term200584.getClass(), "_rootCharSymbols", null);
        setField(term200584, term200584.getClass(), "_byteSymbolCanonicalizer", null);
        setField(term200584, term200584.getClass(), "_objectCodec", null);
        setIntField(term200584, term200584.getClass(), "_factoryFeatures", 0);
        setIntField(term200584, term200584.getClass(), "_parserFeatures", 0);
        setIntField(term200584, term200584.getClass(), "_generatorFeatures", 0);
        setField(term200584, term200584.getClass(), "_characterEscapes", null);
        setField(term200584, term200584.getClass(), "_inputDecorator", null);
        setField(term200584, term200584.getClass(), "_outputDecorator", null);
        setField(term200584, term200584.getClass(), "_rootValueSeparator", null);
        setField(term200582, term200582.getClass(), "_parserFactory", term200584);
        setBooleanField(term200582, term200582.getClass(), "_unwrapRoot", false);
        setField(term200582, term200582.getClass(), "_filter", null);
        setField(term200582, term200582.getClass(), "_valueType", null);
        setField(term200582, term200582.getClass(), "_rootDeserializer", null);
        setField(term200582, term200582.getClass(), "_valueToUpdate", null);
        setField(term200582, term200582.getClass(), "_schema", null);
        setField(term200582, term200582.getClass(), "_injectableValues", null);
        setField(term200582, term200582.getClass(), "_dataFormatReaders", null);
        setField(term200582, term200582.getClass(), "_rootDeserializers", null);
        term200585 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        setField(term200585, term200585.getClass(), "_rootCharSymbols", null);
        setField(term200585, term200585.getClass(), "_byteSymbolCanonicalizer", null);
        setField(term200585, term200585.getClass(), "_objectCodec", null);
        setIntField(term200585, term200585.getClass(), "_factoryFeatures", 0);
        setIntField(term200585, term200585.getClass(), "_parserFeatures", 0);
        setIntField(term200585, term200585.getClass(), "_generatorFeatures", 0);
        setField(term200585, term200585.getClass(), "_characterEscapes", null);
        setField(term200585, term200585.getClass(), "_inputDecorator", null);
        setField(term200585, term200585.getClass(), "_outputDecorator", null);
        setField(term200585, term200585.getClass(), "_rootValueSeparator", null);
        term200586 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term200587 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term200587, term200587.getClass(), "_problemHandlers", null);
        setField(term200587, term200587.getClass(), "_nodeFactory", null);
        setIntField(term200587, term200587.getClass(), "_deserFeatures", 0);
        setIntField(term200587, term200587.getClass(), "_parserFeatures", 0);
        setIntField(term200587, term200587.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term200587, term200587.getClass(), "_formatReadFeatures", 0);
        setIntField(term200587, term200587.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term200587, term200587.getClass(), "_mixIns", null);
        setField(term200587, term200587.getClass(), "_subtypeResolver", null);
        setField(term200587, term200587.getClass(), "_rootName", null);
        setField(term200587, term200587.getClass(), "_view", null);
        setField(term200587, term200587.getClass(), "_attributes", null);
        setField(term200587, term200587.getClass(), "_rootNames", null);
        setIntField(term200587, term200587.getClass(), "_mapperFeatures", 0);
        setField(term200587, term200587.getClass(), "_base", null);
        setField(term200586, term200586.getClass(), "_config", term200587);
        setField(term200586, term200586.getClass(), "_context", null);
        setField(term200586, term200586.getClass(), "_parserFactory", null);
        setBooleanField(term200586, term200586.getClass(), "_unwrapRoot", false);
        setField(term200586, term200586.getClass(), "_filter", null);
        setField(term200586, term200586.getClass(), "_valueType", null);
        setField(term200586, term200586.getClass(), "_rootDeserializer", null);
        setField(term200586, term200586.getClass(), "_valueToUpdate", null);
        setField(term200586, term200586.getClass(), "_schema", null);
        setField(term200586, term200586.getClass(), "_injectableValues", null);
        setField(term200586, term200586.getClass(), "_dataFormatReaders", null);
        setField(term200586, term200586.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term200304;
        args[1] = term200518;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term200582));
        assertTrue(recursiveEquals(term200304, term200585));
        assertTrue(recursiveEquals(term200518, term200586));
    }

};


