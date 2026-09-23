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

public class PeepholeFoldConstants_tryReduceVoid_94254671579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13500;
     Object term13660;
     Object term14141;
     Object term14143;
     Object term14114;

    public PeepholeFoldConstants_tryReduceVoid_94254671579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13500 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13590 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term13590, term13590.getClass(), "compiler", null);
        setField(term13500, term13500.getClass(), "currentTraversal", term13590);
        term13660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13730, term13730.getClass(), "type", 113);
        setField(term13660, term13660.getClass(), "first", term13730);
        setIntField(term13660, term13660.getClass(), "type", 113);
        term14141 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term14142 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term14142, term14142.getClass(), "compiler", null);
        setField(term14142, term14142.getClass(), "callback", null);
        setField(term14142, term14142.getClass(), "curNode", null);
        setField(term14142, term14142.getClass(), "scopes", null);
        setField(term14142, term14142.getClass(), "scopeRoots", null);
        setField(term14142, term14142.getClass(), "cfgs", null);
        setField(term14142, term14142.getClass(), "sourceName", null);
        setField(term14142, term14142.getClass(), "scopeCreator", null);
        setField(term14142, term14142.getClass(), "scopeCallback", null);
        setField(term14141, term14141.getClass(), "currentTraversal", term14142);
        term14143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14143, term14143.getClass(), "type", 113);
        setField(term14143, term14143.getClass(), "next", null);
        setIntField(term14144, term14144.getClass(), "type", 113);
        setField(term14144, term14144.getClass(), "next", null);
        setField(term14144, term14144.getClass(), "first", null);
        setField(term14144, term14144.getClass(), "last", null);
        setField(term14144, term14144.getClass(), "propListHead", null);
        setIntField(term14144, term14144.getClass(), "sourcePosition", 0);
        setField(term14144, term14144.getClass(), "jsType", null);
        setField(term14144, term14144.getClass(), "parent", null);
        setField(term14143, term14143.getClass(), "first", term14144);
        setField(term14143, term14143.getClass(), "last", null);
        setField(term14143, term14143.getClass(), "propListHead", null);
        setIntField(term14143, term14143.getClass(), "sourcePosition", 0);
        setField(term14143, term14143.getClass(), "jsType", null);
        setField(term14143, term14143.getClass(), "parent", null);
        term14114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14114, term14114.getClass(), "type", 113);
        setField(term14114, term14114.getClass(), "next", null);
        setIntField(term14116, term14116.getClass(), "type", 113);
        setField(term14116, term14116.getClass(), "next", null);
        setField(term14116, term14116.getClass(), "first", null);
        setField(term14116, term14116.getClass(), "last", null);
        setField(term14116, term14116.getClass(), "propListHead", null);
        setIntField(term14116, term14116.getClass(), "sourcePosition", 0);
        setField(term14116, term14116.getClass(), "jsType", null);
        setField(term14116, term14116.getClass(), "parent", null);
        setField(term14114, term14114.getClass(), "first", term14116);
        setField(term14114, term14114.getClass(), "last", null);
        setField(term14114, term14114.getClass(), "propListHead", null);
        setIntField(term14114, term14114.getClass(), "sourcePosition", 0);
        setField(term14114, term14114.getClass(), "jsType", null);
        setField(term14114, term14114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13660;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term13500, args);
        assertTrue(recursiveEquals(term13500, term14141));
        assertTrue(recursiveEquals(term13660, term14143));
        assertTrue(recursiveEquals(retValue, term14114));
    }

};


