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

public class NodeUtil_newExpr_960178251550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44142;
     Object term60645;
     Object term60622;

    public NodeUtil_newExpr_960178251550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44142, term44142.getClass(), "parent", null);
        setField(term44142, term44142.getClass(), "next", null);
        term60645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60645, term60645.getClass(), "type", 0);
        setField(term60645, term60645.getClass(), "next", null);
        setField(term60645, term60645.getClass(), "first", null);
        setField(term60645, term60645.getClass(), "last", null);
        setField(term60645, term60645.getClass(), "propListHead", null);
        setIntField(term60645, term60645.getClass(), "sourcePosition", 0);
        setField(term60645, term60645.getClass(), "jsType", null);
        setIntField(term60646, term60646.getClass(), "type", 130);
        setField(term60646, term60646.getClass(), "next", null);
        setField(term60646, term60646.getClass(), "first", term60645);
        setField(term60646, term60646.getClass(), "last", term60645);
        setField(term60646, term60646.getClass(), "propListHead", null);
        setIntField(term60646, term60646.getClass(), "sourcePosition", 0);
        setField(term60646, term60646.getClass(), "jsType", null);
        setField(term60646, term60646.getClass(), "parent", null);
        setField(term60645, term60645.getClass(), "parent", term60646);
        term60622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60622, term60622.getClass(), "type", 130);
        setField(term60622, term60622.getClass(), "next", null);
        setIntField(term60619, term60619.getClass(), "type", 0);
        setField(term60619, term60619.getClass(), "next", null);
        setField(term60619, term60619.getClass(), "first", null);
        setField(term60619, term60619.getClass(), "last", null);
        setField(term60619, term60619.getClass(), "propListHead", null);
        setIntField(term60619, term60619.getClass(), "sourcePosition", 0);
        setField(term60619, term60619.getClass(), "jsType", null);
        setField(term60619, term60619.getClass(), "parent", term60622);
        setField(term60622, term60622.getClass(), "first", term60619);
        setField(term60622, term60622.getClass(), "last", term60619);
        setField(term60622, term60622.getClass(), "propListHead", null);
        setIntField(term60622, term60622.getClass(), "sourcePosition", 0);
        setField(term60622, term60622.getClass(), "jsType", null);
        setField(term60622, term60622.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44142;
        Object retValue = callMethod(klass, "newExpr", argTypes, null, args);
        assertTrue(recursiveEquals(term44142, term60645));
        assertTrue(recursiveEquals(retValue, term60622));
    }

};


