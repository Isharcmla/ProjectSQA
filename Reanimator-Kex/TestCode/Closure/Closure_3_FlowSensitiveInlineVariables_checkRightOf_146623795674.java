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

public class FlowSensitiveInlineVariables_checkRightOf_146623795674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21140;
     Object term21344;

    public FlowSensitiveInlineVariables_checkRightOf_146623795674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term21140, term21140.getClass(), "next", term21232);
        Class<? extends Object> term21380 = Class.forName((String) "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        term21344 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term21344, term21344.getClass(), "clazz", term21380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term21140;
        args[1] = null;
        args[2] = term21344;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


