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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24867;
     Object term25077;
     Object term25183;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24937, term24937.getClass(), "parent", term24937);
        setIntField(term25007, term25007.getClass(), "type", 116);
        setField(term24937, term24937.getClass(), "first", term25007);
        setField(term24867, term24867.getClass(), "parent", term24937);
        term25077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term25183 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term24867;
        args[1] = term25077;
        args[2] = term25183;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


