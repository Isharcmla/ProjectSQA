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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createFunctionType_1673441282147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11438;
     Object term11498;

    public JSTypeRegistry_createFunctionType_1673441282147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11440 = new HashMap();
        HashMap term11450 = new HashMap();
        Set<Object> term504736 =  ((Map) term11450).keySet();
        HashSet term11449 = new HashSet((Collection<? extends Object>) term504736);
        HashMap term11456 = new HashMap();
        Set<Object> term504737 =  ((Map) term11456).keySet();
        HashSet term11455 = new HashSet((Collection<? extends Object>) term504737);
        HashMap term11462 = new HashMap();
        Set<Object> term504738 =  ((Map) term11462).keySet();
        HashSet term11461 = new HashSet((Collection<? extends Object>) term504738);
        HashMap term11467 = new HashMap();
        HashMap term11482 = new HashMap();
        HashMap term11487 = new HashMap();
        term11438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11439 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term11438, term11438.getClass(), "reporter", null);
        setField(term11438, term11438.getClass(), "nativeTypes", term11439);
        setField(term11438, term11438.getClass(), "namesToTypes", term11440);
        setField(term11438, term11438.getClass(), "namespaces", term11449);
        setField(term11438, term11438.getClass(), "nonNullableTypeNames", term11455);
        setField(term11438, term11438.getClass(), "forwardDeclaredTypes", term11461);
        setField(term11438, term11438.getClass(), "typesIndexedByProperty", term11467);
        setField(term11438, term11438.getClass(), "eachRefTypeIndexedByProperty", term11482);
        setField(term11438, term11438.getClass(), "greatestSubtypeByProperty", term11487);
        setField(term11438, term11438.getClass(), "interfaceToImplementors", null);
        setField(term11438, term11438.getClass(), "unresolvedNamedTypes", null);
        setField(term11438, term11438.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11438, term11438.getClass(), "lastGeneration", false);
        setField(term11438, term11438.getClass(), "templateTypeName", null);
        setField(term11438, term11438.getClass(), "templateType", null);
        setBooleanField(term11438, term11438.getClass(), "tolerateUndefinedValues", false);
        setField(term11438, term11438.getClass(), "resolveMode", null);
        term11498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11498, term11498.getClass(), "type", 510162332);
        setIntField(term11500, term11500.getClass(), "type", 888506903);
        setIntField(term11502, term11502.getClass(), "type", 200252898);
        setIntField(term11504, term11504.getClass(), "type", -1831826725);
        setIntField(term11506, term11506.getClass(), "type", 752152965);
        setField(term11506, term11506.getClass(), "next", null);
        setField(term11506, term11506.getClass(), "first", null);
        setField(term11506, term11506.getClass(), "last", null);
        setField(term11506, term11506.getClass(), "propListHead", null);
        setIntField(term11506, term11506.getClass(), "sourcePosition", 0);
        setField(term11506, term11506.getClass(), "jsType", null);
        setField(term11506, term11506.getClass(), "parent", null);
        setField(term11504, term11504.getClass(), "next", term11506);
        setIntField(term11509, term11509.getClass(), "type", -1577069773);
        setField(term11509, term11509.getClass(), "next", null);
        setField(term11509, term11509.getClass(), "first", null);
        setField(term11509, term11509.getClass(), "last", term11506);
        setField(term11509, term11509.getClass(), "propListHead", null);
        setIntField(term11509, term11509.getClass(), "sourcePosition", 0);
        setField(term11509, term11509.getClass(), "jsType", null);
        setField(term11509, term11509.getClass(), "parent", null);
        setField(term11504, term11504.getClass(), "first", term11509);
        setField(term11504, term11504.getClass(), "last", term11502);
        setField(term11504, term11504.getClass(), "propListHead", null);
        setIntField(term11504, term11504.getClass(), "sourcePosition", 0);
        setField(term11504, term11504.getClass(), "jsType", null);
        setField(term11504, term11504.getClass(), "parent", null);
        setField(term11502, term11502.getClass(), "next", term11504);
        setField(term11502, term11502.getClass(), "first", term11506);
        setIntField(term11513, term11513.getClass(), "type", 489201218);
        setIntField(term11515, term11515.getClass(), "type", 464181937);
        setField(term11515, term11515.getClass(), "next", null);
        setField(term11515, term11515.getClass(), "first", term11509);
        setField(term11515, term11515.getClass(), "last", term11504);
        setField(term11515, term11515.getClass(), "propListHead", null);
        setIntField(term11515, term11515.getClass(), "sourcePosition", 0);
        setField(term11515, term11515.getClass(), "jsType", null);
        setField(term11515, term11515.getClass(), "parent", null);
        setField(term11513, term11513.getClass(), "next", term11515);
        setField(term11513, term11513.getClass(), "first", term11500);
        setField(term11513, term11513.getClass(), "last", term11500);
        setField(term11513, term11513.getClass(), "propListHead", null);
        setIntField(term11513, term11513.getClass(), "sourcePosition", 0);
        setField(term11513, term11513.getClass(), "jsType", null);
        setField(term11513, term11513.getClass(), "parent", null);
        setField(term11502, term11502.getClass(), "last", term11513);
        setField(term11502, term11502.getClass(), "propListHead", null);
        setIntField(term11502, term11502.getClass(), "sourcePosition", 0);
        setField(term11502, term11502.getClass(), "jsType", null);
        setField(term11502, term11502.getClass(), "parent", null);
        setField(term11500, term11500.getClass(), "next", term11502);
        setIntField(term11520, term11520.getClass(), "type", -1455526612);
        setField(term11520, term11520.getClass(), "next", term11513);
        setField(term11520, term11520.getClass(), "first", term11515);
        setField(term11520, term11520.getClass(), "last", term11498);
        setField(term11520, term11520.getClass(), "propListHead", null);
        setIntField(term11520, term11520.getClass(), "sourcePosition", 0);
        setField(term11520, term11520.getClass(), "jsType", null);
        setField(term11520, term11520.getClass(), "parent", null);
        setField(term11500, term11500.getClass(), "first", term11520);
        setField(term11500, term11500.getClass(), "last", term11520);
        setField(term11500, term11500.getClass(), "propListHead", null);
        setIntField(term11500, term11500.getClass(), "sourcePosition", 0);
        setField(term11500, term11500.getClass(), "jsType", null);
        setField(term11500, term11500.getClass(), "parent", null);
        setField(term11498, term11498.getClass(), "next", term11500);
        setField(term11498, term11498.getClass(), "first", term11504);
        setField(term11498, term11498.getClass(), "last", term11506);
        setField(term11498, term11498.getClass(), "propListHead", null);
        setIntField(term11498, term11498.getClass(), "sourcePosition", 0);
        setField(term11498, term11498.getClass(), "jsType", null);
        setField(term11498, term11498.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11498;
        try {
            callMethod(klass, "createFunctionType", argTypes, term11438, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


