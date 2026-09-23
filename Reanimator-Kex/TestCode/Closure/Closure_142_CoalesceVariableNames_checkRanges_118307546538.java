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

public class CoalesceVariableNames_checkRanges_118307546538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10548;
     Object term10680;
     Object term10750;

    public CoalesceVariableNames_checkRanges_118307546538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10548 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term10628 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10548, term10548.getClass(), "compiler", term10628);
        term10680 = new ArrayList();
        term10750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10750, term10750.getClass(), "type", 132);
        setField(term10750, term10750.getClass(), "propListHead", null);
        setField(term10750, term10750.getClass(), "first", term10820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10680;
        args[1] = term10750;
        try {
            callMethod(klass, "checkRanges", argTypes, term10548, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


