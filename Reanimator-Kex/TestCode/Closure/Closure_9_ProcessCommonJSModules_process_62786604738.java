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

public class ProcessCommonJSModules_process_62786604738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8098;
     Object term8248;

    public ProcessCommonJSModules_process_62786604738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8098 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term8178 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8098, term8098.getClass(), "compiler", term8178);
        term8248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8248, term8248.getClass(), "type", 0);
        setField(term8248, term8248.getClass(), "parent", null);
        setField(term8388, term8388.getClass(), "next", term8458);
        setIntField(term8388, term8388.getClass(), "type", 132);
        setField(term8318, term8318.getClass(), "next", term8388);
        setIntField(term8318, term8318.getClass(), "type", 0);
        setField(term8528, term8528.getClass(), "next", null);
        setIntField(term8528, term8528.getClass(), "type", 0);
        setField(term8528, term8528.getClass(), "first", null);
        setField(term8318, term8318.getClass(), "first", term8528);
        setField(term8248, term8248.getClass(), "first", term8318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8248;
        try {
            callMethod(klass, "process", argTypes, term8098, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


