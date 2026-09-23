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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11784;
     Object term12064;
     Object term12170;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11854, term11854.getClass(), "parent", term11854);
        setIntField(term11924, term11924.getClass(), "type", 0);
        setField(term11924, term11924.getClass(), "next", term11994);
        setField(term11854, term11854.getClass(), "first", term11924);
        setField(term11784, term11784.getClass(), "parent", term11854);
        term12064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term12170 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term11784;
        args[1] = term12064;
        args[2] = term12170;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


