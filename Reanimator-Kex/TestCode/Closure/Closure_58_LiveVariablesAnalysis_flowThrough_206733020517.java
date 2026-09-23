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

public class LiveVariablesAnalysis_flowThrough_206733020517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term197;
     Object term218;

    public LiveVariablesAnalysis_flowThrough_206733020517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term181 = new HashMap();
        term179 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term180 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term189 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term180, term180.getClass(), "vars", term181);
        setField(term189, term189.getClass(), "vars", null);
        setField(term189, term189.getClass(), "parent", null);
        setIntField(term189, term189.getClass(), "depth", 0);
        setField(term189, term189.getClass(), "rootNode", null);
        setField(term189, term189.getClass(), "thisType", null);
        setBooleanField(term189, term189.getClass(), "isBottom", false);
        setField(term189, term189.getClass(), "arguments", null);
        setField(term180, term180.getClass(), "parent", term189);
        setIntField(term180, term180.getClass(), "depth", 287287233);
        setIntField(term193, term193.getClass(), "type", 0);
        setField(term193, term193.getClass(), "next", null);
        setField(term193, term193.getClass(), "first", null);
        setField(term193, term193.getClass(), "last", null);
        setField(term193, term193.getClass(), "propListHead", null);
        setIntField(term193, term193.getClass(), "sourcePosition", 0);
        setField(term193, term193.getClass(), "jsType", null);
        setField(term193, term193.getClass(), "parent", null);
        setField(term180, term180.getClass(), "rootNode", term193);
        setField(term180, term180.getClass(), "thisType", null);
        setBooleanField(term180, term180.getClass(), "isBottom", false);
        setField(term180, term180.getClass(), "arguments", null);
        setField(term179, term179.getClass(), "jsScope", term180);
        setField(term179, term179.getClass(), "escaped", null);
        setField(term179, term179.getClass(), "cfg", null);
        setField(term179, term179.getClass(), "joinOp", null);
        setField(term179, term179.getClass(), "orderedWorkSet", null);
        term197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term197, term197.getClass(), "type", 335112684);
        setIntField(term199, term199.getClass(), "type", 1375330971);
        setIntField(term201, term201.getClass(), "type", 0);
        setField(term201, term201.getClass(), "next", null);
        setField(term201, term201.getClass(), "first", null);
        setField(term201, term201.getClass(), "last", null);
        setField(term201, term201.getClass(), "propListHead", null);
        setIntField(term201, term201.getClass(), "sourcePosition", 0);
        setField(term201, term201.getClass(), "jsType", null);
        setField(term201, term201.getClass(), "parent", null);
        setField(term199, term199.getClass(), "next", term201);
        setIntField(term204, term204.getClass(), "type", 0);
        setField(term204, term204.getClass(), "next", null);
        setField(term204, term204.getClass(), "first", null);
        setField(term204, term204.getClass(), "last", null);
        setField(term204, term204.getClass(), "propListHead", null);
        setIntField(term204, term204.getClass(), "sourcePosition", 0);
        setField(term204, term204.getClass(), "jsType", null);
        setField(term204, term204.getClass(), "parent", null);
        setField(term199, term199.getClass(), "first", term204);
        setIntField(term207, term207.getClass(), "type", 0);
        setField(term207, term207.getClass(), "next", null);
        setField(term207, term207.getClass(), "first", null);
        setField(term207, term207.getClass(), "last", null);
        setField(term207, term207.getClass(), "propListHead", null);
        setIntField(term207, term207.getClass(), "sourcePosition", 0);
        setField(term207, term207.getClass(), "jsType", null);
        setField(term207, term207.getClass(), "parent", null);
        setField(term199, term199.getClass(), "last", term207);
        setField(term199, term199.getClass(), "propListHead", null);
        setIntField(term199, term199.getClass(), "sourcePosition", 0);
        setField(term199, term199.getClass(), "jsType", null);
        setField(term199, term199.getClass(), "parent", null);
        setField(term197, term197.getClass(), "next", term199);
        setIntField(term211, term211.getClass(), "type", 0);
        setField(term211, term211.getClass(), "next", null);
        setField(term211, term211.getClass(), "first", null);
        setField(term211, term211.getClass(), "last", null);
        setField(term211, term211.getClass(), "propListHead", null);
        setIntField(term211, term211.getClass(), "sourcePosition", 0);
        setField(term211, term211.getClass(), "jsType", null);
        setField(term211, term211.getClass(), "parent", null);
        setField(term197, term197.getClass(), "first", term211);
        setIntField(term214, term214.getClass(), "type", 0);
        setField(term214, term214.getClass(), "next", null);
        setField(term214, term214.getClass(), "first", null);
        setField(term214, term214.getClass(), "last", null);
        setField(term214, term214.getClass(), "propListHead", null);
        setIntField(term214, term214.getClass(), "sourcePosition", 0);
        setField(term214, term214.getClass(), "jsType", null);
        setField(term214, term214.getClass(), "parent", null);
        setField(term197, term197.getClass(), "last", term214);
        setField(term197, term197.getClass(), "propListHead", null);
        setIntField(term197, term197.getClass(), "sourcePosition", 0);
        setField(term197, term197.getClass(), "jsType", null);
        setField(term197, term197.getClass(), "parent", null);
        term218 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"));
        Object term219 = newInstance(Class.forName("java.util.BitSet"));
        long[] term220 = (long[]) newLongArray(1);
        setField(term219, term219.getClass(), "words", term220);
        setIntField(term219, term219.getClass(), "wordsInUse", 1655935355);
        setBooleanField(term219, term219.getClass(), "sizeIsSticky", false);
        setField(term218, term218.getClass(), "liveSet", term219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice");
        Object[] args = new Object[2];
        args[0] = term197;
        args[1] = term218;
        try {
            callMethod(klass, "flowThrough", argTypes, term179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


