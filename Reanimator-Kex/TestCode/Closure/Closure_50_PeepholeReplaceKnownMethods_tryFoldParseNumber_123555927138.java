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

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35261;
     Object term35331;
     Object term35439;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term35331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35331, term35331.getClass(), "type", 37);
        term35439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35439, term35439.getClass(), "next", null);
        setIntField(term35439, term35439.getClass(), "type", 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term35331;
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        args[2] = term35439;
        try {
            callMethod(klass, "tryFoldParseNumber", argTypes, term35261, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


