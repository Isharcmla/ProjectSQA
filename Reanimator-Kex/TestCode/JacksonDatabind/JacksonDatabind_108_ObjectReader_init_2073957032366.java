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

public class ObjectReader_init_2073957032366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154986;
     Object term155336;
     Object term155566;

    public ObjectReader_init_2073957032366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term154636 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term154746 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term154894 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term154636, term154636.getClass(), "_config", term154746);
        setField(term154636, term154636.getClass(), "_context", term154894);
        setField(term154636, term154636.getClass(), "_rootDeserializers", null);
        setField(term154636, term154636.getClass(), "_parserFactory", null);
        setField(term154636, term154636.getClass(), "_valueType", null);
        setField(term154636, term154636.getClass(), "_valueToUpdate", null);
        setField(term154636, term154636.getClass(), "_schema", null);
        setField(term154636, term154636.getClass(), "_injectableValues", null);
        setBooleanField(term154636, term154636.getClass(), "_unwrapRoot", false);
        term154986 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term155134 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term155226 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term154986, term154986.getClass(), "_deserializationContext", term155134);
        setField(term154986, term154986.getClass(), "_rootDeserializers", term155226);
        setField(term154986, term154986.getClass(), "_jsonFactory", null);
        term155336 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term155428 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term155428, term155428.getClass(), "_namespace", null);
        setField(term155428, term155428.getClass(), "_simpleName", "");
        setField(term155336, term155336.getClass(), "_rootName", term155428);
        setIntField(term155336, term155336.getClass(), "_deserFeatures", -1);
        term155566 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term154986;
        args[1] = term155336;
        args[2] = term155566;
        args[3] = null;
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


