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

public class ProcessCommonJSModules_process_62786604735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17779;
     Object term17929;

    public ProcessCommonJSModules_process_62786604735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17779 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term17859 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17779, term17779.getClass(), "compiler", term17859);
        term17929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17929, term17929.getClass(), "type", 0);
        setField(term17929, term17929.getClass(), "parent", null);
        setField(term18113, term18113.getClass(), "next", term18205);
        setIntField(term18113, term18113.getClass(), "type", 33);
        setField(term18113, term18113.getClass(), "first", null);
        setField(term18021, term18021.getClass(), "next", term18113);
        setIntField(term18021, term18021.getClass(), "type", 0);
        setField(term18275, term18275.getClass(), "next", null);
        setIntField(term18275, term18275.getClass(), "type", 0);
        setField(term18275, term18275.getClass(), "first", null);
        setField(term18021, term18021.getClass(), "first", term18275);
        setField(term17929, term17929.getClass(), "first", term18021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17929;
        try {
            callMethod(klass, "process", argTypes, term17779, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


