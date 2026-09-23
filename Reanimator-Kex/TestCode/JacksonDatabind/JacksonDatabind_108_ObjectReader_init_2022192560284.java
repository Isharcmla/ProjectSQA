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

public class ObjectReader_init_2022192560284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54859;
     Object term55336;
     Object term55558;
     Object term55704;
     Object term55796;
     Object term53945;
     Object term55904;

    public ObjectReader_init_2022192560284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54859 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term54914 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term54988 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term55029 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term55086 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term55172 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer"));
        Object term53952 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term55226 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term54859, term54859.getClass(), "_config", term54914);
        setField(term54859, term54859.getClass(), "_context", term54988);
        setField(term54859, term54859.getClass(), "_rootDeserializers", null);
        setField(term54859, term54859.getClass(), "_parserFactory", term55029);
        setField(term54859, term54859.getClass(), "_valueType", term55086);
        setField(term54859, term54859.getClass(), "_rootDeserializer", term55172);
        setField(term54859, term54859.getClass(), "_valueToUpdate", term55086);
        setField(term54859, term54859.getClass(), "_schema", term53952);
        setField(term54859, term54859.getClass(), "_injectableValues", term55226);
        term55336 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term55428 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term55428, term55428.getClass(), "_namespace", "");
        setField(term55336, term55336.getClass(), "_rootName", term55428);
        term55558 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term55704 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer"));
        term55796 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term53945 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term55904 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term54859;
        args[1] = term55336;
        args[2] = term55558;
        args[3] = term55704;
        args[4] = term55796;
        args[5] = term53945;
        args[6] = term55904;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


