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
import org.mockito.Mockito;

public class ObjectReader_init_2073957032288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86547;
     Object term86792;
     Object term86884;
     Object term86992;

    public ObjectReader_init_2073957032288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85871 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term85981 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term86588 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term86629 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term86682 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term86347 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term85600 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term86455 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term85871, term85871.getClass(), "_config", term85981);
        setField(term85871, term85871.getClass(), "_context", null);
        setField(term85871, term85871.getClass(), "_rootDeserializers", term86588);
        setField(term85871, term85871.getClass(), "_parserFactory", term86629);
        setField(term85871, term85871.getClass(), "_rootNames", term86682);
        setField(term85871, term85871.getClass(), "_valueType", term86347);
        setField(term85871, term85871.getClass(), "_valueToUpdate", null);
        setField(term85871, term85871.getClass(), "_schema", term85600);
        setField(term85871, term85871.getClass(), "_injectableValues", term86455);
        setBooleanField(term85871, term85871.getClass(), "_unwrapRoot", false);
        term86547 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term86547, term86547.getClass(), "_deserializationContext", null);
        setField(term86547, term86547.getClass(), "_rootDeserializers", term86588);
        setField(term86547, term86547.getClass(), "_jsonFactory", term86629);
        setField(term86547, term86547.getClass(), "_rootNames", term86682);
        term86792 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term86792, term86792.getClass(), "_rootName", null);
        setIntField(term86792, term86792.getClass(), "_deserFeatures", -1);
        term86884 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term86992 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term86547;
        args[1] = term86792;
        args[2] = term86884;
        args[3] = null;
        args[4] = null;
        args[5] = term86992;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


