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

public class ProcessCommonJSModules_process_627866047200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101852;
     Object term102002;

    public ProcessCommonJSModules_process_627866047200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101852 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term101932 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term101852, term101852.getClass(), "compiler", term101932);
        term102002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term102002, term102002.getClass(), "type", 0);
        setField(term102002, term102002.getClass(), "parent", null);
        setField(term102094, term102094.getClass(), "next", term102186);
        setIntField(term102094, term102094.getClass(), "type", 37);
        setField(term102370, term102370.getClass(), "next", null);
        setIntField(term102370, term102370.getClass(), "type", 0);
        setField(term102370, term102370.getClass(), "first", null);
        setField(term102278, term102278.getClass(), "next", term102370);
        setIntField(term102278, term102278.getClass(), "type", 0);
        setField(term102278, term102278.getClass(), "first", null);
        setField(term102094, term102094.getClass(), "first", term102278);
        setField(term102002, term102002.getClass(), "first", term102094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term102002;
        callMethod(klass, "process", argTypes, term101852, args);
    }

};


