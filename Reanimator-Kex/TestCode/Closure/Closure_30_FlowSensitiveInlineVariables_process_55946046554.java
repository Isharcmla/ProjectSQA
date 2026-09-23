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

public class FlowSensitiveInlineVariables_process_55946046554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12264;
     Object term12334;
     Object term13500;
     Object term13501;

    public FlowSensitiveInlineVariables_process_55946046554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12264 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term12264, term12264.getClass(), "compiler", null);
        term12334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12334, term12334.getClass(), "type", -133);
        setField(term12334, term12334.getClass(), "parent", term12404);
        term13500 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term13500, term13500.getClass(), "compiler", null);
        setField(term13500, term13500.getClass(), "cfg", null);
        setField(term13500, term13500.getClass(), "candidates", null);
        setField(term13500, term13500.getClass(), "reachingDef", null);
        setField(term13500, term13500.getClass(), "reachingUses", null);
        term13501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13501, term13501.getClass(), "type", -133);
        setField(term13501, term13501.getClass(), "next", null);
        setField(term13501, term13501.getClass(), "first", null);
        setField(term13501, term13501.getClass(), "last", null);
        setField(term13501, term13501.getClass(), "propListHead", null);
        setIntField(term13501, term13501.getClass(), "sourcePosition", 0);
        setField(term13501, term13501.getClass(), "jsType", null);
        setIntField(term13502, term13502.getClass(), "type", 0);
        setField(term13502, term13502.getClass(), "next", null);
        setField(term13502, term13502.getClass(), "first", null);
        setField(term13502, term13502.getClass(), "last", null);
        setField(term13502, term13502.getClass(), "propListHead", null);
        setIntField(term13502, term13502.getClass(), "sourcePosition", 0);
        setField(term13502, term13502.getClass(), "jsType", null);
        setField(term13502, term13502.getClass(), "parent", null);
        setField(term13501, term13501.getClass(), "parent", term13502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12334;
        callMethod(klass, "process", argTypes, term12264, args);
        assertTrue(recursiveEquals(term12264, term13500));
        assertTrue(recursiveEquals(term12334, null));
    }

};


