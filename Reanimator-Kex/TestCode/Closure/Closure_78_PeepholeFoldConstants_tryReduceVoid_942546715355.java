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

public class PeepholeFoldConstants_tryReduceVoid_942546715355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82184;
     Object term82344;
     Object term93139;
     Object term93141;
     Object term93112;

    public PeepholeFoldConstants_tryReduceVoid_942546715355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82184 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term82274 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term82274, term82274.getClass(), "compiler", null);
        setField(term82184, term82184.getClass(), "currentTraversal", term82274);
        term82344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82414, term82414.getClass(), "type", 127);
        setField(term82344, term82344.getClass(), "first", term82414);
        setIntField(term82344, term82344.getClass(), "type", 127);
        term93139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term93140 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term93140, term93140.getClass(), "compiler", null);
        setField(term93140, term93140.getClass(), "callback", null);
        setField(term93140, term93140.getClass(), "curNode", null);
        setField(term93140, term93140.getClass(), "scopes", null);
        setField(term93140, term93140.getClass(), "scopeRoots", null);
        setField(term93140, term93140.getClass(), "cfgs", null);
        setField(term93140, term93140.getClass(), "sourceName", null);
        setField(term93140, term93140.getClass(), "scopeCreator", null);
        setField(term93140, term93140.getClass(), "scopeCallback", null);
        setField(term93139, term93139.getClass(), "currentTraversal", term93140);
        term93141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93141, term93141.getClass(), "type", 127);
        setField(term93141, term93141.getClass(), "next", null);
        setIntField(term93142, term93142.getClass(), "type", 127);
        setField(term93142, term93142.getClass(), "next", null);
        setField(term93142, term93142.getClass(), "first", null);
        setField(term93142, term93142.getClass(), "last", null);
        setField(term93142, term93142.getClass(), "propListHead", null);
        setIntField(term93142, term93142.getClass(), "sourcePosition", 0);
        setField(term93142, term93142.getClass(), "jsType", null);
        setField(term93142, term93142.getClass(), "parent", null);
        setField(term93141, term93141.getClass(), "first", term93142);
        setField(term93141, term93141.getClass(), "last", null);
        setField(term93141, term93141.getClass(), "propListHead", null);
        setIntField(term93141, term93141.getClass(), "sourcePosition", 0);
        setField(term93141, term93141.getClass(), "jsType", null);
        setField(term93141, term93141.getClass(), "parent", null);
        term93112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93112, term93112.getClass(), "type", 127);
        setField(term93112, term93112.getClass(), "next", null);
        setIntField(term93114, term93114.getClass(), "type", 127);
        setField(term93114, term93114.getClass(), "next", null);
        setField(term93114, term93114.getClass(), "first", null);
        setField(term93114, term93114.getClass(), "last", null);
        setField(term93114, term93114.getClass(), "propListHead", null);
        setIntField(term93114, term93114.getClass(), "sourcePosition", 0);
        setField(term93114, term93114.getClass(), "jsType", null);
        setField(term93114, term93114.getClass(), "parent", null);
        setField(term93112, term93112.getClass(), "first", term93114);
        setField(term93112, term93112.getClass(), "last", null);
        setField(term93112, term93112.getClass(), "propListHead", null);
        setIntField(term93112, term93112.getClass(), "sourcePosition", 0);
        setField(term93112, term93112.getClass(), "jsType", null);
        setField(term93112, term93112.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82344;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term82184, args);
        assertTrue(recursiveEquals(term82184, term93139));
        assertTrue(recursiveEquals(term82344, term93141));
        assertTrue(recursiveEquals(retValue, term93112));
    }

};


