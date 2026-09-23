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

public class CommandLineRunner_createExterns_185043600267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91904;

    public CommandLineRunner_createExterns_185043600267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91904 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term92010 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term92116 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term92238 = newInstance(Class.forName("com.google.common.base.Suppliers$ExpiringMemoizingSupplier"));
        setBooleanField(term91904, term91904.getClass(), "testMode", true);
        setBooleanField(term92010, term92010.getClass(), "initialized", false);
        setBooleanField(term92116, term92116.getClass(), "initialized", false);
        setField(term92116, term92116.getClass(), "delegate", term92238);
        setField(term92010, term92010.getClass(), "delegate", term92116);
        setField(term91904, term91904.getClass(), "externsSupplierForTesting", term92010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term91904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


