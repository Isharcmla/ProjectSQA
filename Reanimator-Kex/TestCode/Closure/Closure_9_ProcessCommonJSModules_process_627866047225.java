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

public class ProcessCommonJSModules_process_627866047225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114519;
     Object term114691;

    public ProcessCommonJSModules_process_627866047225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114519 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term114599 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term114519, term114519.getClass(), "compiler", term114599);
        term114691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term114691, term114691.getClass(), "type", 0);
        setField(term114691, term114691.getClass(), "parent", null);
        setField(term114875, term114875.getClass(), "next", term114967);
        setIntField(term114875, term114875.getClass(), "type", 37);
        setField(term114875, term114875.getClass(), "first", null);
        setField(term114783, term114783.getClass(), "next", term114875);
        setIntField(term114783, term114783.getClass(), "type", 37);
        setField(term115059, term115059.getClass(), "next", null);
        setIntField(term115059, term115059.getClass(), "type", 37);
        setField(term115059, term115059.getClass(), "first", null);
        setField(term114783, term114783.getClass(), "first", term115059);
        setField(term114691, term114691.getClass(), "first", term114783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term114691;
        callMethod(klass, "process", argTypes, term114519, args);
        assertTrue(recursiveEquals(term114691, null));
    }

};


