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

public class StringCollectionDeserializer_init_190405741360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20353;
     Object term21369;
     Object term21378;

    public StringCollectionDeserializer_init_190405741360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20257 = Class.forName((String) "java.util.Formatter$DateTime");
        Object term20221 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(term20221, term20221.getClass(), "_valueClass", term20257);
        setField(term20221, term20221.getClass(), "_containerType", null);
        setField(term20221, term20221.getClass(), "_unwrapSingle", null);
        setField(term20221, term20221.getClass(), "_nullProvider", null);
        Class<? extends Object> term20389 = Class.forName((String) "java.util.SortedSet$1");
        term20353 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term20353, term20353.getClass(), "_class", term20389);
        Class<? extends Object> term21371 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        term21369 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term21370 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term21369, term21369.getClass(), "_valueDeserializer", null);
        setField(term21369, term21369.getClass(), "_valueInstantiator", null);
        setField(term21369, term21369.getClass(), "_delegateDeserializer", null);
        setField(term21370, term21370.getClass(), "_componentType", null);
        setField(term21370, term21370.getClass(), "_emptyArray", null);
        setField(term21370, term21370.getClass(), "_superClass", null);
        setField(term21370, term21370.getClass(), "_superInterfaces", null);
        setField(term21370, term21370.getClass(), "_bindings", null);
        setField(term21370, term21370.getClass(), "_canonicalName", null);
        setField(term21370, term21370.getClass(), "_class", term21371);
        setIntField(term21370, term21370.getClass(), "_hash", 0);
        setField(term21370, term21370.getClass(), "_valueHandler", null);
        setField(term21370, term21370.getClass(), "_typeHandler", null);
        setBooleanField(term21370, term21370.getClass(), "_asStatic", false);
        setField(term21369, term21369.getClass(), "_containerType", term21370);
        setField(term21369, term21369.getClass(), "_nullProvider", null);
        setField(term21369, term21369.getClass(), "_unwrapSingle", null);
        setBooleanField(term21369, term21369.getClass(), "_skipNullValues", false);
        setField(term21369, term21369.getClass(), "_valueClass", term21371);
        Class<? extends Object> term21379 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        term21378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term21378, term21378.getClass(), "_componentType", null);
        setField(term21378, term21378.getClass(), "_emptyArray", null);
        setField(term21378, term21378.getClass(), "_superClass", null);
        setField(term21378, term21378.getClass(), "_superInterfaces", null);
        setField(term21378, term21378.getClass(), "_bindings", null);
        setField(term21378, term21378.getClass(), "_canonicalName", null);
        setField(term21378, term21378.getClass(), "_class", term21379);
        setIntField(term21378, term21378.getClass(), "_hash", 0);
        setField(term21378, term21378.getClass(), "_valueHandler", null);
        setField(term21378, term21378.getClass(), "_typeHandler", null);
        setBooleanField(term21378, term21378.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        argTypes[5] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[6];
        args[0] = term20353;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21369));
        assertTrue(recursiveEquals(term20353, term21378));
    }

};


