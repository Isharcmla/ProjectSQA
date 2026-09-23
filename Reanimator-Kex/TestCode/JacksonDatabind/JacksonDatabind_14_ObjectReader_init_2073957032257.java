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
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_2073957032257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54879;
     Object term55325;
     Object term55477;
     Object term54112;
     Object term55585;

    public ObjectReader_init_2073957032257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54245 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term54393 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term54475 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term54581 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term54679 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term54121 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term54787 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term54245, term54245.getClass(), "_config", null);
        setField(term54245, term54245.getClass(), "_context", term54393);
        setField(term54245, term54245.getClass(), "_rootDeserializers", term54475);
        setField(term54245, term54245.getClass(), "_parserFactory", null);
        setField(term54245, term54245.getClass(), "_rootNames", term54581);
        setField(term54245, term54245.getClass(), "_valueType", term54679);
        setField(term54245, term54245.getClass(), "_valueToUpdate", term54475);
        setField(term54245, term54245.getClass(), "_schema", term54121);
        setField(term54245, term54245.getClass(), "_injectableValues", term54787);
        term54879 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term55027 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term55109 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term55215 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term54879, term54879.getClass(), "_deserializationContext", term55027);
        setField(term54879, term54879.getClass(), "_rootDeserializers", null);
        setField(term54879, term54879.getClass(), "_jsonFactory", term55109);
        setField(term54879, term54879.getClass(), "_rootNames", term55215);
        term55325 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term55325, term55325.getClass(), "_rootName", "");
        term55477 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term54112 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term55585 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term54879;
        args[1] = term55325;
        args[2] = term55477;
        args[3] = null;
        args[4] = term54112;
        args[5] = term55585;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


