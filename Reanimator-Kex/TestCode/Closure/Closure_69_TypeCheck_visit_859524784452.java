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

public class TypeCheck_visit_859524784452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136508;
     Object term136598;
     Object term136668;

    public TypeCheck_visit_859524784452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136508 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term136508, term136508.getClass(), "noTypeCheckSection", 0);
        term136598 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term136668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term136668, term136668.getClass(), "type", 71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term136598;
        args[1] = term136668;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term136508, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


