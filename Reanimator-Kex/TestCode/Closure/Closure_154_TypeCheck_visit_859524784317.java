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

public class TypeCheck_visit_859524784317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88053;
     Object term88143;
     Object term88213;

    public TypeCheck_visit_859524784317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88053 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term88053, term88053.getClass(), "noTypeCheckSection", 0);
        term88143 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term88213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88213, term88213.getClass(), "type", 62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term88143;
        args[1] = term88213;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term88053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


