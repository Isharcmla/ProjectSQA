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

public class CommandLineRunner_createExterns_185043600292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104250;

    public CommandLineRunner_createExterns_185043600292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104250 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term104360 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term104496 = newInstance(Class.forName("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$3"));
        Object term104630 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveConstantExpressionsParallel$1"));
        setBooleanField(term104250, term104250.getClass(), "testMode", true);
        setField(term104360, term104360.getClass(), "function", term104496);
        setField(term104360, term104360.getClass(), "supplier", term104630);
        setField(term104250, term104250.getClass(), "externsSupplierForTesting", term104360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term104250, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


