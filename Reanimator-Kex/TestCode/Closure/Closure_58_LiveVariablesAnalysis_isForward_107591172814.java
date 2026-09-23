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

public class LiveVariablesAnalysis_isForward_107591172814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term1258;

    public LiveVariablesAnalysis_isForward_107591172814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term127 = new HashMap();
        term125 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term126 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term135 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term126, term126.getClass(), "vars", term127);
        setField(term135, term135.getClass(), "vars", null);
        setField(term135, term135.getClass(), "parent", null);
        setIntField(term135, term135.getClass(), "depth", 0);
        setField(term135, term135.getClass(), "rootNode", null);
        setField(term135, term135.getClass(), "thisType", null);
        setBooleanField(term135, term135.getClass(), "isBottom", false);
        setField(term135, term135.getClass(), "arguments", null);
        setField(term126, term126.getClass(), "parent", term135);
        setIntField(term126, term126.getClass(), "depth", -1016503459);
        setIntField(term139, term139.getClass(), "type", 0);
        setField(term139, term139.getClass(), "next", null);
        setField(term139, term139.getClass(), "first", null);
        setField(term139, term139.getClass(), "last", null);
        setField(term139, term139.getClass(), "propListHead", null);
        setIntField(term139, term139.getClass(), "sourcePosition", 0);
        setField(term139, term139.getClass(), "jsType", null);
        setField(term139, term139.getClass(), "parent", null);
        setField(term126, term126.getClass(), "rootNode", term139);
        setField(term126, term126.getClass(), "thisType", null);
        setBooleanField(term126, term126.getClass(), "isBottom", false);
        setField(term126, term126.getClass(), "arguments", null);
        setField(term125, term125.getClass(), "jsScope", term126);
        setField(term125, term125.getClass(), "escaped", null);
        setField(term125, term125.getClass(), "cfg", null);
        setField(term125, term125.getClass(), "joinOp", null);
        setField(term125, term125.getClass(), "orderedWorkSet", null);
        HashMap term1260 = new HashMap();
        term1258 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term1259 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1261 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1259, term1259.getClass(), "vars", term1260);
        setField(term1261, term1261.getClass(), "vars", null);
        setField(term1261, term1261.getClass(), "parent", null);
        setIntField(term1261, term1261.getClass(), "depth", 0);
        setField(term1261, term1261.getClass(), "rootNode", null);
        setField(term1261, term1261.getClass(), "thisType", null);
        setBooleanField(term1261, term1261.getClass(), "isBottom", false);
        setField(term1261, term1261.getClass(), "arguments", null);
        setField(term1259, term1259.getClass(), "parent", term1261);
        setIntField(term1259, term1259.getClass(), "depth", -1016503459);
        setIntField(term1262, term1262.getClass(), "type", 0);
        setField(term1262, term1262.getClass(), "next", null);
        setField(term1262, term1262.getClass(), "first", null);
        setField(term1262, term1262.getClass(), "last", null);
        setField(term1262, term1262.getClass(), "propListHead", null);
        setIntField(term1262, term1262.getClass(), "sourcePosition", 0);
        setField(term1262, term1262.getClass(), "jsType", null);
        setField(term1262, term1262.getClass(), "parent", null);
        setField(term1259, term1259.getClass(), "rootNode", term1262);
        setField(term1259, term1259.getClass(), "thisType", null);
        setBooleanField(term1259, term1259.getClass(), "isBottom", false);
        setField(term1259, term1259.getClass(), "arguments", null);
        setField(term1258, term1258.getClass(), "jsScope", term1259);
        setField(term1258, term1258.getClass(), "escaped", null);
        setField(term1258, term1258.getClass(), "cfg", null);
        setField(term1258, term1258.getClass(), "joinOp", null);
        setField(term1258, term1258.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isForward", argTypes, term125, args);
        assertTrue(recursiveEquals(term125, term1258));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


