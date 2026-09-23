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

public class CommandLineRunner_createExterns_185043600257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85238;

    public CommandLineRunner_createExterns_185043600257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85238 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term85348 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term85466 = newInstance(Class.forName("com.google.common.base.Functions$FunctionForMapNoDefault"));
        Object term85574 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setBooleanField(term85238, term85238.getClass(), "testMode", true);
        setField(term85348, term85348.getClass(), "function", term85466);
        setField(term85348, term85348.getClass(), "supplier", term85574);
        setField(term85238, term85238.getClass(), "externsSupplierForTesting", term85348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term85238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


