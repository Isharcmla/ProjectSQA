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
import java.lang.Object;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class InlineFunctions_findCalledFunctions_1759326424111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18610;
     Object term18680;
     Object term18798;
     Object term69640;
     Object term69641;
     Object term69643;

    public InlineFunctions_findCalledFunctions_1759326424111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18610 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term18680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18680, term18680.getClass(), "type", 37);
        setField(term18680, term18680.getClass(), "first", term18750);
        term18798 = new HashSet();
        term69640 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term69640, term69640.getClass(), "fns", null);
        setField(term69640, term69640.getClass(), "anonFns", null);
        setField(term69640, term69640.getClass(), "compiler", null);
        setField(term69640, term69640.getClass(), "injector", null);
        setBooleanField(term69640, term69640.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term69640, term69640.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term69640, term69640.getClass(), "inlineLocalFunctions", false);
        setField(term69640, term69640.getClass(), "specializationState", null);
        term69641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69641, term69641.getClass(), "type", 37);
        setField(term69641, term69641.getClass(), "next", null);
        setIntField(term69642, term69642.getClass(), "type", 0);
        setField(term69642, term69642.getClass(), "next", null);
        setField(term69642, term69642.getClass(), "first", null);
        setField(term69642, term69642.getClass(), "last", null);
        setField(term69642, term69642.getClass(), "propListHead", null);
        setIntField(term69642, term69642.getClass(), "sourcePosition", 0);
        setField(term69642, term69642.getClass(), "jsType", null);
        setField(term69642, term69642.getClass(), "parent", null);
        setField(term69641, term69641.getClass(), "first", term69642);
        setField(term69641, term69641.getClass(), "last", null);
        setField(term69641, term69641.getClass(), "propListHead", null);
        setIntField(term69641, term69641.getClass(), "sourcePosition", 0);
        setField(term69641, term69641.getClass(), "jsType", null);
        setField(term69641, term69641.getClass(), "parent", null);
        HashMap term69644 = new HashMap();
        Set<Object> term69645 =  ((Map) term69644).keySet();
        term69643 = new HashSet((Collection<? extends Object>) term69645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term18680;
        args[1] = term18798;
        callMethod(klass, "findCalledFunctions", argTypes, term18610, args);
        assertTrue(recursiveEquals(term18610, term69640));
        assertTrue(recursiveEquals(term18680, term69641));
        assertTrue(recursiveEquals(term18798, term69643));
    }

};


