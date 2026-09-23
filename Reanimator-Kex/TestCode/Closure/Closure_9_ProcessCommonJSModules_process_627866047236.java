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

public class ProcessCommonJSModules_process_627866047236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121885;
     Object term122057;

    public ProcessCommonJSModules_process_627866047236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121885 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term121965 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term121885, term121885.getClass(), "compiler", term121965);
        term122057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term122057, term122057.getClass(), "type", 0);
        setField(term122057, term122057.getClass(), "parent", null);
        setField(term122219, term122219.getClass(), "next", term122311);
        setIntField(term122219, term122219.getClass(), "type", 37);
        setField(term122219, term122219.getClass(), "first", null);
        setField(term122149, term122149.getClass(), "next", term122219);
        setIntField(term122149, term122149.getClass(), "type", 37);
        setField(term122495, term122495.getClass(), "next", null);
        setIntField(term122495, term122495.getClass(), "type", 0);
        setField(term122495, term122495.getClass(), "first", null);
        setField(term122403, term122403.getClass(), "next", term122495);
        setIntField(term122403, term122403.getClass(), "type", 37);
        setField(term122403, term122403.getClass(), "first", null);
        setField(term122149, term122149.getClass(), "first", term122403);
        setField(term122057, term122057.getClass(), "first", term122149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term122057;
        callMethod(klass, "process", argTypes, term121885, args);
    }

};


