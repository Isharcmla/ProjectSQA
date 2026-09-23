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

public class ObjectReader_init_2073957032347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116312;
     Object term116570;
     Object term116613;
     Object term116616;
     Object term116617;

    public ObjectReader_init_2073957032347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term116110 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term116220 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term116110, term116110.getClass(), "_config", term116220);
        setField(term116110, term116110.getClass(), "_context", null);
        setField(term116110, term116110.getClass(), "_rootDeserializers", null);
        setField(term116110, term116110.getClass(), "_parserFactory", null);
        setField(term116110, term116110.getClass(), "_valueType", null);
        setField(term116110, term116110.getClass(), "_valueToUpdate", null);
        setField(term116110, term116110.getClass(), "_schema", null);
        setField(term116110, term116110.getClass(), "_injectableValues", null);
        setBooleanField(term116110, term116110.getClass(), "_unwrapRoot", false);
        term116312 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term116460 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term116312, term116312.getClass(), "_deserializationContext", term116460);
        setField(term116312, term116312.getClass(), "_rootDeserializers", null);
        setField(term116312, term116312.getClass(), "_jsonFactory", null);
        term116570 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term116570, term116570.getClass(), "_rootName", null);
        setIntField(term116570, term116570.getClass(), "_deserFeatures", -1);
        term116613 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term116614 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term116615 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term116614, term116614.getClass(), "_problemHandlers", null);
        setField(term116614, term116614.getClass(), "_nodeFactory", null);
        setIntField(term116614, term116614.getClass(), "_deserFeatures", -1);
        setIntField(term116614, term116614.getClass(), "_parserFeatures", 0);
        setIntField(term116614, term116614.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term116614, term116614.getClass(), "_formatReadFeatures", 0);
        setIntField(term116614, term116614.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term116614, term116614.getClass(), "_mixIns", null);
        setField(term116614, term116614.getClass(), "_subtypeResolver", null);
        setField(term116614, term116614.getClass(), "_rootName", null);
        setField(term116614, term116614.getClass(), "_view", null);
        setField(term116614, term116614.getClass(), "_attributes", null);
        setField(term116614, term116614.getClass(), "_rootNames", null);
        setIntField(term116614, term116614.getClass(), "_mapperFeatures", 0);
        setField(term116614, term116614.getClass(), "_base", null);
        setField(term116613, term116613.getClass(), "_config", term116614);
        setField(term116615, term116615.getClass(), "_objectIds", null);
        setField(term116615, term116615.getClass(), "_objectIdResolvers", null);
        setField(term116615, term116615.getClass(), "_cache", null);
        setField(term116615, term116615.getClass(), "_factory", null);
        setField(term116615, term116615.getClass(), "_config", null);
        setIntField(term116615, term116615.getClass(), "_featureFlags", 0);
        setField(term116615, term116615.getClass(), "_view", null);
        setField(term116615, term116615.getClass(), "_parser", null);
        setField(term116615, term116615.getClass(), "_injectableValues", null);
        setField(term116615, term116615.getClass(), "_arrayBuilders", null);
        setField(term116615, term116615.getClass(), "_objectBuffer", null);
        setField(term116615, term116615.getClass(), "_dateFormat", null);
        setField(term116615, term116615.getClass(), "_attributes", null);
        setField(term116615, term116615.getClass(), "_currentType", null);
        setField(term116613, term116613.getClass(), "_context", term116615);
        setField(term116613, term116613.getClass(), "_parserFactory", null);
        setBooleanField(term116613, term116613.getClass(), "_unwrapRoot", true);
        setField(term116613, term116613.getClass(), "_filter", null);
        setField(term116613, term116613.getClass(), "_valueType", null);
        setField(term116613, term116613.getClass(), "_rootDeserializer", null);
        setField(term116613, term116613.getClass(), "_valueToUpdate", null);
        setField(term116613, term116613.getClass(), "_schema", null);
        setField(term116613, term116613.getClass(), "_injectableValues", null);
        setField(term116613, term116613.getClass(), "_dataFormatReaders", null);
        setField(term116613, term116613.getClass(), "_rootDeserializers", null);
        term116616 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term116616, term116616.getClass(), "_problemHandlers", null);
        setField(term116616, term116616.getClass(), "_nodeFactory", null);
        setIntField(term116616, term116616.getClass(), "_deserFeatures", -1);
        setIntField(term116616, term116616.getClass(), "_parserFeatures", 0);
        setIntField(term116616, term116616.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term116616, term116616.getClass(), "_formatReadFeatures", 0);
        setIntField(term116616, term116616.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term116616, term116616.getClass(), "_mixIns", null);
        setField(term116616, term116616.getClass(), "_subtypeResolver", null);
        setField(term116616, term116616.getClass(), "_rootName", null);
        setField(term116616, term116616.getClass(), "_view", null);
        setField(term116616, term116616.getClass(), "_attributes", null);
        setField(term116616, term116616.getClass(), "_rootNames", null);
        setIntField(term116616, term116616.getClass(), "_mapperFeatures", 0);
        setField(term116616, term116616.getClass(), "_base", null);
        term116617 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term116618 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term116617, term116617.getClass(), "_jsonFactory", null);
        setField(term116617, term116617.getClass(), "_typeFactory", null);
        setField(term116617, term116617.getClass(), "_injectableValues", null);
        setField(term116617, term116617.getClass(), "_subtypeResolver", null);
        setField(term116617, term116617.getClass(), "_mixIns", null);
        setField(term116617, term116617.getClass(), "_serializationConfig", null);
        setField(term116617, term116617.getClass(), "_serializerProvider", null);
        setField(term116617, term116617.getClass(), "_serializerFactory", null);
        setField(term116617, term116617.getClass(), "_deserializationConfig", null);
        setField(term116618, term116618.getClass(), "_objectIds", null);
        setField(term116618, term116618.getClass(), "_objectIdResolvers", null);
        setField(term116618, term116618.getClass(), "_cache", null);
        setField(term116618, term116618.getClass(), "_factory", null);
        setField(term116618, term116618.getClass(), "_config", null);
        setIntField(term116618, term116618.getClass(), "_featureFlags", 0);
        setField(term116618, term116618.getClass(), "_view", null);
        setField(term116618, term116618.getClass(), "_parser", null);
        setField(term116618, term116618.getClass(), "_injectableValues", null);
        setField(term116618, term116618.getClass(), "_arrayBuilders", null);
        setField(term116618, term116618.getClass(), "_objectBuffer", null);
        setField(term116618, term116618.getClass(), "_dateFormat", null);
        setField(term116618, term116618.getClass(), "_attributes", null);
        setField(term116618, term116618.getClass(), "_currentType", null);
        setField(term116617, term116617.getClass(), "_deserializationContext", term116618);
        setField(term116617, term116617.getClass(), "_registeredModuleTypes", null);
        setField(term116617, term116617.getClass(), "_rootDeserializers", null);
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
        args[0] = term116312;
        args[1] = term116570;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116613));
        assertTrue(recursiveEquals(term116312, term116616));
        assertTrue(recursiveEquals(term116570, null));
    }

};


