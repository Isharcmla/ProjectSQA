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

public class FlowSensitiveInlineVariables_checkRightOf_146623795691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23474;
     Object term23684;
     Object term23792;

    public FlowSensitiveInlineVariables_checkRightOf_146623795691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23544, term23544.getClass(), "type", -39);
        setField(term23544, term23544.getClass(), "next", null);
        setField(term23544, term23544.getClass(), "parent", term23614);
        setField(term23474, term23474.getClass(), "next", term23544);
        setField(term23474, term23474.getClass(), "parent", term23544);
        term23684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term23792 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term23474;
        args[1] = term23684;
        args[2] = term23792;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


