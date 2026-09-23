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

public class FlowSensitiveInlineVariables_visit_75596094614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;
     Object term1380;

    public FlowSensitiveInlineVariables_visit_75596094614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term408, term408.getClass(), "compiler", null);
        setField(term408, term408.getClass(), "inlinedNewDependencies", null);
        setField(term408, term408.getClass(), "cfg", null);
        setField(term408, term408.getClass(), "candidates", null);
        setField(term408, term408.getClass(), "reachingDef", null);
        setField(term408, term408.getClass(), "reachingUses", null);
        term1380 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term1380, term1380.getClass(), "compiler", null);
        setField(term1380, term1380.getClass(), "inlinedNewDependencies", null);
        setField(term1380, term1380.getClass(), "cfg", null);
        setField(term1380, term1380.getClass(), "candidates", null);
        setField(term1380, term1380.getClass(), "reachingDef", null);
        setField(term1380, term1380.getClass(), "reachingUses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term408, args);
        assertTrue(recursiveEquals(term408, term1380));
    }

};


