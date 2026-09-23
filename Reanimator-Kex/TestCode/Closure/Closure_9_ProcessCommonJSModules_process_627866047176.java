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

public class ProcessCommonJSModules_process_627866047176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89336;
     Object term89486;

    public ProcessCommonJSModules_process_627866047176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89336 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term89416 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term89336, term89336.getClass(), "compiler", term89416);
        term89486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89486, term89486.getClass(), "type", 0);
        setField(term89486, term89486.getClass(), "parent", null);
        setField(term89626, term89626.getClass(), "next", null);
        setIntField(term89626, term89626.getClass(), "type", 37);
        setField(term89626, term89626.getClass(), "first", null);
        setField(term89556, term89556.getClass(), "next", term89626);
        setIntField(term89556, term89556.getClass(), "type", 33);
        setField(term89766, term89766.getClass(), "next", null);
        setIntField(term89766, term89766.getClass(), "type", 0);
        setField(term89766, term89766.getClass(), "first", null);
        setField(term89696, term89696.getClass(), "next", term89766);
        setIntField(term89696, term89696.getClass(), "type", 37);
        setField(term89696, term89696.getClass(), "first", null);
        setField(term89556, term89556.getClass(), "first", term89696);
        setField(term89486, term89486.getClass(), "first", term89556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term89486;
        callMethod(klass, "process", argTypes, term89336, args);
    }

};


