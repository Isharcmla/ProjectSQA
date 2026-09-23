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

public class ScopedAliases_process_840655313204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114476;
     Object term114568;
     Object term114808;
     Object term114809;

    public ScopedAliases_process_840655313204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114476 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term114476, term114476.getClass(), "compiler", null);
        term114568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term114568, term114568.getClass(), "type", -133);
        setField(term114568, term114568.getClass(), "parent", null);
        term114808 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term114808, term114808.getClass(), "compiler", null);
        setField(term114808, term114808.getClass(), "preprocessorSymbolTable", null);
        setField(term114808, term114808.getClass(), "transformationHandler", null);
        term114809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term114809, term114809.getClass(), "str", null);
        setIntField(term114809, term114809.getClass(), "type", -133);
        setField(term114809, term114809.getClass(), "next", null);
        setField(term114809, term114809.getClass(), "first", null);
        setField(term114809, term114809.getClass(), "last", null);
        setField(term114809, term114809.getClass(), "propListHead", null);
        setIntField(term114809, term114809.getClass(), "sourcePosition", 0);
        setField(term114809, term114809.getClass(), "jsType", null);
        setField(term114809, term114809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term114568;
        callMethod(klass, "process", argTypes, term114476, args);
        assertTrue(recursiveEquals(term114476, term114808));
        assertTrue(recursiveEquals(term114568, null));
    }

};


