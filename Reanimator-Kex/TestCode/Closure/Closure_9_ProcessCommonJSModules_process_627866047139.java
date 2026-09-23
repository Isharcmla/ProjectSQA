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

public class ProcessCommonJSModules_process_627866047139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64261;
     Object term64353;
     Object term65650;
     Object term65651;

    public ProcessCommonJSModules_process_627866047139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64261 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term64261, term64261.getClass(), "compiler", null);
        term64353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term64353, term64353.getClass(), "type", 37);
        setField(term64353, term64353.getClass(), "parent", null);
        setField(term64607, term64607.getClass(), "next", null);
        setIntField(term64607, term64607.getClass(), "type", 0);
        setField(term64607, term64607.getClass(), "first", null);
        setField(term64537, term64537.getClass(), "next", term64607);
        setIntField(term64537, term64537.getClass(), "type", 37);
        setField(term64537, term64537.getClass(), "first", null);
        setField(term64445, term64445.getClass(), "next", term64537);
        setIntField(term64445, term64445.getClass(), "type", 0);
        setField(term64699, term64699.getClass(), "next", null);
        setIntField(term64699, term64699.getClass(), "type", 0);
        setField(term64699, term64699.getClass(), "first", null);
        setField(term64445, term64445.getClass(), "first", term64699);
        setField(term64353, term64353.getClass(), "first", term64445);
        term65650 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term65650, term65650.getClass(), "compiler", null);
        setField(term65650, term65650.getClass(), "filenamePrefix", null);
        setBooleanField(term65650, term65650.getClass(), "reportDependencies", false);
        setField(term65650, term65650.getClass(), "module", null);
        term65651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65652 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65655 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65651, term65651.getClass(), "number", 0.0);
        setIntField(term65651, term65651.getClass(), "type", 37);
        setField(term65651, term65651.getClass(), "next", null);
        setDoubleField(term65652, term65652.getClass(), "number", 0.0);
        setIntField(term65652, term65652.getClass(), "type", 0);
        setDoubleField(term65653, term65653.getClass(), "number", 0.0);
        setIntField(term65653, term65653.getClass(), "type", 37);
        setIntField(term65654, term65654.getClass(), "type", 0);
        setField(term65654, term65654.getClass(), "next", null);
        setField(term65654, term65654.getClass(), "first", null);
        setField(term65654, term65654.getClass(), "last", null);
        setField(term65654, term65654.getClass(), "propListHead", null);
        setIntField(term65654, term65654.getClass(), "sourcePosition", 0);
        setField(term65654, term65654.getClass(), "jsType", null);
        setField(term65654, term65654.getClass(), "parent", null);
        setField(term65653, term65653.getClass(), "next", term65654);
        setField(term65653, term65653.getClass(), "first", null);
        setField(term65653, term65653.getClass(), "last", null);
        setField(term65653, term65653.getClass(), "propListHead", null);
        setIntField(term65653, term65653.getClass(), "sourcePosition", 0);
        setField(term65653, term65653.getClass(), "jsType", null);
        setField(term65653, term65653.getClass(), "parent", null);
        setField(term65652, term65652.getClass(), "next", term65653);
        setDoubleField(term65655, term65655.getClass(), "number", 0.0);
        setIntField(term65655, term65655.getClass(), "type", 0);
        setField(term65655, term65655.getClass(), "next", null);
        setField(term65655, term65655.getClass(), "first", null);
        setField(term65655, term65655.getClass(), "last", null);
        setField(term65655, term65655.getClass(), "propListHead", null);
        setIntField(term65655, term65655.getClass(), "sourcePosition", 0);
        setField(term65655, term65655.getClass(), "jsType", null);
        setField(term65655, term65655.getClass(), "parent", null);
        setField(term65652, term65652.getClass(), "first", term65655);
        setField(term65652, term65652.getClass(), "last", null);
        setField(term65652, term65652.getClass(), "propListHead", null);
        setIntField(term65652, term65652.getClass(), "sourcePosition", 0);
        setField(term65652, term65652.getClass(), "jsType", null);
        setField(term65652, term65652.getClass(), "parent", null);
        setField(term65651, term65651.getClass(), "first", term65652);
        setField(term65651, term65651.getClass(), "last", null);
        setField(term65651, term65651.getClass(), "propListHead", null);
        setIntField(term65651, term65651.getClass(), "sourcePosition", 0);
        setField(term65651, term65651.getClass(), "jsType", null);
        setField(term65651, term65651.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64353;
        callMethod(klass, "process", argTypes, term64261, args);
        assertTrue(recursiveEquals(term64261, term65650));
        assertTrue(recursiveEquals(term64353, null));
    }

};


