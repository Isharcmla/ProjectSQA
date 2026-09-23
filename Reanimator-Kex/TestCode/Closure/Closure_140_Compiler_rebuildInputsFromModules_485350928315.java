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

public class Compiler_rebuildInputsFromModules_485350928315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308235;

    public Compiler_rebuildInputsFromModules_485350928315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1308235 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object[] term1308124 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 1);
        Object term1308315 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setElement(term1308124, 0, term1308315);
        setField(term1308235, term1308235.getClass(), "modules", term1308124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "rebuildInputsFromModules", argTypes, term1308235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


