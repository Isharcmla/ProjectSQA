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
import java.lang.Object;

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21223;
     Object term21315;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21223 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term21315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21315, term21315.getClass(), "type", 100);
        setField(term21315, term21315.getClass(), "first", term21407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term21315;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term21223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


