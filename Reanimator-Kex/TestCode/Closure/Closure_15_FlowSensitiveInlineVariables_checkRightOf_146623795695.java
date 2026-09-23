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

public class FlowSensitiveInlineVariables_checkRightOf_146623795695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25200;
     Object term25480;
     Object term25588;

    public FlowSensitiveInlineVariables_checkRightOf_146623795695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25270, term25270.getClass(), "type", -39);
        setField(term25270, term25270.getClass(), "next", null);
        setField(term25200, term25200.getClass(), "next", term25270);
        setField(term25340, term25340.getClass(), "next", term25410);
        setField(term25200, term25200.getClass(), "parent", term25340);
        term25480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term25588 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term25200;
        args[1] = term25480;
        args[2] = term25588;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


