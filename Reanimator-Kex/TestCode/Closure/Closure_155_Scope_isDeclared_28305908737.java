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

public class Scope_isDeclared_28305908737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term847;

    public Scope_isDeclared_28305908737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term814 = new HashMap();
        term813 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term827 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term813, term813.getClass(), "vars", term814);
        setField(term827, term827.getClass(), "vars", null);
        setField(term827, term827.getClass(), "parent", null);
        setIntField(term827, term827.getClass(), "depth", 0);
        setField(term827, term827.getClass(), "rootNode", null);
        setField(term827, term827.getClass(), "thisType", null);
        setBooleanField(term827, term827.getClass(), "isBottom", false);
        setField(term813, term813.getClass(), "parent", term827);
        setIntField(term813, term813.getClass(), "depth", 477625804);
        setIntField(term831, term831.getClass(), "type", 0);
        setField(term831, term831.getClass(), "next", null);
        setField(term831, term831.getClass(), "first", null);
        setField(term831, term831.getClass(), "last", null);
        setField(term831, term831.getClass(), "propListHead", null);
        setIntField(term831, term831.getClass(), "sourcePosition", 0);
        setField(term831, term831.getClass(), "jsType", null);
        setField(term831, term831.getClass(), "parent", null);
        setField(term813, term813.getClass(), "rootNode", term831);
        setField(term813, term813.getClass(), "thisType", null);
        setBooleanField(term813, term813.getClass(), "isBottom", false);
        term847 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "fWKJoSoCwE";
        args[1] = term847;
        try {
            callMethod(klass, "isDeclared", argTypes, term813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


