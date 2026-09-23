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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24033;
     Object term24165;
     Object term24235;

    public CoalesceVariableNames_checkRanges_118307546564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24033 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term24113 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24033, term24033.getClass(), "compiler", term24113);
        term24165 = new ArrayList();
        term24235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24235, term24235.getClass(), "type", 0);
        setField(term24305, term24305.getClass(), "next", term24375);
        setIntField(term24305, term24305.getClass(), "type", 0);
        setField(term24305, term24305.getClass(), "parent", term24445);
        setField(term24235, term24235.getClass(), "first", term24305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term24165;
        args[1] = term24235;
        try {
            callMethod(klass, "checkRanges", argTypes, term24033, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


