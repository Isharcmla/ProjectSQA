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

public class CommandLineRunner_createExterns_185043600279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97895;

    public CommandLineRunner_createExterns_185043600279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97895 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term98001 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term98107 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term98229 = newInstance(Class.forName("com.google.common.base.Suppliers$ExpiringMemoizingSupplier"));
        setBooleanField(term97895, term97895.getClass(), "testMode", true);
        setBooleanField(term98001, term98001.getClass(), "initialized", false);
        setBooleanField(term98107, term98107.getClass(), "initialized", false);
        setBooleanField(term98229, term98229.getClass(), "initialized", true);
        setField(term98107, term98107.getClass(), "delegate", term98229);
        setField(term98001, term98001.getClass(), "delegate", term98107);
        setField(term97895, term97895.getClass(), "externsSupplierForTesting", term98001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term97895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


