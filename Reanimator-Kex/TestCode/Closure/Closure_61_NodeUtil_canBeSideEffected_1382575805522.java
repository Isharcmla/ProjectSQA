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
import java.lang.Object;

public class NodeUtil_canBeSideEffected_1382575805522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54501;
     Object term55655;

    public NodeUtil_canBeSideEffected_1382575805522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54501, term54501.getClass(), "type", 0);
        setIntField(term54571, term54571.getClass(), "type", 37);
        setField(term54501, term54501.getClass(), "first", term54571);
        term55655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55655, term55655.getClass(), "type", 0);
        setField(term55655, term55655.getClass(), "next", null);
        setIntField(term55656, term55656.getClass(), "type", 37);
        setField(term55656, term55656.getClass(), "next", null);
        setField(term55656, term55656.getClass(), "first", null);
        setField(term55656, term55656.getClass(), "last", null);
        setField(term55656, term55656.getClass(), "propListHead", null);
        setIntField(term55656, term55656.getClass(), "sourcePosition", 0);
        setField(term55656, term55656.getClass(), "jsType", null);
        setField(term55656, term55656.getClass(), "parent", null);
        setField(term55655, term55655.getClass(), "first", term55656);
        setField(term55655, term55655.getClass(), "last", null);
        setField(term55655, term55655.getClass(), "propListHead", null);
        setIntField(term55655, term55655.getClass(), "sourcePosition", 0);
        setField(term55655, term55655.getClass(), "jsType", null);
        setField(term55655, term55655.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54501;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term54501, term55655));
    }

};


