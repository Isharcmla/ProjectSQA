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

public class ObjectReader_init_1619648465332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132880;

    public ObjectReader_init_1619648465332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term132018 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term132128 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term132276 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term132382 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term132480 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term132642 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
        Object term132680 = newInstance(Class.forName("java.lang.Object"));
        Object term131897 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term132788 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term132018, term132018.getClass(), "_config", term132128);
        setField(term132018, term132018.getClass(), "_context", term132276);
        setField(term132018, term132018.getClass(), "_rootDeserializers", null);
        setField(term132018, term132018.getClass(), "_parserFactory", null);
        setField(term132018, term132018.getClass(), "_rootNames", term132382);
        setField(term132018, term132018.getClass(), "_valueType", term132480);
        setField(term132018, term132018.getClass(), "_rootDeserializer", term132642);
        setField(term132018, term132018.getClass(), "_valueToUpdate", term132680);
        setField(term132018, term132018.getClass(), "_schema", term131897);
        setField(term132018, term132018.getClass(), "_injectableValues", term132788);
        term132880 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term133028 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term133110 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term133192 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term133298 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term133390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term133552 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser"));
        Object term133700 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term131896 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term133808 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term132880, term132880.getClass(), "_context", term133028);
        setField(term132880, term132880.getClass(), "_rootDeserializers", term133110);
        setField(term132880, term132880.getClass(), "_parserFactory", term133192);
        setField(term132880, term132880.getClass(), "_rootNames", term133298);
        setField(term132880, term132880.getClass(), "_valueType", term133390);
        setField(term132880, term132880.getClass(), "_rootDeserializer", term133552);
        setField(term132880, term132880.getClass(), "_valueToUpdate", term133700);
        setField(term132880, term132880.getClass(), "_schema", term131896);
        setField(term132880, term132880.getClass(), "_injectableValues", term133808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term132880;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


