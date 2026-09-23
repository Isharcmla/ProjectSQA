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

public class LiveVariablesAnalysis_createEntryLattice_80690244115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term1300;
     Object term1279;

    public LiveVariablesAnalysis_createEntryLattice_80690244115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term145 = new HashMap();
        term143 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term144 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term153 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144, term144.getClass(), "vars", term145);
        setField(term153, term153.getClass(), "vars", null);
        setField(term153, term153.getClass(), "parent", null);
        setIntField(term153, term153.getClass(), "depth", 0);
        setField(term153, term153.getClass(), "rootNode", null);
        setField(term153, term153.getClass(), "thisType", null);
        setBooleanField(term153, term153.getClass(), "isBottom", false);
        setField(term153, term153.getClass(), "arguments", null);
        setField(term144, term144.getClass(), "parent", term153);
        setIntField(term144, term144.getClass(), "depth", -1048298087);
        setIntField(term157, term157.getClass(), "type", 0);
        setField(term157, term157.getClass(), "next", null);
        setField(term157, term157.getClass(), "first", null);
        setField(term157, term157.getClass(), "last", null);
        setField(term157, term157.getClass(), "propListHead", null);
        setIntField(term157, term157.getClass(), "sourcePosition", 0);
        setField(term157, term157.getClass(), "jsType", null);
        setField(term157, term157.getClass(), "parent", null);
        setField(term144, term144.getClass(), "rootNode", term157);
        setField(term144, term144.getClass(), "thisType", null);
        setBooleanField(term144, term144.getClass(), "isBottom", false);
        setField(term144, term144.getClass(), "arguments", null);
        setField(term143, term143.getClass(), "jsScope", term144);
        setField(term143, term143.getClass(), "escaped", null);
        setField(term143, term143.getClass(), "cfg", null);
        setField(term143, term143.getClass(), "joinOp", null);
        setField(term143, term143.getClass(), "orderedWorkSet", null);
        HashMap term1302 = new HashMap();
        term1300 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term1301 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1303 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1301, term1301.getClass(), "vars", term1302);
        setField(term1303, term1303.getClass(), "vars", null);
        setField(term1303, term1303.getClass(), "parent", null);
        setIntField(term1303, term1303.getClass(), "depth", 0);
        setField(term1303, term1303.getClass(), "rootNode", null);
        setField(term1303, term1303.getClass(), "thisType", null);
        setBooleanField(term1303, term1303.getClass(), "isBottom", false);
        setField(term1303, term1303.getClass(), "arguments", null);
        setField(term1301, term1301.getClass(), "parent", term1303);
        setIntField(term1301, term1301.getClass(), "depth", -1048298087);
        setIntField(term1304, term1304.getClass(), "type", 0);
        setField(term1304, term1304.getClass(), "next", null);
        setField(term1304, term1304.getClass(), "first", null);
        setField(term1304, term1304.getClass(), "last", null);
        setField(term1304, term1304.getClass(), "propListHead", null);
        setIntField(term1304, term1304.getClass(), "sourcePosition", 0);
        setField(term1304, term1304.getClass(), "jsType", null);
        setField(term1304, term1304.getClass(), "parent", null);
        setField(term1301, term1301.getClass(), "rootNode", term1304);
        setField(term1301, term1301.getClass(), "thisType", null);
        setBooleanField(term1301, term1301.getClass(), "isBottom", false);
        setField(term1301, term1301.getClass(), "arguments", null);
        setField(term1300, term1300.getClass(), "jsScope", term1301);
        setField(term1300, term1300.getClass(), "escaped", null);
        setField(term1300, term1300.getClass(), "cfg", null);
        setField(term1300, term1300.getClass(), "joinOp", null);
        setField(term1300, term1300.getClass(), "orderedWorkSet", null);
        term1279 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"));
        Object term1280 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1281 = (long[]) newLongArray(0);
        setField(term1280, term1280.getClass(), "words", term1281);
        setIntField(term1280, term1280.getClass(), "wordsInUse", 0);
        setBooleanField(term1280, term1280.getClass(), "sizeIsSticky", true);
        setField(term1279, term1279.getClass(), "liveSet", term1280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createEntryLattice", argTypes, term143, args);
        assertTrue(recursiveEquals(term143, term1300));
        assertTrue(recursiveEquals(retValue, term1279));
    }

};


