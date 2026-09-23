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

public class Scope_getDepth_21168994129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;
     Object term1600;

    public Scope_getDepth_21168994129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term87 = new HashMap();
        term86 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term100 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86, term86.getClass(), "vars", term87);
        setField(term100, term100.getClass(), "vars", null);
        setField(term100, term100.getClass(), "parent", null);
        setIntField(term100, term100.getClass(), "depth", 0);
        setField(term100, term100.getClass(), "rootNode", null);
        setField(term100, term100.getClass(), "thisType", null);
        setBooleanField(term100, term100.getClass(), "isBottom", false);
        setField(term100, term100.getClass(), "arguments", null);
        setField(term86, term86.getClass(), "parent", term100);
        setIntField(term86, term86.getClass(), "depth", -1968847291);
        setIntField(term104, term104.getClass(), "type", 0);
        setField(term104, term104.getClass(), "next", null);
        setField(term104, term104.getClass(), "first", null);
        setField(term104, term104.getClass(), "last", null);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term86, term86.getClass(), "rootNode", term104);
        setField(term86, term86.getClass(), "thisType", null);
        setBooleanField(term86, term86.getClass(), "isBottom", false);
        setField(term86, term86.getClass(), "arguments", null);
        HashMap term1601 = new HashMap();
        term1600 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1602 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1600, term1600.getClass(), "vars", term1601);
        setField(term1602, term1602.getClass(), "vars", null);
        setField(term1602, term1602.getClass(), "parent", null);
        setIntField(term1602, term1602.getClass(), "depth", 0);
        setField(term1602, term1602.getClass(), "rootNode", null);
        setField(term1602, term1602.getClass(), "thisType", null);
        setBooleanField(term1602, term1602.getClass(), "isBottom", false);
        setField(term1602, term1602.getClass(), "arguments", null);
        setField(term1600, term1600.getClass(), "parent", term1602);
        setIntField(term1600, term1600.getClass(), "depth", -1968847291);
        setIntField(term1603, term1603.getClass(), "type", 0);
        setField(term1603, term1603.getClass(), "next", null);
        setField(term1603, term1603.getClass(), "first", null);
        setField(term1603, term1603.getClass(), "last", null);
        setField(term1603, term1603.getClass(), "propListHead", null);
        setIntField(term1603, term1603.getClass(), "sourcePosition", 0);
        setField(term1603, term1603.getClass(), "jsType", null);
        setField(term1603, term1603.getClass(), "parent", null);
        setField(term1600, term1600.getClass(), "rootNode", term1603);
        setField(term1600, term1600.getClass(), "thisType", null);
        setBooleanField(term1600, term1600.getClass(), "isBottom", false);
        setField(term1600, term1600.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDepth", argTypes, term86, args);
        assertTrue(recursiveEquals(term86, term1600));
        assertTrue(recursiveEquals(retValue, -1968847291));
    }

};


