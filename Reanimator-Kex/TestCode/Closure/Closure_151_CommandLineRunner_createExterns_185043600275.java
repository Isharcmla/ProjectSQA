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

public class CommandLineRunner_createExterns_185043600275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96709;

    public CommandLineRunner_createExterns_185043600275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96709 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term96815 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term96921 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term97029 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setBooleanField(term96709, term96709.getClass(), "testMode", true);
        setBooleanField(term96815, term96815.getClass(), "initialized", false);
        setBooleanField(term96921, term96921.getClass(), "initialized", false);
        setField(term96921, term96921.getClass(), "delegate", term97029);
        setField(term96815, term96815.getClass(), "delegate", term96921);
        setField(term96709, term96709.getClass(), "externsSupplierForTesting", term96815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term96709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


