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

public class TypeValidator_mismatch_1931343499285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97201;
     Object term97563;
     Object term97667;

    public TypeValidator_mismatch_1931343499285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term97281 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term97383 = newInstance(Class.forName("com.google.javascript.jscomp.ant.AntErrorManager"));
        setBooleanField(term97201, term97201.getClass(), "shouldReport", true);
        setField(term97281, term97281.getClass(), "warningsGuard", null);
        setField(term97281, term97281.getClass(), "errorManager", term97383);
        setField(term97201, term97201.getClass(), "compiler", term97281);
        term97563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term97667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term97667, term97667.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = "";
        args[1] = null;
        args[2] = "";
        args[3] = term97563;
        args[4] = term97667;
        try {
            callMethod(klass, "mismatch", argTypes, term97201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


