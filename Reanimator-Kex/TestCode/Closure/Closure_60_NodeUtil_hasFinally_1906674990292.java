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

public class NodeUtil_hasFinally_1906674990292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3241;

    public NodeUtil_hasFinally_1906674990292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3241, term3241.getClass(), "type", -291618851);
        setIntField(term3243, term3243.getClass(), "type", -1016087889);
        setIntField(term3245, term3245.getClass(), "type", 0);
        setField(term3245, term3245.getClass(), "next", null);
        setField(term3245, term3245.getClass(), "first", null);
        setField(term3245, term3245.getClass(), "last", null);
        setField(term3245, term3245.getClass(), "propListHead", null);
        setIntField(term3245, term3245.getClass(), "sourcePosition", 0);
        setField(term3245, term3245.getClass(), "jsType", null);
        setField(term3245, term3245.getClass(), "parent", null);
        setField(term3243, term3243.getClass(), "next", term3245);
        setIntField(term3248, term3248.getClass(), "type", 0);
        setField(term3248, term3248.getClass(), "next", null);
        setField(term3248, term3248.getClass(), "first", null);
        setField(term3248, term3248.getClass(), "last", null);
        setField(term3248, term3248.getClass(), "propListHead", null);
        setIntField(term3248, term3248.getClass(), "sourcePosition", 0);
        setField(term3248, term3248.getClass(), "jsType", null);
        setField(term3248, term3248.getClass(), "parent", null);
        setField(term3243, term3243.getClass(), "first", term3248);
        setIntField(term3251, term3251.getClass(), "type", 0);
        setField(term3251, term3251.getClass(), "next", null);
        setField(term3251, term3251.getClass(), "first", null);
        setField(term3251, term3251.getClass(), "last", null);
        setField(term3251, term3251.getClass(), "propListHead", null);
        setIntField(term3251, term3251.getClass(), "sourcePosition", 0);
        setField(term3251, term3251.getClass(), "jsType", null);
        setField(term3251, term3251.getClass(), "parent", null);
        setField(term3243, term3243.getClass(), "last", term3251);
        setField(term3243, term3243.getClass(), "propListHead", null);
        setIntField(term3243, term3243.getClass(), "sourcePosition", 0);
        setField(term3243, term3243.getClass(), "jsType", null);
        setField(term3243, term3243.getClass(), "parent", null);
        setField(term3241, term3241.getClass(), "next", term3243);
        setIntField(term3255, term3255.getClass(), "type", 0);
        setField(term3255, term3255.getClass(), "next", null);
        setField(term3255, term3255.getClass(), "first", null);
        setField(term3255, term3255.getClass(), "last", null);
        setField(term3255, term3255.getClass(), "propListHead", null);
        setIntField(term3255, term3255.getClass(), "sourcePosition", 0);
        setField(term3255, term3255.getClass(), "jsType", null);
        setField(term3255, term3255.getClass(), "parent", null);
        setField(term3241, term3241.getClass(), "first", term3255);
        setIntField(term3258, term3258.getClass(), "type", 0);
        setField(term3258, term3258.getClass(), "next", null);
        setField(term3258, term3258.getClass(), "first", null);
        setField(term3258, term3258.getClass(), "last", null);
        setField(term3258, term3258.getClass(), "propListHead", null);
        setIntField(term3258, term3258.getClass(), "sourcePosition", 0);
        setField(term3258, term3258.getClass(), "jsType", null);
        setField(term3258, term3258.getClass(), "parent", null);
        setField(term3241, term3241.getClass(), "last", term3258);
        setField(term3241, term3241.getClass(), "propListHead", null);
        setIntField(term3241, term3241.getClass(), "sourcePosition", 0);
        setField(term3241, term3241.getClass(), "jsType", null);
        setField(term3241, term3241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3241;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


