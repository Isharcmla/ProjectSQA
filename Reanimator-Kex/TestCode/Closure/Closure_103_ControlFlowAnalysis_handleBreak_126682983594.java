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

public class ControlFlowAnalysis_handleBreak_126682983594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30440;
     Object term30532;

    public ControlFlowAnalysis_handleBreak_126682983594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30440 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term30532 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term30532, term30532.getClass(), "first", term30624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30532;
        callMethod(klass, "handleBreak", argTypes, term30440, args);
    }

};


