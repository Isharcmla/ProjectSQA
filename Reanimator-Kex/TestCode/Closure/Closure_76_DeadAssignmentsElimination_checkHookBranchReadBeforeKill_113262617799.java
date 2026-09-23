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

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21556;
     Object term21648;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21556 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term21648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21648, term21648.getClass(), "type", 101);
        setField(term21740, term21740.getClass(), "next", term21832);
        setField(term21648, term21648.getClass(), "first", term21740);
        setField(term21648, term21648.getClass(), "last", term21924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term21648;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term21556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


