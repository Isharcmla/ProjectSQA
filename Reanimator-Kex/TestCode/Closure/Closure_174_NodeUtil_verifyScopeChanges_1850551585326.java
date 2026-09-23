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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.Boolean;

public class NodeUtil_verifyScopeChanges_1850551585326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5378;
     Object term5571;
     Object term5598;

    public NodeUtil_verifyScopeChanges_1850551585326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5378 = new LinkedHashMap();
        term5571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5571, term5571.getClass(), "type", 962385185);
        setIntField(term5573, term5573.getClass(), "type", 2146718886);
        setIntField(term5575, term5575.getClass(), "type", -985577036);
        setIntField(term5577, term5577.getClass(), "type", 802539130);
        setIntField(term5579, term5579.getClass(), "type", 2105146188);
        setField(term5579, term5579.getClass(), "next", null);
        setField(term5579, term5579.getClass(), "first", null);
        setField(term5579, term5579.getClass(), "last", null);
        setField(term5579, term5579.getClass(), "propListHead", null);
        setIntField(term5579, term5579.getClass(), "sourcePosition", 0);
        setField(term5579, term5579.getClass(), "jsType", null);
        setField(term5579, term5579.getClass(), "parent", null);
        setField(term5577, term5577.getClass(), "next", term5579);
        setIntField(term5582, term5582.getClass(), "type", -862415480);
        setField(term5582, term5582.getClass(), "next", null);
        setField(term5582, term5582.getClass(), "first", null);
        setField(term5582, term5582.getClass(), "last", term5579);
        setField(term5582, term5582.getClass(), "propListHead", null);
        setIntField(term5582, term5582.getClass(), "sourcePosition", 0);
        setField(term5582, term5582.getClass(), "jsType", null);
        setField(term5582, term5582.getClass(), "parent", null);
        setField(term5577, term5577.getClass(), "first", term5582);
        setField(term5577, term5577.getClass(), "last", term5575);
        setField(term5577, term5577.getClass(), "propListHead", null);
        setIntField(term5577, term5577.getClass(), "sourcePosition", 0);
        setField(term5577, term5577.getClass(), "jsType", null);
        setField(term5577, term5577.getClass(), "parent", null);
        setField(term5575, term5575.getClass(), "next", term5577);
        setField(term5575, term5575.getClass(), "first", term5579);
        setIntField(term5586, term5586.getClass(), "type", -402072606);
        setIntField(term5588, term5588.getClass(), "type", -477355193);
        setField(term5588, term5588.getClass(), "next", null);
        setField(term5588, term5588.getClass(), "first", term5582);
        setField(term5588, term5588.getClass(), "last", term5577);
        setField(term5588, term5588.getClass(), "propListHead", null);
        setIntField(term5588, term5588.getClass(), "sourcePosition", 0);
        setField(term5588, term5588.getClass(), "jsType", null);
        setField(term5588, term5588.getClass(), "parent", null);
        setField(term5586, term5586.getClass(), "next", term5588);
        setField(term5586, term5586.getClass(), "first", term5573);
        setField(term5586, term5586.getClass(), "last", term5573);
        setField(term5586, term5586.getClass(), "propListHead", null);
        setIntField(term5586, term5586.getClass(), "sourcePosition", 0);
        setField(term5586, term5586.getClass(), "jsType", null);
        setField(term5586, term5586.getClass(), "parent", null);
        setField(term5575, term5575.getClass(), "last", term5586);
        setField(term5575, term5575.getClass(), "propListHead", null);
        setIntField(term5575, term5575.getClass(), "sourcePosition", 0);
        setField(term5575, term5575.getClass(), "jsType", null);
        setField(term5575, term5575.getClass(), "parent", null);
        setField(term5573, term5573.getClass(), "next", term5575);
        setIntField(term5593, term5593.getClass(), "type", 168425089);
        setField(term5593, term5593.getClass(), "next", term5586);
        setField(term5593, term5593.getClass(), "first", term5588);
        setField(term5593, term5593.getClass(), "last", term5571);
        setField(term5593, term5593.getClass(), "propListHead", null);
        setIntField(term5593, term5593.getClass(), "sourcePosition", 0);
        setField(term5593, term5593.getClass(), "jsType", null);
        setField(term5593, term5593.getClass(), "parent", null);
        setField(term5573, term5573.getClass(), "first", term5593);
        setField(term5573, term5573.getClass(), "last", term5593);
        setField(term5573, term5573.getClass(), "propListHead", null);
        setIntField(term5573, term5573.getClass(), "sourcePosition", 0);
        setField(term5573, term5573.getClass(), "jsType", null);
        setField(term5573, term5573.getClass(), "parent", null);
        setField(term5571, term5571.getClass(), "next", term5573);
        setField(term5571, term5571.getClass(), "first", term5577);
        setField(term5571, term5571.getClass(), "last", term5579);
        setField(term5571, term5571.getClass(), "propListHead", null);
        setIntField(term5571, term5571.getClass(), "sourcePosition", 0);
        setField(term5571, term5571.getClass(), "jsType", null);
        setField(term5571, term5571.getClass(), "parent", null);
        term5598 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[4];
        args[0] = term5378;
        args[1] = term5571;
        args[2] = term5598;
        args[3] = null;
        try {
            callMethod(klass, "verifyScopeChanges", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


