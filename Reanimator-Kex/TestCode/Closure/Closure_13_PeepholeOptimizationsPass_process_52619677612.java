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
import java.lang.Object;
import java.util.ArrayList;

public class PeepholeOptimizationsPass_process_52619677612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term24;
     Object term51;

    public PeepholeOptimizationsPass_process_52619677612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term18, term18.getClass(), "changed", false);
        setBooleanField(term18, term18.getClass(), "traverseChildScopes", true);
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add(term18);
        term13 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term14 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 3);
        Object term15 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term13, term13.getClass(), "compiler", null);
        setField(term13, term13.getClass(), "peepholeOptimizations", term14);
        setField(term15, term15.getClass(), "states", term16);
        setIntField(term15, term15.getClass(), "currentDepth", 1162663216);
        setField(term13, term13.getClass(), "traversalState", term15);
        term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24, term24.getClass(), "type", 1484323161);
        setIntField(term26, term26.getClass(), "type", 391863371);
        setIntField(term28, term28.getClass(), "type", -1922583790);
        setIntField(term30, term30.getClass(), "type", -616727354);
        setIntField(term32, term32.getClass(), "type", -1955890973);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setIntField(term35, term35.getClass(), "type", -2038273078);
        setField(term35, term35.getClass(), "next", null);
        setField(term35, term35.getClass(), "first", null);
        setField(term35, term35.getClass(), "last", term32);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term30, term30.getClass(), "first", term35);
        setField(term30, term30.getClass(), "last", term28);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setField(term28, term28.getClass(), "first", term32);
        setIntField(term39, term39.getClass(), "type", -1339778481);
        setIntField(term41, term41.getClass(), "type", 1725571209);
        setField(term41, term41.getClass(), "next", null);
        setField(term41, term41.getClass(), "first", term35);
        setField(term41, term41.getClass(), "last", term30);
        setField(term41, term41.getClass(), "propListHead", null);
        setIntField(term41, term41.getClass(), "sourcePosition", 0);
        setField(term41, term41.getClass(), "jsType", null);
        setField(term41, term41.getClass(), "parent", null);
        setField(term39, term39.getClass(), "next", term41);
        setField(term39, term39.getClass(), "first", term26);
        setField(term39, term39.getClass(), "last", term26);
        setField(term39, term39.getClass(), "propListHead", null);
        setIntField(term39, term39.getClass(), "sourcePosition", 0);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        setField(term28, term28.getClass(), "last", term39);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        setField(term26, term26.getClass(), "next", term28);
        setIntField(term46, term46.getClass(), "type", -522618178);
        setField(term46, term46.getClass(), "next", term39);
        setField(term46, term46.getClass(), "first", term41);
        setField(term46, term46.getClass(), "last", term24);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term26, term26.getClass(), "first", term46);
        setField(term26, term26.getClass(), "last", term46);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term24, term24.getClass(), "next", term26);
        setField(term24, term24.getClass(), "first", term30);
        setField(term24, term24.getClass(), "last", term32);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51, term51.getClass(), "type", 1134449235);
        setIntField(term53, term53.getClass(), "type", -883034806);
        setIntField(term55, term55.getClass(), "type", 1585847225);
        setIntField(term57, term57.getClass(), "type", 597278769);
        setIntField(term59, term59.getClass(), "type", -1685132342);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term57, term57.getClass(), "next", term59);
        setIntField(term62, term62.getClass(), "type", -1456670397);
        setField(term62, term62.getClass(), "next", null);
        setField(term62, term62.getClass(), "first", null);
        setField(term62, term62.getClass(), "last", term59);
        setField(term62, term62.getClass(), "propListHead", null);
        setIntField(term62, term62.getClass(), "sourcePosition", 0);
        setField(term62, term62.getClass(), "jsType", null);
        setField(term62, term62.getClass(), "parent", null);
        setField(term57, term57.getClass(), "first", term62);
        setField(term57, term57.getClass(), "last", term55);
        setField(term57, term57.getClass(), "propListHead", null);
        setIntField(term57, term57.getClass(), "sourcePosition", 0);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term55, term55.getClass(), "next", term57);
        setField(term55, term55.getClass(), "first", term59);
        setIntField(term66, term66.getClass(), "type", 1048535127);
        setIntField(term68, term68.getClass(), "type", -655067527);
        setField(term68, term68.getClass(), "next", null);
        setField(term68, term68.getClass(), "first", term62);
        setField(term68, term68.getClass(), "last", term57);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term66, term66.getClass(), "next", term68);
        setField(term66, term66.getClass(), "first", term53);
        setField(term66, term66.getClass(), "last", term53);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
        setField(term55, term55.getClass(), "last", term66);
        setField(term55, term55.getClass(), "propListHead", null);
        setIntField(term55, term55.getClass(), "sourcePosition", 0);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        setField(term53, term53.getClass(), "next", term55);
        setIntField(term73, term73.getClass(), "type", -6029667);
        setField(term73, term73.getClass(), "next", term66);
        setField(term73, term73.getClass(), "first", term68);
        setField(term73, term73.getClass(), "last", term51);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term53, term53.getClass(), "first", term73);
        setField(term53, term53.getClass(), "last", term73);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term51, term51.getClass(), "next", term53);
        setField(term51, term51.getClass(), "first", term57);
        setField(term51, term51.getClass(), "last", term59);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term24;
        args[1] = term51;
        try {
            callMethod(klass, "process", argTypes, term13, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


