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

public class CheckGlobalThis_visit_87391892335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10697;
     Object term10802;
     Object term10810;
     Object term10811;

    public CheckGlobalThis_visit_87391892335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10697 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term10802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10802, term10802.getClass(), "type", -43);
        setField(term10697, term10697.getClass(), "assignLhsChild", term10802);
        term10810 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term10810, term10810.getClass(), "compiler", null);
        setField(term10810, term10810.getClass(), "level", null);
        setField(term10810, term10810.getClass(), "assignLhsChild", null);
        term10811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10811, term10811.getClass(), "type", -43);
        setField(term10811, term10811.getClass(), "next", null);
        setField(term10811, term10811.getClass(), "first", null);
        setField(term10811, term10811.getClass(), "last", null);
        setField(term10811, term10811.getClass(), "propListHead", null);
        setIntField(term10811, term10811.getClass(), "sourcePosition", 0);
        setField(term10811, term10811.getClass(), "jsType", null);
        setField(term10811, term10811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term10802;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term10697, args);
        assertTrue(recursiveEquals(term10697, term10810));
        assertTrue(recursiveEquals(term10802, null));
    }

};


