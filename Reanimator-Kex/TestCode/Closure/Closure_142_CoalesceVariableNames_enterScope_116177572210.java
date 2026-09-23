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
import java.util.ArrayDeque;
import java.lang.Object;

public class CoalesceVariableNames_enterScope_116177572210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term69;

    public CoalesceVariableNames_enterScope_116177572210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term64 = new ArrayDeque();
        term63 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term63, term63.getClass(), "compiler", null);
        setField(term63, term63.getClass(), "colorings", term64);
        setBooleanField(term63, term63.getClass(), "usePseudoNames", false);
        Object term87 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term87, term87.getClass(), "vars", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term87, term87.getClass(), "rootNode", null);
        setField(term87, term87.getClass(), "thisType", null);
        setBooleanField(term87, term87.getClass(), "isBottom", false);
        Object term89 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term89, term89.getClass(), "vars", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term89, term89.getClass(), "rootNode", null);
        setField(term89, term89.getClass(), "thisType", null);
        setBooleanField(term89, term89.getClass(), "isBottom", false);
        Object term91 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term91, term91.getClass(), "vars", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term91, term91.getClass(), "rootNode", null);
        setField(term91, term91.getClass(), "thisType", null);
        setBooleanField(term91, term91.getClass(), "isBottom", false);
        ArrayDeque term85 = new ArrayDeque();
        ((ArrayDeque) term85).add(term87);
        ((ArrayDeque) term85).add(term89);
        ((ArrayDeque) term85).add(term91);
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97, term97.getClass(), "type", 0);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "first", null);
        setField(term97, term97.getClass(), "last", null);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100, term100.getClass(), "type", 0);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", null);
        setField(term100, term100.getClass(), "last", null);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103, term103.getClass(), "type", 0);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "first", null);
        setField(term103, term103.getClass(), "last", null);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106, term106.getClass(), "type", 0);
        setField(term106, term106.getClass(), "next", null);
        setField(term106, term106.getClass(), "first", null);
        setField(term106, term106.getClass(), "last", null);
        setField(term106, term106.getClass(), "propListHead", null);
        setIntField(term106, term106.getClass(), "sourcePosition", 0);
        setField(term106, term106.getClass(), "jsType", null);
        setField(term106, term106.getClass(), "parent", null);
        ArrayDeque term95 = new ArrayDeque();
        ((ArrayDeque) term95).add(term97);
        ((ArrayDeque) term95).add(term100);
        ((ArrayDeque) term95).add(term103);
        ((ArrayDeque) term95).add(term106);
        ArrayDeque term111 = new ArrayDeque();
        term69 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term69, term69.getClass(), "compiler", null);
        setField(term69, term69.getClass(), "callback", null);
        setIntField(term70, term70.getClass(), "type", 865208305);
        setIntField(term72, term72.getClass(), "type", 0);
        setField(term72, term72.getClass(), "next", null);
        setField(term72, term72.getClass(), "first", null);
        setField(term72, term72.getClass(), "last", null);
        setField(term72, term72.getClass(), "propListHead", null);
        setIntField(term72, term72.getClass(), "sourcePosition", 0);
        setField(term72, term72.getClass(), "jsType", null);
        setField(term72, term72.getClass(), "parent", null);
        setField(term70, term70.getClass(), "next", term72);
        setIntField(term75, term75.getClass(), "type", 0);
        setField(term75, term75.getClass(), "next", null);
        setField(term75, term75.getClass(), "first", null);
        setField(term75, term75.getClass(), "last", null);
        setField(term75, term75.getClass(), "propListHead", null);
        setIntField(term75, term75.getClass(), "sourcePosition", 0);
        setField(term75, term75.getClass(), "jsType", null);
        setField(term75, term75.getClass(), "parent", null);
        setField(term70, term70.getClass(), "first", term75);
        setIntField(term78, term78.getClass(), "type", 0);
        setField(term78, term78.getClass(), "next", null);
        setField(term78, term78.getClass(), "first", null);
        setField(term78, term78.getClass(), "last", null);
        setField(term78, term78.getClass(), "propListHead", null);
        setIntField(term78, term78.getClass(), "sourcePosition", 0);
        setField(term78, term78.getClass(), "jsType", null);
        setField(term78, term78.getClass(), "parent", null);
        setField(term70, term70.getClass(), "last", term78);
        setField(term81, term81.getClass(), "next", null);
        setIntField(term81, term81.getClass(), "type", 0);
        setIntField(term81, term81.getClass(), "intValue", 0);
        setField(term81, term81.getClass(), "objectValue", null);
        setField(term70, term70.getClass(), "propListHead", term81);
        setIntField(term70, term70.getClass(), "sourcePosition", -1179120542);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term69, term69.getClass(), "curNode", term70);
        setField(term69, term69.getClass(), "scopes", term85);
        setField(term69, term69.getClass(), "scopeRoots", term95);
        setField(term69, term69.getClass(), "cfgs", term111);
        setField(term69, term69.getClass(), "sourceName", "PAEBtnZtTD");
        setField(term69, term69.getClass(), "scopeCreator", null);
        setField(term69, term69.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term69;
        try {
            callMethod(klass, "enterScope", argTypes, term63, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


