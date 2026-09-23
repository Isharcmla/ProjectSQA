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
import java.lang.String;
import java.lang.Object;

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11295;
     Object term11387;
     Object term11479;
     Object term11813;
     Object term11814;
     Object term11815;
     Object enum3;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11295 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term11387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term11387, term11387.getClass(), "type", 0);
        setField(term11387, term11387.getClass(), "first", null);
        term11479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term11813 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term11813, term11813.getClass(), "compiler", null);
        setField(term11813, term11813.getClass(), "liveness", null);
        term11814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11814, term11814.getClass(), "number", 0.0);
        setIntField(term11814, term11814.getClass(), "type", 0);
        setField(term11814, term11814.getClass(), "next", null);
        setField(term11814, term11814.getClass(), "first", null);
        setField(term11814, term11814.getClass(), "last", null);
        setField(term11814, term11814.getClass(), "propListHead", null);
        setIntField(term11814, term11814.getClass(), "sourcePosition", 0);
        setField(term11814, term11814.getClass(), "jsType", null);
        setField(term11814, term11814.getClass(), "parent", null);
        term11815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11815, term11815.getClass(), "number", 0.0);
        setIntField(term11815, term11815.getClass(), "type", 0);
        setField(term11815, term11815.getClass(), "next", null);
        setField(term11815, term11815.getClass(), "first", null);
        setField(term11815, term11815.getClass(), "last", null);
        setField(term11815, term11815.getClass(), "propListHead", null);
        setIntField(term11815, term11815.getClass(), "sourcePosition", 0);
        setField(term11815, term11815.getClass(), "jsType", null);
        setField(term11815, term11815.getClass(), "parent", null);
        Class<? extends Object> term11817 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term11816 = ((Class) term11817).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term11816).setAccessible(true);
        enum3 = ((Field) term11816).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term11387;
        args[1] = term11479;
        args[2] = null;
        Object retValue = callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term11295, args);
        assertTrue(recursiveEquals(term11295, term11813));
        assertTrue(recursiveEquals(term11387, term11814));
        assertTrue(recursiveEquals(term11479, null));
        assertTrue(recursiveEquals(retValue, enum3));
    }

};


