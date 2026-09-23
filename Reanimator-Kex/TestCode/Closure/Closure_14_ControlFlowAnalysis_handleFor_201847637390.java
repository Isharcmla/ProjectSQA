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

public class ControlFlowAnalysis_handleFor_201847637390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39470;
     Object term39540;

    public ControlFlowAnalysis_handleFor_201847637390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39470 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term39540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39610, term39610.getClass(), "next", term39540);
        setField(term39540, term39540.getClass(), "first", term39610);
        setField(term39540, term39540.getClass(), "next", term39540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39540;
        callMethod(klass, "handleFor", argTypes, term39470, args);
    }

};


