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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8408;
     Object term8618;
     Object term8760;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8478, term8478.getClass(), "first", term8548);
        setField(term8408, term8408.getClass(), "parent", term8478);
        term8618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term8760 = newInstance(Class.forName("com.google.javascript.jscomp.CheckUnreachableCode$ReachablePredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term8408;
        args[1] = term8618;
        args[2] = term8760;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


