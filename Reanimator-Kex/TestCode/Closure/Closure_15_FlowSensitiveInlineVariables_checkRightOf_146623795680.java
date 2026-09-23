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

public class FlowSensitiveInlineVariables_checkRightOf_146623795680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19931;
     Object term20071;
     Object term20189;

    public FlowSensitiveInlineVariables_checkRightOf_146623795680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19931, term19931.getClass(), "next", term20001);
        term20071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term20189 = newInstance(Class.forName("com.google.common.base.Equivalence$EquivalentToPredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term19931;
        args[1] = term20071;
        args[2] = term20189;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


