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
import java.lang.Object;

public class NodeUtil_redeclareVarsInsideBranch_1330830302536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58623;

    public NodeUtil_redeclareVarsInsideBranch_1330830302536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58623, term58623.getClass(), "type", 0);
        setIntField(term58693, term58693.getClass(), "type", 0);
        setField(term58693, term58693.getClass(), "first", null);
        setField(term58693, term58693.getClass(), "next", term58693);
        setField(term58623, term58623.getClass(), "first", term58693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58623;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
    }

};


