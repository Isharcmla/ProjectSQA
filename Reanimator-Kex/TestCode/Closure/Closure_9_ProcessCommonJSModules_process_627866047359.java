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

public class ProcessCommonJSModules_process_627866047359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190862;
     Object term191012;

    public ProcessCommonJSModules_process_627866047359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190862 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term190942 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term190862, term190862.getClass(), "compiler", term190942);
        term191012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191012, term191012.getClass(), "type", 0);
        setField(term191012, term191012.getClass(), "parent", null);
        setField(term191152, term191152.getClass(), "next", term191222);
        setIntField(term191152, term191152.getClass(), "type", 33);
        setField(term191152, term191152.getClass(), "first", null);
        setField(term191082, term191082.getClass(), "next", term191152);
        setIntField(term191082, term191082.getClass(), "type", 37);
        setField(term191292, term191292.getClass(), "next", null);
        setIntField(term191292, term191292.getClass(), "type", 0);
        setField(term191292, term191292.getClass(), "first", null);
        setField(term191082, term191082.getClass(), "first", term191292);
        setField(term191012, term191012.getClass(), "first", term191082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term191012;
        try {
            callMethod(klass, "process", argTypes, term190862, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


