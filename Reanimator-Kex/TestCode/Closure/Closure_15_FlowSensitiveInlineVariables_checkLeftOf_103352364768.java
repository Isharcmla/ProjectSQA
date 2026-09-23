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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15870;
     Object term16174;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15940, term15940.getClass(), "parent", term15940);
        setField(term15940, term15940.getClass(), "first", term16010);
        setField(term15870, term15870.getClass(), "parent", term15940);
        term16174 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionArgumentInjector$ReferencedAfterSideEffect"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term15870;
        args[1] = null;
        args[2] = term16174;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


