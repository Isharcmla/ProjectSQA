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

public class Scope_getVars_97440175244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840;
     Object term3613;
     Object term3595;

    public Scope_getVars_97440175244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term841 = new HashMap();
        term840 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term854 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term840, term840.getClass(), "vars", term841);
        setField(term854, term854.getClass(), "vars", null);
        setField(term854, term854.getClass(), "parent", null);
        setIntField(term854, term854.getClass(), "depth", 0);
        setField(term854, term854.getClass(), "rootNode", null);
        setField(term854, term854.getClass(), "thisType", null);
        setBooleanField(term854, term854.getClass(), "isBottom", false);
        setField(term854, term854.getClass(), "arguments", null);
        setField(term840, term840.getClass(), "parent", term854);
        setIntField(term840, term840.getClass(), "depth", 982388293);
        setIntField(term858, term858.getClass(), "type", 0);
        setField(term858, term858.getClass(), "next", null);
        setField(term858, term858.getClass(), "first", null);
        setField(term858, term858.getClass(), "last", null);
        setField(term858, term858.getClass(), "propListHead", null);
        setIntField(term858, term858.getClass(), "sourcePosition", 0);
        setField(term858, term858.getClass(), "jsType", null);
        setField(term858, term858.getClass(), "parent", null);
        setField(term840, term840.getClass(), "rootNode", term858);
        setField(term840, term840.getClass(), "thisType", null);
        setBooleanField(term840, term840.getClass(), "isBottom", false);
        setField(term840, term840.getClass(), "arguments", null);
        HashMap term3614 = new HashMap();
        term3613 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3616 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3613, term3613.getClass(), "vars", term3614);
        setField(term3616, term3616.getClass(), "vars", null);
        setField(term3616, term3616.getClass(), "parent", null);
        setIntField(term3616, term3616.getClass(), "depth", 0);
        setField(term3616, term3616.getClass(), "rootNode", null);
        setField(term3616, term3616.getClass(), "thisType", null);
        setBooleanField(term3616, term3616.getClass(), "isBottom", false);
        setField(term3616, term3616.getClass(), "arguments", null);
        setField(term3613, term3613.getClass(), "parent", term3616);
        setIntField(term3613, term3613.getClass(), "depth", 982388293);
        setIntField(term3617, term3617.getClass(), "type", 0);
        setField(term3617, term3617.getClass(), "next", null);
        setField(term3617, term3617.getClass(), "first", null);
        setField(term3617, term3617.getClass(), "last", null);
        setField(term3617, term3617.getClass(), "propListHead", null);
        setIntField(term3617, term3617.getClass(), "sourcePosition", 0);
        setField(term3617, term3617.getClass(), "jsType", null);
        setField(term3617, term3617.getClass(), "parent", null);
        setField(term3613, term3613.getClass(), "rootNode", term3617);
        setField(term3613, term3613.getClass(), "thisType", null);
        setBooleanField(term3613, term3613.getClass(), "isBottom", false);
        setField(term3613, term3613.getClass(), "arguments", null);
        HashMap term3596 = new HashMap();
        term3595 = newInstance(Class.forName("java.util.HashMap$ValueIterator"));
        setField(term3595, term3595.getClass(), "this$0", term3596);
        setField(term3595, term3595.getClass(), "next", null);
        setField(term3595, term3595.getClass(), "current", null);
        setIntField(term3595, term3595.getClass(), "expectedModCount", 0);
        setIntField(term3595, term3595.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVars", argTypes, term840, args);
        assertTrue(recursiveEquals(term840, term3613));
        assertTrue(recursiveEquals(retValue, term3595));
    }

};


