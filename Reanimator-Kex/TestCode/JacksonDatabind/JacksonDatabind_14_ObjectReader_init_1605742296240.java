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

public class ObjectReader_init_1605742296240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41709;
     Object term41901;
     Object term41961;
     Object term41964;
     Object term41965;

    public ObjectReader_init_1605742296240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41617 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term41709 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41819 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term41709, term41709.getClass(), "_config", term41819);
        term41901 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term41961 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41962 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term41963 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setIntField(term41962, term41962.getClass(), "_deserFeatures", 0);
        setField(term41962, term41962.getClass(), "_problemHandlers", null);
        setField(term41962, term41962.getClass(), "_nodeFactory", null);
        setIntField(term41962, term41962.getClass(), "_parserFeatures", 0);
        setIntField(term41962, term41962.getClass(), "_parserFeaturesToChange", 0);
        setField(term41962, term41962.getClass(), "_mixInAnnotations", null);
        setField(term41962, term41962.getClass(), "_subtypeResolver", null);
        setField(term41962, term41962.getClass(), "_rootName", null);
        setField(term41962, term41962.getClass(), "_view", null);
        setField(term41962, term41962.getClass(), "_attributes", null);
        setIntField(term41962, term41962.getClass(), "_mapperFeatures", 0);
        setField(term41962, term41962.getClass(), "_base", null);
        setField(term41961, term41961.getClass(), "_config", term41962);
        setField(term41961, term41961.getClass(), "_context", null);
        setField(term41963, term41963.getClass(), "_rootCharSymbols", null);
        setField(term41963, term41963.getClass(), "_rootByteSymbols", null);
        setField(term41963, term41963.getClass(), "_objectCodec", null);
        setIntField(term41963, term41963.getClass(), "_factoryFeatures", 0);
        setIntField(term41963, term41963.getClass(), "_parserFeatures", 0);
        setIntField(term41963, term41963.getClass(), "_generatorFeatures", 0);
        setField(term41963, term41963.getClass(), "_characterEscapes", null);
        setField(term41963, term41963.getClass(), "_inputDecorator", null);
        setField(term41963, term41963.getClass(), "_outputDecorator", null);
        setField(term41963, term41963.getClass(), "_rootValueSeparator", null);
        setField(term41961, term41961.getClass(), "_parserFactory", term41963);
        setBooleanField(term41961, term41961.getClass(), "_unwrapRoot", false);
        setField(term41961, term41961.getClass(), "_valueType", null);
        setField(term41961, term41961.getClass(), "_rootDeserializer", null);
        setField(term41961, term41961.getClass(), "_valueToUpdate", null);
        setField(term41961, term41961.getClass(), "_schema", null);
        setField(term41961, term41961.getClass(), "_injectableValues", null);
        setField(term41961, term41961.getClass(), "_dataFormatReaders", null);
        setField(term41961, term41961.getClass(), "_rootDeserializers", null);
        setField(term41961, term41961.getClass(), "_rootNames", null);
        term41964 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term41964, term41964.getClass(), "_rootCharSymbols", null);
        setField(term41964, term41964.getClass(), "_rootByteSymbols", null);
        setField(term41964, term41964.getClass(), "_objectCodec", null);
        setIntField(term41964, term41964.getClass(), "_factoryFeatures", 0);
        setIntField(term41964, term41964.getClass(), "_parserFeatures", 0);
        setIntField(term41964, term41964.getClass(), "_generatorFeatures", 0);
        setField(term41964, term41964.getClass(), "_characterEscapes", null);
        setField(term41964, term41964.getClass(), "_inputDecorator", null);
        setField(term41964, term41964.getClass(), "_outputDecorator", null);
        setField(term41964, term41964.getClass(), "_rootValueSeparator", null);
        term41965 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term41966 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term41966, term41966.getClass(), "_deserFeatures", 0);
        setField(term41966, term41966.getClass(), "_problemHandlers", null);
        setField(term41966, term41966.getClass(), "_nodeFactory", null);
        setIntField(term41966, term41966.getClass(), "_parserFeatures", 0);
        setIntField(term41966, term41966.getClass(), "_parserFeaturesToChange", 0);
        setField(term41966, term41966.getClass(), "_mixInAnnotations", null);
        setField(term41966, term41966.getClass(), "_subtypeResolver", null);
        setField(term41966, term41966.getClass(), "_rootName", null);
        setField(term41966, term41966.getClass(), "_view", null);
        setField(term41966, term41966.getClass(), "_attributes", null);
        setIntField(term41966, term41966.getClass(), "_mapperFeatures", 0);
        setField(term41966, term41966.getClass(), "_base", null);
        setField(term41965, term41965.getClass(), "_config", term41966);
        setField(term41965, term41965.getClass(), "_context", null);
        setField(term41965, term41965.getClass(), "_parserFactory", null);
        setBooleanField(term41965, term41965.getClass(), "_unwrapRoot", false);
        setField(term41965, term41965.getClass(), "_valueType", null);
        setField(term41965, term41965.getClass(), "_rootDeserializer", null);
        setField(term41965, term41965.getClass(), "_valueToUpdate", null);
        setField(term41965, term41965.getClass(), "_schema", null);
        setField(term41965, term41965.getClass(), "_injectableValues", null);
        setField(term41965, term41965.getClass(), "_dataFormatReaders", null);
        setField(term41965, term41965.getClass(), "_rootDeserializers", null);
        setField(term41965, term41965.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term41709;
        args[1] = term41901;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41961));
        assertTrue(recursiveEquals(term41709, term41964));
        assertTrue(recursiveEquals(term41901, term41965));
    }

};


