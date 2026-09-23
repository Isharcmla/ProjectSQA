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

public class DeadAssignmentsElimination_isVariableStillLiveWithinExpression_172036382752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10689;
     Object term10759;

    public DeadAssignmentsElimination_isVariableStillLiveWithinExpression_172036382752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10689 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term10759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10759, term10759.getClass(), "parent", term10829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term10759;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "isVariableStillLiveWithinExpression", argTypes, term10689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


