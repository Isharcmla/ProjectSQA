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

public class StdValueInstantiator_init_1394365189101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39039;
     Object term39118;
     Object term39121;

    public StdValueInstantiator_init_1394365189101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38943 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        term39039 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term39118 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term39118, term39118.getClass(), "_valueTypeDesc", "[array type, component type: null]");
        setField(term39118, term39118.getClass(), "_valueClass", null);
        setField(term39118, term39118.getClass(), "_defaultCreator", null);
        setField(term39118, term39118.getClass(), "_withArgsCreator", null);
        setField(term39118, term39118.getClass(), "_constructorArguments", null);
        setField(term39118, term39118.getClass(), "_delegateType", null);
        setField(term39118, term39118.getClass(), "_delegateCreator", null);
        setField(term39118, term39118.getClass(), "_delegateArguments", null);
        setField(term39118, term39118.getClass(), "_arrayDelegateType", null);
        setField(term39118, term39118.getClass(), "_arrayDelegateCreator", null);
        setField(term39118, term39118.getClass(), "_arrayDelegateArguments", null);
        setField(term39118, term39118.getClass(), "_fromStringCreator", null);
        setField(term39118, term39118.getClass(), "_fromIntCreator", null);
        setField(term39118, term39118.getClass(), "_fromLongCreator", null);
        setField(term39118, term39118.getClass(), "_fromDoubleCreator", null);
        setField(term39118, term39118.getClass(), "_fromBooleanCreator", null);
        setField(term39118, term39118.getClass(), "_incompleteParameter", null);
        term39121 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term39121, term39121.getClass(), "_componentType", null);
        setField(term39121, term39121.getClass(), "_emptyArray", null);
        setField(term39121, term39121.getClass(), "_superClass", null);
        setField(term39121, term39121.getClass(), "_superInterfaces", null);
        setField(term39121, term39121.getClass(), "_bindings", null);
        setField(term39121, term39121.getClass(), "_canonicalName", null);
        setField(term39121, term39121.getClass(), "_class", null);
        setIntField(term39121, term39121.getClass(), "_hash", 0);
        setField(term39121, term39121.getClass(), "_valueHandler", null);
        setField(term39121, term39121.getClass(), "_typeHandler", null);
        setBooleanField(term39121, term39121.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39039;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39118));
        assertTrue(recursiveEquals(term39039, null));
    }

};


