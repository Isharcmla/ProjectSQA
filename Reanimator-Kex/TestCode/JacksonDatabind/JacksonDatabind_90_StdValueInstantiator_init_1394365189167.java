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

public class StdValueInstantiator_init_1394365189167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113570;
     Object term115052;
     Object term115074;

    public StdValueInstantiator_init_1394365189167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113466 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term113606 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term113570 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term113740 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term113570, term113570.getClass(), "_class", term113606);
        setField(term113740, term113740.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.type.ReferenceType");
        setField(term113570, term113570.getClass(), "_referencedType", term113740);
        Class<? extends Object> term115055 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term115052 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term115052, term115052.getClass(), "_valueTypeDesc", "[reference type, class org.vorpal.research.kex.intrinsics.UnknownIntrinsics<com.fasterxml.jackson.databind.type.ReferenceType<[array type, component type: null]>]");
        setField(term115052, term115052.getClass(), "_valueClass", term115055);
        setField(term115052, term115052.getClass(), "_defaultCreator", null);
        setField(term115052, term115052.getClass(), "_withArgsCreator", null);
        setField(term115052, term115052.getClass(), "_constructorArguments", null);
        setField(term115052, term115052.getClass(), "_delegateType", null);
        setField(term115052, term115052.getClass(), "_delegateCreator", null);
        setField(term115052, term115052.getClass(), "_delegateArguments", null);
        setField(term115052, term115052.getClass(), "_arrayDelegateType", null);
        setField(term115052, term115052.getClass(), "_arrayDelegateCreator", null);
        setField(term115052, term115052.getClass(), "_arrayDelegateArguments", null);
        setField(term115052, term115052.getClass(), "_fromStringCreator", null);
        setField(term115052, term115052.getClass(), "_fromIntCreator", null);
        setField(term115052, term115052.getClass(), "_fromLongCreator", null);
        setField(term115052, term115052.getClass(), "_fromDoubleCreator", null);
        setField(term115052, term115052.getClass(), "_fromBooleanCreator", null);
        setField(term115052, term115052.getClass(), "_incompleteParameter", null);
        Class<? extends Object> term115078 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term115074 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term115075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term115075, term115075.getClass(), "_componentType", null);
        setField(term115075, term115075.getClass(), "_emptyArray", null);
        setField(term115075, term115075.getClass(), "_superClass", null);
        setField(term115075, term115075.getClass(), "_superInterfaces", null);
        setField(term115075, term115075.getClass(), "_bindings", null);
        setField(term115075, term115075.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.type.ReferenceType");
        setField(term115075, term115075.getClass(), "_class", null);
        setIntField(term115075, term115075.getClass(), "_hash", 0);
        setField(term115075, term115075.getClass(), "_valueHandler", null);
        setField(term115075, term115075.getClass(), "_typeHandler", null);
        setBooleanField(term115075, term115075.getClass(), "_asStatic", false);
        setField(term115074, term115074.getClass(), "_referencedType", term115075);
        setField(term115074, term115074.getClass(), "_anchorType", null);
        setField(term115074, term115074.getClass(), "_superClass", null);
        setField(term115074, term115074.getClass(), "_superInterfaces", null);
        setField(term115074, term115074.getClass(), "_bindings", null);
        setField(term115074, term115074.getClass(), "_canonicalName", null);
        setField(term115074, term115074.getClass(), "_class", term115078);
        setIntField(term115074, term115074.getClass(), "_hash", 0);
        setField(term115074, term115074.getClass(), "_valueHandler", null);
        setField(term115074, term115074.getClass(), "_typeHandler", null);
        setBooleanField(term115074, term115074.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term113570;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term115052));
        assertTrue(recursiveEquals(term113570, null));
    }

};


