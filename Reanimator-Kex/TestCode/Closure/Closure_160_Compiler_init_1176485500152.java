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

public class Compiler_init_1176485500152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895435;
     Object term895347;

    public Compiler_init_1176485500152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895435 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term895347 = (Object[]) newArray("com.google.javascript.jscomp.JSSourceFile", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term895347;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "init", argTypes, term895435, args);
    }

};


