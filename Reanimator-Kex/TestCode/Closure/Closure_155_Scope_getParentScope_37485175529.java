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
import java.util.HashMap;
import java.lang.Object;

public class Scope_getParentScope_37485175529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;
     Object term1567;
     Object term1553;

    public Scope_getParentScope_37485175529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term215 = new HashMap();
        term214 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term228 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term214, term214.getClass(), "vars", term215);
        setField(term228, term228.getClass(), "vars", null);
        setField(term228, term228.getClass(), "parent", null);
        setIntField(term228, term228.getClass(), "depth", 0);
        setField(term228, term228.getClass(), "rootNode", null);
        setField(term228, term228.getClass(), "thisType", null);
        setBooleanField(term228, term228.getClass(), "isBottom", false);
        setField(term214, term214.getClass(), "parent", term228);
        setIntField(term214, term214.getClass(), "depth", -1801760683);
        setIntField(term232, term232.getClass(), "type", 0);
        setField(term232, term232.getClass(), "next", null);
        setField(term232, term232.getClass(), "first", null);
        setField(term232, term232.getClass(), "last", null);
        setField(term232, term232.getClass(), "propListHead", null);
        setIntField(term232, term232.getClass(), "sourcePosition", 0);
        setField(term232, term232.getClass(), "jsType", null);
        setField(term232, term232.getClass(), "parent", null);
        setField(term214, term214.getClass(), "rootNode", term232);
        setField(term214, term214.getClass(), "thisType", null);
        setBooleanField(term214, term214.getClass(), "isBottom", false);
        HashMap term1568 = new HashMap();
        term1567 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1569 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1567, term1567.getClass(), "vars", term1568);
        setField(term1569, term1569.getClass(), "vars", null);
        setField(term1569, term1569.getClass(), "parent", null);
        setIntField(term1569, term1569.getClass(), "depth", 0);
        setField(term1569, term1569.getClass(), "rootNode", null);
        setField(term1569, term1569.getClass(), "thisType", null);
        setBooleanField(term1569, term1569.getClass(), "isBottom", false);
        setField(term1567, term1567.getClass(), "parent", term1569);
        setIntField(term1567, term1567.getClass(), "depth", -1801760683);
        setIntField(term1570, term1570.getClass(), "type", 0);
        setField(term1570, term1570.getClass(), "next", null);
        setField(term1570, term1570.getClass(), "first", null);
        setField(term1570, term1570.getClass(), "last", null);
        setField(term1570, term1570.getClass(), "propListHead", null);
        setIntField(term1570, term1570.getClass(), "sourcePosition", 0);
        setField(term1570, term1570.getClass(), "jsType", null);
        setField(term1570, term1570.getClass(), "parent", null);
        setField(term1567, term1567.getClass(), "rootNode", term1570);
        setField(term1567, term1567.getClass(), "thisType", null);
        setBooleanField(term1567, term1567.getClass(), "isBottom", false);
        term1553 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term1553, term1553.getClass(), "vars", null);
        setField(term1553, term1553.getClass(), "parent", null);
        setIntField(term1553, term1553.getClass(), "depth", 0);
        setField(term1553, term1553.getClass(), "rootNode", null);
        setField(term1553, term1553.getClass(), "thisType", null);
        setBooleanField(term1553, term1553.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParentScope", argTypes, term214, args);
        assertTrue(recursiveEquals(term214, term1567));
        assertTrue(recursiveEquals(retValue, term1553));
    }

};


