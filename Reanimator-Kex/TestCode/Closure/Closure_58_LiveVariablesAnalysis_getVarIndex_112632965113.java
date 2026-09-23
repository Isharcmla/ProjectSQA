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

public class LiveVariablesAnalysis_getVarIndex_112632965113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public LiveVariablesAnalysis_getVarIndex_112632965113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term87 = new HashMap();
        term85 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term86 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term95 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86, term86.getClass(), "vars", term87);
        setField(term95, term95.getClass(), "vars", null);
        setField(term95, term95.getClass(), "parent", null);
        setIntField(term95, term95.getClass(), "depth", 0);
        setField(term95, term95.getClass(), "rootNode", null);
        setField(term95, term95.getClass(), "thisType", null);
        setBooleanField(term95, term95.getClass(), "isBottom", false);
        setField(term95, term95.getClass(), "arguments", null);
        setField(term86, term86.getClass(), "parent", term95);
        setIntField(term86, term86.getClass(), "depth", -1145578966);
        setIntField(term99, term99.getClass(), "type", 0);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "first", null);
        setField(term99, term99.getClass(), "last", null);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term86, term86.getClass(), "rootNode", term99);
        setField(term86, term86.getClass(), "thisType", null);
        setBooleanField(term86, term86.getClass(), "isBottom", false);
        setField(term86, term86.getClass(), "arguments", null);
        setField(term85, term85.getClass(), "jsScope", term86);
        setField(term85, term85.getClass(), "escaped", null);
        setField(term85, term85.getClass(), "cfg", null);
        setField(term85, term85.getClass(), "joinOp", null);
        setField(term85, term85.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        try {
            callMethod(klass, "getVarIndex", argTypes, term85, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


