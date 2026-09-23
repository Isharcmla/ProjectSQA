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

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20620;
     Object term20712;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20620 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term20712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20712, term20712.getClass(), "type", 99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term20712;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term20620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


