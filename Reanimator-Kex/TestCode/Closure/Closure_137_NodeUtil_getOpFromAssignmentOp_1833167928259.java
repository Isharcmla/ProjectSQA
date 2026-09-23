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

public class NodeUtil_getOpFromAssignmentOp_1833167928259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20697;
     Object term20703;

    public NodeUtil_getOpFromAssignmentOp_1833167928259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20697, term20697.getClass(), "type", 89);
        term20703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20703, term20703.getClass(), "type", 89);
        setField(term20703, term20703.getClass(), "next", null);
        setField(term20703, term20703.getClass(), "first", null);
        setField(term20703, term20703.getClass(), "last", null);
        setField(term20703, term20703.getClass(), "propListHead", null);
        setIntField(term20703, term20703.getClass(), "sourcePosition", 0);
        setField(term20703, term20703.getClass(), "jsType", null);
        setField(term20703, term20703.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20697;
        Object retValue = callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term20697, term20703));
        assertTrue(recursiveEquals(retValue, 11));
    }

};


