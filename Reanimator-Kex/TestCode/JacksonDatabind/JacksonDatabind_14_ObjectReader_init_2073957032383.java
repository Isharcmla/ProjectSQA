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

public class ObjectReader_init_2073957032383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190007;
     Object term190357;
     Object term190501;
     Object term190655;
     Object term188822;
     Object term190763;

    public ObjectReader_init_2073957032383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term189769 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term189476 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term189915 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term189769, term189769.getClass(), "_config", null);
        setField(term189769, term189769.getClass(), "_context", null);
        setField(term189769, term189769.getClass(), "_rootDeserializers", null);
        setField(term189769, term189769.getClass(), "_parserFactory", null);
        setField(term189769, term189769.getClass(), "_rootNames", null);
        setField(term189769, term189769.getClass(), "_valueType", null);
        setField(term189769, term189769.getClass(), "_valueToUpdate", "EAGER_DESERIALIZER_FETCH");
        setField(term189769, term189769.getClass(), "_schema", term189476);
        setField(term189769, term189769.getClass(), "_injectableValues", term189915);
        setBooleanField(term189769, term189769.getClass(), "_unwrapRoot", false);
        term190007 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term190155 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term190247 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term190007, term190007.getClass(), "_deserializationContext", term190155);
        setField(term190007, term190007.getClass(), "_rootDeserializers", term190247);
        setField(term190007, term190007.getClass(), "_jsonFactory", null);
        setField(term190007, term190007.getClass(), "_rootNames", null);
        term190357 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term190357, term190357.getClass(), "_rootName", "");
        setIntField(term190357, term190357.getClass(), "_deserFeatures", -1);
        term190501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term190655 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        term188822 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term190763 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term190007;
        args[1] = term190357;
        args[2] = term190501;
        args[3] = term190655;
        args[4] = term188822;
        args[5] = term190763;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


