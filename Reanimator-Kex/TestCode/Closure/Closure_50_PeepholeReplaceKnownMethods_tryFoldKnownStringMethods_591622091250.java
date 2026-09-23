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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186438;
     Object term1186508;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1186438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1186508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1186578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1186508, term1186508.getClass(), "type", 37);
        setIntField(term1186578, term1186578.getClass(), "type", 35);
        setField(term1186508, term1186508.getClass(), "first", term1186578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1186508;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1186438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


