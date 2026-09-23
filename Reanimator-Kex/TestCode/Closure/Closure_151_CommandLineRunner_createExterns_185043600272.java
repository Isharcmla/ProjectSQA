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

public class CommandLineRunner_createExterns_185043600272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93809;

    public CommandLineRunner_createExterns_185043600272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93809 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term93919 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term94053 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$8"));
        Object term94161 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term94295 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$8"));
        setBooleanField(term93809, term93809.getClass(), "testMode", true);
        setField(term93919, term93919.getClass(), "function", term94053);
        setField(term94161, term94161.getClass(), "instance", term94295);
        setField(term93919, term93919.getClass(), "supplier", term94161);
        setField(term93809, term93809.getClass(), "externsSupplierForTesting", term93919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term93809, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


