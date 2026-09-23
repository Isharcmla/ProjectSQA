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

public class NodeUtil_mayEffectMutableState_1910072630174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;
     Object term6723;

    public NodeUtil_mayEffectMutableState_1910072630174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term371, term371.getClass(), "type", -25637976);
        setIntField(term373, term373.getClass(), "type", -430151637);
        setIntField(term375, term375.getClass(), "type", 0);
        setField(term375, term375.getClass(), "next", null);
        setField(term375, term375.getClass(), "first", null);
        setField(term375, term375.getClass(), "last", null);
        setField(term375, term375.getClass(), "propListHead", null);
        setIntField(term375, term375.getClass(), "sourcePosition", 0);
        setField(term375, term375.getClass(), "jsType", null);
        setField(term375, term375.getClass(), "parent", null);
        setField(term373, term373.getClass(), "next", term375);
        setIntField(term378, term378.getClass(), "type", 0);
        setField(term378, term378.getClass(), "next", null);
        setField(term378, term378.getClass(), "first", null);
        setField(term378, term378.getClass(), "last", null);
        setField(term378, term378.getClass(), "propListHead", null);
        setIntField(term378, term378.getClass(), "sourcePosition", 0);
        setField(term378, term378.getClass(), "jsType", null);
        setField(term378, term378.getClass(), "parent", null);
        setField(term373, term373.getClass(), "first", term378);
        setIntField(term381, term381.getClass(), "type", 0);
        setField(term381, term381.getClass(), "next", null);
        setField(term381, term381.getClass(), "first", null);
        setField(term381, term381.getClass(), "last", null);
        setField(term381, term381.getClass(), "propListHead", null);
        setIntField(term381, term381.getClass(), "sourcePosition", 0);
        setField(term381, term381.getClass(), "jsType", null);
        setField(term381, term381.getClass(), "parent", null);
        setField(term373, term373.getClass(), "last", term381);
        setField(term373, term373.getClass(), "propListHead", null);
        setIntField(term373, term373.getClass(), "sourcePosition", 0);
        setField(term373, term373.getClass(), "jsType", null);
        setField(term373, term373.getClass(), "parent", null);
        setField(term371, term371.getClass(), "next", term373);
        setIntField(term385, term385.getClass(), "type", 0);
        setField(term385, term385.getClass(), "next", null);
        setField(term385, term385.getClass(), "first", null);
        setField(term385, term385.getClass(), "last", null);
        setField(term385, term385.getClass(), "propListHead", null);
        setIntField(term385, term385.getClass(), "sourcePosition", 0);
        setField(term385, term385.getClass(), "jsType", null);
        setField(term385, term385.getClass(), "parent", null);
        setField(term371, term371.getClass(), "first", term385);
        setIntField(term388, term388.getClass(), "type", 0);
        setField(term388, term388.getClass(), "next", null);
        setField(term388, term388.getClass(), "first", null);
        setField(term388, term388.getClass(), "last", null);
        setField(term388, term388.getClass(), "propListHead", null);
        setIntField(term388, term388.getClass(), "sourcePosition", 0);
        setField(term388, term388.getClass(), "jsType", null);
        setField(term388, term388.getClass(), "parent", null);
        setField(term371, term371.getClass(), "last", term388);
        setField(term371, term371.getClass(), "propListHead", null);
        setIntField(term371, term371.getClass(), "sourcePosition", 0);
        setField(term371, term371.getClass(), "jsType", null);
        setField(term371, term371.getClass(), "parent", null);
        term6723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6723, term6723.getClass(), "type", -25637976);
        setIntField(term6724, term6724.getClass(), "type", -430151637);
        setIntField(term6725, term6725.getClass(), "type", 0);
        setField(term6725, term6725.getClass(), "next", null);
        setField(term6725, term6725.getClass(), "first", null);
        setField(term6725, term6725.getClass(), "last", null);
        setField(term6725, term6725.getClass(), "propListHead", null);
        setIntField(term6725, term6725.getClass(), "sourcePosition", 0);
        setField(term6725, term6725.getClass(), "jsType", null);
        setField(term6725, term6725.getClass(), "parent", null);
        setField(term6724, term6724.getClass(), "next", term6725);
        setIntField(term6726, term6726.getClass(), "type", 0);
        setField(term6726, term6726.getClass(), "next", null);
        setField(term6726, term6726.getClass(), "first", null);
        setField(term6726, term6726.getClass(), "last", null);
        setField(term6726, term6726.getClass(), "propListHead", null);
        setIntField(term6726, term6726.getClass(), "sourcePosition", 0);
        setField(term6726, term6726.getClass(), "jsType", null);
        setField(term6726, term6726.getClass(), "parent", null);
        setField(term6724, term6724.getClass(), "first", term6726);
        setIntField(term6727, term6727.getClass(), "type", 0);
        setField(term6727, term6727.getClass(), "next", null);
        setField(term6727, term6727.getClass(), "first", null);
        setField(term6727, term6727.getClass(), "last", null);
        setField(term6727, term6727.getClass(), "propListHead", null);
        setIntField(term6727, term6727.getClass(), "sourcePosition", 0);
        setField(term6727, term6727.getClass(), "jsType", null);
        setField(term6727, term6727.getClass(), "parent", null);
        setField(term6724, term6724.getClass(), "last", term6727);
        setField(term6724, term6724.getClass(), "propListHead", null);
        setIntField(term6724, term6724.getClass(), "sourcePosition", 0);
        setField(term6724, term6724.getClass(), "jsType", null);
        setField(term6724, term6724.getClass(), "parent", null);
        setField(term6723, term6723.getClass(), "next", term6724);
        setIntField(term6728, term6728.getClass(), "type", 0);
        setField(term6728, term6728.getClass(), "next", null);
        setField(term6728, term6728.getClass(), "first", null);
        setField(term6728, term6728.getClass(), "last", null);
        setField(term6728, term6728.getClass(), "propListHead", null);
        setIntField(term6728, term6728.getClass(), "sourcePosition", 0);
        setField(term6728, term6728.getClass(), "jsType", null);
        setField(term6728, term6728.getClass(), "parent", null);
        setField(term6723, term6723.getClass(), "first", term6728);
        setIntField(term6729, term6729.getClass(), "type", 0);
        setField(term6729, term6729.getClass(), "next", null);
        setField(term6729, term6729.getClass(), "first", null);
        setField(term6729, term6729.getClass(), "last", null);
        setField(term6729, term6729.getClass(), "propListHead", null);
        setIntField(term6729, term6729.getClass(), "sourcePosition", 0);
        setField(term6729, term6729.getClass(), "jsType", null);
        setField(term6729, term6729.getClass(), "parent", null);
        setField(term6723, term6723.getClass(), "last", term6729);
        setField(term6723, term6723.getClass(), "propListHead", null);
        setIntField(term6723, term6723.getClass(), "sourcePosition", 0);
        setField(term6723, term6723.getClass(), "jsType", null);
        setField(term6723, term6723.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term371;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term371, term6723));
    }

};


