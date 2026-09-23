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

public class FlowSensitiveInlineVariables_checkRightOf_146623795689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26769;
     Object term26909;
     Object enum1;

    public FlowSensitiveInlineVariables_checkRightOf_146623795689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26769, term26769.getClass(), "next", term26839);
        term26909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term27021 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term27020 = ((Class) term27021).getDeclaredField((String) "ALL");
        ((Field) term27020).setAccessible(true);
        enum1 = ((Field) term27020).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term26769;
        args[1] = term26909;
        args[2] = enum1;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


