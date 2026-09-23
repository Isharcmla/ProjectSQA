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

public class ProcessCommonJSModules_process_62786604792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38058;
     Object term38230;

    public ProcessCommonJSModules_process_62786604792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38058 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term38138 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38058, term38058.getClass(), "compiler", term38138);
        term38230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term38230, term38230.getClass(), "type", 0);
        setField(term38230, term38230.getClass(), "parent", null);
        setField(term38392, term38392.getClass(), "next", term38484);
        setIntField(term38392, term38392.getClass(), "type", 33);
        setField(term38392, term38392.getClass(), "first", null);
        setField(term38322, term38322.getClass(), "next", term38392);
        setIntField(term38322, term38322.getClass(), "type", 37);
        setField(term38576, term38576.getClass(), "next", null);
        setIntField(term38576, term38576.getClass(), "type", 0);
        setField(term38576, term38576.getClass(), "first", null);
        setField(term38322, term38322.getClass(), "first", term38576);
        setField(term38230, term38230.getClass(), "first", term38322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term38230;
        try {
            callMethod(klass, "process", argTypes, term38058, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


