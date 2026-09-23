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

public class ReferenceCollectingCallback_enterScope_16272974651085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304854;
     Object term305440;
     Object term306090;
     Object term306097;

    public ReferenceCollectingCallback_enterScope_16272974651085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term305100 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        Object term305583 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term305628 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term305671 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term305628, term305628.getClass(), "type", 105);
        setField(term305628, term305628.getClass(), "parent", term305671);
        setField(term305583, term305583.getClass(), "rootNode", term305628);
        ArrayList term304960 = new ArrayList();
        ((ArrayList) term304960).add(term305100);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ((ArrayList) term304960).add(term305583);
        ArrayDeque term304908 = new ArrayDeque((Collection<? extends Object>) term304960);
        term304854 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term304854, term304854.getClass(), "blockStack", term304908);
        ArrayList term305546 = new ArrayList();
        ((ArrayList) term305546).add(term305583);
        ((ArrayList) term305546).add(term305583);
        ((ArrayList) term305546).add(term305583);
        ((ArrayList) term305546).add(term305583);
        ((ArrayList) term305546).add(term305583);
        ArrayDeque term305494 = new ArrayDeque((Collection<? extends Object>) term305546);
        ArrayList term305777 = new ArrayList();
        ArrayDeque term305725 = new ArrayDeque((Collection<? extends Object>) term305777);
        term305440 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term305440, term305440.getClass(), "scopes", term305494);
        setField(term305440, term305440.getClass(), "scopeRoots", term305725);
        ArrayDeque term306091 = new ArrayDeque();
        term306090 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term306090, term306090.getClass(), "referenceMap", null);
        setField(term306090, term306090.getClass(), "blockStack", term306091);
        setField(term306090, term306090.getClass(), "behavior", null);
        setField(term306090, term306090.getClass(), "compiler", null);
        setField(term306090, term306090.getClass(), "varFilter", null);
        Object term306100 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term306101 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term306100, term306100.getClass(), "vars", null);
        setField(term306100, term306100.getClass(), "parent", null);
        setIntField(term306101, term306101.getClass(), "encodedSourceStart", 0);
        setIntField(term306101, term306101.getClass(), "encodedSourceEnd", 0);
        setField(term306101, term306101.getClass(), "sourceName", null);
        setIntField(term306101, term306101.getClass(), "baseLineno", 0);
        setIntField(term306101, term306101.getClass(), "endLineno", 0);
        setField(term306101, term306101.getClass(), "functions", null);
        setField(term306101, term306101.getClass(), "regexps", null);
        setField(term306101, term306101.getClass(), "itsVariables", null);
        setField(term306101, term306101.getClass(), "itsConst", null);
        setField(term306101, term306101.getClass(), "itsVariableNames", null);
        setIntField(term306101, term306101.getClass(), "varStart", 0);
        setField(term306101, term306101.getClass(), "compilerData", null);
        setIntField(term306101, term306101.getClass(), "type", 105);
        setField(term306101, term306101.getClass(), "next", null);
        setField(term306101, term306101.getClass(), "first", null);
        setField(term306101, term306101.getClass(), "last", null);
        setField(term306101, term306101.getClass(), "propListHead", null);
        setIntField(term306101, term306101.getClass(), "sourcePosition", 0);
        setField(term306101, term306101.getClass(), "jsType", null);
        setField(term306101, term306101.getClass(), "parent", null);
        setField(term306100, term306100.getClass(), "rootNode", term306101);
        setField(term306100, term306100.getClass(), "thisType", null);
        setBooleanField(term306100, term306100.getClass(), "isBottom", false);
        ArrayDeque term306098 = new ArrayDeque();
        ((ArrayDeque) term306098).add(term306100);
        ((ArrayDeque) term306098).add(term306100);
        ((ArrayDeque) term306098).add(term306100);
        ((ArrayDeque) term306098).add(term306100);
        ((ArrayDeque) term306098).add(term306100);
        ArrayDeque term306102 = new ArrayDeque();
        term306097 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term306097, term306097.getClass(), "compiler", null);
        setField(term306097, term306097.getClass(), "callback", null);
        setField(term306097, term306097.getClass(), "curNode", null);
        setField(term306097, term306097.getClass(), "scopes", term306098);
        setField(term306097, term306097.getClass(), "scopeRoots", term306102);
        setField(term306097, term306097.getClass(), "cfgs", null);
        setField(term306097, term306097.getClass(), "sourceName", null);
        setField(term306097, term306097.getClass(), "scopeCreator", null);
        setField(term306097, term306097.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term305440;
        callMethod(klass, "enterScope", argTypes, term304854, args);
        assertTrue(recursiveEquals(term304854, term306090));
        assertTrue(recursiveEquals(term305440, term306097));
    }

};


