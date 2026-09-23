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

public class TypeCheck_visit_8595247841070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305840;
     Object term306000;

    public TypeCheck_visit_8595247841070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term305930 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term305840, term305840.getClass(), "validator", term305930);
        term306000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term306000, term306000.getClass(), "type", 102);
        setField(term306000, term306000.getClass(), "first", term306000);
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
        args[1] = term306000;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term305840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


