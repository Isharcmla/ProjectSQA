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

public class FlowSensitiveInlineVariables_checkRightOf_146623795694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24732;
     Object term24986;
     Object term25094;

    public FlowSensitiveInlineVariables_checkRightOf_146623795694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24824, term24824.getClass(), "type", -39);
        setField(term24824, term24824.getClass(), "next", null);
        setField(term24732, term24732.getClass(), "next", term24824);
        setField(term24732, term24732.getClass(), "parent", term24916);
        term24986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term25094 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term24732;
        args[1] = term24986;
        args[2] = term25094;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


