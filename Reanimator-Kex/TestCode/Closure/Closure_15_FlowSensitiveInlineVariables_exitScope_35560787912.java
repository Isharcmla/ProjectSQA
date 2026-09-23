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

public class FlowSensitiveInlineVariables_exitScope_35560787912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;
     Object term1019;

    public FlowSensitiveInlineVariables_exitScope_35560787912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term291, term291.getClass(), "compiler", null);
        setField(term291, term291.getClass(), "cfg", null);
        setField(term291, term291.getClass(), "candidates", null);
        setField(term291, term291.getClass(), "reachingDef", null);
        setField(term291, term291.getClass(), "reachingUses", null);
        term1019 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term1019, term1019.getClass(), "compiler", null);
        setField(term1019, term1019.getClass(), "cfg", null);
        setField(term1019, term1019.getClass(), "candidates", null);
        setField(term1019, term1019.getClass(), "reachingDef", null);
        setField(term1019, term1019.getClass(), "reachingUses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exitScope", argTypes, term291, args);
        assertTrue(recursiveEquals(term291, term1019));
    }

};


