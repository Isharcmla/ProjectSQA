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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NodeUtil_canBeSideEffected_2078426861188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;
     Object term688;
     Object term8776;
     Object term8783;

    public NodeUtil_canBeSideEffected_2078426861188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term667, term667.getClass(), "type", -916335264);
        setIntField(term669, term669.getClass(), "type", -123338791);
        setIntField(term671, term671.getClass(), "type", 0);
        setField(term671, term671.getClass(), "next", null);
        setField(term671, term671.getClass(), "first", null);
        setField(term671, term671.getClass(), "last", null);
        setField(term671, term671.getClass(), "propListHead", null);
        setIntField(term671, term671.getClass(), "sourcePosition", 0);
        setField(term671, term671.getClass(), "jsType", null);
        setField(term671, term671.getClass(), "parent", null);
        setField(term669, term669.getClass(), "next", term671);
        setIntField(term674, term674.getClass(), "type", 0);
        setField(term674, term674.getClass(), "next", null);
        setField(term674, term674.getClass(), "first", null);
        setField(term674, term674.getClass(), "last", null);
        setField(term674, term674.getClass(), "propListHead", null);
        setIntField(term674, term674.getClass(), "sourcePosition", 0);
        setField(term674, term674.getClass(), "jsType", null);
        setField(term674, term674.getClass(), "parent", null);
        setField(term669, term669.getClass(), "first", term674);
        setIntField(term677, term677.getClass(), "type", 0);
        setField(term677, term677.getClass(), "next", null);
        setField(term677, term677.getClass(), "first", null);
        setField(term677, term677.getClass(), "last", null);
        setField(term677, term677.getClass(), "propListHead", null);
        setIntField(term677, term677.getClass(), "sourcePosition", 0);
        setField(term677, term677.getClass(), "jsType", null);
        setField(term677, term677.getClass(), "parent", null);
        setField(term669, term669.getClass(), "last", term677);
        setField(term669, term669.getClass(), "propListHead", null);
        setIntField(term669, term669.getClass(), "sourcePosition", 0);
        setField(term669, term669.getClass(), "jsType", null);
        setField(term669, term669.getClass(), "parent", null);
        setField(term667, term667.getClass(), "next", term669);
        setIntField(term681, term681.getClass(), "type", 0);
        setField(term681, term681.getClass(), "next", null);
        setField(term681, term681.getClass(), "first", null);
        setField(term681, term681.getClass(), "last", null);
        setField(term681, term681.getClass(), "propListHead", null);
        setIntField(term681, term681.getClass(), "sourcePosition", 0);
        setField(term681, term681.getClass(), "jsType", null);
        setField(term681, term681.getClass(), "parent", null);
        setField(term667, term667.getClass(), "first", term681);
        setIntField(term684, term684.getClass(), "type", 0);
        setField(term684, term684.getClass(), "next", null);
        setField(term684, term684.getClass(), "first", null);
        setField(term684, term684.getClass(), "last", null);
        setField(term684, term684.getClass(), "propListHead", null);
        setIntField(term684, term684.getClass(), "sourcePosition", 0);
        setField(term684, term684.getClass(), "jsType", null);
        setField(term684, term684.getClass(), "parent", null);
        setField(term667, term667.getClass(), "last", term684);
        setField(term667, term667.getClass(), "propListHead", null);
        setIntField(term667, term667.getClass(), "sourcePosition", 0);
        setField(term667, term667.getClass(), "jsType", null);
        setField(term667, term667.getClass(), "parent", null);
        HashMap term689 = new HashMap();
        Set<Object> term8786 =  ((Map) term689).keySet();
        term688 = new HashSet((Collection<? extends Object>) term8786);
        term8776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8776, term8776.getClass(), "type", -916335264);
        setIntField(term8777, term8777.getClass(), "type", -123338791);
        setIntField(term8778, term8778.getClass(), "type", 0);
        setField(term8778, term8778.getClass(), "next", null);
        setField(term8778, term8778.getClass(), "first", null);
        setField(term8778, term8778.getClass(), "last", null);
        setField(term8778, term8778.getClass(), "propListHead", null);
        setIntField(term8778, term8778.getClass(), "sourcePosition", 0);
        setField(term8778, term8778.getClass(), "jsType", null);
        setField(term8778, term8778.getClass(), "parent", null);
        setField(term8777, term8777.getClass(), "next", term8778);
        setIntField(term8779, term8779.getClass(), "type", 0);
        setField(term8779, term8779.getClass(), "next", null);
        setField(term8779, term8779.getClass(), "first", null);
        setField(term8779, term8779.getClass(), "last", null);
        setField(term8779, term8779.getClass(), "propListHead", null);
        setIntField(term8779, term8779.getClass(), "sourcePosition", 0);
        setField(term8779, term8779.getClass(), "jsType", null);
        setField(term8779, term8779.getClass(), "parent", null);
        setField(term8777, term8777.getClass(), "first", term8779);
        setIntField(term8780, term8780.getClass(), "type", 0);
        setField(term8780, term8780.getClass(), "next", null);
        setField(term8780, term8780.getClass(), "first", null);
        setField(term8780, term8780.getClass(), "last", null);
        setField(term8780, term8780.getClass(), "propListHead", null);
        setIntField(term8780, term8780.getClass(), "sourcePosition", 0);
        setField(term8780, term8780.getClass(), "jsType", null);
        setField(term8780, term8780.getClass(), "parent", null);
        setField(term8777, term8777.getClass(), "last", term8780);
        setField(term8777, term8777.getClass(), "propListHead", null);
        setIntField(term8777, term8777.getClass(), "sourcePosition", 0);
        setField(term8777, term8777.getClass(), "jsType", null);
        setField(term8777, term8777.getClass(), "parent", null);
        setField(term8776, term8776.getClass(), "next", term8777);
        setIntField(term8781, term8781.getClass(), "type", 0);
        setField(term8781, term8781.getClass(), "next", null);
        setField(term8781, term8781.getClass(), "first", null);
        setField(term8781, term8781.getClass(), "last", null);
        setField(term8781, term8781.getClass(), "propListHead", null);
        setIntField(term8781, term8781.getClass(), "sourcePosition", 0);
        setField(term8781, term8781.getClass(), "jsType", null);
        setField(term8781, term8781.getClass(), "parent", null);
        setField(term8776, term8776.getClass(), "first", term8781);
        setIntField(term8782, term8782.getClass(), "type", 0);
        setField(term8782, term8782.getClass(), "next", null);
        setField(term8782, term8782.getClass(), "first", null);
        setField(term8782, term8782.getClass(), "last", null);
        setField(term8782, term8782.getClass(), "propListHead", null);
        setIntField(term8782, term8782.getClass(), "sourcePosition", 0);
        setField(term8782, term8782.getClass(), "jsType", null);
        setField(term8782, term8782.getClass(), "parent", null);
        setField(term8776, term8776.getClass(), "last", term8782);
        setField(term8776, term8776.getClass(), "propListHead", null);
        setIntField(term8776, term8776.getClass(), "sourcePosition", 0);
        setField(term8776, term8776.getClass(), "jsType", null);
        setField(term8776, term8776.getClass(), "parent", null);
        HashMap term8784 = new HashMap();
        Set<Object> term8787 =  ((Map) term8784).keySet();
        term8783 = new HashSet((Collection<? extends Object>) term8787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term667;
        args[1] = term688;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term667, term8776));
        assertTrue(recursiveEquals(term688, term8783));
        assertTrue(recursiveEquals(retValue, false));
    }

};


