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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

public class AbstractCommandLineRunner_createDefineOrTweakReplacements_2065348252129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113442;
     Object term113626;

    public AbstractCommandLineRunner_createDefineOrTweakReplacements_2065348252129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113442 = new LinkedList();
        ((LinkedList) term113442).add("");
        term113626 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term113626, term113626.getClass(), "tweakReplacements", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term113442;
        args[1] = term113626;
        args[2] = true;
        try {
            callMethod(klass, "createDefineOrTweakReplacements", argTypes, null, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


