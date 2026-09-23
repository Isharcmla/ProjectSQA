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

public class Compiler_removeTryCatchFinally_1886841098355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2574499;

    public Compiler_removeTryCatchFinally_1886841098355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2574499 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2574661 = newInstance(Class.forName("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(term2574499, term2574499.getClass(), "currentTracer", null);
        setField(term2574499, term2574499.getClass(), "currentPassName", "removeTryCatchFinally");
        setField(term2574499, term2574499.getClass(), "recentChange", term2574661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeTryCatchFinally", argTypes, term2574499, args);
    }

};


