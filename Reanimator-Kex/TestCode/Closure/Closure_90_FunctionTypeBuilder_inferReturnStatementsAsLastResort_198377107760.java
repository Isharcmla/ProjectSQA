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

public class FunctionTypeBuilder_inferReturnStatementsAsLastResort_198377107760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39346;
     Object term39496;

    public FunctionTypeBuilder_inferReturnStatementsAsLastResort_198377107760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39346 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term39426 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term39346, term39346.getClass(), "compiler", term39426);
        setField(term39346, term39346.getClass(), "sourceName", null);
        term39496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39496;
        try {
            callMethod(klass, "inferReturnStatementsAsLastResort", argTypes, term39346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


