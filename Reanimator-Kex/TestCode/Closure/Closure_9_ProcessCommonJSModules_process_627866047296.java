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

public class ProcessCommonJSModules_process_627866047296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152528;
     Object term152620;

    public ProcessCommonJSModules_process_627866047296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152528 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term152528, term152528.getClass(), "compiler", null);
        term152620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152620, term152620.getClass(), "type", 0);
        setField(term152620, term152620.getClass(), "parent", null);
        setField(term152712, term152712.getClass(), "next", term152782);
        setIntField(term152712, term152712.getClass(), "type", 0);
        setField(term152712, term152712.getClass(), "first", null);
        setField(term152620, term152620.getClass(), "first", term152712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term152620;
        callMethod(klass, "process", argTypes, term152528, args);
    }

};


