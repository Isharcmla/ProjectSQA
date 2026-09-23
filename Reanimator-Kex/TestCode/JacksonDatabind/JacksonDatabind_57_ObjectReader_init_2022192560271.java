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

public class ObjectReader_init_2022192560271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49140;
     Object term49398;
     Object term49502;
     Object term49592;
     Object term49598;
     Object term49599;
     Object term49600;

    public ObjectReader_init_2022192560271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48938 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term49048 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term48938, term48938.getClass(), "_config", term49048);
        setField(term48938, term48938.getClass(), "_context", null);
        setField(term48938, term48938.getClass(), "_rootDeserializers", null);
        setField(term48938, term48938.getClass(), "_parserFactory", null);
        setField(term48938, term48938.getClass(), "_valueType", null);
        setField(term48938, term48938.getClass(), "_rootDeserializer", null);
        setField(term48938, term48938.getClass(), "_valueToUpdate", null);
        setField(term48938, term48938.getClass(), "_schema", null);
        setField(term48938, term48938.getClass(), "_injectableValues", null);
        term49140 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term49288 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term49140, term49140.getClass(), "_context", term49288);
        setField(term49140, term49140.getClass(), "_rootDeserializers", null);
        setField(term49140, term49140.getClass(), "_parserFactory", null);
        term49398 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term49398, term49398.getClass(), "_rootName", null);
        setIntField(term49398, term49398.getClass(), "_deserFeatures", -1);
        term49502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term49592 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term49593 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term49594 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term49595 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term49593, term49593.getClass(), "_problemHandlers", null);
        setField(term49593, term49593.getClass(), "_nodeFactory", null);
        setIntField(term49593, term49593.getClass(), "_deserFeatures", -1);
        setIntField(term49593, term49593.getClass(), "_parserFeatures", 0);
        setIntField(term49593, term49593.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term49593, term49593.getClass(), "_formatReadFeatures", 0);
        setIntField(term49593, term49593.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term49593, term49593.getClass(), "_mixIns", null);
        setField(term49593, term49593.getClass(), "_subtypeResolver", null);
        setField(term49593, term49593.getClass(), "_rootName", null);
        setField(term49593, term49593.getClass(), "_view", null);
        setField(term49593, term49593.getClass(), "_attributes", null);
        setField(term49593, term49593.getClass(), "_rootNames", null);
        setIntField(term49593, term49593.getClass(), "_mapperFeatures", 0);
        setField(term49593, term49593.getClass(), "_base", null);
        setField(term49592, term49592.getClass(), "_config", term49593);
        setField(term49594, term49594.getClass(), "_objectIds", null);
        setField(term49594, term49594.getClass(), "_objectIdResolvers", null);
        setField(term49594, term49594.getClass(), "_cache", null);
        setField(term49594, term49594.getClass(), "_factory", null);
        setField(term49594, term49594.getClass(), "_config", null);
        setIntField(term49594, term49594.getClass(), "_featureFlags", 0);
        setField(term49594, term49594.getClass(), "_view", null);
        setField(term49594, term49594.getClass(), "_parser", null);
        setField(term49594, term49594.getClass(), "_injectableValues", null);
        setField(term49594, term49594.getClass(), "_arrayBuilders", null);
        setField(term49594, term49594.getClass(), "_objectBuffer", null);
        setField(term49594, term49594.getClass(), "_dateFormat", null);
        setField(term49594, term49594.getClass(), "_attributes", null);
        setField(term49594, term49594.getClass(), "_currentType", null);
        setField(term49592, term49592.getClass(), "_context", term49594);
        setField(term49592, term49592.getClass(), "_parserFactory", null);
        setBooleanField(term49592, term49592.getClass(), "_unwrapRoot", true);
        setField(term49592, term49592.getClass(), "_filter", null);
        setField(term49595, term49595.getClass(), "_referencedType", null);
        setField(term49595, term49595.getClass(), "_superClass", null);
        setField(term49595, term49595.getClass(), "_superInterfaces", null);
        setField(term49595, term49595.getClass(), "_bindings", null);
        setField(term49595, term49595.getClass(), "_canonicalName", null);
        setField(term49595, term49595.getClass(), "_class", null);
        setIntField(term49595, term49595.getClass(), "_hash", 0);
        setField(term49595, term49595.getClass(), "_valueHandler", null);
        setField(term49595, term49595.getClass(), "_typeHandler", null);
        setBooleanField(term49595, term49595.getClass(), "_asStatic", false);
        setField(term49592, term49592.getClass(), "_valueType", term49595);
        setField(term49592, term49592.getClass(), "_rootDeserializer", null);
        setField(term49592, term49592.getClass(), "_valueToUpdate", "");
        setField(term49592, term49592.getClass(), "_schema", null);
        setField(term49592, term49592.getClass(), "_injectableValues", null);
        setField(term49592, term49592.getClass(), "_dataFormatReaders", null);
        setField(term49592, term49592.getClass(), "_rootDeserializers", null);
        term49598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term49598, term49598.getClass(), "_referencedType", null);
        setField(term49598, term49598.getClass(), "_superClass", null);
        setField(term49598, term49598.getClass(), "_superInterfaces", null);
        setField(term49598, term49598.getClass(), "_bindings", null);
        setField(term49598, term49598.getClass(), "_canonicalName", null);
        setField(term49598, term49598.getClass(), "_class", null);
        setIntField(term49598, term49598.getClass(), "_hash", 0);
        setField(term49598, term49598.getClass(), "_valueHandler", null);
        setField(term49598, term49598.getClass(), "_typeHandler", null);
        setBooleanField(term49598, term49598.getClass(), "_asStatic", false);
        term49599 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term49599, term49599.getClass(), "_problemHandlers", null);
        setField(term49599, term49599.getClass(), "_nodeFactory", null);
        setIntField(term49599, term49599.getClass(), "_deserFeatures", -1);
        setIntField(term49599, term49599.getClass(), "_parserFeatures", 0);
        setIntField(term49599, term49599.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term49599, term49599.getClass(), "_formatReadFeatures", 0);
        setIntField(term49599, term49599.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term49599, term49599.getClass(), "_mixIns", null);
        setField(term49599, term49599.getClass(), "_subtypeResolver", null);
        setField(term49599, term49599.getClass(), "_rootName", null);
        setField(term49599, term49599.getClass(), "_view", null);
        setField(term49599, term49599.getClass(), "_attributes", null);
        setField(term49599, term49599.getClass(), "_rootNames", null);
        setIntField(term49599, term49599.getClass(), "_mapperFeatures", 0);
        setField(term49599, term49599.getClass(), "_base", null);
        term49600 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term49601 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term49600, term49600.getClass(), "_config", null);
        setField(term49601, term49601.getClass(), "_objectIds", null);
        setField(term49601, term49601.getClass(), "_objectIdResolvers", null);
        setField(term49601, term49601.getClass(), "_cache", null);
        setField(term49601, term49601.getClass(), "_factory", null);
        setField(term49601, term49601.getClass(), "_config", null);
        setIntField(term49601, term49601.getClass(), "_featureFlags", 0);
        setField(term49601, term49601.getClass(), "_view", null);
        setField(term49601, term49601.getClass(), "_parser", null);
        setField(term49601, term49601.getClass(), "_injectableValues", null);
        setField(term49601, term49601.getClass(), "_arrayBuilders", null);
        setField(term49601, term49601.getClass(), "_objectBuffer", null);
        setField(term49601, term49601.getClass(), "_dateFormat", null);
        setField(term49601, term49601.getClass(), "_attributes", null);
        setField(term49601, term49601.getClass(), "_currentType", null);
        setField(term49600, term49600.getClass(), "_context", term49601);
        setField(term49600, term49600.getClass(), "_parserFactory", null);
        setBooleanField(term49600, term49600.getClass(), "_unwrapRoot", false);
        setField(term49600, term49600.getClass(), "_filter", null);
        setField(term49600, term49600.getClass(), "_valueType", null);
        setField(term49600, term49600.getClass(), "_rootDeserializer", null);
        setField(term49600, term49600.getClass(), "_valueToUpdate", null);
        setField(term49600, term49600.getClass(), "_schema", null);
        setField(term49600, term49600.getClass(), "_injectableValues", null);
        setField(term49600, term49600.getClass(), "_dataFormatReaders", null);
        setField(term49600, term49600.getClass(), "_rootDeserializers", null);
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
        args[0] = term49140;
        args[1] = term49398;
        args[2] = term49502;
        args[3] = null;
        args[4] = "";
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term49592));
        assertTrue(recursiveEquals(term49140, term49598));
        assertTrue(recursiveEquals(term49398, term49599));
        assertTrue(recursiveEquals(term49502, term49600));
    }

};


