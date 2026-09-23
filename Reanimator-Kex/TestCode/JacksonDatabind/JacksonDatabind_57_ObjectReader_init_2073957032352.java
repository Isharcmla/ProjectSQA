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

public class ObjectReader_init_2073957032352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121678;
     Object term121788;
     Object term120780;
     Object term122026;

    public ObjectReader_init_2073957032352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term120918 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term121028 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term121176 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term121258 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term121340 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term121440 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term121478 = newInstance(Class.forName("java.lang.Object"));
        Object term120788 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term121586 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term120918, term120918.getClass(), "_config", term121028);
        setField(term120918, term120918.getClass(), "_context", term121176);
        setField(term120918, term120918.getClass(), "_rootDeserializers", term121258);
        setField(term120918, term120918.getClass(), "_parserFactory", term121340);
        setField(term120918, term120918.getClass(), "_valueType", term121440);
        setField(term120918, term120918.getClass(), "_valueToUpdate", term121478);
        setField(term120918, term120918.getClass(), "_schema", term120788);
        setField(term120918, term120918.getClass(), "_injectableValues", term121586);
        setBooleanField(term120918, term120918.getClass(), "_unwrapRoot", false);
        term121678 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term121678, term121678.getClass(), "_deserializationContext", null);
        setField(term121678, term121678.getClass(), "_rootDeserializers", null);
        setField(term121678, term121678.getClass(), "_jsonFactory", null);
        term121788 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term121880 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term121880, term121880.getClass(), "_namespace", "");
        setField(term121788, term121788.getClass(), "_rootName", term121880);
        term120780 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term122026 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term121678;
        args[1] = term121788;
        args[2] = null;
        args[3] = null;
        args[4] = term120780;
        args[5] = term122026;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


