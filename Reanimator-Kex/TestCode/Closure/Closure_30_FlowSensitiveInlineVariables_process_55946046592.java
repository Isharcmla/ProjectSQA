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

public class FlowSensitiveInlineVariables_process_55946046592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29146;
     Object term29238;

    public FlowSensitiveInlineVariables_process_55946046592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29146 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term29146, term29146.getClass(), "compiler", null);
        term29238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term29238, term29238.getClass(), "type", 0);
        setField(term29238, term29238.getClass(), "parent", null);
        setField(term29422, term29422.getClass(), "next", null);
        setIntField(term29422, term29422.getClass(), "type", 132);
        setField(term29330, term29330.getClass(), "next", term29422);
        setIntField(term29330, term29330.getClass(), "type", 0);
        setField(term29514, term29514.getClass(), "next", null);
        setIntField(term29514, term29514.getClass(), "type", 0);
        setField(term29514, term29514.getClass(), "first", null);
        setField(term29330, term29330.getClass(), "first", term29514);
        setField(term29238, term29238.getClass(), "first", term29330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29238;
        callMethod(klass, "process", argTypes, term29146, args);
    }

};


