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

public class MapDeserializer_init_1785886176111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55491;
     Object term55719;
     Object term55721;

    public MapDeserializer_init_1785886176111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54943 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedKeySet");
        Object term54907 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term55043 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term55219 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer"));
        Object term55355 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(term54907, term54907.getClass(), "_valueClass", term54943);
        setField(term54907, term54907.getClass(), "_mapType", term55043);
        setField(term54907, term54907.getClass(), "_keyDeserializer", term55219);
        setField(term54907, term54907.getClass(), "_valueDeserializer", null);
        setField(term54907, term54907.getClass(), "_valueTypeDeserializer", null);
        setField(term54907, term54907.getClass(), "_valueInstantiator", null);
        setBooleanField(term54907, term54907.getClass(), "_hasDefaultCreator", false);
        setField(term54907, term54907.getClass(), "_delegateDeserializer", term55355);
        setField(term54907, term54907.getClass(), "_propertyBasedCreator", null);
        term55491 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        term55719 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term55720 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term55719, term55719.getClass(), "_mapType", null);
        setField(term55719, term55719.getClass(), "_keyDeserializer", null);
        setBooleanField(term55719, term55719.getClass(), "_standardStringKey", true);
        setField(term55719, term55719.getClass(), "_valueDeserializer", null);
        setField(term55719, term55719.getClass(), "_valueTypeDeserializer", null);
        setField(term55719, term55719.getClass(), "_valueInstantiator", term55720);
        setBooleanField(term55719, term55719.getClass(), "_hasDefaultCreator", false);
        setField(term55719, term55719.getClass(), "_delegateDeserializer", null);
        setField(term55719, term55719.getClass(), "_propertyBasedCreator", null);
        setField(term55719, term55719.getClass(), "_ignorableProperties", null);
        setField(term55719, term55719.getClass(), "_valueClass", null);
        term55721 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
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
        args[1] = term55491;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55719));
        assertTrue(recursiveEquals(term55491, term55721));
    }

};


