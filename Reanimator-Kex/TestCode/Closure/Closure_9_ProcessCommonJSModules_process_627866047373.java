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

public class ProcessCommonJSModules_process_627866047373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199999;
     Object term200091;

    public ProcessCommonJSModules_process_627866047373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199999 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term199999, term199999.getClass(), "compiler", null);
        term200091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200529 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term200091, term200091.getClass(), "type", 0);
        setField(term200091, term200091.getClass(), "parent", null);
        setField(term200183, term200183.getClass(), "next", term200275);
        setIntField(term200183, term200183.getClass(), "type", 0);
        setField(term200437, term200437.getClass(), "next", term200529);
        setIntField(term200437, term200437.getClass(), "type", 33);
        setField(term200437, term200437.getClass(), "first", null);
        setField(term200367, term200367.getClass(), "next", term200437);
        setIntField(term200367, term200367.getClass(), "type", 0);
        setField(term200367, term200367.getClass(), "first", null);
        setField(term200183, term200183.getClass(), "first", term200367);
        setField(term200091, term200091.getClass(), "first", term200183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term200091;
        try {
            callMethod(klass, "process", argTypes, term199999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


