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

public class NodeTraversal_formatNodePosition_146660670270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4179;
     Object term10022;

    public NodeTraversal_formatNodePosition_146660670270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4179 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term4179, term4179.getClass(), "compiler", null);
        setField(term4179, term4179.getClass(), "callback", null);
        setField(term4179, term4179.getClass(), "curNode", null);
        setField(term4179, term4179.getClass(), "scopes", null);
        setField(term4179, term4179.getClass(), "scopeRoots", null);
        setField(term4179, term4179.getClass(), "cfgs", null);
        setField(term4179, term4179.getClass(), "sourceName", null);
        setField(term4179, term4179.getClass(), "inputId", null);
        setField(term4179, term4179.getClass(), "scopeCreator", null);
        setField(term4179, term4179.getClass(), "scopeCallback", null);
        term10022 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term10022, term10022.getClass(), "compiler", null);
        setField(term10022, term10022.getClass(), "callback", null);
        setField(term10022, term10022.getClass(), "curNode", null);
        setField(term10022, term10022.getClass(), "scopes", null);
        setField(term10022, term10022.getClass(), "scopeRoots", null);
        setField(term10022, term10022.getClass(), "cfgs", null);
        setField(term10022, term10022.getClass(), "sourceName", null);
        setField(term10022, term10022.getClass(), "inputId", null);
        setField(term10022, term10022.getClass(), "scopeCreator", null);
        setField(term10022, term10022.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "formatNodePosition", argTypes, term4179, args);
        assertTrue(recursiveEquals(term4179, term10022));
        assertTrue(recursiveEquals(retValue, "[source unknown]\n"));
    }

};


