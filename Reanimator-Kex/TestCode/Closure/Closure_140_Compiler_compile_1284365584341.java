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

public class Compiler_compile_1284365584341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2568736;
     Object term2569028;
     Object term2569116;
     Object term2569210;

    public Compiler_compile_1284365584341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2568736 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2568830 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2568940 = newInstance(Class.forName("com.google.javascript.jscomp.PrintStreamErrorManager"));
        setField(term2568736, term2568736.getClass(), "jsRoot", null);
        setField(term2568736, term2568736.getClass(), "options", term2568830);
        setField(term2568736, term2568736.getClass(), "errorManager", term2568940);
        term2569028 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term2569116 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term2569210 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term2569028;
        args[1] = term2569116;
        args[2] = term2569210;
        callMethod(klass, "compile", argTypes, term2568736, args);
    }

};


