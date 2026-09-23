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

public class TypeCheck_visit_8595247841389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422608;
     Object term422678;

    public TypeCheck_visit_8595247841389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422608 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term422678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term422924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term422678, term422678.getClass(), "type", 25);
        setField(term422748, term422748.getClass(), "jsType", term422854);
        setField(term422678, term422678.getClass(), "first", term422748);
        setField(term422678, term422678.getClass(), "last", term422924);
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
        args[1] = term422678;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term422608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


