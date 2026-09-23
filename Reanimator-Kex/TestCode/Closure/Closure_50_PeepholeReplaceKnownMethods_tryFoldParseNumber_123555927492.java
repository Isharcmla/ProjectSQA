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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3477024;
     Object term3477094;
     Object term3477202;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3477024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3477094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3477094, term3477094.getClass(), "type", 37);
        term3477202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3477202, term3477202.getClass(), "next", null);
        setIntField(term3477202, term3477202.getClass(), "type", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term3477094;
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        args[2] = term3477202;
        try {
            callMethod(klass, "tryFoldParseNumber", argTypes, term3477024, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


