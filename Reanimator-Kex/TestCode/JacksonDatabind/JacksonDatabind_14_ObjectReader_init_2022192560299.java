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

public class ObjectReader_init_2022192560299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95857;
     Object term96285;
     Object term96449;
     Object term96561;

    public ObjectReader_init_2022192560299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95207 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term95289 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term95371 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term95477 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term95591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term95727 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        Object term95765 = newInstance(Class.forName("java.lang.Object"));
        setField(term95207, term95207.getClass(), "_config", null);
        setField(term95207, term95207.getClass(), "_context", null);
        setField(term95207, term95207.getClass(), "_rootDeserializers", term95289);
        setField(term95207, term95207.getClass(), "_parserFactory", term95371);
        setField(term95207, term95207.getClass(), "_rootNames", term95477);
        setField(term95207, term95207.getClass(), "_valueType", term95591);
        setField(term95207, term95207.getClass(), "_rootDeserializer", term95727);
        setField(term95207, term95207.getClass(), "_valueToUpdate", term95765);
        term95857 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term96005 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term96087 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term96193 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term95857, term95857.getClass(), "_context", term96005);
        setField(term95857, term95857.getClass(), "_rootDeserializers", null);
        setField(term95857, term95857.getClass(), "_parserFactory", term96087);
        setField(term95857, term95857.getClass(), "_rootNames", term96193);
        term96285 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term96449 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        term96561 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
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
        args[0] = term95857;
        args[1] = null;
        args[2] = term96285;
        args[3] = term96449;
        args[4] = term96561;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


