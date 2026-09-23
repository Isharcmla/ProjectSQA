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

public class CommandLineRunner_createExterns_185043600269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92969;

    public CommandLineRunner_createExterns_185043600269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92969 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term93075 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term93181 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term93287 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        setBooleanField(term92969, term92969.getClass(), "testMode", true);
        setBooleanField(term93075, term93075.getClass(), "initialized", false);
        setBooleanField(term93181, term93181.getClass(), "initialized", false);
        setBooleanField(term93287, term93287.getClass(), "initialized", true);
        setField(term93181, term93181.getClass(), "delegate", term93287);
        setField(term93075, term93075.getClass(), "delegate", term93181);
        setField(term92969, term92969.getClass(), "externsSupplierForTesting", term93075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term92969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


