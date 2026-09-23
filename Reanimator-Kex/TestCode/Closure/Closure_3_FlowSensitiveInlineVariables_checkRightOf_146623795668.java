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

public class FlowSensitiveInlineVariables_checkRightOf_146623795668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17833;
     Object term18043;
     Object term18155;

    public FlowSensitiveInlineVariables_checkRightOf_146623795668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17903, term17903.getClass(), "next", term17973);
        setField(term17833, term17833.getClass(), "next", term17903);
        term18043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term18191 = Class.forName((String) "com.google.common.collect.Maps$AbstractFilteredMap$Values$1");
        term18155 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term18155, term18155.getClass(), "clazz", term18191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term17833;
        args[1] = term18043;
        args[2] = term18155;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


