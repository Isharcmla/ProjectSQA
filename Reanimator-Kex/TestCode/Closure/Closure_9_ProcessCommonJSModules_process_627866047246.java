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

public class ProcessCommonJSModules_process_627866047246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127797;
     Object term127969;

    public ProcessCommonJSModules_process_627866047246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127797 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term127877 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term127797, term127797.getClass(), "compiler", term127877);
        term127969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term128061 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term128153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term128223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term127969, term127969.getClass(), "type", 0);
        setField(term127969, term127969.getClass(), "parent", null);
        setField(term128153, term128153.getClass(), "next", term128223);
        setIntField(term128153, term128153.getClass(), "type", 0);
        setField(term128153, term128153.getClass(), "first", null);
        setField(term128061, term128061.getClass(), "next", term128153);
        setIntField(term128061, term128061.getClass(), "type", 37);
        setField(term128315, term128315.getClass(), "next", null);
        setIntField(term128315, term128315.getClass(), "type", 0);
        setField(term128315, term128315.getClass(), "first", null);
        setField(term128061, term128061.getClass(), "first", term128315);
        setField(term127969, term127969.getClass(), "first", term128061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term127969;
        callMethod(klass, "process", argTypes, term127797, args);
    }

};


