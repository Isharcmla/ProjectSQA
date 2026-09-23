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

public class LiveVariablesAnalysis_getEscapedLocals_172570776412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term975;

    public LiveVariablesAnalysis_getEscapedLocals_172570776412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term69 = new HashMap();
        term67 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term68 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term77 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term81 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68, term68.getClass(), "vars", term69);
        setField(term77, term77.getClass(), "vars", null);
        setField(term77, term77.getClass(), "parent", null);
        setIntField(term77, term77.getClass(), "depth", 0);
        setField(term77, term77.getClass(), "rootNode", null);
        setField(term77, term77.getClass(), "thisType", null);
        setBooleanField(term77, term77.getClass(), "isBottom", false);
        setField(term77, term77.getClass(), "arguments", null);
        setField(term68, term68.getClass(), "parent", term77);
        setIntField(term68, term68.getClass(), "depth", -203030934);
        setIntField(term81, term81.getClass(), "type", 0);
        setField(term81, term81.getClass(), "next", null);
        setField(term81, term81.getClass(), "first", null);
        setField(term81, term81.getClass(), "last", null);
        setField(term81, term81.getClass(), "propListHead", null);
        setIntField(term81, term81.getClass(), "sourcePosition", 0);
        setField(term81, term81.getClass(), "jsType", null);
        setField(term81, term81.getClass(), "parent", null);
        setField(term68, term68.getClass(), "rootNode", term81);
        setField(term68, term68.getClass(), "thisType", null);
        setBooleanField(term68, term68.getClass(), "isBottom", false);
        setField(term68, term68.getClass(), "arguments", null);
        setField(term67, term67.getClass(), "jsScope", term68);
        setField(term67, term67.getClass(), "escaped", null);
        setField(term67, term67.getClass(), "cfg", null);
        setField(term67, term67.getClass(), "joinOp", null);
        setField(term67, term67.getClass(), "orderedWorkSet", null);
        HashMap term977 = new HashMap();
        term975 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term976 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term978 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term976, term976.getClass(), "vars", term977);
        setField(term978, term978.getClass(), "vars", null);
        setField(term978, term978.getClass(), "parent", null);
        setIntField(term978, term978.getClass(), "depth", 0);
        setField(term978, term978.getClass(), "rootNode", null);
        setField(term978, term978.getClass(), "thisType", null);
        setBooleanField(term978, term978.getClass(), "isBottom", false);
        setField(term978, term978.getClass(), "arguments", null);
        setField(term976, term976.getClass(), "parent", term978);
        setIntField(term976, term976.getClass(), "depth", -203030934);
        setIntField(term979, term979.getClass(), "type", 0);
        setField(term979, term979.getClass(), "next", null);
        setField(term979, term979.getClass(), "first", null);
        setField(term979, term979.getClass(), "last", null);
        setField(term979, term979.getClass(), "propListHead", null);
        setIntField(term979, term979.getClass(), "sourcePosition", 0);
        setField(term979, term979.getClass(), "jsType", null);
        setField(term979, term979.getClass(), "parent", null);
        setField(term976, term976.getClass(), "rootNode", term979);
        setField(term976, term976.getClass(), "thisType", null);
        setBooleanField(term976, term976.getClass(), "isBottom", false);
        setField(term976, term976.getClass(), "arguments", null);
        setField(term975, term975.getClass(), "jsScope", term976);
        setField(term975, term975.getClass(), "escaped", null);
        setField(term975, term975.getClass(), "cfg", null);
        setField(term975, term975.getClass(), "joinOp", null);
        setField(term975, term975.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEscapedLocals", argTypes, term67, args);
        assertTrue(recursiveEquals(term67, term975));
        assertTrue(recursiveEquals(retValue, null));
    }

};


