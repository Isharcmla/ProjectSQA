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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class Scope_isDeclared_28305908743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794;
     Object term828;

    public Scope_isDeclared_28305908743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term795 = new HashMap();
        term794 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term808 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term794, term794.getClass(), "vars", term795);
        setField(term808, term808.getClass(), "vars", null);
        setField(term808, term808.getClass(), "parent", null);
        setIntField(term808, term808.getClass(), "depth", 0);
        setField(term808, term808.getClass(), "rootNode", null);
        setField(term808, term808.getClass(), "thisType", null);
        setBooleanField(term808, term808.getClass(), "isBottom", false);
        setField(term808, term808.getClass(), "arguments", null);
        setField(term794, term794.getClass(), "parent", term808);
        setIntField(term794, term794.getClass(), "depth", 548228925);
        setIntField(term812, term812.getClass(), "type", 0);
        setField(term812, term812.getClass(), "next", null);
        setField(term812, term812.getClass(), "first", null);
        setField(term812, term812.getClass(), "last", null);
        setField(term812, term812.getClass(), "propListHead", null);
        setIntField(term812, term812.getClass(), "sourcePosition", 0);
        setField(term812, term812.getClass(), "jsType", null);
        setField(term812, term812.getClass(), "parent", null);
        setField(term794, term794.getClass(), "rootNode", term812);
        setField(term794, term794.getClass(), "thisType", null);
        setBooleanField(term794, term794.getClass(), "isBottom", false);
        setField(term794, term794.getClass(), "arguments", null);
        term828 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "VMeAzAHwZj";
        args[1] = term828;
        try {
            callMethod(klass, "isDeclared", argTypes, term794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


