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

public class ObjectReader_init_2073957032431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213043;
     Object term213153;
     Object term213308;
     Object term213313;
     Object term213317;

    public ObjectReader_init_2073957032431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term212723 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term212805 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term212843 = newInstance(Class.forName("java.lang.Object"));
        Object term212951 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term212723, term212723.getClass(), "_config", null);
        setField(term212723, term212723.getClass(), "_context", null);
        setField(term212723, term212723.getClass(), "_rootDeserializers", term212805);
        setField(term212723, term212723.getClass(), "_parserFactory", null);
        setField(term212723, term212723.getClass(), "_valueType", null);
        setField(term212723, term212723.getClass(), "_valueToUpdate", term212843);
        setField(term212723, term212723.getClass(), "_schema", null);
        setField(term212723, term212723.getClass(), "_injectableValues", term212951);
        setBooleanField(term212723, term212723.getClass(), "_unwrapRoot", false);
        term213043 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term213043, term213043.getClass(), "_deserializationContext", null);
        setField(term213043, term213043.getClass(), "_rootDeserializers", null);
        setField(term213043, term213043.getClass(), "_jsonFactory", null);
        term213153 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term213245 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term213245, term213245.getClass(), "_namespace", null);
        setField(term213245, term213245.getClass(), "_simpleName", "");
        setField(term213153, term213153.getClass(), "_rootName", term213245);
        term213308 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term213309 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term213310 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term213309, term213309.getClass(), "_problemHandlers", null);
        setField(term213309, term213309.getClass(), "_nodeFactory", null);
        setIntField(term213309, term213309.getClass(), "_deserFeatures", 0);
        setIntField(term213309, term213309.getClass(), "_parserFeatures", 0);
        setIntField(term213309, term213309.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term213309, term213309.getClass(), "_formatReadFeatures", 0);
        setIntField(term213309, term213309.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term213309, term213309.getClass(), "_mixIns", null);
        setField(term213309, term213309.getClass(), "_subtypeResolver", null);
        setField(term213310, term213310.getClass(), "_simpleName", "");
        setField(term213310, term213310.getClass(), "_namespace", null);
        setField(term213310, term213310.getClass(), "_encodedSimple", null);
        setField(term213309, term213309.getClass(), "_rootName", term213310);
        setField(term213309, term213309.getClass(), "_view", null);
        setField(term213309, term213309.getClass(), "_attributes", null);
        setField(term213309, term213309.getClass(), "_rootNames", null);
        setIntField(term213309, term213309.getClass(), "_mapperFeatures", 0);
        setField(term213309, term213309.getClass(), "_base", null);
        setField(term213308, term213308.getClass(), "_config", term213309);
        setField(term213308, term213308.getClass(), "_context", null);
        setField(term213308, term213308.getClass(), "_parserFactory", null);
        setBooleanField(term213308, term213308.getClass(), "_unwrapRoot", false);
        setField(term213308, term213308.getClass(), "_filter", null);
        setField(term213308, term213308.getClass(), "_valueType", null);
        setField(term213308, term213308.getClass(), "_rootDeserializer", null);
        setField(term213308, term213308.getClass(), "_valueToUpdate", null);
        setField(term213308, term213308.getClass(), "_schema", null);
        setField(term213308, term213308.getClass(), "_injectableValues", null);
        setField(term213308, term213308.getClass(), "_dataFormatReaders", null);
        setField(term213308, term213308.getClass(), "_rootDeserializers", null);
        term213313 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term213314 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term213313, term213313.getClass(), "_problemHandlers", null);
        setField(term213313, term213313.getClass(), "_nodeFactory", null);
        setIntField(term213313, term213313.getClass(), "_deserFeatures", 0);
        setIntField(term213313, term213313.getClass(), "_parserFeatures", 0);
        setIntField(term213313, term213313.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term213313, term213313.getClass(), "_formatReadFeatures", 0);
        setIntField(term213313, term213313.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term213313, term213313.getClass(), "_mixIns", null);
        setField(term213313, term213313.getClass(), "_subtypeResolver", null);
        setField(term213314, term213314.getClass(), "_simpleName", "");
        setField(term213314, term213314.getClass(), "_namespace", null);
        setField(term213314, term213314.getClass(), "_encodedSimple", null);
        setField(term213313, term213313.getClass(), "_rootName", term213314);
        setField(term213313, term213313.getClass(), "_view", null);
        setField(term213313, term213313.getClass(), "_attributes", null);
        setField(term213313, term213313.getClass(), "_rootNames", null);
        setIntField(term213313, term213313.getClass(), "_mapperFeatures", 0);
        setField(term213313, term213313.getClass(), "_base", null);
        term213317 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term213317, term213317.getClass(), "_jsonFactory", null);
        setField(term213317, term213317.getClass(), "_typeFactory", null);
        setField(term213317, term213317.getClass(), "_injectableValues", null);
        setField(term213317, term213317.getClass(), "_subtypeResolver", null);
        setField(term213317, term213317.getClass(), "_mixIns", null);
        setField(term213317, term213317.getClass(), "_serializationConfig", null);
        setField(term213317, term213317.getClass(), "_serializerProvider", null);
        setField(term213317, term213317.getClass(), "_serializerFactory", null);
        setField(term213317, term213317.getClass(), "_deserializationConfig", null);
        setField(term213317, term213317.getClass(), "_deserializationContext", null);
        setField(term213317, term213317.getClass(), "_registeredModuleTypes", null);
        setField(term213317, term213317.getClass(), "_rootDeserializers", null);
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
        args[0] = term213043;
        args[1] = term213153;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term213308));
        assertTrue(recursiveEquals(term213043, term213313));
        assertTrue(recursiveEquals(term213153, null));
    }

};


