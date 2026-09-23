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

public class PeepholeFoldConstants_tryReduceVoid_94254671587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13572;
     Object term13732;
     Object term13846;
     Object term13848;
     Object term13819;

    public PeepholeFoldConstants_tryReduceVoid_94254671587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13572 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13662 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term13662, term13662.getClass(), "compiler", null);
        setField(term13572, term13572.getClass(), "currentTraversal", term13662);
        term13732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13802, term13802.getClass(), "type", 82);
        setField(term13732, term13732.getClass(), "first", term13802);
        setIntField(term13732, term13732.getClass(), "type", 82);
        term13846 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13847 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term13847, term13847.getClass(), "compiler", null);
        setField(term13847, term13847.getClass(), "callback", null);
        setField(term13847, term13847.getClass(), "curNode", null);
        setField(term13847, term13847.getClass(), "scopes", null);
        setField(term13847, term13847.getClass(), "scopeRoots", null);
        setField(term13847, term13847.getClass(), "cfgs", null);
        setField(term13847, term13847.getClass(), "sourceName", null);
        setField(term13847, term13847.getClass(), "scopeCreator", null);
        setField(term13847, term13847.getClass(), "scopeCallback", null);
        setField(term13846, term13846.getClass(), "currentTraversal", term13847);
        term13848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13848, term13848.getClass(), "type", 82);
        setField(term13848, term13848.getClass(), "next", null);
        setIntField(term13849, term13849.getClass(), "type", 82);
        setField(term13849, term13849.getClass(), "next", null);
        setField(term13849, term13849.getClass(), "first", null);
        setField(term13849, term13849.getClass(), "last", null);
        setField(term13849, term13849.getClass(), "propListHead", null);
        setIntField(term13849, term13849.getClass(), "sourcePosition", 0);
        setField(term13849, term13849.getClass(), "jsType", null);
        setField(term13849, term13849.getClass(), "parent", null);
        setField(term13848, term13848.getClass(), "first", term13849);
        setField(term13848, term13848.getClass(), "last", null);
        setField(term13848, term13848.getClass(), "propListHead", null);
        setIntField(term13848, term13848.getClass(), "sourcePosition", 0);
        setField(term13848, term13848.getClass(), "jsType", null);
        setField(term13848, term13848.getClass(), "parent", null);
        term13819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13819, term13819.getClass(), "type", 82);
        setField(term13819, term13819.getClass(), "next", null);
        setIntField(term13821, term13821.getClass(), "type", 82);
        setField(term13821, term13821.getClass(), "next", null);
        setField(term13821, term13821.getClass(), "first", null);
        setField(term13821, term13821.getClass(), "last", null);
        setField(term13821, term13821.getClass(), "propListHead", null);
        setIntField(term13821, term13821.getClass(), "sourcePosition", 0);
        setField(term13821, term13821.getClass(), "jsType", null);
        setField(term13821, term13821.getClass(), "parent", null);
        setField(term13819, term13819.getClass(), "first", term13821);
        setField(term13819, term13819.getClass(), "last", null);
        setField(term13819, term13819.getClass(), "propListHead", null);
        setIntField(term13819, term13819.getClass(), "sourcePosition", 0);
        setField(term13819, term13819.getClass(), "jsType", null);
        setField(term13819, term13819.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13732;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term13572, args);
        assertTrue(recursiveEquals(term13572, term13846));
        assertTrue(recursiveEquals(term13732, term13848));
        assertTrue(recursiveEquals(retValue, term13819));
    }

};


