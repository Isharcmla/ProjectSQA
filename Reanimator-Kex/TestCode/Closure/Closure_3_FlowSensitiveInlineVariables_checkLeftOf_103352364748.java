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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkLeftOf_103352364748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8644;
     Object term8924;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8784, term8784.getClass(), "first", term8714);
        setField(term8784, term8784.getClass(), "parent", term8854);
        setField(term8714, term8714.getClass(), "parent", term8784);
        setField(term8644, term8644.getClass(), "parent", term8714);
        term8924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term8644;
        args[1] = term8924;
        args[2] = null;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


