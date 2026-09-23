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

public class CommandLineRunner_main_147082586523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21706;

    public CommandLineRunner_main_147082586523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21706 = (Object[]) newArray("java.lang.String", 9);
        setElement(term21706, 0, "eqJfYWRaEL");
        setElement(term21706, 1, "fhkbdRViHi");
        setElement(term21706, 2, "uWHnvSvaPl");
        setElement(term21706, 3, "kBdSllIBVz");
        setElement(term21706, 4, "TJmVBGfTML");
        setElement(term21706, 5, "tPlsykYBqO");
        setElement(term21706, 6, "bLPjGVBhlX");
        setElement(term21706, 7, "whBvTVIIlC");
        setElement(term21706, 8, "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term21706;
        try {
            callMethod(klass, "main", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


