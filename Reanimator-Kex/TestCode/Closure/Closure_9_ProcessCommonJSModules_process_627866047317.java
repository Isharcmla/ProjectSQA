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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162925;
     Object term162995;

    public ProcessCommonJSModules_process_627866047317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162925 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term162925, term162925.getClass(), "compiler", null);
        term162995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term162995, term162995.getClass(), "type", 0);
        setField(term162995, term162995.getClass(), "parent", null);
        setField(term163205, term163205.getClass(), "next", term163275);
        setIntField(term163205, term163205.getClass(), "type", 33);
        setField(term163205, term163205.getClass(), "first", null);
        setField(term163135, term163135.getClass(), "next", term163205);
        setIntField(term163135, term163135.getClass(), "type", 37);
        setField(term163135, term163135.getClass(), "first", null);
        setField(term163065, term163065.getClass(), "next", term163135);
        setIntField(term163065, term163065.getClass(), "type", 0);
        setField(term163415, term163415.getClass(), "next", null);
        setIntField(term163415, term163415.getClass(), "type", 0);
        setField(term163415, term163415.getClass(), "first", null);
        setField(term163345, term163345.getClass(), "next", term163415);
        setIntField(term163345, term163345.getClass(), "type", 37);
        setField(term163345, term163345.getClass(), "first", null);
        setField(term163065, term163065.getClass(), "first", term163345);
        setField(term162995, term162995.getClass(), "first", term163065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term162995;
        try {
            callMethod(klass, "process", argTypes, term162925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


