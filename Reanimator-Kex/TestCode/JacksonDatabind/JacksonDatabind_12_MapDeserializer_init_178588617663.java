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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_178588617663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27251;
     Object term27395;
     Object term27397;

    public MapDeserializer_init_178588617663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26825 = Class.forName((String) "java.nio.channels.Selector");
        Object term26789 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term26931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term27113 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
        setField(term26789, term26789.getClass(), "_valueClass", term26825);
        setField(term26789, term26789.getClass(), "_mapType", term26931);
        setField(term26789, term26789.getClass(), "_keyDeserializer", term27113);
        setField(term26789, term26789.getClass(), "_valueDeserializer", null);
        setField(term26789, term26789.getClass(), "_valueTypeDeserializer", null);
        setField(term26789, term26789.getClass(), "_valueInstantiator", null);
        setBooleanField(term26789, term26789.getClass(), "_hasDefaultCreator", false);
        setField(term26789, term26789.getClass(), "_delegateDeserializer", null);
        setField(term26789, term26789.getClass(), "_propertyBasedCreator", null);
        term27251 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        term27395 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term27396 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term27395, term27395.getClass(), "_mapType", null);
        setField(term27395, term27395.getClass(), "_keyDeserializer", null);
        setBooleanField(term27395, term27395.getClass(), "_standardStringKey", true);
        setField(term27395, term27395.getClass(), "_valueDeserializer", null);
        setField(term27395, term27395.getClass(), "_valueTypeDeserializer", null);
        setIntField(term27396, term27396.getClass(), "_type", 0);
        setField(term27395, term27395.getClass(), "_valueInstantiator", term27396);
        setBooleanField(term27395, term27395.getClass(), "_hasDefaultCreator", true);
        setField(term27395, term27395.getClass(), "_delegateDeserializer", null);
        setField(term27395, term27395.getClass(), "_propertyBasedCreator", null);
        setField(term27395, term27395.getClass(), "_ignorableProperties", null);
        setField(term27395, term27395.getClass(), "_valueClass", null);
        term27397 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setIntField(term27397, term27397.getClass(), "_type", 0);
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
        args[1] = term27251;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27395));
        assertTrue(recursiveEquals(term27251, term27397));
    }

};


