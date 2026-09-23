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

public class RemoveUnusedVars_traverseNode_1212081551106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29458;
     Object term29550;

    public RemoveUnusedVars_traverseNode_1212081551106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29458 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term29550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term29550, term29550.getClass(), "type", 100);
        setIntField(term29642, term29642.getClass(), "type", 269008064);
        setIntField(term29734, term29734.getClass(), "type", 269008064);
        setField(term29734, term29734.getClass(), "first", null);
        setField(term29734, term29734.getClass(), "next", null);
        setField(term29642, term29642.getClass(), "first", term29734);
        setIntField(term29826, term29826.getClass(), "type", 100);
        setField(term29826, term29826.getClass(), "first", term29734);
        setField(term29642, term29642.getClass(), "next", term29826);
        setField(term29550, term29550.getClass(), "first", term29642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term29550;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term29458, args);
    }

};


