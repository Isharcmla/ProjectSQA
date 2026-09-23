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
import java.lang.Object;
import java.util.HashMap;

public class LiveVariablesAnalysis_createInitialEstimateLattice_100319662316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;
     Object term1341;
     Object term1320;

    public LiveVariablesAnalysis_createInitialEstimateLattice_100319662316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term163 = new HashMap();
        term161 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term162 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term171 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162, term162.getClass(), "vars", term163);
        setField(term171, term171.getClass(), "vars", null);
        setField(term171, term171.getClass(), "parent", null);
        setIntField(term171, term171.getClass(), "depth", 0);
        setField(term171, term171.getClass(), "rootNode", null);
        setField(term171, term171.getClass(), "thisType", null);
        setBooleanField(term171, term171.getClass(), "isBottom", false);
        setField(term171, term171.getClass(), "arguments", null);
        setField(term162, term162.getClass(), "parent", term171);
        setIntField(term162, term162.getClass(), "depth", -1371869594);
        setIntField(term175, term175.getClass(), "type", 0);
        setField(term175, term175.getClass(), "next", null);
        setField(term175, term175.getClass(), "first", null);
        setField(term175, term175.getClass(), "last", null);
        setField(term175, term175.getClass(), "propListHead", null);
        setIntField(term175, term175.getClass(), "sourcePosition", 0);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
        setField(term162, term162.getClass(), "rootNode", term175);
        setField(term162, term162.getClass(), "thisType", null);
        setBooleanField(term162, term162.getClass(), "isBottom", false);
        setField(term162, term162.getClass(), "arguments", null);
        setField(term161, term161.getClass(), "jsScope", term162);
        setField(term161, term161.getClass(), "escaped", null);
        setField(term161, term161.getClass(), "cfg", null);
        setField(term161, term161.getClass(), "joinOp", null);
        setField(term161, term161.getClass(), "orderedWorkSet", null);
        HashMap term1343 = new HashMap();
        term1341 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term1342 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1344 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1342, term1342.getClass(), "vars", term1343);
        setField(term1344, term1344.getClass(), "vars", null);
        setField(term1344, term1344.getClass(), "parent", null);
        setIntField(term1344, term1344.getClass(), "depth", 0);
        setField(term1344, term1344.getClass(), "rootNode", null);
        setField(term1344, term1344.getClass(), "thisType", null);
        setBooleanField(term1344, term1344.getClass(), "isBottom", false);
        setField(term1344, term1344.getClass(), "arguments", null);
        setField(term1342, term1342.getClass(), "parent", term1344);
        setIntField(term1342, term1342.getClass(), "depth", -1371869594);
        setIntField(term1345, term1345.getClass(), "type", 0);
        setField(term1345, term1345.getClass(), "next", null);
        setField(term1345, term1345.getClass(), "first", null);
        setField(term1345, term1345.getClass(), "last", null);
        setField(term1345, term1345.getClass(), "propListHead", null);
        setIntField(term1345, term1345.getClass(), "sourcePosition", 0);
        setField(term1345, term1345.getClass(), "jsType", null);
        setField(term1345, term1345.getClass(), "parent", null);
        setField(term1342, term1342.getClass(), "rootNode", term1345);
        setField(term1342, term1342.getClass(), "thisType", null);
        setBooleanField(term1342, term1342.getClass(), "isBottom", false);
        setField(term1342, term1342.getClass(), "arguments", null);
        setField(term1341, term1341.getClass(), "jsScope", term1342);
        setField(term1341, term1341.getClass(), "escaped", null);
        setField(term1341, term1341.getClass(), "cfg", null);
        setField(term1341, term1341.getClass(), "joinOp", null);
        setField(term1341, term1341.getClass(), "orderedWorkSet", null);
        term1320 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"));
        Object term1321 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1322 = (long[]) newLongArray(0);
        setField(term1321, term1321.getClass(), "words", term1322);
        setIntField(term1321, term1321.getClass(), "wordsInUse", 0);
        setBooleanField(term1321, term1321.getClass(), "sizeIsSticky", true);
        setField(term1320, term1320.getClass(), "liveSet", term1321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createInitialEstimateLattice", argTypes, term161, args);
        assertTrue(recursiveEquals(term161, term1341));
        assertTrue(recursiveEquals(retValue, term1320));
    }

};


