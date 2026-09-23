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

public class TypeCheck_visit_859524784430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127474;
     Object term127564;
     Object term127634;

    public TypeCheck_visit_859524784430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term127474, term127474.getClass(), "noTypeCheckSection", 0);
        term127564 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term127634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127634, term127634.getClass(), "type", 121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term127564;
        args[1] = term127634;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term127474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


