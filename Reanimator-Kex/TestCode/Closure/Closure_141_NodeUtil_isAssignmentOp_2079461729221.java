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

public class NodeUtil_isAssignmentOp_2079461729221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17990;
     Object term18290;

    public NodeUtil_isAssignmentOp_2079461729221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17990, term17990.getClass(), "type", 97);
        term18290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18290, term18290.getClass(), "type", 97);
        setField(term18290, term18290.getClass(), "next", null);
        setField(term18290, term18290.getClass(), "first", null);
        setField(term18290, term18290.getClass(), "last", null);
        setField(term18290, term18290.getClass(), "propListHead", null);
        setIntField(term18290, term18290.getClass(), "sourcePosition", 0);
        setField(term18290, term18290.getClass(), "jsType", null);
        setField(term18290, term18290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17990;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term17990, term18290));
        assertTrue(recursiveEquals(retValue, true));
    }

};


