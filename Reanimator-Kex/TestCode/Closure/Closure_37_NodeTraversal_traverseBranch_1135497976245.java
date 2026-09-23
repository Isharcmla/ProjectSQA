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

public class NodeTraversal_traverseBranch_1135497976245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64204;
     Object term64374;

    public NodeTraversal_traverseBranch_1135497976245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64204 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term64304 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term64204, term64204.getClass(), "curNode", null);
        setField(term64204, term64204.getClass(), "callback", term64304);
        term64374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64374, term64374.getClass(), "type", -133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term64374;
        args[1] = null;
        callMethod(klass, "traverseBranch", argTypes, term64204, args);
    }

};


