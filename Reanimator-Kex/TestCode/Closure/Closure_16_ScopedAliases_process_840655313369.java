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
import java.lang.Object;

public class ScopedAliases_process_840655313369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254588;
     Object term254760;

    public ScopedAliases_process_840655313369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254588 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term254668 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term254588, term254588.getClass(), "compiler", term254668);
        term254760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254852 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term254760, term254760.getClass(), "type", 0);
        setIntField(term254852, term254852.getClass(), "type", 0);
        setField(term254852, term254852.getClass(), "parent", null);
        setField(term254760, term254760.getClass(), "parent", term254852);
        setField(term254760, term254760.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term254760;
        callMethod(klass, "process", argTypes, term254588, args);
    }

};


