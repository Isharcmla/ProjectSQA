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

public class NodeUtil_redeclareVarsInsideBranch_1330830302554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43615;
     Object term82570;

    public NodeUtil_redeclareVarsInsideBranch_1330830302554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43615, term43615.getClass(), "type", 0);
        setField(term43615, term43615.getClass(), "first", null);
        term82570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82570, term82570.getClass(), "type", 0);
        setField(term82570, term82570.getClass(), "next", null);
        setField(term82570, term82570.getClass(), "first", null);
        setField(term82570, term82570.getClass(), "last", null);
        setField(term82570, term82570.getClass(), "propListHead", null);
        setIntField(term82570, term82570.getClass(), "sourcePosition", 0);
        setField(term82570, term82570.getClass(), "jsType", null);
        setField(term82570, term82570.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43615;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term43615, term82570));
    }

};


