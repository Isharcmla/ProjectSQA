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

public class Scope_getVars_97440175238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859;
     Object term3397;
     Object term3379;

    public Scope_getVars_97440175238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term860 = new HashMap();
        term859 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term873 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term859, term859.getClass(), "vars", term860);
        setField(term873, term873.getClass(), "vars", null);
        setField(term873, term873.getClass(), "parent", null);
        setIntField(term873, term873.getClass(), "depth", 0);
        setField(term873, term873.getClass(), "rootNode", null);
        setField(term873, term873.getClass(), "thisType", null);
        setBooleanField(term873, term873.getClass(), "isBottom", false);
        setField(term859, term859.getClass(), "parent", term873);
        setIntField(term859, term859.getClass(), "depth", -420030135);
        setIntField(term877, term877.getClass(), "type", 0);
        setField(term877, term877.getClass(), "next", null);
        setField(term877, term877.getClass(), "first", null);
        setField(term877, term877.getClass(), "last", null);
        setField(term877, term877.getClass(), "propListHead", null);
        setIntField(term877, term877.getClass(), "sourcePosition", 0);
        setField(term877, term877.getClass(), "jsType", null);
        setField(term877, term877.getClass(), "parent", null);
        setField(term859, term859.getClass(), "rootNode", term877);
        setField(term859, term859.getClass(), "thisType", null);
        setBooleanField(term859, term859.getClass(), "isBottom", false);
        HashMap term3398 = new HashMap();
        term3397 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3400 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3397, term3397.getClass(), "vars", term3398);
        setField(term3400, term3400.getClass(), "vars", null);
        setField(term3400, term3400.getClass(), "parent", null);
        setIntField(term3400, term3400.getClass(), "depth", 0);
        setField(term3400, term3400.getClass(), "rootNode", null);
        setField(term3400, term3400.getClass(), "thisType", null);
        setBooleanField(term3400, term3400.getClass(), "isBottom", false);
        setField(term3397, term3397.getClass(), "parent", term3400);
        setIntField(term3397, term3397.getClass(), "depth", -420030135);
        setIntField(term3401, term3401.getClass(), "type", 0);
        setField(term3401, term3401.getClass(), "next", null);
        setField(term3401, term3401.getClass(), "first", null);
        setField(term3401, term3401.getClass(), "last", null);
        setField(term3401, term3401.getClass(), "propListHead", null);
        setIntField(term3401, term3401.getClass(), "sourcePosition", 0);
        setField(term3401, term3401.getClass(), "jsType", null);
        setField(term3401, term3401.getClass(), "parent", null);
        setField(term3397, term3397.getClass(), "rootNode", term3401);
        setField(term3397, term3397.getClass(), "thisType", null);
        setBooleanField(term3397, term3397.getClass(), "isBottom", false);
        HashMap term3380 = new HashMap();
        term3379 = newInstance(Class.forName("java.util.HashMap$ValueIterator"));
        setField(term3379, term3379.getClass(), "this$0", term3380);
        setField(term3379, term3379.getClass(), "next", null);
        setField(term3379, term3379.getClass(), "current", null);
        setIntField(term3379, term3379.getClass(), "expectedModCount", 0);
        setIntField(term3379, term3379.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVars", argTypes, term859, args);
        assertTrue(recursiveEquals(term859, term3397));
        assertTrue(recursiveEquals(retValue, term3379));
    }

};


