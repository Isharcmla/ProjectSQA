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

public class ObjectReader_init_2073957032489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289894;
     Object term290152;
     Object term290388;

    public ObjectReader_init_2073957032489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term289802 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term289802, term289802.getClass(), "_config", null);
        setField(term289802, term289802.getClass(), "_context", null);
        setField(term289802, term289802.getClass(), "_rootDeserializers", null);
        setField(term289802, term289802.getClass(), "_parserFactory", null);
        setField(term289802, term289802.getClass(), "_valueType", null);
        setField(term289802, term289802.getClass(), "_valueToUpdate", null);
        setField(term289802, term289802.getClass(), "_schema", null);
        setField(term289802, term289802.getClass(), "_injectableValues", null);
        setBooleanField(term289802, term289802.getClass(), "_unwrapRoot", false);
        term289894 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term290042 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term289894, term289894.getClass(), "_deserializationContext", term290042);
        setField(term289894, term289894.getClass(), "_rootDeserializers", null);
        setField(term289894, term289894.getClass(), "_jsonFactory", null);
        term290152 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term290244 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term290244, term290244.getClass(), "_namespace", null);
        setField(term290244, term290244.getClass(), "_simpleName", "                                                                                                                                                                                                                                         ");
        setField(term290152, term290152.getClass(), "_rootName", term290244);
        setIntField(term290152, term290152.getClass(), "_deserFeatures", -1);
        term290388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term289894;
        args[1] = term290152;
        args[2] = term290388;
        args[3] = "                                                                                                                                                                                                                                         ";
        args[4] = null;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


