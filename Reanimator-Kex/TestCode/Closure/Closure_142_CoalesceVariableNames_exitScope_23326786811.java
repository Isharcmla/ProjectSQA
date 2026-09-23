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

public class CoalesceVariableNames_exitScope_23326786811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term143;

    public CoalesceVariableNames_exitScope_23326786811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term138 = new ArrayDeque();
        term137 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term137, term137.getClass(), "compiler", null);
        setField(term137, term137.getClass(), "colorings", term138);
        setBooleanField(term137, term137.getClass(), "usePseudoNames", false);
        Object term161 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term161, term161.getClass(), "vars", null);
        setField(term161, term161.getClass(), "parent", null);
        setField(term161, term161.getClass(), "rootNode", null);
        setField(term161, term161.getClass(), "thisType", null);
        setBooleanField(term161, term161.getClass(), "isBottom", false);
        Object term163 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term163, term163.getClass(), "vars", null);
        setField(term163, term163.getClass(), "parent", null);
        setField(term163, term163.getClass(), "rootNode", null);
        setField(term163, term163.getClass(), "thisType", null);
        setBooleanField(term163, term163.getClass(), "isBottom", false);
        ArrayDeque term159 = new ArrayDeque();
        ((ArrayDeque) term159).add(term161);
        ((ArrayDeque) term159).add(term163);
        Object term169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term169, term169.getClass(), "type", 0);
        setField(term169, term169.getClass(), "next", null);
        setField(term169, term169.getClass(), "first", null);
        setField(term169, term169.getClass(), "last", null);
        setField(term169, term169.getClass(), "propListHead", null);
        setIntField(term169, term169.getClass(), "sourcePosition", 0);
        setField(term169, term169.getClass(), "jsType", null);
        setField(term169, term169.getClass(), "parent", null);
        Object term172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term172, term172.getClass(), "type", 0);
        setField(term172, term172.getClass(), "next", null);
        setField(term172, term172.getClass(), "first", null);
        setField(term172, term172.getClass(), "last", null);
        setField(term172, term172.getClass(), "propListHead", null);
        setIntField(term172, term172.getClass(), "sourcePosition", 0);
        setField(term172, term172.getClass(), "jsType", null);
        setField(term172, term172.getClass(), "parent", null);
        Object term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term175, term175.getClass(), "type", 0);
        setField(term175, term175.getClass(), "next", null);
        setField(term175, term175.getClass(), "first", null);
        setField(term175, term175.getClass(), "last", null);
        setField(term175, term175.getClass(), "propListHead", null);
        setIntField(term175, term175.getClass(), "sourcePosition", 0);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
        Object term178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178, term178.getClass(), "type", 0);
        setField(term178, term178.getClass(), "next", null);
        setField(term178, term178.getClass(), "first", null);
        setField(term178, term178.getClass(), "last", null);
        setField(term178, term178.getClass(), "propListHead", null);
        setIntField(term178, term178.getClass(), "sourcePosition", 0);
        setField(term178, term178.getClass(), "jsType", null);
        setField(term178, term178.getClass(), "parent", null);
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term181, term181.getClass(), "type", 0);
        setField(term181, term181.getClass(), "next", null);
        setField(term181, term181.getClass(), "first", null);
        setField(term181, term181.getClass(), "last", null);
        setField(term181, term181.getClass(), "propListHead", null);
        setIntField(term181, term181.getClass(), "sourcePosition", 0);
        setField(term181, term181.getClass(), "jsType", null);
        setField(term181, term181.getClass(), "parent", null);
        Object term184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184, term184.getClass(), "type", 0);
        setField(term184, term184.getClass(), "next", null);
        setField(term184, term184.getClass(), "first", null);
        setField(term184, term184.getClass(), "last", null);
        setField(term184, term184.getClass(), "propListHead", null);
        setIntField(term184, term184.getClass(), "sourcePosition", 0);
        setField(term184, term184.getClass(), "jsType", null);
        setField(term184, term184.getClass(), "parent", null);
        ArrayDeque term167 = new ArrayDeque();
        ((ArrayDeque) term167).add(term169);
        ((ArrayDeque) term167).add(term172);
        ((ArrayDeque) term167).add(term175);
        ((ArrayDeque) term167).add(term178);
        ((ArrayDeque) term167).add(term181);
        ((ArrayDeque) term167).add(term184);
        ArrayDeque term189 = new ArrayDeque();
        term143 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term143, term143.getClass(), "compiler", null);
        setField(term143, term143.getClass(), "callback", null);
        setIntField(term144, term144.getClass(), "type", -1087774327);
        setIntField(term146, term146.getClass(), "type", 0);
        setField(term146, term146.getClass(), "next", null);
        setField(term146, term146.getClass(), "first", null);
        setField(term146, term146.getClass(), "last", null);
        setField(term146, term146.getClass(), "propListHead", null);
        setIntField(term146, term146.getClass(), "sourcePosition", 0);
        setField(term146, term146.getClass(), "jsType", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term144, term144.getClass(), "next", term146);
        setIntField(term149, term149.getClass(), "type", 0);
        setField(term149, term149.getClass(), "next", null);
        setField(term149, term149.getClass(), "first", null);
        setField(term149, term149.getClass(), "last", null);
        setField(term149, term149.getClass(), "propListHead", null);
        setIntField(term149, term149.getClass(), "sourcePosition", 0);
        setField(term149, term149.getClass(), "jsType", null);
        setField(term149, term149.getClass(), "parent", null);
        setField(term144, term144.getClass(), "first", term149);
        setIntField(term152, term152.getClass(), "type", 0);
        setField(term152, term152.getClass(), "next", null);
        setField(term152, term152.getClass(), "first", null);
        setField(term152, term152.getClass(), "last", null);
        setField(term152, term152.getClass(), "propListHead", null);
        setIntField(term152, term152.getClass(), "sourcePosition", 0);
        setField(term152, term152.getClass(), "jsType", null);
        setField(term152, term152.getClass(), "parent", null);
        setField(term144, term144.getClass(), "last", term152);
        setField(term155, term155.getClass(), "next", null);
        setIntField(term155, term155.getClass(), "type", 0);
        setIntField(term155, term155.getClass(), "intValue", 0);
        setField(term155, term155.getClass(), "objectValue", null);
        setField(term144, term144.getClass(), "propListHead", term155);
        setIntField(term144, term144.getClass(), "sourcePosition", 679763016);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term143, term143.getClass(), "curNode", term144);
        setField(term143, term143.getClass(), "scopes", term159);
        setField(term143, term143.getClass(), "scopeRoots", term167);
        setField(term143, term143.getClass(), "cfgs", term189);
        setField(term143, term143.getClass(), "sourceName", "sjlJAEtRrb");
        setField(term143, term143.getClass(), "scopeCreator", null);
        setField(term143, term143.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term143;
        try {
            callMethod(klass, "exitScope", argTypes, term137, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


