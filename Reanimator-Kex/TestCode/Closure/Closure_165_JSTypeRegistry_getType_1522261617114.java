package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_getType_1522261617114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5077;
     Object term486482;

    public JSTypeRegistry_getType_1522261617114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5079 = new HashMap();
        HashMap term5089 = new HashMap();
        Set<Object> term486496 =  ((Map) term5089).keySet();
        HashSet term5088 = new HashSet((Collection<? extends Object>) term486496);
        HashMap term5112 = new HashMap();
        Set<Object> term486497 =  ((Map) term5112).keySet();
        HashSet term5111 = new HashSet((Collection<? extends Object>) term486497);
        HashMap term5125 = new HashMap();
        Set<Object> term486498 =  ((Map) term5125).keySet();
        HashSet term5124 = new HashSet((Collection<? extends Object>) term486498);
        HashMap term5130 = new HashMap();
        HashMap term5145 = new HashMap();
        HashMap term5150 = new HashMap();
        term5077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5078 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term5077, term5077.getClass(), "reporter", null);
        setField(term5077, term5077.getClass(), "nativeTypes", term5078);
        setField(term5077, term5077.getClass(), "namesToTypes", term5079);
        setField(term5077, term5077.getClass(), "namespaces", term5088);
        setField(term5077, term5077.getClass(), "nonNullableTypeNames", term5111);
        setField(term5077, term5077.getClass(), "forwardDeclaredTypes", term5124);
        setField(term5077, term5077.getClass(), "typesIndexedByProperty", term5130);
        setField(term5077, term5077.getClass(), "eachRefTypeIndexedByProperty", term5145);
        setField(term5077, term5077.getClass(), "greatestSubtypeByProperty", term5150);
        setField(term5077, term5077.getClass(), "interfaceToImplementors", null);
        setField(term5077, term5077.getClass(), "unresolvedNamedTypes", null);
        setField(term5077, term5077.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5077, term5077.getClass(), "lastGeneration", false);
        setField(term5077, term5077.getClass(), "templateTypeName", null);
        setField(term5077, term5077.getClass(), "templateType", null);
        setBooleanField(term5077, term5077.getClass(), "tolerateUndefinedValues", false);
        setField(term5077, term5077.getClass(), "resolveMode", null);
        HashMap term486484 = new HashMap();
        HashMap term486486 = new HashMap();
        Set<Object> term486509 =  ((Map) term486486).keySet();
        HashSet term486485 = new HashSet((Collection<? extends Object>) term486509);
        HashMap term486488 = new HashMap();
        Set<Object> term486510 =  ((Map) term486488).keySet();
        HashSet term486487 = new HashSet((Collection<? extends Object>) term486510);
        HashMap term486490 = new HashMap();
        Set<Object> term486511 =  ((Map) term486490).keySet();
        HashSet term486489 = new HashSet((Collection<? extends Object>) term486511);
        HashMap term486491 = new HashMap();
        HashMap term486492 = new HashMap();
        HashMap term486493 = new HashMap();
        term486482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term486483 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term486482, term486482.getClass(), "reporter", null);
        setField(term486482, term486482.getClass(), "nativeTypes", term486483);
        setField(term486482, term486482.getClass(), "namesToTypes", term486484);
        setField(term486482, term486482.getClass(), "namespaces", term486485);
        setField(term486482, term486482.getClass(), "nonNullableTypeNames", term486487);
        setField(term486482, term486482.getClass(), "forwardDeclaredTypes", term486489);
        setField(term486482, term486482.getClass(), "typesIndexedByProperty", term486491);
        setField(term486482, term486482.getClass(), "eachRefTypeIndexedByProperty", term486492);
        setField(term486482, term486482.getClass(), "greatestSubtypeByProperty", term486493);
        setField(term486482, term486482.getClass(), "interfaceToImplementors", null);
        setField(term486482, term486482.getClass(), "unresolvedNamedTypes", null);
        setField(term486482, term486482.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term486482, term486482.getClass(), "lastGeneration", false);
        setField(term486482, term486482.getClass(), "templateTypeName", null);
        setField(term486482, term486482.getClass(), "templateType", null);
        setBooleanField(term486482, term486482.getClass(), "tolerateUndefinedValues", false);
        setField(term486482, term486482.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VygCEWaefB";
        Object retValue = callMethod(klass, "getType", argTypes, term5077, args);
        assertTrue(recursiveEquals(term5077, term486482));
        assertTrue(recursiveEquals(retValue, null));
    }

};


