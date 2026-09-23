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
        Object term40 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term40, term40.getClass(), "vars", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term40, term40.getClass(), "rootNode", null);
        setField(term40, term40.getClass(), "thisType", null);
        setBooleanField(term40, term40.getClass(), "isBottom", false);
        Object term42 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term42, term42.getClass(), "vars", null);
        setField(term42, term42.getClass(), "parent", null);
        setField(term42, term42.getClass(), "rootNode", null);
        setField(term42, term42.getClass(), "thisType", null);
        setBooleanField(term42, term42.getClass(), "isBottom", false);
        Object term44 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term44, term44.getClass(), "vars", null);
        setField(term44, term44.getClass(), "parent", null);
        setField(term44, term44.getClass(), "rootNode", null);
        setField(term44, term44.getClass(), "thisType", null);
        setBooleanField(term44, term44.getClass(), "isBottom", false);
        Object term46 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term46, term46.getClass(), "vars", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term46, term46.getClass(), "rootNode", null);
        setField(term46, term46.getClass(), "thisType", null);
        setBooleanField(term46, term46.getClass(), "isBottom", false);
        Object term48 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term48, term48.getClass(), "vars", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term48, term48.getClass(), "rootNode", null);
        setField(term48, term48.getClass(), "thisType", null);
        setBooleanField(term48, term48.getClass(), "isBottom", false);
        ArrayDeque term38 = new ArrayDeque();
        ((ArrayDeque) term38).add(term40);
        ((ArrayDeque) term38).add(term42);
        ((ArrayDeque) term38).add(term44);
        ((ArrayDeque) term38).add(term46);
        ((ArrayDeque) term38).add(term48);
        Object term54 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54, term54.getClass(), "type", 0);
        setField(term54, term54.getClass(), "next", null);
        setField(term54, term54.getClass(), "first", null);
        setField(term54, term54.getClass(), "last", null);
        setField(term54, term54.getClass(), "propListHead", null);
        setIntField(term54, term54.getClass(), "sourcePosition", 0);
        setField(term54, term54.getClass(), "jsType", null);
        setField(term54, term54.getClass(), "parent", null);
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57, term57.getClass(), "type", 0);
        setField(term57, term57.getClass(), "next", null);
        setField(term57, term57.getClass(), "first", null);
        setField(term57, term57.getClass(), "last", null);
        setField(term57, term57.getClass(), "propListHead", null);
        setIntField(term57, term57.getClass(), "sourcePosition", 0);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60, term60.getClass(), "type", 0);
        setField(term60, term60.getClass(), "next", null);
        setField(term60, term60.getClass(), "first", null);
        setField(term60, term60.getClass(), "last", null);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        Object term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63, term63.getClass(), "type", 0);
        setField(term63, term63.getClass(), "next", null);
        setField(term63, term63.getClass(), "first", null);
        setField(term63, term63.getClass(), "last", null);
        setField(term63, term63.getClass(), "propListHead", null);
        setIntField(term63, term63.getClass(), "sourcePosition", 0);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
        ArrayDeque term52 = new ArrayDeque();
        ((ArrayDeque) term52).add(term54);
        ((ArrayDeque) term52).add(term57);
        ((ArrayDeque) term52).add(term60);
        ((ArrayDeque) term52).add(term63);
        ArrayDeque term68 = new ArrayDeque();
        term22 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
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
        setField(term34, term34.getClass(), "next", null);
        setIntField(term34, term34.getClass(), "type", 0);
        setIntField(term34, term34.getClass(), "intValue", 0);
        setField(term34, term34.getClass(), "objectValue", null);
        setField(term23, term23.getClass(), "propListHead", term34);
        setIntField(term23, term23.getClass(), "sourcePosition", -2038273078);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term22, term22.getClass(), "curNode", term23);
        setField(term22, term22.getClass(), "scopes", term38);
        setField(term22, term22.getClass(), "scopeRoots", term52);
        setField(term22, term22.getClass(), "cfgs", term68);
        setField(term22, term22.getClass(), "sourceName", "PAEBtnZtTD");
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


