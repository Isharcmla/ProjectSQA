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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134154;
     Object term134246;
     Object term134673;

    public ProcessCommonJSModules_process_627866047261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134154 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term134154, term134154.getClass(), "compiler", null);
        term134246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134430 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term134522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term134246, term134246.getClass(), "type", 0);
        setField(term134246, term134246.getClass(), "parent", null);
        setField(term134338, term134338.getClass(), "next", null);
        setIntField(term134338, term134338.getClass(), "type", 0);
        setField(term134522, term134522.getClass(), "next", null);
        setIntField(term134522, term134522.getClass(), "type", 37);
        setField(term134522, term134522.getClass(), "first", null);
        setField(term134430, term134430.getClass(), "next", term134522);
        setIntField(term134430, term134430.getClass(), "type", 37);
        setField(term134430, term134430.getClass(), "first", null);
        setField(term134338, term134338.getClass(), "first", term134430);
        setField(term134246, term134246.getClass(), "first", term134338);
        term134673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term134673, term134673.getClass(), "type", 0);
        setField(term134673, term134673.getClass(), "next", null);
        setField(term134673, term134673.getClass(), "first", null);
        setField(term134673, term134673.getClass(), "last", null);
        setField(term134673, term134673.getClass(), "propListHead", null);
        setIntField(term134673, term134673.getClass(), "sourcePosition", 0);
        setField(term134673, term134673.getClass(), "jsType", null);
        setField(term134673, term134673.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term134246;
        callMethod(klass, "process", argTypes, term134154, args);
        assertTrue(recursiveEquals(term134154, term134673));
        assertTrue(recursiveEquals(term134246, null));
    }

};


