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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class DeadAssignmentsElimination_enterScope_81513214613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term89;

    public DeadAssignmentsElimination_enterScope_81513214613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term75 = new HashMap();
        term72 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        Object term73 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term74 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term81 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72, term72.getClass(), "compiler", null);
        setField(term74, term74.getClass(), "vars", term75);
        setField(term81, term81.getClass(), "vars", null);
        setField(term81, term81.getClass(), "parent", null);
        setIntField(term81, term81.getClass(), "depth", 0);
        setField(term81, term81.getClass(), "rootNode", null);
        setField(term81, term81.getClass(), "thisType", null);
        setBooleanField(term81, term81.getClass(), "isBottom", false);
        setField(term74, term74.getClass(), "parent", term81);
        setIntField(term74, term74.getClass(), "depth", -469968304);
        setIntField(term85, term85.getClass(), "type", 0);
        setField(term85, term85.getClass(), "next", null);
        setField(term85, term85.getClass(), "first", null);
        setField(term85, term85.getClass(), "last", null);
        setField(term85, term85.getClass(), "propListHead", null);
        setIntField(term85, term85.getClass(), "sourcePosition", 0);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        setField(term74, term74.getClass(), "rootNode", term85);
        setField(term74, term74.getClass(), "thisType", null);
        setBooleanField(term74, term74.getClass(), "isBottom", false);
        setField(term73, term73.getClass(), "jsScope", term74);
        setField(term73, term73.getClass(), "escaped", null);
        setField(term73, term73.getClass(), "cfg", null);
        setField(term73, term73.getClass(), "joinOp", null);
        setField(term73, term73.getClass(), "orderedWorkSet", null);
        setField(term72, term72.getClass(), "liveness", term73);
        Object term107 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term107, term107.getClass(), "vars", null);
        setField(term107, term107.getClass(), "parent", null);
        setIntField(term107, term107.getClass(), "depth", 0);
        setField(term107, term107.getClass(), "rootNode", null);
        setField(term107, term107.getClass(), "thisType", null);
        setBooleanField(term107, term107.getClass(), "isBottom", false);
        Object term110 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term110, term110.getClass(), "vars", null);
        setField(term110, term110.getClass(), "parent", null);
        setIntField(term110, term110.getClass(), "depth", 0);
        setField(term110, term110.getClass(), "rootNode", null);
        setField(term110, term110.getClass(), "thisType", null);
        setBooleanField(term110, term110.getClass(), "isBottom", false);
        Object term113 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term113, term113.getClass(), "vars", null);
        setField(term113, term113.getClass(), "parent", null);
        setIntField(term113, term113.getClass(), "depth", 0);
        setField(term113, term113.getClass(), "rootNode", null);
        setField(term113, term113.getClass(), "thisType", null);
        setBooleanField(term113, term113.getClass(), "isBottom", false);
        ArrayDeque term105 = new ArrayDeque();
        ((ArrayDeque) term105).add(term107);
        ((ArrayDeque) term105).add(term110);
        ((ArrayDeque) term105).add(term113);
        Object term120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120, term120.getClass(), "type", 0);
        setField(term120, term120.getClass(), "next", null);
        setField(term120, term120.getClass(), "first", null);
        setField(term120, term120.getClass(), "last", null);
        setField(term120, term120.getClass(), "propListHead", null);
        setIntField(term120, term120.getClass(), "sourcePosition", 0);
        setField(term120, term120.getClass(), "jsType", null);
        setField(term120, term120.getClass(), "parent", null);
        Object term123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123, term123.getClass(), "type", 0);
        setField(term123, term123.getClass(), "next", null);
        setField(term123, term123.getClass(), "first", null);
        setField(term123, term123.getClass(), "last", null);
        setField(term123, term123.getClass(), "propListHead", null);
        setIntField(term123, term123.getClass(), "sourcePosition", 0);
        setField(term123, term123.getClass(), "jsType", null);
        setField(term123, term123.getClass(), "parent", null);
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126, term126.getClass(), "type", 0);
        setField(term126, term126.getClass(), "next", null);
        setField(term126, term126.getClass(), "first", null);
        setField(term126, term126.getClass(), "last", null);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        Object term129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129, term129.getClass(), "type", 0);
        setField(term129, term129.getClass(), "next", null);
        setField(term129, term129.getClass(), "first", null);
        setField(term129, term129.getClass(), "last", null);
        setField(term129, term129.getClass(), "propListHead", null);
        setIntField(term129, term129.getClass(), "sourcePosition", 0);
        setField(term129, term129.getClass(), "jsType", null);
        setField(term129, term129.getClass(), "parent", null);
        ArrayDeque term118 = new ArrayDeque();
        ((ArrayDeque) term118).add(term120);
        ((ArrayDeque) term118).add(term123);
        ((ArrayDeque) term118).add(term126);
        ((ArrayDeque) term118).add(term129);
        ArrayDeque term134 = new ArrayDeque();
        term89 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term89, term89.getClass(), "compiler", null);
        setField(term89, term89.getClass(), "callback", null);
        setIntField(term90, term90.getClass(), "type", 767834723);
        setIntField(term92, term92.getClass(), "type", 0);
        setField(term92, term92.getClass(), "next", null);
        setField(term92, term92.getClass(), "first", null);
        setField(term92, term92.getClass(), "last", null);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term90, term90.getClass(), "next", term92);
        setIntField(term95, term95.getClass(), "type", 0);
        setField(term95, term95.getClass(), "next", null);
        setField(term95, term95.getClass(), "first", null);
        setField(term95, term95.getClass(), "last", null);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term90, term90.getClass(), "first", term95);
        setIntField(term98, term98.getClass(), "type", 0);
        setField(term98, term98.getClass(), "next", null);
        setField(term98, term98.getClass(), "first", null);
        setField(term98, term98.getClass(), "last", null);
        setField(term98, term98.getClass(), "propListHead", null);
        setIntField(term98, term98.getClass(), "sourcePosition", 0);
        setField(term98, term98.getClass(), "jsType", null);
        setField(term98, term98.getClass(), "parent", null);
        setField(term90, term90.getClass(), "last", term98);
        setField(term101, term101.getClass(), "next", null);
        setIntField(term101, term101.getClass(), "type", 0);
        setIntField(term101, term101.getClass(), "intValue", 0);
        setField(term101, term101.getClass(), "objectValue", null);
        setField(term90, term90.getClass(), "propListHead", term101);
        setIntField(term90, term90.getClass(), "sourcePosition", -817164822);
        setField(term90, term90.getClass(), "jsType", null);
        setField(term90, term90.getClass(), "parent", null);
        setField(term89, term89.getClass(), "curNode", term90);
        setField(term89, term89.getClass(), "scopes", term105);
        setField(term89, term89.getClass(), "scopeRoots", term118);
        setField(term89, term89.getClass(), "cfgs", term134);
        setField(term89, term89.getClass(), "sourceName", "jJCZpVmanW");
        setField(term89, term89.getClass(), "scopeCreator", null);
        setField(term89, term89.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term89;
        try {
            callMethod(klass, "enterScope", argTypes, term72, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


