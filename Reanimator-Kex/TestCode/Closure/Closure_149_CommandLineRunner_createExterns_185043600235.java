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
import java.util.ArrayList;

public class CommandLineRunner_createExterns_185043600235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93004;

    public CommandLineRunner_createExterns_185043600235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term93206 = new ArrayList();
        ((ArrayList) term93206).add("");
        ((ArrayList) term93206).add((Object)null);
        term93004 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term93154 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(term93154, term93154.getClass(), "externs", term93206);
        setField(term93004, term93004.getClass(), "config", term93154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createExterns", argTypes, term93004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


