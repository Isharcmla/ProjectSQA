package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_1785886176106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50373;
     Object term50555;
     Object term50673;

    public MapDeserializer_init_1785886176106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50005 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy");
        Object term49969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term50105 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term50245 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std"));
        setField(term49969, term49969.getClass(), "_valueClass", term50005);
        setField(term49969, term49969.getClass(), "_mapType", term50105);
        setField(term49969, term49969.getClass(), "_keyDeserializer", null);
        setField(term49969, term49969.getClass(), "_valueDeserializer", term50245);
        setField(term49969, term49969.getClass(), "_valueTypeDeserializer", null);
        setField(term49969, term49969.getClass(), "_valueInstantiator", null);
        term50373 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term50555 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
        term50673 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term50373;
        args[2] = term50555;
        args[3] = term50673;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


