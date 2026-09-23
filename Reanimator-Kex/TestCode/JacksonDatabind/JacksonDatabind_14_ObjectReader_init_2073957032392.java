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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectReader_init_2073957032392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199085;
     Object term199437;
     Object term199535;
     Object term199681;

    public ObjectReader_init_2073957032392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term198471 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term198553 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term199274 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term199327 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term198847 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term198885 = newInstance(Class.forName("java.lang.Object"));
        Object term198993 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term198471, term198471.getClass(), "_config", null);
        setField(term198471, term198471.getClass(), "_context", null);
        setField(term198471, term198471.getClass(), "_rootDeserializers", term198553);
        setField(term198471, term198471.getClass(), "_parserFactory", term199274);
        setField(term198471, term198471.getClass(), "_rootNames", term199327);
        setField(term198471, term198471.getClass(), "_valueType", term198847);
        setField(term198471, term198471.getClass(), "_valueToUpdate", term198885);
        setField(term198471, term198471.getClass(), "_schema", null);
        setField(term198471, term198471.getClass(), "_injectableValues", term198993);
        setBooleanField(term198471, term198471.getClass(), "_unwrapRoot", false);
        term199085 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term199233 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term199085, term199085.getClass(), "_deserializationContext", term199233);
        setField(term199085, term199085.getClass(), "_rootDeserializers", null);
        setField(term199085, term199085.getClass(), "_jsonFactory", term199274);
        setField(term199085, term199085.getClass(), "_rootNames", term199327);
        term199437 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term199437, term199437.getClass(), "_rootName", null);
        setIntField(term199437, term199437.getClass(), "_deserFeatures", -1);
        term199535 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term199681 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term199085;
        args[1] = term199437;
        args[2] = term199535;
        args[3] = "";
        args[4] = null;
        args[5] = term199681;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


