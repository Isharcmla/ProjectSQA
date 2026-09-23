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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28269;
     Object term28545;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term28361, term28361.getClass(), "parent", term28453);
        setField(term28269, term28269.getClass(), "parent", term28361);
        term28545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term28269;
        args[1] = term28545;
        args[2] = null;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


