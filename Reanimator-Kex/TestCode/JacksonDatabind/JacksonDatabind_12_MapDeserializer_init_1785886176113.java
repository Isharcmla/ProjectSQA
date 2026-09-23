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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_1785886176113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56651;
     Object term56823;

    public MapDeserializer_init_1785886176113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56555 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term56555, term56555.getClass(), "_valueClass", null);
        setField(term56555, term56555.getClass(), "_mapType", null);
        setField(term56555, term56555.getClass(), "_keyDeserializer", null);
        setField(term56555, term56555.getClass(), "_valueDeserializer", null);
        setField(term56555, term56555.getClass(), "_valueTypeDeserializer", null);
        setField(term56555, term56555.getClass(), "_valueInstantiator", null);
        Class<? extends Object> term56687 = Class.forName((String) "java.util.spi.AbstractResourceBundleProvider");
        term56651 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term56651, term56651.getClass(), "_class", term56687);
        term56823 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
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
        args[0] = term56651;
        args[1] = term56823;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


