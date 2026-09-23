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

public class MapDeserializer_init_178588617684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41150;
     Object term41422;
     Object term41560;

    public MapDeserializer_init_178588617684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41058 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term41058, term41058.getClass(), "_valueClass", null);
        setField(term41058, term41058.getClass(), "_mapType", null);
        setField(term41058, term41058.getClass(), "_keyDeserializer", null);
        setField(term41058, term41058.getClass(), "_valueDeserializer", null);
        setField(term41058, term41058.getClass(), "_valueTypeDeserializer", null);
        setField(term41058, term41058.getClass(), "_valueInstantiator", null);
        setBooleanField(term41058, term41058.getClass(), "_hasDefaultCreator", false);
        setField(term41058, term41058.getClass(), "_delegateDeserializer", null);
        setField(term41058, term41058.getClass(), "_propertyBasedCreator", null);
        Class<? extends Object> term41186 = Class.forName((String) "java.lang.invoke.LambdaForm$NamedFunction");
        term41150 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term41284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term41150, term41150.getClass(), "_class", term41186);
        setField(term41150, term41150.getClass(), "_keyType", term41284);
        term41422 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        term41560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD"));
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
        args[0] = term41150;
        args[1] = term41422;
        args[2] = term41560;
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


