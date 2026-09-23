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

public class MapDeserializer_init_132888790393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45494;
     Object term45562;
     Object term45564;

    public MapDeserializer_init_132888790393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term45494, term45494.getClass(), "_mapType", term45543);
        term45562 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45563 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term45563, term45563.getClass(), "_typeParameters", null);
        setField(term45563, term45563.getClass(), "_typeNames", null);
        setField(term45563, term45563.getClass(), "_canonicalName", null);
        setField(term45563, term45563.getClass(), "_class", null);
        setIntField(term45563, term45563.getClass(), "_hash", 0);
        setField(term45563, term45563.getClass(), "_valueHandler", null);
        setField(term45563, term45563.getClass(), "_typeHandler", null);
        setBooleanField(term45563, term45563.getClass(), "_asStatic", false);
        setField(term45562, term45562.getClass(), "_mapType", term45563);
        setField(term45562, term45562.getClass(), "_keyDeserializer", null);
        setBooleanField(term45562, term45562.getClass(), "_standardStringKey", true);
        setField(term45562, term45562.getClass(), "_valueDeserializer", null);
        setField(term45562, term45562.getClass(), "_valueTypeDeserializer", null);
        setField(term45562, term45562.getClass(), "_valueInstantiator", null);
        setBooleanField(term45562, term45562.getClass(), "_hasDefaultCreator", false);
        setField(term45562, term45562.getClass(), "_delegateDeserializer", null);
        setField(term45562, term45562.getClass(), "_propertyBasedCreator", null);
        setField(term45562, term45562.getClass(), "_ignorableProperties", null);
        setField(term45562, term45562.getClass(), "_valueClass", null);
        term45564 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45565 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term45565, term45565.getClass(), "_typeParameters", null);
        setField(term45565, term45565.getClass(), "_typeNames", null);
        setField(term45565, term45565.getClass(), "_canonicalName", null);
        setField(term45565, term45565.getClass(), "_class", null);
        setIntField(term45565, term45565.getClass(), "_hash", 0);
        setField(term45565, term45565.getClass(), "_valueHandler", null);
        setField(term45565, term45565.getClass(), "_typeHandler", null);
        setBooleanField(term45565, term45565.getClass(), "_asStatic", false);
        setField(term45564, term45564.getClass(), "_mapType", term45565);
        setField(term45564, term45564.getClass(), "_keyDeserializer", null);
        setBooleanField(term45564, term45564.getClass(), "_standardStringKey", false);
        setField(term45564, term45564.getClass(), "_valueDeserializer", null);
        setField(term45564, term45564.getClass(), "_valueTypeDeserializer", null);
        setField(term45564, term45564.getClass(), "_valueInstantiator", null);
        setBooleanField(term45564, term45564.getClass(), "_hasDefaultCreator", false);
        setField(term45564, term45564.getClass(), "_delegateDeserializer", null);
        setField(term45564, term45564.getClass(), "_propertyBasedCreator", null);
        setField(term45564, term45564.getClass(), "_ignorableProperties", null);
        setField(term45564, term45564.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("java.util.HashSet");
        Object[] args = new Object[5];
        args[0] = term45494;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45562));
        assertTrue(recursiveEquals(term45494, null));
    }

};


