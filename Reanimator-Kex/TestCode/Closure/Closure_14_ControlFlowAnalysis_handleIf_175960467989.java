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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ControlFlowAnalysis_handleIf_175960467989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38274;
     Object term38344;

    public ControlFlowAnalysis_handleIf_175960467989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38274 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term38344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38484, term38484.getClass(), "next", null);
        setIntField(term38484, term38484.getClass(), "type", 126);
        setField(term38414, term38414.getClass(), "next", term38484);
        setField(term38344, term38344.getClass(), "first", term38414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38344;
        try {
            callMethod(klass, "handleIf", argTypes, term38274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


