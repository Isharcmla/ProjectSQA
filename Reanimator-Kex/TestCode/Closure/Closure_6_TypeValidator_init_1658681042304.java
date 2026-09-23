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
import java.util.ArrayList;

public class TypeValidator_init_1658681042304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95446;

    public TypeValidator_init_1658681042304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term95366 = new ArrayList();
        Object term95314 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term95314, term95314.getClass(), "shouldReport", false);
        setField(term95314, term95314.getClass(), "mismatches", term95366);
        setField(term95314, term95314.getClass(), "compiler", null);
        term95446 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term95540 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term95446, term95446.getClass(), "typeRegistry", null);
        setField(term95446, term95446.getClass(), "oldErrorReporter", null);
        setField(term95446, term95446.getClass(), "options", term95540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term95446;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


