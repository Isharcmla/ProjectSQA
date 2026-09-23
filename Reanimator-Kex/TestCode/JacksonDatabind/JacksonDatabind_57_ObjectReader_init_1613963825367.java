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

public class ObjectReader_init_1613963825367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136855;
     Object term136965;
     Object term138656;
     Object term138661;
     Object term138665;

    public ObjectReader_init_1613963825367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term136681 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term136763 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term136681, term136681.getClass(), "_config", null);
        setField(term136681, term136681.getClass(), "_context", null);
        setField(term136681, term136681.getClass(), "_rootDeserializers", term136763);
        setField(term136681, term136681.getClass(), "_parserFactory", null);
        setField(term136681, term136681.getClass(), "_valueType", null);
        setField(term136681, term136681.getClass(), "_valueToUpdate", null);
        setField(term136681, term136681.getClass(), "_schema", null);
        setField(term136681, term136681.getClass(), "_injectableValues", null);
        term136855 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term136855, term136855.getClass(), "_deserializationContext", null);
        setField(term136855, term136855.getClass(), "_rootDeserializers", null);
        setField(term136855, term136855.getClass(), "_jsonFactory", null);
        term136965 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term137057 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term137057, term137057.getClass(), "_namespace", null);
        setField(term137057, term137057.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term136965, term136965.getClass(), "_rootName", term137057);
        term138656 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term138657 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term138658 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term138657, term138657.getClass(), "_problemHandlers", null);
        setField(term138657, term138657.getClass(), "_nodeFactory", null);
        setIntField(term138657, term138657.getClass(), "_deserFeatures", 0);
        setIntField(term138657, term138657.getClass(), "_parserFeatures", 0);
        setIntField(term138657, term138657.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term138657, term138657.getClass(), "_formatReadFeatures", 0);
        setIntField(term138657, term138657.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term138657, term138657.getClass(), "_mixIns", null);
        setField(term138657, term138657.getClass(), "_subtypeResolver", null);
        setField(term138658, term138658.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term138658, term138658.getClass(), "_namespace", null);
        setField(term138658, term138658.getClass(), "_encodedSimple", null);
        setField(term138657, term138657.getClass(), "_rootName", term138658);
        setField(term138657, term138657.getClass(), "_view", null);
        setField(term138657, term138657.getClass(), "_attributes", null);
        setField(term138657, term138657.getClass(), "_rootNames", null);
        setIntField(term138657, term138657.getClass(), "_mapperFeatures", 0);
        setField(term138657, term138657.getClass(), "_base", null);
        setField(term138656, term138656.getClass(), "_config", term138657);
        setField(term138656, term138656.getClass(), "_context", null);
        setField(term138656, term138656.getClass(), "_parserFactory", null);
        setBooleanField(term138656, term138656.getClass(), "_unwrapRoot", true);
        setField(term138656, term138656.getClass(), "_filter", null);
        setField(term138656, term138656.getClass(), "_valueType", null);
        setField(term138656, term138656.getClass(), "_rootDeserializer", null);
        setField(term138656, term138656.getClass(), "_valueToUpdate", null);
        setField(term138656, term138656.getClass(), "_schema", null);
        setField(term138656, term138656.getClass(), "_injectableValues", null);
        setField(term138656, term138656.getClass(), "_dataFormatReaders", null);
        setField(term138656, term138656.getClass(), "_rootDeserializers", null);
        term138661 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term138662 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term138661, term138661.getClass(), "_problemHandlers", null);
        setField(term138661, term138661.getClass(), "_nodeFactory", null);
        setIntField(term138661, term138661.getClass(), "_deserFeatures", 0);
        setIntField(term138661, term138661.getClass(), "_parserFeatures", 0);
        setIntField(term138661, term138661.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term138661, term138661.getClass(), "_formatReadFeatures", 0);
        setIntField(term138661, term138661.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term138661, term138661.getClass(), "_mixIns", null);
        setField(term138661, term138661.getClass(), "_subtypeResolver", null);
        setField(term138662, term138662.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term138662, term138662.getClass(), "_namespace", null);
        setField(term138662, term138662.getClass(), "_encodedSimple", null);
        setField(term138661, term138661.getClass(), "_rootName", term138662);
        setField(term138661, term138661.getClass(), "_view", null);
        setField(term138661, term138661.getClass(), "_attributes", null);
        setField(term138661, term138661.getClass(), "_rootNames", null);
        setIntField(term138661, term138661.getClass(), "_mapperFeatures", 0);
        setField(term138661, term138661.getClass(), "_base", null);
        term138665 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term138665, term138665.getClass(), "_jsonFactory", null);
        setField(term138665, term138665.getClass(), "_typeFactory", null);
        setField(term138665, term138665.getClass(), "_injectableValues", null);
        setField(term138665, term138665.getClass(), "_subtypeResolver", null);
        setField(term138665, term138665.getClass(), "_mixIns", null);
        setField(term138665, term138665.getClass(), "_serializationConfig", null);
        setField(term138665, term138665.getClass(), "_serializerProvider", null);
        setField(term138665, term138665.getClass(), "_serializerFactory", null);
        setField(term138665, term138665.getClass(), "_deserializationConfig", null);
        setField(term138665, term138665.getClass(), "_deserializationContext", null);
        setField(term138665, term138665.getClass(), "_registeredModuleTypes", null);
        setField(term138665, term138665.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term136855;
        args[1] = term136965;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term138656));
        assertTrue(recursiveEquals(term136855, term138661));
        assertTrue(recursiveEquals(term136965, term138665));
    }

};


