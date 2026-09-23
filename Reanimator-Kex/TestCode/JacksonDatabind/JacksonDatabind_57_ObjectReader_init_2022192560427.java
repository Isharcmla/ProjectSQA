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

public class ObjectReader_init_2022192560427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210748;
     Object term210858;
     Object term210956;
     Object term211044;
     Object term211049;
     Object term211050;
     Object term211051;

    public ObjectReader_init_2022192560427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term210546 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term210656 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term210546, term210546.getClass(), "_config", term210656);
        setField(term210546, term210546.getClass(), "_context", null);
        setField(term210546, term210546.getClass(), "_rootDeserializers", null);
        setField(term210546, term210546.getClass(), "_parserFactory", null);
        setField(term210546, term210546.getClass(), "_valueType", null);
        setField(term210546, term210546.getClass(), "_rootDeserializer", null);
        setField(term210546, term210546.getClass(), "_valueToUpdate", null);
        setField(term210546, term210546.getClass(), "_schema", null);
        setField(term210546, term210546.getClass(), "_injectableValues", null);
        term210748 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term210748, term210748.getClass(), "_context", null);
        setField(term210748, term210748.getClass(), "_rootDeserializers", null);
        setField(term210748, term210748.getClass(), "_parserFactory", null);
        term210858 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term210858, term210858.getClass(), "_rootName", null);
        setIntField(term210858, term210858.getClass(), "_deserFeatures", -1);
        term210956 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term211044 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term211045 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term211046 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term211045, term211045.getClass(), "_problemHandlers", null);
        setField(term211045, term211045.getClass(), "_nodeFactory", null);
        setIntField(term211045, term211045.getClass(), "_deserFeatures", -1);
        setIntField(term211045, term211045.getClass(), "_parserFeatures", 0);
        setIntField(term211045, term211045.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term211045, term211045.getClass(), "_formatReadFeatures", 0);
        setIntField(term211045, term211045.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term211045, term211045.getClass(), "_mixIns", null);
        setField(term211045, term211045.getClass(), "_subtypeResolver", null);
        setField(term211045, term211045.getClass(), "_rootName", null);
        setField(term211045, term211045.getClass(), "_view", null);
        setField(term211045, term211045.getClass(), "_attributes", null);
        setField(term211045, term211045.getClass(), "_rootNames", null);
        setIntField(term211045, term211045.getClass(), "_mapperFeatures", 0);
        setField(term211045, term211045.getClass(), "_base", null);
        setField(term211044, term211044.getClass(), "_config", term211045);
        setField(term211044, term211044.getClass(), "_context", null);
        setField(term211044, term211044.getClass(), "_parserFactory", null);
        setBooleanField(term211044, term211044.getClass(), "_unwrapRoot", true);
        setField(term211044, term211044.getClass(), "_filter", null);
        setField(term211046, term211046.getClass(), "_superClass", null);
        setField(term211046, term211046.getClass(), "_superInterfaces", null);
        setField(term211046, term211046.getClass(), "_bindings", null);
        setField(term211046, term211046.getClass(), "_canonicalName", null);
        setField(term211046, term211046.getClass(), "_class", null);
        setIntField(term211046, term211046.getClass(), "_hash", 0);
        setField(term211046, term211046.getClass(), "_valueHandler", null);
        setField(term211046, term211046.getClass(), "_typeHandler", null);
        setBooleanField(term211046, term211046.getClass(), "_asStatic", false);
        setField(term211044, term211044.getClass(), "_valueType", term211046);
        setField(term211044, term211044.getClass(), "_rootDeserializer", null);
        setField(term211044, term211044.getClass(), "_valueToUpdate", "");
        setField(term211044, term211044.getClass(), "_schema", null);
        setField(term211044, term211044.getClass(), "_injectableValues", null);
        setField(term211044, term211044.getClass(), "_dataFormatReaders", null);
        setField(term211044, term211044.getClass(), "_rootDeserializers", null);
        term211049 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term211049, term211049.getClass(), "_superClass", null);
        setField(term211049, term211049.getClass(), "_superInterfaces", null);
        setField(term211049, term211049.getClass(), "_bindings", null);
        setField(term211049, term211049.getClass(), "_canonicalName", null);
        setField(term211049, term211049.getClass(), "_class", null);
        setIntField(term211049, term211049.getClass(), "_hash", 0);
        setField(term211049, term211049.getClass(), "_valueHandler", null);
        setField(term211049, term211049.getClass(), "_typeHandler", null);
        setBooleanField(term211049, term211049.getClass(), "_asStatic", false);
        term211050 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term211050, term211050.getClass(), "_problemHandlers", null);
        setField(term211050, term211050.getClass(), "_nodeFactory", null);
        setIntField(term211050, term211050.getClass(), "_deserFeatures", -1);
        setIntField(term211050, term211050.getClass(), "_parserFeatures", 0);
        setIntField(term211050, term211050.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term211050, term211050.getClass(), "_formatReadFeatures", 0);
        setIntField(term211050, term211050.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term211050, term211050.getClass(), "_mixIns", null);
        setField(term211050, term211050.getClass(), "_subtypeResolver", null);
        setField(term211050, term211050.getClass(), "_rootName", null);
        setField(term211050, term211050.getClass(), "_view", null);
        setField(term211050, term211050.getClass(), "_attributes", null);
        setField(term211050, term211050.getClass(), "_rootNames", null);
        setIntField(term211050, term211050.getClass(), "_mapperFeatures", 0);
        setField(term211050, term211050.getClass(), "_base", null);
        term211051 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term211051, term211051.getClass(), "_config", null);
        setField(term211051, term211051.getClass(), "_context", null);
        setField(term211051, term211051.getClass(), "_parserFactory", null);
        setBooleanField(term211051, term211051.getClass(), "_unwrapRoot", false);
        setField(term211051, term211051.getClass(), "_filter", null);
        setField(term211051, term211051.getClass(), "_valueType", null);
        setField(term211051, term211051.getClass(), "_rootDeserializer", null);
        setField(term211051, term211051.getClass(), "_valueToUpdate", null);
        setField(term211051, term211051.getClass(), "_schema", null);
        setField(term211051, term211051.getClass(), "_injectableValues", null);
        setField(term211051, term211051.getClass(), "_dataFormatReaders", null);
        setField(term211051, term211051.getClass(), "_rootDeserializers", null);
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
        args[0] = term210748;
        args[1] = term210858;
        args[2] = term210956;
        args[3] = null;
        args[4] = "";
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term211044));
        assertTrue(recursiveEquals(term210748, term211049));
        assertTrue(recursiveEquals(term210858, term211050));
        assertTrue(recursiveEquals(term210956, term211051));
    }

};


