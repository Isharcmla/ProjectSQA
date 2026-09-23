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

public class CommandLineRunner_initConfigFromFlags_114228716835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86023;
     Object term84781;

    public CommandLineRunner_initConfigFromFlags_114228716835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86023 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term86078 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        setField(term86023, term86023.getClass(), "flags", term86078);
        term84781 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.io.PrintStream");
        Object[] args = new Object[2];
        args[0] = term84781;
        args[1] = null;
        try {
            callMethod(klass, "initConfigFromFlags", argTypes, term86023, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


