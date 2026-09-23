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

public class ProcessCommonJSModules_process_627866047208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106336;
     Object term106406;

    public ProcessCommonJSModules_process_627866047208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106336 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term106336, term106336.getClass(), "compiler", null);
        term106406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106406, term106406.getClass(), "type", 0);
        setField(term106406, term106406.getClass(), "parent", null);
        setField(term106476, term106476.getClass(), "next", null);
        setIntField(term106476, term106476.getClass(), "type", 0);
        setField(term106686, term106686.getClass(), "next", term106756);
        setIntField(term106686, term106686.getClass(), "type", 37);
        setField(term106686, term106686.getClass(), "first", null);
        setField(term106616, term106616.getClass(), "next", term106686);
        setIntField(term106616, term106616.getClass(), "type", 37);
        setField(term106616, term106616.getClass(), "first", null);
        setField(term106546, term106546.getClass(), "next", term106616);
        setIntField(term106546, term106546.getClass(), "type", 37);
        setField(term106546, term106546.getClass(), "first", null);
        setField(term106476, term106476.getClass(), "first", term106546);
        setField(term106406, term106406.getClass(), "first", term106476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term106406;
        callMethod(klass, "process", argTypes, term106336, args);
    }

};


