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

public class ObjectReader_init_2022192560440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226457;
     Object term226879;
     Object term227113;
     Object term227245;
     Object term227393;
     Object term224990;
     Object term227501;

    public ObjectReader_init_2022192560440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term225655 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term225765 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term225913 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term225995 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term226091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term226257 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        Object term226365 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term225655, term225655.getClass(), "_config", term225765);
        setField(term225655, term225655.getClass(), "_context", term225913);
        setField(term225655, term225655.getClass(), "_rootDeserializers", null);
        setField(term225655, term225655.getClass(), "_parserFactory", term225995);
        setField(term225655, term225655.getClass(), "_valueType", term226091);
        setField(term225655, term225655.getClass(), "_rootDeserializer", term226257);
        setField(term225655, term225655.getClass(), "_valueToUpdate", term225913);
        setField(term225655, term225655.getClass(), "_schema", null);
        setField(term225655, term225655.getClass(), "_injectableValues", term226365);
        term226457 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term226605 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term226687 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term226769 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term226457, term226457.getClass(), "_context", term226605);
        setField(term226457, term226457.getClass(), "_rootDeserializers", term226687);
        setField(term226457, term226457.getClass(), "_parserFactory", term226769);
        term226879 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term226971 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term226971, term226971.getClass(), "_namespace", null);
        setField(term226971, term226971.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term226879, term226879.getClass(), "_rootName", term226971);
        term227113 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term227245 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        term227393 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term224990 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term227501 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term226457;
        args[1] = term226879;
        args[2] = term227113;
        args[3] = term227245;
        args[4] = term227393;
        args[5] = term224990;
        args[6] = term227501;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


