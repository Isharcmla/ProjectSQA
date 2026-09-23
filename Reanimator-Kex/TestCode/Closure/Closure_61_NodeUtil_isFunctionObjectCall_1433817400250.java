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

public class NodeUtil_isFunctionObjectCall_1433817400250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2024;
     Object term14722;

    public NodeUtil_isFunctionObjectCall_1433817400250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2024, term2024.getClass(), "type", -1747711865);
        setIntField(term2026, term2026.getClass(), "type", -232352320);
        setIntField(term2028, term2028.getClass(), "type", 0);
        setField(term2028, term2028.getClass(), "next", null);
        setField(term2028, term2028.getClass(), "first", null);
        setField(term2028, term2028.getClass(), "last", null);
        setField(term2028, term2028.getClass(), "propListHead", null);
        setIntField(term2028, term2028.getClass(), "sourcePosition", 0);
        setField(term2028, term2028.getClass(), "jsType", null);
        setField(term2028, term2028.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "next", term2028);
        setIntField(term2031, term2031.getClass(), "type", 0);
        setField(term2031, term2031.getClass(), "next", null);
        setField(term2031, term2031.getClass(), "first", null);
        setField(term2031, term2031.getClass(), "last", null);
        setField(term2031, term2031.getClass(), "propListHead", null);
        setIntField(term2031, term2031.getClass(), "sourcePosition", 0);
        setField(term2031, term2031.getClass(), "jsType", null);
        setField(term2031, term2031.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "first", term2031);
        setIntField(term2034, term2034.getClass(), "type", 0);
        setField(term2034, term2034.getClass(), "next", null);
        setField(term2034, term2034.getClass(), "first", null);
        setField(term2034, term2034.getClass(), "last", null);
        setField(term2034, term2034.getClass(), "propListHead", null);
        setIntField(term2034, term2034.getClass(), "sourcePosition", 0);
        setField(term2034, term2034.getClass(), "jsType", null);
        setField(term2034, term2034.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "last", term2034);
        setField(term2026, term2026.getClass(), "propListHead", null);
        setIntField(term2026, term2026.getClass(), "sourcePosition", 0);
        setField(term2026, term2026.getClass(), "jsType", null);
        setField(term2026, term2026.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "next", term2026);
        setIntField(term2038, term2038.getClass(), "type", 0);
        setField(term2038, term2038.getClass(), "next", null);
        setField(term2038, term2038.getClass(), "first", null);
        setField(term2038, term2038.getClass(), "last", null);
        setField(term2038, term2038.getClass(), "propListHead", null);
        setIntField(term2038, term2038.getClass(), "sourcePosition", 0);
        setField(term2038, term2038.getClass(), "jsType", null);
        setField(term2038, term2038.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "first", term2038);
        setIntField(term2041, term2041.getClass(), "type", 0);
        setField(term2041, term2041.getClass(), "next", null);
        setField(term2041, term2041.getClass(), "first", null);
        setField(term2041, term2041.getClass(), "last", null);
        setField(term2041, term2041.getClass(), "propListHead", null);
        setIntField(term2041, term2041.getClass(), "sourcePosition", 0);
        setField(term2041, term2041.getClass(), "jsType", null);
        setField(term2041, term2041.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "last", term2041);
        setField(term2024, term2024.getClass(), "propListHead", null);
        setIntField(term2024, term2024.getClass(), "sourcePosition", 0);
        setField(term2024, term2024.getClass(), "jsType", null);
        setField(term2024, term2024.getClass(), "parent", null);
        term14722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14722, term14722.getClass(), "type", -1747711865);
        setIntField(term14723, term14723.getClass(), "type", -232352320);
        setIntField(term14724, term14724.getClass(), "type", 0);
        setField(term14724, term14724.getClass(), "next", null);
        setField(term14724, term14724.getClass(), "first", null);
        setField(term14724, term14724.getClass(), "last", null);
        setField(term14724, term14724.getClass(), "propListHead", null);
        setIntField(term14724, term14724.getClass(), "sourcePosition", 0);
        setField(term14724, term14724.getClass(), "jsType", null);
        setField(term14724, term14724.getClass(), "parent", null);
        setField(term14723, term14723.getClass(), "next", term14724);
        setIntField(term14725, term14725.getClass(), "type", 0);
        setField(term14725, term14725.getClass(), "next", null);
        setField(term14725, term14725.getClass(), "first", null);
        setField(term14725, term14725.getClass(), "last", null);
        setField(term14725, term14725.getClass(), "propListHead", null);
        setIntField(term14725, term14725.getClass(), "sourcePosition", 0);
        setField(term14725, term14725.getClass(), "jsType", null);
        setField(term14725, term14725.getClass(), "parent", null);
        setField(term14723, term14723.getClass(), "first", term14725);
        setIntField(term14726, term14726.getClass(), "type", 0);
        setField(term14726, term14726.getClass(), "next", null);
        setField(term14726, term14726.getClass(), "first", null);
        setField(term14726, term14726.getClass(), "last", null);
        setField(term14726, term14726.getClass(), "propListHead", null);
        setIntField(term14726, term14726.getClass(), "sourcePosition", 0);
        setField(term14726, term14726.getClass(), "jsType", null);
        setField(term14726, term14726.getClass(), "parent", null);
        setField(term14723, term14723.getClass(), "last", term14726);
        setField(term14723, term14723.getClass(), "propListHead", null);
        setIntField(term14723, term14723.getClass(), "sourcePosition", 0);
        setField(term14723, term14723.getClass(), "jsType", null);
        setField(term14723, term14723.getClass(), "parent", null);
        setField(term14722, term14722.getClass(), "next", term14723);
        setIntField(term14727, term14727.getClass(), "type", 0);
        setField(term14727, term14727.getClass(), "next", null);
        setField(term14727, term14727.getClass(), "first", null);
        setField(term14727, term14727.getClass(), "last", null);
        setField(term14727, term14727.getClass(), "propListHead", null);
        setIntField(term14727, term14727.getClass(), "sourcePosition", 0);
        setField(term14727, term14727.getClass(), "jsType", null);
        setField(term14727, term14727.getClass(), "parent", null);
        setField(term14722, term14722.getClass(), "first", term14727);
        setIntField(term14728, term14728.getClass(), "type", 0);
        setField(term14728, term14728.getClass(), "next", null);
        setField(term14728, term14728.getClass(), "first", null);
        setField(term14728, term14728.getClass(), "last", null);
        setField(term14728, term14728.getClass(), "propListHead", null);
        setIntField(term14728, term14728.getClass(), "sourcePosition", 0);
        setField(term14728, term14728.getClass(), "jsType", null);
        setField(term14728, term14728.getClass(), "parent", null);
        setField(term14722, term14722.getClass(), "last", term14728);
        setField(term14722, term14722.getClass(), "propListHead", null);
        setIntField(term14722, term14722.getClass(), "sourcePosition", 0);
        setField(term14722, term14722.getClass(), "jsType", null);
        setField(term14722, term14722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2024;
        callMethod(klass, "isFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2024, term14722));
    }

};


