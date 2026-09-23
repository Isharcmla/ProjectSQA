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

public class CommandLineRunner_createExterns_185043600283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101689;

    public CommandLineRunner_createExterns_185043600283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101689 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term101799 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term101935 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$11"));
        Object term102057 = newInstance(Class.forName("com.google.common.base.Suppliers$ExpiringMemoizingSupplier"));
        setBooleanField(term101689, term101689.getClass(), "testMode", true);
        setField(term101799, term101799.getClass(), "function", term101935);
        setField(term101799, term101799.getClass(), "supplier", term102057);
        setField(term101689, term101689.getClass(), "externsSupplierForTesting", term101799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term101689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


