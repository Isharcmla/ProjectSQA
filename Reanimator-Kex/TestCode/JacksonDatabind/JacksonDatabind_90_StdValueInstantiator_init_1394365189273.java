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

public class StdValueInstantiator_init_1394365189273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299343;
     Object term301521;
     Object term301548;
     Object term301576;

    public StdValueInstantiator_init_1394365189273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term299239 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term299379 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term299343 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term299509 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term299623 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term299737 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term299343, term299343.getClass(), "_class", term299379);
        setField(term299509, term299509.getClass(), "_canonicalName", null);
        setField(term299509, term299509.getClass(), "_class", term299379);
        setField(term299623, term299623.getClass(), "_canonicalName", null);
        setIntField(term299623, term299623.getClass(), "_ordinal", 0);
        setField(term299509, term299509.getClass(), "_keyType", term299623);
        setField(term299509, term299509.getClass(), "_valueType", term299737);
        setField(term299343, term299343.getClass(), "_referencedType", term299509);
        Class<? extends Object> term301524 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term301521 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term301521, term301521.getClass(), "_valueTypeDesc", "[reference type, class com.fasterxml.jackson.databind.type.PlaceholderForType<com.fasterxml.jackson.databind.type.PlaceholderForType<$1,$1><[map type; class com.fasterxml.jackson.databind.type.PlaceholderForType, $1 -> $1]>]");
        setField(term301521, term301521.getClass(), "_valueClass", term301524);
        setField(term301521, term301521.getClass(), "_defaultCreator", null);
        setField(term301521, term301521.getClass(), "_withArgsCreator", null);
        setField(term301521, term301521.getClass(), "_constructorArguments", null);
        setField(term301521, term301521.getClass(), "_delegateType", null);
        setField(term301521, term301521.getClass(), "_delegateCreator", null);
        setField(term301521, term301521.getClass(), "_delegateArguments", null);
        setField(term301521, term301521.getClass(), "_arrayDelegateType", null);
        setField(term301521, term301521.getClass(), "_arrayDelegateCreator", null);
        setField(term301521, term301521.getClass(), "_arrayDelegateArguments", null);
        setField(term301521, term301521.getClass(), "_fromStringCreator", null);
        setField(term301521, term301521.getClass(), "_fromIntCreator", null);
        setField(term301521, term301521.getClass(), "_fromLongCreator", null);
        setField(term301521, term301521.getClass(), "_fromDoubleCreator", null);
        setField(term301521, term301521.getClass(), "_fromBooleanCreator", null);
        setField(term301521, term301521.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term301552 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        term301548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term301549 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term301550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term301551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term301550, term301550.getClass(), "_ordinal", 0);
        setField(term301550, term301550.getClass(), "_actualType", null);
        setField(term301550, term301550.getClass(), "_superClass", null);
        setField(term301550, term301550.getClass(), "_superInterfaces", null);
        setField(term301550, term301550.getClass(), "_bindings", null);
        setField(term301550, term301550.getClass(), "_canonicalName", null);
        setField(term301550, term301550.getClass(), "_class", null);
        setIntField(term301550, term301550.getClass(), "_hash", 0);
        setField(term301550, term301550.getClass(), "_valueHandler", null);
        setField(term301550, term301550.getClass(), "_typeHandler", null);
        setBooleanField(term301550, term301550.getClass(), "_asStatic", false);
        setField(term301549, term301549.getClass(), "_keyType", term301550);
        setIntField(term301551, term301551.getClass(), "_ordinal", 0);
        setField(term301551, term301551.getClass(), "_actualType", null);
        setField(term301551, term301551.getClass(), "_superClass", null);
        setField(term301551, term301551.getClass(), "_superInterfaces", null);
        setField(term301551, term301551.getClass(), "_bindings", null);
        setField(term301551, term301551.getClass(), "_canonicalName", null);
        setField(term301551, term301551.getClass(), "_class", null);
        setIntField(term301551, term301551.getClass(), "_hash", 0);
        setField(term301551, term301551.getClass(), "_valueHandler", null);
        setField(term301551, term301551.getClass(), "_typeHandler", null);
        setBooleanField(term301551, term301551.getClass(), "_asStatic", false);
        setField(term301549, term301549.getClass(), "_valueType", term301551);
        setField(term301549, term301549.getClass(), "_superClass", null);
        setField(term301549, term301549.getClass(), "_superInterfaces", null);
        setField(term301549, term301549.getClass(), "_bindings", null);
        setField(term301549, term301549.getClass(), "_canonicalName", null);
        setField(term301549, term301549.getClass(), "_class", term301552);
        setIntField(term301549, term301549.getClass(), "_hash", 0);
        setField(term301549, term301549.getClass(), "_valueHandler", null);
        setField(term301549, term301549.getClass(), "_typeHandler", null);
        setBooleanField(term301549, term301549.getClass(), "_asStatic", false);
        setField(term301548, term301548.getClass(), "_referencedType", term301549);
        setField(term301548, term301548.getClass(), "_anchorType", null);
        setField(term301548, term301548.getClass(), "_superClass", null);
        setField(term301548, term301548.getClass(), "_superInterfaces", null);
        setField(term301548, term301548.getClass(), "_bindings", null);
        setField(term301548, term301548.getClass(), "_canonicalName", null);
        setField(term301548, term301548.getClass(), "_class", term301552);
        setIntField(term301548, term301548.getClass(), "_hash", 0);
        setField(term301548, term301548.getClass(), "_valueHandler", null);
        setField(term301548, term301548.getClass(), "_typeHandler", null);
        setBooleanField(term301548, term301548.getClass(), "_asStatic", false);
        term301576 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term301577 = (byte[]) newByteArray(16);
        setByteElement(term301577, 0, (byte) 36);
        setByteElement(term301577, 1, (byte) 49);
        setField(term301576, term301576.getClass(), "value", term301577);
        setByteField(term301576, term301576.getClass(), "coder", (byte) 0);
        setIntField(term301576, term301576.getClass(), "count", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term299343;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term301521));
        assertTrue(recursiveEquals(term299343, term301576));
    }

};


