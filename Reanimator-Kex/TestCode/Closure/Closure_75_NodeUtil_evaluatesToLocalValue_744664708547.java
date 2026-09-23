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

public class NodeUtil_evaluatesToLocalValue_744664708547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42685;
     Object term82131;

    public NodeUtil_evaluatesToLocalValue_744664708547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42685, term42685.getClass(), "type", 51);
        term82131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82131, term82131.getClass(), "type", 51);
        setField(term82131, term82131.getClass(), "next", null);
        setField(term82131, term82131.getClass(), "first", null);
        setField(term82131, term82131.getClass(), "last", null);
        setField(term82131, term82131.getClass(), "propListHead", null);
        setIntField(term82131, term82131.getClass(), "sourcePosition", 0);
        setField(term82131, term82131.getClass(), "jsType", null);
        setField(term82131, term82131.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42685;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term42685, term82131));
    }

};


