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

public class CommandLineRunner_createExterns_185043600263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89352;

    public CommandLineRunner_createExterns_185043600263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89352 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term89462 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term89554 = newInstance(Class.forName("com.google.common.util.concurrent.Futures$3"));
        Object term89662 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term89754 = newInstance(Class.forName("com.google.common.util.concurrent.Futures$3"));
        setBooleanField(term89352, term89352.getClass(), "testMode", true);
        setField(term89462, term89462.getClass(), "function", term89554);
        setField(term89662, term89662.getClass(), "instance", term89754);
        setField(term89462, term89462.getClass(), "supplier", term89662);
        setField(term89352, term89352.getClass(), "externsSupplierForTesting", term89462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term89352, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


