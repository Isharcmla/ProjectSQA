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

public class ObjectReader_init_2022192560265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37194;
     Object term37534;
     Object term37740;
     Object term37896;
     Object term38044;
     Object term36266;
     Object term38152;

    public ObjectReader_init_2022192560265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36398 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term36508 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term36656 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term36738 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term36830 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term36956 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer"));
        Object term36994 = newInstance(Class.forName("java.lang.Object"));
        Object term36276 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term37102 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term36398, term36398.getClass(), "_config", term36508);
        setField(term36398, term36398.getClass(), "_context", term36656);
        setField(term36398, term36398.getClass(), "_rootDeserializers", null);
        setField(term36398, term36398.getClass(), "_parserFactory", term36738);
        setField(term36398, term36398.getClass(), "_valueType", term36830);
        setField(term36398, term36398.getClass(), "_rootDeserializer", term36956);
        setField(term36398, term36398.getClass(), "_valueToUpdate", term36994);
        setField(term36398, term36398.getClass(), "_schema", term36276);
        setField(term36398, term36398.getClass(), "_injectableValues", term37102);
        term37194 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term37342 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term37424 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term37194, term37194.getClass(), "_context", term37342);
        setField(term37194, term37194.getClass(), "_rootDeserializers", null);
        setField(term37194, term37194.getClass(), "_parserFactory", term37424);
        term37534 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term37626 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term37534, term37534.getClass(), "_rootName", term37626);
        term37740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term37896 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer"));
        term38044 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        term36266 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term38152 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term37194;
        args[1] = term37534;
        args[2] = term37740;
        args[3] = term37896;
        args[4] = term38044;
        args[5] = term36266;
        args[6] = term38152;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


