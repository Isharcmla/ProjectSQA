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

public class TypeCheck_visit_8595247841686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572578;
     Object term572670;

    public TypeCheck_visit_8595247841686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572578 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term572670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term572762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term572670, term572670.getClass(), "type", 93);
        setField(term572670, term572670.getClass(), "first", term572762);
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
        args[1] = term572670;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term572578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


