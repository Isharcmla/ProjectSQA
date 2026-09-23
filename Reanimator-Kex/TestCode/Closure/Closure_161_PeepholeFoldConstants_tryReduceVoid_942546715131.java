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

public class PeepholeFoldConstants_tryReduceVoid_942546715131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21408;
     Object term21568;
     Object term21922;
     Object term21924;
     Object term21895;

    public PeepholeFoldConstants_tryReduceVoid_942546715131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21408 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term21498 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term21498, term21498.getClass(), "compiler", null);
        setField(term21408, term21408.getClass(), "currentTraversal", term21498);
        term21568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21638, term21638.getClass(), "type", 112);
        setField(term21568, term21568.getClass(), "first", term21638);
        setIntField(term21568, term21568.getClass(), "type", 112);
        term21922 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term21923 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term21923, term21923.getClass(), "compiler", null);
        setField(term21923, term21923.getClass(), "callback", null);
        setField(term21923, term21923.getClass(), "curNode", null);
        setField(term21923, term21923.getClass(), "scopes", null);
        setField(term21923, term21923.getClass(), "scopeRoots", null);
        setField(term21923, term21923.getClass(), "cfgs", null);
        setField(term21923, term21923.getClass(), "sourceName", null);
        setField(term21923, term21923.getClass(), "scopeCreator", null);
        setField(term21923, term21923.getClass(), "scopeCallback", null);
        setField(term21922, term21922.getClass(), "currentTraversal", term21923);
        term21924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21924, term21924.getClass(), "type", 112);
        setField(term21924, term21924.getClass(), "next", null);
        setIntField(term21925, term21925.getClass(), "type", 112);
        setField(term21925, term21925.getClass(), "next", null);
        setField(term21925, term21925.getClass(), "first", null);
        setField(term21925, term21925.getClass(), "last", null);
        setField(term21925, term21925.getClass(), "propListHead", null);
        setIntField(term21925, term21925.getClass(), "sourcePosition", 0);
        setField(term21925, term21925.getClass(), "jsType", null);
        setField(term21925, term21925.getClass(), "parent", null);
        setField(term21924, term21924.getClass(), "first", term21925);
        setField(term21924, term21924.getClass(), "last", null);
        setField(term21924, term21924.getClass(), "propListHead", null);
        setIntField(term21924, term21924.getClass(), "sourcePosition", 0);
        setField(term21924, term21924.getClass(), "jsType", null);
        setField(term21924, term21924.getClass(), "parent", null);
        term21895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21895, term21895.getClass(), "type", 112);
        setField(term21895, term21895.getClass(), "next", null);
        setIntField(term21897, term21897.getClass(), "type", 112);
        setField(term21897, term21897.getClass(), "next", null);
        setField(term21897, term21897.getClass(), "first", null);
        setField(term21897, term21897.getClass(), "last", null);
        setField(term21897, term21897.getClass(), "propListHead", null);
        setIntField(term21897, term21897.getClass(), "sourcePosition", 0);
        setField(term21897, term21897.getClass(), "jsType", null);
        setField(term21897, term21897.getClass(), "parent", null);
        setField(term21895, term21895.getClass(), "first", term21897);
        setField(term21895, term21895.getClass(), "last", null);
        setField(term21895, term21895.getClass(), "propListHead", null);
        setIntField(term21895, term21895.getClass(), "sourcePosition", 0);
        setField(term21895, term21895.getClass(), "jsType", null);
        setField(term21895, term21895.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21568;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term21408, args);
        assertTrue(recursiveEquals(term21408, term21922));
        assertTrue(recursiveEquals(term21568, term21924));
        assertTrue(recursiveEquals(retValue, term21895));
    }

};


