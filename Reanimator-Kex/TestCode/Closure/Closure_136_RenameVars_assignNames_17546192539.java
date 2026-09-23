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
import java.util.HashSet;

public class RenameVars_assignNames_17546192539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42356;

    public RenameVars_assignNames_17546192539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term42404 = new HashSet();
        term42356 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        char[] term42248 = (char[]) newCharArray(0);
        setField(term42356, term42356.getClass(), "reservedNames", term42404);
        setField(term42356, term42356.getClass(), "prefix", "");
        setField(term42356, term42356.getClass(), "reservedCharacters", term42248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "assignNames", argTypes, term42356, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


