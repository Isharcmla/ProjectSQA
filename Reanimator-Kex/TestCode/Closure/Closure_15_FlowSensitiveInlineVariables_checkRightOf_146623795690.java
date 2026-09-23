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

public class FlowSensitiveInlineVariables_checkRightOf_146623795690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23085;
     Object term23260;
     Object term23368;

    public FlowSensitiveInlineVariables_checkRightOf_146623795690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term23260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23155, term23155.getClass(), "type", -39);
        setField(term23155, term23155.getClass(), "next", null);
        setField(term23155, term23155.getClass(), "parent", term23260);
        setField(term23085, term23085.getClass(), "next", term23155);
        setField(term23085, term23085.getClass(), "parent", term23155);
        term23368 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term23085;
        args[1] = term23260;
        args[2] = term23368;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


