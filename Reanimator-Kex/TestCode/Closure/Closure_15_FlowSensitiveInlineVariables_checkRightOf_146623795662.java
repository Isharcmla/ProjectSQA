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

public class FlowSensitiveInlineVariables_checkRightOf_146623795662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14171;
     Object term14346;
     Object term14454;

    public FlowSensitiveInlineVariables_checkRightOf_146623795662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term14346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14241, term14241.getClass(), "type", -39);
        setField(term14241, term14241.getClass(), "next", null);
        setField(term14171, term14171.getClass(), "next", term14241);
        setField(term14171, term14171.getClass(), "parent", term14346);
        term14454 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term14171;
        args[1] = term14346;
        args[2] = term14454;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


