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
import java.lang.String;

public class CommandLineRunner_createExterns_185043600281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99613;

    public CommandLineRunner_createExterns_185043600281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101013 = Class.forName((String) "com.google.common.base.Functions$ToStringFunction");
        Field term101012 = ((Class) term101013).getDeclaredField((String) "INSTANCE");
        ((Field) term101012).setAccessible(true);
        Object enum82 = ((Field) term101012).get((Object) null);
        term99613 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term99723 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term99925 = newInstance(Class.forName("com.google.javascript.jscomp.AstParallelizer$3"));
        setBooleanField(term99613, term99613.getClass(), "testMode", true);
        setField(term99723, term99723.getClass(), "function", enum82);
        setField(term99723, term99723.getClass(), "supplier", term99925);
        setField(term99613, term99613.getClass(), "externsSupplierForTesting", term99723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term99613, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


