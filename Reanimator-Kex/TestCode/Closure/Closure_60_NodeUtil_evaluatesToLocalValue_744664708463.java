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

public class NodeUtil_evaluatesToLocalValue_744664708463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70833;
     Object term72003;

    public NodeUtil_evaluatesToLocalValue_744664708463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70833, term70833.getClass(), "type", 102);
        term72003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72003, term72003.getClass(), "type", 102);
        setField(term72003, term72003.getClass(), "next", null);
        setField(term72003, term72003.getClass(), "first", null);
        setField(term72003, term72003.getClass(), "last", null);
        setField(term72003, term72003.getClass(), "propListHead", null);
        setIntField(term72003, term72003.getClass(), "sourcePosition", 0);
        setField(term72003, term72003.getClass(), "jsType", null);
        setField(term72003, term72003.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term70833;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term70833, term72003));
    }

};


