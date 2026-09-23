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
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Object;

public class CollapseVariableDeclarations_process_77566454738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22493;
     Object term22785;

    public CollapseVariableDeclarations_process_77566454738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22545 = new ArrayList();
        HashSet term22593 = new HashSet();
        term22493 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term22493, term22493.getClass(), "collapses", term22545);
        setField(term22493, term22493.getClass(), "nodesToCollapse", term22593);
        setField(term22493, term22493.getClass(), "compiler", null);
        term22785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term22877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term22947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term22785, term22785.getClass(), "type", 0);
        setField(term22785, term22785.getClass(), "parent", null);
        setField(term22877, term22877.getClass(), "next", term22947);
        setIntField(term22877, term22877.getClass(), "type", 0);
        setField(term22877, term22877.getClass(), "first", term23039);
        setField(term22785, term22785.getClass(), "first", term22877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22785;
        callMethod(klass, "process", argTypes, term22493, args);
    }

};


