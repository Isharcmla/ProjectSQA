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

public class CommandLineRunner_createExterns_185043600261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87554;

    public CommandLineRunner_createExterns_185043600261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87554 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term87660 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term87768 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term87806 = newInstance(Class.forName("java.lang.Object"));
        Object term87844 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term87554, term87554.getClass(), "testMode", true);
        setBooleanField(term87660, term87660.getClass(), "initialized", false);
        setField(term87768, term87768.getClass(), "instance", term87806);
        setField(term87660, term87660.getClass(), "delegate", term87768);
        setField(term87660, term87660.getClass(), "value", term87844);
        setField(term87554, term87554.getClass(), "externsSupplierForTesting", term87660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term87554, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


