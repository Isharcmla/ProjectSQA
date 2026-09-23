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

public class ProcessCommonJSModules_process_627866047227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116149;
     Object term116219;

    public ProcessCommonJSModules_process_627866047227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116149 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term116149, term116149.getClass(), "compiler", null);
        term116219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116219, term116219.getClass(), "type", 0);
        setField(term116219, term116219.getClass(), "parent", null);
        setField(term116359, term116359.getClass(), "next", term116429);
        setIntField(term116359, term116359.getClass(), "type", 33);
        setField(term116359, term116359.getClass(), "first", null);
        setField(term116289, term116289.getClass(), "next", term116359);
        setIntField(term116289, term116289.getClass(), "type", 0);
        setField(term116639, term116639.getClass(), "next", null);
        setIntField(term116639, term116639.getClass(), "type", 0);
        setField(term116639, term116639.getClass(), "first", null);
        setField(term116569, term116569.getClass(), "next", term116639);
        setIntField(term116569, term116569.getClass(), "type", 37);
        setField(term116569, term116569.getClass(), "first", null);
        setField(term116499, term116499.getClass(), "next", term116569);
        setIntField(term116499, term116499.getClass(), "type", 37);
        setField(term116499, term116499.getClass(), "first", null);
        setField(term116289, term116289.getClass(), "first", term116499);
        setField(term116219, term116219.getClass(), "first", term116289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term116219;
        try {
            callMethod(klass, "process", argTypes, term116149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


