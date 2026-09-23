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

public class CommandLineRunner_createExterns_185043600260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86911;

    public CommandLineRunner_createExterns_185043600260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86911 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term87021 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term87171 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUsesJoinOp"));
        Object term87279 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term87429 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUsesJoinOp"));
        setBooleanField(term86911, term86911.getClass(), "testMode", true);
        setField(term87021, term87021.getClass(), "function", term87171);
        setField(term87279, term87279.getClass(), "instance", term87429);
        setField(term87021, term87021.getClass(), "supplier", term87279);
        setField(term86911, term86911.getClass(), "externsSupplierForTesting", term87021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term86911, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


