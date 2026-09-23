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
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66525;
     Object term66595;
     Object term66703;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66525 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term66595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66595, term66595.getClass(), "type", 37);
        term66703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66773, term66773.getClass(), "next", null);
        setIntField(term66773, term66773.getClass(), "type", 39);
        setField(term66703, term66703.getClass(), "next", term66773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term66595;
        args[1] = "parseInt";
        args[2] = term66703;
        try {
            callMethod(klass, "tryFoldParseNumber", argTypes, term66525, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


