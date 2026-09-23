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

public class StdValueInstantiator_init_139436518997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37528;
     Object term37564;
     Object term37567;

    public StdValueInstantiator_init_139436518997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37414 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term37528 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term37564 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term37564, term37564.getClass(), "_valueTypeDesc", "$1");
        setField(term37564, term37564.getClass(), "_valueClass", null);
        setField(term37564, term37564.getClass(), "_defaultCreator", null);
        setField(term37564, term37564.getClass(), "_withArgsCreator", null);
        setField(term37564, term37564.getClass(), "_constructorArguments", null);
        setField(term37564, term37564.getClass(), "_delegateType", null);
        setField(term37564, term37564.getClass(), "_delegateCreator", null);
        setField(term37564, term37564.getClass(), "_delegateArguments", null);
        setField(term37564, term37564.getClass(), "_arrayDelegateType", null);
        setField(term37564, term37564.getClass(), "_arrayDelegateCreator", null);
        setField(term37564, term37564.getClass(), "_arrayDelegateArguments", null);
        setField(term37564, term37564.getClass(), "_fromStringCreator", null);
        setField(term37564, term37564.getClass(), "_fromIntCreator", null);
        setField(term37564, term37564.getClass(), "_fromLongCreator", null);
        setField(term37564, term37564.getClass(), "_fromDoubleCreator", null);
        setField(term37564, term37564.getClass(), "_fromBooleanCreator", null);
        setField(term37564, term37564.getClass(), "_incompleteParameter", null);
        term37567 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term37567, term37567.getClass(), "_ordinal", 0);
        setField(term37567, term37567.getClass(), "_actualType", null);
        setField(term37567, term37567.getClass(), "_superClass", null);
        setField(term37567, term37567.getClass(), "_superInterfaces", null);
        setField(term37567, term37567.getClass(), "_bindings", null);
        setField(term37567, term37567.getClass(), "_canonicalName", null);
        setField(term37567, term37567.getClass(), "_class", null);
        setIntField(term37567, term37567.getClass(), "_hash", 0);
        setField(term37567, term37567.getClass(), "_valueHandler", null);
        setField(term37567, term37567.getClass(), "_typeHandler", null);
        setBooleanField(term37567, term37567.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term37528;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term37564));
        assertTrue(recursiveEquals(term37528, null));
    }

};


