package com.google.javascript.jscomp;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeValidator_getJSType_36397408284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8474;
     Object term8530;

    public TypeValidator_getJSType_36397408284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8477 = new HashMap();
        HashMap term8486 = new HashMap();
        Set<Object> term19940 =  ((Map) term8486).keySet();
        HashSet term8485 = new HashSet((Collection<? extends Object>) term19940);
        HashMap term8493 = new HashMap();
        Set<Object> term19941 =  ((Map) term8493).keySet();
        HashSet term8492 = new HashSet((Collection<? extends Object>) term19941);
        HashMap term8500 = new HashMap();
        Set<Object> term19942 =  ((Map) term8500).keySet();
        HashSet term8499 = new HashSet((Collection<? extends Object>) term19942);
        HashMap term8506 = new HashMap();
        HashMap term8514 = new HashMap();
        HashMap term8519 = new HashMap();
        term8474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8476 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term8474, term8474.getClass(), "compiler", null);
        setField(term8475, term8475.getClass(), "reporter", null);
        setField(term8475, term8475.getClass(), "nativeTypes", term8476);
        setField(term8475, term8475.getClass(), "namesToTypes", term8477);
        setField(term8475, term8475.getClass(), "namespaces", term8485);
        setField(term8475, term8475.getClass(), "nonNullableTypeNames", term8492);
        setField(term8475, term8475.getClass(), "forwardDeclaredTypes", term8499);
        setField(term8475, term8475.getClass(), "typesIndexedByProperty", term8506);
        setField(term8475, term8475.getClass(), "eachRefTypeIndexedByProperty", term8514);
        setField(term8475, term8475.getClass(), "greatestSubtypeByProperty", term8519);
        setField(term8475, term8475.getClass(), "interfaceToImplementors", null);
        setField(term8475, term8475.getClass(), "unresolvedNamedTypes", null);
        setField(term8475, term8475.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8475, term8475.getClass(), "lastGeneration", false);
        setField(term8475, term8475.getClass(), "templateTypes", null);
        setBooleanField(term8475, term8475.getClass(), "tolerateUndefinedValues", false);
        setField(term8475, term8475.getClass(), "resolveMode", null);
        setField(term8474, term8474.getClass(), "typeRegistry", term8475);
        setField(term8474, term8474.getClass(), "allValueTypes", null);
        setBooleanField(term8474, term8474.getClass(), "shouldReport", false);
        setField(term8474, term8474.getClass(), "nullOrUndefined", null);
        setField(term8474, term8474.getClass(), "mismatches", null);
        term8530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8530, term8530.getClass(), "type", -255317272);
        setIntField(term8532, term8532.getClass(), "type", -706253892);
        setIntField(term8534, term8534.getClass(), "type", -1341439819);
        setIntField(term8536, term8536.getClass(), "type", -728760750);
        setIntField(term8538, term8538.getClass(), "type", -1617383807);
        setField(term8538, term8538.getClass(), "next", null);
        setField(term8538, term8538.getClass(), "first", null);
        setField(term8538, term8538.getClass(), "last", null);
        setField(term8538, term8538.getClass(), "propListHead", null);
        setIntField(term8538, term8538.getClass(), "sourcePosition", 0);
        setField(term8538, term8538.getClass(), "jsType", null);
        setField(term8538, term8538.getClass(), "parent", null);
        setField(term8536, term8536.getClass(), "next", term8538);
        setIntField(term8541, term8541.getClass(), "type", -1244386281);
        setField(term8541, term8541.getClass(), "next", null);
        setField(term8541, term8541.getClass(), "first", null);
        setField(term8541, term8541.getClass(), "last", term8538);
        setField(term8541, term8541.getClass(), "propListHead", null);
        setIntField(term8541, term8541.getClass(), "sourcePosition", 0);
        setField(term8541, term8541.getClass(), "jsType", null);
        setField(term8541, term8541.getClass(), "parent", null);
        setField(term8536, term8536.getClass(), "first", term8541);
        setField(term8536, term8536.getClass(), "last", term8534);
        setField(term8536, term8536.getClass(), "propListHead", null);
        setIntField(term8536, term8536.getClass(), "sourcePosition", 0);
        setField(term8536, term8536.getClass(), "jsType", null);
        setField(term8536, term8536.getClass(), "parent", null);
        setField(term8534, term8534.getClass(), "next", term8536);
        setField(term8534, term8534.getClass(), "first", term8538);
        setIntField(term8545, term8545.getClass(), "type", -865722613);
        setIntField(term8547, term8547.getClass(), "type", -1551355284);
        setField(term8547, term8547.getClass(), "next", null);
        setField(term8547, term8547.getClass(), "first", term8541);
        setField(term8547, term8547.getClass(), "last", term8536);
        setField(term8547, term8547.getClass(), "propListHead", null);
        setIntField(term8547, term8547.getClass(), "sourcePosition", 0);
        setField(term8547, term8547.getClass(), "jsType", null);
        setField(term8547, term8547.getClass(), "parent", null);
        setField(term8545, term8545.getClass(), "next", term8547);
        setField(term8545, term8545.getClass(), "first", term8532);
        setField(term8545, term8545.getClass(), "last", term8532);
        setField(term8545, term8545.getClass(), "propListHead", null);
        setIntField(term8545, term8545.getClass(), "sourcePosition", 0);
        setField(term8545, term8545.getClass(), "jsType", null);
        setField(term8545, term8545.getClass(), "parent", null);
        setField(term8534, term8534.getClass(), "last", term8545);
        setField(term8534, term8534.getClass(), "propListHead", null);
        setIntField(term8534, term8534.getClass(), "sourcePosition", 0);
        setField(term8534, term8534.getClass(), "jsType", null);
        setField(term8534, term8534.getClass(), "parent", null);
        setField(term8532, term8532.getClass(), "next", term8534);
        setIntField(term8552, term8552.getClass(), "type", -1381970335);
        setField(term8552, term8552.getClass(), "next", term8545);
        setField(term8552, term8552.getClass(), "first", term8547);
        setField(term8552, term8552.getClass(), "last", term8530);
        setField(term8552, term8552.getClass(), "propListHead", null);
        setIntField(term8552, term8552.getClass(), "sourcePosition", 0);
        setField(term8552, term8552.getClass(), "jsType", null);
        setField(term8552, term8552.getClass(), "parent", null);
        setField(term8532, term8532.getClass(), "first", term8552);
        setField(term8532, term8532.getClass(), "last", term8552);
        setField(term8532, term8532.getClass(), "propListHead", null);
        setIntField(term8532, term8532.getClass(), "sourcePosition", 0);
        setField(term8532, term8532.getClass(), "jsType", null);
        setField(term8532, term8532.getClass(), "parent", null);
        setField(term8530, term8530.getClass(), "next", term8532);
        setField(term8530, term8530.getClass(), "first", term8536);
        setField(term8530, term8530.getClass(), "last", term8538);
        setField(term8530, term8530.getClass(), "propListHead", null);
        setIntField(term8530, term8530.getClass(), "sourcePosition", 0);
        setField(term8530, term8530.getClass(), "jsType", null);
        setField(term8530, term8530.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8530;
        try {
            callMethod(klass, "getJSType", argTypes, term8474, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


