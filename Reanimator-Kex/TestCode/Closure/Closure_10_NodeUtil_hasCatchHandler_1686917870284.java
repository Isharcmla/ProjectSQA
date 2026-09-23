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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_hasCatchHandler_1686917870284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3711;

    public NodeUtil_hasCatchHandler_1686917870284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3711, term3711.getClass(), "type", -1855819749);
        setIntField(term3713, term3713.getClass(), "type", 1059048043);
        setIntField(term3715, term3715.getClass(), "type", 537273345);
        setIntField(term3717, term3717.getClass(), "type", -346107257);
        setIntField(term3719, term3719.getClass(), "type", -1577393360);
        setField(term3719, term3719.getClass(), "next", null);
        setField(term3719, term3719.getClass(), "first", null);
        setField(term3719, term3719.getClass(), "last", null);
        setField(term3719, term3719.getClass(), "propListHead", null);
        setIntField(term3719, term3719.getClass(), "sourcePosition", 0);
        setField(term3719, term3719.getClass(), "jsType", null);
        setField(term3719, term3719.getClass(), "parent", null);
        setField(term3717, term3717.getClass(), "next", term3719);
        setIntField(term3722, term3722.getClass(), "type", 1112256038);
        setField(term3722, term3722.getClass(), "next", null);
        setField(term3722, term3722.getClass(), "first", null);
        setField(term3722, term3722.getClass(), "last", term3719);
        setField(term3722, term3722.getClass(), "propListHead", null);
        setIntField(term3722, term3722.getClass(), "sourcePosition", 0);
        setField(term3722, term3722.getClass(), "jsType", null);
        setField(term3722, term3722.getClass(), "parent", null);
        setField(term3717, term3717.getClass(), "first", term3722);
        setField(term3717, term3717.getClass(), "last", term3715);
        setField(term3717, term3717.getClass(), "propListHead", null);
        setIntField(term3717, term3717.getClass(), "sourcePosition", 0);
        setField(term3717, term3717.getClass(), "jsType", null);
        setField(term3717, term3717.getClass(), "parent", null);
        setField(term3715, term3715.getClass(), "next", term3717);
        setField(term3715, term3715.getClass(), "first", term3719);
        setIntField(term3726, term3726.getClass(), "type", 1504698817);
        setIntField(term3728, term3728.getClass(), "type", -2018333791);
        setField(term3728, term3728.getClass(), "next", null);
        setField(term3728, term3728.getClass(), "first", term3722);
        setField(term3728, term3728.getClass(), "last", term3717);
        setField(term3728, term3728.getClass(), "propListHead", null);
        setIntField(term3728, term3728.getClass(), "sourcePosition", 0);
        setField(term3728, term3728.getClass(), "jsType", null);
        setField(term3728, term3728.getClass(), "parent", null);
        setField(term3726, term3726.getClass(), "next", term3728);
        setField(term3726, term3726.getClass(), "first", term3713);
        setField(term3726, term3726.getClass(), "last", term3713);
        setField(term3726, term3726.getClass(), "propListHead", null);
        setIntField(term3726, term3726.getClass(), "sourcePosition", 0);
        setField(term3726, term3726.getClass(), "jsType", null);
        setField(term3726, term3726.getClass(), "parent", null);
        setField(term3715, term3715.getClass(), "last", term3726);
        setField(term3715, term3715.getClass(), "propListHead", null);
        setIntField(term3715, term3715.getClass(), "sourcePosition", 0);
        setField(term3715, term3715.getClass(), "jsType", null);
        setField(term3715, term3715.getClass(), "parent", null);
        setField(term3713, term3713.getClass(), "next", term3715);
        setIntField(term3733, term3733.getClass(), "type", -742476678);
        setField(term3733, term3733.getClass(), "next", term3726);
        setField(term3733, term3733.getClass(), "first", term3728);
        setField(term3733, term3733.getClass(), "last", term3711);
        setField(term3733, term3733.getClass(), "propListHead", null);
        setIntField(term3733, term3733.getClass(), "sourcePosition", 0);
        setField(term3733, term3733.getClass(), "jsType", null);
        setField(term3733, term3733.getClass(), "parent", null);
        setField(term3713, term3713.getClass(), "first", term3733);
        setField(term3713, term3713.getClass(), "last", term3733);
        setField(term3713, term3713.getClass(), "propListHead", null);
        setIntField(term3713, term3713.getClass(), "sourcePosition", 0);
        setField(term3713, term3713.getClass(), "jsType", null);
        setField(term3713, term3713.getClass(), "parent", null);
        setField(term3711, term3711.getClass(), "next", term3713);
        setField(term3711, term3711.getClass(), "first", term3717);
        setField(term3711, term3711.getClass(), "last", term3719);
        setField(term3711, term3711.getClass(), "propListHead", null);
        setIntField(term3711, term3711.getClass(), "sourcePosition", 0);
        setField(term3711, term3711.getClass(), "jsType", null);
        setField(term3711, term3711.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3711;
        try {
            callMethod(klass, "hasCatchHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


