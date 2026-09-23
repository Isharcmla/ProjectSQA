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

public class FlowSensitiveInlineVariables_checkRightOf_146623795677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18528;
     Object term18668;
     Object enum0;

    public FlowSensitiveInlineVariables_checkRightOf_146623795677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18528, term18528.getClass(), "next", term18598);
        term18668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term18832 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term18831 = ((Class) term18832).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term18831).setAccessible(true);
        enum0 = ((Field) term18831).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term18528;
        args[1] = term18668;
        args[2] = enum0;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


