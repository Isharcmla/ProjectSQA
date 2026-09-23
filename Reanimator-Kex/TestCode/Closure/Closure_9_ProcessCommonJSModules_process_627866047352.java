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

public class ProcessCommonJSModules_process_627866047352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185827;
     Object term185919;

    public ProcessCommonJSModules_process_627866047352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185827 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term185827, term185827.getClass(), "compiler", null);
        term185919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term185919, term185919.getClass(), "type", 0);
        setField(term185919, term185919.getClass(), "parent", null);
        setField(term186103, term186103.getClass(), "next", null);
        setIntField(term186103, term186103.getClass(), "type", 33);
        setField(term186103, term186103.getClass(), "first", null);
        setField(term186011, term186011.getClass(), "next", term186103);
        setIntField(term186011, term186011.getClass(), "type", 0);
        setField(term186195, term186195.getClass(), "next", null);
        setIntField(term186195, term186195.getClass(), "type", 0);
        setField(term186195, term186195.getClass(), "first", null);
        setField(term186011, term186011.getClass(), "first", term186195);
        setField(term185919, term185919.getClass(), "first", term186011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term185919;
        try {
            callMethod(klass, "process", argTypes, term185827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


