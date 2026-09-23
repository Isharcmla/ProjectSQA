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

public class ProcessCommonJSModules_process_627866047174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87519;
     Object term87669;

    public ProcessCommonJSModules_process_627866047174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87519 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term87599 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term87519, term87519.getClass(), "compiler", term87599);
        term87669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87669, term87669.getClass(), "type", 0);
        setField(term87669, term87669.getClass(), "parent", null);
        setField(term87879, term87879.getClass(), "next", term87949);
        setIntField(term87879, term87879.getClass(), "type", 37);
        setField(term87879, term87879.getClass(), "first", null);
        setField(term87809, term87809.getClass(), "next", term87879);
        setIntField(term87809, term87809.getClass(), "type", 37);
        setField(term87809, term87809.getClass(), "first", null);
        setField(term87739, term87739.getClass(), "next", term87809);
        setIntField(term87739, term87739.getClass(), "type", 37);
        setField(term88019, term88019.getClass(), "next", null);
        setIntField(term88019, term88019.getClass(), "type", 0);
        setField(term88019, term88019.getClass(), "first", null);
        setField(term87739, term87739.getClass(), "first", term88019);
        setField(term87669, term87669.getClass(), "first", term87739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term87669;
        callMethod(klass, "process", argTypes, term87519, args);
    }

};


