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

public class ControlFlowAnalysis_handleDo_1759744985111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36063;
     Object term36133;

    public ControlFlowAnalysis_handleDo_1759744985111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36063 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term36133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36203, term36203.getClass(), "type", 114);
        setField(term36133, term36133.getClass(), "first", term36203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36133;
        callMethod(klass, "handleDo", argTypes, term36063, args);
    }

};


