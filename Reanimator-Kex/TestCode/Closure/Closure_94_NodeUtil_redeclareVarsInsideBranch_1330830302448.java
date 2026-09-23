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

public class NodeUtil_redeclareVarsInsideBranch_1330830302448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38268;
     Object term38388;

    public NodeUtil_redeclareVarsInsideBranch_1330830302448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38268, term38268.getClass(), "type", 105);
        term38388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38388, term38388.getClass(), "type", 105);
        setField(term38388, term38388.getClass(), "next", null);
        setField(term38388, term38388.getClass(), "first", null);
        setField(term38388, term38388.getClass(), "last", null);
        setField(term38388, term38388.getClass(), "propListHead", null);
        setIntField(term38388, term38388.getClass(), "sourcePosition", 0);
        setField(term38388, term38388.getClass(), "jsType", null);
        setField(term38388, term38388.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38268;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term38268, term38388));
    }

};


