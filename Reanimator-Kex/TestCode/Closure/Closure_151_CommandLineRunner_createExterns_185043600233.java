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

public class CommandLineRunner_createExterns_185043600233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68372;

    public CommandLineRunner_createExterns_185043600233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68372 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term68478 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term68576 = newInstance(Class.forName("com.google.javascript.jscomp.AstParallelizer$3"));
        setBooleanField(term68372, term68372.getClass(), "testMode", true);
        setBooleanField(term68478, term68478.getClass(), "initialized", false);
        setField(term68478, term68478.getClass(), "delegate", term68576);
        setField(term68372, term68372.getClass(), "externsSupplierForTesting", term68478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term68372, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


