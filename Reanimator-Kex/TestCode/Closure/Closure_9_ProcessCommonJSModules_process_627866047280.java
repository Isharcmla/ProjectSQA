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

public class ProcessCommonJSModules_process_627866047280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144178;
     Object term144328;

    public ProcessCommonJSModules_process_627866047280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144178 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term144258 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term144178, term144178.getClass(), "compiler", term144258);
        term144328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144328, term144328.getClass(), "type", 0);
        setField(term144328, term144328.getClass(), "parent", null);
        setField(term144398, term144398.getClass(), "next", term144468);
        setIntField(term144398, term144398.getClass(), "type", 37);
        setField(term144608, term144608.getClass(), "next", null);
        setIntField(term144608, term144608.getClass(), "type", 0);
        setField(term144608, term144608.getClass(), "first", null);
        setField(term144538, term144538.getClass(), "next", term144608);
        setIntField(term144538, term144538.getClass(), "type", 37);
        setField(term144538, term144538.getClass(), "first", null);
        setField(term144398, term144398.getClass(), "first", term144538);
        setField(term144328, term144328.getClass(), "first", term144398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term144328;
        callMethod(klass, "process", argTypes, term144178, args);
    }

};


