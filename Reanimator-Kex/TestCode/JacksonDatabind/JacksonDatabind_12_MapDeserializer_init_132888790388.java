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

public class MapDeserializer_init_132888790388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44379;
     Object term44794;
     Object term44796;

    public MapDeserializer_init_132888790388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44379 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term44425 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term44379, term44379.getClass(), "_mapType", term44425);
        term44794 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term44795 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term44795, term44795.getClass(), "_keyType", null);
        setField(term44795, term44795.getClass(), "_valueType", null);
        setField(term44795, term44795.getClass(), "_canonicalName", null);
        setField(term44795, term44795.getClass(), "_class", null);
        setIntField(term44795, term44795.getClass(), "_hash", 0);
        setField(term44795, term44795.getClass(), "_valueHandler", null);
        setField(term44795, term44795.getClass(), "_typeHandler", null);
        setBooleanField(term44795, term44795.getClass(), "_asStatic", false);
        setField(term44794, term44794.getClass(), "_mapType", term44795);
        setField(term44794, term44794.getClass(), "_keyDeserializer", null);
        setBooleanField(term44794, term44794.getClass(), "_standardStringKey", true);
        setField(term44794, term44794.getClass(), "_valueDeserializer", null);
        setField(term44794, term44794.getClass(), "_valueTypeDeserializer", null);
        setField(term44794, term44794.getClass(), "_valueInstantiator", null);
        setBooleanField(term44794, term44794.getClass(), "_hasDefaultCreator", false);
        setField(term44794, term44794.getClass(), "_delegateDeserializer", null);
        setField(term44794, term44794.getClass(), "_propertyBasedCreator", null);
        setField(term44794, term44794.getClass(), "_ignorableProperties", null);
        setField(term44794, term44794.getClass(), "_valueClass", null);
        term44796 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term44797 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term44797, term44797.getClass(), "_keyType", null);
        setField(term44797, term44797.getClass(), "_valueType", null);
        setField(term44797, term44797.getClass(), "_canonicalName", null);
        setField(term44797, term44797.getClass(), "_class", null);
        setIntField(term44797, term44797.getClass(), "_hash", 0);
        setField(term44797, term44797.getClass(), "_valueHandler", null);
        setField(term44797, term44797.getClass(), "_typeHandler", null);
        setBooleanField(term44797, term44797.getClass(), "_asStatic", false);
        setField(term44796, term44796.getClass(), "_mapType", term44797);
        setField(term44796, term44796.getClass(), "_keyDeserializer", null);
        setBooleanField(term44796, term44796.getClass(), "_standardStringKey", false);
        setField(term44796, term44796.getClass(), "_valueDeserializer", null);
        setField(term44796, term44796.getClass(), "_valueTypeDeserializer", null);
        setField(term44796, term44796.getClass(), "_valueInstantiator", null);
        setBooleanField(term44796, term44796.getClass(), "_hasDefaultCreator", false);
        setField(term44796, term44796.getClass(), "_delegateDeserializer", null);
        setField(term44796, term44796.getClass(), "_propertyBasedCreator", null);
        setField(term44796, term44796.getClass(), "_ignorableProperties", null);
        setField(term44796, term44796.getClass(), "_valueClass", null);
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
        args[0] = term44379;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44794));
        assertTrue(recursiveEquals(term44379, null));
    }

};


