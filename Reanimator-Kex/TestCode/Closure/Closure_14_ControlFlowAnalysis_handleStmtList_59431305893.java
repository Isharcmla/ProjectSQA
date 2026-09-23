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

public class ControlFlowAnalysis_handleStmtList_59431305893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40188;
     Object term40258;

    public ControlFlowAnalysis_handleStmtList_59431305893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40188 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term40258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40258, term40258.getClass(), "parent", term40328);
        setIntField(term40258, term40258.getClass(), "type", 0);
        setIntField(term40398, term40398.getClass(), "type", 114);
        setField(term40258, term40258.getClass(), "first", term40398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40258;
        callMethod(klass, "handleStmtList", argTypes, term40188, args);
    }

};


