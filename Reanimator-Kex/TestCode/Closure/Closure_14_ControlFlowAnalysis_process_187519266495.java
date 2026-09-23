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

public class ControlFlowAnalysis_process_187519266495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40831;
     Object term40901;

    public ControlFlowAnalysis_process_187519266495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40831 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        setField(term40831, term40831.getClass(), "root", null);
        setIntField(term40831, term40831.getClass(), "astPositionCounter", 0);
        setField(term40831, term40831.getClass(), "astPosition", null);
        setField(term40831, term40831.getClass(), "nodePriorities", null);
        term40901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40901, term40901.getClass(), "type", 114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term40901;
        callMethod(klass, "process", argTypes, term40831, args);
    }

};


