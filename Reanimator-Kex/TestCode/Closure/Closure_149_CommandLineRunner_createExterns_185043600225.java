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
import java.util.Iterator;

public class CommandLineRunner_createExterns_185043600225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72538;

    public CommandLineRunner_createExterns_185043600225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72801 = new ArrayList();
        Iterator term72800 =  ((ArrayList) term72801).iterator();
        ArrayList term72740 = new ArrayList();
        ((ArrayList) term72740).add(term72800);
        ((ArrayList) term72740).add((Object)null);
        term72538 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term72688 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(term72688, term72688.getClass(), "externs", term72740);
        setField(term72538, term72538.getClass(), "config", term72688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term72538, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


