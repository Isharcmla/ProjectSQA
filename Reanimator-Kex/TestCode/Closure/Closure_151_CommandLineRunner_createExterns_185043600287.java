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

public class CommandLineRunner_createExterns_185043600287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103004;

    public CommandLineRunner_createExterns_185043600287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103004 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term103110 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term103216 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term103322 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term103428 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        setBooleanField(term103004, term103004.getClass(), "testMode", true);
        setBooleanField(term103110, term103110.getClass(), "initialized", false);
        setBooleanField(term103216, term103216.getClass(), "initialized", false);
        setBooleanField(term103322, term103322.getClass(), "initialized", false);
        setField(term103322, term103322.getClass(), "delegate", term103428);
        setField(term103216, term103216.getClass(), "delegate", term103322);
        setField(term103110, term103110.getClass(), "delegate", term103216);
        setField(term103004, term103004.getClass(), "externsSupplierForTesting", term103110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term103004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


