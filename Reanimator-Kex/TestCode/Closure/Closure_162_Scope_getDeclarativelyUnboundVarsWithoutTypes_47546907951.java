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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class Scope_getDeclarativelyUnboundVarsWithoutTypes_47546907951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1088;
     Object term3990;
     Object term3972;

    public Scope_getDeclarativelyUnboundVarsWithoutTypes_47546907951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1089 = new HashMap();
        term1088 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1102 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1088, term1088.getClass(), "vars", term1089);
        setField(term1102, term1102.getClass(), "vars", null);
        setField(term1102, term1102.getClass(), "parent", null);
        setIntField(term1102, term1102.getClass(), "depth", 0);
        setField(term1102, term1102.getClass(), "rootNode", null);
        setField(term1102, term1102.getClass(), "thisType", null);
        setBooleanField(term1102, term1102.getClass(), "isBottom", false);
        setField(term1102, term1102.getClass(), "arguments", null);
        setField(term1088, term1088.getClass(), "parent", term1102);
        setIntField(term1088, term1088.getClass(), "depth", -1015274146);
        setIntField(term1106, term1106.getClass(), "type", 0);
        setField(term1106, term1106.getClass(), "next", null);
        setField(term1106, term1106.getClass(), "first", null);
        setField(term1106, term1106.getClass(), "last", null);
        setField(term1106, term1106.getClass(), "propListHead", null);
        setIntField(term1106, term1106.getClass(), "sourcePosition", 0);
        setField(term1106, term1106.getClass(), "jsType", null);
        setField(term1106, term1106.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "rootNode", term1106);
        setField(term1088, term1088.getClass(), "thisType", null);
        setBooleanField(term1088, term1088.getClass(), "isBottom", false);
        setField(term1088, term1088.getClass(), "arguments", null);
        HashMap term3991 = new HashMap();
        term3990 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3993 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3990, term3990.getClass(), "vars", term3991);
        setField(term3993, term3993.getClass(), "vars", null);
        setField(term3993, term3993.getClass(), "parent", null);
        setIntField(term3993, term3993.getClass(), "depth", 0);
        setField(term3993, term3993.getClass(), "rootNode", null);
        setField(term3993, term3993.getClass(), "thisType", null);
        setBooleanField(term3993, term3993.getClass(), "isBottom", false);
        setField(term3993, term3993.getClass(), "arguments", null);
        setField(term3990, term3990.getClass(), "parent", term3993);
        setIntField(term3990, term3990.getClass(), "depth", -1015274146);
        setIntField(term3994, term3994.getClass(), "type", 0);
        setField(term3994, term3994.getClass(), "next", null);
        setField(term3994, term3994.getClass(), "first", null);
        setField(term3994, term3994.getClass(), "last", null);
        setField(term3994, term3994.getClass(), "propListHead", null);
        setIntField(term3994, term3994.getClass(), "sourcePosition", 0);
        setField(term3994, term3994.getClass(), "jsType", null);
        setField(term3994, term3994.getClass(), "parent", null);
        setField(term3990, term3990.getClass(), "rootNode", term3994);
        setField(term3990, term3990.getClass(), "thisType", null);
        setBooleanField(term3990, term3990.getClass(), "isBottom", false);
        setField(term3990, term3990.getClass(), "arguments", null);
        HashMap term3932 = new HashMap();
        Class<? extends Object> term4036 = Class.forName((String) "com.google.common.collect.AbstractIterator$State");
        Field term4035 = ((Class) term4036).getDeclaredField((String) "NOT_READY");
        ((Field) term4035).setAccessible(true);
        Object enum0 = ((Field) term4035).get((Object) null);
        term3972 = newInstance(Class.forName("com.google.common.collect.Iterators$7"));
        Object term3973 = newInstance(Class.forName("java.util.HashMap$ValueIterator"));
        Object term3976 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$1"));
        setField(term3973, term3973.getClass(), "this$0", term3932);
        setField(term3973, term3973.getClass(), "next", null);
        setField(term3973, term3973.getClass(), "current", null);
        setIntField(term3973, term3973.getClass(), "expectedModCount", 0);
        setIntField(term3973, term3973.getClass(), "index", 0);
        setField(term3972, term3972.getClass(), "val$unfiltered", term3973);
        setField(term3972, term3972.getClass(), "val$predicate", term3976);
        setField(term3972, term3972.getClass(), "state", enum0);
        setField(term3972, term3972.getClass(), "next", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDeclarativelyUnboundVarsWithoutTypes", argTypes, term1088, args);
        assertTrue(recursiveEquals(term1088, term3990));
        assertTrue(recursiveEquals(retValue, term3972));
    }

};


