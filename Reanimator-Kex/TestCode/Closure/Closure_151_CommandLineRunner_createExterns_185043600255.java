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

public class CommandLineRunner_createExterns_185043600255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84470;

    public CommandLineRunner_createExterns_185043600255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84470 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term84576 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term84682 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        setBooleanField(term84470, term84470.getClass(), "testMode", true);
        setBooleanField(term84576, term84576.getClass(), "initialized", false);
        setBooleanField(term84682, term84682.getClass(), "initialized", true);
        setField(term84576, term84576.getClass(), "delegate", term84682);
        setField(term84470, term84470.getClass(), "externsSupplierForTesting", term84576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term84470, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


