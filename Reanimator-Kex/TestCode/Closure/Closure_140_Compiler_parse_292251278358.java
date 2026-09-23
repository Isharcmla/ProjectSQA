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
import java.lang.StringBuilder;

public class Compiler_parse_292251278358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2575878;
     Object term2576120;

    public Compiler_parse_292251278358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term2576032 = new StringBuilder();
        term2575878 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2575972 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term2575878, term2575878.getClass(), "options", term2575972);
        setField(term2575878, term2575878.getClass(), "debugLog", term2576032);
        term2576120 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term2576120, term2576120.getClass(), "fileName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        Object[] args = new Object[1];
        args[0] = term2576120;
        callMethod(klass, "parse", argTypes, term2575878, args);
    }

};


