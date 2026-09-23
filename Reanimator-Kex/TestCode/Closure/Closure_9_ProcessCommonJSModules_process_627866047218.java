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

public class ProcessCommonJSModules_process_627866047218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111598;
     Object term111690;

    public ProcessCommonJSModules_process_627866047218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111598 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term111598, term111598.getClass(), "compiler", null);
        term111690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111944 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term111690, term111690.getClass(), "type", 37);
        setField(term111690, term111690.getClass(), "parent", null);
        setField(term111852, term111852.getClass(), "next", null);
        setIntField(term111852, term111852.getClass(), "type", 0);
        setField(term111852, term111852.getClass(), "first", null);
        setField(term111782, term111782.getClass(), "next", term111852);
        setIntField(term111782, term111782.getClass(), "type", 37);
        setField(term111944, term111944.getClass(), "next", null);
        setIntField(term111944, term111944.getClass(), "type", 0);
        setField(term111944, term111944.getClass(), "first", null);
        setField(term111782, term111782.getClass(), "first", term111944);
        setField(term111690, term111690.getClass(), "first", term111782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term111690;
        callMethod(klass, "process", argTypes, term111598, args);
    }

};


