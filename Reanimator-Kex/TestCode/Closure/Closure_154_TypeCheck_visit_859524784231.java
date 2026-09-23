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

public class TypeCheck_visit_859524784231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63745;
     Object term63905;

    public TypeCheck_visit_859524784231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63745 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term63835 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term63745, term63745.getClass(), "validator", term63835);
        term63905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63905, term63905.getClass(), "type", 102);
        setField(term63905, term63905.getClass(), "first", term63905);
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
        args[1] = term63905;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term63745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


