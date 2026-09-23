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

public class ObjectReader_init_2022192560413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194785;
     Object term195043;
     Object term195163;
     Object term195253;
     Object term195259;
     Object term195260;
     Object term195261;

    public ObjectReader_init_2022192560413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term194583 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term194693 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term194583, term194583.getClass(), "_config", term194693);
        setField(term194583, term194583.getClass(), "_context", null);
        setField(term194583, term194583.getClass(), "_rootDeserializers", null);
        setField(term194583, term194583.getClass(), "_parserFactory", null);
        setField(term194583, term194583.getClass(), "_valueType", null);
        setField(term194583, term194583.getClass(), "_rootDeserializer", null);
        setField(term194583, term194583.getClass(), "_valueToUpdate", null);
        setField(term194583, term194583.getClass(), "_schema", null);
        setField(term194583, term194583.getClass(), "_injectableValues", null);
        term194785 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term194933 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term194785, term194785.getClass(), "_context", term194933);
        setField(term194785, term194785.getClass(), "_rootDeserializers", null);
        setField(term194785, term194785.getClass(), "_parserFactory", null);
        term195043 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term195043, term195043.getClass(), "_rootName", null);
        setIntField(term195043, term195043.getClass(), "_deserFeatures", -1);
        term195163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term195253 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term195254 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term195255 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term195256 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term195254, term195254.getClass(), "_problemHandlers", null);
        setField(term195254, term195254.getClass(), "_nodeFactory", null);
        setIntField(term195254, term195254.getClass(), "_deserFeatures", -1);
        setIntField(term195254, term195254.getClass(), "_parserFeatures", 0);
        setIntField(term195254, term195254.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term195254, term195254.getClass(), "_formatReadFeatures", 0);
        setIntField(term195254, term195254.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term195254, term195254.getClass(), "_mixIns", null);
        setField(term195254, term195254.getClass(), "_subtypeResolver", null);
        setField(term195254, term195254.getClass(), "_rootName", null);
        setField(term195254, term195254.getClass(), "_view", null);
        setField(term195254, term195254.getClass(), "_attributes", null);
        setField(term195254, term195254.getClass(), "_rootNames", null);
        setIntField(term195254, term195254.getClass(), "_mapperFeatures", 0);
        setField(term195254, term195254.getClass(), "_base", null);
        setField(term195253, term195253.getClass(), "_config", term195254);
        setField(term195255, term195255.getClass(), "_objectIds", null);
        setField(term195255, term195255.getClass(), "_objectIdResolvers", null);
        setField(term195255, term195255.getClass(), "_cache", null);
        setField(term195255, term195255.getClass(), "_factory", null);
        setField(term195255, term195255.getClass(), "_config", null);
        setIntField(term195255, term195255.getClass(), "_featureFlags", 0);
        setField(term195255, term195255.getClass(), "_view", null);
        setField(term195255, term195255.getClass(), "_parser", null);
        setField(term195255, term195255.getClass(), "_injectableValues", null);
        setField(term195255, term195255.getClass(), "_arrayBuilders", null);
        setField(term195255, term195255.getClass(), "_objectBuffer", null);
        setField(term195255, term195255.getClass(), "_dateFormat", null);
        setField(term195255, term195255.getClass(), "_attributes", null);
        setField(term195255, term195255.getClass(), "_currentType", null);
        setField(term195253, term195253.getClass(), "_context", term195255);
        setField(term195253, term195253.getClass(), "_parserFactory", null);
        setBooleanField(term195253, term195253.getClass(), "_unwrapRoot", true);
        setField(term195253, term195253.getClass(), "_filter", null);
        setField(term195256, term195256.getClass(), "_referencedType", null);
        setField(term195256, term195256.getClass(), "_superClass", null);
        setField(term195256, term195256.getClass(), "_superInterfaces", null);
        setField(term195256, term195256.getClass(), "_bindings", null);
        setField(term195256, term195256.getClass(), "_canonicalName", null);
        setField(term195256, term195256.getClass(), "_class", null);
        setIntField(term195256, term195256.getClass(), "_hash", 0);
        setField(term195256, term195256.getClass(), "_valueHandler", null);
        setField(term195256, term195256.getClass(), "_typeHandler", null);
        setBooleanField(term195256, term195256.getClass(), "_asStatic", false);
        setField(term195253, term195253.getClass(), "_valueType", term195256);
        setField(term195253, term195253.getClass(), "_rootDeserializer", null);
        setField(term195253, term195253.getClass(), "_valueToUpdate", "");
        setField(term195253, term195253.getClass(), "_schema", null);
        setField(term195253, term195253.getClass(), "_injectableValues", null);
        setField(term195253, term195253.getClass(), "_dataFormatReaders", null);
        setField(term195253, term195253.getClass(), "_rootDeserializers", null);
        term195259 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term195259, term195259.getClass(), "_referencedType", null);
        setField(term195259, term195259.getClass(), "_superClass", null);
        setField(term195259, term195259.getClass(), "_superInterfaces", null);
        setField(term195259, term195259.getClass(), "_bindings", null);
        setField(term195259, term195259.getClass(), "_canonicalName", null);
        setField(term195259, term195259.getClass(), "_class", null);
        setIntField(term195259, term195259.getClass(), "_hash", 0);
        setField(term195259, term195259.getClass(), "_valueHandler", null);
        setField(term195259, term195259.getClass(), "_typeHandler", null);
        setBooleanField(term195259, term195259.getClass(), "_asStatic", false);
        term195260 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term195260, term195260.getClass(), "_problemHandlers", null);
        setField(term195260, term195260.getClass(), "_nodeFactory", null);
        setIntField(term195260, term195260.getClass(), "_deserFeatures", -1);
        setIntField(term195260, term195260.getClass(), "_parserFeatures", 0);
        setIntField(term195260, term195260.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term195260, term195260.getClass(), "_formatReadFeatures", 0);
        setIntField(term195260, term195260.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term195260, term195260.getClass(), "_mixIns", null);
        setField(term195260, term195260.getClass(), "_subtypeResolver", null);
        setField(term195260, term195260.getClass(), "_rootName", null);
        setField(term195260, term195260.getClass(), "_view", null);
        setField(term195260, term195260.getClass(), "_attributes", null);
        setField(term195260, term195260.getClass(), "_rootNames", null);
        setIntField(term195260, term195260.getClass(), "_mapperFeatures", 0);
        setField(term195260, term195260.getClass(), "_base", null);
        term195261 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term195262 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term195261, term195261.getClass(), "_config", null);
        setField(term195262, term195262.getClass(), "_objectIds", null);
        setField(term195262, term195262.getClass(), "_objectIdResolvers", null);
        setField(term195262, term195262.getClass(), "_cache", null);
        setField(term195262, term195262.getClass(), "_factory", null);
        setField(term195262, term195262.getClass(), "_config", null);
        setIntField(term195262, term195262.getClass(), "_featureFlags", 0);
        setField(term195262, term195262.getClass(), "_view", null);
        setField(term195262, term195262.getClass(), "_parser", null);
        setField(term195262, term195262.getClass(), "_injectableValues", null);
        setField(term195262, term195262.getClass(), "_arrayBuilders", null);
        setField(term195262, term195262.getClass(), "_objectBuffer", null);
        setField(term195262, term195262.getClass(), "_dateFormat", null);
        setField(term195262, term195262.getClass(), "_attributes", null);
        setField(term195262, term195262.getClass(), "_currentType", null);
        setField(term195261, term195261.getClass(), "_context", term195262);
        setField(term195261, term195261.getClass(), "_parserFactory", null);
        setBooleanField(term195261, term195261.getClass(), "_unwrapRoot", false);
        setField(term195261, term195261.getClass(), "_filter", null);
        setField(term195261, term195261.getClass(), "_valueType", null);
        setField(term195261, term195261.getClass(), "_rootDeserializer", null);
        setField(term195261, term195261.getClass(), "_valueToUpdate", null);
        setField(term195261, term195261.getClass(), "_schema", null);
        setField(term195261, term195261.getClass(), "_injectableValues", null);
        setField(term195261, term195261.getClass(), "_dataFormatReaders", null);
        setField(term195261, term195261.getClass(), "_rootDeserializers", null);
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
        args[0] = term194785;
        args[1] = term195043;
        args[2] = term195163;
        args[3] = null;
        args[4] = "";
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term195253));
        assertTrue(recursiveEquals(term194785, term195259));
        assertTrue(recursiveEquals(term195043, term195260));
        assertTrue(recursiveEquals(term195163, term195261));
    }

};


