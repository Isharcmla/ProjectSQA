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

public class CommandLineRunner_createExterns_185043600237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73794;

    public CommandLineRunner_createExterns_185043600237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73794 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term73900 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term74008 = newInstance(Class.forName("com.google.common.base.Suppliers$ThreadSafeSupplier"));
        setBooleanField(term73794, term73794.getClass(), "testMode", true);
        setBooleanField(term73900, term73900.getClass(), "initialized", false);
        setField(term73900, term73900.getClass(), "delegate", term74008);
        setField(term73794, term73794.getClass(), "externsSupplierForTesting", term73900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term73794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


