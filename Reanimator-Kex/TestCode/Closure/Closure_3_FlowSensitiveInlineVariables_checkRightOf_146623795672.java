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

public class FlowSensitiveInlineVariables_checkRightOf_146623795672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20248;
     Object term20423;
     Object term20535;

    public FlowSensitiveInlineVariables_checkRightOf_146623795672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term20423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20318, term20318.getClass(), "next", null);
        setField(term20248, term20248.getClass(), "next", term20318);
        setField(term20248, term20248.getClass(), "parent", term20423);
        Class<? extends Object> term20571 = Class.forName((String) "java.util.IntSummaryStatistics");
        term20535 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term20535, term20535.getClass(), "clazz", term20571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term20248;
        args[1] = term20423;
        args[2] = term20535;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


