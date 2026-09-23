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

public class ProcessCommonJSModules_process_62786604773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27517;
     Object term27609;
     Object term28224;
     Object term28225;

    public ProcessCommonJSModules_process_62786604773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27517 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term27517, term27517.getClass(), "compiler", null);
        term27609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27701 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27609, term27609.getClass(), "type", 37);
        setField(term27609, term27609.getClass(), "parent", null);
        setField(term27793, term27793.getClass(), "next", null);
        setIntField(term27793, term27793.getClass(), "type", 0);
        setField(term27793, term27793.getClass(), "first", null);
        setField(term27701, term27701.getClass(), "next", term27793);
        setIntField(term27701, term27701.getClass(), "type", 0);
        setField(term27885, term27885.getClass(), "next", null);
        setIntField(term27885, term27885.getClass(), "type", 0);
        setField(term27885, term27885.getClass(), "first", null);
        setField(term27701, term27701.getClass(), "first", term27885);
        setField(term27609, term27609.getClass(), "first", term27701);
        term28224 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term28224, term28224.getClass(), "compiler", null);
        setField(term28224, term28224.getClass(), "filenamePrefix", null);
        setBooleanField(term28224, term28224.getClass(), "reportDependencies", false);
        setField(term28224, term28224.getClass(), "module", null);
        term28225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28225, term28225.getClass(), "number", 0.0);
        setIntField(term28225, term28225.getClass(), "type", 37);
        setField(term28225, term28225.getClass(), "next", null);
        setDoubleField(term28226, term28226.getClass(), "number", 0.0);
        setIntField(term28226, term28226.getClass(), "type", 0);
        setDoubleField(term28227, term28227.getClass(), "number", 0.0);
        setIntField(term28227, term28227.getClass(), "type", 0);
        setField(term28227, term28227.getClass(), "next", null);
        setField(term28227, term28227.getClass(), "first", null);
        setField(term28227, term28227.getClass(), "last", null);
        setField(term28227, term28227.getClass(), "propListHead", null);
        setIntField(term28227, term28227.getClass(), "sourcePosition", 0);
        setField(term28227, term28227.getClass(), "jsType", null);
        setField(term28227, term28227.getClass(), "parent", null);
        setField(term28226, term28226.getClass(), "next", term28227);
        setDoubleField(term28228, term28228.getClass(), "number", 0.0);
        setIntField(term28228, term28228.getClass(), "type", 0);
        setField(term28228, term28228.getClass(), "next", null);
        setField(term28228, term28228.getClass(), "first", null);
        setField(term28228, term28228.getClass(), "last", null);
        setField(term28228, term28228.getClass(), "propListHead", null);
        setIntField(term28228, term28228.getClass(), "sourcePosition", 0);
        setField(term28228, term28228.getClass(), "jsType", null);
        setField(term28228, term28228.getClass(), "parent", null);
        setField(term28226, term28226.getClass(), "first", term28228);
        setField(term28226, term28226.getClass(), "last", null);
        setField(term28226, term28226.getClass(), "propListHead", null);
        setIntField(term28226, term28226.getClass(), "sourcePosition", 0);
        setField(term28226, term28226.getClass(), "jsType", null);
        setField(term28226, term28226.getClass(), "parent", null);
        setField(term28225, term28225.getClass(), "first", term28226);
        setField(term28225, term28225.getClass(), "last", null);
        setField(term28225, term28225.getClass(), "propListHead", null);
        setIntField(term28225, term28225.getClass(), "sourcePosition", 0);
        setField(term28225, term28225.getClass(), "jsType", null);
        setField(term28225, term28225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27609;
        callMethod(klass, "process", argTypes, term27517, args);
        assertTrue(recursiveEquals(term27517, term28224));
        assertTrue(recursiveEquals(term27609, null));
    }

};


