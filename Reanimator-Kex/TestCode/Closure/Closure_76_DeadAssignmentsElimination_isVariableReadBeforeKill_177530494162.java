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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13478;
     Object term13548;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13478 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term13548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13548, term13548.getClass(), "type", 101);
        setField(term13548, term13548.getClass(), "first", term13548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term13548;
        args[1] = null;
        try {
            callMethod(klass, "isVariableReadBeforeKill", argTypes, term13478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


