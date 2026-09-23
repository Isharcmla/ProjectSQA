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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CommandLineRunner_initConfigFromFlags_114228716831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80862;
     Object term79659;

    public CommandLineRunner_initConfigFromFlags_114228716831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80862 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term80917 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        setField(term80862, term80862.getClass(), "flags", term80917);
        term79659 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.io.PrintStream");
        Object[] args = new Object[2];
        args[0] = term79659;
        args[1] = null;
        try {
            callMethod(klass, "initConfigFromFlags", argTypes, term80862, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


