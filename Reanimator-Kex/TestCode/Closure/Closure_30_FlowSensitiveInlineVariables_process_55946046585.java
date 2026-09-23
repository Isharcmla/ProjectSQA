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

public class FlowSensitiveInlineVariables_process_55946046585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25583;
     Object term25653;

    public FlowSensitiveInlineVariables_process_55946046585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25583 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term25583, term25583.getClass(), "compiler", null);
        term25653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25837 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term25653, term25653.getClass(), "type", 0);
        setField(term25653, term25653.getClass(), "parent", null);
        setField(term25745, term25745.getClass(), "next", term25837);
        setIntField(term25745, term25745.getClass(), "type", 0);
        setField(term25745, term25745.getClass(), "first", term25929);
        setField(term25653, term25653.getClass(), "first", term25745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25653;
        callMethod(klass, "process", argTypes, term25583, args);
    }

};


