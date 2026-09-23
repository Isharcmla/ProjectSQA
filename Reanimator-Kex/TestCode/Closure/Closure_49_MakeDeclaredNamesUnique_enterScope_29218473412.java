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
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.HashMap;

public class MakeDeclaredNamesUnique_enterScope_29218473412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term22;

    public MakeDeclaredNamesUnique_enterScope_29218473412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2 = new ArrayDeque();
        HashMap term8 = new HashMap();
        HashMap term16 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term6 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term7 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term15 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term1, term1.getClass(), "nameStack", term2);
        setField(term7, term7.getClass(), "backingMap", term8);
        setLongField(term7, term7.getClass(), "size", 0L);
        setField(term15, term15.getClass(), "this$0", term7);
        setField(term7, term7.getClass(), "entrySet", term15);
        setField(term7, term7.getClass(), "elementSet", null);
        setField(term6, term6.getClass(), "nameUsage", term7);
        setField(term6, term6.getClass(), "declarations", term16);
        setBooleanField(term6, term6.getClass(), "global", true);
        setField(term1, term1.getClass(), "rootRenamer", term6);
        Object term37 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term37, term37.getClass(), "vars", null);
        setField(term37, term37.getClass(), "parent", null);
        setIntField(term37, term37.getClass(), "depth", 0);
        setField(term37, term37.getClass(), "rootNode", null);
        setField(term37, term37.getClass(), "thisType", null);
        setBooleanField(term37, term37.getClass(), "isBottom", false);
        setField(term37, term37.getClass(), "arguments", null);
        Object term40 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term40, term40.getClass(), "vars", null);
        setField(term40, term40.getClass(), "parent", null);
        setIntField(term40, term40.getClass(), "depth", 0);
        setField(term40, term40.getClass(), "rootNode", null);
        setField(term40, term40.getClass(), "thisType", null);
        setBooleanField(term40, term40.getClass(), "isBottom", false);
        setField(term40, term40.getClass(), "arguments", null);
        Object term43 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term43, term43.getClass(), "vars", null);
        setField(term43, term43.getClass(), "parent", null);
        setIntField(term43, term43.getClass(), "depth", 0);
        setField(term43, term43.getClass(), "rootNode", null);
        setField(term43, term43.getClass(), "thisType", null);
        setBooleanField(term43, term43.getClass(), "isBottom", false);
        setField(term43, term43.getClass(), "arguments", null);
        Object term46 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term46, term46.getClass(), "vars", null);
        setField(term46, term46.getClass(), "parent", null);
        setIntField(term46, term46.getClass(), "depth", 0);
        setField(term46, term46.getClass(), "rootNode", null);
        setField(term46, term46.getClass(), "thisType", null);
        setBooleanField(term46, term46.getClass(), "isBottom", false);
        setField(term46, term46.getClass(), "arguments", null);
        Object term49 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term49, term49.getClass(), "vars", null);
        setField(term49, term49.getClass(), "parent", null);
        setIntField(term49, term49.getClass(), "depth", 0);
        setField(term49, term49.getClass(), "rootNode", null);
        setField(term49, term49.getClass(), "thisType", null);
        setBooleanField(term49, term49.getClass(), "isBottom", false);
        setField(term49, term49.getClass(), "arguments", null);
        ArrayDeque term35 = new ArrayDeque();
        ((ArrayDeque) term35).add(term37);
        ((ArrayDeque) term35).add(term40);
        ((ArrayDeque) term35).add(term43);
        ((ArrayDeque) term35).add(term46);
        ((ArrayDeque) term35).add(term49);
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56, term56.getClass(), "type", 0);
        setField(term56, term56.getClass(), "next", null);
        setField(term56, term56.getClass(), "first", null);
        setField(term56, term56.getClass(), "last", null);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62, term62.getClass(), "type", 0);
        setField(term62, term62.getClass(), "next", null);
        setField(term62, term62.getClass(), "first", null);
        setField(term62, term62.getClass(), "last", null);
        setField(term62, term62.getClass(), "propListHead", null);
        setIntField(term62, term62.getClass(), "sourcePosition", 0);
        setField(term62, term62.getClass(), "jsType", null);
        setField(term62, term62.getClass(), "parent", null);
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65, term65.getClass(), "type", 0);
        setField(term65, term65.getClass(), "next", null);
        setField(term65, term65.getClass(), "first", null);
        setField(term65, term65.getClass(), "last", null);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        ArrayDeque term54 = new ArrayDeque();
        ((ArrayDeque) term54).add(term56);
        ((ArrayDeque) term54).add(term59);
        ((ArrayDeque) term54).add(term62);
        ((ArrayDeque) term54).add(term65);
        ArrayDeque term70 = new ArrayDeque();
        term22 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        setField(term22, term22.getClass(), "compiler", null);
        setField(term22, term22.getClass(), "callback", null);
        setIntField(term23, term23.getClass(), "type", 391863371);
        setIntField(term25, term25.getClass(), "type", 0);
        setField(term25, term25.getClass(), "next", null);
        setField(term25, term25.getClass(), "first", null);
        setField(term25, term25.getClass(), "last", null);
        setField(term25, term25.getClass(), "propListHead", null);
        setIntField(term25, term25.getClass(), "sourcePosition", 0);
        setField(term25, term25.getClass(), "jsType", null);
        setField(term25, term25.getClass(), "parent", null);
        setField(term23, term23.getClass(), "next", term25);
        setIntField(term28, term28.getClass(), "type", 0);
        setField(term28, term28.getClass(), "next", null);
        setField(term28, term28.getClass(), "first", null);
        setField(term28, term28.getClass(), "last", null);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        setField(term23, term23.getClass(), "first", term28);
        setIntField(term31, term31.getClass(), "type", 0);
        setField(term31, term31.getClass(), "next", null);
        setField(term31, term31.getClass(), "first", null);
        setField(term31, term31.getClass(), "last", null);
        setField(term31, term31.getClass(), "propListHead", null);
        setIntField(term31, term31.getClass(), "sourcePosition", 0);
        setField(term31, term31.getClass(), "jsType", null);
        setField(term31, term31.getClass(), "parent", null);
        setField(term23, term23.getClass(), "last", term31);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term22, term22.getClass(), "curNode", term23);
        setField(term22, term22.getClass(), "scopes", term35);
        setField(term22, term22.getClass(), "scopeRoots", term54);
        setField(term22, term22.getClass(), "cfgs", term70);
        setField(term22, term22.getClass(), "sourceName", "PAEBtnZtTD");
        setField(term86, term86.getClass(), "id", null);
        setField(term22, term22.getClass(), "inputId", term86);
        setField(term22, term22.getClass(), "scopeCreator", null);
        setField(term22, term22.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term22;
        try {
            callMethod(klass, "enterScope", argTypes, term1, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


