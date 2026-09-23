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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202584;
     Object term202676;

    public ProcessCommonJSModules_process_627866047375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202584 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term202584, term202584.getClass(), "compiler", null);
        term202676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term202768 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term202860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term202952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term203044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term202676, term202676.getClass(), "type", 0);
        setField(term202676, term202676.getClass(), "parent", null);
        setField(term202768, term202768.getClass(), "next", null);
        setIntField(term202768, term202768.getClass(), "type", 0);
        setField(term203044, term203044.getClass(), "next", term202952);
        setIntField(term203044, term203044.getClass(), "type", 33);
        setField(term203044, term203044.getClass(), "first", null);
        setField(term202952, term202952.getClass(), "next", term203044);
        setIntField(term202952, term202952.getClass(), "type", 37);
        setField(term202952, term202952.getClass(), "first", null);
        setField(term202860, term202860.getClass(), "next", term202952);
        setIntField(term202860, term202860.getClass(), "type", 0);
        setField(term202860, term202860.getClass(), "first", null);
        setField(term202768, term202768.getClass(), "first", term202860);
        setField(term202676, term202676.getClass(), "first", term202768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term202676;
        try {
            callMethod(klass, "process", argTypes, term202584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


