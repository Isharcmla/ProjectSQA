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

public class CommandLineRunner_createExterns_185043600231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67533;

    public CommandLineRunner_createExterns_185043600231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67533 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term67639 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term67723 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler$4"));
        setBooleanField(term67533, term67533.getClass(), "testMode", true);
        setBooleanField(term67639, term67639.getClass(), "initialized", false);
        setField(term67639, term67639.getClass(), "delegate", term67723);
        setField(term67533, term67533.getClass(), "externsSupplierForTesting", term67639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term67533, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


