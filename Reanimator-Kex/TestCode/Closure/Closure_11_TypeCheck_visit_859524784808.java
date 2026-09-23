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

public class TypeCheck_visit_859524784808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208000;
     Object term208092;

    public TypeCheck_visit_859524784808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208000 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term208092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term208092, term208092.getClass(), "type", 86);
        setField(term208092, term208092.getClass(), "propListHead", null);
        setField(term208092, term208092.getClass(), "first", term208162);
        setField(term208092, term208092.getClass(), "last", null);
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
        args[1] = term208092;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term208000, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


