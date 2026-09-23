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

public class StdValueInstantiator_init_139436518996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36064;
     Object term36913;
     Object term36916;

    public StdValueInstantiator_init_139436518996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35950 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term36064 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term36913 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term36913, term36913.getClass(), "_valueTypeDesc", "$1");
        setField(term36913, term36913.getClass(), "_valueClass", null);
        setField(term36913, term36913.getClass(), "_defaultCreator", null);
        setField(term36913, term36913.getClass(), "_withArgsCreator", null);
        setField(term36913, term36913.getClass(), "_constructorArguments", null);
        setField(term36913, term36913.getClass(), "_delegateType", null);
        setField(term36913, term36913.getClass(), "_delegateCreator", null);
        setField(term36913, term36913.getClass(), "_delegateArguments", null);
        setField(term36913, term36913.getClass(), "_arrayDelegateType", null);
        setField(term36913, term36913.getClass(), "_arrayDelegateCreator", null);
        setField(term36913, term36913.getClass(), "_arrayDelegateArguments", null);
        setField(term36913, term36913.getClass(), "_fromStringCreator", null);
        setField(term36913, term36913.getClass(), "_fromIntCreator", null);
        setField(term36913, term36913.getClass(), "_fromLongCreator", null);
        setField(term36913, term36913.getClass(), "_fromDoubleCreator", null);
        setField(term36913, term36913.getClass(), "_fromBooleanCreator", null);
        setField(term36913, term36913.getClass(), "_incompleteParameter", null);
        term36916 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term36916, term36916.getClass(), "_ordinal", 0);
        setField(term36916, term36916.getClass(), "_actualType", null);
        setField(term36916, term36916.getClass(), "_superClass", null);
        setField(term36916, term36916.getClass(), "_superInterfaces", null);
        setField(term36916, term36916.getClass(), "_bindings", null);
        setField(term36916, term36916.getClass(), "_canonicalName", null);
        setField(term36916, term36916.getClass(), "_class", null);
        setIntField(term36916, term36916.getClass(), "_hash", 0);
        setField(term36916, term36916.getClass(), "_valueHandler", null);
        setField(term36916, term36916.getClass(), "_typeHandler", null);
        setBooleanField(term36916, term36916.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36064;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36913));
        assertTrue(recursiveEquals(term36064, null));
    }

};


