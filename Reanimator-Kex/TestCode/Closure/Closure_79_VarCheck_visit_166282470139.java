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

public class VarCheck_visit_166282470139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11509;
     Object term11601;
     Object term11611;
     Object term11612;

    public VarCheck_visit_166282470139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11509 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        term11601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term11611 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setField(term11611, term11611.getClass(), "synthesizedExternsInput", null);
        setField(term11611, term11611.getClass(), "synthesizedExternsRoot", null);
        setField(term11611, term11611.getClass(), "varsToDeclareInExterns", null);
        setField(term11611, term11611.getClass(), "compiler", null);
        setBooleanField(term11611, term11611.getClass(), "sanityCheck", false);
        setBooleanField(term11611, term11611.getClass(), "strictExternCheck", false);
        term11612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11612, term11612.getClass(), "number", 0.0);
        setIntField(term11612, term11612.getClass(), "type", 0);
        setField(term11612, term11612.getClass(), "next", null);
        setField(term11612, term11612.getClass(), "first", null);
        setField(term11612, term11612.getClass(), "last", null);
        setField(term11612, term11612.getClass(), "propListHead", null);
        setIntField(term11612, term11612.getClass(), "sourcePosition", 0);
        setField(term11612, term11612.getClass(), "jsType", null);
        setField(term11612, term11612.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11601;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term11509, args);
        assertTrue(recursiveEquals(term11509, term11611));
        assertTrue(recursiveEquals(term11601, null));
    }

};


