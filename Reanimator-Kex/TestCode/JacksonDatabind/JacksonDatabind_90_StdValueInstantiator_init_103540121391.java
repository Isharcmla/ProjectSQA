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

public class StdValueInstantiator_init_103540121391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35201;
     Object term35563;
     Object term35564;

    public StdValueInstantiator_init_103540121391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35201 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term35563 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term35563, term35563.getClass(), "_valueTypeDesc", null);
        setField(term35563, term35563.getClass(), "_valueClass", null);
        setField(term35563, term35563.getClass(), "_defaultCreator", null);
        setField(term35563, term35563.getClass(), "_withArgsCreator", null);
        setField(term35563, term35563.getClass(), "_constructorArguments", null);
        setField(term35563, term35563.getClass(), "_delegateType", null);
        setField(term35563, term35563.getClass(), "_delegateCreator", null);
        setField(term35563, term35563.getClass(), "_delegateArguments", null);
        setField(term35563, term35563.getClass(), "_arrayDelegateType", null);
        setField(term35563, term35563.getClass(), "_arrayDelegateCreator", null);
        setField(term35563, term35563.getClass(), "_arrayDelegateArguments", null);
        setField(term35563, term35563.getClass(), "_fromStringCreator", null);
        setField(term35563, term35563.getClass(), "_fromIntCreator", null);
        setField(term35563, term35563.getClass(), "_fromLongCreator", null);
        setField(term35563, term35563.getClass(), "_fromDoubleCreator", null);
        setField(term35563, term35563.getClass(), "_fromBooleanCreator", null);
        setField(term35563, term35563.getClass(), "_incompleteParameter", null);
        term35564 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term35564, term35564.getClass(), "_valueTypeDesc", null);
        setField(term35564, term35564.getClass(), "_valueClass", null);
        setField(term35564, term35564.getClass(), "_defaultCreator", null);
        setField(term35564, term35564.getClass(), "_withArgsCreator", null);
        setField(term35564, term35564.getClass(), "_constructorArguments", null);
        setField(term35564, term35564.getClass(), "_delegateType", null);
        setField(term35564, term35564.getClass(), "_delegateCreator", null);
        setField(term35564, term35564.getClass(), "_delegateArguments", null);
        setField(term35564, term35564.getClass(), "_arrayDelegateType", null);
        setField(term35564, term35564.getClass(), "_arrayDelegateCreator", null);
        setField(term35564, term35564.getClass(), "_arrayDelegateArguments", null);
        setField(term35564, term35564.getClass(), "_fromStringCreator", null);
        setField(term35564, term35564.getClass(), "_fromIntCreator", null);
        setField(term35564, term35564.getClass(), "_fromLongCreator", null);
        setField(term35564, term35564.getClass(), "_fromDoubleCreator", null);
        setField(term35564, term35564.getClass(), "_fromBooleanCreator", null);
        setField(term35564, term35564.getClass(), "_incompleteParameter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Object[] args = new Object[1];
        args[0] = term35201;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35563));
        assertTrue(recursiveEquals(term35201, term35564));
    }

};


