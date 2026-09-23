package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class ReflectiveTypeAdapterFactory_init_5840358887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;
     Object term2291;
     Object term2296;
     Object term2298;

    public ReflectiveTypeAdapterFactory_init_5840358887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term1, term1.getClass(), "instanceCreators", term2);
        term7 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        Object term12 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setDoubleField(term7, term7.getClass(), "version", -1.0);
        setIntField(term7, term7.getClass(), "modifiers", 136);
        setBooleanField(term7, term7.getClass(), "serializeInnerClasses", true);
        setBooleanField(term7, term7.getClass(), "requireExpose", false);
        setIntField(term12, term12.getClass(), "modCount", 0);
        setField(term7, term7.getClass(), "serializationStrategies", term12);
        setField(term7, term7.getClass(), "deserializationStrategies", term12);
        HashMap term2293 = new HashMap();
        term2291 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term2292 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        Object term2294 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        Object term2295 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term2292, term2292.getClass(), "instanceCreators", term2293);
        setField(term2291, term2291.getClass(), "constructorConstructor", term2292);
        setField(term2291, term2291.getClass(), "fieldNamingPolicy", null);
        setDoubleField(term2294, term2294.getClass(), "version", -1.0);
        setIntField(term2294, term2294.getClass(), "modifiers", 136);
        setBooleanField(term2294, term2294.getClass(), "serializeInnerClasses", true);
        setBooleanField(term2294, term2294.getClass(), "requireExpose", false);
        setIntField(term2295, term2295.getClass(), "modCount", 0);
        setField(term2294, term2294.getClass(), "serializationStrategies", term2295);
        setField(term2294, term2294.getClass(), "deserializationStrategies", term2295);
        setField(term2291, term2291.getClass(), "excluder", term2294);
        HashMap term2297 = new HashMap();
        term2296 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term2296, term2296.getClass(), "instanceCreators", term2297);
        term2298 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        Object term2299 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setDoubleField(term2298, term2298.getClass(), "version", -1.0);
        setIntField(term2298, term2298.getClass(), "modifiers", 136);
        setBooleanField(term2298, term2298.getClass(), "serializeInnerClasses", true);
        setBooleanField(term2298, term2298.getClass(), "requireExpose", false);
        setIntField(term2299, term2299.getClass(), "modCount", 0);
        setField(term2298, term2298.getClass(), "serializationStrategies", term2299);
        setField(term2298, term2298.getClass(), "deserializationStrategies", term2299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.gson.internal.ConstructorConstructor");
        argTypes[1] = Class.forName("com.google.gson.FieldNamingStrategy");
        argTypes[2] = Class.forName("com.google.gson.internal.Excluder");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = null;
        args[2] = term7;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2291));
        assertTrue(recursiveEquals(term1, term2296));
        assertTrue(recursiveEquals(term7, term2298));
    }

};


