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

public class ProcessCommonJSModules_process_627866047269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138324;
     Object term138474;

    public ProcessCommonJSModules_process_627866047269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138324 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term138404 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term138324, term138324.getClass(), "compiler", term138404);
        term138474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138750 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term138474, term138474.getClass(), "type", 0);
        setField(term138474, term138474.getClass(), "parent", null);
        setField(term138566, term138566.getClass(), "next", null);
        setIntField(term138566, term138566.getClass(), "type", 0);
        setField(term138750, term138750.getClass(), "next", null);
        setIntField(term138750, term138750.getClass(), "type", 37);
        setField(term138750, term138750.getClass(), "first", null);
        setField(term138658, term138658.getClass(), "next", term138750);
        setIntField(term138658, term138658.getClass(), "type", 0);
        setField(term138658, term138658.getClass(), "first", null);
        setField(term138566, term138566.getClass(), "first", term138658);
        setField(term138474, term138474.getClass(), "first", term138566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term138474;
        callMethod(klass, "process", argTypes, term138324, args);
        assertTrue(recursiveEquals(term138474, null));
    }

};


