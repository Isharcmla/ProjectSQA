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

public class ObjectReader_init_2022192560345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114598;
     Object term114856;
     Object term114948;
     Object term115038;
     Object term115044;
     Object term115045;
     Object term115046;

    public ObjectReader_init_2022192560345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114396 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term114506 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term114396, term114396.getClass(), "_config", term114506);
        setField(term114396, term114396.getClass(), "_context", null);
        setField(term114396, term114396.getClass(), "_rootDeserializers", null);
        setField(term114396, term114396.getClass(), "_parserFactory", null);
        setField(term114396, term114396.getClass(), "_valueType", null);
        setField(term114396, term114396.getClass(), "_rootDeserializer", null);
        setField(term114396, term114396.getClass(), "_valueToUpdate", null);
        setField(term114396, term114396.getClass(), "_schema", null);
        setField(term114396, term114396.getClass(), "_injectableValues", null);
        term114598 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term114746 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term114598, term114598.getClass(), "_context", term114746);
        setField(term114598, term114598.getClass(), "_rootDeserializers", null);
        setField(term114598, term114598.getClass(), "_parserFactory", null);
        term114856 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term114856, term114856.getClass(), "_rootName", null);
        setIntField(term114856, term114856.getClass(), "_deserFeatures", -1);
        term114948 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term115038 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term115039 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term115040 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term115041 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term115039, term115039.getClass(), "_problemHandlers", null);
        setField(term115039, term115039.getClass(), "_nodeFactory", null);
        setIntField(term115039, term115039.getClass(), "_deserFeatures", -1);
        setIntField(term115039, term115039.getClass(), "_parserFeatures", 0);
        setIntField(term115039, term115039.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term115039, term115039.getClass(), "_formatReadFeatures", 0);
        setIntField(term115039, term115039.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term115039, term115039.getClass(), "_mixIns", null);
        setField(term115039, term115039.getClass(), "_subtypeResolver", null);
        setField(term115039, term115039.getClass(), "_rootName", null);
        setField(term115039, term115039.getClass(), "_view", null);
        setField(term115039, term115039.getClass(), "_attributes", null);
        setField(term115039, term115039.getClass(), "_rootNames", null);
        setIntField(term115039, term115039.getClass(), "_mapperFeatures", 0);
        setField(term115039, term115039.getClass(), "_base", null);
        setField(term115038, term115038.getClass(), "_config", term115039);
        setField(term115040, term115040.getClass(), "_objectIds", null);
        setField(term115040, term115040.getClass(), "_objectIdResolvers", null);
        setField(term115040, term115040.getClass(), "_cache", null);
        setField(term115040, term115040.getClass(), "_factory", null);
        setField(term115040, term115040.getClass(), "_config", null);
        setIntField(term115040, term115040.getClass(), "_featureFlags", 0);
        setField(term115040, term115040.getClass(), "_view", null);
        setField(term115040, term115040.getClass(), "_parser", null);
        setField(term115040, term115040.getClass(), "_injectableValues", null);
        setField(term115040, term115040.getClass(), "_arrayBuilders", null);
        setField(term115040, term115040.getClass(), "_objectBuffer", null);
        setField(term115040, term115040.getClass(), "_dateFormat", null);
        setField(term115040, term115040.getClass(), "_attributes", null);
        setField(term115040, term115040.getClass(), "_currentType", null);
        setField(term115038, term115038.getClass(), "_context", term115040);
        setField(term115038, term115038.getClass(), "_parserFactory", null);
        setBooleanField(term115038, term115038.getClass(), "_unwrapRoot", true);
        setField(term115038, term115038.getClass(), "_filter", null);
        setField(term115041, term115041.getClass(), "_keyType", null);
        setField(term115041, term115041.getClass(), "_valueType", null);
        setField(term115041, term115041.getClass(), "_superClass", null);
        setField(term115041, term115041.getClass(), "_superInterfaces", null);
        setField(term115041, term115041.getClass(), "_bindings", null);
        setField(term115041, term115041.getClass(), "_canonicalName", null);
        setField(term115041, term115041.getClass(), "_class", null);
        setIntField(term115041, term115041.getClass(), "_hash", 0);
        setField(term115041, term115041.getClass(), "_valueHandler", null);
        setField(term115041, term115041.getClass(), "_typeHandler", null);
        setBooleanField(term115041, term115041.getClass(), "_asStatic", false);
        setField(term115038, term115038.getClass(), "_valueType", term115041);
        setField(term115038, term115038.getClass(), "_rootDeserializer", null);
        setField(term115038, term115038.getClass(), "_valueToUpdate", "");
        setField(term115038, term115038.getClass(), "_schema", null);
        setField(term115038, term115038.getClass(), "_injectableValues", null);
        setField(term115038, term115038.getClass(), "_dataFormatReaders", null);
        setField(term115038, term115038.getClass(), "_rootDeserializers", null);
        term115044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term115044, term115044.getClass(), "_keyType", null);
        setField(term115044, term115044.getClass(), "_valueType", null);
        setField(term115044, term115044.getClass(), "_superClass", null);
        setField(term115044, term115044.getClass(), "_superInterfaces", null);
        setField(term115044, term115044.getClass(), "_bindings", null);
        setField(term115044, term115044.getClass(), "_canonicalName", null);
        setField(term115044, term115044.getClass(), "_class", null);
        setIntField(term115044, term115044.getClass(), "_hash", 0);
        setField(term115044, term115044.getClass(), "_valueHandler", null);
        setField(term115044, term115044.getClass(), "_typeHandler", null);
        setBooleanField(term115044, term115044.getClass(), "_asStatic", false);
        term115045 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term115045, term115045.getClass(), "_problemHandlers", null);
        setField(term115045, term115045.getClass(), "_nodeFactory", null);
        setIntField(term115045, term115045.getClass(), "_deserFeatures", -1);
        setIntField(term115045, term115045.getClass(), "_parserFeatures", 0);
        setIntField(term115045, term115045.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term115045, term115045.getClass(), "_formatReadFeatures", 0);
        setIntField(term115045, term115045.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term115045, term115045.getClass(), "_mixIns", null);
        setField(term115045, term115045.getClass(), "_subtypeResolver", null);
        setField(term115045, term115045.getClass(), "_rootName", null);
        setField(term115045, term115045.getClass(), "_view", null);
        setField(term115045, term115045.getClass(), "_attributes", null);
        setField(term115045, term115045.getClass(), "_rootNames", null);
        setIntField(term115045, term115045.getClass(), "_mapperFeatures", 0);
        setField(term115045, term115045.getClass(), "_base", null);
        term115046 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term115047 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term115046, term115046.getClass(), "_config", null);
        setField(term115047, term115047.getClass(), "_objectIds", null);
        setField(term115047, term115047.getClass(), "_objectIdResolvers", null);
        setField(term115047, term115047.getClass(), "_cache", null);
        setField(term115047, term115047.getClass(), "_factory", null);
        setField(term115047, term115047.getClass(), "_config", null);
        setIntField(term115047, term115047.getClass(), "_featureFlags", 0);
        setField(term115047, term115047.getClass(), "_view", null);
        setField(term115047, term115047.getClass(), "_parser", null);
        setField(term115047, term115047.getClass(), "_injectableValues", null);
        setField(term115047, term115047.getClass(), "_arrayBuilders", null);
        setField(term115047, term115047.getClass(), "_objectBuffer", null);
        setField(term115047, term115047.getClass(), "_dateFormat", null);
        setField(term115047, term115047.getClass(), "_attributes", null);
        setField(term115047, term115047.getClass(), "_currentType", null);
        setField(term115046, term115046.getClass(), "_context", term115047);
        setField(term115046, term115046.getClass(), "_parserFactory", null);
        setBooleanField(term115046, term115046.getClass(), "_unwrapRoot", false);
        setField(term115046, term115046.getClass(), "_filter", null);
        setField(term115046, term115046.getClass(), "_valueType", null);
        setField(term115046, term115046.getClass(), "_rootDeserializer", null);
        setField(term115046, term115046.getClass(), "_valueToUpdate", null);
        setField(term115046, term115046.getClass(), "_schema", null);
        setField(term115046, term115046.getClass(), "_injectableValues", null);
        setField(term115046, term115046.getClass(), "_dataFormatReaders", null);
        setField(term115046, term115046.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term114598;
        args[1] = term114856;
        args[2] = term114948;
        args[3] = null;
        args[4] = "";
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term115038));
        assertTrue(recursiveEquals(term114598, term115044));
        assertTrue(recursiveEquals(term114856, term115045));
        assertTrue(recursiveEquals(term114948, term115046));
    }

};


