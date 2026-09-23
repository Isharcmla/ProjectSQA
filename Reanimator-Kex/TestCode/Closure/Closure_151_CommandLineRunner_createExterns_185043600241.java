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

public class CommandLineRunner_createExterns_185043600241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77391;

    public CommandLineRunner_createExterns_185043600241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77391 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term77497 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term77605 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setBooleanField(term77391, term77391.getClass(), "testMode", true);
        setBooleanField(term77497, term77497.getClass(), "initialized", false);
        setField(term77497, term77497.getClass(), "delegate", term77605);
        setField(term77391, term77391.getClass(), "externsSupplierForTesting", term77497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term77391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


