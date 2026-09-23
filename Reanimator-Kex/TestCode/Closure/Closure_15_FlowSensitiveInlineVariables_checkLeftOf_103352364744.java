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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkLeftOf_103352364744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7549;
     Object term7829;
     Object term7907;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7689, term7689.getClass(), "first", term7759);
        setField(term7619, term7619.getClass(), "parent", term7689);
        setField(term7549, term7549.getClass(), "parent", term7619);
        term7829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term7907 = newInstance(Class.forName("com.google.common.base.CharMatcher$8"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term7549;
        args[1] = term7829;
        args[2] = term7907;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


