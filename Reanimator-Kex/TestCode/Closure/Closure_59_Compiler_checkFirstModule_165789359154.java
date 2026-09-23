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
import java.util.LinkedList;

public class Compiler_checkFirstModule_165789359154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852415;
     Object term852579;

    public Compiler_checkFirstModule_165789359154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852415 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term852525 = newInstance(Class.forName("com.google.javascript.jscomp.PrintStreamErrorManager"));
        setField(term852415, term852415.getClass(), "warningsGuard", null);
        setField(term852415, term852415.getClass(), "errorManager", term852525);
        term852579 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term852579;
        callMethod(klass, "checkFirstModule", argTypes, term852415, args);
    }

};


