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

public class CommandLineRunner_createExterns_185043600297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108544;

    public CommandLineRunner_createExterns_185043600297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108544 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term108650 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term108756 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term108878 = newInstance(Class.forName("com.google.common.base.Suppliers$ExpiringMemoizingSupplier"));
        Object term108962 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler$4"));
        setBooleanField(term108544, term108544.getClass(), "testMode", true);
        setBooleanField(term108650, term108650.getClass(), "initialized", false);
        setBooleanField(term108756, term108756.getClass(), "initialized", false);
        setBooleanField(term108878, term108878.getClass(), "initialized", true);
        setLongField(term108878, term108878.getClass(), "expirationNanos", 0L);
        setField(term108878, term108878.getClass(), "delegate", term108962);
        setField(term108756, term108756.getClass(), "delegate", term108878);
        setField(term108650, term108650.getClass(), "delegate", term108756);
        setField(term108544, term108544.getClass(), "externsSupplierForTesting", term108650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term108544, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


