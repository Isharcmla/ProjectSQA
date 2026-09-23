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

public class CoalesceVariableNames_checkRanges_118307546558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20887;
     Object term21019;
     Object term21089;

    public CoalesceVariableNames_checkRanges_118307546558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20887 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term20967 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term20887, term20887.getClass(), "compiler", term20967);
        term21019 = new ArrayList();
        term21089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21179 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term21089, term21089.getClass(), "type", 0);
        setField(term21089, term21089.getClass(), "first", term21179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term21019;
        args[1] = term21089;
        try {
            callMethod(klass, "checkRanges", argTypes, term20887, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


