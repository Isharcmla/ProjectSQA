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
     Object term24318;
     Object term24528;
     Object term24606;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24458, term24458.getClass(), "first", null);
        setField(term24388, term24388.getClass(), "parent", term24458);
        setField(term24318, term24318.getClass(), "parent", term24388);
        term24528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term24606 = newInstance(Class.forName("com.google.common.base.CharMatcher$8"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term24318;
        args[1] = term24528;
        args[2] = term24606;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


