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
import java.util.NoSuchElementException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.HashMap;

public class MakeDeclaredNamesUnique_exitScope_110285885613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term118;

    public MakeDeclaredNamesUnique_exitScope_110285885613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term98 = new ArrayDeque();
        HashMap term104 = new HashMap();
        HashMap term112 = new HashMap();
        term97 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term102 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term103 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term111 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term97, term97.getClass(), "nameStack", term98);
        setField(term103, term103.getClass(), "backingMap", term104);
        setLongField(term103, term103.getClass(), "size", 0L);
        setField(term111, term111.getClass(), "this$0", term103);
        setField(term103, term103.getClass(), "entrySet", term111);
        setField(term103, term103.getClass(), "elementSet", null);
        setField(term102, term102.getClass(), "nameUsage", term103);
        setField(term102, term102.getClass(), "declarations", term112);
        setBooleanField(term102, term102.getClass(), "global", true);
        setField(term97, term97.getClass(), "rootRenamer", term102);
        Object term133 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term133, term133.getClass(), "vars", null);
        setField(term133, term133.getClass(), "parent", null);
        setIntField(term133, term133.getClass(), "depth", 0);
        setField(term133, term133.getClass(), "rootNode", null);
        setField(term133, term133.getClass(), "thisType", null);
        setBooleanField(term133, term133.getClass(), "isBottom", false);
        setField(term133, term133.getClass(), "arguments", null);
        Object term136 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term136, term136.getClass(), "vars", null);
        setField(term136, term136.getClass(), "parent", null);
        setIntField(term136, term136.getClass(), "depth", 0);
        setField(term136, term136.getClass(), "rootNode", null);
        setField(term136, term136.getClass(), "thisType", null);
        setBooleanField(term136, term136.getClass(), "isBottom", false);
        setField(term136, term136.getClass(), "arguments", null);
        Object term139 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term139, term139.getClass(), "vars", null);
        setField(term139, term139.getClass(), "parent", null);
        setIntField(term139, term139.getClass(), "depth", 0);
        setField(term139, term139.getClass(), "rootNode", null);
        setField(term139, term139.getClass(), "thisType", null);
        setBooleanField(term139, term139.getClass(), "isBottom", false);
        setField(term139, term139.getClass(), "arguments", null);
        Object term142 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term142, term142.getClass(), "vars", null);
        setField(term142, term142.getClass(), "parent", null);
        setIntField(term142, term142.getClass(), "depth", 0);
        setField(term142, term142.getClass(), "rootNode", null);
        setField(term142, term142.getClass(), "thisType", null);
        setBooleanField(term142, term142.getClass(), "isBottom", false);
        setField(term142, term142.getClass(), "arguments", null);
        ArrayDeque term131 = new ArrayDeque();
        ((ArrayDeque) term131).add(term133);
        ((ArrayDeque) term131).add(term136);
        ((ArrayDeque) term131).add(term139);
        ((ArrayDeque) term131).add(term142);
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term149, term149.getClass(), "type", 0);
        setField(term149, term149.getClass(), "next", null);
        setField(term149, term149.getClass(), "first", null);
        setField(term149, term149.getClass(), "last", null);
        setField(term149, term149.getClass(), "propListHead", null);
        setIntField(term149, term149.getClass(), "sourcePosition", 0);
        setField(term149, term149.getClass(), "jsType", null);
        setField(term149, term149.getClass(), "parent", null);
        ArrayDeque term147 = new ArrayDeque();
        ((ArrayDeque) term147).add(term149);
        ArrayDeque term154 = new ArrayDeque();
        term118 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        setField(term118, term118.getClass(), "compiler", null);
        setField(term118, term118.getClass(), "callback", null);
        setIntField(term119, term119.getClass(), "type", 1725571209);
        setIntField(term121, term121.getClass(), "type", 0);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "first", null);
        setField(term121, term121.getClass(), "last", null);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term119, term119.getClass(), "next", term121);
        setIntField(term124, term124.getClass(), "type", 0);
        setField(term124, term124.getClass(), "next", null);
        setField(term124, term124.getClass(), "first", null);
        setField(term124, term124.getClass(), "last", null);
        setField(term124, term124.getClass(), "propListHead", null);
        setIntField(term124, term124.getClass(), "sourcePosition", 0);
        setField(term124, term124.getClass(), "jsType", null);
        setField(term124, term124.getClass(), "parent", null);
        setField(term119, term119.getClass(), "first", term124);
        setIntField(term127, term127.getClass(), "type", 0);
        setField(term127, term127.getClass(), "next", null);
        setField(term127, term127.getClass(), "first", null);
        setField(term127, term127.getClass(), "last", null);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        setField(term119, term119.getClass(), "last", term127);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term118, term118.getClass(), "curNode", term119);
        setField(term118, term118.getClass(), "scopes", term131);
        setField(term118, term118.getClass(), "scopeRoots", term147);
        setField(term118, term118.getClass(), "cfgs", term154);
        setField(term118, term118.getClass(), "sourceName", "sjlJAEtRrb");
        setField(term170, term170.getClass(), "id", null);
        setField(term118, term118.getClass(), "inputId", term170);
        setField(term118, term118.getClass(), "scopeCreator", null);
        setField(term118, term118.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term118;
        try {
            callMethod(klass, "exitScope", argTypes, term97, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


