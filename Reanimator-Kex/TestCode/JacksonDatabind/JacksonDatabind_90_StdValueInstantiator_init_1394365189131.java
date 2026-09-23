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

public class StdValueInstantiator_init_1394365189131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62611;
     Object term64085;
     Object term64112;
     Object term64138;

    public StdValueInstantiator_init_1394365189131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62507 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term62647 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        term62611 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term62799 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term62611, term62611.getClass(), "_class", term62647);
        setField(term62611, term62611.getClass(), "_referencedType", term62799);
        Class<? extends Object> term64088 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        term64085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term64085, term64085.getClass(), "_valueTypeDesc", "[reference type, class com.fasterxml.jackson.databind.type.ReferenceType<$1<$1>]");
        setField(term64085, term64085.getClass(), "_valueClass", term64088);
        setField(term64085, term64085.getClass(), "_defaultCreator", null);
        setField(term64085, term64085.getClass(), "_withArgsCreator", null);
        setField(term64085, term64085.getClass(), "_constructorArguments", null);
        setField(term64085, term64085.getClass(), "_delegateType", null);
        setField(term64085, term64085.getClass(), "_delegateCreator", null);
        setField(term64085, term64085.getClass(), "_delegateArguments", null);
        setField(term64085, term64085.getClass(), "_arrayDelegateType", null);
        setField(term64085, term64085.getClass(), "_arrayDelegateCreator", null);
        setField(term64085, term64085.getClass(), "_arrayDelegateArguments", null);
        setField(term64085, term64085.getClass(), "_fromStringCreator", null);
        setField(term64085, term64085.getClass(), "_fromIntCreator", null);
        setField(term64085, term64085.getClass(), "_fromLongCreator", null);
        setField(term64085, term64085.getClass(), "_fromDoubleCreator", null);
        setField(term64085, term64085.getClass(), "_fromBooleanCreator", null);
        setField(term64085, term64085.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term64114 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        term64112 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term64113 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term64113, term64113.getClass(), "_ordinal", 0);
        setField(term64113, term64113.getClass(), "_actualType", null);
        setField(term64113, term64113.getClass(), "_superClass", null);
        setField(term64113, term64113.getClass(), "_superInterfaces", null);
        setField(term64113, term64113.getClass(), "_bindings", null);
        setField(term64113, term64113.getClass(), "_canonicalName", null);
        setField(term64113, term64113.getClass(), "_class", null);
        setIntField(term64113, term64113.getClass(), "_hash", 0);
        setField(term64113, term64113.getClass(), "_valueHandler", null);
        setField(term64113, term64113.getClass(), "_typeHandler", null);
        setBooleanField(term64113, term64113.getClass(), "_asStatic", false);
        setField(term64112, term64112.getClass(), "_referencedType", term64113);
        setField(term64112, term64112.getClass(), "_anchorType", null);
        setField(term64112, term64112.getClass(), "_superClass", null);
        setField(term64112, term64112.getClass(), "_superInterfaces", null);
        setField(term64112, term64112.getClass(), "_bindings", null);
        setField(term64112, term64112.getClass(), "_canonicalName", null);
        setField(term64112, term64112.getClass(), "_class", term64114);
        setIntField(term64112, term64112.getClass(), "_hash", 0);
        setField(term64112, term64112.getClass(), "_valueHandler", null);
        setField(term64112, term64112.getClass(), "_typeHandler", null);
        setBooleanField(term64112, term64112.getClass(), "_asStatic", false);
        term64138 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term64139 = (byte[]) newByteArray(16);
        setByteElement(term64139, 0, (byte) 36);
        setByteElement(term64139, 1, (byte) 49);
        setField(term64138, term64138.getClass(), "value", term64139);
        setByteField(term64138, term64138.getClass(), "coder", (byte) 0);
        setIntField(term64138, term64138.getClass(), "count", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term62611;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term64085));
        assertTrue(recursiveEquals(term62611, term64138));
    }

};


