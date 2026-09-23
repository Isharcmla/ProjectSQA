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
import java.lang.String;

public class NodeUtil_getImpureBooleanValue_541450511155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3652;
     Object enum0;

    public NodeUtil_getImpureBooleanValue_541450511155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1, term1.getClass(), "type", 391863371);
        setIntField(term3, term3.getClass(), "type", -2038273078);
        setIntField(term5, term5.getClass(), "type", 0);
        setField(term5, term5.getClass(), "next", null);
        setField(term5, term5.getClass(), "first", null);
        setField(term5, term5.getClass(), "last", null);
        setField(term5, term5.getClass(), "propListHead", null);
        setIntField(term5, term5.getClass(), "sourcePosition", 0);
        setField(term5, term5.getClass(), "jsType", null);
        setField(term5, term5.getClass(), "parent", null);
        setField(term3, term3.getClass(), "next", term5);
        setIntField(term8, term8.getClass(), "type", 0);
        setField(term8, term8.getClass(), "next", null);
        setField(term8, term8.getClass(), "first", null);
        setField(term8, term8.getClass(), "last", null);
        setField(term8, term8.getClass(), "propListHead", null);
        setIntField(term8, term8.getClass(), "sourcePosition", 0);
        setField(term8, term8.getClass(), "jsType", null);
        setField(term8, term8.getClass(), "parent", null);
        setField(term3, term3.getClass(), "first", term8);
        setIntField(term11, term11.getClass(), "type", 0);
        setField(term11, term11.getClass(), "next", null);
        setField(term11, term11.getClass(), "first", null);
        setField(term11, term11.getClass(), "last", null);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term3, term3.getClass(), "last", term11);
        setField(term3, term3.getClass(), "propListHead", null);
        setIntField(term3, term3.getClass(), "sourcePosition", 0);
        setField(term3, term3.getClass(), "jsType", null);
        setField(term3, term3.getClass(), "parent", null);
        setField(term1, term1.getClass(), "next", term3);
        setIntField(term15, term15.getClass(), "type", 0);
        setField(term15, term15.getClass(), "next", null);
        setField(term15, term15.getClass(), "first", null);
        setField(term15, term15.getClass(), "last", null);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term1, term1.getClass(), "first", term15);
        setIntField(term18, term18.getClass(), "type", 0);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", null);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term1, term1.getClass(), "last", term18);
        setField(term1, term1.getClass(), "propListHead", null);
        setIntField(term1, term1.getClass(), "sourcePosition", 0);
        setField(term1, term1.getClass(), "jsType", null);
        setField(term1, term1.getClass(), "parent", null);
        term3652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3652, term3652.getClass(), "type", 391863371);
        setIntField(term3653, term3653.getClass(), "type", -2038273078);
        setIntField(term3654, term3654.getClass(), "type", 0);
        setField(term3654, term3654.getClass(), "next", null);
        setField(term3654, term3654.getClass(), "first", null);
        setField(term3654, term3654.getClass(), "last", null);
        setField(term3654, term3654.getClass(), "propListHead", null);
        setIntField(term3654, term3654.getClass(), "sourcePosition", 0);
        setField(term3654, term3654.getClass(), "jsType", null);
        setField(term3654, term3654.getClass(), "parent", null);
        setField(term3653, term3653.getClass(), "next", term3654);
        setIntField(term3655, term3655.getClass(), "type", 0);
        setField(term3655, term3655.getClass(), "next", null);
        setField(term3655, term3655.getClass(), "first", null);
        setField(term3655, term3655.getClass(), "last", null);
        setField(term3655, term3655.getClass(), "propListHead", null);
        setIntField(term3655, term3655.getClass(), "sourcePosition", 0);
        setField(term3655, term3655.getClass(), "jsType", null);
        setField(term3655, term3655.getClass(), "parent", null);
        setField(term3653, term3653.getClass(), "first", term3655);
        setIntField(term3656, term3656.getClass(), "type", 0);
        setField(term3656, term3656.getClass(), "next", null);
        setField(term3656, term3656.getClass(), "first", null);
        setField(term3656, term3656.getClass(), "last", null);
        setField(term3656, term3656.getClass(), "propListHead", null);
        setIntField(term3656, term3656.getClass(), "sourcePosition", 0);
        setField(term3656, term3656.getClass(), "jsType", null);
        setField(term3656, term3656.getClass(), "parent", null);
        setField(term3653, term3653.getClass(), "last", term3656);
        setField(term3653, term3653.getClass(), "propListHead", null);
        setIntField(term3653, term3653.getClass(), "sourcePosition", 0);
        setField(term3653, term3653.getClass(), "jsType", null);
        setField(term3653, term3653.getClass(), "parent", null);
        setField(term3652, term3652.getClass(), "next", term3653);
        setIntField(term3657, term3657.getClass(), "type", 0);
        setField(term3657, term3657.getClass(), "next", null);
        setField(term3657, term3657.getClass(), "first", null);
        setField(term3657, term3657.getClass(), "last", null);
        setField(term3657, term3657.getClass(), "propListHead", null);
        setIntField(term3657, term3657.getClass(), "sourcePosition", 0);
        setField(term3657, term3657.getClass(), "jsType", null);
        setField(term3657, term3657.getClass(), "parent", null);
        setField(term3652, term3652.getClass(), "first", term3657);
        setIntField(term3658, term3658.getClass(), "type", 0);
        setField(term3658, term3658.getClass(), "next", null);
        setField(term3658, term3658.getClass(), "first", null);
        setField(term3658, term3658.getClass(), "last", null);
        setField(term3658, term3658.getClass(), "propListHead", null);
        setIntField(term3658, term3658.getClass(), "sourcePosition", 0);
        setField(term3658, term3658.getClass(), "jsType", null);
        setField(term3658, term3658.getClass(), "parent", null);
        setField(term3652, term3652.getClass(), "last", term3658);
        setField(term3652, term3652.getClass(), "propListHead", null);
        setIntField(term3652, term3652.getClass(), "sourcePosition", 0);
        setField(term3652, term3652.getClass(), "jsType", null);
        setField(term3652, term3652.getClass(), "parent", null);
        Class<? extends Object> term3688 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term3687 = ((Class) term3688).getDeclaredField((String) "UNKNOWN");
        ((Field) term3687).setAccessible(true);
        enum0 = ((Field) term3687).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "getImpureBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term3652));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


