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

public class NodeUtil_isSimpleOperator_1940912183362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36184;
     Object term42741;

    public NodeUtil_isSimpleOperator_1940912183362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36184, term36184.getClass(), "type", 19);
        term42741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42741, term42741.getClass(), "type", 19);
        setField(term42741, term42741.getClass(), "next", null);
        setField(term42741, term42741.getClass(), "first", null);
        setField(term42741, term42741.getClass(), "last", null);
        setField(term42741, term42741.getClass(), "propListHead", null);
        setIntField(term42741, term42741.getClass(), "sourcePosition", 0);
        setField(term42741, term42741.getClass(), "jsType", null);
        setField(term42741, term42741.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36184;
        callMethod(klass, "isSimpleOperator", argTypes, null, args);
        assertTrue(recursiveEquals(term36184, term42741));
    }

};


