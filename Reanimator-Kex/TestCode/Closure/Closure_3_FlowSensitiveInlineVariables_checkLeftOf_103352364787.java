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
import java.lang.String;

public class FlowSensitiveInlineVariables_checkLeftOf_103352364787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25837;
     Object enum0;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25907, term25907.getClass(), "parent", term25907);
        setField(term25907, term25907.getClass(), "first", term25977);
        setField(term25837, term25837.getClass(), "parent", term25907);
        Class<? extends Object> term26107 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term26106 = ((Class) term26107).getDeclaredField((String) "ALL");
        ((Field) term26106).setAccessible(true);
        enum0 = ((Field) term26106).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term25837;
        args[1] = null;
        args[2] = enum0;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


