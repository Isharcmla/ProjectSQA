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

public class CommandLineRunner_createExterns_185043600265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90528;

    public CommandLineRunner_createExterns_185043600265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90528 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term90638 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierComposition"));
        Object term90772 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$7"));
        Object term90880 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term91014 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$7"));
        setBooleanField(term90528, term90528.getClass(), "testMode", true);
        setField(term90638, term90638.getClass(), "function", term90772);
        setField(term90880, term90880.getClass(), "instance", term91014);
        setField(term90638, term90638.getClass(), "supplier", term90880);
        setField(term90528, term90528.getClass(), "externsSupplierForTesting", term90638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term90528, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


