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

public class StdValueInstantiator_init_161228094495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36173;
     Object term36702;
     Object term36724;

    public StdValueInstantiator_init_161228094495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36137 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term36173 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ValueIterator");
        Class<? extends Object> term36705 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.UUIDSerializer");
        term36702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term36702, term36702.getClass(), "_valueTypeDesc", "`com.fasterxml.jackson.databind.ser.std.UUIDSerializer`");
        setField(term36702, term36702.getClass(), "_valueClass", term36705);
        setField(term36702, term36702.getClass(), "_defaultCreator", null);
        setField(term36702, term36702.getClass(), "_withArgsCreator", null);
        setField(term36702, term36702.getClass(), "_constructorArguments", null);
        setField(term36702, term36702.getClass(), "_delegateType", null);
        setField(term36702, term36702.getClass(), "_delegateCreator", null);
        setField(term36702, term36702.getClass(), "_delegateArguments", null);
        setField(term36702, term36702.getClass(), "_arrayDelegateType", null);
        setField(term36702, term36702.getClass(), "_arrayDelegateCreator", null);
        setField(term36702, term36702.getClass(), "_arrayDelegateArguments", null);
        setField(term36702, term36702.getClass(), "_fromStringCreator", null);
        setField(term36702, term36702.getClass(), "_fromIntCreator", null);
        setField(term36702, term36702.getClass(), "_fromLongCreator", null);
        setField(term36702, term36702.getClass(), "_fromDoubleCreator", null);
        setField(term36702, term36702.getClass(), "_fromBooleanCreator", null);
        setField(term36702, term36702.getClass(), "_incompleteParameter", null);
        term36724 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.UUIDSerializer");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36173;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36702));
        assertTrue(recursiveEquals(term36173, null));
    }

};


