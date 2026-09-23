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

public class FlowSensitiveInlineVariables_enterScope_103943571111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;

    public FlowSensitiveInlineVariables_enterScope_103943571111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term80, term80.getClass(), "compiler", null);
        setField(term80, term80.getClass(), "inlinedNewDependencies", null);
        setField(term80, term80.getClass(), "cfg", null);
        setField(term80, term80.getClass(), "candidates", null);
        setField(term80, term80.getClass(), "reachingDef", null);
        setField(term80, term80.getClass(), "reachingUses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "enterScope", argTypes, term80, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


