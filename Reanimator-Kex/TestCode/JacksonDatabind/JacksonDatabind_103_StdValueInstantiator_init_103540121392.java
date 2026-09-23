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

public class StdValueInstantiator_init_103540121392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32302;
     Object term35436;
     Object term35437;

    public StdValueInstantiator_init_103540121392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32302 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term35436 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term35436, term35436.getClass(), "_valueTypeDesc", null);
        setField(term35436, term35436.getClass(), "_valueClass", null);
        setField(term35436, term35436.getClass(), "_defaultCreator", null);
        setField(term35436, term35436.getClass(), "_withArgsCreator", null);
        setField(term35436, term35436.getClass(), "_constructorArguments", null);
        setField(term35436, term35436.getClass(), "_delegateType", null);
        setField(term35436, term35436.getClass(), "_delegateCreator", null);
        setField(term35436, term35436.getClass(), "_delegateArguments", null);
        setField(term35436, term35436.getClass(), "_arrayDelegateType", null);
        setField(term35436, term35436.getClass(), "_arrayDelegateCreator", null);
        setField(term35436, term35436.getClass(), "_arrayDelegateArguments", null);
        setField(term35436, term35436.getClass(), "_fromStringCreator", null);
        setField(term35436, term35436.getClass(), "_fromIntCreator", null);
        setField(term35436, term35436.getClass(), "_fromLongCreator", null);
        setField(term35436, term35436.getClass(), "_fromDoubleCreator", null);
        setField(term35436, term35436.getClass(), "_fromBooleanCreator", null);
        setField(term35436, term35436.getClass(), "_incompleteParameter", null);
        term35437 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term35437, term35437.getClass(), "_valueTypeDesc", null);
        setField(term35437, term35437.getClass(), "_valueClass", null);
        setField(term35437, term35437.getClass(), "_defaultCreator", null);
        setField(term35437, term35437.getClass(), "_withArgsCreator", null);
        setField(term35437, term35437.getClass(), "_constructorArguments", null);
        setField(term35437, term35437.getClass(), "_delegateType", null);
        setField(term35437, term35437.getClass(), "_delegateCreator", null);
        setField(term35437, term35437.getClass(), "_delegateArguments", null);
        setField(term35437, term35437.getClass(), "_arrayDelegateType", null);
        setField(term35437, term35437.getClass(), "_arrayDelegateCreator", null);
        setField(term35437, term35437.getClass(), "_arrayDelegateArguments", null);
        setField(term35437, term35437.getClass(), "_fromStringCreator", null);
        setField(term35437, term35437.getClass(), "_fromIntCreator", null);
        setField(term35437, term35437.getClass(), "_fromLongCreator", null);
        setField(term35437, term35437.getClass(), "_fromDoubleCreator", null);
        setField(term35437, term35437.getClass(), "_fromBooleanCreator", null);
        setField(term35437, term35437.getClass(), "_incompleteParameter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Object[] args = new Object[1];
        args[0] = term32302;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35436));
        assertTrue(recursiveEquals(term32302, term35437));
    }

};


