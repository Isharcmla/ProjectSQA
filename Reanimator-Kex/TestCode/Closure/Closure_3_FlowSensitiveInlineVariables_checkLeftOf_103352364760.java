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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15070;
     Object term15352;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15140, term15140.getClass(), "parent", term15140);
        setField(term15140, term15140.getClass(), "first", term15210);
        setField(term15070, term15070.getClass(), "parent", term15140);
        term15352 = newInstance(Class.forName("com.google.common.collect.Multimaps$FilteredMultimap$Keys$EntrySet$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term15070;
        args[1] = null;
        args[2] = term15352;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


