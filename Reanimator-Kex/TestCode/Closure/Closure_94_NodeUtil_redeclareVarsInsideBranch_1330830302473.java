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

public class NodeUtil_redeclareVarsInsideBranch_1330830302473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40837;
     Object term40886;

    public NodeUtil_redeclareVarsInsideBranch_1330830302473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40837, term40837.getClass(), "type", 0);
        setField(term40837, term40837.getClass(), "first", null);
        term40886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40886, term40886.getClass(), "type", 0);
        setField(term40886, term40886.getClass(), "next", null);
        setField(term40886, term40886.getClass(), "first", null);
        setField(term40886, term40886.getClass(), "last", null);
        setField(term40886, term40886.getClass(), "propListHead", null);
        setIntField(term40886, term40886.getClass(), "sourcePosition", 0);
        setField(term40886, term40886.getClass(), "jsType", null);
        setField(term40886, term40886.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40837;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term40837, term40886));
    }

};


