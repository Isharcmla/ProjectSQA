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

public class TypeValidator_mismatch_1931343499190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66141;
     Object term66291;

    public TypeValidator_mismatch_1931343499190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66141 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term66221 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term66141, term66141.getClass(), "shouldReport", true);
        setField(term66141, term66141.getClass(), "compiler", term66221);
        term66291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66291, term66291.getClass(), "sourcePosition", 0);
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
        args[0] = null;
        args[1] = term66291;
        args[2] = "";
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "mismatch", argTypes, term66141, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


