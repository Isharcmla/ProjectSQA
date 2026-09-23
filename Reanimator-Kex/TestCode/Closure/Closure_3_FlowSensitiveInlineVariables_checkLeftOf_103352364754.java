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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12577;
     Object term12899;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12577 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12669 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term12899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term12761, term12761.getClass(), "first", term12899);
        setField(term12669, term12669.getClass(), "parent", term12761);
        setField(term12577, term12577.getClass(), "parent", term12669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term12577;
        args[1] = term12899;
        args[2] = null;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


