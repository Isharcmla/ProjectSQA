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

public class Compiler_rebuildInputsFromModules_485350928299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547881;

    public Compiler_rebuildInputsFromModules_485350928299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547881 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object[] term547757 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 0);
        Object term547975 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term548077 = newInstance(Class.forName("com.google.javascript.jscomp.ant.AntErrorManager"));
        setField(term547881, term547881.getClass(), "modules", term547757);
        setBooleanField(term547975, term547975.getClass(), "ideMode", false);
        setField(term547881, term547881.getClass(), "options", term547975);
        setField(term547881, term547881.getClass(), "errorManager", term548077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "rebuildInputsFromModules", argTypes, term547881, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


