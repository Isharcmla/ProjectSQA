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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7661;
     Object term7731;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7661 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term7731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7731, term7731.getClass(), "type", 101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term7731;
        args[1] = null;
        try {
            callMethod(klass, "isVariableReadBeforeKill", argTypes, term7661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


