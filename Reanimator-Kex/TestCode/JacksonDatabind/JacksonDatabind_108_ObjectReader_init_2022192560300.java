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

public class ObjectReader_init_2022192560300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68532;
     Object term68872;
     Object term69166;
     Object term69258;
     Object term67565;
     Object term69366;

    public ObjectReader_init_2022192560300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67702 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term67850 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term67932 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term68014 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term68134 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term68294 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$IntDeser"));
        Object term68332 = newInstance(Class.forName("java.lang.Object"));
        Object term67575 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term68440 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term67702, term67702.getClass(), "_config", null);
        setField(term67702, term67702.getClass(), "_context", term67850);
        setField(term67702, term67702.getClass(), "_rootDeserializers", term67932);
        setField(term67702, term67702.getClass(), "_parserFactory", term68014);
        setField(term67702, term67702.getClass(), "_valueType", term68134);
        setField(term67702, term67702.getClass(), "_rootDeserializer", term68294);
        setField(term67702, term67702.getClass(), "_valueToUpdate", term68332);
        setField(term67702, term67702.getClass(), "_schema", term67575);
        setField(term67702, term67702.getClass(), "_injectableValues", term68440);
        term68532 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term68680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term68762 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term68532, term68532.getClass(), "_context", term68680);
        setField(term68532, term68532.getClass(), "_rootDeserializers", null);
        setField(term68532, term68532.getClass(), "_parserFactory", term68762);
        term68872 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term68964 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term68964, term68964.getClass(), "_namespace", null);
        setField(term68964, term68964.getClass(), "_simpleName", "");
        setField(term68872, term68872.getClass(), "_rootName", term68964);
        term69166 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser"));
        term69258 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term67565 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term69366 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term68532;
        args[1] = term68872;
        args[2] = null;
        args[3] = term69166;
        args[4] = term69258;
        args[5] = term67565;
        args[6] = term69366;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


