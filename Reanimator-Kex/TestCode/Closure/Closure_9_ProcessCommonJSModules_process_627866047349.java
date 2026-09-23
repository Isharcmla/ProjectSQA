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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183418;
     Object term183590;

    public ProcessCommonJSModules_process_627866047349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183418 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term183498 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term183418, term183418.getClass(), "compiler", term183498);
        term183590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term183590, term183590.getClass(), "type", 0);
        setField(term183590, term183590.getClass(), "parent", null);
        setField(term183866, term183866.getClass(), "next", term183936);
        setIntField(term183866, term183866.getClass(), "type", 33);
        setField(term183866, term183866.getClass(), "first", null);
        setField(term183774, term183774.getClass(), "next", term183866);
        setIntField(term183774, term183774.getClass(), "type", 37);
        setField(term183774, term183774.getClass(), "first", null);
        setField(term183682, term183682.getClass(), "next", term183774);
        setIntField(term183682, term183682.getClass(), "type", 0);
        setField(term184028, term184028.getClass(), "next", null);
        setIntField(term184028, term184028.getClass(), "type", 0);
        setField(term184028, term184028.getClass(), "first", null);
        setField(term183682, term183682.getClass(), "first", term184028);
        setField(term183590, term183590.getClass(), "first", term183682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term183590;
        try {
            callMethod(klass, "process", argTypes, term183418, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


