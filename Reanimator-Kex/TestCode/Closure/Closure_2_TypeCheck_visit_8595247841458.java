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

public class TypeCheck_visit_8595247841458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465960;
     Object term466052;

    public TypeCheck_visit_8595247841458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465960 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term466052 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term466122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term466052, term466052.getClass(), "type", 86);
        setField(term466052, term466052.getClass(), "propListHead", null);
        setField(term466052, term466052.getClass(), "first", term466122);
        setField(term466052, term466052.getClass(), "last", null);
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
        args[1] = term466052;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term465960, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


