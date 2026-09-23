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

public class PeepholeFoldConstants_tryReduceVoid_942546715257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41927;
     Object term42087;
     Object term42200;
     Object term42202;
     Object term42173;

    public PeepholeFoldConstants_tryReduceVoid_942546715257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41927 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term42017 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term42017, term42017.getClass(), "compiler", null);
        setField(term41927, term41927.getClass(), "currentTraversal", term42017);
        term42087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42157, term42157.getClass(), "type", 102);
        setField(term42087, term42087.getClass(), "first", term42157);
        setIntField(term42087, term42087.getClass(), "type", 102);
        term42200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term42201 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term42201, term42201.getClass(), "compiler", null);
        setField(term42201, term42201.getClass(), "callback", null);
        setField(term42201, term42201.getClass(), "curNode", null);
        setField(term42201, term42201.getClass(), "scopes", null);
        setField(term42201, term42201.getClass(), "scopeRoots", null);
        setField(term42201, term42201.getClass(), "cfgs", null);
        setField(term42201, term42201.getClass(), "sourceName", null);
        setField(term42201, term42201.getClass(), "scopeCreator", null);
        setField(term42201, term42201.getClass(), "scopeCallback", null);
        setField(term42200, term42200.getClass(), "currentTraversal", term42201);
        term42202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42202, term42202.getClass(), "type", 102);
        setField(term42202, term42202.getClass(), "next", null);
        setIntField(term42203, term42203.getClass(), "type", 102);
        setField(term42203, term42203.getClass(), "next", null);
        setField(term42203, term42203.getClass(), "first", null);
        setField(term42203, term42203.getClass(), "last", null);
        setField(term42203, term42203.getClass(), "propListHead", null);
        setIntField(term42203, term42203.getClass(), "sourcePosition", 0);
        setField(term42203, term42203.getClass(), "jsType", null);
        setField(term42203, term42203.getClass(), "parent", null);
        setField(term42202, term42202.getClass(), "first", term42203);
        setField(term42202, term42202.getClass(), "last", null);
        setField(term42202, term42202.getClass(), "propListHead", null);
        setIntField(term42202, term42202.getClass(), "sourcePosition", 0);
        setField(term42202, term42202.getClass(), "jsType", null);
        setField(term42202, term42202.getClass(), "parent", null);
        term42173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42173, term42173.getClass(), "type", 102);
        setField(term42173, term42173.getClass(), "next", null);
        setIntField(term42175, term42175.getClass(), "type", 102);
        setField(term42175, term42175.getClass(), "next", null);
        setField(term42175, term42175.getClass(), "first", null);
        setField(term42175, term42175.getClass(), "last", null);
        setField(term42175, term42175.getClass(), "propListHead", null);
        setIntField(term42175, term42175.getClass(), "sourcePosition", 0);
        setField(term42175, term42175.getClass(), "jsType", null);
        setField(term42175, term42175.getClass(), "parent", null);
        setField(term42173, term42173.getClass(), "first", term42175);
        setField(term42173, term42173.getClass(), "last", null);
        setField(term42173, term42173.getClass(), "propListHead", null);
        setIntField(term42173, term42173.getClass(), "sourcePosition", 0);
        setField(term42173, term42173.getClass(), "jsType", null);
        setField(term42173, term42173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42087;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term41927, args);
        assertTrue(recursiveEquals(term41927, term42200));
        assertTrue(recursiveEquals(term42087, term42202));
        assertTrue(recursiveEquals(retValue, term42173));
    }

};


