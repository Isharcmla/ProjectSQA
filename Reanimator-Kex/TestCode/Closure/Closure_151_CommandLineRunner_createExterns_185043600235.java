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

public class CommandLineRunner_createExterns_185043600235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72354;

    public CommandLineRunner_createExterns_185043600235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72354 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term72460 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term72544 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler$4"));
        Object term72624 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term72354, term72354.getClass(), "testMode", true);
        setBooleanField(term72460, term72460.getClass(), "initialized", false);
        setField(term72544, term72544.getClass(), "val$self", term72624);
        setField(term72460, term72460.getClass(), "delegate", term72544);
        setField(term72354, term72354.getClass(), "externsSupplierForTesting", term72460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term72354, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


