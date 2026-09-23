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
import java.util.ArrayList;

public class CommandLineRunner_createExterns_185043600237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94708;

    public CommandLineRunner_createExterns_185043600237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term94948 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term94910 = new ArrayList();
        ((ArrayList) term94910).add(term94948);
        ((ArrayList) term94910).add(term94948);
        term94708 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term94858 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(term94858, term94858.getClass(), "externs", term94910);
        setField(term94708, term94708.getClass(), "config", term94858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term94708, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


