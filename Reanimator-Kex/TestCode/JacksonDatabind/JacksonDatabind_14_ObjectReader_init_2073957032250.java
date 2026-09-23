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

public class ObjectReader_init_2073957032250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49979;
     Object term50171;
     Object term50214;
     Object term50217;
     Object term50218;

    public ObjectReader_init_2073957032250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49563 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term49673 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term49779 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term49887 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term49563, term49563.getClass(), "_config", term49673);
        setField(term49563, term49563.getClass(), "_context", null);
        setField(term49563, term49563.getClass(), "_rootDeserializers", null);
        setField(term49563, term49563.getClass(), "_parserFactory", null);
        setField(term49563, term49563.getClass(), "_rootNames", term49779);
        setField(term49563, term49563.getClass(), "_valueType", null);
        setField(term49563, term49563.getClass(), "_valueToUpdate", null);
        setField(term49563, term49563.getClass(), "_schema", null);
        setField(term49563, term49563.getClass(), "_injectableValues", term49887);
        term49979 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term50061 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term49979, term49979.getClass(), "_deserializationContext", null);
        setField(term49979, term49979.getClass(), "_rootDeserializers", null);
        setField(term49979, term49979.getClass(), "_jsonFactory", term50061);
        setField(term49979, term49979.getClass(), "_rootNames", null);
        term50171 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term50171, term50171.getClass(), "_rootName", null);
        setIntField(term50171, term50171.getClass(), "_deserFeatures", -1);
        term50214 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term50215 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term50216 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setIntField(term50215, term50215.getClass(), "_deserFeatures", -1);
        setField(term50215, term50215.getClass(), "_problemHandlers", null);
        setField(term50215, term50215.getClass(), "_nodeFactory", null);
        setIntField(term50215, term50215.getClass(), "_parserFeatures", 0);
        setIntField(term50215, term50215.getClass(), "_parserFeaturesToChange", 0);
        setField(term50215, term50215.getClass(), "_mixInAnnotations", null);
        setField(term50215, term50215.getClass(), "_subtypeResolver", null);
        setField(term50215, term50215.getClass(), "_rootName", null);
        setField(term50215, term50215.getClass(), "_view", null);
        setField(term50215, term50215.getClass(), "_attributes", null);
        setIntField(term50215, term50215.getClass(), "_mapperFeatures", 0);
        setField(term50215, term50215.getClass(), "_base", null);
        setField(term50214, term50214.getClass(), "_config", term50215);
        setField(term50214, term50214.getClass(), "_context", null);
        setField(term50216, term50216.getClass(), "_rootCharSymbols", null);
        setField(term50216, term50216.getClass(), "_rootByteSymbols", null);
        setField(term50216, term50216.getClass(), "_objectCodec", null);
        setIntField(term50216, term50216.getClass(), "_factoryFeatures", 0);
        setIntField(term50216, term50216.getClass(), "_parserFeatures", 0);
        setIntField(term50216, term50216.getClass(), "_generatorFeatures", 0);
        setField(term50216, term50216.getClass(), "_characterEscapes", null);
        setField(term50216, term50216.getClass(), "_inputDecorator", null);
        setField(term50216, term50216.getClass(), "_outputDecorator", null);
        setField(term50216, term50216.getClass(), "_rootValueSeparator", null);
        setField(term50214, term50214.getClass(), "_parserFactory", term50216);
        setBooleanField(term50214, term50214.getClass(), "_unwrapRoot", true);
        setField(term50214, term50214.getClass(), "_valueType", null);
        setField(term50214, term50214.getClass(), "_rootDeserializer", null);
        setField(term50214, term50214.getClass(), "_valueToUpdate", null);
        setField(term50214, term50214.getClass(), "_schema", null);
        setField(term50214, term50214.getClass(), "_injectableValues", null);
        setField(term50214, term50214.getClass(), "_dataFormatReaders", null);
        setField(term50214, term50214.getClass(), "_rootDeserializers", null);
        setField(term50214, term50214.getClass(), "_rootNames", null);
        term50217 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term50217, term50217.getClass(), "_deserFeatures", -1);
        setField(term50217, term50217.getClass(), "_problemHandlers", null);
        setField(term50217, term50217.getClass(), "_nodeFactory", null);
        setIntField(term50217, term50217.getClass(), "_parserFeatures", 0);
        setIntField(term50217, term50217.getClass(), "_parserFeaturesToChange", 0);
        setField(term50217, term50217.getClass(), "_mixInAnnotations", null);
        setField(term50217, term50217.getClass(), "_subtypeResolver", null);
        setField(term50217, term50217.getClass(), "_rootName", null);
        setField(term50217, term50217.getClass(), "_view", null);
        setField(term50217, term50217.getClass(), "_attributes", null);
        setIntField(term50217, term50217.getClass(), "_mapperFeatures", 0);
        setField(term50217, term50217.getClass(), "_base", null);
        term50218 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term50219 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term50219, term50219.getClass(), "_rootCharSymbols", null);
        setField(term50219, term50219.getClass(), "_rootByteSymbols", null);
        setField(term50219, term50219.getClass(), "_objectCodec", null);
        setIntField(term50219, term50219.getClass(), "_factoryFeatures", 0);
        setIntField(term50219, term50219.getClass(), "_parserFeatures", 0);
        setIntField(term50219, term50219.getClass(), "_generatorFeatures", 0);
        setField(term50219, term50219.getClass(), "_characterEscapes", null);
        setField(term50219, term50219.getClass(), "_inputDecorator", null);
        setField(term50219, term50219.getClass(), "_outputDecorator", null);
        setField(term50219, term50219.getClass(), "_rootValueSeparator", null);
        setField(term50218, term50218.getClass(), "_jsonFactory", term50219);
        setField(term50218, term50218.getClass(), "_typeFactory", null);
        setField(term50218, term50218.getClass(), "_injectableValues", null);
        setField(term50218, term50218.getClass(), "_subtypeResolver", null);
        setField(term50218, term50218.getClass(), "_rootNames", null);
        setField(term50218, term50218.getClass(), "_mixInAnnotations", null);
        setField(term50218, term50218.getClass(), "_serializationConfig", null);
        setField(term50218, term50218.getClass(), "_serializerProvider", null);
        setField(term50218, term50218.getClass(), "_serializerFactory", null);
        setField(term50218, term50218.getClass(), "_deserializationConfig", null);
        setField(term50218, term50218.getClass(), "_deserializationContext", null);
        setField(term50218, term50218.getClass(), "_registeredModuleTypes", null);
        setField(term50218, term50218.getClass(), "_rootDeserializers", null);
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
        args[0] = term49979;
        args[1] = term50171;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term50214));
        assertTrue(recursiveEquals(term49979, term50217));
        assertTrue(recursiveEquals(term50171, null));
    }

};


