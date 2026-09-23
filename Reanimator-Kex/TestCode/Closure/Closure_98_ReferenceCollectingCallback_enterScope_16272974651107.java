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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_enterScope_16272974651107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315045;
     Object term315627;
     Object term316174;
     Object term316181;

    public ReferenceCollectingCallback_enterScope_16272974651107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term315291 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term315770 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term315813 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term315856 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term315813, term315813.getClass(), "type", 105);
        setIntField(term315856, term315856.getClass(), "type", 132);
        setField(term315813, term315813.getClass(), "parent", term315856);
        setField(term315770, term315770.getClass(), "rootNode", term315813);
        ArrayList term315151 = new ArrayList();
        ((ArrayList) term315151).add(term315291);
        ((ArrayList) term315151).add(term315770);
        ((ArrayList) term315151).add(term315770);
        ((ArrayList) term315151).add(term315770);
        ArrayDeque term315099 = new ArrayDeque((Collection<? extends Object>) term315151);
        term315045 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term315045, term315045.getClass(), "blockStack", term315099);
        ArrayList term315733 = new ArrayList();
        ((ArrayList) term315733).add(term315770);
        ((ArrayList) term315733).add(term315770);
        ((ArrayList) term315733).add(term315770);
        ((ArrayList) term315733).add(term315770);
        ArrayDeque term315681 = new ArrayDeque((Collection<? extends Object>) term315733);
        ArrayList term315962 = new ArrayList();
        ArrayDeque term315910 = new ArrayDeque((Collection<? extends Object>) term315962);
        term315627 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term315627, term315627.getClass(), "scopes", term315681);
        setField(term315627, term315627.getClass(), "scopeRoots", term315910);
        ArrayDeque term316175 = new ArrayDeque();
        term316174 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term316174, term316174.getClass(), "referenceMap", null);
        setField(term316174, term316174.getClass(), "blockStack", term316175);
        setField(term316174, term316174.getClass(), "behavior", null);
        setField(term316174, term316174.getClass(), "compiler", null);
        setField(term316174, term316174.getClass(), "varFilter", null);
        Object term316184 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term316185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term316184, term316184.getClass(), "vars", null);
        setField(term316184, term316184.getClass(), "parent", null);
        setField(term316185, term316185.getClass(), "functionName", null);
        setBooleanField(term316185, term316185.getClass(), "itsNeedsActivation", false);
        setIntField(term316185, term316185.getClass(), "itsFunctionType", 0);
        setBooleanField(term316185, term316185.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term316185, term316185.getClass(), "encodedSourceStart", 0);
        setIntField(term316185, term316185.getClass(), "encodedSourceEnd", 0);
        setField(term316185, term316185.getClass(), "sourceName", null);
        setIntField(term316185, term316185.getClass(), "baseLineno", 0);
        setIntField(term316185, term316185.getClass(), "endLineno", 0);
        setField(term316185, term316185.getClass(), "functions", null);
        setField(term316185, term316185.getClass(), "regexps", null);
        setField(term316185, term316185.getClass(), "itsVariables", null);
        setField(term316185, term316185.getClass(), "itsConst", null);
        setField(term316185, term316185.getClass(), "itsVariableNames", null);
        setIntField(term316185, term316185.getClass(), "varStart", 0);
        setField(term316185, term316185.getClass(), "compilerData", null);
        setIntField(term316185, term316185.getClass(), "type", 105);
        setField(term316185, term316185.getClass(), "next", null);
        setField(term316185, term316185.getClass(), "first", null);
        setField(term316185, term316185.getClass(), "last", null);
        setField(term316185, term316185.getClass(), "propListHead", null);
        setIntField(term316185, term316185.getClass(), "sourcePosition", 0);
        setField(term316185, term316185.getClass(), "jsType", null);
        setField(term316185, term316185.getClass(), "parent", null);
        setField(term316184, term316184.getClass(), "rootNode", term316185);
        setField(term316184, term316184.getClass(), "thisType", null);
        setBooleanField(term316184, term316184.getClass(), "isBottom", false);
        ArrayDeque term316182 = new ArrayDeque();
        ((ArrayDeque) term316182).add(term316184);
        ((ArrayDeque) term316182).add(term316184);
        ((ArrayDeque) term316182).add(term316184);
        ((ArrayDeque) term316182).add(term316184);
        ArrayDeque term316186 = new ArrayDeque();
        term316181 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term316181, term316181.getClass(), "compiler", null);
        setField(term316181, term316181.getClass(), "callback", null);
        setField(term316181, term316181.getClass(), "curNode", null);
        setField(term316181, term316181.getClass(), "scopes", term316182);
        setField(term316181, term316181.getClass(), "scopeRoots", term316186);
        setField(term316181, term316181.getClass(), "cfgs", null);
        setField(term316181, term316181.getClass(), "sourceName", null);
        setField(term316181, term316181.getClass(), "scopeCreator", null);
        setField(term316181, term316181.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term315627;
        callMethod(klass, "enterScope", argTypes, term315045, args);
        assertTrue(recursiveEquals(term315045, term316174));
        assertTrue(recursiveEquals(term315627, term316181));
    }

};


