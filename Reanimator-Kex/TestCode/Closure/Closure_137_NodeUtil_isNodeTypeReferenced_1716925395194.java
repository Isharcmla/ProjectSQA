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
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_isNodeTypeReferenced_1716925395194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2722;
     Object term2749;

    public NodeUtil_isNodeTypeReferenced_1716925395194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2735 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2745 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2722, term2722.getClass(), "type", 457470807);
        setIntField(term2724, term2724.getClass(), "type", -23054366);
        setIntField(term2726, term2726.getClass(), "type", 0);
        setField(term2726, term2726.getClass(), "next", null);
        setField(term2726, term2726.getClass(), "first", null);
        setField(term2726, term2726.getClass(), "last", null);
        setField(term2726, term2726.getClass(), "propListHead", null);
        setIntField(term2726, term2726.getClass(), "sourcePosition", 0);
        setField(term2726, term2726.getClass(), "jsType", null);
        setField(term2726, term2726.getClass(), "parent", null);
        setField(term2724, term2724.getClass(), "next", term2726);
        setIntField(term2729, term2729.getClass(), "type", 0);
        setField(term2729, term2729.getClass(), "next", null);
        setField(term2729, term2729.getClass(), "first", null);
        setField(term2729, term2729.getClass(), "last", null);
        setField(term2729, term2729.getClass(), "propListHead", null);
        setIntField(term2729, term2729.getClass(), "sourcePosition", 0);
        setField(term2729, term2729.getClass(), "jsType", null);
        setField(term2729, term2729.getClass(), "parent", null);
        setField(term2724, term2724.getClass(), "first", term2729);
        setIntField(term2732, term2732.getClass(), "type", 0);
        setField(term2732, term2732.getClass(), "next", null);
        setField(term2732, term2732.getClass(), "first", null);
        setField(term2732, term2732.getClass(), "last", null);
        setField(term2732, term2732.getClass(), "propListHead", null);
        setIntField(term2732, term2732.getClass(), "sourcePosition", 0);
        setField(term2732, term2732.getClass(), "jsType", null);
        setField(term2732, term2732.getClass(), "parent", null);
        setField(term2724, term2724.getClass(), "last", term2732);
        setField(term2735, term2735.getClass(), "next", null);
        setIntField(term2735, term2735.getClass(), "type", 0);
        setIntField(term2735, term2735.getClass(), "intValue", 0);
        setField(term2735, term2735.getClass(), "objectValue", null);
        setField(term2724, term2724.getClass(), "propListHead", term2735);
        setIntField(term2724, term2724.getClass(), "sourcePosition", 1068256001);
        setField(term2724, term2724.getClass(), "jsType", null);
        setField(term2724, term2724.getClass(), "parent", null);
        setField(term2722, term2722.getClass(), "next", term2724);
        setIntField(term2739, term2739.getClass(), "type", 0);
        setField(term2739, term2739.getClass(), "next", null);
        setField(term2739, term2739.getClass(), "first", null);
        setField(term2739, term2739.getClass(), "last", null);
        setField(term2739, term2739.getClass(), "propListHead", null);
        setIntField(term2739, term2739.getClass(), "sourcePosition", 0);
        setField(term2739, term2739.getClass(), "jsType", null);
        setField(term2739, term2739.getClass(), "parent", null);
        setField(term2722, term2722.getClass(), "first", term2739);
        setIntField(term2742, term2742.getClass(), "type", 0);
        setField(term2742, term2742.getClass(), "next", null);
        setField(term2742, term2742.getClass(), "first", null);
        setField(term2742, term2742.getClass(), "last", null);
        setField(term2742, term2742.getClass(), "propListHead", null);
        setIntField(term2742, term2742.getClass(), "sourcePosition", 0);
        setField(term2742, term2742.getClass(), "jsType", null);
        setField(term2742, term2742.getClass(), "parent", null);
        setField(term2722, term2722.getClass(), "last", term2742);
        setField(term2745, term2745.getClass(), "next", null);
        setIntField(term2745, term2745.getClass(), "type", 0);
        setIntField(term2745, term2745.getClass(), "intValue", 0);
        setField(term2745, term2745.getClass(), "objectValue", null);
        setField(term2722, term2722.getClass(), "propListHead", term2745);
        setIntField(term2722, term2722.getClass(), "sourcePosition", 1139078354);
        setField(term2722, term2722.getClass(), "jsType", null);
        setField(term2722, term2722.getClass(), "parent", null);
        term2749 = new Integer(-691164974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2722;
        args[1] = term2749;
        args[2] = null;
        try {
            callMethod(klass, "isNodeTypeReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


