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

public class ProcessCommonJSModules_process_627866047353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186514;
     Object term186606;

    public ProcessCommonJSModules_process_627866047353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186514 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term186514, term186514.getClass(), "compiler", null);
        term186606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term186606, term186606.getClass(), "type", 0);
        setField(term186606, term186606.getClass(), "parent", null);
        setField(term186790, term186790.getClass(), "next", term186860);
        setIntField(term186790, term186790.getClass(), "type", 105);
        setField(term186698, term186698.getClass(), "next", term186790);
        setIntField(term186698, term186698.getClass(), "type", 37);
        setField(term186952, term186952.getClass(), "next", null);
        setIntField(term186952, term186952.getClass(), "type", 0);
        setField(term186952, term186952.getClass(), "first", null);
        setField(term186698, term186698.getClass(), "first", term186952);
        setField(term186606, term186606.getClass(), "first", term186698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term186606;
        try {
            callMethod(klass, "process", argTypes, term186514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


