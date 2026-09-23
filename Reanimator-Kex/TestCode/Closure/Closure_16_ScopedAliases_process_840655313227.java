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

public class ScopedAliases_process_840655313227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141355;
     Object term141447;
     Object term142536;
     Object term142537;

    public ScopedAliases_process_840655313227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141355 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term141355, term141355.getClass(), "compiler", null);
        term141447 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term141447, term141447.getClass(), "type", 105);
        setIntField(term141539, term141539.getClass(), "type", 0);
        setField(term141539, term141539.getClass(), "parent", null);
        setField(term141447, term141447.getClass(), "parent", term141539);
        term142536 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term142536, term142536.getClass(), "compiler", null);
        setField(term142536, term142536.getClass(), "preprocessorSymbolTable", null);
        setField(term142536, term142536.getClass(), "transformationHandler", null);
        term142537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142538 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term142537, term142537.getClass(), "str", null);
        setIntField(term142537, term142537.getClass(), "type", 105);
        setField(term142537, term142537.getClass(), "next", null);
        setField(term142537, term142537.getClass(), "first", null);
        setField(term142537, term142537.getClass(), "last", null);
        setField(term142537, term142537.getClass(), "propListHead", null);
        setIntField(term142537, term142537.getClass(), "sourcePosition", 0);
        setField(term142537, term142537.getClass(), "jsType", null);
        setField(term142538, term142538.getClass(), "str", null);
        setIntField(term142538, term142538.getClass(), "type", 0);
        setField(term142538, term142538.getClass(), "next", null);
        setField(term142538, term142538.getClass(), "first", null);
        setField(term142538, term142538.getClass(), "last", null);
        setField(term142538, term142538.getClass(), "propListHead", null);
        setIntField(term142538, term142538.getClass(), "sourcePosition", 0);
        setField(term142538, term142538.getClass(), "jsType", null);
        setField(term142538, term142538.getClass(), "parent", null);
        setField(term142537, term142537.getClass(), "parent", term142538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term141447;
        callMethod(klass, "process", argTypes, term141355, args);
        assertTrue(recursiveEquals(term141355, term142536));
        assertTrue(recursiveEquals(term141447, null));
    }

};


