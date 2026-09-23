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

public class ProcessCommonJSModules_process_62786604794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50483;
     Object term50655;

    public ProcessCommonJSModules_process_62786604794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50483 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term50563 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term50483, term50483.getClass(), "compiler", term50563);
        term50655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50655, term50655.getClass(), "type", 0);
        setField(term50655, term50655.getClass(), "parent", null);
        setField(term50795, term50795.getClass(), "next", term50865);
        setIntField(term50795, term50795.getClass(), "type", 37);
        setField(term50795, term50795.getClass(), "first", null);
        setField(term50725, term50725.getClass(), "next", term50795);
        setIntField(term50725, term50725.getClass(), "type", 0);
        setField(term50725, term50725.getClass(), "first", null);
        setField(term50655, term50655.getClass(), "first", term50725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term50655;
        callMethod(klass, "process", argTypes, term50483, args);
    }

};


