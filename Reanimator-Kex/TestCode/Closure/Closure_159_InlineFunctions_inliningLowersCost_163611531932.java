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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class InlineFunctions_inliningLowersCost_163611531932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655;
     Object term686;

    public InlineFunctions_inliningLowersCost_163611531932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term656 = new HashMap();
        HashMap term671 = new HashMap();
        term655 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term655, term655.getClass(), "fns", term656);
        setField(term655, term655.getClass(), "anonFns", term671);
        setField(term655, term655.getClass(), "compiler", null);
        setField(term655, term655.getClass(), "injector", null);
        setBooleanField(term655, term655.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term655, term655.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term655, term655.getClass(), "inlineLocalFunctions", false);
        setField(term655, term655.getClass(), "specializationState", null);
        HashMap term719 = new HashMap();
        HashMap term736 = new HashMap();
        Set<Object> term3801 =  ((Map) term736).keySet();
        HashSet term735 = new HashSet((Collection<? extends Object>) term3801);
        term686 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        Object term687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term733 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term686, term686.getClass(), "fn", null);
        setIntField(term687, term687.getClass(), "type", -1885090354);
        setIntField(term689, term689.getClass(), "type", -1239406390);
        setIntField(term691, term691.getClass(), "type", 0);
        setField(term691, term691.getClass(), "next", null);
        setField(term691, term691.getClass(), "first", null);
        setField(term691, term691.getClass(), "last", null);
        setField(term691, term691.getClass(), "propListHead", null);
        setIntField(term691, term691.getClass(), "sourcePosition", 0);
        setField(term691, term691.getClass(), "jsType", null);
        setField(term691, term691.getClass(), "parent", null);
        setField(term689, term689.getClass(), "next", term691);
        setIntField(term694, term694.getClass(), "type", 0);
        setField(term694, term694.getClass(), "next", null);
        setField(term694, term694.getClass(), "first", null);
        setField(term694, term694.getClass(), "last", null);
        setField(term694, term694.getClass(), "propListHead", null);
        setIntField(term694, term694.getClass(), "sourcePosition", 0);
        setField(term694, term694.getClass(), "jsType", null);
        setField(term694, term694.getClass(), "parent", null);
        setField(term689, term689.getClass(), "first", term694);
        setIntField(term697, term697.getClass(), "type", 0);
        setField(term697, term697.getClass(), "next", null);
        setField(term697, term697.getClass(), "first", null);
        setField(term697, term697.getClass(), "last", null);
        setField(term697, term697.getClass(), "propListHead", null);
        setIntField(term697, term697.getClass(), "sourcePosition", 0);
        setField(term697, term697.getClass(), "jsType", null);
        setField(term697, term697.getClass(), "parent", null);
        setField(term689, term689.getClass(), "last", term697);
        setField(term700, term700.getClass(), "next", null);
        setIntField(term700, term700.getClass(), "type", 0);
        setIntField(term700, term700.getClass(), "intValue", 0);
        setField(term700, term700.getClass(), "objectValue", null);
        setField(term689, term689.getClass(), "propListHead", term700);
        setIntField(term689, term689.getClass(), "sourcePosition", 1557431527);
        setField(term689, term689.getClass(), "jsType", null);
        setField(term689, term689.getClass(), "parent", null);
        setField(term687, term687.getClass(), "next", term689);
        setIntField(term704, term704.getClass(), "type", 0);
        setField(term704, term704.getClass(), "next", null);
        setField(term704, term704.getClass(), "first", null);
        setField(term704, term704.getClass(), "last", null);
        setField(term704, term704.getClass(), "propListHead", null);
        setIntField(term704, term704.getClass(), "sourcePosition", 0);
        setField(term704, term704.getClass(), "jsType", null);
        setField(term704, term704.getClass(), "parent", null);
        setField(term687, term687.getClass(), "first", term704);
        setIntField(term707, term707.getClass(), "type", 0);
        setField(term707, term707.getClass(), "next", null);
        setField(term707, term707.getClass(), "first", null);
        setField(term707, term707.getClass(), "last", null);
        setField(term707, term707.getClass(), "propListHead", null);
        setIntField(term707, term707.getClass(), "sourcePosition", 0);
        setField(term707, term707.getClass(), "jsType", null);
        setField(term707, term707.getClass(), "parent", null);
        setField(term687, term687.getClass(), "last", term707);
        setField(term710, term710.getClass(), "next", null);
        setIntField(term710, term710.getClass(), "type", 0);
        setIntField(term710, term710.getClass(), "intValue", 0);
        setField(term710, term710.getClass(), "objectValue", null);
        setField(term687, term687.getClass(), "propListHead", term710);
        setIntField(term687, term687.getClass(), "sourcePosition", -1504890659);
        setField(term687, term687.getClass(), "jsType", null);
        setField(term687, term687.getClass(), "parent", null);
        setField(term686, term686.getClass(), "safeFnNode", term687);
        setBooleanField(term686, term686.getClass(), "inline", true);
        setBooleanField(term686, term686.getClass(), "remove", true);
        setBooleanField(term686, term686.getClass(), "inlineDirectly", true);
        setBooleanField(term686, term686.getClass(), "referencesThis", true);
        setBooleanField(term686, term686.getClass(), "hasInnerFunctions", false);
        setField(term686, term686.getClass(), "references", term719);
        setField(term733, term733.getClass(), "name", null);
        setField(term733, term733.getClass(), "inputs", null);
        setField(term733, term733.getClass(), "deps", null);
        setIntField(term733, term733.getClass(), "depth", 0);
        setField(term686, term686.getClass(), "module", term733);
        setField(term686, term686.getClass(), "namesToAlias", term735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Object[] args = new Object[1];
        args[0] = term686;
        try {
            callMethod(klass, "inliningLowersCost", argTypes, term655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


