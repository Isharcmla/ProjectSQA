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
     Object term94;
     Object term115;

    public MakeDeclaredNamesUnique_exitScope_110285885613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term95 = new ArrayDeque();
        HashMap term101 = new HashMap();
        HashMap term109 = new HashMap();
        term94 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term99 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term100 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term108 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term94, term94.getClass(), "nameStack", term95);
        setField(term100, term100.getClass(), "backingMap", term101);
        setLongField(term100, term100.getClass(), "size", 0L);
        setField(term108, term108.getClass(), "this$0", term100);
        setField(term100, term100.getClass(), "entrySet", term108);
        setField(term100, term100.getClass(), "elementSet", null);
        setField(term99, term99.getClass(), "nameUsage", term100);
        setField(term99, term99.getClass(), "declarations", term109);
        setBooleanField(term99, term99.getClass(), "global", true);
        setField(term94, term94.getClass(), "rootRenamer", term99);
        Object term133 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term133, term133.getClass(), "vars", null);
        setField(term133, term133.getClass(), "parent", null);
        setField(term133, term133.getClass(), "rootNode", null);
        setField(term133, term133.getClass(), "thisType", null);
        setBooleanField(term133, term133.getClass(), "isBottom", false);
        Object term135 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term135, term135.getClass(), "vars", null);
        setField(term135, term135.getClass(), "parent", null);
        setField(term135, term135.getClass(), "rootNode", null);
        setField(term135, term135.getClass(), "thisType", null);
        setBooleanField(term135, term135.getClass(), "isBottom", false);
        Object term137 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term137, term137.getClass(), "vars", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term137, term137.getClass(), "rootNode", null);
        setField(term137, term137.getClass(), "thisType", null);
        setBooleanField(term137, term137.getClass(), "isBottom", false);
        Object term139 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term139, term139.getClass(), "vars", null);
        setField(term139, term139.getClass(), "parent", null);
        setField(term139, term139.getClass(), "rootNode", null);
        setField(term139, term139.getClass(), "thisType", null);
        setBooleanField(term139, term139.getClass(), "isBottom", false);
        ArrayDeque term131 = new ArrayDeque();
        ((ArrayDeque) term131).add(term133);
        ((ArrayDeque) term131).add(term135);
        ((ArrayDeque) term131).add(term137);
        ((ArrayDeque) term131).add(term139);
        Object term145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145, term145.getClass(), "type", 0);
        setField(term145, term145.getClass(), "next", null);
        setField(term145, term145.getClass(), "first", null);
        setField(term145, term145.getClass(), "last", null);
        setField(term145, term145.getClass(), "propListHead", null);
        setIntField(term145, term145.getClass(), "sourcePosition", 0);
        setField(term145, term145.getClass(), "jsType", null);
        setField(term145, term145.getClass(), "parent", null);
        ArrayDeque term143 = new ArrayDeque();
        ((ArrayDeque) term143).add(term145);
        ArrayDeque term150 = new ArrayDeque();
        term115 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term115, term115.getClass(), "compiler", null);
        setField(term115, term115.getClass(), "callback", null);
        setIntField(term116, term116.getClass(), "type", -522618178);
        setIntField(term118, term118.getClass(), "type", 0);
        setField(term118, term118.getClass(), "next", null);
        setField(term118, term118.getClass(), "first", null);
        setField(term118, term118.getClass(), "last", null);
        setField(term118, term118.getClass(), "propListHead", null);
        setIntField(term118, term118.getClass(), "sourcePosition", 0);
        setField(term118, term118.getClass(), "jsType", null);
        setField(term118, term118.getClass(), "parent", null);
        setField(term116, term116.getClass(), "next", term118);
        setIntField(term121, term121.getClass(), "type", 0);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "first", null);
        setField(term121, term121.getClass(), "last", null);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term116, term116.getClass(), "first", term121);
        setIntField(term124, term124.getClass(), "type", 0);
        setField(term124, term124.getClass(), "next", null);
        setField(term124, term124.getClass(), "first", null);
        setField(term124, term124.getClass(), "last", null);
        setField(term124, term124.getClass(), "propListHead", null);
        setIntField(term124, term124.getClass(), "sourcePosition", 0);
        setField(term124, term124.getClass(), "jsType", null);
        setField(term124, term124.getClass(), "parent", null);
        setField(term116, term116.getClass(), "last", term124);
        setField(term127, term127.getClass(), "next", null);
        setIntField(term127, term127.getClass(), "type", 0);
        setIntField(term127, term127.getClass(), "intValue", 0);
        setField(term127, term127.getClass(), "objectValue", null);
        setField(term116, term116.getClass(), "propListHead", term127);
        setIntField(term116, term116.getClass(), "sourcePosition", 597278769);
        setField(term116, term116.getClass(), "jsType", null);
        setField(term116, term116.getClass(), "parent", null);
        setField(term115, term115.getClass(), "curNode", term116);
        setField(term115, term115.getClass(), "scopes", term131);
        setField(term115, term115.getClass(), "scopeRoots", term143);
        setField(term115, term115.getClass(), "cfgs", term150);
        setField(term115, term115.getClass(), "sourceName", "sjlJAEtRrb");
        setField(term115, term115.getClass(), "scopeCreator", null);
        setField(term115, term115.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term115;
        try {
            callMethod(klass, "exitScope", argTypes, term94, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


