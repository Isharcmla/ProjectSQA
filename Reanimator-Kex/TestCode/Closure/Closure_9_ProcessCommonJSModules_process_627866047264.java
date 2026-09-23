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

public class ProcessCommonJSModules_process_627866047264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136239;
     Object term136331;

    public ProcessCommonJSModules_process_627866047264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136239 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term136239, term136239.getClass(), "compiler", null);
        term136331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term136331, term136331.getClass(), "type", 0);
        setField(term136331, term136331.getClass(), "parent", null);
        setField(term136515, term136515.getClass(), "next", term136585);
        setIntField(term136515, term136515.getClass(), "type", 33);
        setField(term136515, term136515.getClass(), "first", null);
        setField(term136423, term136423.getClass(), "next", term136515);
        setIntField(term136423, term136423.getClass(), "type", 0);
        setField(term136677, term136677.getClass(), "next", null);
        setIntField(term136677, term136677.getClass(), "type", 0);
        setField(term136677, term136677.getClass(), "first", null);
        setField(term136423, term136423.getClass(), "first", term136677);
        setField(term136331, term136331.getClass(), "first", term136423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term136331;
        callMethod(klass, "process", argTypes, term136239, args);
    }

};


