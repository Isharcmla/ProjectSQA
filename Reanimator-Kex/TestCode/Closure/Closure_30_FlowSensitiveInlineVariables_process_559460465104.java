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

public class FlowSensitiveInlineVariables_process_559460465104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33885;
     Object term34057;

    public FlowSensitiveInlineVariables_process_559460465104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33885 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term33965 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33885, term33885.getClass(), "compiler", term33965);
        term34057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term34057, term34057.getClass(), "type", 0);
        setField(term34057, term34057.getClass(), "parent", null);
        setField(term34149, term34149.getClass(), "next", term34219);
        setIntField(term34149, term34149.getClass(), "type", 0);
        setField(term34311, term34311.getClass(), "next", null);
        setIntField(term34311, term34311.getClass(), "type", 0);
        setField(term34311, term34311.getClass(), "first", term34403);
        setField(term34149, term34149.getClass(), "first", term34311);
        setField(term34057, term34057.getClass(), "first", term34149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34057;
        callMethod(klass, "process", argTypes, term33885, args);
    }

};


