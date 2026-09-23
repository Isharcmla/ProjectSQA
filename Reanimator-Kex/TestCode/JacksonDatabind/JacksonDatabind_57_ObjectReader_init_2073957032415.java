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

public class ObjectReader_init_2073957032415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196282;
     Object term196540;
     Object term198233;
     Object term198239;
     Object term198243;

    public ObjectReader_init_2073957032415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term195962 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term196044 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term196082 = newInstance(Class.forName("java.lang.Object"));
        Object term195313 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term196190 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term195962, term195962.getClass(), "_config", null);
        setField(term195962, term195962.getClass(), "_context", null);
        setField(term195962, term195962.getClass(), "_rootDeserializers", term196044);
        setField(term195962, term195962.getClass(), "_parserFactory", null);
        setField(term195962, term195962.getClass(), "_valueType", null);
        setField(term195962, term195962.getClass(), "_valueToUpdate", term196082);
        setField(term195962, term195962.getClass(), "_schema", term195313);
        setField(term195962, term195962.getClass(), "_injectableValues", term196190);
        setBooleanField(term195962, term195962.getClass(), "_unwrapRoot", false);
        term196282 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term196430 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term196282, term196282.getClass(), "_deserializationContext", term196430);
        setField(term196282, term196282.getClass(), "_rootDeserializers", null);
        setField(term196282, term196282.getClass(), "_jsonFactory", null);
        term196540 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term196632 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term196632, term196632.getClass(), "_namespace", null);
        setField(term196632, term196632.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term196540, term196540.getClass(), "_rootName", term196632);
        term198233 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term198234 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term198235 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term198238 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term198234, term198234.getClass(), "_problemHandlers", null);
        setField(term198234, term198234.getClass(), "_nodeFactory", null);
        setIntField(term198234, term198234.getClass(), "_deserFeatures", 0);
        setIntField(term198234, term198234.getClass(), "_parserFeatures", 0);
        setIntField(term198234, term198234.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term198234, term198234.getClass(), "_formatReadFeatures", 0);
        setIntField(term198234, term198234.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term198234, term198234.getClass(), "_mixIns", null);
        setField(term198234, term198234.getClass(), "_subtypeResolver", null);
        setField(term198235, term198235.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term198235, term198235.getClass(), "_namespace", null);
        setField(term198235, term198235.getClass(), "_encodedSimple", null);
        setField(term198234, term198234.getClass(), "_rootName", term198235);
        setField(term198234, term198234.getClass(), "_view", null);
        setField(term198234, term198234.getClass(), "_attributes", null);
        setField(term198234, term198234.getClass(), "_rootNames", null);
        setIntField(term198234, term198234.getClass(), "_mapperFeatures", 0);
        setField(term198234, term198234.getClass(), "_base", null);
        setField(term198233, term198233.getClass(), "_config", term198234);
        setField(term198238, term198238.getClass(), "_objectIds", null);
        setField(term198238, term198238.getClass(), "_objectIdResolvers", null);
        setField(term198238, term198238.getClass(), "_cache", null);
        setField(term198238, term198238.getClass(), "_factory", null);
        setField(term198238, term198238.getClass(), "_config", null);
        setIntField(term198238, term198238.getClass(), "_featureFlags", 0);
        setField(term198238, term198238.getClass(), "_view", null);
        setField(term198238, term198238.getClass(), "_parser", null);
        setField(term198238, term198238.getClass(), "_injectableValues", null);
        setField(term198238, term198238.getClass(), "_arrayBuilders", null);
        setField(term198238, term198238.getClass(), "_objectBuffer", null);
        setField(term198238, term198238.getClass(), "_dateFormat", null);
        setField(term198238, term198238.getClass(), "_attributes", null);
        setField(term198238, term198238.getClass(), "_currentType", null);
        setField(term198233, term198233.getClass(), "_context", term198238);
        setField(term198233, term198233.getClass(), "_parserFactory", null);
        setBooleanField(term198233, term198233.getClass(), "_unwrapRoot", true);
        setField(term198233, term198233.getClass(), "_filter", null);
        setField(term198233, term198233.getClass(), "_valueType", null);
        setField(term198233, term198233.getClass(), "_rootDeserializer", null);
        setField(term198233, term198233.getClass(), "_valueToUpdate", null);
        setField(term198233, term198233.getClass(), "_schema", null);
        setField(term198233, term198233.getClass(), "_injectableValues", null);
        setField(term198233, term198233.getClass(), "_dataFormatReaders", null);
        setField(term198233, term198233.getClass(), "_rootDeserializers", null);
        term198239 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term198240 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term198239, term198239.getClass(), "_problemHandlers", null);
        setField(term198239, term198239.getClass(), "_nodeFactory", null);
        setIntField(term198239, term198239.getClass(), "_deserFeatures", 0);
        setIntField(term198239, term198239.getClass(), "_parserFeatures", 0);
        setIntField(term198239, term198239.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term198239, term198239.getClass(), "_formatReadFeatures", 0);
        setIntField(term198239, term198239.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term198239, term198239.getClass(), "_mixIns", null);
        setField(term198239, term198239.getClass(), "_subtypeResolver", null);
        setField(term198240, term198240.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term198240, term198240.getClass(), "_namespace", null);
        setField(term198240, term198240.getClass(), "_encodedSimple", null);
        setField(term198239, term198239.getClass(), "_rootName", term198240);
        setField(term198239, term198239.getClass(), "_view", null);
        setField(term198239, term198239.getClass(), "_attributes", null);
        setField(term198239, term198239.getClass(), "_rootNames", null);
        setIntField(term198239, term198239.getClass(), "_mapperFeatures", 0);
        setField(term198239, term198239.getClass(), "_base", null);
        term198243 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term198244 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term198243, term198243.getClass(), "_jsonFactory", null);
        setField(term198243, term198243.getClass(), "_typeFactory", null);
        setField(term198243, term198243.getClass(), "_injectableValues", null);
        setField(term198243, term198243.getClass(), "_subtypeResolver", null);
        setField(term198243, term198243.getClass(), "_mixIns", null);
        setField(term198243, term198243.getClass(), "_serializationConfig", null);
        setField(term198243, term198243.getClass(), "_serializerProvider", null);
        setField(term198243, term198243.getClass(), "_serializerFactory", null);
        setField(term198243, term198243.getClass(), "_deserializationConfig", null);
        setField(term198244, term198244.getClass(), "_objectIds", null);
        setField(term198244, term198244.getClass(), "_objectIdResolvers", null);
        setField(term198244, term198244.getClass(), "_cache", null);
        setField(term198244, term198244.getClass(), "_factory", null);
        setField(term198244, term198244.getClass(), "_config", null);
        setIntField(term198244, term198244.getClass(), "_featureFlags", 0);
        setField(term198244, term198244.getClass(), "_view", null);
        setField(term198244, term198244.getClass(), "_parser", null);
        setField(term198244, term198244.getClass(), "_injectableValues", null);
        setField(term198244, term198244.getClass(), "_arrayBuilders", null);
        setField(term198244, term198244.getClass(), "_objectBuffer", null);
        setField(term198244, term198244.getClass(), "_dateFormat", null);
        setField(term198244, term198244.getClass(), "_attributes", null);
        setField(term198244, term198244.getClass(), "_currentType", null);
        setField(term198243, term198243.getClass(), "_deserializationContext", term198244);
        setField(term198243, term198243.getClass(), "_registeredModuleTypes", null);
        setField(term198243, term198243.getClass(), "_rootDeserializers", null);
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
        args[0] = term196282;
        args[1] = term196540;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term198233));
        assertTrue(recursiveEquals(term196282, term198239));
        assertTrue(recursiveEquals(term196540, null));
    }

};


