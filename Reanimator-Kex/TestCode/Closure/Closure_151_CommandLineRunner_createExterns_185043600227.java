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

public class CommandLineRunner_createExterns_185043600227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64534;

    public CommandLineRunner_createExterns_185043600227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64534 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term64640 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term64746 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        setBooleanField(term64534, term64534.getClass(), "testMode", true);
        setBooleanField(term64640, term64640.getClass(), "initialized", false);
        setField(term64640, term64640.getClass(), "delegate", term64746);
        setField(term64534, term64534.getClass(), "externsSupplierForTesting", term64640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term64534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


