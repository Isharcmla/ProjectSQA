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

public class ObjectReader_init_2022192560298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97691;
     Object term98071;
     Object term98169;
     Object term98317;
     Object term98423;
     Object term96568;

    public ObjectReader_init_2022192560298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term96705 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term96815 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term96963 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term97045 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term97127 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term97233 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term97333 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term97453 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        Object term97491 = newInstance(Class.forName("java.lang.Object"));
        Object term96580 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term97599 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term96705, term96705.getClass(), "_config", term96815);
        setField(term96705, term96705.getClass(), "_context", term96963);
        setField(term96705, term96705.getClass(), "_rootDeserializers", term97045);
        setField(term96705, term96705.getClass(), "_parserFactory", term97127);
        setField(term96705, term96705.getClass(), "_rootNames", term97233);
        setField(term96705, term96705.getClass(), "_valueType", term97333);
        setField(term96705, term96705.getClass(), "_rootDeserializer", term97453);
        setField(term96705, term96705.getClass(), "_valueToUpdate", term97491);
        setField(term96705, term96705.getClass(), "_schema", term96580);
        setField(term96705, term96705.getClass(), "_injectableValues", term97599);
        term97691 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term97773 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term97855 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term97961 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term97691, term97691.getClass(), "_context", null);
        setField(term97691, term97691.getClass(), "_rootDeserializers", term97773);
        setField(term97691, term97691.getClass(), "_parserFactory", term97855);
        setField(term97691, term97691.getClass(), "_rootNames", term97961);
        term98071 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term98169 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term98317 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        term98423 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term96568 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term97691;
        args[1] = term98071;
        args[2] = term98169;
        args[3] = term98317;
        args[4] = term98423;
        args[5] = term96568;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


