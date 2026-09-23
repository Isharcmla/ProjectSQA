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

public class TypeCheck_visit_859524784422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104403;
     Object term104563;

    public TypeCheck_visit_859524784422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104403 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term104493 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term104403, term104403.getClass(), "validator", term104493);
        term104563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104563, term104563.getClass(), "type", 29);
        setField(term104563, term104563.getClass(), "first", term104563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term104563;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term104403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


