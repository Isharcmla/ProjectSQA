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

public class ScopedAliases_process_84065531369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40308;
     Object term40400;
     Object term41231;
     Object term41232;

    public ScopedAliases_process_84065531369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40308 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term40308, term40308.getClass(), "compiler", null);
        term40400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term40400, term40400.getClass(), "type", 0);
        setField(term40400, term40400.getClass(), "parent", null);
        setField(term40470, term40470.getClass(), "next", term40540);
        setIntField(term40470, term40470.getClass(), "type", 0);
        setField(term40470, term40470.getClass(), "first", term40632);
        setField(term40400, term40400.getClass(), "first", term40470);
        term41231 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term41231, term41231.getClass(), "compiler", null);
        setField(term41231, term41231.getClass(), "preprocessorSymbolTable", null);
        setField(term41231, term41231.getClass(), "transformationHandler", null);
        term41232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term41232, term41232.getClass(), "number", 0.0);
        setIntField(term41232, term41232.getClass(), "type", 0);
        setField(term41232, term41232.getClass(), "next", null);
        setIntField(term41233, term41233.getClass(), "type", 0);
        setIntField(term41234, term41234.getClass(), "type", 0);
        setField(term41234, term41234.getClass(), "next", null);
        setField(term41234, term41234.getClass(), "first", null);
        setField(term41234, term41234.getClass(), "last", null);
        setField(term41234, term41234.getClass(), "propListHead", null);
        setIntField(term41234, term41234.getClass(), "sourcePosition", 0);
        setField(term41234, term41234.getClass(), "jsType", null);
        setField(term41234, term41234.getClass(), "parent", null);
        setField(term41233, term41233.getClass(), "next", term41234);
        setDoubleField(term41235, term41235.getClass(), "number", 0.0);
        setIntField(term41235, term41235.getClass(), "type", 0);
        setField(term41235, term41235.getClass(), "next", null);
        setField(term41235, term41235.getClass(), "first", null);
        setField(term41235, term41235.getClass(), "last", null);
        setField(term41235, term41235.getClass(), "propListHead", null);
        setIntField(term41235, term41235.getClass(), "sourcePosition", 0);
        setField(term41235, term41235.getClass(), "jsType", null);
        setField(term41235, term41235.getClass(), "parent", null);
        setField(term41233, term41233.getClass(), "first", term41235);
        setField(term41233, term41233.getClass(), "last", null);
        setField(term41233, term41233.getClass(), "propListHead", null);
        setIntField(term41233, term41233.getClass(), "sourcePosition", 0);
        setField(term41233, term41233.getClass(), "jsType", null);
        setField(term41233, term41233.getClass(), "parent", null);
        setField(term41232, term41232.getClass(), "first", term41233);
        setField(term41232, term41232.getClass(), "last", null);
        setField(term41232, term41232.getClass(), "propListHead", null);
        setIntField(term41232, term41232.getClass(), "sourcePosition", 0);
        setField(term41232, term41232.getClass(), "jsType", null);
        setField(term41232, term41232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term40400;
        callMethod(klass, "process", argTypes, term40308, args);
        assertTrue(recursiveEquals(term40308, term41231));
        assertTrue(recursiveEquals(term40400, null));
    }

};


