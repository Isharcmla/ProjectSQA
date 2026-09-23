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

public class Scope_getVar_104174203241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728;

    public Scope_getVar_104174203241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term729 = new HashMap();
        term728 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term742 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term728, term728.getClass(), "vars", term729);
        setField(term742, term742.getClass(), "vars", null);
        setField(term742, term742.getClass(), "parent", null);
        setIntField(term742, term742.getClass(), "depth", 0);
        setField(term742, term742.getClass(), "rootNode", null);
        setField(term742, term742.getClass(), "thisType", null);
        setBooleanField(term742, term742.getClass(), "isBottom", false);
        setField(term742, term742.getClass(), "arguments", null);
        setField(term728, term728.getClass(), "parent", term742);
        setIntField(term728, term728.getClass(), "depth", -1882480155);
        setIntField(term746, term746.getClass(), "type", 0);
        setField(term746, term746.getClass(), "next", null);
        setField(term746, term746.getClass(), "first", null);
        setField(term746, term746.getClass(), "last", null);
        setField(term746, term746.getClass(), "propListHead", null);
        setIntField(term746, term746.getClass(), "sourcePosition", 0);
        setField(term746, term746.getClass(), "jsType", null);
        setField(term746, term746.getClass(), "parent", null);
        setField(term728, term728.getClass(), "rootNode", term746);
        setField(term728, term728.getClass(), "thisType", null);
        setBooleanField(term728, term728.getClass(), "isBottom", false);
        setField(term728, term728.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        try {
            callMethod(klass, "getVar", argTypes, term728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


