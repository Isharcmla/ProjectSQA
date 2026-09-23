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

public class ObjectReader_init_2022192560246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46805;
     Object term47103;
     Object term47148;
     Object term47152;
     Object term47153;

    public ObjectReader_init_2022192560246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46187 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term46335 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term46441 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term46605 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        Object term46713 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term46187, term46187.getClass(), "_config", null);
        setField(term46187, term46187.getClass(), "_context", term46335);
        setField(term46187, term46187.getClass(), "_rootDeserializers", null);
        setField(term46187, term46187.getClass(), "_parserFactory", null);
        setField(term46187, term46187.getClass(), "_rootNames", term46441);
        setField(term46187, term46187.getClass(), "_valueType", null);
        setField(term46187, term46187.getClass(), "_rootDeserializer", term46605);
        setField(term46187, term46187.getClass(), "_valueToUpdate", null);
        setField(term46187, term46187.getClass(), "_schema", null);
        setField(term46187, term46187.getClass(), "_injectableValues", term46713);
        term46805 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term46887 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term46993 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term46805, term46805.getClass(), "_context", null);
        setField(term46805, term46805.getClass(), "_rootDeserializers", term46887);
        setField(term46805, term46805.getClass(), "_parserFactory", null);
        setField(term46805, term46805.getClass(), "_rootNames", term46993);
        term47103 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term47103, term47103.getClass(), "_rootName", null);
        setIntField(term47103, term47103.getClass(), "_deserFeatures", -1);
        term47148 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term47149 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term47150 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term47151 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setIntField(term47149, term47149.getClass(), "_deserFeatures", -1);
        setField(term47149, term47149.getClass(), "_problemHandlers", null);
        setField(term47149, term47149.getClass(), "_nodeFactory", null);
        setIntField(term47149, term47149.getClass(), "_parserFeatures", 0);
        setIntField(term47149, term47149.getClass(), "_parserFeaturesToChange", 0);
        setField(term47149, term47149.getClass(), "_mixInAnnotations", null);
        setField(term47149, term47149.getClass(), "_subtypeResolver", null);
        setField(term47149, term47149.getClass(), "_rootName", null);
        setField(term47149, term47149.getClass(), "_view", null);
        setField(term47149, term47149.getClass(), "_attributes", null);
        setIntField(term47149, term47149.getClass(), "_mapperFeatures", 0);
        setField(term47149, term47149.getClass(), "_base", null);
        setField(term47148, term47148.getClass(), "_config", term47149);
        setField(term47148, term47148.getClass(), "_context", null);
        setField(term47148, term47148.getClass(), "_parserFactory", null);
        setBooleanField(term47148, term47148.getClass(), "_unwrapRoot", true);
        setField(term47148, term47148.getClass(), "_valueType", null);
        setField(term47148, term47148.getClass(), "_rootDeserializer", null);
        setField(term47148, term47148.getClass(), "_valueToUpdate", null);
        setField(term47148, term47148.getClass(), "_schema", null);
        setField(term47148, term47148.getClass(), "_injectableValues", null);
        setField(term47148, term47148.getClass(), "_dataFormatReaders", null);
        setField(term47150, term47150.getClass(), "table", null);
        setField(term47150, term47150.getClass(), "nextTable", null);
        setLongField(term47150, term47150.getClass(), "baseCount", 0L);
        setIntField(term47150, term47150.getClass(), "sizeCtl", 0);
        setIntField(term47150, term47150.getClass(), "transferIndex", 0);
        setIntField(term47150, term47150.getClass(), "cellsBusy", 0);
        setField(term47150, term47150.getClass(), "counterCells", null);
        setField(term47150, term47150.getClass(), "keySet", null);
        setField(term47150, term47150.getClass(), "values", null);
        setField(term47150, term47150.getClass(), "entrySet", null);
        setField(term47150, term47150.getClass(), "keySet", null);
        setField(term47150, term47150.getClass(), "values", null);
        setField(term47148, term47148.getClass(), "_rootDeserializers", term47150);
        setField(term47151, term47151.getClass(), "_rootNames", null);
        setField(term47148, term47148.getClass(), "_rootNames", term47151);
        term47152 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term47152, term47152.getClass(), "_deserFeatures", -1);
        setField(term47152, term47152.getClass(), "_problemHandlers", null);
        setField(term47152, term47152.getClass(), "_nodeFactory", null);
        setIntField(term47152, term47152.getClass(), "_parserFeatures", 0);
        setIntField(term47152, term47152.getClass(), "_parserFeaturesToChange", 0);
        setField(term47152, term47152.getClass(), "_mixInAnnotations", null);
        setField(term47152, term47152.getClass(), "_subtypeResolver", null);
        setField(term47152, term47152.getClass(), "_rootName", null);
        setField(term47152, term47152.getClass(), "_view", null);
        setField(term47152, term47152.getClass(), "_attributes", null);
        setIntField(term47152, term47152.getClass(), "_mapperFeatures", 0);
        setField(term47152, term47152.getClass(), "_base", null);
        term47153 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term47154 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term47155 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term47153, term47153.getClass(), "_config", null);
        setField(term47153, term47153.getClass(), "_context", null);
        setField(term47153, term47153.getClass(), "_parserFactory", null);
        setBooleanField(term47153, term47153.getClass(), "_unwrapRoot", false);
        setField(term47153, term47153.getClass(), "_valueType", null);
        setField(term47153, term47153.getClass(), "_rootDeserializer", null);
        setField(term47153, term47153.getClass(), "_valueToUpdate", null);
        setField(term47153, term47153.getClass(), "_schema", null);
        setField(term47153, term47153.getClass(), "_injectableValues", null);
        setField(term47153, term47153.getClass(), "_dataFormatReaders", null);
        setField(term47154, term47154.getClass(), "table", null);
        setField(term47154, term47154.getClass(), "nextTable", null);
        setLongField(term47154, term47154.getClass(), "baseCount", 0L);
        setIntField(term47154, term47154.getClass(), "sizeCtl", 0);
        setIntField(term47154, term47154.getClass(), "transferIndex", 0);
        setIntField(term47154, term47154.getClass(), "cellsBusy", 0);
        setField(term47154, term47154.getClass(), "counterCells", null);
        setField(term47154, term47154.getClass(), "keySet", null);
        setField(term47154, term47154.getClass(), "values", null);
        setField(term47154, term47154.getClass(), "entrySet", null);
        setField(term47154, term47154.getClass(), "keySet", null);
        setField(term47154, term47154.getClass(), "values", null);
        setField(term47153, term47153.getClass(), "_rootDeserializers", term47154);
        setField(term47155, term47155.getClass(), "_rootNames", null);
        setField(term47153, term47153.getClass(), "_rootNames", term47155);
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
        args[0] = term46805;
        args[1] = term47103;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47148));
        assertTrue(recursiveEquals(term46805, term47152));
        assertTrue(recursiveEquals(term47103, term47153));
    }

};


