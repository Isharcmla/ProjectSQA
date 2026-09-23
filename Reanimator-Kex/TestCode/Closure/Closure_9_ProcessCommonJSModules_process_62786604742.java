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

public class ProcessCommonJSModules_process_62786604742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11298;
     Object term11448;

    public ProcessCommonJSModules_process_62786604742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11298 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term11378 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11298, term11298.getClass(), "compiler", term11378);
        term11448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11448, term11448.getClass(), "type", 0);
        setField(term11448, term11448.getClass(), "parent", null);
        setField(term11518, term11518.getClass(), "next", term11588);
        setIntField(term11518, term11518.getClass(), "type", 0);
        setField(term11658, term11658.getClass(), "next", term11728);
        setIntField(term11658, term11658.getClass(), "type", 33);
        setField(term11658, term11658.getClass(), "first", null);
        setField(term11518, term11518.getClass(), "first", term11658);
        setField(term11448, term11448.getClass(), "first", term11518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11448;
        try {
            callMethod(klass, "process", argTypes, term11298, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


