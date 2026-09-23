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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionInjector_inline_203096642726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;
     Object term672;
     Object term711;
     Object enum3;

    public FunctionInjector_inline_203096642726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term665 = new HashMap();
        Set<Object> term3611 =  ((Map) term665).keySet();
        HashSet term664 = new HashSet((Collection<? extends Object>) term3611);
        term662 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term662, term662.getClass(), "compiler", null);
        setField(term662, term662.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term662, term662.getClass(), "allowDecomposition", false);
        setField(term662, term662.getClass(), "knownConstants", term664);
        setBooleanField(term662, term662.getClass(), "assumeStrictThis", false);
        setBooleanField(term662, term662.getClass(), "assumeMinimumCapture", true);
        term672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term672, term672.getClass(), "type", -1968847291);
        setIntField(term674, term674.getClass(), "type", 579005622);
        setIntField(term676, term676.getClass(), "type", -14890619);
        setIntField(term678, term678.getClass(), "type", 1632125673);
        setIntField(term680, term680.getClass(), "type", 454281060);
        setField(term680, term680.getClass(), "next", null);
        setField(term680, term680.getClass(), "first", null);
        setField(term680, term680.getClass(), "last", null);
        setField(term680, term680.getClass(), "propListHead", null);
        setIntField(term680, term680.getClass(), "sourcePosition", 0);
        setField(term680, term680.getClass(), "jsType", null);
        setField(term680, term680.getClass(), "parent", null);
        setField(term678, term678.getClass(), "next", term680);
        setIntField(term683, term683.getClass(), "type", -1786399638);
        setField(term683, term683.getClass(), "next", null);
        setField(term683, term683.getClass(), "first", null);
        setField(term683, term683.getClass(), "last", term680);
        setField(term683, term683.getClass(), "propListHead", null);
        setIntField(term683, term683.getClass(), "sourcePosition", 0);
        setField(term683, term683.getClass(), "jsType", null);
        setField(term683, term683.getClass(), "parent", null);
        setField(term678, term678.getClass(), "first", term683);
        setField(term678, term678.getClass(), "last", term676);
        setField(term678, term678.getClass(), "propListHead", null);
        setIntField(term678, term678.getClass(), "sourcePosition", 0);
        setField(term678, term678.getClass(), "jsType", null);
        setField(term678, term678.getClass(), "parent", null);
        setField(term676, term676.getClass(), "next", term678);
        setField(term676, term676.getClass(), "first", term680);
        setIntField(term687, term687.getClass(), "type", -1048298087);
        setIntField(term689, term689.getClass(), "type", 292681826);
        setField(term689, term689.getClass(), "next", null);
        setField(term689, term689.getClass(), "first", term683);
        setField(term689, term689.getClass(), "last", term678);
        setField(term689, term689.getClass(), "propListHead", null);
        setIntField(term689, term689.getClass(), "sourcePosition", 0);
        setField(term689, term689.getClass(), "jsType", null);
        setField(term689, term689.getClass(), "parent", null);
        setField(term687, term687.getClass(), "next", term689);
        setField(term687, term687.getClass(), "first", term674);
        setField(term687, term687.getClass(), "last", term674);
        setField(term687, term687.getClass(), "propListHead", null);
        setIntField(term687, term687.getClass(), "sourcePosition", 0);
        setField(term687, term687.getClass(), "jsType", null);
        setField(term687, term687.getClass(), "parent", null);
        setField(term676, term676.getClass(), "last", term687);
        setField(term676, term676.getClass(), "propListHead", null);
        setIntField(term676, term676.getClass(), "sourcePosition", 0);
        setField(term676, term676.getClass(), "jsType", null);
        setField(term676, term676.getClass(), "parent", null);
        setField(term674, term674.getClass(), "next", term676);
        setIntField(term694, term694.getClass(), "type", 458147407);
        setField(term694, term694.getClass(), "next", term687);
        setField(term694, term694.getClass(), "first", term689);
        setField(term694, term694.getClass(), "last", term672);
        setField(term694, term694.getClass(), "propListHead", null);
        setIntField(term694, term694.getClass(), "sourcePosition", 0);
        setField(term694, term694.getClass(), "jsType", null);
        setField(term694, term694.getClass(), "parent", null);
        setField(term674, term674.getClass(), "first", term694);
        setField(term674, term674.getClass(), "last", term694);
        setField(term674, term674.getClass(), "propListHead", null);
        setIntField(term674, term674.getClass(), "sourcePosition", 0);
        setField(term674, term674.getClass(), "jsType", null);
        setField(term674, term674.getClass(), "parent", null);
        setField(term672, term672.getClass(), "next", term674);
        setField(term672, term672.getClass(), "first", term678);
        setField(term672, term672.getClass(), "last", term680);
        setField(term672, term672.getClass(), "propListHead", null);
        setIntField(term672, term672.getClass(), "sourcePosition", 0);
        setField(term672, term672.getClass(), "jsType", null);
        setField(term672, term672.getClass(), "parent", null);
        term711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term711, term711.getClass(), "type", -184153539);
        setIntField(term713, term713.getClass(), "type", 493620644);
        setIntField(term715, term715.getClass(), "type", 1328271830);
        setIntField(term717, term717.getClass(), "type", 1596070772);
        setIntField(term719, term719.getClass(), "type", 97029295);
        setField(term719, term719.getClass(), "next", null);
        setField(term719, term719.getClass(), "first", null);
        setField(term719, term719.getClass(), "last", null);
        setField(term719, term719.getClass(), "propListHead", null);
        setIntField(term719, term719.getClass(), "sourcePosition", 0);
        setField(term719, term719.getClass(), "jsType", null);
        setField(term719, term719.getClass(), "parent", null);
        setField(term717, term717.getClass(), "next", term719);
        setIntField(term722, term722.getClass(), "type", -1371869594);
        setField(term722, term722.getClass(), "next", null);
        setField(term722, term722.getClass(), "first", null);
        setField(term722, term722.getClass(), "last", term719);
        setField(term722, term722.getClass(), "propListHead", null);
        setIntField(term722, term722.getClass(), "sourcePosition", 0);
        setField(term722, term722.getClass(), "jsType", null);
        setField(term722, term722.getClass(), "parent", null);
        setField(term717, term717.getClass(), "first", term722);
        setField(term717, term717.getClass(), "last", term715);
        setField(term717, term717.getClass(), "propListHead", null);
        setIntField(term717, term717.getClass(), "sourcePosition", 0);
        setField(term717, term717.getClass(), "jsType", null);
        setField(term717, term717.getClass(), "parent", null);
        setField(term715, term715.getClass(), "next", term717);
        setField(term715, term715.getClass(), "first", term719);
        setIntField(term726, term726.getClass(), "type", 1225272962);
        setIntField(term728, term728.getClass(), "type", 1324040357);
        setField(term728, term728.getClass(), "next", null);
        setField(term728, term728.getClass(), "first", term722);
        setField(term728, term728.getClass(), "last", term717);
        setField(term728, term728.getClass(), "propListHead", null);
        setIntField(term728, term728.getClass(), "sourcePosition", 0);
        setField(term728, term728.getClass(), "jsType", null);
        setField(term728, term728.getClass(), "parent", null);
        setField(term726, term726.getClass(), "next", term728);
        setField(term726, term726.getClass(), "first", term713);
        setField(term726, term726.getClass(), "last", term713);
        setField(term726, term726.getClass(), "propListHead", null);
        setIntField(term726, term726.getClass(), "sourcePosition", 0);
        setField(term726, term726.getClass(), "jsType", null);
        setField(term726, term726.getClass(), "parent", null);
        setField(term715, term715.getClass(), "last", term726);
        setField(term715, term715.getClass(), "propListHead", null);
        setIntField(term715, term715.getClass(), "sourcePosition", 0);
        setField(term715, term715.getClass(), "jsType", null);
        setField(term715, term715.getClass(), "parent", null);
        setField(term713, term713.getClass(), "next", term715);
        setIntField(term733, term733.getClass(), "type", -1588772968);
        setField(term733, term733.getClass(), "next", term726);
        setField(term733, term733.getClass(), "first", term728);
        setField(term733, term733.getClass(), "last", term711);
        setField(term733, term733.getClass(), "propListHead", null);
        setIntField(term733, term733.getClass(), "sourcePosition", 0);
        setField(term733, term733.getClass(), "jsType", null);
        setField(term733, term733.getClass(), "parent", null);
        setField(term713, term713.getClass(), "first", term733);
        setField(term713, term713.getClass(), "last", term733);
        setField(term713, term713.getClass(), "propListHead", null);
        setIntField(term713, term713.getClass(), "sourcePosition", 0);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term711, term711.getClass(), "next", term713);
        setField(term711, term711.getClass(), "first", term717);
        setField(term711, term711.getClass(), "last", term719);
        setField(term711, term711.getClass(), "propListHead", null);
        setIntField(term711, term711.getClass(), "sourcePosition", 0);
        setField(term711, term711.getClass(), "jsType", null);
        setField(term711, term711.getClass(), "parent", null);
        Class<? extends Object> term3623 = Class.forName((String) "com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Field term3622 = ((Class) term3623).getDeclaredField((String) "DIRECT");
        ((Field) term3622).setAccessible(true);
        enum3 = ((Field) term3622).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Object[] args = new Object[4];
        args[0] = term672;
        args[1] = "TEParAifyi";
        args[2] = term711;
        args[3] = enum3;
        try {
            callMethod(klass, "inline", argTypes, term662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


