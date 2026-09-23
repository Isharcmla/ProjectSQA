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

public class NodeTraversal_report_118094907695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7067;

    public NodeTraversal_report_118094907695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7067 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term7067, term7067.getClass(), "compiler", null);
        setField(term7067, term7067.getClass(), "callback", null);
        setField(term7067, term7067.getClass(), "curNode", null);
        setField(term7067, term7067.getClass(), "scopes", null);
        setField(term7067, term7067.getClass(), "scopeRoots", null);
        setField(term7067, term7067.getClass(), "cfgs", null);
        setField(term7067, term7067.getClass(), "sourceName", null);
        setField(term7067, term7067.getClass(), "inputId", null);
        setField(term7067, term7067.getClass(), "scopeCreator", null);
        setField(term7067, term7067.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "report", argTypes, term7067, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


