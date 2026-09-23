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

public class ReferenceCollectingCallback_enterScope_16272974651238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372525;
     Object term372861;
     Object term374624;
     Object term374629;

    public ReferenceCollectingCallback_enterScope_16272974651238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term372771 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        ArrayList term372631 = new ArrayList();
        ((ArrayList) term372631).add(term372771);
        ArrayDeque term372579 = new ArrayDeque((Collection<? extends Object>) term372631);
        term372525 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term372525, term372525.getClass(), "blockStack", term372579);
        Object term373041 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term373127 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term373213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term373127, term373127.getClass(), "type", 105);
        setIntField(term373213, term373213.getClass(), "type", 132);
        setField(term373127, term373127.getClass(), "parent", term373213);
        setField(term373041, term373041.getClass(), "rootNode", term373127);
        ArrayList term372967 = new ArrayList();
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ((ArrayList) term372967).add(term373041);
        ArrayDeque term372915 = new ArrayDeque((Collection<? extends Object>) term372967);
        ArrayList term373319 = new ArrayList();
        ArrayDeque term373267 = new ArrayDeque((Collection<? extends Object>) term373319);
        term372861 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term372861, term372861.getClass(), "scopes", term372915);
        setField(term372861, term372861.getClass(), "scopeRoots", term373267);
        ArrayDeque term374625 = new ArrayDeque();
        term374624 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term374624, term374624.getClass(), "referenceMap", null);
        setField(term374624, term374624.getClass(), "blockStack", term374625);
        setField(term374624, term374624.getClass(), "behavior", null);
        setField(term374624, term374624.getClass(), "compiler", null);
        setField(term374624, term374624.getClass(), "varFilter", null);
        Object term374632 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term374633 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term374632, term374632.getClass(), "vars", null);
        setField(term374632, term374632.getClass(), "parent", null);
        setField(term374633, term374633.getClass(), "functionName", null);
        setBooleanField(term374633, term374633.getClass(), "itsNeedsActivation", false);
        setIntField(term374633, term374633.getClass(), "itsFunctionType", 0);
        setBooleanField(term374633, term374633.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term374633, term374633.getClass(), "encodedSourceStart", 0);
        setIntField(term374633, term374633.getClass(), "encodedSourceEnd", 0);
        setField(term374633, term374633.getClass(), "sourceName", null);
        setIntField(term374633, term374633.getClass(), "baseLineno", 0);
        setIntField(term374633, term374633.getClass(), "endLineno", 0);
        setField(term374633, term374633.getClass(), "functions", null);
        setField(term374633, term374633.getClass(), "regexps", null);
        setField(term374633, term374633.getClass(), "itsVariables", null);
        setField(term374633, term374633.getClass(), "itsConst", null);
        setField(term374633, term374633.getClass(), "itsVariableNames", null);
        setIntField(term374633, term374633.getClass(), "varStart", 0);
        setField(term374633, term374633.getClass(), "compilerData", null);
        setIntField(term374633, term374633.getClass(), "type", 105);
        setField(term374633, term374633.getClass(), "next", null);
        setField(term374633, term374633.getClass(), "first", null);
        setField(term374633, term374633.getClass(), "last", null);
        setField(term374633, term374633.getClass(), "propListHead", null);
        setIntField(term374633, term374633.getClass(), "sourcePosition", 0);
        setField(term374633, term374633.getClass(), "jsType", null);
        setField(term374633, term374633.getClass(), "parent", null);
        setField(term374632, term374632.getClass(), "rootNode", term374633);
        setField(term374632, term374632.getClass(), "thisType", null);
        setBooleanField(term374632, term374632.getClass(), "isBottom", false);
        ArrayDeque term374630 = new ArrayDeque();
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ((ArrayDeque) term374630).add(term374632);
        ArrayDeque term374634 = new ArrayDeque();
        term374629 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term374629, term374629.getClass(), "compiler", null);
        setField(term374629, term374629.getClass(), "callback", null);
        setField(term374629, term374629.getClass(), "curNode", null);
        setField(term374629, term374629.getClass(), "scopes", term374630);
        setField(term374629, term374629.getClass(), "scopeRoots", term374634);
        setField(term374629, term374629.getClass(), "cfgs", null);
        setField(term374629, term374629.getClass(), "sourceName", null);
        setField(term374629, term374629.getClass(), "scopeCreator", null);
        setField(term374629, term374629.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term372861;
        callMethod(klass, "enterScope", argTypes, term372525, args);
        assertTrue(recursiveEquals(term372525, term374624));
        assertTrue(recursiveEquals(term372861, term374629));
    }

};


