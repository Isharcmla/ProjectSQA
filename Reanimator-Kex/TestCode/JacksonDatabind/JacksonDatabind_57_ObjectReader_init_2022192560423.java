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

public class ObjectReader_init_2022192560423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206166;
     Object term206358;
     Object term206554;
     Object term206616;
     Object term206708;
     Object term205139;
     Object term206816;

    public ObjectReader_init_2022192560423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term205276 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term205386 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term205534 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term205616 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term205698 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term205804 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term206616 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        Object term205966 = newInstance(Class.forName("java.lang.Object"));
        Object term205148 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term206074 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term205276, term205276.getClass(), "_config", term205386);
        setField(term205276, term205276.getClass(), "_context", term205534);
        setField(term205276, term205276.getClass(), "_rootDeserializers", term205616);
        setField(term205276, term205276.getClass(), "_parserFactory", term205698);
        setField(term205276, term205276.getClass(), "_valueType", term205804);
        setField(term205276, term205276.getClass(), "_rootDeserializer", term206616);
        setField(term205276, term205276.getClass(), "_valueToUpdate", term205966);
        setField(term205276, term205276.getClass(), "_schema", term205148);
        setField(term205276, term205276.getClass(), "_injectableValues", term206074);
        term206166 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term206248 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term206166, term206166.getClass(), "_context", null);
        setField(term206166, term206166.getClass(), "_rootDeserializers", null);
        setField(term206166, term206166.getClass(), "_parserFactory", term206248);
        term206358 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term206450 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term206358, term206358.getClass(), "_rootName", term206450);
        term206554 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term206708 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term205139 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term206816 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term206166;
        args[1] = term206358;
        args[2] = term206554;
        args[3] = term206616;
        args[4] = term206708;
        args[5] = term205139;
        args[6] = term206816;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


