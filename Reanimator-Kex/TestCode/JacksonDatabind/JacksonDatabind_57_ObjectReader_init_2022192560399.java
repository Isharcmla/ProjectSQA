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

public class ObjectReader_init_2022192560399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176117;
     Object term176402;
     Object term176552;
     Object term176676;
     Object term176780;
     Object term174964;
     Object term176888;

    public ObjectReader_init_2022192560399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term175103 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term176402 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term176448 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term175453 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term175535 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term175617 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term175713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term175879 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        Object term175917 = newInstance(Class.forName("java.lang.Object"));
        Object term174974 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term176025 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term176402, term176402.getClass(), "_rootName", term176448);
        setField(term175103, term175103.getClass(), "_config", term176402);
        setField(term175103, term175103.getClass(), "_context", term175453);
        setField(term175103, term175103.getClass(), "_rootDeserializers", term175535);
        setField(term175103, term175103.getClass(), "_parserFactory", term175617);
        setField(term175103, term175103.getClass(), "_valueType", term175713);
        setField(term175103, term175103.getClass(), "_rootDeserializer", term175879);
        setField(term175103, term175103.getClass(), "_valueToUpdate", term175917);
        setField(term175103, term175103.getClass(), "_schema", term174974);
        setField(term175103, term175103.getClass(), "_injectableValues", term176025);
        term176117 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term176265 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term176347 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term176117, term176117.getClass(), "_context", term176265);
        setField(term176117, term176117.getClass(), "_rootDeserializers", null);
        setField(term176117, term176117.getClass(), "_parserFactory", term176347);
        term176552 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term176676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        term176780 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term174964 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term176888 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term176117;
        args[1] = term176402;
        args[2] = term176552;
        args[3] = term176676;
        args[4] = term176780;
        args[5] = term174964;
        args[6] = term176888;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


