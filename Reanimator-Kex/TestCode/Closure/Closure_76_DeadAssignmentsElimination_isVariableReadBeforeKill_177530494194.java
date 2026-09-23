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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19705;
     Object term19775;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19705 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term19775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19775, term19775.getClass(), "type", 101);
        setField(term19775, term19775.getClass(), "first", term19775);
        setField(term19775, term19775.getClass(), "next", term19775);
        setField(term19775, term19775.getClass(), "last", term19845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term19775;
        args[1] = null;
        try {
            callMethod(klass, "isVariableReadBeforeKill", argTypes, term19705, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


