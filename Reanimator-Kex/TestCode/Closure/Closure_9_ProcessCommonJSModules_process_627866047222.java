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

public class ProcessCommonJSModules_process_627866047222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113568;
     Object term113660;

    public ProcessCommonJSModules_process_627866047222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113568 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term113568, term113568.getClass(), "compiler", null);
        term113660 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113752 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term113660, term113660.getClass(), "type", 0);
        setField(term113660, term113660.getClass(), "parent", null);
        setField(term114028, term114028.getClass(), "next", term114098);
        setIntField(term114028, term114028.getClass(), "type", 37);
        setField(term114028, term114028.getClass(), "first", null);
        setField(term113936, term113936.getClass(), "next", term114028);
        setIntField(term113936, term113936.getClass(), "type", 37);
        setField(term113936, term113936.getClass(), "first", null);
        setField(term113844, term113844.getClass(), "next", term113936);
        setIntField(term113844, term113844.getClass(), "type", 37);
        setField(term113844, term113844.getClass(), "first", null);
        setField(term113752, term113752.getClass(), "next", term113844);
        setIntField(term113752, term113752.getClass(), "type", 0);
        setField(term114190, term114190.getClass(), "next", null);
        setIntField(term114190, term114190.getClass(), "type", 0);
        setField(term114190, term114190.getClass(), "first", null);
        setField(term113752, term113752.getClass(), "first", term114190);
        setField(term113660, term113660.getClass(), "first", term113752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term113660;
        callMethod(klass, "process", argTypes, term113568, args);
    }

};


