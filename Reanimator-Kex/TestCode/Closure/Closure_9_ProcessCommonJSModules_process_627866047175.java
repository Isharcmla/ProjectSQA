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

public class ProcessCommonJSModules_process_627866047175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88448;
     Object term88518;

    public ProcessCommonJSModules_process_627866047175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88448 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term88448, term88448.getClass(), "compiler", null);
        term88518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88518, term88518.getClass(), "type", 0);
        setField(term88518, term88518.getClass(), "parent", null);
        setField(term88588, term88588.getClass(), "next", term88658);
        setIntField(term88588, term88588.getClass(), "type", 37);
        setField(term88868, term88868.getClass(), "next", null);
        setIntField(term88868, term88868.getClass(), "type", 0);
        setField(term88868, term88868.getClass(), "first", null);
        setField(term88798, term88798.getClass(), "next", term88868);
        setIntField(term88798, term88798.getClass(), "type", 37);
        setField(term88798, term88798.getClass(), "first", null);
        setField(term88728, term88728.getClass(), "next", term88798);
        setIntField(term88728, term88728.getClass(), "type", 37);
        setField(term88728, term88728.getClass(), "first", null);
        setField(term88588, term88588.getClass(), "first", term88728);
        setField(term88518, term88518.getClass(), "first", term88588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term88518;
        callMethod(klass, "process", argTypes, term88448, args);
    }

};


