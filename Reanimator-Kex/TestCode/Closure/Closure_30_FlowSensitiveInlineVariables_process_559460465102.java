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

public class FlowSensitiveInlineVariables_process_559460465102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33205;
     Object term33297;

    public FlowSensitiveInlineVariables_process_559460465102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33205 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term33205, term33205.getClass(), "compiler", null);
        term33297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33297, term33297.getClass(), "type", -133);
        setField(term33297, term33297.getClass(), "parent", term33389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33297;
        callMethod(klass, "process", argTypes, term33205, args);
    }

};


