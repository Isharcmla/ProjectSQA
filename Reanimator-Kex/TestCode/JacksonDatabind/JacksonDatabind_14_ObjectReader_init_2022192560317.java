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

public class ObjectReader_init_2022192560317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120642;
     Object term121088;
     Object term121224;
     Object term121386;
     Object term119608;
     Object term121494;

    public ObjectReader_init_2022192560317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119760 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term119870 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term120018 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term120100 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term120182 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term120278 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term120442 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        Object term119619 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term120550 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term119760, term119760.getClass(), "_config", term119870);
        setField(term119760, term119760.getClass(), "_context", term120018);
        setField(term119760, term119760.getClass(), "_rootDeserializers", term120100);
        setField(term119760, term119760.getClass(), "_parserFactory", term120182);
        setField(term119760, term119760.getClass(), "_rootNames", null);
        setField(term119760, term119760.getClass(), "_valueType", term120278);
        setField(term119760, term119760.getClass(), "_rootDeserializer", term120442);
        setField(term119760, term119760.getClass(), "_valueToUpdate", term119870);
        setField(term119760, term119760.getClass(), "_schema", term119619);
        setField(term119760, term119760.getClass(), "_injectableValues", term120550);
        term120642 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term120790 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term120872 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term120978 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term120642, term120642.getClass(), "_context", term120790);
        setField(term120642, term120642.getClass(), "_rootDeserializers", null);
        setField(term120642, term120642.getClass(), "_parserFactory", term120872);
        setField(term120642, term120642.getClass(), "_rootNames", term120978);
        term121088 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term121088, term121088.getClass(), "_rootName", "        ");
        term121224 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term121386 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        term119608 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term121494 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term120642;
        args[1] = term121088;
        args[2] = term121224;
        args[3] = term121386;
        args[4] = null;
        args[5] = term119608;
        args[6] = term121494;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


