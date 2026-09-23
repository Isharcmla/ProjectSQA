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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_getFieldNames_66604790110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term720;

    public ReflectiveTypeAdapterFactory_getFieldNames_66604790110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term708 = new HashMap();
        term706 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term707 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        Object term713 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        Object term718 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term707, term707.getClass(), "instanceCreators", term708);
        setField(term706, term706.getClass(), "constructorConstructor", term707);
        setField(term706, term706.getClass(), "fieldNamingPolicy", null);
        setDoubleField(term713, term713.getClass(), "version", -1.0);
        setIntField(term713, term713.getClass(), "modifiers", 136);
        setBooleanField(term713, term713.getClass(), "serializeInnerClasses", true);
        setBooleanField(term713, term713.getClass(), "requireExpose", false);
        setIntField(term718, term718.getClass(), "modCount", 0);
        setField(term713, term713.getClass(), "serializationStrategies", term718);
        setField(term713, term713.getClass(), "deserializationStrategies", term718);
        setField(term706, term706.getClass(), "excluder", term713);
        Class<? extends Object> term3955 = Class.forName((String) "java.util.IllegalFormatPrecisionException");
        term720 = ((Class) term3955).getDeclaredField((String) "serialVersionUID");
        ((Field) term720).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term720;
        try {
            callMethod(klass, "getFieldNames", argTypes, term706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


