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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CommandLineRunner_createExterns_185043600278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97430;

    public CommandLineRunner_createExterns_185043600278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97430 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term97540 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term97632 = newInstance(Class.forName("com.google.common.util.concurrent.Futures$2"));
        Object term97766 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveConstantExpressionsParallel$1"));
        setBooleanField(term97430, term97430.getClass(), "testMode", true);
        setField(term97540, term97540.getClass(), "function", term97632);
        setField(term97540, term97540.getClass(), "supplier", term97766);
        setField(term97430, term97430.getClass(), "externsSupplierForTesting", term97540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term97430, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


