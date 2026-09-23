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

public class ProcessCommonJSModules_process_62786604749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26623;
     Object term26773;

    public ProcessCommonJSModules_process_62786604749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26623 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term26703 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26623, term26623.getClass(), "compiler", term26703);
        term26773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26773, term26773.getClass(), "type", 0);
        setField(term26773, term26773.getClass(), "parent", null);
        setField(term26913, term26913.getClass(), "next", term26983);
        setIntField(term26913, term26913.getClass(), "type", 33);
        setField(term26913, term26913.getClass(), "first", null);
        setField(term26843, term26843.getClass(), "next", term26913);
        setIntField(term26843, term26843.getClass(), "type", 0);
        setField(term26843, term26843.getClass(), "first", null);
        setField(term26773, term26773.getClass(), "first", term26843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26773;
        try {
            callMethod(klass, "process", argTypes, term26623, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


