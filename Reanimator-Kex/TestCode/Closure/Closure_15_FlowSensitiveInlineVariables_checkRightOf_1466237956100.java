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

public class FlowSensitiveInlineVariables_checkRightOf_1466237956100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26378;
     Object term26562;

    public FlowSensitiveInlineVariables_checkRightOf_1466237956100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26378 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26378, term26378.getClass(), "next", null);
        setField(term26470, term26470.getClass(), "next", null);
        setField(term26470, term26470.getClass(), "parent", term26470);
        setField(term26378, term26378.getClass(), "parent", term26470);
        term26562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term26378;
        args[1] = term26562;
        args[2] = null;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


