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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13274;
     Object term13344;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13274 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term13344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13344, term13344.getClass(), "type", 100);
        setField(term13344, term13344.getClass(), "first", term13344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term13344;
        args[1] = null;
        try {
            callMethod(klass, "isVariableReadBeforeKill", argTypes, term13274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


