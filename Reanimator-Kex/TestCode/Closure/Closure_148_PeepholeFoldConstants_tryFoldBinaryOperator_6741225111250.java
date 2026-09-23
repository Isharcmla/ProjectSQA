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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297785;
     Object term297855;
     Object term298721;
     Object term298722;
     Object term298692;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term297855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term297925, term297925.getClass(), "next", term297995);
        setIntField(term297925, term297925.getClass(), "type", 39);
        setField(term297855, term297855.getClass(), "first", term297925);
        setIntField(term297855, term297855.getClass(), "type", 23);
        term298721 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term298721, term298721.getClass(), "currentTraversal", null);
        term298722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term298722, term298722.getClass(), "type", 23);
        setField(term298722, term298722.getClass(), "next", null);
        setIntField(term298723, term298723.getClass(), "type", 39);
        setIntField(term298724, term298724.getClass(), "type", 0);
        setField(term298724, term298724.getClass(), "next", null);
        setField(term298724, term298724.getClass(), "first", null);
        setField(term298724, term298724.getClass(), "last", null);
        setField(term298724, term298724.getClass(), "propListHead", null);
        setIntField(term298724, term298724.getClass(), "sourcePosition", 0);
        setField(term298724, term298724.getClass(), "jsType", null);
        setField(term298724, term298724.getClass(), "parent", null);
        setField(term298723, term298723.getClass(), "next", term298724);
        setField(term298723, term298723.getClass(), "first", null);
        setField(term298723, term298723.getClass(), "last", null);
        setField(term298723, term298723.getClass(), "propListHead", null);
        setIntField(term298723, term298723.getClass(), "sourcePosition", 0);
        setField(term298723, term298723.getClass(), "jsType", null);
        setField(term298723, term298723.getClass(), "parent", null);
        setField(term298722, term298722.getClass(), "first", term298723);
        setField(term298722, term298722.getClass(), "last", null);
        setField(term298722, term298722.getClass(), "propListHead", null);
        setIntField(term298722, term298722.getClass(), "sourcePosition", 0);
        setField(term298722, term298722.getClass(), "jsType", null);
        setField(term298722, term298722.getClass(), "parent", null);
        term298692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term298692, term298692.getClass(), "type", 23);
        setField(term298692, term298692.getClass(), "next", null);
        setIntField(term298694, term298694.getClass(), "type", 39);
        setIntField(term298696, term298696.getClass(), "type", 0);
        setField(term298696, term298696.getClass(), "next", null);
        setField(term298696, term298696.getClass(), "first", null);
        setField(term298696, term298696.getClass(), "last", null);
        setField(term298696, term298696.getClass(), "propListHead", null);
        setIntField(term298696, term298696.getClass(), "sourcePosition", 0);
        setField(term298696, term298696.getClass(), "jsType", null);
        setField(term298696, term298696.getClass(), "parent", null);
        setField(term298694, term298694.getClass(), "next", term298696);
        setField(term298694, term298694.getClass(), "first", null);
        setField(term298694, term298694.getClass(), "last", null);
        setField(term298694, term298694.getClass(), "propListHead", null);
        setIntField(term298694, term298694.getClass(), "sourcePosition", 0);
        setField(term298694, term298694.getClass(), "jsType", null);
        setField(term298694, term298694.getClass(), "parent", null);
        setField(term298692, term298692.getClass(), "first", term298694);
        setField(term298692, term298692.getClass(), "last", null);
        setField(term298692, term298692.getClass(), "propListHead", null);
        setIntField(term298692, term298692.getClass(), "sourcePosition", 0);
        setField(term298692, term298692.getClass(), "jsType", null);
        setField(term298692, term298692.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term297855;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term297785, args);
        assertTrue(recursiveEquals(term297785, term298721));
        assertTrue(recursiveEquals(term297855, term298722));
        assertTrue(recursiveEquals(retValue, term298692));
    }

};


